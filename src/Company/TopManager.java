package Company;

import java.math.BigDecimal;

/*
    ����� ����������� � ����������� � ��������� � ��������� ���������� ��������:

	TopManager � �������� ������������ �� ������������� ����� � ������ � ���� 150% �� ���������� �����,
	���� ����� �������� ����� 10 ��� ������.
 */
public class TopManager implements Employee {
    //��� ����������
    private final String mvName;
    private BigDecimal mvSalary;
    private final Company moCompany;

    //�����������
    public TopManager(int i, Company ioCompany) {
        this.mvName = "�����������_" + i;
        this.mvSalary = BigDecimal.valueOf(0.0);
        this.moCompany = ioCompany;
    }

    @Override
    public void setSalary() {
        final BigDecimal LC_MAX_INCOME_COMPANY = BigDecimal.valueOf(10000000.0);
        final BigDecimal LC_FIX_SALARY = BigDecimal.valueOf(150000.0);

        //��������� ����� ��������
        BigDecimal lvProc = BigDecimal.valueOf(0.0);
        if (moCompany != null) {
            //��������� 150% �� ��������
            int lvInt = moCompany.getMvIncome().compareTo(LC_MAX_INCOME_COMPANY);
            if (moCompany.getMvIncome().compareTo(LC_MAX_INCOME_COMPANY) == 1) {
                lvProc = getProc(LC_FIX_SALARY);
            }
        }
        this.mvSalary = LC_FIX_SALARY.add(lvProc);
    }

    /* �������� ������������ �� ������������� ����� � ������ � ���� 150% �� ���������� �����,
            ���� ����� �������� ����� 10 ��� ������ */
    @Override
    public BigDecimal getMonthSalary() {
        return this.mvSalary;
    }

    private BigDecimal getProc(BigDecimal ivSalary) {
        return ivSalary.multiply(BigDecimal.valueOf(1.5));
    }

    public void setRefreshSalary() {
        this.mvSalary = BigDecimal.valueOf(0.0);
    }
}