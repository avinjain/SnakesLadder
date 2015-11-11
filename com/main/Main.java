package com.main;

import com.datatypes.LadderInfo;
import com.datatypes.PlayerInfo;
import com.datatypes.SnakeInfo;
import com.entities.Board;
import com.entities.Player;
import com.manager.BasicEntitiesManager;

public class Main {
	public static void main(String[] args) {

		Board b = new Board(10, 12);
		int[] snakeFrom={17,54,62,64,87,93,99};
		int[] snakeTo=  {7,19,24,34,75,78,15};

		int[] ladderFrom={4,9,20,28,40,51,63};
		int[] ladderTo=  {14,31,38,59,84,91,99};

		SnakeInfo[] snakeInfo =new SnakeInfo[snakeFrom.length];
		for(int i =0;i<snakeFrom.length;i++)
		{
			snakeInfo[i]=new SnakeInfo();
			snakeInfo[i].setFrom(snakeFrom[i]);
			snakeInfo[i].setTo(snakeTo[i]);
		}

		LadderInfo[] ladderInfo =new LadderInfo[ladderFrom.length];
		for(int i =0;i<ladderFrom.length;i++)
		{
			ladderInfo[i]=new LadderInfo();
			ladderInfo[i].setFrom(ladderFrom[i]);
			ladderInfo[i].setTo(ladderTo[i]);
		}
		
		BasicEntitiesManager entities = new BasicEntitiesManager(snakeInfo, ladderInfo);
		
		PlayerInfo player1 = new PlayerInfo("AJ");
		PlayerInfo player2 = new PlayerInfo("TJ");
		
		Player aj = new Player(player1);
		Player tj = new Player(player2);

		aj.setTurn(true);
		while(true)
		{
			if(aj.takeTurn(entities)==true)
			{
				break;
			}
			else if(tj.takeTurn(entities)){
				break;
			}
			else{
				
			}
		}


	}
}
