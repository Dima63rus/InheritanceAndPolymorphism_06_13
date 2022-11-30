package Company;

import java.math.BigDecimal;

/*
    Класс сотрудников с информацией о зарплатах и условиями начисления зарплаты:
	Operator — зарплата складывается только из фиксированной части.
 */
public class Operator implements Employee {
    //Имя сотрудника
    private final String mvName;
    private BigDecimal mvSalary;

    private final Company moCompany;

    //Конструктор
    public Operator(int i, Company ioCompany) {
        this.mvName = "Оператор_" + i;
        this.mvSalary = BigDecimal.valueOf(0.0);
        this.moCompany = ioCompany;
    }

    @Override
    public void setSalary() {
//        this.mvSalary = 30000;
        this.mvSalary = BigDecimal.valueOf(30000.0);
    }

    @Override
    public BigDecimal getMonthSalary() {
        return this.mvSalary;
    }

    public void setRefreshSalary(){
        this.mvSalary = BigDecimal.valueOf(0.0);
    }
}