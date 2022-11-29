package Company;

public class Main {
    public static void main(String[] args) {
        //������� ��������
        Company loCompany = new Company();

        //���������� ������������ ����� ��������� �� 5000000 �� 15000000
        loCompany.getIncome();

        //������� � ��������:
        // 180 ���������� Operator
        for (int i = 1; i <= 180; i++) {
            Employee loEmployee = new Operator(i, loCompany);
            loCompany.hireAll(loEmployee);
        }

        // 80 ���������� �� �������� Manager
        for (int i = 1; i <= 80; i++) {
            Employee loEmployee = new Manager(i, loCompany);
            loCompany.hireAll(loEmployee);
        }

        // 10 ���-���������� TopManager
        for (int i = 1; i <= 10; i++) {
            Employee loEmployee = new TopManager(i, loCompany);
            loCompany.hireAll(loEmployee);
        }


        //Test �������� ��������� ������� ������������
//        Operator loOperator = new Operator(300, loCompany);
//        int lvSalary = loOperator.getMonthSalary();

//        Manager loManager = new Manager(300, loCompany);
//        lvSalary = loManager.getMonthSalary();
//
//        TopManager loTopManager = new TopManager(300, loCompany);
//        int lvSalary = loTopManager.getMonthSalary();

        //������������ ������ �� 10�15 ����� ������� ������� � ��������.
        loCompany.getTopSalaryStaff(10);
        System.out.print("\n"); // ������� ������

        //������������ ������ �� 30 ����� ������ ������� � ��������.
        loCompany.getLowestSalaryStaff(30);
        System.out.print("\n"); // ������� ������

        //������� 50% �����������.
        System.out.println("���������� �����������.");
        loCompany.fire();

        //������������ ������ �� 10�15 ����� ������� ������� � ��������.
        loCompany.getTopSalaryStaff(10);
        System.out.print("\n"); // ������� ������

        //������������ ������ �� 30 ����� ������ ������� � ��������.
        loCompany.getLowestSalaryStaff(30);
        System.out.print("\n"); // ������� ������
    }
}
