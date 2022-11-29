package Company;

/*
    Класс сотрудников с информацией о зарплатах и условиями начисления зарплаты:

	TopManager — зарплата складывается из фиксированной части и бонуса в виде 150% от заработной платы,
	если доход компании более 10 млн рублей.
 */
public class TopManager implements Employee {
    //Имя сотрудника
    private String mvName;
    private int mvSalary;
    private Company moCompany;


    //Конструктор
    public TopManager(int i, Company ioCompany) {
        this.mvName = "ТопМенеджер_" + i;
        this.mvSalary = 0;
        this.moCompany = ioCompany;
    }

    @Override
    public void setSalary() {
        final int LC_MAX_INCOME_COMPANY = 10000000;
        final int LC_FIX_SALARY = 150000;

        //Посчитать доход компании
        double lvProc = 0.0d;
        if (moCompany != null) {
            //Высчитать 150% от зарплаты
            if (moCompany.getMvIncome() > LC_MAX_INCOME_COMPANY) {
                lvProc = getProc(LC_FIX_SALARY);
            }
        }

        this.mvSalary = LC_FIX_SALARY + (int) lvProc;
    }

    /* Зарплата складывается из фиксированной части и бонуса в виде 150% от заработной платы,
            если доход компании более 10 млн рублей */
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