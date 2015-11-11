package com.entities;

import com.datatypes.SnakeInfo;

public class Snake{
	private SnakeInfo[] snakeInfo;

	public Snake(SnakeInfo[] snakeInfo)
	{
		this.snakeInfo=snakeInfo;
	}

	public int returnToPositionSnake(int position) {
		for(int i=0;i<snakeInfo.length;i++)
		{
			if(snakeInfo[i].getFrom()==position)
			{
				System.out.println("You encountered Snake");
				System.out.println("You should go To :"+snakeInfo[i].getTo());
				return snakeInfo[i].getTo();
			}
		}
		return -1;
	}
}
