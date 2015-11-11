package com.entities;

import com.datatypes.LadderInfo;

public class Ladder{
	private LadderInfo[] ladderInfo;

	public Ladder(LadderInfo[] ladderInfo)
	{
		this.ladderInfo=ladderInfo;			
	}

	public int returnToPositionLadder(int position) {

		for(int i=0;i<ladderInfo.length;i++)
		{
			if(ladderInfo[i].getFrom()==position)
			{
				System.out.println("You encountered Ladder");
				System.out.println("You should go To :"+ladderInfo[i].getTo());
				
				return ladderInfo[i].getTo();
			}
		}
		return -1;
	
	}
}
