package Worlds;

import Game.Entities.Dynamic.Player;
import Game.Entities.Dynamic.Tail;
import Game.Entities.Static.Apple;
import Main.Handler;

import java.awt.*;
import java.util.LinkedList;


/**
 * Created by AlexVR on 7/2/2018.
 */
public abstract class WorldBase {

	//How many pixels are from left to right
	//How many pixels are from top to bottom
	//Must be equal
	public int GridWidthHeightPixelCount;

	//automatically calculated, depends on previous input.
	//The size of each box, the size of each box will be GridPixelsize x GridPixelsize.
	public int GridPixelsize;

	//Variable inicializndo el score
	public double score;

	public Player player;

	protected Handler handler;


	public Boolean appleOnBoard;
	protected Apple apple;
	public Boolean[][] appleLocation;



	public Boolean[][] playerLocation;

	public LinkedList<Tail> body = new LinkedList<>();


	public WorldBase(Handler handler){ 
		this.handler = handler;

		appleOnBoard = false;


	}
	public void tick(){



	}

	public void render(Graphics g){

		for (int i = 0; i <= 600; i = i + GridPixelsize) { 
			//g.setColor(Color.WHITE);
			//Le quite el grid poniendole el mismo color del background
			//Por si quiero ver los grid pues le quito los comments y se pinta de blanco
			//g.setColor(Color.white);
			g.setColor(new Color(128,0,128));
			g.drawLine(0, i, handler.getWidth() , i);
			g.drawLine(i,0,i,handler.getHeight());
			
			//Pone el score en la pantalla *STILL NEEDS FIX*
			g.setColor(Color.WHITE);
			score =  Math.sqrt((2.0*handler.getWorld().player.lenght)+1) ;
			g.drawString("SCORE: "+ score, 5, 30);

		}
		
	}

}
