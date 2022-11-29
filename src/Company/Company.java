package Company;

import java.util.ArrayList;
import java.util.Collections;

public class Company implements Employee, Comparable<Company> {
    private ArrayList<Employee> moEmployees = new ArrayList<>();

    private int mvIncome;

    /* ���� ������ ���������� */
    public void hire(Employee ivEmployee) {
        moEmployees.add(ivEmployee);
    }

    /* ���� ������ ����������� */
    public void hireAll(Employee ivEmployee) {
        moEmployees.add(ivEmployee);
    }

    /* ���������� ���������� */
    public void fire() {

    }

    /* ��������� �������� ������ ��������
    ���������� ������������ ����� ��� �������� ����������� ��������� ������� �� 115 000 �� 140 000 ������.
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

    /* ��� ������ ��������� �����������, ��������������� �� �������� � ����������� ���������� ����� */
    public void getTopSalaryStaff(int ivCount) {
        //������������� ������ �� �������� �������
//        for (Employee employee : moEmployee) {
//            System.out.println(employee.getMonthSalary());
//        }

        //����������� ivCount
        for (int i = 0; i < ivCount; i++) {
            Employee loEmployee = moEmployees.get(i);
            if (i == 0) {
                System.out.println("������ �� " + ivCount + " ����� ������� �������:");
            }
            System.out.println(loEmployee.getMonthSalary());
        }
    }

    /* ��� ������ ��������� �����������, ��������������� �� �������� � ����������� ���������� ����� */
    public void getLowestSalaryStaff(int ivCount) {
        //������������� ������ �� ����������� �������
//        ???

        //����������� ivCount
        for (int i = 0; i < ivCount; i++) {
            Employee loEmployee = moEmployees.get(i);
            if (i == 0) {
                System.out.println("������ �� " + ivCount + " ����� ������ �������:");
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