package Company;

/*
    Класс сотрудников с информацией о зарплатах и условиями начисления зарплаты:
	Manager — зарплата складывается из фиксированной части и бонуса в виде 5% от заработанных для компании денег.

	Количество заработанных денег для компании генерируйте случайным образом от 115 000 до 140 000 рублей.
 */
public class Manager implements Employee {
    //Имя сотрудника
    private String mvName;
    private int mvSalary;
    private Company moCompany;

    //Конструктор
    public Manager(int i, Company ioCompany) {
        this.mvName = "Менеджер_" + i;
        this.mvSalary = 0;
        this.moCompany = ioCompany;
    }

    @Override
    public void setSalary() {
        final int LC_FIX_SALARY = 90000;

        //Высчитать 5% от заработанных для компании денег от 115 000 до 140 000
        int lvMoneyForCompany = getMoneyForCompany();
        double lvProc = getProc(lvMoneyForCompany);

        this.mvSalary = LC_FIX_SALARY + (int) lvProc;
    }

    /* Зарплата складывается из фиксированной части и бонуса в виде 5% от заработанных для компании денег. */
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