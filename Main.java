public class Main {
    public static void main(String[] args) {

        Employee w1 = new Employee("yakup", 3000, 45, 2002);
        Employee w2 = new Employee("Ayse", 1000, 35, 2015);

        w1.tax();
        w2.tax();

        w1.bonus();
        w2.bonus();

        w1.raiseSalary();
        w2.raiseSalary();


        w1.toprint();
        w2.toprint();
    }
}
