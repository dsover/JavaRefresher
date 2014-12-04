package com.JavaRefresher.Composite;

public class SongListGenerator {

	public static void main(String[] args) {

		SongComponent industrialMusic = new SongGroup("Industrial","Electroinca meets metal");
		SongComponent heavyMetalMusic = new SongGroup("\nHeavy Metal","HEAVY METAL!!!!!!");
		SongComponent dubStepMusic = new SongGroup("\nDubStep","this is dub step it goes wub-wub-wub");
		
		SongComponent everySong = new SongGroup("Song List", "holds all songs");
		everySong.add(industrialMusic);
	
		industrialMusic.add(new Song("Head like a hole","NIN",1990));
		industrialMusic.add(new Song("Headhunter","Front 242",1988));
		
		industrialMusic.add(dubStepMusic);
		
		dubStepMusic.add(new Song("centipede","knife party",2012));
		dubStepMusic.add(new Song("Tetris","Doctor P",2011));
		
		everySong.add(heavyMetalMusic);
		
		heavyMetalMusic.add(new Song("Black Sunshine","White Zombie",1988));
		heavyMetalMusic.add(new Song("War Pigs","Black Sabath", 1970));
		heavyMetalMusic.add(new Song("Ace of Spades","Motorhead",1980));
		
		
		DiscJocky crazyLary = new DiscJocky(everySong);
		crazyLary.getSongList();
	}

}
