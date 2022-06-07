
import java.util.Scanner;


class Choice{
	public void note() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		automobiles a= new automobiles();
		Electronics e = new Electronics();
		clothing c = new clothing();
		House_hold_items h = new House_hold_items();
		System.out.println("Available categories are : ");
		System.out.println('\t'+"1.Automobile"+'\n'+'\t'+"2.Electronics gadgets"+'\n'+'\t'+"3.Clothing  "+'\n'+'\t'+"4.House Hold Items ");
		System.out.println("Enter your choice : ");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("welcome to world of automobiles : ");
			a.list();
			
		}
		else if(choice ==2) {
			System.out.println("welcome to world of Electroics : ");
			e.list();
			
		}
		else if(choice==3) {
			System.out.println("welcome to world of Clothing : ");
			c.list();
		}
		else {
			System.out.println("Welcome to world of Home appliances");
			h.list();
		}
	}
}
//class automobiles 
class automobiles{
	payment p = new payment();
	Scanner sc = new Scanner(System.in);
	int cus_choice=0;
	void list() throws InterruptedException {
		System.out.println("The Products we have : ");
		System.out.println('\t'+"1.TATA -Safari"+'\n'+'\t'+"2.TOYATA-Innova"+'\n'+'\t'+"3.SUZUKI-Brezza");
		System.out.println("which one do you like ?");
		cus_choice=sc.nextInt();
		choice(cus_choice);
		
	}
	void choice(int cus_choice) throws InterruptedException {
		
		if(cus_choice==1) {
			System.out.println("The Product Details are : ");
			System.out.println('\t'+"Brand: TATA"+'\n'+'\t'+"Product Name: Safari"+'\n'+'\t'+"color: Red"+'\n'+'\t'+"Max Speed: 200KMPH"+'\n'+'\t'+"cost:10,00,000INR"
					+'\n'+'\t'+"Fuel : diesel");
		}
		else if(cus_choice==2) {
			System.out.println("The Product Details are : ");
			System.out.println('\t'+"Brand: TOYOTA"+'\n'+'\t'+"Product Name: Innova"+'\n'+'\t'+"color: White"+'\n'+'\t'+"Max Speed: 200KMPH"+'\n'+'\t'+"cost:15,00,000INR"
					+'\n'+'\t'+"Fuel : diesel");
		}
		else if(cus_choice==3){
			System.out.println("The Product Details are : ");
			System.out.println('\t'+"Brand: SUZUKI"+'\n'+'\t'+"Product Name: Brezza"+'\n'+'\t'+"color: Blue"+'\n'+'\t'+"Max Speed: 150KMPH"+'\n'+'\t'+"cost:12,00,000INR"
					+'\n'+'\t'+"Fuel : petrol");
		}
		else {
			System.out.println("choose the correct option ");
		}
		System.out.println("if you want to purchase please press 1 else press any number ?");
		int s1=sc.nextInt();
		if(s1==1) {
			p.payment();
		}
		else {
			System.out.println("Thank you for Visiting GQT ");
		}
	}
	
}
//class Electronics
class Electronics extends automobiles{
	int cus_choice=0;
	@Override
	void list() throws InterruptedException {
		System.out.println("The Products we have : ");
		System.out.println('\t'+"1.Redmi-Note-8-pro"+'\n'+'\t'+"2.HP PAVILION"+'\n'+'\t'+"3.LENOVO TAB M10");
		System.out.println("which one do you like ?");
		cus_choice=sc.nextInt();
		choice(cus_choice);
	}
	@Override
	void choice(int choice) throws InterruptedException {
		
		if(cus_choice==1) {
			System.out.println("The Product Details are : ");
			System.out.println('\t'+"Brand: MI"+'\n'+'\t'+"Product Name: Redmi Note 8 Pro"+'\n'+'\t'+"Battery : 5000MaH"+'\n'+'\t'+"color: Black"+'\n'+'\t'+"cost:10,000INR");
		}
		
		else if(cus_choice==2) {
			System.out.println("The Product Details are : ");
			System.out.println('\t'+"Brand: HP"+'\n'+'\t'+"Product Name: Pavilion"+'\n'+'\t'+"color: Silver"+'\n'+'\t'+"Processor: i7"+'\n'+'\t'+"Generation : 11th Gen"+'\n'+'\t'+"cost:1,00,000INR");
		}
		
		else if(cus_choice==3){
			System.out.println("The Product Details are : ");
			System.out.println('\t'+"Brand: LENOVO"+'\n'+'\t'+"Product Name: Tab M10"+'\n'+'\t'+"color: Blue"+'\n'+'\t'+"Battery: 3400MaH"+'\n'+'\t'+"cost:1,00,000INR");
		}
		else {
			System.out.println("Choose the correct option ");
		}
		System.out.println("if you want to purchase please press 1 else press any number ?");
		int s1=sc.nextInt();
		if(s1==1) {
			p.payment();
		}
		else {
			System.out.println("Thank you for Visiting GQT ");
		}
	}
	
	
}
//class clothing
class clothing extends Electronics {
	int cus_choice=0;
	@Override
	void list() throws InterruptedException{
		System.out.println("The Products we have : ");
		System.out.println('\t'+"1.A pair of Ton-jeans"+'\n'+'\t'+"2.A pair of saree and blouse"+'\n'+'\t'+"3.Jeans and T-shirt"+'\n');
		System.out.println("which one do you like sir ?");
		cus_choice=sc.nextInt();
		choice(cus_choice);
	}
	@Override
	void choice(int cus_choice) throws InterruptedException{
		if(cus_choice==1) {
			System.out.println("The Product Details are : ");
			System.out.println('\t'+"Brand : Ton"+'\n'+'\t'+"cost: 1800INR"+'\n'+'\t'+"color : Black and White");
		}
		else if(cus_choice==2) {
			System.out.println("The Product Details are : ");
			System.out.println('\t'+"Brand : Kanchi Pattu "+'\n'+'\t'+"cost: 15000INR"+'\n'+'\t'+"color : Pink");
		}
		else if(cus_choice==3){
			System.out.println("The Product Details are : ");
			System.out.println("Brand : Allen Solly "+'\n'+"cost: 1500INR"+'\n'+"color : Blue and Black");
		}
		else {
			System.out.println("choose the right option ");
		}
		System.out.println("if you want to purchase please press 1 else press any number ?");
		int s1=sc.nextInt();
		if(s1==1) {
			p.payment();
		}
		else {
			System.out.println("Thank you for Visiting GQT ");
		}
	}
	
}
//class house hold
class House_hold_items extends Electronics {
	int cus_choice=0;
	@Override
	void list() throws InterruptedException{
		System.out.println("The Products we have : ");
		System.out.println('\t'+"1.Refrigerator"+'\n'+'\t'+"2.Micro-Oven"+'\n'+'\t'+"3.Washing Machine"+'\n');
		System.out.println("which one do you like ?");
		cus_choice=sc.nextInt();
		choice(cus_choice);
	}
	@Override
	void choice(int cus_choice) throws InterruptedException{
		if(cus_choice==1) {
			System.out.println("The Product Details are : ");
			System.out.println('\t'+"Brand: LG"+'\n'+'\t'+"Product Name: Refigerator"+'\n'+'\t'+"color: violet"+'\n'+'\t'+"Inbuilt Functions:10 "+'\n'+'\t'+"cost:30000");
			
		}
		else if(cus_choice==2) {
			System.out.println("The Product Details are : ");
			System.out.println('\t'+"Brand: LG"+'\n'+'\t'+"Product Name: Micro-oven"+'\n'+'\t'+"color: black"+'\n'+'\t'+"Inbuilt Functions:120 "+'\n'+'\t'+"cost:16000");
			
		}
		else if(cus_choice==3){
			System.out.println("The Product Details are : ");
			System.out.println('\t'+"Brand: LG"+'\n'+'\t'+"Product Name: Washing Machine"+'\n'+'\t'+"color: Blue"+'\n'+'\t'+"Inbuilt Functions:15 "+'\n'+'\t'+"cost:15000");
		}
		else {
			System.out.println("Choose the right option ");
		}
		System.out.println("if you want to purchase please press 1 else press any number ?");
		int s1=sc.nextInt();
		if(s1==1) {
			p.payment();
		}
		else {
			System.out.println("Thank you for Visiting GQT ");
		}
		
	}
	
	
}
class payment{
	void payment() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which type of payment you want to make payment "+'\n'+'\t'+"1: Credit Card"+'\n'+'\t'+"2:UPI"+'\n'+'\t'+"3.Internet Banking"+'\n'
	+'\t'+"4. COD ");
		int s1=sc.nextInt();
		if(s1==1) {
			System.out.println("Enter you Credit Card Number: ");
			long cno=sc.nextLong();
			System.out.println("Enter Expiry Date: ");
			int date=sc.nextInt();
			System.out.println("Enter CVV : ");
			int cvv= sc.nextInt();
			
			System.out.print("Your payment processing");
			for(int i =0;i<3;i++) {
				System.out.print(".");
				Thread.sleep(2000);
			}
			System.out.println();
			System.out.println("Your payment Accepted sir");
			
			
		}
		else if(s1==2) {
			System.out.println("Enter your UPI ID : ");
			String upi= sc.next();
			System.out.print("Your payment processing");
			for(int i =0;i<3;i++) {
				System.out.print(".");
				Thread.sleep(2000);
			}
			System.out.println();
			System.out.println("Your payment Accepted sir");
			
		}
		else if(s1==3) {
			System.out.println("Enter the name of the Bank : ");
			String bank= sc.next();
			System.out.println("Enter you Banking Id : ");
			int bid = sc.nextInt();
			System.out.println("Enter the Password : ");
			String pwd= sc.next();
			for(int i =0;i<3;i++) {
				System.out.print(".");
				Thread.sleep(2000);
			}
			System.out.println();
			System.out.println("Your payment Accepted sir");
		}
		else if(s1==4) {
			
			System.out.println(" You can pay at delivery : ");
		}
	
		
	}
	
}
public class shopping_mall {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Choice c = new Choice();
		Scanner sc = new Scanner(System.in);
		
		System.out.println('\t'+"!*!*!*!*!*!*!*!!*!! Welcome to GQT shopping Mart !!*!!*!*!*!*!*!*!");
		System.out.println(" ");
		c.note();
		while (true) {
            System.out.print("Continue Shopping?  y/n: ");
            String sh = sc.next();

            if (sh.equalsIgnoreCase("y")) {
                c.note();
            } else if (sh.equalsIgnoreCase("n")) {
                System.out.println("Thank you for shopping at GQT");
                break;
            } else {
                System.out.println("Choose the right option.");
            }
        }
	}
	
}

