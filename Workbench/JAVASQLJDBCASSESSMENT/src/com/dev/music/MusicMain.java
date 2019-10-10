package com.dev.music;

public class MusicMain {

	public static void main(String[] args) {
		Music m = new Music();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1 . Play a Song");
		System.out.println("2 . Search a Song");
		System.out.println("3 . Show all Songs");
		System.out.println("4 . Operate on Songs Database");
		System.out.println("5 . Close");
		System.out.println("****************************************************");
		int choice = Integer.parseInt(sc.nextLine());
		do {
			switch (choice) {
			case 1:
				PlayOpsImpl poi = new PlayOpsImpl();
				System.out.println("Enter your choice");
				System.out.println("A . Play all Songs");
				System.out.println("B . Play songs randomly");
				System.out.println("C . Play a particular song");
				System.out.println("****************************************************");
				String choice1 = sc.nextLine();
				switch (choice1) {
				case "A":
					poi.playAll(m);
					break;
				case "B":
					poi.playRandom(m);

					break;
				case "C":
					poi.playRandom(m);
					break;

				default:
					System.out.println("Select Valid Option");
					break;
				}

				break;
			case 2:
				SearchOpsImpl soi = new SearchOpsImpl();
				soi.searchSong(m);

				break;
			case 3:
				ShowOpImpl shoi = new ShowOpImpl();
				shoi.showAllSongs(m);

				break;
			case 4:
				OperateSongImpl osi = new OperateSongImpl();
				System.out.println("Enter your choice");
				System.out.println("A . Insert a song");
				System.out.println("B . Edit a Song details");
				System.out.println("C . Delete the Songs");
				System.out.println("****************************************************");
				String c2 = sc.nextLine();
				switch (c2) {
				case "A":
					osi.insertSong();
					break;
				case "B":
					osi.editSong();

					break;
				case "C":
					osi.deleteSong();

					break;

				default:
					System.out.println("Select Valid Option");
					break;
				}

				break;

			default:
				choice = 5;
				break;
			}
		} while (choice == 5);
	}

}
