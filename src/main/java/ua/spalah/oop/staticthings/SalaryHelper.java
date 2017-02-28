package ua.spalah.oop.staticthings;

public class SalaryHelper {

//    public static final int DEFAULT_SALARY = 100;

    public static void raiseSalary(Worker worker, int rate) {
        int oldSalary = worker.getSalary();
        int raise = oldSalary * (rate / 100);
        worker.setSalary(oldSalary + raise);
    }

    public static void setSalaryToDefault(Worker worker) {
        worker.setSalary(Worker.DEFAULT_SALARY);
    }
}
