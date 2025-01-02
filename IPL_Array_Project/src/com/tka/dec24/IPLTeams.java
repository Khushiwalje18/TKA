package com.tka.dec24;

public class IPLTeams {

	private int size = 11;
	private Player[] iplTeam;
	private int totalMatchesPlayedByEachTeam = 14;

	Player[] cskTeam() {
		Player[] csk = new Player[size];
		csk[0] = new Player(31, 583, 0, "Ruturaj Gaikwad");
		csk[1] = new Player(25, 396, 1, "Shivam Dube");
		csk[2] = new Player(20, 318, 1, "Daryl Mitchell");
		csk[3] = new Player(8, 267, 8, "Ravindra Jadeja");
		csk[4] = new Player(27, 242, 0, "Ajinkya Rahane");
		csk[5] = new Player(7, 161, 0, "MSD");
		csk[6] = new Player(18, 128, 2, "Moeen Ali");
		csk[7] = new Player(90, 0, 5, "Deep285ak Chahar");
		csk[8] = new Player(96, 0, 17, "Tushar Deshapande");
		csk[9] = new Player(99, 0, 13, "Matheesha Pathirana");
		csk[10] = new Player(24, 0, 14, "Mastafizur Rahman");

		return csk;
	}

	Player[] miTeam() {
		Player[] mi = new Player[size];
		mi[0] = new Player(45, 417, 0, "Rohit Sharma");
		mi[1] = new Player(9, 416, 0, "Tilak Varma");
		mi[2] = new Player(63, 345, 0, "SuryaKumar Yadav");
		mi[3] = new Player(32, 320, 0, "Ishaan Kishan");
		mi[4] = new Player(21, 241, 0, "Tim David");
		mi[5] = new Player(33, 216, 11, "Hardik Pandya");
		mi[6] = new Player(93, 0, 20, "Jasprit Bumrah");
		mi[7] = new Player(3, 0, 13, "Piyush Chawla");
		mi[8] = new Player(14, 0, 10, "Gerald Coetzee");
		mi[9] = new Player(99, 0, 8, "Nuwan Thushara");
		mi[10] = new Player(42, 178, 5, "Cameron Green");

		return mi;
	}

	Player[] dcTeam() {
		Player[] dc = new Player[size];
		dc[0] = new Player(17, 446, 0, "Rishab Pant");
		dc[1] = new Player(72, 378, 0, "Tristan Stubs");
		dc[2] = new Player(63, 330, 0, "Jake Fraser-McGurk ");
		dc[3] = new Player(94, 327, 0, "Abhishek Porel");
		dc[4] = new Player(20, 235, 11, "Axar Patel");
		dc[5] = new Player(36, 0, 17, "Mukesh Kumar");
		dc[6] = new Player(13, 0, 17, "Khaleel Ahmed");
		dc[7] = new Player(23, 0, 16, "Kuldeep Yadav");
		dc[8] = new Player(34, 0, 10, "Ishant Sharma");
		dc[9] = new Player(31, 168, 0, "David Warner");
		dc[10] = new Player(100, 145, 0, "Prithvi Shaw");

		return dc;
	}

	Player[] rcbTeam() {
		Player[] rcb = new Player[size];
		rcb[0] = new Player(18, 741, 0, "Virat Kholi");
		rcb[1] = new Player(18, 438, 0, "Faf du Plessis");
		rcb[2] = new Player(20, 395, 0, "Rajat Pathidar");
		rcb[3] = new Player(21, 326, 0, "Dinesh Karthik");
		rcb[4] = new Player(42, 255, 10, "Cameron Green");
		rcb[5] = new Player(32, 198, 5, "Glenn Maxwell");
		rcb[6] = new Player(73, 0, 14, "Mohammed Siraj");
		rcb[7] = new Player(22, 0, 15, "Yash Dayal");
		rcb[8] = new Player(69, 0, 9, "Lockie Ferguson");
		rcb[9] = new Player(33, 0, 7, "Karn Sharma");
		rcb[10] = new Player(24, 0, 24, "Harshal Patel");

		return rcb;
	}

	String maxRunPlayer(Player iplTeam[]) {
		this.iplTeam = iplTeam;
		int maxRuns = this.iplTeam[0].getRuns();
		int maxPlayerIndex = 0;

		for (int i = 1; i < this.iplTeam.length; i++) {
			if (this.iplTeam[i].getRuns() > maxRuns) {
				maxRuns = this.iplTeam[i].getRuns();
				maxPlayerIndex = i;
			}
		}
		return "Player with maximum runs is " + this.iplTeam[maxPlayerIndex].getPName() + " and maximum runs are "
				+ this.iplTeam[maxPlayerIndex].getRuns();
	}

	String maxWcktPlayer(Player iplTeam[]) {
		this.iplTeam = iplTeam;
		int maxWkts = this.iplTeam[0].getWckts();
		int maxPlayerIndex = 0;

		for (int i = 1; i < this.iplTeam.length; i++) {
			if (this.iplTeam[i].getWckts() > maxWkts) {
				maxWkts = this.iplTeam[i].getWckts();
				maxPlayerIndex = i;
			}
		}
		return "Player with maximum wickets is " + this.iplTeam[maxPlayerIndex].getPName() + " and maximum wickets are "
				+ this.iplTeam[maxPlayerIndex].getWckts();
	}

	String maxJerseyNo(Player iplTeam[]) {
		this.iplTeam = iplTeam;
		int maxJersey = this.iplTeam[0].getJerseyNo();
		int maxPlayerIndex = 0;

		for (int i = 1; i < this.iplTeam.length; i++) {
			if (this.iplTeam[i].getJerseyNo() > maxJersey) {
				maxJersey = this.iplTeam[i].getJerseyNo();
				maxPlayerIndex = i;
			}
		}
		return "Player with maximum Jersey number is " + this.iplTeam[maxPlayerIndex].getPName()
				+ " and his jersey number is " + this.iplTeam[maxPlayerIndex].getJerseyNo();
	}

	int maxRunsTeam(Player[] iplTeam) {
		this.iplTeam = iplTeam;
		int sum = 0;

		for (int i = 0; i < this.iplTeam.length; i++) {
			sum += this.iplTeam[i].getRuns();
		}
		return sum;
	} 

	int avgRunsTeam(Player[] iplTeam) {
		this.iplTeam = iplTeam;
		int sum = this.maxRunsTeam(iplTeam);
		return sum / this.totalMatchesPlayedByEachTeam;
	}

	void getBowlers(Player[] iplTeam) {
		this.iplTeam = iplTeam;
		for (int i = 0; i < iplTeam.length; i++) {
			if (this.iplTeam[i].getWckts() > 5) {
				System.out.println(this.iplTeam[i].getPName());
			}
		}
	}

	void getBatsman(Player[] iplTeam) {
		this.iplTeam = iplTeam;
		for (int i = 0; i < iplTeam.length; i++) {
			if (this.iplTeam[i].getRuns() > 200) {
				System.out.println(this.iplTeam[i].getPName());
			}
		}
	}
	
	void getAllRounders(Player[] iplTeam) {
		this.iplTeam=iplTeam;
		for(int i=0; i<iplTeam.length; i++) {
			if(this.iplTeam[i].getRuns()>200 && this.iplTeam[i].getWckts()>5) {
				System.out.println(this.iplTeam[i].getPName());
			}
		}
	}

}
