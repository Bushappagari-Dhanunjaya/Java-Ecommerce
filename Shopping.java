package com.shop.ecommerce.project;
import java.util.*;
public class Shopping {
	public static int ch;
	public static String sel;
	public static int quantity;
	/* Shop again function*/
	public static void Want_shop_again() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Do want to Shop More ?");
		sel=sc.next();
		if (sel.equals("yes")) 
		{
			main(null);

		}
		else 
		{
            System.out.println("********** THANK YOU **********");
            System.exit(0);
		}


	}

	/*Items of Home decors function*/

	public static void Furniture() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select Furniture You Want");
		System.out.println("----------------------------------------------------\n");
		System.out.println(Homedec.Furniture);
		System.out.println("choose>>");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println(Homedec.Bed);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{ 
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Homedec.Bed_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}

		case 2:
		{
			System.out.println(Homedec.Chair);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Homedec.Chair_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}
		default:{
			System.out.println("Please choose the correct option-->> \n");
			Furniture();
		}

		}
		Want_shop_again();

	}


	public static void Blanket() {
		Scanner sc=new Scanner(System.in);
		System.out.println("select Blanket You Want");
		System.out.println("----------------------------------------------------\n");
		System.out.println(Homedec.Blanket);
		System.out.println("choose>>");
		int ch2=sc.nextInt();
		switch(ch2) {
		case 1:
		{
			System.out.println(Homedec.Tundwal);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Homedec.Tundwal_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}
		case 2:
		{
			System.out.println(Homedec.Rian);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes"))
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Homedec.Rian_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}
		default:{
			System.out.println("Please choose the correct option-->> \n");
			Blanket();
		}
		}

		Want_shop_again();
	}

	public static void kitchen_item() {
		Scanner sc=new Scanner(System.in);
		System.out.println("select Kitchen items You Want");
		System.out.println("----------------------------------------------------\n");
		System.out.println(Homedec.Kitchen_Decors);
		System.out.println("choose>>");
		int ch2=sc.nextInt();
		switch(ch2) 
		{
		case 1:
		{
			System.out.println(Homedec.Mixi);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Homedec.Mixi_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else {
				main(null);
			}
			break;
		}
		case 2:
		{
			System.out.println(Homedec.Rice_cooker);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Homedec.Rice_cooker_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}
		default:
		{
			System.out.println("Please choose the correct option-->> \n");
			kitchen_item();
		}
		}

		Want_shop_again();
		}
	
	/* Items of Electronic  function*/

	public static void Mobile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("select Mobile You Want");
		System.out.println("----------------------------------------------------\n");
		System.out.println(Electronics.Mobiles);
		System.out.println("\n choose>>");
		ch=sc.nextInt();
		switch(ch) 
		{
		case 1:
		{
			System.out.println(Electronics.Xiaomi_11i);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Electronics.Xiaomi_11i_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}

		case 2:
		{
			System.out.println(Electronics.Sumsung22_Ultra);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Electronics.Sumsung22_Ultra_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}

		case 3:
		{
			System.out.println(Electronics.Iphone_14pro);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Electronics.Iphone_14pro_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}
		default:
		{
			System.out.println("Please choose the correct option-->> \n");
			Mobile();
		}


		}
         Want_shop_again();
	}



	public static void Laptop() {
		Scanner sc=new Scanner(System.in);

		System.out.println("select Laptop You Want");
		System.out.println("----------------------------------------------------\n");
		System.out.println(Electronics.Laptops);
		System.out.println("choose>>");
		ch=sc.nextInt();
		switch(ch) 
		{
		case 1:
		{
			System.out.println(Electronics.Hp);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Electronics.Hp_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}

		case 2:
		{
			System.out.println(Electronics.Msi);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) {
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Electronics.Msi_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else {
				main(null);
			}
			break;
		}
		default:
		{
			System.out.println("Please choose the correct option-->> \n");
			Laptop();
		}

		}

		Want_shop_again();

	}

	public static void Watches() {
		Scanner sc=new Scanner(System.in);
		System.out.println("select Watch You Want");
		System.out.println("----------------------------------------------------\n");
		System.out.println(Electronics.Smart_Watches);
		System.out.println("choose>>");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
		{
			System.out.println(Electronics.Firebolt);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Electronics.Firebolt_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}

		case 2:
		{
			System.out.println(Electronics.Titan);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Electronics.Titan_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else
			{
				main(null);
			}
			break;
		}

		case 3:
		{
			System.out.println(Electronics.Boat);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes"))
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Electronics.Boat_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}
		default:
		{
			System.out.println("Please choose the correct option-->> \n");
			Watches();
		}

		}

        Want_shop_again();

	}

	/*Items of Fashion Function*/

	public static void For_men() {
		Scanner sc=new Scanner(System.in);
		System.out.println("select Men Fashion You Want");
		System.out.println("----------------------------------------------------\n");
		System.out.println(Fashion.For_Men);
		System.out.println("choose>>");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println(Fashion.Shirt_Pant);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Fashion.Shirt_Pant_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else {
				main(null);
			}
			break;
		}

		case 2:
		{
			System.out.println(Fashion.T_Shirt);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Fashion.T_Shirt_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}
		default:
		{
			System.out.println("Please choose the correct option-->> \n");
			For_men();
		}



		}

		Want_shop_again();

	}


	public static void For_women() {
		Scanner sc=new Scanner(System.in);
		System.out.println("select WoMen Fashion You Want");
		System.out.println("----------------------------------------------------\n");
		System.out.println(Fashion.For_Women);
		System.out.println("choose>>");
		ch=sc.nextInt();
		switch(ch) 
		{
		case 1:
		{
			System.out.println(Fashion.Saree);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Fashion.Saree_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}

		case 2:
		{
			System.out.println(Fashion.Chididar);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes"))
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Fashion.Chididar_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}
		default:
		{
			System.out.println("Please choose the correct option-->> \n");
			For_women();
		}

		}

		Want_shop_again();

	}


	public static void For_child() {
		Scanner sc=new Scanner(System.in);
		System.out.println("select type For Childrens Fashion You Want");
		System.out.println("----------------------------------------------------\n");
		System.out.println(Fashion.For_Children);
		System.out.println("choose>>");
		ch=sc.nextInt();
		switch(ch) 
		{
		case 1:
		{
			System.out.println(Fashion.Shirt_Pant_2);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes"))
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Fashion.Shirt_Pants*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}

		case 2:
		{
			System.out.println(Fashion.Dress);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Fashion.Dress_2*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}
		default:
		{
			System.out.println("Please choose the correct option-->> \n");
			For_child();
		}
		}

		Want_shop_again();

	}

	/*Items of Instamart Function*/

	public static void Kurkure() {
		Scanner sc=new Scanner(System.in);
		System.out.println("select Kurkure You Want");
		System.out.println("----------------------------------------------------\n");
		System.out.println(Instamart.Kurkure_1);
		System.out.println("choose>>");
		ch=sc.nextInt();
		switch(ch) 
		{
		case 1:
		{
			System.out.println(Instamart.Lays);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Instamart.Lays_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		 }

		case 2:
		{
			System.out.println(Instamart.Soya_Sticks);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Instamart.Soya_Sticks_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}
		default:
		{
			System.out.println("Please choose the correct option-->> \n");
			Kurkure();
		}


		}

		Want_shop_again();
	}

	public static void Fruits() {
		Scanner sc=new Scanner(System.in);
		System.out.println("select Fruits You Want");
		System.out.println("----------------------------------------------------\n");
		System.out.println(Instamart.Fruits_1);
		System.out.println("choose>>");
		ch=sc.nextInt();
		switch(ch) 
		{
		case 1:
		{
			System.out.println(Instamart.Apple);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes"))
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Instamart.Apple_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}

		case 2:
		{
			System.out.println(Instamart.Kiwi);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Instamart.Kiwi_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}
		default:
		{
			System.out.println("Please choose the correct option-->> \n");
			Fruits();
		}

		}

		Want_shop_again();

	}

	public static void Biscuits() {
		Scanner sc=new Scanner(System.in);
		System.out.println("select Biscuits You Want");
		System.out.println("----------------------------------------------------\n");
		System.out.println(Instamart.Biscuits_1);
		System.out.println("choose>>");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println(Instamart.Good_day);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Instamart.Good_day_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}

		case 2:
		{
			System.out.println(Instamart.Magic_moms);
			System.out.println("Do You Wish to Purchase ? ");
			sel=sc.next().toLowerCase();
			if(sel.equals("yes")) 
			{
				System.out.println("Select the Quantity >> ");
				int quantity=sc.nextInt();
				System.out.println("Successfully purchased \n"+"-----------------------------\n"+"Your Bill is : "+Instamart.Magic_moms_cost*quantity+"/-"+"\n-----------------------------");		
			}
			else 
			{
				main(null);
			}
			break;
		}
		default:
		{
			System.out.println("Please choose the correct option-->> \n");
			Biscuits();
		}

		}

		Want_shop_again();

	}

	/* product's Main  Methods*/

	/* Home decors Function*/
	public static void Homedecors() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t Welcome to Homedecors");
		System.out.println("----------------------------------------------------\n");
		System.out.println("select what you want:\n"+
				"1.Furniture \n"+
				"2.blanket \n"

		+"3.Kitchen decors\n"+"\n choose>>>");
		int ch1=sc.nextInt();
		switch(ch1)
		{
		case 1:
		{		
			Furniture();
			break;
		}
		case 2:
		{

			Blanket();
			break;
		}
		case 3:
		{
     		kitchen_item();
			break;
		}
		default:
		{
			System.out.println("Please choose the valid option --> \n");
			Homedecors();
		}
		}

	}
	
	
	/* Electronics Function*/

	public static void Electronics() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t Welcome to Electronics");
		System.out.println("----------------------------------------------------\n");
		System.out.println("select what you want:\n"+
				"1.Mobile \n"+
				"2.Laptop \n"
				+"3.Smart Watches\n"+"\n choose>>>");
		ch=sc.nextInt();
		switch(ch) 
		{
		case 1:
		{
			Mobile();
			break;
		}
		case 2:
		{
			Laptop();
			break;
		}
		case 3:
		{
			Watches();
			break;
		}
		default:{
			System.out.println("Please choose the valid option --> \n");
			Electronics();
		}
		}

	}


	/* Fashion Funtion*/

	public static void Fashion() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t Welcome to Fashion");
		System.out.println("----------------------------------------------------\n");
		System.out.println("select what you want:\n"+
				"1.For Men \n"+
				"2.For Women \n"
				+"3.For Childrens\n"+"\n choose>>>");
		ch=sc.nextInt();
		switch(ch) 
		{
		case 1:
		{

			For_men();
			break;
		}
		case 2:
		{
			For_women();
			break;
		}
		case 3:
		{
			For_child();
			break;
		}
		default:
		{
			System.out.println("Please choose the valid option --> \n");
			Fashion();
		}
		}

	}

	/* Instamart Functon */

	public static void Instamart() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t Welcome to Instamart");
		System.out.println("----------------------------------------------------");
		System.out.println("select what you want:\n"+
				"1.Kurkure \n"+
				"2.Fruites \n"
				+"3.Biscuits \n"+"\n choose>>>");
		int ch1=sc.nextInt();
		switch(ch1)
		{
		case 1:
		{

			Kurkure();
			break;
		}
		case 2:
		{

			Fruits();
			break;
		}
		case 3:
		{
			Biscuits();
			break;
		}
		default:
		{
			System.out.println("Please choose the valid option --> \n");
			Instamart();
		}
		}

	}

	/**
	 *This is main method
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("-----------------------------------------------------");
		System.out.println("\t\t\t Welcome to Shopping ");
		System.out.println("-----------------------------------------------------");
		System.out.println("Select the product type you want:\n"
				+"1.Home decors \n"
				+"2.Electronics \n"
				+"3.Fashion \n"
				+"4.Instamart \n"
				+ "5.Exit \n");
		System.out.println("----------------------------------------------------");
		System.out.println("Please select the Option >>\n");
		ch=sc.nextInt();
		switch(ch) 
		{
		case 1:
		{
			Homedecors();	
			break;
		}
		case 2:
		{

			Electronics();
			break;
		}

		case 3:
		{

			Fashion();
			break;
		}

		case 4:
		{

			Instamart();
			break;
		}

		case 5:
		{
			System.out.println("\t*********** Thank You **********");
			System.exit(0);
			break;
		}
		default:
		{
			System.out.println("PLease choose the Valid option | \n");
			main(null);
			break;

		}

		}

	}

}
