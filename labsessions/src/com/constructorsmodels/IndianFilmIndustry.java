package com.constructorsmodels;

public class IndianFilmIndustry {

	String industryName;
	String industryLocation;
	String industryLang;
	int industryRank;

	{
		System.out.println("==============================================");
		System.out.println("| Welocme To Indian Film Industry |");
		System.out.println("==============================================");
	}

	public IndianFilmIndustry() {

	}

	public IndianFilmIndustry(String industryName, String indurstyLocation, String industryLang, int industryRank) {
		super();
		this.industryName = industryName;
		this.industryLocation = indurstyLocation;
		this.industryLang = industryLang;
		this.industryRank = industryRank;
		this.industryDetails();
	}

	public static void main(String[] args) {

	}

	void industryDetails() {
		System.out.println("==============================================");
		System.out.println("Industry Name : " + industryName);
		System.out.println("Industry Loaction : " + industryLocation);
		System.out.println("Industry Language : " + industryLang);
		System.out.println("Industry Rank : " + industryRank);
		System.out.println("==============================================");
	}

}
