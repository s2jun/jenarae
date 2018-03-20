package kh.list.vo;

import java.util.Comparator;

public class NameAsc implements Comparator<MemberVo>{
	
	@Override
	public int compare(MemberVo o1, MemberVo o2){
//		MemberVo member1 = (MemberVo)o1;
//		MemberVo member2 = (MemberVo)o2;
		//양수는 순서 바꿈
		
		return o1.getMemberName().compareTo(o2.getMemberName());
	}
}
