package lab2;
// Created by David O Connor on 19/09/2016.

public class Exercise2Formatted {

	public static void main(String[] args) {

		String title = "Harry Potter and the Prisoner of Azkaban", author = "J.K. Rowling";
		int pages = 317, year = 1999;
		float price = 35.50f;
		
		String formatString = String.format("%-20s%-20s\n%-20s%-20s\n%-20s%-20d\n%-20s%-20d\n%-20sEUR%-20.2f",
				"Title: ",title, "Author: ", author, "Number of Pages: ", pages, "Year Published: ", year, "Price: ", price);
		
		System.out.println(formatString);
	}
}
