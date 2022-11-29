package Company;

/*
    ����� ����������� � ����������� � ��������� � ��������� ���������� ��������:
	Manager � �������� ������������ �� ������������� ����� � ������ � ���� 5% �� ������������ ��� �������� �����.

	���������� ������������ ����� ��� �������� ����������� ��������� ������� �� 115 000 �� 140 000 ������.
 */
public class Manager implements Employee {
    //��� ����������
    private String mvName;
    private int mvSalary;
    private Company moCompany;

    //�����������
    public Manager(int i, Company ioCompany) {
        this.mvName = "��������_" + i;
        this.mvSalary = 0;
        this.moCompany = ioCompany;
    }

    @Override
    public void setSalary() {
        final int LC_FIX_SALARY = 90000;

        //��������� 5% �� ������������ ��� �������� ����� �� 115 000 �� 140 000
        int lvMoneyForCompany = getMoneyForCompany();
        double lvProc = getProc(lvMoneyForCompany);

        this.mvSalary = LC_FIX_SALARY + (int) lvProc;
    }

    /* �������� ������������ �� ������������� ����� � ������ � ���� 5% �� ������������ ��� �������� �����. */
    @Override
    public int getMonthSalary() {
        return this.mvSalary;
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

    public void setRefreshSalary(){
        this.mvSalary = 0;
    }
}