package Company;

/*
    ����� ����������� � ����������� � ��������� � ��������� ���������� ��������:

	Operator � �������� ������������ ������ �� ������������� �����.
 */
public class Operator implements Employee {
    //��� ����������
    private String mvName;
    private int mvSalary;

    private final Company moCompany;


    //�����������
    public Operator(int i, Company ioCompany) {
        this.mvName = "��������_" + i;
        this.mvSalary = 0;
        this.moCompany = ioCompany;
    }

    @Override
    public void setSalary() {
        this.mvSalary = 30000;
    }

    @Override
    public int getMonthSalary() {
        return this.mvSalary;
    }

    @Override
    public int rnd(int ivMinIncome, int ivMaxIncome) {
        ivMaxIncome -= ivMinIncome;
        return (int) (Math.random() * ++ivMaxIncome) + ivMinIncome;
    }

    public void setRefreshSalary(){
        this.mvSalary = 0;
    }
}