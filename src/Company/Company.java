package Company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Company {
    private List<Employee> mtEmployee = new ArrayList<>(); //����� ������ �����������

    private int mvIncome;

    /* ���� ������ ���������� */
    public void hire(Employee ivEmployee) {
        mtEmployee.add(ivEmployee);
    }

    /* ���� ������ ����������� */
    public void hireAll(Employee ivEmployee) {
        mtEmployee.add(ivEmployee);
        //��������� ��������
        ivEmployee.setSalary();
    }

    /* ���������� ���������� */
    public void fire() {
        int lvStartCount = mtEmployee.size();
        int lvEndCount = mtEmployee.size() / 2;

        System.out.println("����������� �� ����������: " + mtEmployee.size());
        for (int i = lvStartCount; i > lvEndCount; i--) {
            Employee lvEmployee = mtEmployee.get(ThreadLocalRandom.current().nextInt(0, i - 1));
            lvEmployee.setRefreshSalary(); // ��������� ��
            mtEmployee.remove(i - 1); // �������� ����������
        }
        System.out.println("����������� ����� ����������: " + mtEmployee.size());
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
        Collections.sort(mtEmployee, Collections.<Employee>reverseOrder());
        System.out.println("������������� ������ �� �������� �������: ");
        //������������� ������ �� �������� �������
        for (Employee employee : mtEmployee) {
            System.out.println(employee.getMonthSalary());
        }
    }

    /* ��� ������ ��������� �����������, ��������������� �� �������� � ����������� ���������� ����� */
    public void getLowestSalaryStaff(int ivCount) {
        //������������� ������ �� ����������� �������
        Collections.sort(mtEmployee);

        System.out.println("������������� ������ �� ����������� �������: ");
        for (Employee employee : mtEmployee) {
            System.out.println(employee.getMonthSalary());
        }
    }

    public int getMvIncome() {
        return mvIncome;
    }
}