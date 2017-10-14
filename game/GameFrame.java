package com.brainMentor.game;

import javax.swing.JFrame;

import com.brainMentor.game.util.GameConstent;

class GameFrame extends JFrame implements GameConstent
{
	GameFrame()
	{
		setSize(GAME_WIDTH, GAME_HEIGHT);
		setTitle(GAME_TITLE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		Board board=new Board();
		add(board);
	}
	public static void main(String args[])
	{
		GameFrame frame=new GameFrame();
	}

}