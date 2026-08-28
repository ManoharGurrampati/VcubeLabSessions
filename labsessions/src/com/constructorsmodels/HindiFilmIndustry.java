package com.constructorsmodels;

public class HindiFilmIndustry extends IndianFilmIndustry {

	public HindiFilmIndustry() {

	}

	public HindiFilmIndustry(String name, String loc, String lang, int Rank) {
		super(name, loc, lang, Rank);
	}

	public static void main(String[] args) {
		HindiFilmIndustry hfi = new HindiFilmIndustry("Hindi Film Industry", "Mumbai", "Hindi", 1);
	}

}