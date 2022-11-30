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

    BigDecimal getMonthSalary(); //������� �� ����������

    @Override
    default int compareTo(Employee ioEmployee) { //��������� �� ���� ��
        return getMonthSalary().compareTo(ioEmployee.getMonthSalary());
    }
}