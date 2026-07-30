package com.fundamentals;

public class LibraryBook {

	private final static String libraryName = "Swami Vivekanandha Library";
	private static String librarian = "Mr G.Manohar Reddy";

	int bookID;
	String bookName;
	String bookAuthor;
	int avialableCopies;

	protected void displayBookDetails() {
		System.out.println("==========================================================");
		System.out.println("Name of the book you choose : " + bookName);
		System.out.println("Name of the Author : " + bookAuthor);
		System.out.println(
				"No of copies of '" + bookName + "' book are available : (Before issued) : " + avialableCopies);
		System.out.println("==========================================================");
	}

	protected void issueBook() {
		avialableCopies -= 1;
		System.out
				.println("No of copies of '" + bookName + "' book are available : (After issued) : " + avialableCopies);
	}

	protected static void displayLibraryDetails() {
		System.out.println("==========================================================");
		System.out.println("===> Welcome to " + libraryName +" <===");
		System.out.println("Name of the Library : " + libraryName);
		System.out.println("Name of the Librarian : " + librarian);
	}

	protected static void changeLibrarian() {
		librarian = "Mr V.sai";
		System.out.println("Name of the Librarian : " + librarian);
		
	}

	public static void main(String[] args) {

		displayLibraryDetails();
		LibraryBook book1 = new LibraryBook();
		book1.bookID = 1287;
		book1.bookName = "The wing of fires";
		book1.bookAuthor = "Dr APJ Abdul Kalam";
		book1.avialableCopies = 5;
		book1.displayBookDetails();
		book1.issueBook();

		LibraryBook book2 = new LibraryBook();
		book2.bookID = 1235;
		book2.bookName = "The Art of public speaking";
		book2.bookAuthor = "Mr sahil vande";
		book2.avialableCopies = 10;
		book2.displayBookDetails();
		book2.issueBook();
		changeLibrarian();
		
	}

}
