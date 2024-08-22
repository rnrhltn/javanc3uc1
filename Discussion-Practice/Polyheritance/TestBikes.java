package Polyheritance;

public class TestBikes {
    public static void main(String[] args){
        Bicycle bike1, bike2, bike3, bike4;
        
        bike1 = new Bicycle(2, 5, 1);
        bike2 = new MountainBike(47, 10, 10, 10);
        bike3 = new MountainBike2(50, 20, 30, " Dual");
        bike4 = new RoadBike(50, 20, 30, 20);
        
        bike1.printDescription();
        bike2.printDescription();
        bike3.printDescription();
        bike4.printDescription();
        
    }
}
