package com.aurionpro.model;

public class Bark {
	private String sound;
	
	public Bark(String sound) {
		this.sound = sound;
	}
	
	public String getSound() {
		return sound;
	}
	
	public boolean match(Object bark) {
		if(bark instanceof Bark) {
			Bark anotherBark = (Bark)bark;
			if(this.sound.equalsIgnoreCase(anotherBark.sound)) {
				return true;
			}
		}
		return false;
	}
	
}
