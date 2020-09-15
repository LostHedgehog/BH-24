package BY.BELHARD.BH24.HW.HW05.TASK3;

        /* Есть 3 класса – Прямоугольник, Квадрат, Круг (создать их).
        Дополнить классы необходимыми полями и создать на их основе иерархию классов
        (то есть кто-то от кого-то должен наследоваться, при необходимости можно создавать дополнительные классы и интерфейсы).
        Создать класс CalculationUtils, в котором должны быть методы,
        принимающие любую фигуру и возвращающие ее а) площадь б) периметр. */



public class CalculationUtils {



    public static void main(String[] args) {

        Figure f1 = new Circle(5.0);
        Figure f2 = new Square(10.0);
        Figure f3 = new rectangle(5.0, 8.0);


        calculateLength(f1);
        calculateLength(f2);
        calculateLength(f3);
        calculateSquare(f1);
        calculateSquare(f2);
        calculateSquare(f3);
    }



        public static void calculateLength(Figure figure) {
            if (figure instanceof Circle) {
                double zzz = 2 * Math.PI * ((Circle) figure).getRadius();
                System.out.println("Длина окружности равна" + zzz);
            } else if (figure instanceof Square) {
                double xxx = 4 * ((Square) figure).getSide();
                System.out.println("Периметр квадрата равен " + xxx);
            } else if (figure instanceof rectangle) {
                double yyy = 2 * (((rectangle) figure).getSideA() + ((rectangle) figure).getSideB());
                System.out.println("Периметр прямоугольника равен " + yyy);

            }
        }

            public static void calculateSquare(Figure figure){
                if (figure instanceof Circle){
                    double zzz = Math.PI*((Circle) figure).getRadius()*((Circle) figure).getRadius();
                    System.out.println("Площадь круга равна " + zzz);}
                else if (figure instanceof Square){
                    double xxx = ((Square) figure).getSide() * ((Square) figure).getSide();
                    System.out.println("Площадь квадрата равна " + xxx);}
                else if (figure instanceof rectangle){
                    double yyy = ((rectangle) figure).getSideA() * ((rectangle) figure).getSideB();
                    System.out.println("Площадь прямоугольника равна " + yyy);

                }


        }













}
