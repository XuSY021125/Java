package Ticket;

import java.util.ArrayList;

public class Tourist {
    private String name;
    private double banlance;
    private ArrayList<Entertainment> ordered = new ArrayList<>();

    public Tourist(String name, double banlance){
        this.name = name;
        this.banlance = banlance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBanlance() {
        return banlance;
    }

    public void setBanlance(double banlance) {
        this.banlance = banlance;
    }

    public ArrayList<Entertainment> getOrdered() {
        return ordered;
    }

    public void setOrdered(Entertainment entertainment) {
        ordered.add(entertainment);
    }

    public String toString() {
        return "{" + "name='" + name + ", banlance=" + banlance + ", ordered=" + ordered + '}';
    }
}
