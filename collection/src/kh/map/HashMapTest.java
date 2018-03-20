package kh.map;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import kh.list.vo.MemberVo;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put("날씨", "흐림");
		map.put("시간", "너무 빨리감");
		map.put(1, 150);
		map.put("time", new Date());
		
		System.out.println(map);
		
//		map.put("날씨", "밥먹기좋은날");
//		System.out.println(map);
//		map.put(2, 150);
//		map.put(100, 150);
//		System.out.println(map);
//		System.out.println(map.get("시간"));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(map.get("time")));
		
		map.remove("날씨");
		System.out.println(map);
		
		Map<Integer, MemberVo> map2 = new HashMap<Integer, MemberVo>();
		
		 MemberVo mv1 = new MemberVo(10, "이세준", new Date());
		 MemberVo mv2 = new MemberVo(20, "최승원", new Date(0));
		 MemberVo mv3 = new MemberVo(30, "하성미", new Date(92929292922323L));
		 MemberVo mv4 = new MemberVo(40, "안보람", new Date(9222323L));
		 MemberVo mv5 = new MemberVo(50, "김현수", new Date(92929922323L));
		 MemberVo mv6 = new MemberVo(60, "유큰별", new Date(92929292922323L));
		 MemberVo mv7 = new MemberVo(70, "최원", new Date(929232323323L));
		 
		 map2.put(mv1.getMemberNo(), mv1);
		 map2.put(mv2.getMemberNo(), mv2);
		 map2.put(mv3.getMemberNo(), mv3);
		 map2.put(mv4.getMemberNo(), mv4);
		 map2.put(mv5.getMemberNo(), mv5);
		 map2.put(mv6.getMemberNo(), mv6);
		 map2.put(mv7.getMemberNo(), mv7);
		 
		 Set<Integer> keys = map2.keySet();
		 Iterator<Integer> keyIter = keys.iterator();
//		 int key = -1;
//		 MemberVo temp = null;
//		 while(keyIter.hasNext()){
//			 key = keyIter.next();
//			 temp = map2.get(key);
//			 System.out.println(temp);
		 
		 Set<Entry<Integer, MemberVo>> entrySet = map2.entrySet();
		 Iterator<Entry<Integer, MemberVo>> entryIter =entrySet.iterator();
		 Entry<Integer, MemberVo> tempEntry =null;
		 while(entryIter.hasNext()){
			 tempEntry = entryIter.next();
			 System.out.println(tempEntry.getKey()+" , "+tempEntry.getValue());
		 }
			
	
	
	
	}
	

}
