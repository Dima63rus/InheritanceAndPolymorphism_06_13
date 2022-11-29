package Company;

import java.util.ArrayList;
import java.util.List;

/*
    ����� ����������� � ����������� � ��������� � ��������� ���������� ��������:
	Manager � �������� ������������ �� ������������� ����� � ������ � ���� 5% �� ������������ ��� �������� �����.

	���������� ������������ ����� ��� �������� ����������� ��������� ������� �� 115 000 �� 140 000 ������.
 */
public class Manager implements Employee {
    //��� ����������
    private String mvName;

    private Company moCompany;

    final int MC_FIX_SALARY = 90000;

    //�����������
    public Manager(int i, Company ioCompany) {
        this.mvName = "��������_" + i;
        this.moCompany = ioCompany;
    }

    /* �������� ������������ �� ������������� ����� � ������ � ���� 5% �� ������������ ��� �������� �����. */
    @Override
    public int getMonthSalary() {
        //��������� 5% �� ������������ ��� �������� ����� �� 115 000 �� 140 000
        int lvMoneyForCompany = getMoneyForCompany();
        double lvProc = getProc(lvMoneyForCompany);

        return MC_FIX_SALARY + (int) lvProc;
    }

    private int getMoneyForCompany() {
        final int LC_MIN_INCOME = 115000;
        final int LC_MAX_INCOME = 140000;
        return rnd(LC_MIN_INCOME, LC_MAX_INCOME);
    }

    @Override
    public int rnd(int ivMinIncome, int ivMaxIncome) {
        ivMaxIncome -= ivMinIncome;
        return (int) (Math.random() * ++ivMaxIncome) + ivMinIncome;
    }

    private double getProc(int ivIncome) {
        return ivIncome * 0.05;
    }
}