package boxes.and.things;

import java.util.ArrayList;

/*
 * @author Juan
 */
public final class Box implements ToBeStore {

    private ArrayList<ToBeStore> stored;
    private double maxWeight;
    private double totalWeight;

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Box(double maxWeight) {
        this.stored = new ArrayList<>();
        setMaxWeight(maxWeight);
    }

    public void add(ToBeStore item) {
        if (totalWeight + item.weight() <= maxWeight) {
            totalWeight = totalWeight + item.weight();
            stored.add(item);
        }
       // System.out.println(totalWeight);
    }

    @Override
    public double weight() {
        return totalWeight;
    }

    public String toString() {
        return ("Box: " + stored.size() + " things, total weight: " + this.weight() + " kg.");
    }
}
