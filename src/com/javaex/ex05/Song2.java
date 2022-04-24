package com.javaex.ex05;

public class Song2 {

	// 필드
	private String title, artist, album, composer;
	private int year, track;

	// 생성자 	단축키 Generate ~ using field
	//디폴트 생성자는 deselect All 선택하면 만들어짐
	public Song2() {
		}
	
	//생성자2
	public Song2(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	/*this(); 사용하는 경우 코드를 중간에 수정해야 하는 경우
	예를 들면 일정 미정시 마지막에 추가하기 때문에  추가하는 항목 빼고 this(title, artirst ect,,) 이런식으로 생성자에 써야함
	주의 : 중간에 String, int 이런거 안씀
	모르면 수업 영상 2(2) 55:30 부터 재생*/
	
	// 매소드 - G/S 
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}
	
	
	// 매소드 - 일반  단축키 Generate to String
	@Override
	public String toString() {
		return "Song2 [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer
				+ ", year=" + year + ", track=" + track + "]";
	}
	public void showInfo() {
		System.out.println("Song2 [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer
				+ ", year=" + year + ", track=" + track + "]");
	}
	
}