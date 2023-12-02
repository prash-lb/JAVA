package TheBigAdventure.main;

import java.io.Console;

import TheBigAdventure.Table;

public class main {

	public static void main(String[] args) {
		int [][] table = {
		{0,0,0,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0}};
				
		Table map = new Table(5,5,table);
		System.out.println( map.toString());

	}

}
