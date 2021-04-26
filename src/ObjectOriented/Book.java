/*
 Write a program to create a class Book with the following
- attributes: -isbn, title, author, price
 - methods :
 i. Initialize the data members through parameterized constructor
 ii. displaydetails() to display the details of the book
 iii. discountedprice() : pass the discount percent, calculate the discount on price and find
the amount to be paid after discount
 - task :
 Create an object book, initialize the book and display the details along with the discounted
price
 */

package ObjectOriented;

public class Book {
	int isbn;
	String title;
	String author;
	float price;
	
	public Book(int isbn, String title, String author, float price) {
		this.isbn=isbn;
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	public void displaydetails() {
		System.out.println("ISBN of Book : "+ isbn);
		System.out.println("Tiltle of Book : "+ title);
		System.out.println("Author of Book : "+ author);
		System.out.println("price of Book : "+ isbn);
		
	}
	
	public void discountedprice(float discountpercent) {
		float discountAmount;float amount;
		discountAmount=(discountpercent/100)*price;
		amount=price-discountAmount;
		System.out.println("Discount on price : "+ discountAmount);
		System.out.println("Amount to be paid after discount : "+(int) amount);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book myBook=new Book(123456,"Rich Dad poor Dad", "Robert T Kiyosaki",499);
		myBook.displaydetails();
        myBook.discountedprice(12);
	}

}
