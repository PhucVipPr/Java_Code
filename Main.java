maipackage Assign;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                ArrayList<Book> list = new ArrayList<Book>();
		int luaChon;
		do {
		System.out.println("Nhap lua chon : ");
		System.out.println("1. Quan ly sach ");
		System.out.println("2. Quan ly tool ");
		System.out.println("3. Thoat chuong trinh");
		luaChon = sc.nextInt();
		switch(luaChon) {
		case 1 :
			QLS.menuBook(list);
			break;
		case 2 : 
			Tool.tool(list);
			break;
		}
		
		
	}while(luaChon!=3);
	
	

}
}
