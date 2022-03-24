package com.splitwise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.splitwise.model.ExpenseType;
import com.splitwise.model.Type;
import com.splitwise.model.User;
import com.splitwise.service.ShareExpenses;
import com.splitwise.service.UserService;


// https://www.youtube.com/watch?v=kUIDqSRlMIc Lavakumar Techie
// https://workat.tech/machine-coding/practice/splitwise-problem-0kp2yneec2q2 Link
public class Main {

	/*
	public static void main(String[] args) {

		// Input Sample Users
		User user1 = new User(1, "u1", "u1@gmail.com", "9890098900");
		User user2 = new User(2, "u2", "u2@gmail.com", "9999999999");
		User user3 = new User(3, "u3", "u3@gmail.com", "9898989899");
		User user4 = new User(4, "u4", "u4@gmail.com", "8976478292");
		List<User> users = new ArrayList<>(Arrays.asList(user1, user2, user3, user4));

		// Adding Expenses

		ShareExpenses shareExpenses = new ShareExpenses(users);
		UserService userService = new UserService(users);

		while (true) {
			Scanner scan = new Scanner(System.in);
			Type type = Type.of(scan.next());
			switch (type) {
			case EXPENSE:
				String user = scan.next();
				int amountSpend = scan.nextInt();
				double totalMembers = scan.nextDouble();
				List<User> owedUsers = new ArrayList<>();
				for (int i = 0; i < totalMembers; i++) {
					owedUsers.add(userService.getUser(scan.next()).get());
				}
				ExpenseType expense = ExpenseType.of(scan.next());
				switch (expense) {
				case EQUAL:
					shareExpenses.splitEqualExpenses(user, amountSpend, owedUsers);
					break;
				case EXACT:
					HashMap<User, Double> owedAmountMap = new HashMap<>();
					double sum = 0;
					for (int i = 0; i < totalMembers; i++) {
						double amount = scan.nextDouble();
						sum += amount;
						owedAmountMap.put(owedUsers.get(i), amount);
					}
					if (sum != amountSpend) {
						System.out.println("Sum not Matches to actual split amount");
						break;
					}
					shareExpenses.splitExactExpenses(user, amountSpend, owedUsers, owedAmountMap);
					break;
				case PERCENT:
					HashMap<User, Integer> owedPercentageMap = new HashMap<>();
					int per = 0;
					for (int i = 0; i < totalMembers; i++) {
						int amount = scan.nextInt();
						per += amount;
						owedPercentageMap.put(owedUsers.get(i), amount);
					}
					if (per != 100) {
						System.out.println("Sum Percentage not Matches to 100");
						break;
					}
					shareExpenses.splitPercentageExpenses(user, amountSpend, owedUsers, owedPercentageMap);
					break;
				}
				break;
			case SHOW:
				String userName = scan.nextLine();
				shareExpenses.showExpenses(userName);
				break;
			case QUIT:
				System.out.println("Quiting...");
				return;
			default:
				System.out.println("No Expected Argument Found");
				break;
			}

		}

	}*/
	
	public static void main(String[] args) {

		// Input Sample Users
		User user1 = new User(1, "u1", "u1@gmail.com", "9890098900");
		User user2 = new User(2, "u2", "u2@gmail.com", "9999999999");
		User user3 = new User(3, "u3", "u3@gmail.com", "9898989899");
		User user4 = new User(4, "u4", "u4@gmail.com", "8976478292");
		
		List<User> users = Arrays.asList(user1, user2, user3, user4);
		
		ShareExpenses shareExpenses = new ShareExpenses(users);
		UserService userService = new UserService(users);
		
		System.out.println("SHOW");
		shareExpenses.showExpenses("");

		System.out.println("\nSHOW u1");
		shareExpenses.showExpenses("u1");
		
		System.out.println("\nEXPENSE u1 1000 4 u1 u2 u3 u4 EQUAL");
		String user = "u1";
		int amountSpend = 1000;
		List<User> owedUsers = Arrays.asList(user1, user2, user3, user4);
		shareExpenses.splitEqualExpenses(user, amountSpend, owedUsers);
		
		System.out.println("\nSHOW u4");
		shareExpenses.showExpenses("u4");
		
		System.out.println("\nSHOW u1");
		shareExpenses.showExpenses("u1");
		
		System.out.println("\nEXPENSE u1 1250 2 u2 u3 EXACT 370 880");
		String userExact = "u1";
		int amountSpendExact = 1250;
		List<User> owedUsersExact = Arrays.asList(user2, user3);
		HashMap<User, Double> owedAmountMap = new HashMap<>();
		owedAmountMap.put(user2, 370.0);
		owedAmountMap.put(user3, 880.0);
		shareExpenses.splitExactExpenses(userExact, amountSpendExact, owedUsersExact, owedAmountMap);
		
		System.out.println("\nSHOW");
		shareExpenses.showExpenses("");
		
		System.out.println("\nEXPENSE u4 1200 4 u1 u2 u3 u4 PERCENT 40 20 20 20");
		String userPer = "u4";
		int amountSpendPer = 1200;
		List<User> owedUsersPer = Arrays.asList(user1, user2, user3, user4);
		HashMap<User, Integer> owedAmountMapPer = new HashMap<>();
		owedAmountMapPer.put(user1, 40);
		owedAmountMapPer.put(user2, 20);
		owedAmountMapPer.put(user3, 20);
		owedAmountMapPer.put(user4, 20);
		shareExpenses.splitPercentageExpenses(userPer, amountSpendPer, owedUsersPer, owedAmountMapPer);
		
		System.out.println("\nSHOW u1");
		shareExpenses.showExpenses("u1");
		
		System.out.println("\nSHOW");
		shareExpenses.showExpenses("");
	}

}


/*
SHOW
NO Balance

SHOW u1
NO Balance
EXPENSE u1 1000 4 u1 u2 u3 u4 EQUAL
SHOW u4
u4 Owes u1: 250.0

SHOW u1
u2 Owes u1: 250.0
u4 Owes u1: 250.0
u3 Owes u1: 250.0

EXPENSE u1 1250 2 u2 u3 EXACT 370 880
SHOW
u2 Owes u1: 620.0
u4 Owes u1: 250.0
u3 Owes u1: 1130.0

EXPENSE u4 1200 4 u1 u2 u3 u4 PERCENT 40 20 20 20
SHOW u1
u2 Owes u1: 620.0
u3 Owes u1: 1130.0
u1 Owes u4: 230.0

SHOW
u2 Owes u1: 620.0
u3 Owes u1: 1130.0
u1 Owes u4: 230.0
u2 Owes u4: 240.0
u3 Owes u4: 240.0

*/