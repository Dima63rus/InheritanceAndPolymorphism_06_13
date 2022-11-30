package Company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Company {
    private final List<Employee> mtEmployee = new ArrayList<>(); //Общий список сотрудников

    private BigDecimal mvIncome;

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
            mtEmployee.remove(lvEmployee); // Удаление сотрудника
        }
        System.out.println("Сотрудников после сокращения: " + mtEmployee.size());
    }

    /* получение значения дохода компании
    Количество заработанных денег компанией от 5000000.0 до 15000000.0 рублей.
    */
    public void getIncome() {
        //Округление до 2ух сотых
        mvIncome = BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble(5000000.0, 15000000.0)).setScale(2, RoundingMode.HALF_DOWN);
    }

    /* Они должны содержать сотрудников, отсортированных по убыванию и возрастанию заработной платы */
    public void getTopSalaryStaff(int ivCount) {
        Collections.sort(mtEmployee, Collections.reverseOrder());
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

    public BigDecimal getMvIncome() {
        return mvIncome;
    }
}