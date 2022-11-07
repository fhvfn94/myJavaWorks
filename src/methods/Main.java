package methods;

public class Main {
    public static void main(String[] args) {
        boxWithFruits boxWithApples = new boxWithFruits("apple", "qazaq", 37);
        System.out.println("boxWithApples.getNumberOfFruits() = " + boxWithApples.getNumberOfFruits());
        boxWithApples.fillBox();
        System.out.println("boxWithApples.getNumberOfFruits() = " + boxWithApples.getNumberOfFruits());
        boxWithApples.takeFruits(10);
        System.out.println("boxWithApples.getNumberOfFruits() = " + boxWithApples.getNumberOfFruits());
    }
}
