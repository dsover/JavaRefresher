package com.JavaRefresher.Composite;

public class DiscJocky {
	
	SongComponent songList;
	
	public DiscJocky(SongComponent newSongList){
		songList = newSongList;
	}
	public void getSongList(){
		songList.displaySongInfo();
	}

}
