package com.tka.dec24;

import java.util.Scanner;

public class TestPlayer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String teamName;
		String res;
		int res1;
		Player[] batsman;
		Player[] bowlers;

		IPLTeams obj = new IPLTeams();
		Player[] cskPlayer = obj.cskTeam();
		Player[] rcbPlayer = obj.rcbTeam();
		Player[] miPlayer = obj.miTeam();
		Player[] dcPlayer = obj.dcTeam();

//		System.out.println("\n\n************************* CSK TEAM *************************\n\n");
//		Player[] cskPlayer = obj.cskTeam();
//		for (int i = 0; i < cskPlayer.length; i++) {
//			System.out.println(cskPlayer[i]);
//		}
//
//		System.out.println("\n\n************************* MI TEAM *************************\n\n");
//		Player[] miPlayer = obj.miTeam();
//		for (int i = 0; i < miPlayer.length; i++) {
//			System.out.println(miPlayer[i]);
//		}
//
//		System.out.println("\n\n************************* RCB TEAM *************************\n\n");
//		Player[] rcbPlayer = obj.rcbTeam();
//		for (int i = 0; i < rcbPlayer.length; i++) {
//			System.out.println(rcbPlayer[i]);
//		}
//
//		System.out.println("\n\n************************* DC TEAM *************************\n\n");
//		Player[] dcPlayer = obj.dcTeam();
//		for (int i = 0; i < dcPlayer.length; i++) {
//			System.out.println(dcPlayer[i]);
//		}

		System.out.println("\n\nEnter name of the team to get details of players: ");
		teamName = sc.nextLine(); 
		if (teamName.equals("csk")) {
			System.out.println("\n\n************************* CSK TEAM *************************\n\n");
			for (int i = 0; i < cskPlayer.length; i++) {
				System.out.println(cskPlayer[i]);
			}
		} else if (teamName.equals("rcb")) {
			System.out.println("\n\n************************* RCB TEAM *************************\n\n");
			for (int i = 0; i < rcbPlayer.length; i++) {
				System.out.println(rcbPlayer[i]);
			}
		} else if (teamName.equals("dc")) {
			System.out.println("\n\n************************* DC TEAM *************************\n\n");
			for (int i = 0; i < dcPlayer.length; i++) {
				System.out.println(dcPlayer[i]);
			}
		} else if (teamName.equals("mi")) {
			System.out.println("\n\n************************* MI TEAM *************************\n\n");
			for (int i = 0; i < miPlayer.length; i++) {
				System.out.println(miPlayer[i]);
			}
		} else {
			System.out.println("Enter a valid team name !!");
		}

		System.out.println("\n\nEnter name of the team to get player with highest runs from that team: ");
		teamName = sc.nextLine();
		if (teamName.equals("csk")) {
			res = obj.maxRunPlayer(cskPlayer);
			System.out.println(res);
		} else if (teamName.equals("rcb")) {
			res = obj.maxRunPlayer(rcbPlayer);
			System.out.println(res);
		} else if (teamName.equals("dc")) {
			res = obj.maxRunPlayer(dcPlayer);
			System.out.println(res);
		} else if (teamName.equals("mi")) {
			res = obj.maxRunPlayer(miPlayer);
			System.out.println(res);
		} else {
			System.out.println("Enter a valid team name !!");
		}

		System.out.println("\n\nEnter name of the team to get player with highest wickets from that team : ");

		teamName = sc.nextLine();
		if (teamName.equals("csk")) {
			res = obj.maxWcktPlayer(cskPlayer);
			System.out.println(res);
		} else if (teamName.equals("rcb")) {
			res = obj.maxWcktPlayer(rcbPlayer);
			System.out.println(res);
		} else if (teamName.equals("dc")) {
			res = obj.maxWcktPlayer(dcPlayer);
			System.out.println(res);
		} else if (teamName.equals("mi")) {
			res = obj.maxWcktPlayer(miPlayer);
			System.out.println(res);
		} else {
			System.out.println("Enter a valid team name !!");
		}

		System.out.println("\n\nEnter name of the team to get player with highest jersey number from that team : ");
		teamName = sc.nextLine();
		if (teamName.equals("csk")) {
			res = obj.maxJerseyNo(cskPlayer);
			System.out.println(res);
		} else if (teamName.equals("rcb")) {
			res = obj.maxJerseyNo(rcbPlayer);
			System.out.println(res);
		} else if (teamName.equals("dc")) {
			res = obj.maxJerseyNo(dcPlayer);
			System.out.println(res);
		} else if (teamName.equals("mi")) {
			res = obj.maxJerseyNo(miPlayer);
			System.out.println(res);
		} else {
			System.out.println("Enter a valid team name !!");
		}

		System.out.println("\n\nEnter name of the team to get total runs of that team : ");
		teamName = sc.nextLine();
		if (teamName.equals("csk")) {
			res1 = obj.maxRunsTeam(cskPlayer);
			System.out.println("Total runs of " + teamName + " : " + res1);
		} else if (teamName.equals("rcb")) {
			res1 = obj.maxRunsTeam(rcbPlayer);
			System.out.println("Total runs of " + teamName + " : " + res1);
		} else if (teamName.equals("dc")) {
			res1 = obj.maxRunsTeam(dcPlayer);
			System.out.println("Total runs of " + teamName + " : " + res1);
		} else if (teamName.equals("mi")) {
			res1 = obj.maxRunsTeam(miPlayer);
			System.out.println("Total runs of " + teamName + " : " + res1);
		} else {
			System.out.println("Enter a valid team name !!");
		}

		System.out.println("\n\nEnter name of the team to get average runs of that team : ");
		teamName = sc.nextLine();
		if (teamName.equals("csk")) {
			res1 = obj.avgRunsTeam(cskPlayer);
			System.out.println("Average runs of " + teamName + " : " + res1);
		} else if (teamName.equals("rcb")) {
			res1 = obj.avgRunsTeam(rcbPlayer);
			System.out.println("Average runs of " + teamName + " : " + res1);
		} else if (teamName.equals("dc")) {
			res1 = obj.avgRunsTeam(dcPlayer);
			System.out.println("Average runs of " + teamName + " : " + res1);
		} else if (teamName.equals("mi")) {
			res1 = obj.avgRunsTeam(miPlayer);
			System.out.println("Average runs of " + teamName + " : " + res1);
		} else {
			System.out.println("Enter a valid team name !!");
		}
		
		System.out.println("\n\nEnter name of the team to get bowlers from the team : ");
		teamName = sc.nextLine();
		if (teamName.equals("csk")) {
			System.out.println("BATSMAN from Chennai super kings: ");
			obj.getBowlers(cskPlayer);
		} else if (teamName.equals("rcb")) {
			System.out.println("BATSMAN from Royal challengers Banglore: ");
			obj.getBowlers(rcbPlayer);
		} else if (teamName.equals("dc")) {
			System.out.println("BATSMAN from Delhi capitals: ");
			obj.getBowlers(dcPlayer);
		} else if (teamName.equals("mi")) {
			System.out.println("BATSMAN from Mumbai indians: ");
			obj.getBowlers(miPlayer);
		} else {
			System.out.println("Enter a valid team name !!");
		}
		
		System.out.println("\n\nEnter name of the team to get batsmen from the team : ");
		teamName = sc.nextLine();
		if (teamName.equals("csk")) {
			System.out.println("Bowlers from Chennai super kings: ");
			obj.getBatsman(cskPlayer);
		} else if (teamName.equals("rcb")) {
			System.out.println("Bowlers from Royal challengers Banglore: ");
			obj.getBatsman(rcbPlayer);
		} else if (teamName.equals("dc")) {
			System.out.println("Bowlers from Delhi capitals: ");
			obj.getBatsman(dcPlayer);
		} else if (teamName.equals("mi")) {
			System.out.println("Bowlers from Mumbai indians: ");
			obj.getBatsman(miPlayer);
		} else {
			System.out.println("Enter a valid team name !!");
		}  
		
		System.out.println("\n\nEnter name of the team to get allRounders from the team : ");
		teamName = sc.nextLine();
		if (teamName.equals("csk")) {
			System.out.println("All Rounders from Chennai super kings: ");
			obj.getAllRounders(cskPlayer);
		} else if (teamName.equals("rcb")) {
			System.out.println("All Rounders from Royal challengers Banglore: ");
			obj.getAllRounders(rcbPlayer);
		} else if (teamName.equals("dc")) {
			System.out.println("All Rounders from Delhi capitals: ");
			obj.getAllRounders(dcPlayer);
		} else if (teamName.equals("mi")) {
			System.out.println("All Rounders from Mumbai indians: ");
			obj.getAllRounders(miPlayer);
		} else {
			System.out.println("Enter a valid team name !!");
		} 
	}
}
