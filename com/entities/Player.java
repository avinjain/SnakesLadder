package com.entities;

import java.util.Random;

import com.datatypes.PlayerInfo;
import com.manager.BasicEntitiesManager;

public class Player {
	private PlayerInfo player;
	private boolean turn;

	public Player(PlayerInfo player)
	{
		this.player=player;
	}

	public boolean isMyTurn()
	{
		return turn;
	}

	public PlayerInfo getPlayerInfo()
	{
		return player;
	}

	public void setTurn(boolean turn){
		this.turn=turn;
	}

	public int currentPosition()
	{
		return player.getPosition();
	}

	private int rollDice()
	{
		Random random=new Random();
		int diceNum = random.nextInt(6)+1;
		System.out.println("Dice rolled ->"+diceNum);
		return diceNum;
	}

	public boolean takeTurn(BasicEntitiesManager entities)
	{
		System.out.println(getPlayerInfo().getName()+" is at :"+currentPosition());
		int position=currentPosition()+ rollDice();
		if(position==Board.getMax())
		{
			System.out.println(getPlayerInfo().getName()+" Won!!!");
			return true;
		}
		else if(position<Board.getMax())
		{
			int tempPosition = entities.getToPositionIfEncounteredEntity(position);
			if(tempPosition != -1)
			{
				getPlayerInfo().setPosition(tempPosition);
			}else{
				getPlayerInfo().setPosition(position);
				System.out.println(getPlayerInfo().getName()+" is at :"+position);
			}
			System.out.println(getPlayerInfo().getName()+" is at :"+getPlayerInfo().getPosition());
			return false;
		}else{
			System.out.println("Roll the dice next time but it should be at most "+(Board.getMax()-currentPosition()));
			return false;
		}


	}

}
