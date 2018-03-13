package kh.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import kh.list.vo.MemberJoindate;
import kh.list.vo.MemberVo;

public class ListTest {

	public static void main(String[] args) {
//		 List list = new ArrayList();
//		 list.add(5);
//		 list.add(6);
//		 list.add(20);
//		 
//		 for(int i = 0; i<list.size(); i++){
//			 System.out.println(list.get(i));
//		 }
//		 
		 MemberVo mv1 = new MemberVo(10, "이세준", new Date());
		 MemberVo mv2 = new MemberVo(20, "최승원", new Date(0));
		 MemberVo mv3 = new MemberVo(30, "하성미", new Date(92929292922323L));
		 MemberVo mv4 = new MemberVo(40, "안보람", new Date(9222323L));
		 MemberVo mv5 = new MemberVo(50, "김현수", new Date(92929922323L));
		 MemberVo mv6 = new MemberVo(60, "유큰별", new Date(92929292922323L));
		 MemberVo mv7 = new MemberVo(70, "최원", new Date(929232329292922323L));
		 
//		 List list = new ArrayList();
//		 list.add(mv2);
//		 list.add(mv1);
//		 list.add(mv4);
//		 list.add(mv3);
//		 list.add(mv6);
//		 list.add(mv5);
//		 list.add(mv7);
//		 
//		 
//		 for(Object obj: list){
//			 System.out.println((MemberVo)obj);
//		 }
		 List<MemberVo> list = new ArrayList<MemberVo>();
		 list.add(mv2);
		 list.add(mv1);
		 list.add(mv4);
		 list.add(mv3);
		 list.add(mv6);
		 list.add(mv5);
		 list.add(mv7);
		 
		 
//		 list.remove(mv3);
//		 list.remove(0);
//		 for(MemberVo vo: list){
//			 System.out.println(vo.toString());
//		 }
//		 
////		 System.out.println(list.size());
//		 list.sort(new NameAsc());
//		 for(MemberVo vo : list){
//			 System.out.println(vo);
//		 }
//		 
		 Iterator<MemberVo> iter =list.listIterator();
//		 while(iter.hasNext()){
//			 System.out.println(iter.next());
//		 }
//		 ListIterator<MemberVo> listIter = list.listIterator();
//		 while(iter.hasNext()){
//			 System.out.println(listIter.next());
//			 if(listIter.hasPrevious()){
//				 System.out.println(listIter.previous());
//				 System.out.println(listIter.next());
//			 }
//		 }
		 //memberNo로 정렬하여 충력 내림차순으로
//		 list.sort(new memberNoDsc());
//		 for(MemberVo vo: list){
//			 System.out.println(vo.toString());
		
		 
		 list.sort(new MemberJoindate());
		 for(MemberVo vo: list){
			 System.out.println(vo.toString());
		 }
	}
}

