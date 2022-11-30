package Company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Company {
    private final List<Employee> mtEmployee = new ArrayList<>(); //����� ������ �����������

    private BigDecimal mvIncome;

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
            mtEmployee.remove(lvEmployee); // �������� ����������
        }
        System.out.println("����������� ����� ����������: " + mtEmployee.size());
    }

    /* ��������� �������� ������ ��������
    ���������� ������������ ����� ��������� �� 5000000.0 �� 15000000.0 ������.
    */
    public void getIncome() {
        //���������� �� 2�� �����
        mvIncome = BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble(5000000.0, 15000000.0)).setScale(2, RoundingMode.HALF_DOWN);
    }

    /* ��� ������ ��������� �����������, ��������������� �� �������� � ����������� ���������� ����� */
    public void getTopSalaryStaff(int ivCount) {
        Collections.sort(mtEmployee, Collections.reverseOrder());
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

    public BigDecimal getMvIncome() {
        return mvIncome;
    }
}