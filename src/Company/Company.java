package Company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Company {
    private List<Employee> mtEmployee = new ArrayList<>(); //Общий список сотрудников

    private int mvIncome;

    /* найм одного сотрудника */
    public void hire(Employee ivEmployee) {
        mtEmployee.add(ivEmployee);
    }

    /* найм списка сотрудников */
    public void hireAll(Employee ivEmployee) {
        mtEmployee.add(ivEmployee);
        //Назначить зарплату
        ivEmployee.setSalary();
    }

    /* увольнение сотрудника */
    public void fire() {
        int lvStartCount = mtEmployee.size();
        int lvEndCount = mtEmployee.size() / 2;

        System.out.println("Сотрудников до сокращения: " + mtEmployee.size());
        for (int i = lvStartCount; i > lvEndCount; i--) {
            Employee lvEmployee = mtEmployee.get(ThreadLocalRandom.current().nextInt(0, i - 1));
            lvEmployee.setRefreshSalary(); // Обнуление ЗП
            mtEmployee.remove(i - 1); // Удаление сотрудника
        }
        System.out.println("Сотрудников после сокращения: " + mtEmployee.size());
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
        Collections.sort(mtEmployee, Collections.<Employee>reverseOrder());
        System.out.println("Отсортировать список по убыванию зарплат: ");
        //Отсортировать список по убыванию зарплат
        for (Employee employee : mtEmployee) {
            System.out.println(employee.getMonthSalary());
        }
    }

    /* Они должны содержать сотрудников, отсортированных по убыванию и возрастанию заработной платы */
    public void getLowestSalaryStaff(int ivCount) {
        //Отсортировать список по возрастанию зарплат
        Collections.sort(mtEmployee);

        System.out.println("Отсортировать список по возрастанию зарплат: ");
        for (Employee employee : mtEmployee) {
            System.out.println(employee.getMonthSalary());
        }
    }

    public int getMvIncome() {
        return mvIncome;
    }
}