package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }

    public Flower() {
        this.sepalLength = 0;
        this.color = FlowerColor.RED;
        this.price = 0;
        this.flowerType = FlowerType.ROSE;
    }

    public Flower(double sepalLength, FlowerColor color, 
    double price, FlowerType flowerType) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = flowerType;
    }

    public static Flower Rose() {
        Flower flower = new Flower();
        flower.sepalLength = 10;
        flower.color = FlowerColor.RED;
        flower.price = 100;
        flower.flowerType = FlowerType.ROSE;
        return flower;
    }
    public static Flower Rose(double sepalLength, FlowerColor color, 
    double price) {
        Flower flower = new Flower();
        flower.sepalLength = sepalLength;
        flower.color = color;
        flower.price = price;
        flower.flowerType = FlowerType.ROSE;
        return flower;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() 
        + " [Sepal Length: " + sepalLength
        + ", Color: " + color + ", Price: $" + price + "]";
    }
}
