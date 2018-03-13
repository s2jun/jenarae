package kh.set;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import kh.list.vo.MemberVo;

public class HashSetTest {

	public static void main(String[] args) {
		Set set = new HashSet();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		set.add(15);
		set.add(sdf.format(new Date()));
		set.add(2.55);
		set.add(new Character('c'));
		set.add(new MemberVo(50,"이세준",new Date()));
		System.out.println(set.toString());
		set.add(15);
		set.add(2.55);
		set.add(new Character('c'));
		System.out.println();
		System.out.println(set.toString());
		
		
		System.out.println();
		
		System.out.println(set.size());
		System.out.println();
		System.out.println(set.isEmpty());
		System.out.println();
		System.out.println(set.contains(15));
		System.out.println();
		System.out.println(set.toArray());
		System.out.println();
		System.out.println(set.remove(2.55));

		System.out.println(set.remove(2.55));
	}

}
