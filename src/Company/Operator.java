package Company;

/*
    Класс сотрудников с информацией о зарплатах и условиями начисления зарплаты:

	Operator — зарплата складывается только из фиксированной части.
 */
public class Operator implements Employee, Comparable<Operator> {
    //Имя сотрудника
    private String mvName;

    private Company moCompany;

    final int MC_FIX_SALARY = 30000;

    //Конструктор
    public Operator(int i, Company ioCompany) {
        this.mvName = "Оператор_" + i;
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