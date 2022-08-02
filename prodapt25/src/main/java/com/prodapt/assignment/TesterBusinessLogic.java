package com.prodapt.assignment;

public class TesterBusinessLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessLogic bl1=new BusinessLogic();
		
		bl1.addBooks(); 
		
		System.out.println("\nAfter Adding the Books ");
		bl1.displayBooks(); 
		
		bl1.updateBooks(3,401,"Hamlet","William Shakespeare"); 
		
		System.out.println("\nAfter Updating the book ");
		bl1.displayBooks();
		
		bl1.deleteBook(4);
		
		System.out.println("\nAfter Deleting the book ");
		bl1.displayBooks();
		
		}

}


