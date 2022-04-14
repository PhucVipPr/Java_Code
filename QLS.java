package Assign;
import java.util.Scanner;
import java.util.ArrayList;
public class QLS {
	public static void bookMenu() {
		System.out.println("1.Nhap them quyen sach moi ");
		System.out.println("2.Sua thong tin cua sach");
		System.out.println("3.Xoa quyen sach");
		System.out.println("4.Hien thi tat ca so sach");
		System.out.println("5.Thoat");
		System.out.println("-------------------------");
		
	}

	public static void menuBook(ArrayList<Book> danhSach) {
		Scanner sc = new Scanner(System.in);
		int Op;
		do {
		bookMenu();
		System.out.print("Lua chon");
		Op = Integer.parseInt(sc.nextLine());
		switch(Op) {
		case 1 : 
			System.out.printf("So sach muon nhap : ");
			int n = Integer.parseInt(sc.nextLine());
			for(int i=0;i<n;i++) {
				System.out.print("Nhap id : ");
				int id = Integer.parseInt(sc.nextLine());
				System.out.print("Ten sach : ");
				String name = sc.nextLine();
				System.out.print("Tac gia : ");
				String author = sc.nextLine();
				System.out.print("Ngon ngu : ");
				String language = sc.nextLine();
				System.out.print("Gia sach : ");
				double price = Double.parseDouble(sc.nextLine());
				System.out.print("Nam xb : ");
				int date = Integer.parseInt(sc.nextLine());
				System.out.print("ISBN: ");
				String isbn = sc.nextLine();
				Book book = new Book(id,name,author,language,price,date,isbn);
				danhSach.add(book);
				System.out.println("----------------------------");
			}
			break;
		case 2 : 
			System.out.println("Chon quyen sach thu : ");
			int number = Integer.parseInt(sc.nextLine());
			if(number<1 || number>danhSach.size() ) {
				System.out.println("Nhap lai");
				number = Integer.parseInt(sc.nextLine());
			}
			System.out.print("Nhap id : ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("Ten sach : ");
			String name = sc.nextLine();
			System.out.print("Tac gia : ");
			String author = sc.nextLine();
			System.out.print("Ngon ngu : ");
			String language = sc.nextLine();
			System.out.print("Gia sach : ");
			double price = Double.parseDouble(sc.nextLine());
			System.out.print("Nam xb : ");
			int date = Integer.parseInt(sc.nextLine());
			System.out.print("ISBN: ");
			String isbn = sc.nextLine();
			danhSach.get(number-1).setId(id);
			danhSach.get(number-1).setName(name);
			danhSach.get(number-1).setAuthor(author);
			danhSach.get(number-1).setLanguage(language);
			danhSach.get(number-1).setPrice(price);
			danhSach.get(number-1).setDate(date);
			danhSach.get(number-1).setISBN(isbn);
			break;
		case 3 : 
			System.out.println("Chon quyen sach thu : ");
			int number1 = Integer.parseInt(sc.nextLine());
			if(number1<1 || number1>danhSach.size() ) {
				System.out.println("Nhap lai");
				number1 = Integer.parseInt(sc.nextLine());
			}
			danhSach.remove(number1-1);
			break;
		case 4 : 
			for(int i=0;i<danhSach.size();i++) {
				System.out.println(danhSach.get(i).toString());
			}
			break;
		
	}
		}
		while(Op !=5);
}
	
}


