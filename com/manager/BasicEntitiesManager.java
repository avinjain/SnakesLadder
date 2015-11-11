package com.manager;

import com.datatypes.LadderInfo;
import com.datatypes.SnakeInfo;
import com.entities.Ladder;
import com.entities.Snake;

public class BasicEntitiesManager {

	private Snake snake;
	private Ladder ladder;
	
	public BasicEntitiesManager(SnakeInfo[] snakeInfo,LadderInfo[] ladderInfo){
		this.snake=new Snake(snakeInfo);
		this.ladder=new Ladder(ladderInfo);
	}
	
	public Snake getSnake()
	{
		return snake;
	}
	public Ladder getLadder()
	{
		return ladder;
	}
	
	//Return the new position only if snake/ladder is encountered
	//else return -1
	public int getToPositionIfEncounteredEntity(int position)
	{
		int isEntityPosition;
		isEntityPosition= snake.returnToPositionSnake(position);
		if(isEntityPosition == -1)
		{
			isEntityPosition = ladder.returnToPositionLadder(position);
		}
		return isEntityPosition;
	}
	
}
