package Company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.ThreadLocalRandom;

/*
    ����� ����������� � ����������� � ��������� � ��������� ���������� ��������:
	Manager � �������� ������������ �� ������������� ����� � ������ � ���� 5% �� ������������ ��� �������� �����.
	���������� ������������ ����� ��� �������� ����������� ��������� ������� �� 115 000 �� 140 000 ������.
 */
public class Manager implements Employee {
    //��� ����������
    private final String mvName;
    private BigDecimal mvSalary;
    private final Company moCompany;

    //�����������
    public Manager(int i, Company ioCompany) {
        this.mvName = "��������_" + i;
        this.mvSalary = BigDecimal.valueOf(0.0);
        this.moCompany = ioCompany;
    }

    @Override
    public void setSalary() {
        final BigDecimal LC_FIX_SALARY = BigDecimal.valueOf(90000.0);

        //��������� 5% �� ������������ ��� �������� ����� �� 115 000 �� 140 000
        BigDecimal lvMoneyForCompany = getMoneyForCompany();
        BigDecimal lvProc = getProc(lvMoneyForCompany);

        this.mvSalary = LC_FIX_SALARY.add(lvProc);
    }

    /* �������� ������������ �� ������������� ����� � ������ � ���� 5% �� ������������ ��� �������� �����. */
    @Override
    public BigDecimal getMonthSalary() {
        return this.mvSalary;
    }

    private BigDecimal getMoneyForCompany() {
        return BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble(115000.0, 140000.0)).setScale(2, RoundingMode.HALF_DOWN);
    }

    private BigDecimal getProc(BigDecimal ivIncome) {
        return ivIncome.multiply(BigDecimal.valueOf(0.05)).setScale(2, RoundingMode.HALF_DOWN);
    }

    public void setRefreshSalary() {
        this.mvSalary = BigDecimal.valueOf(0.0);
    }
}