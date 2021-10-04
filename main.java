package obab;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int k = 0, tiep;
		Device[] device = new Device[5];
		do {
			System.out.println("          ====Menu===               ");

			System.out.println("1.Nhap thiet bi(Toi da 5 , Da nhap "+k+")");
			System.out.println("2.Hien thi thong tin vua nhap");
			System.out.println("3.Hien thi so luong Coputer nhap vao");
			System.out.println("4.Hien thi so luong Monitor nhap vao");
			System.out.println("5.Thoat");
			int menu;
			do {
				System.out.print("---Chon menu---: ");
				menu = sc.nextInt();
				if (menu < 1 || menu > 5)
					System.out.println("Chon tu 1 -> 5!");
			} while (menu < 1 || menu > 5);

			switch (menu) {
			case 1:
				int chon;
				System.out.println("1.Nhap Computer");
				System.out.println("2.Nhap Monitor");
				do {
					System.out.print("Chon: ");
					chon = sc.nextInt();
					if (chon != 1 && chon != 2)
						System.out.println("Chon 1 hoac 2!");
				} while (chon != 1 && chon != 2);
				if (k > 4) {
					System.out.println("Da nhap 5 thiet bi, khong the nhap them!");
					break;
				}
				switch (chon) {

				case 1:
					device[k] = new Computer();
					device[k].input();
					k++;
					break;
				case 2:

					device[k] = new Monitor();
					device[k].input();
					k++;
					break;
				}
				break;
			case 2:
				if (k == 0)
					System.out.println("Ban chua nhap thiet bi nao!");
				for (int i = 0; i < k; i++) {
					System.out.println("STT: " + (i + 1));
					device[i].display();
				}
				break;
			case 3:

				for (int i = 0; i < k; i++)
					if (device[i].getName() == "Computer")
						device[i].display();
				break;
			case 4:

				for (int i = 0; i < k; i++)
					if (device[i].getName() == "Monitor")
						device[i].display();
				break;
			case 5:
				break;

			}

			System.out.println("1.Tiep tuc");
			System.out.println("2.Thoat");
			do {
				System.out.print("Chon: ");
				tiep = sc.nextInt();
				if (tiep != 1 && tiep != 2)
					System.out.println("Chon 1 hoac 2!");
			} while (tiep != 1 && tiep != 2);
			if (tiep == 2)
				break;
		} while (tiep == 1);

	}

}
