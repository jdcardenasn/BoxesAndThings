package boxes.and.things;

/*
 * @author Juan
 */
public class CD implements ToBeStore {
    private String artist;
    private String title;
    private int year;
    
    public CD(String artist,String title,int year){
        this.artist=artist;
        this.title=title;
        this.year=year;
    }
       
    public double weight() {
        double weight=0.1;
        return weight;
    }
    public String toString() {
        return this.artist + ":"+this.title+ "(" + this.year + ")";
    }
}
