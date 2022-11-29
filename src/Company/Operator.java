package Company;

import java.math.BigDecimal;

/*
    Класс сотрудников с информацией о зарплатах и условиями начисления зарплаты:

	Operator — зарплата складывается только из фиксированной части.
 */
public class Operator implements Employee {
    //Имя сотрудника
    private String mvName;
    private int mvSalary;

    private Company moCompany;


    //Конструктор
    public Operator(int i, Company ioCompany) {
        this.mvName = "Оператор_" + i;
        this.mvSalary = 0;
        this.moCompany = ioCompany;
    }

    @Override
    public void setSalary() {
        final int LC_FIX_SALARY = 30000;
        this.mvSalary = LC_FIX_SALARY;
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