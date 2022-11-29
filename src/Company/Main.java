package Company;

public class Main {
    public static void main(String[] args) {
        //������� ��������
        Company loCompany = new Company();

        //������� � ��������:
        // 180 ���������� Operator
        for (int i = 1; i <= 180; i++) {
            Operator loOperator = new Operator(i, loCompany);
            loCompany.hireAll(loOperator);
        }

        // 80 ���������� �� �������� Manager
        for (int i = 1; i <= 80; i++) {
            Manager loManager = new Manager(i, loCompany);
            loCompany.hireAll(loManager);
        }

        // 10 ���-���������� TopManager
        for (int i = 1; i <= 10; i++) {
            TopManager loTopManager = new TopManager(i, loCompany);
            loCompany.hireAll(loTopManager);
        }

        //������������� ������
        loCompany.sort();

        //���������� ������������ ����� ��������� �� 5000000 �� 15000000
        loCompany.getIncome();

//        Test �������� ��������� ������� ������������
//        Operator loOperator = new Operator(300, loCompany);
//        int lvSalary = loOperator.getMonthSalary();
//
//        Manager loManager = new Manager(300, loCompany);
//        lvSalary = loManager.getMonthSalary();
//
//        TopManager loTopManager = new TopManager(300, loCompany);
//        int lvSalary = loTopManager.getMonthSalary();

        //������������ ������ �� 10�15 ����� ������� ������� � ��������.
        loCompany.getTopSalaryStaff(10);

        //������������ ������ �� 30 ����� ������ ������� � ��������.
        loCompany.getLowestSalaryStaff(30);

        //������� 50% �����������.
//        loCompany.fire();
    }
}
