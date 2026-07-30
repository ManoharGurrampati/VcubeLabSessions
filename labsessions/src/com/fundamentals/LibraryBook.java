package com.fundamentals;

public class LibraryBook {

	private final static String libraryName = "Swami Vivekanandha Library";
	private final static String librarian = "Mr G.Manohar Reddy";

	int bookID;
	String bookName;
	String bookAuthor;
	static int avialableCopies;

	{
		avialableCopies = avialableCopies - 1;
	}

	protected void displayBookDetails() {
		System.out.println("==========================================================");
		System.out.println("Welcome to " + libraryName);
		System.out.println("Name of the book you choose : " + bookName);
		System.out.println("Name of the Author : " + bookAuthor);
		System.out.println("==========================================================");
	}

	protected void issueBook() {
		System.out.println("No of copies of '" + bookName + "' book are available : " + avialableCopies);
	}

	protected static void displayLibraryDetails() {
		System.out.println("==========================================================");
		System.out.println("Libraray Details");
		System.out.println("Name of the Library : " + libraryName);
		System.out.println("Name of the Librarian : " + librarian);
	}
	
	protected static void changeLibrarian() {
		
	}

	public static void main(String[] args) {
		avialableCopies = 5;
		displayLibraryDetails();
		LibraryBook book1 = new LibraryBook();
		book1.bookID = 1287;
		book1.bookName = "The wing of fires";
		book1.bookAuthor = "Dr APJ Abdul Kalam";
		book1.displayBookDetails();
		book1.issueBook();
		avialableCopies = 10;
		LibraryBook book2 = new LibraryBook();
		book2.bookID = 1235;
		book2.bookName = "The Art of public speaking";
		book2.bookAuthor = "Mr sahil vande";
		book2.displayBookDetails();
		book2.issueBook();
	}

}
