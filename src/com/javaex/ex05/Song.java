package com.javaex.ex05;

public class Song {
	
	//필드
	private String  title, artist, album, composer;
	private int year, track;
	
	//생성자
	
	//매소드 - G/S
	public void setTitle (String t) {
		title = t;
	}
	public void setArtist (String s) {
		artist = s;
	}
	public void setAlbum (String a) {
		album = a;
	}
	public void setComposer (String c) {
		composer = c;
	}
	public void setYear (int y) {
		year = y;
	}
	 public void setTrack (int r) {
		 track = r;
	 }
	 
	 
	 
		public String  getTitle () {
			return title;
		}
		public String getArtist () {
			return artist;
		}
		public String getAlbum () {
			return album;
		}
		public String getComposer () {
			return composer;
		}
		public int getYear () {
			return year;
		}
		 public int getTrack () {
			 return track;
		 }
	
	//매소드 - 일반
		 public void showInfo () {
			 System.out.println(artist + ", " +  title + ", " +"( " + album + ", " + year + ", " + track + ", " + composer + " )" );
		 }
	
}
