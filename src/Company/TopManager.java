package Company;

/*
    Класс сотрудников с информацией о зарплатах и условиями начисления зарплаты:

	TopManager — зарплата складывается из фиксированной части и бонуса в виде 150% от заработной платы,
	если доход компании более 10 млн рублей.
 */
public class TopManager implements Employee, Comparable<TopManager> {
    //Имя сотрудника
    private String mvName;

    private Company moCompany;

    final int MC_FIX_SALARY = 150000;

    final int MC_MAX_INCOME_COMPANY = 10000000;

    //Конструктор
    public TopManager(int i, Company ioCompany) {
        this.mvName = "ТопМенеджер_" + i;
        this.moCompany = ioCompany;
    }

    /* Зарплата складывается из фиксированной части и бонуса в виде 150% от заработной платы,
        если доход компании более 10 млн рублей */
    @Override
    public int getMonthSalary() {
        //Посчитать доход компании
        double lvProc = 0.0d;
        if (moCompany != null) {
            //Высчитать 150% от зарплаты
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