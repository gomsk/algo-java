package programmers.hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/*
정렬 기준  
1. 플레이수의 합이 가장 큰 장르를 우선으로 출력
2. (장르 -> 플레이수 -> id ) 최대 2곡 출력
  
 * */
class Song implements Comparable<Song>{
	int play, id;
	String genre;
	
	Song(int id, String genre, int play){
		this.id = id;
		this.genre = genre;
		this.play = play;
	}
	
	@Override
	public int compareTo(Song o) {
		if(o.play == this.play) {
			return (this.id - o.id);
		}else {
			return -(this.play - o.play);
		}
	}
}

public class BestAlbum {
	static ArrayList<Song> songList = new ArrayList<>();
	static ArrayList<Integer> bestAlbumList = new ArrayList<>();
	static HashMap<String,Integer> albumMap = new HashMap<>();
	static HashMap<String,Integer> genreMap = new HashMap<>();
	
	public static int[] solution(String[] genres, int[] plays) {
		for(int i=0; i<genres.length; i++) {
			int id = i;
			String genre = genres[i];
			int play = plays[i];
			songList.add(new Song(id,genre,play));
			
			if(!genreMap.containsKey(genre)) genreMap.put(genre, play);
			else genreMap.put(genre, genreMap.get(genre)+play);		
		}
		Collections.sort(songList, new Comparator<Song>() {
			@Override
			public int compare(Song o1, Song o2) {
				// TODO Auto-generated method stub
				if(o1.genre.equals(o2.genre)) {
					return o1.compareTo(o2);
				}else {
					return -(genreMap.get(o1.genre) - genreMap.get(o2.genre));
				}
			}
		});
		
		for(int i=0; i<songList.size(); i++) {
			Song song = songList.get(i);
			if(!albumMap.containsKey(song.genre)) {
				albumMap.put(song.genre, 1);
				bestAlbumList.add(song.id);
			}else {
				if(albumMap.get(song.genre) >= 2) continue;
				else{
					albumMap.put(song.genre, albumMap.get(song.genre)+1);
					bestAlbumList.add(song.id);
				}
			}
		}
		int answer[] = new int[bestAlbumList.size()];
		for(int i=0; i<bestAlbumList.size(); i++) {
			answer[i] = bestAlbumList.get(i);
		}
		return answer;
	}
	

	public static void main(String[] args) {
		
		String genres[] = {"classic", "pop", "classic", "classic", "pop"};
		int plays[] = {500, 600, 150, 800, 2500};
		int answer[] = solution(genres,plays);
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
