package hackerrank;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Library Structure:
 * Implement the Library structure using the following class.
 *
 * 1. Library class with the following properties
 * * Attributes
 *   - private integer attribute number_of_books
 *   - private string attribute name (library name)
 *   - private Map<String, Integer> bookGenres, map of genres to book count
 * * Public getter and setter methods
 *     ----- Getter ----
 *   - int getNumber_of_books() method
 *   - string getName() method
 *   - Map<String, Integer> getBookGenres() method
 *     ---- Setter ----
 *   - void setNumber_of_books(int number_of_books) method
 *   - void setName(string name) method
 *   - void setBookGenres(Map<String, Integer> bookGenres) method
 *
 * Note: The code stub receives input and passes it to the methods.
 */

class Library{
    private Integer number_of_books;
    private String name;
    private Map<String, Integer> bookGenres;

    public int getNumber_of_books(){
        return number_of_books;
    }
    public String getName(){
        return name;
    }
    public Map<String, Integer> getBookGenres(){
        return bookGenres;
    }

    public void setNumber_of_books(Integer number_of_books){
        this.number_of_books=number_of_books;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBookGenres(Map<String, Integer> bookGenres){
        this.bookGenres=bookGenres;
    }

}

public class LibraryStructure {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        int n = 1;  // Library instances n=1
        for(int i=0;i<n;i++){
            String name = "National Library";
            Library library = new Library();
            library.setName(name);
            System.out.println("Library with name : " + library.getName() + " is started");
            Integer numberOfBooks = 20 ; // number of books
            library.setNumber_of_books(numberOfBooks);
            System.out.println("It contains " + library.getNumber_of_books() + " books");

            Integer bookGenresCount = 2 ; // Books genres count

            Map<String, Integer> bookGenresMap = new LinkedHashMap<>();
            System.out.println("It contains books with following genres :");
            //for(int j=0; j<bookGenresCount; j++){
                bookGenresMap.put("Drama", 5);
                bookGenresMap.put("Fiction", 15);
            //}
            library.setBookGenres(bookGenresMap);
            Map<String, Integer> temp = library.getBookGenres();
            for(Map.Entry t:temp.entrySet()){
                System.out.println(t.getKey() +" "+ t.getValue());
            }

        }
    }
}
