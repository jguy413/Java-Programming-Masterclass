public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall(5, 4);

        System.out.println("area= " + wall1.getArea());

        wall1.setHeight(-1.5);
        System.out.println("width= " + wall1.getWidth());
        System.out.println("height= " + wall1.getHeight());
        System.out.println("area=" + wall1.getArea());


    }


}
