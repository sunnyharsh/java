package com.brainMentor.game;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.brainMentor.game.util.GameConstent;
import com.brainMentor.game.util.GameUtils;
public class Board extends JPanel implements GameConstent
{
	final int SPEED=30;
	private GameUtils gameUtils;
	private Timer timer;
	public Board()
	{
		gameUtils=new GameUtils(SPEED);
		setSize(GAME_WIDTH, GAME_HEIGHT);
		setBackground(Color.BLUE);
		gameLoop();
	}
	int x=100; 
	int y=100;
	int xspeed=SPEED;
	int yspeed=SPEED;
	public void gameLoop()
	{
		timer =new Timer(GAME_SPEED, (e)->{
			repaint();
			move();
			changeDirection();
		});
		timer.start();
	}
	public void move()
	{
		x+=xspeed;
		y+=yspeed;
	}
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.ORANGE);
		g.fillOval(x, y, 50, 50);
	}
	public void changeDirection()
	{
		if(x>=(GAME_WIDTH-50))
		{
			xspeed=-gameUtils.getRandomNumber();
		}
		if(x<=0)
		{
			xspeed=gameUtils.getRandomNumber();
		}
		if(y>=(GAME_HEIGHT-50))
		{
			yspeed=-gameUtils.getRandomNumber();
		}
		if(y<=0)
		{
			yspeed=gameUtils.getRandomNumber();
		}
	}
	
}


















