package Company;

/*
    ����� ����������� � ����������� � ��������� � ��������� ���������� ��������:

	TopManager � �������� ������������ �� ������������� ����� � ������ � ���� 150% �� ���������� �����,
	���� ����� �������� ����� 10 ��� ������.
 */
public class TopManager implements Employee {
    //��� ����������
    private String mvName;
    private int mvSalary;
    private Company moCompany;


    //�����������
    public TopManager(int i, Company ioCompany) {
        this.mvName = "�����������_" + i;
        this.mvSalary = 0;
        this.moCompany = ioCompany;
    }

    @Override
    public void setSalary() {
        final int LC_MAX_INCOME_COMPANY = 10000000;
        final int LC_FIX_SALARY = 150000;

        //��������� ����� ��������
        double lvProc = 0.0d;
        if (moCompany != null) {
            //��������� 150% �� ��������
            if (moCompany.getMvIncome() > LC_MAX_INCOME_COMPANY) {
                lvProc = getProc(LC_FIX_SALARY);
            }
        }

        this.mvSalary = LC_FIX_SALARY + (int) lvProc;
    }

    /* �������� ������������ �� ������������� ����� � ������ � ���� 150% �� ���������� �����,
            ���� ����� �������� ����� 10 ��� ������ */
    @Override
    public int getMonthSalary() {
        return this.mvSalary;
    }

    @Override
    public int rnd(int ivMinIncome, int ivMaxIncome) {
        return 0;
    }

    private double getProc(int ivSalary) {
        return ivSalary * 1.5;
    }

    public void setRefreshSalary() {
        this.mvSalary = 0;
    }
}