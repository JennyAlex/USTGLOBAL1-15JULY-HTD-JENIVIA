package com.dev.music;

public class MusicPlay {
	
	private int song_id;
	private String song_title;
	private String artist__name;
	private String album_name;
	private String song_location;
	private String  description;

	@Override
	public String toString() {
		return "MusicPlay [song_id=" + song_id + ", song_title=" + song_title + ", artist__name=" + artist__name
				+ ", album_name=" + album_name + ", song_location=" + song_location + ", description=" + description
				+ "]";
	}

	public int getSong_id() {
		return song_id;
	}

	public void setSong_id(int song_id) {
		this.song_id = song_id;
	}

	public String getSong_title() {
		return song_title;
	}

	public void setSong_title(String song_title) {
		this.song_title = song_title;
	}

	public String getArtist__name() {
		return artist__name;
	}

	public void setArtist__name(String artist__name) {
		this.artist__name = artist__name;
	}

	public String getAlbum_name() {
		return album_name;
	}

	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}

	public String getSong_location() {
		return song_location;
	}

	public void setSong_location(String song_location) {
		this.song_location = song_location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static void main(String[] args) {
	

	}

}
