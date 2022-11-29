package Company;

/*
    ����� ����������� � ����������� � ��������� � ��������� ���������� ��������:

	Operator � �������� ������������ ������ �� ������������� �����.
 */
public class Operator implements Employee, Comparable<Operator> {
    //��� ����������
    private String mvName;

    private Company moCompany;

    final int MC_FIX_SALARY = 30000;

    //�����������
    public Operator(int i, Company ioCompany) {
        this.mvName = "��������_" + i;
        this.moCompany = ioCompany;
    }

    @Override
    public int getMonthSalary() {
        return MC_FIX_SALARY;
    }

    @Override
    public int rnd(int ivMinIncome, int ivMaxIncome) {
        ivMaxIncome -= ivMinIncome;
        return (int) (Math.random() * ++ivMaxIncome) + ivMinIncome;
    }

    @Override
    public int compareTo(Operator ioOperator) {
        if (getMonthSalary() > ioOperator.getMonthSalary()) {
            return 1;
        }
        if (getMonthSalary() < ioOperator.getMonthSalary()) {
            return -1;
        }
        return 0;
    }
}