package com.brainMentor.game.util;

import java.util.Random;

public class GameUtils
{
		Random r=new Random(15);
		int range;
		public GameUtils(int range) 
		{
			this.range=range;
			r= new Random(this.range);
		}
		public int getRandomNumber()
		{
			return r.nextInt(this.range);
		}
}