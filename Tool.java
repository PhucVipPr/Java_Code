package Assign;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tool {
	
	public static void menuTool() {
		System.out.println("Tim tac gia");
		System.out.println("Tim ngon ngu");
		System.out.println("TIm theo gia");
		System.out.println("Sap xep gia giam dan");
		System.out.println("5.Thoat");
		System.out.println("-------------------");
	}
	
	public static void tool(ArrayList<Book> books ) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			menuTool();
			System.out.print("Lua chon");
			int Mt = Integer.parseInt(sc.nextLine());
			switch(Mt) {
			case 1 :
				System.out.println("Nhap ten tac gia can tim : ");
				String author = sc.nextLine();
				for(int i=0;i<books.size();i++) {
					if(books.get(i).getAuthor().contains(author)) {
						System.out.println(books.get(i).toString());
					}
					
				}
				break;
			case 2 : 
				System.out.println("Nhap ngon ngu can tim : ");
				String language = sc.nextLine();
				for(int i=0;i<books.size();i++) {
					if(books.get(i).getLanguage().contains(language)) {
						System.out.println(books.get(i).toString());
					}
					
				}
				break;
			case 3 : 
				System.out.println("Nhap gia can tim : ");
				double price = sc.nextDouble();
				for(int i=0;i<books.size();i++) {
					if(books.get(i).getPrice() == (price)) {
						System.out.println(books.get(i).toString());
					}
					
				}
				break;
			case 4 : 
				for(int i=0;i<books.size()-1;i++) {
					for(int j=i+1;j<books.size();j++) {
						if(books.get(i).getPrice()<books.get(j).getPrice()) {
							Book tmp = books.get(j);
							books.set(j,books.get(i));
							books.set(i,tmp);
						}
					}
				}
				for(int i=0;i<books.size();i++) {
					System.out.println(books.get(i).toString());
				}
				
				break;
			default :
				System.exit(0);
			}
		}
	}

}
