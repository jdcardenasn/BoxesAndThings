
package boxes.and.things;

/*
 * @author Juan
 */
public class Book implements ToBeStore{
    private String writer;
    private String name;
    private double weight;

    public double getWeight() {
        return weight;
    }
    
    public Book(String writer,String name,double weight){
        this.writer=writer;
        this.name=name;
        this.weight=weight;
    }    

    public double weight() {
        return this.weight;        
    }
    public String toString() {
        return this.writer + ": " + this.name + ".";
    }
}

