package Company;

/*
   ������ ����� ���������� ������ ���������������� ��������� Employee.
   � ���������� Employee ������ ���� �������� �����, ������������ �������� ����������:
        getMonthSalary()
   ��������� � ������������ �������� ������ �������� � ������������ � ������� ���������� �������.
*/
public interface Employee {
    int getMonthSalary();
    int rnd(int ivMinIncome, int ivMaxIncome);
}
