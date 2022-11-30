package Company;

import java.math.BigDecimal;

/*
   Каждый класс сотрудника должен имплементировать интерфейс Employee.
   В интерфейсе Employee должен быть объявлен метод, возвращающий зарплату сотрудника:
        getMonthSalary()
   Аргументы и возвращаемое значение метода выберите в соответствии с логикой начисления зарплат.
*/
public interface Employee extends Comparable<Employee> {
    void setSalary(); //Присвоение ЗП при трудоустройстве

    void setRefreshSalary(); //Обнуление ЗП при увольнении

    BigDecimal getMonthSalary(); //Вернуть ЗП сотрудника

    @Override
    default int compareTo(Employee ioEmployee) { //Сравнение по полю ЗП
        return getMonthSalary().compareTo(ioEmployee.getMonthSalary());
    }
}