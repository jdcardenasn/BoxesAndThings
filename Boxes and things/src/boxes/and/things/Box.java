
package boxes.and.things;

import java.util.ArrayList;

/*
 * @author Juan
 */
public class Box implements ToBeStore{
    private ArrayList<Book> stored1;
    private ArrayList<CD> stored2;

    double weight=0;

    public Box(double maxWeight) {        
    }
    
    @Override
    public double weight() {
       return weight;
    }

    void add(Book book) {
    }
    
    void add(CD cd){        
    }
   }
