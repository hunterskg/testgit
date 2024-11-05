
public class Crow {

    private String origin;
    private int weight;

    public Crow() {
    }

    public Crow(String origin, int weight) {
        this.origin = origin;
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight+2;
    }

    public String getOrigin() {
        return origin+weight;
    }

    public int getWeight() {
        return weight;
    }

}
