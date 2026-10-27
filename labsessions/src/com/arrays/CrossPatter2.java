package com.arrays;

//Given Input : 
//[D,a,b,c,D]
//[d,H,e,H,f]
//[g,h,O,i,j]
//[k,N,l,N,m]
//[I,n,o,p,I]
public class CrossPatter2 {

	public static void main(String[] args) {
//		String text1 = "DHONI";
//		String text2 = "KOHLI";
//		String text3 = "ROHIT";
		String text4 = "MANOHAR";
//		printPatter(text1);
//		printPatter(text2);
//		printPatter(text3);
		printPatter(text4);
	}

	public static void printPatter(String text) {
		char filler = 'a';
		char[][] array = new char[text.length()][text.length()];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (i == j || j + i == array.length - 1) {
					array[i][j] = text.charAt(i);
				} else {
					array[i][j] = filler;
					filler++;
					if (filler > 'z') {
						filler = 'a';
					}
				}
			}
		}

		System.out.println("================");
		for (char[] arr : array) {
			for (char c : arr) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
		System.out.println("================");
	}

}
