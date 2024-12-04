class Flower {
    String FlowerName ;
    int FlowerPetals;
    float price;

    public Flower(String FlowerName, int FlowerPetals, float price) {
        this.FlowerName = FlowerName;
        this.FlowerPetals = FlowerPetals;
        this.price = price;
    }

    public String getFlowerName() {
        return FlowerName;
    }

    public void setFlowerName(String FlowerName) {
        this.FlowerName = FlowerName;
    }

    public int getFlowerPetals() {
        return FlowerPetals;
    }

    public void setFlowerPetals(int FlowerPetals) {
        this.FlowerPetals = FlowerPetals;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" + "FlowerName=" + FlowerName + ", FlowerPetals=" + FlowerPetals + ", price=" + price + '}';
    }


}
public class Q17 {
    public static void main(String[] args) {
        Flower flower = new Flower("Rose", 30, 2.99f);
        System.out.println(flower);
    }}
