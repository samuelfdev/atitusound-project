package br.edu.atitus.atitusound.dtos;

import java.util.List;

import br.edu.atitus.atitusound.entities.MusicEntity;


public class PlaylistDTO {

	private String name;
	
	private boolean publicshare;
	
	private List<MusicEntity> musics;

	public String getName() {
		return name;}

	public void setName(String name) {
		this.name = name;}

	public boolean isPublic_share() {
		return publicshare;}

	public void setPublic_share(boolean public_share) {
		this.publicshare = public_share;}

	public List<MusicEntity> getMusics() {
		return musics;}

	public void setMusics(List<MusicEntity> musics) {
		this.musics = musics;}
	
}
