package com.allstate.project;

import java.util.List;
import java.util.Scanner;

import com.allstate.dao.UserDao;
import com.allstate.dao.UserDaoImpl;
import com.allstate.entity.User;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the User Management System");
		System.out.println("Project Developer: Sonam Soni");

		UserDao dao= new UserDaoImpl();
		while (true) {
			System.out.println(
					"Enter 1 for Add User\n2 for Update User\n3 for Get All Users" + "\n4 for Delete User\n5 to exit");
			int input = Integer.parseInt(sc.nextLine());
			switch (input) {
			case 1: System.out.println("Enter your name");
					String name=sc.nextLine();
					System.out.println("Enter your Email");
					String email=sc.nextLine();
					System.out.println("Enter your Password");
					String password=sc.nextLine();
				
					User user= new User(name, email, password);
					if(dao.addUser(user)>0)
						System.out.println("User Registered Successfully");
					else
						System.out.println("Error while Registration Please Try Again..!");
					break;
			case 3: List<User> users= dao.findAllUsers();
					for(User u:users)
						System.out.println(u);
					break;
			case 5: System.exit(0);
			default: System.out.println("Kindly choose the correct Option");
			}
			
		}
	}
}
