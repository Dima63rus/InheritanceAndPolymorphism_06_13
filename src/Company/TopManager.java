package Company;

/*
    ����� ����������� � ����������� � ��������� � ��������� ���������� ��������:

	TopManager � �������� ������������ �� ������������� ����� � ������ � ���� 150% �� ���������� �����,
	���� ����� �������� ����� 10 ��� ������.
 */
public class TopManager implements Employee, Comparable<TopManager> {
    //��� ����������
    private String mvName;

    private Company moCompany;

    final int MC_FIX_SALARY = 150000;

    final int MC_MAX_INCOME_COMPANY = 10000000;

    //�����������
    public TopManager(int i, Company ioCompany) {
        this.mvName = "�����������_" + i;
        this.moCompany = ioCompany;
    }

    /* �������� ������������ �� ������������� ����� � ������ � ���� 150% �� ���������� �����,
        ���� ����� �������� ����� 10 ��� ������ */
    @Override
    public int getMonthSalary() {
        //��������� ����� ��������
        double lvProc = 0.0d;
        if (moCompany != null) {
            //��������� 150% �� ��������
            if (moCompany.getMvIncome() > MC_MAX_INCOME_COMPANY) {
                lvProc = getProc(MC_FIX_SALARY);
            }
        }

        return MC_FIX_SALARY + (int) lvProc;
    }

    @Override
    public int rnd(int ivMinIncome, int ivMaxIncome) {
        return 0;
    }

    private double getProc(int ivSalary) {
        return ivSalary * 1.5;
    }

    @Override
    public int compareTo(TopManager ioTopManager) {
        if (getMonthSalary() > ioTopManager.getMonthSalary()) {
            return 1;
        }
        if (getMonthSalary() < ioTopManager.getMonthSalary()) {
            return -1;
        }
        return 0;
    }
}