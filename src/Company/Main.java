package Company;

public class Main {
    public static void main(String[] args) {
        //Создать компанию
        Company loCompany = new Company();

        //Количество заработанных денег компанией от 5000000 до 15000000
        loCompany.getIncome();

        //Наймите в компанию:
        // 180 операторов Operator
        for (int i = 1; i <= 180; i++) {
            Employee loEmployee = new Operator(i, loCompany);
            loCompany.hireAll(loEmployee);
        }

        // 80 менеджеров по продажам Manager
        for (int i = 1; i <= 80; i++) {
            Employee loEmployee = new Manager(i, loCompany);
            loCompany.hireAll(loEmployee);
        }

        // 10 топ-менеджеров TopManager
        for (int i = 1; i <= 10; i++) {
            Employee loEmployee = new TopManager(i, loCompany);
            loCompany.hireAll(loEmployee);
        }


        //Test Проверка получения зарплат сотрудниками
//        Operator loOperator = new Operator(300, loCompany);
//        int lvSalary = loOperator.getMonthSalary();

//        Manager loManager = new Manager(300, loCompany);
//        lvSalary = loManager.getMonthSalary();
//
//        TopManager loTopManager = new TopManager(300, loCompany);
//        int lvSalary = loTopManager.getMonthSalary();

        //Распечатайте список из 10–15 самых высоких зарплат в компании.
        loCompany.getTopSalaryStaff(10);
        System.out.print("\n"); // Пропуск строки

        //Распечатайте список из 30 самых низких зарплат в компании.
        loCompany.getLowestSalaryStaff(30);
        System.out.print("\n"); // Пропуск строки

        //Увольте 50% сотрудников.
        System.out.println("Увольнение сотрудников.");
        loCompany.fire();

        //Распечатайте список из 10–15 самых высоких зарплат в компании.
        loCompany.getTopSalaryStaff(10);
        System.out.print("\n"); // Пропуск строки

        //Распечатайте список из 30 самых низких зарплат в компании.
        loCompany.getLowestSalaryStaff(30);
        System.out.print("\n"); // Пропуск строки
    }
}
