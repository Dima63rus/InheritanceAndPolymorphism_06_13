package Company;

import java.util.ArrayList;
import java.util.Collections;

public class Company implements Employee, Comparable<Company> {
    private ArrayList<Employee> moEmployees = new ArrayList<>();

    private int mvIncome;

    /* найм одного сотрудника */
    public void hire(Employee ivEmployee) {
        moEmployees.add(ivEmployee);
    }

    /* найм списка сотрудников */
    public void hireAll(Employee ivEmployee) {
        moEmployees.add(ivEmployee);
    }

    /* увольнение сотрудника */
    public void fire() {

    }

    /* получение значения дохода компании
    Количество заработанных денег для компании генерируйте случайным образом от 115 000 до 140 000 рублей.
    */
    public void getIncome() {
        final int LC_MIN_INCOME = 5000000;
        final int LC_MAX_INCOME = 15000000;
        mvIncome = rnd(LC_MIN_INCOME, LC_MAX_INCOME);
    }

    public int rnd(int ivMinIncome, int ivMaxIncome) {
        ivMaxIncome -= ivMinIncome;
        return (int) (Math.random() * ++ivMaxIncome) + ivMinIncome;
    }

    /* Они должны содержать сотрудников, отсортированных по убыванию и возрастанию заработной платы */
    public void getTopSalaryStaff(int ivCount) {
        //Отсортировать список по убыванию зарплат
//        for (Employee employee : moEmployee) {
//            System.out.println(employee.getMonthSalary());
//        }

        //Распечатать ivCount
        for (int i = 0; i < ivCount; i++) {
            Employee loEmployee = moEmployees.get(i);
            if (i == 0) {
                System.out.println("Список из " + ivCount + " самых высоких зарплат:");
            }
            System.out.println(loEmployee.getMonthSalary());
        }
    }

    /* Они должны содержать сотрудников, отсортированных по убыванию и возрастанию заработной платы */
    public void getLowestSalaryStaff(int ivCount) {
        //Отсортировать список по возрастанию зарплат
//        ???

        //Распечатать ivCount
        for (int i = 0; i < ivCount; i++) {
            Employee loEmployee = moEmployees.get(i);
            if (i == 0) {
                System.out.println("Список из " + ivCount + " самых низких зарплат:");
            }
            System.out.println(loEmployee.getMonthSalary());
        }
    }

    @Override
    public int getMonthSalary() {
        return 0;
    }

    public int getMvIncome() {
        return mvIncome;
    }

    @Override
    public int compareTo(Company ioCompany) {
        if (getMonthSalary() > ioCompany.getMonthSalary()) {
            return 1;
        }
        if (getMonthSalary() < ioCompany.getMonthSalary()) {
            return -1;
        }
        return 0;
    }

    public void sort() {
//        Collections.sort(moEmployees);
    }
}