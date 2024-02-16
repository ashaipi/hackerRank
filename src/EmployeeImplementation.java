package hackerrank;

interface Company {
    void assignSalaries(int[] salaries);
    void averageSalary();
    void maxSalary();
    void minSalary();
}

class EngineerFirm implements Company{
    int[] income;

    public EngineerFirm(int n){
        income = new int[n];
        for (int i = 0; i < n; i++) {
            this.income[i]=0;
        }
    }

    public void assignSalaries(int[] salaries){
        int arrLength=0;
        if(this.income.length<salaries.length) arrLength=this.income.length;
        else arrLength=salaries.length;
        for (int i = 0; i < arrLength; i++) {
            this.income[i]=salaries[i];
        }
        System.out.println("Incomes of engineers credited");
    }

    public void averageSalary(){
        double avgSalary=0;
        double sum=0;
        for (int i = 0; i < this.income.length; i++) {
            sum+=this.income[i];
        }
        avgSalary=sum/income.length;
        System.out.println("Average salary of engineers is "+avgSalary);
    }

    public void maxSalary(){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < this.income.length; i++) {
            if(this.income[i]>max) {
                max=this.income[i];
            }
        }
        System.out.println("Maximum salary amongst engineers is "+max);
    }
    public void minSalary(){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < this.income.length; i++) {
            if(this.income[i]<min) {
                min=this.income[i];
            }
        }
        System.out.println("Minimum salary amongst engineers is "+min);
    }
}

class AccountantFirm implements Company{
    int[] income;

    public AccountantFirm(int n){
        income = new int[n];
        for (int i = 0; i < n; i++) {
            this.income[i]=0;
        }
    }
    public void assignSalaries(int[] salaries){
        int arrLength=0;
        if(this.income.length<salaries.length) arrLength=this.income.length;
        else arrLength=salaries.length;
        for (int i = 0; i < arrLength; i++) {
            this.income[i]=salaries[i];
        }
        System.out.println("Incomes of accountants credited");
    }
    public void averageSalary(){
        double avgSalary=0;
        double sum=0;
        for (int i = 0; i < this.income.length; i++) {
            sum+=this.income[i];
        }
        avgSalary=sum/income.length;
        System.out.println("Average salary of accountants is "+avgSalary);
    }
    public void maxSalary(){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < this.income.length; i++) {
            if(this.income[i]>max) {
                max=this.income[i];
            }
        }
        System.out.println("Maximum salary amongst accountants is "+max);
    }
    public void minSalary(){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < this.income.length; i++) {
            if(this.income[i]<min) {
                min=this.income[i];
            }
        }
        System.out.println("Minimum salary amongst accountants is "+min);
    }
}

public class EmployeeImplementation {
    public static void main(String[] args) {
        int[] count = {5,5};
        EngineerFirm e = new EngineerFirm(count[0]);
        AccountantFirm a = new AccountantFirm(count[1]);

        int[] incomeEngineers = {6848, 9329, 9984, 5543, 7986 };
        e.assignSalaries(incomeEngineers);

        int[] incomeAccountants = {9317, 7796, 3352, 7068, 9500};

        a.assignSalaries(incomeAccountants);

        e.averageSalary();
        e.maxSalary();
        e.minSalary();

        a.averageSalary();
        a.maxSalary();
        a.minSalary();
    }
}
