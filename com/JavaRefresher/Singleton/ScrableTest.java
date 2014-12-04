package com.JavaRefresher.Singleton;
import java.util.LinkedList;
public class ScrableTest {
	public static void main(String[] args){
		Singleton newInstance = Singleton.getInstance();
		System.out.println("Instance Id: "+System.identityHashCode(newInstance));		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		System.out.println("Player 1: "+playerOneTiles);
		System.out.println(newInstance.getLetterList());

		Singleton newInstance2 = Singleton.getInstance();
		System.out.println("Instance Id: "+System.identityHashCode(newInstance2));		
		System.out.println(newInstance2.getLetterList());

		LinkedList<String> playerTwoTiles = newInstance2.getTiles(7);
		System.out.println("Player 2: "+ playerTwoTiles);
		System.out.println(newInstance.getLetterList());

	}

}
