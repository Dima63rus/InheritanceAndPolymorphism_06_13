package Company;

public class Main {
    public static void main(String[] args) {
        //Создать компанию
        Company loCompany = new Company();

        //Наймите в компанию:
        // 180 операторов Operator
        for (int i = 1; i <= 180; i++) {
            Operator loOperator = new Operator(i, loCompany);
            loCompany.hireAll(loOperator);
        }

        // 80 менеджеров по продажам Manager
        for (int i = 1; i <= 80; i++) {
            Manager loManager = new Manager(i, loCompany);
            loCompany.hireAll(loManager);
        }

        // 10 топ-менеджеров TopManager
        for (int i = 1; i <= 10; i++) {
            TopManager loTopManager = new TopManager(i, loCompany);
            loCompany.hireAll(loTopManager);
        }

        //Отсортировать массив
        loCompany.sort();

        //Количество заработанных денег компанией от 5000000 до 15000000
        loCompany.getIncome();

//        Test Проверка получения зарплат сотрудниками
//        Operator loOperator = new Operator(300, loCompany);
//        int lvSalary = loOperator.getMonthSalary();
//
//        Manager loManager = new Manager(300, loCompany);
//        lvSalary = loManager.getMonthSalary();
//
//        TopManager loTopManager = new TopManager(300, loCompany);
//        int lvSalary = loTopManager.getMonthSalary();

        //Распечатайте список из 10–15 самых высоких зарплат в компании.
        loCompany.getTopSalaryStaff(10);

        //Распечатайте список из 30 самых низких зарплат в компании.
        loCompany.getLowestSalaryStaff(30);

        //Увольте 50% сотрудников.
//        loCompany.fire();
    }
}
