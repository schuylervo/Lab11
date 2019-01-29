package lab11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab11 {

	public static void main(String[] args) {
	
		Scanner scnr = new Scanner(System.in);
		
		boolean isValid;
		
		List<Movie> movieList = new ArrayList<>(100);
		
		
		for (int i =1; i<= 100; i++) {
			movieList.add(MovieIO.getMovie(i));
		}
		
		System.out.println("Welcome to the Movie List Application!");
		System.out.println("There are 100 movie titles in this list");
		
		do {
			System.out.println("Please choose one of the following categories: animated, drama, horror, or scifi");
			String userCategory = scnr.nextLine();
			userCategory = userCategory.toLowerCase();
			System.out.println("Here is a list of movies in the category you selected:");
		
			
			for (int i=0; i<movieList.size(); i++) {
			
				if (userCategory.equals(movieList.get(i).getCategory())) {
					System.out.println(movieList.get(i).getTitle());
					continue;
				}
			}
		
			System.out.println("Would you like to continue? (y/n)");
			String userDecision = scnr.nextLine();
			userDecision = userDecision.toLowerCase();
			if (userDecision.matches("y")) {
				isValid = true;
			} else {
				isValid = false;
			}
		} while (isValid);
		
		System.out.println("Thank you for using Movie List Application. Goodbye!");
	}
}
