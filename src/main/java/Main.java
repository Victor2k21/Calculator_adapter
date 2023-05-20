public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        //демонстрация
        System.out.println(calc.sum(2, 4));
        System.out.println(calc.mult(2, 4));
        System.out.println(calc.pow(4, 2));
    }
}