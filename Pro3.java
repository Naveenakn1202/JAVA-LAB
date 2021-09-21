import java.util.*;
public class Pro3 {
 public static void main(String[] args) {
 int num;
 Scanner input=new Scanner(System.in);
 System.out.println("Enter the number of books");
 num=input.nextInt();
 Book[] b=new Book[num];
 for(int i=0;i<num;i++) {
 input.nextLine();
 System.out.println("Enter the Book Name, Author, Price & Pages ");
 b[i]=new Book(input.nextLine(),input.nextLine(),input.nextDouble(),input.nextInt());
 }
 for(int i=0;i<num;i++) {
 System.out.println("\n**Book Description**\n"+b[i].toString());
 }
 }
}
class Book{
 private String name;
 private String author;
 private double price;
 private int numPages;

 Book(String name,String author,double price,int num){
 this.name=name;
 this.author=author;
 this.price=price;
 this.numPages=num;
 }
 public String getName() {
 return name;
 }
 public String getAuthor() {
 return author;
 }
 public double getPrice() {
 return price;
 }
 public int getNumPages() {
 return numPages;
 }
 public String toString() {
 return "Name of the Book: "+getName()+"\nName of the author: "+getAuthor()+"\nPrice of the book:
"+getPrice()+"\nNo. of pages: "+getNumPages()+"\n";
 }

}