package com.emailvalidation;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
		Boolean flag = false;
		String emails[] = new String [5];
		emails[0] = "vishaln007@gmail.com";
		emails[1] = "vishaln5435@gmail.com";
		emails[2] = "vishaln7787@gmail.com";
		emails[3] = "vishaln1353@gmail.com";
		emails[4] = "vishaln6674@gmail.com";
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your Email:");
		String userEmail = sc.next();
		for (String email:emails)
		{
			if (userEmail.matches(email))
			{
				System.out.println("Welcome back " +       userEmail);
				flag=true;
				break;
			}
			}
		if (flag==false)
		{
			System.out.println("Invalid User");
			
		}

	}

}
