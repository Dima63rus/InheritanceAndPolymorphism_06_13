package Company;

import java.math.BigDecimal;

/*
    ����� ����������� � ����������� � ��������� � ��������� ���������� ��������:
	Operator � �������� ������������ ������ �� ������������� �����.
 */
public class Operator implements Employee {
    //��� ����������
    private final String mvName;
    private BigDecimal mvSalary;

    private final Company moCompany;

    //�����������
    public Operator(int i, Company ioCompany) {
        this.mvName = "��������_" + i;
        this.mvSalary = BigDecimal.valueOf(0.0);
        this.moCompany = ioCompany;
    }

    @Override
    public void setSalary() {
//        this.mvSalary = 30000;
        this.mvSalary = BigDecimal.valueOf(30000.0);
    }

    @Override
    public BigDecimal getMonthSalary() {
        return this.mvSalary;
    }

    public void setRefreshSalary(){
        this.mvSalary = BigDecimal.valueOf(0.0);
    }
}