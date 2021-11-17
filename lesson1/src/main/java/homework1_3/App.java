package homework1_3;

public class App {
    public static void main(String[] args) {
       who(new Square());
       who(new Triangle());
       who(new Circle());
    }
    static void who(Figure figure){
        figure.IAm();
    }
}

    interface Figure {
        void IAm();
    }
     class Square implements Figure {

        @Override
        public void IAm() {
            System.out.println("я квадрат");
        }
    }

    class Triangle implements Figure {

        @Override
        public void IAm() {
            System.out.println("я треугольник");
        }
    }

    class Circle implements Figure {

        @Override
        public void IAm() {
            System.out.println("я круг");
        }
    }
