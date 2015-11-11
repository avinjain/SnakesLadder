package com.entities;

public class Board {
	
	private int board[][];
	private static int max;
	
	public Board(int length,int breadth)
	{
		board = new int[length][breadth];
		max=length*breadth;
	}
	
	public int[][] getBoard()
	{
		return board;
	}
	
	public static int getMax()
	{
		return max;
	}
	
}
