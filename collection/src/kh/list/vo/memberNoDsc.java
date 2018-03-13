package kh.list.vo;

import java.util.Comparator;

public class memberNoDsc implements Comparator<MemberVo> {
	
	@Override
	public int compare(MemberVo o1, MemberVo o2){
		
		return o2.getMemberNo()-o1.getMemberNo();
	}

}
