package homework9;

import java.util.ArrayList;
import java.util.Scanner;

interface Comarable {
    Book compareTo(Book First, Book Second);
}

class Book implements Comarable {
    public String name;
    public double price;

    Book() {                 
    }

    Book(String name, double price) {  
        this.name = name;
        this.price = price;
    }

    public Book compareTo(Book First, Book Second) {   
        if (First.price != Second.price) {
            return null;
        }
        return Second;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input several Book,in the end #");
        ArrayList<Book> books = new ArrayList<Book>();       
        for (String str = retin(in); !str.equals("#"); str = retin(in)) {   
            String[] s = str.split("\\,");                    
            Book book = new Book(s[0], Double.valueOf(s[1]));        
            books.add(book);                                        
        }
        System.out.println("input a new Book:");
        String ss = in.nextLine();
        String[] s = ss.split("\\,");
        Book Nbook = new Book(s[0], Double.valueOf(s[1]));
        Book book = new Book();
        System.out.println("new book:<" + Nbook.name + ">as same books");
        for (int a = 0; a < books.size(); a++) {
            if (book.compareTo(books.get(a), Nbook) == Nbook) {    
                System.out.println(books.get(a).name + "," + books.get(a).price);
            }
        }
    }

    public static String retin(Scanner in) {
        String str = in.nextLine();
        return str;
    }
}
