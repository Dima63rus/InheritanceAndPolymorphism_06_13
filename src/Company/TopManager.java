package Company;

import java.math.BigDecimal;

/*
    Класс сотрудников с информацией о зарплатах и условиями начисления зарплаты:
	TopManager — зарплата складывается из фиксированной части и бонуса в виде 150% от заработной платы,
	если доход компании более 10 млн рублей.
 */
public class TopManager implements Employee {
    //Имя сотрудника
    private final String mvName;
    private BigDecimal mvSalary;
    private final Company moCompany;

    //Конструктор
    public TopManager(int i, Company ioCompany) {
        this.mvName = "ТопМенеджер_" + i;
        this.mvSalary = BigDecimal.valueOf(0.0);
        this.moCompany = ioCompany;
    }

    @Override
    public void setSalary() {
        final BigDecimal LC_MAX_INCOME_COMPANY = BigDecimal.valueOf(10000000.0);
        final BigDecimal LC_FIX_SALARY = BigDecimal.valueOf(150000.0);

        //Посчитать доход компании
        BigDecimal lvProc = BigDecimal.valueOf(0.0);
        if (moCompany != null) {
            //Высчитать 150% от зарплаты
            int lvInt = moCompany.getMvIncome().compareTo(LC_MAX_INCOME_COMPANY);
            if (moCompany.getMvIncome().compareTo(LC_MAX_INCOME_COMPANY) == 1) {
                lvProc = getProc(LC_FIX_SALARY);
            }
        }
        this.mvSalary = LC_FIX_SALARY.add(lvProc);
    }

    /* Зарплата складывается из фиксированной части и бонуса в виде 150% от заработной платы,
            если доход компании более 10 млн рублей */
    @Override
    public BigDecimal getMonthSalary() {
        return this.mvSalary;
    }

    private BigDecimal getProc(BigDecimal ivSalary) {
        return ivSalary.multiply(BigDecimal.valueOf(1.5));
    }

    public void setRefreshSalary() {
        this.mvSalary = BigDecimal.valueOf(0.0);
    }
}