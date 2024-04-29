package Question3;

class Main {
    public static void main(String[] args) {
        InterfaceExample example = new InterfaceExample();

        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);

        double totalArea = example.getTotalArea(shapes);
        System.out.println("Total area: " + totalArea);
    }
}