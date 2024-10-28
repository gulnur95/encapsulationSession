public class Student {
    private String fullName;
    private String phoneNumber;
    private String address;
    private double bankAccount;

    public Student(String fullName, String phoneNumber, String address, double bankAccount) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.bankAccount = bankAccount;
    }

    public String getAddress() {
        return address;
    }


    public int liveIn(double monthlyRent) {
        return (int) (bankAccount / monthlyRent);
    }


    public void changeInfo(String newFullName, String newPhoneNumber, String newAddress, double newBankAccount) {
        this.fullName = newFullName;
        this.phoneNumber = newPhoneNumber;
        this.address = newAddress;
        this.bankAccount = newBankAccount;
    }

    @Override
    public String toString() {
        return "Студент: " + fullName + ", Телефон: " + phoneNumber + ", Адрес: " + address + ", Баланс: " + bankAccount;
    }
}
