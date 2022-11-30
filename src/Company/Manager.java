package Company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.ThreadLocalRandom;

/*
    Класс сотрудников с информацией о зарплатах и условиями начисления зарплаты:
	Manager — зарплата складывается из фиксированной части и бонуса в виде 5% от заработанных для компании денег.
	Количество заработанных денег для компании генерируйте случайным образом от 115 000 до 140 000 рублей.
 */
public class Manager implements Employee {
    //Имя сотрудника
    private final String mvName;
    private BigDecimal mvSalary;
    private final Company moCompany;

    //Конструктор
    public Manager(int i, Company ioCompany) {
        this.mvName = "Менеджер_" + i;
        this.mvSalary = BigDecimal.valueOf(0.0);
        this.moCompany = ioCompany;
    }

    @Override
    public void setSalary() {
        final BigDecimal LC_FIX_SALARY = BigDecimal.valueOf(90000.0);

        //Высчитать 5% от заработанных для компании денег от 115 000 до 140 000
        BigDecimal lvMoneyForCompany = getMoneyForCompany();
        BigDecimal lvProc = getProc(lvMoneyForCompany);

        this.mvSalary = LC_FIX_SALARY.add(lvProc);
    }

    /* Зарплата складывается из фиксированной части и бонуса в виде 5% от заработанных для компании денег. */
    @Override
    public BigDecimal getMonthSalary() {
        return this.mvSalary;
    }

    private BigDecimal getMoneyForCompany() {
        return BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble(115000.0, 140000.0)).setScale(2, RoundingMode.HALF_DOWN);
    }

    private BigDecimal getProc(BigDecimal ivIncome) {
        return ivIncome.multiply(BigDecimal.valueOf(0.05)).setScale(2, RoundingMode.HALF_DOWN);
    }

    public void setRefreshSalary() {
        this.mvSalary = BigDecimal.valueOf(0.0);
    }
}