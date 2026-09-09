public class App {

    public static void main(String[] args) throws Exception {
        Punto mate = new Punto();
        System.out.println(mate.getX());
        System.out.println(mate.getY());
        System.out.println(mate.modulo());
        mate.setX(2);
        mate.setY(3);
        System.out.println(mate.getX());
        System.out.println(mate.getY());
        System.out.println(mate.modulo());
        Punto parte = new Punto(2,3);
        System.out.println(parte.getX());
        System.out.println(parte.getY());
        System.out.println(parte.modulo());
        parte.setX(5);
        parte.setY(5);
        System.out.println(parte.getX());
        System.out.println(parte.getY());
        System.out.println(parte.modulo());
    }
    
}
