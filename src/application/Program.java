package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i+1) + " data: ");
			System.out.print("Common, used or imported (c/u/i)?");
			char option = sc.next().charAt(0);
			sc.nextLine();
			
			switch (option) {
			case 'c':
				System.out.print("Name: ");
				String nameC = sc.nextLine();
				System.out.print("Price: ");
				Double priceC = sc.nextDouble();

				Product productC = new Product(nameC, priceC);
				list.add(productC);
				break;

			case 'u':
				System.out.print("Name: ");
				String nameU = sc.nextLine();
				System.out.print("Price: ");
				Double priceU = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
			
				Product productU = new UsedProduct(nameU, priceU, manufactureDate);
				list.add(productU);
				break;

			case 'i':
				System.out.print("Name: ");
				String nameI = sc.nextLine();
				System.out.print("Price: ");
				Double priceI = sc.nextDouble();
				System.out.print("Customs Fee: ");
				Double customsfee = sc.nextDouble();

				Product productI = new ImportedProduct(nameI, priceI, customsfee);
				list.add(productI);
				break;
				
			default:

			}

			
			}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product p : list) {
			System.out.println(p.priceTag());
			
		}

	}

}
