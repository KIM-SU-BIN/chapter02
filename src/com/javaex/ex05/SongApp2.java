package com.javaex.ex05;

public class SongApp2 {

	public static void main(String[] args) {
		//iu는 디폴트 생성자가 필요
		Song2 iu = new Song2();
		iu.setArtist("아이유");
		iu.setTitle ("좋은날");
		iu.setAlbum("Real");
		iu.setYear(2010);
		iu.setTrack(3);
		iu.setComposer("이민수");
		
		System.out.println(iu.toString());
		//=> iu.showInfo();
		//시스템아웃 말고 쇼인포 사용해도 돌아감 (매소드 일반에 showInfo 작성했기 때문)
		
		
		//생성자2 사용
		Song2 bigbang = new Song2 ("거짓말", "BIGBANG","Always","G-DRAGON", 2008, 2 );
		
		System.out.println(bigbang.toString());
		//bigbang.showInfo();
		
		//매소드 일반의 showInfo있어야 작동됨.
		Song2 busker = new Song2();
		busker.setArtist("버스커버스커");
		busker.setTitle("벚꽃엔딩");
		busker.setAlbum("버스커버스커1집");
		busker.setYear(2012);
		busker.setTrack(4);
		busker.setComposer("장범준");
		
		busker.showInfo();	

	}

}
