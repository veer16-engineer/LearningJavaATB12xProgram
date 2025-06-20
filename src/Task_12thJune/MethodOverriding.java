package Task_12thJune;

class Bank {
    double getInterestRate() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 7.5;
    }
}

class ICICI extends Bank {
    @Override
    double getInterestRate() {
        return 8.2;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate());
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate());
    }
}
