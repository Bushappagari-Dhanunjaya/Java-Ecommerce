package com.shop.ecommerce.project;

public class Fashion {

	public static String For_Men;
	public static String For_Women;
	public static String For_Children;


	public static String Shirt_Pant;
	public static String T_Shirt;

	public static String Saree;
	public static String Chididar;

	public static String Shirt_Pant_2;
	public static String Dress;


	/* Cost of All*/
	public static int Shirt_Pant_cost=2000;
	public static int T_Shirt_cost=500;

	public static int Saree_cost=2500;
	public static int Chididar_cost=2000;

	public static int Shirt_Pants=1500;
	public static int Dress_2=1000;





	static {
		For_Men=">> 1.Shirt and Pant \n"+">> 2.T-shirt \n";
		For_Women=">> 1.Saree \n"+">> 2.Chudidari \n";
		For_Children=">> 1.Shirt Pant \n"+">> 2.Dress \n";

	}

	static {
		Shirt_Pant="-----------------------------\n"+">> Shirt and Pant Details\n"+">> Cost:\t 2000/-\n"+">> Color:\t White and Black \n"+">> Size :\t L and 32\n"+"-----------------\n";
		T_Shirt="-----------------------------\n"+">>T-shirt Details\n"+">> Cost:\t 500/-\n"+">> Color:\t Black\n"+">> Size:\t L\n"+"-----------------------------\n";

	}
	static {

		Saree="-----------------------------\n"+">> Saree Details\n"+">> Cost:\t 2500/-\n"+">> Color:\t Pink \n"+">> Type:\t Kanjivaram \n"+"-----------------------------\n";
		Chididar="-----------------------------\n"+">> Chudidari Details\n"+">> Cost:\t 2000/-\n"+">> Color:\t Green\n"+">> Fabric:\t Cotton \n"+"-----------------------------\n";
	}

	static {

		Shirt_Pant_2="-----------------------------\n"+">> Shirt and Pant Details\n"+">> Cost:\t 1500/-\n"+">> Color:\t Blue and Black \n"+">> Size :\t S and 24\n"+"-----------------------------\n";
		Dress="-----------------------------\n"+">> Dress Details\n"+">> Cost:\t 1000/-\n"+">> Color:\t White\n"+">> length:\t knee length \n"+"-----------------------------\n";
	}


}
