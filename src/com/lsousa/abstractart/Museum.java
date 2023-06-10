package com.lsousa.abstractart;

import java.util.ArrayList;

public class Museum {

	public static void main(String[] args) {
		ArrayList<Art> museum = new ArrayList<Art> ();
		
		Painting monaLisa = new Painting();
		Painting starryNight = new Painting();
		Painting tapedBanana = new Painting();
		
		Sculpture david = new Sculpture();
		Sculpture lucas = new Sculpture();
		
		museum.add(monaLisa);
		museum.add(starryNight);
		museum.add(tapedBanana);
		museum.add(david);
		museum.add(lucas);
	}

}
