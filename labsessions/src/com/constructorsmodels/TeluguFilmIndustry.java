package com.constructorsmodels;

public class TeluguFilmIndustry extends IndianFilmIndustry {

	public TeluguFilmIndustry() {

	}

	public TeluguFilmIndustry(String name, String loc, String lang, int Rank) {
		super(name, loc, lang, Rank);
	}

	public static void main(String[] args) {
		TeluguFilmIndustry tfi = new TeluguFilmIndustry("Telugu Film Industry", "Hyderabad", "Telugu", 2);
	}

}
