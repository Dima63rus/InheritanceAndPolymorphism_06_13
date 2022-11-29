package Company;

import java.math.BigDecimal;

/*
   ������ ����� ���������� ������ ���������������� ��������� Employee.
   � ���������� Employee ������ ���� �������� �����, ������������ �������� ����������:
        getMonthSalary()
   ��������� � ������������ �������� ������ �������� � ������������ � ������� ���������� �������.
*/
public interface Employee extends Comparable<Employee> {
    void setSalary(); //���������� �� ��� ���������������

    void setRefreshSalary(); //��������� �� ��� ����������

    int getMonthSalary(); //������� �� ����������

    int rnd(int ivMinIncome, int ivMaxIncome);

    @Override
    default int compareTo(Employee ioEmployee) { //��������� �� ���� ��
        if (getMonthSalary() > ioEmployee.getMonthSalary()) {
            return 1;
        }
        if (getMonthSalary() < ioEmployee.getMonthSalary()) {
            return -1;
        }
        return 0;
    }
}