public class Members {

	public static void main(String[] args) {
		String name = "Mixalis";
		int age = 34;
		String name1 = "Manolis";
		int age1 = 37;
		String name2 = "Kostis";
		int age2 = 35;
		String name3 = "Kostas";
		int age3 = 36;
		String name4 = "Cookie";
		int age4 = 7;
		String name5 = "Theodosis";
		int age5 = 63;
		int year1 = 2019-1960; //difference from 1960 to today in years.
		int year2 = 2030-2019; //difference from today to 2039 in years.

		int age6 = 0;
		age6 -=59;
		// int age6 = age6 - 59; //h praksi ginete apo ta deksia pros ta aristera.

		System.out.println("My friend " +name2+ ", is "+age2+" years old and he has a beautiful female dog named " +name4+ " which is " +age4+ " years old.");
		System.out.println("My friend " +name+ ", is "+age+" years old.");
		System.out.println("My friend " +name1+ ", is "+age1+" years old.");
		System.out.println("My father " +name5+ ", is "+age5+" years old.");
		System.out.println("In 1960, my father " +name5+ ", was 5 years old and in 2030, he will be " +(age5 +11)+ " years old.");
		System.out.println("In 1960, my father " +name5+ ", was " +(age5-year1)+ " years old and in 2030, he will be " +(age5 + year2)+ " years old.");
	}
}