import java.util.*;

class Bank {
    private int bankId;
    private String bankName;
    private String address;
    private String phNo;

    public Bank(int bankId, String bankName, String address, String phNo) {
        this.address = address;
        this.bankId = bankId;
        this.bankName = bankName;
        this.phNo = phNo;
    }

    public int getBankId() {
        return bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBankAddress() {
        return address;
    }

    public String getBankPhone() {
        return phNo;
    }
}

class Branch {
    private int branchId;
    private String branchName;
    private String branchAddress;
    private String branchPhoneNumber;
    private Bank bank;

    public Branch(int branchId, String branchName, String branchAddress, String branchPhoneNumber, Bank bank) {
        this.branchId = branchId;
        this.branchName = branchName;
        this.branchAddress = branchAddress;
        this.branchPhoneNumber = branchPhoneNumber;
        this.bank = bank;
    }

    public int getBranchId() {
        return branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public String getBranchPhoneNumber() {
        return branchPhoneNumber;
    }

    public Bank getBank() {
        return bank;
    }
}

class Loans {
    private int loanId;
    private String type;
    private double interestRate;
    private int term;

    public Loans(int loanId, String type, double interestRate, int term) {
        this.interestRate = interestRate;
        this.loanId = loanId;
        this.type = type;
        this.term = term;
    }

    public int getLoanId() {
        return loanId;
    }

    public double getLoanInterest() {
        return interestRate;
    }

    public String getLoanType() {
        return type;
    }

    public int getLoanTerm() {
        return term;
    }
}

class Customer {
    private int customerId;
    private String name;
    private String address;
    private String email;
    private int phNo;
    private Branch branchId;
    private boolean isStudent;

    public Customer(int customerId, String name, String address, String email, int phNo, Branch branchId, boolean isStudent) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phNo = phNo;
        this.branchId = branchId;
        this.isStudent = isStudent;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getPhNo() {
        return phNo;
    }

    public Branch getBranchId() {
        return branchId;
    }

    public boolean isStudent() {
        return isStudent;
    }
}

class StudentDetails {
    private int studentId;
    private Customer customerId;
    private double GPA;
    private int marks;
    private String university;
    private String major;

    public StudentDetails(int studentId, Customer customerId, double GPA, int marks, String university, String major) {
        this.studentId = studentId;
        this.customerId = customerId;
        this.GPA = GPA;
        this.marks = marks;
        this.university = university;
        this.major = major;
    }

    public int getStudentId() {
        return studentId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public double getGPA() {
        return GPA;
    }

    public int getMarks() {
        return marks;
    }

    public String getUniversity() {
        return university;
    }

    public String getMajor() {
        return major;
    }
}

class Account {
    private int accountId;
    private Customer customerId;
    private String accountType;
    private int balance;
    private String status;

    public Account(int accountId, Customer customerId, String accountType, int balance, String status) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.accountType = accountType;
        this.balance = balance;
        this.status = status;
    }

    public int getAccountId() {
        return accountId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getBalance() {
        return balance;
    }

    public String getStatus() {
        return status;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

class JointAccount {
    private int accountId;
    private List<Customer> customers;

    public JointAccount(int accountId, List<Customer> customers) {
        this.accountId = accountId;
        this.customers = customers;
    }

    public int getAccountId() {
        return accountId;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}

class CustomerLoan {
    private Loans loanId;
    private Account accountId;
    private int amount;
    private int monthlyPayment;
    private String status;

    public CustomerLoan(Loans loanId, Account accountId, int amount, int monthlyPayment, String status) {
        this.loanId = loanId;
        this.accountId = accountId;
        this.amount = amount;
        this.monthlyPayment = monthlyPayment;
        this.status = status;
    }

    public Loans getLoanId() {
        return loanId;
    }

    public Account getAccountId() {
        return accountId;
    }

    public int getAmount() {
        return amount;
    }

    public int getMonthlyPayment() {
        return monthlyPayment;
    }

    public String getStatus() {
        return status;
    }

    public void setMonthlyPayment(int monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

class Payment {
    private int paymentId;
    private CustomerLoan customerloanId;
    private String paymentMethod;
    private Date paymentDate;
    private int amountPaid;

    public Payment(int paymentId, CustomerLoan customerloanId, String paymentMethod, Date paymentDate, int amountPaid) {
        this.paymentId = paymentId;
        this.customerloanId = customerloanId;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
        this.amountPaid = amountPaid;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public CustomerLoan getCustomerloanId() {
        return customerloanId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public int getAmountPaid() {
        return amountPaid;
    }
}

public class EducationLoan {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Customer> customers = new ArrayList<>();
    private static List<Loans> loans = new ArrayList<>();
    private static List<Account> accounts = new ArrayList<>();
    private static List<CustomerLoan> customerLoans = new ArrayList<>();
    private static List<Payment> payments = new ArrayList<>();
    private static int paymentIdCounter = 1;

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Apply for a Loan");
            System.out.println("2. Make a Payment");
            System.out.println("3. View Payment History");
            System.out.println("4. Pre-Close Loan");
            System.out.println("5. Calculate Early Payment Benefits");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    applyForLoan();
                    break;
                case 2:
                    makePayment();
                    break;
                case 3:
                    viewPaymentHistory();
                    break;
                case 4:
                    preCloseLoan();
                    break;
                case 5:
                    calculateEarlyPaymentBenefits();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void applyForLoan() {
        System.out.println("Enter GPA:");
        double gpa = scanner.nextDouble();
        double amount5 = 5000.0;
        double amount7 = 7000.0;
        double amount10 = 10000.0;

        System.out.println("Available Loan Options:");
        System.out.println("5-year term: $" + amount5 + " at 5%");
        System.out.println("7-year term: $" + amount7 + " at 6%");
        System.out.println("10-year term: $" + amount10 + " at 7%");

        System.out.println("Choose a loan term (5/7/10 years):");
        int term = scanner.nextInt();
        double amount = 0;
        double interestRate = 0;
        int monthlyPayment = 0;

        switch (term) {
            case 5:
                amount = amount5;
                interestRate = 5;
                monthlyPayment = calculateEMI(amount, interestRate, term);
                break;
            case 7:
                amount = amount7;
                interestRate = 6;
                monthlyPayment = calculateEMI(amount, interestRate, term);
                break;
            case 10:
                amount = amount10;
                interestRate = 7;
                monthlyPayment = calculateEMI(amount, interestRate, term);
                break;
            default:
                System.out.println("Invalid term selected.");
                return;
        }

        System.out.println("You are eligible for a loan amount of: $" + amount);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Monthly Payment: $" + monthlyPayment);

        System.out.println("Do you want to proceed with the loan application? (yes/no)");
        String decision = scanner.next();

        if (decision.equalsIgnoreCase("yes")) {
            // Assuming one customer for simplicity
            Customer customer = new Customer(1, "John Doe", "123 Main St", "john@example.com", 1234567890, new Branch(1, "Main Branch", "123 Main St", "1234567890", new Bank(1, "ABC Bank", "123 Main St", "1234567890")), true);
            customers.add(customer);
            Account account = new Account(1, customer, "Student Loan", 0, "Active");
            accounts.add(account);
            Loans loan = new Loans(customerLoans.size() + 1, "Education Loan", interestRate, term);
            CustomerLoan customerLoan = new CustomerLoan(loan, account, (int) amount, monthlyPayment, "Active");
            customerLoans.add(customerLoan);
            System.out.println("Loan approved and account created.");
        } else {
            System.out.println("Loan application cancelled.");
        }
    }

    private static int calculateEMI(double amount, double interestRate, int term) {
        double monthlyRate = interestRate / (12 * 100);
        int months = term * 12;
        return (int) ((amount * monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1));
    }

    private static void makePayment() {
        System.out.println("Enter Loan ID to make a payment:");
        int loanId = scanner.nextInt();
        CustomerLoan customerLoan = findCustomerLoan(loanId);

        if (customerLoan != null) {
            System.out.println("Enter amount to pay:");
            int amount = scanner.nextInt();
            Payment payment = new Payment(paymentIdCounter++, customerLoan, "Online", new Date(), amount);
            payments.add(payment);
            System.out.println("Payment successful.");
        } else {
            System.out.println("Loan not found.");
        }
    }

    private static void viewPaymentHistory() {
        System.out.println("Enter Loan ID to view payment history:");
        int loanId = scanner.nextInt();
        System.out.println("Payment History for Loan ID " + loanId + ":");
        for (Payment payment : payments) {
            if (payment.getCustomerloanId().getLoanId().getLoanId() == loanId) {
                System.out.println("Date: " + payment.getPaymentDate() + ", Amount: $" + payment.getAmountPaid());
            }
        }
    }

    private static void preCloseLoan() {
        System.out.println("Enter Loan ID for pre-closure:");
        int loanId = scanner.nextInt();
        CustomerLoan customerLoan = findCustomerLoan(loanId);

        if (customerLoan != null) {
            int remainingAmount = customerLoan.getAmount();
            for (Payment payment : payments) {
                if (payment.getCustomerloanId().getLoanId().getLoanId() == loanId) {
                    remainingAmount -= payment.getAmountPaid();
                }
            }

            // Adding pre-closure fee (5%)
            double preClosureFee = remainingAmount * 0.05;
            double preClosureAmount = remainingAmount + preClosureFee;

            System.out.println("Pre-Closure Amount: $" + preClosureAmount);

            System.out.println("Do you want to proceed with pre-closure? (yes/no)");
            String decision = scanner.next();

            if (decision.equalsIgnoreCase("yes")) {
                customerLoan.setStatus("Closed");
                System.out.println("Loan pre-closed successfully.");
            } else {
                System.out.println("Pre-closure cancelled.");
            }
        } else {
            System.out.println("Loan not found.");
        }
    }

    private static void calculateEarlyPaymentBenefits() {
        System.out.println("Enter Loan ID to calculate early payment benefits:");
        int loanId = scanner.nextInt();
        CustomerLoan customerLoan = findCustomerLoan(loanId);

        if (customerLoan != null) {
            System.out.println("Enter additional amount to pay every month:");
            int additionalAmount = scanner.nextInt();
            double currentMonthlyPayment = customerLoan.getMonthlyPayment();
            double newMonthlyPayment = currentMonthlyPayment + additionalAmount;
            double outstandingPrincipal = customerLoan.getAmount();

            int remainingMonths = customerLoan.getLoanId().getLoanTerm() * 12;
            for (Payment payment : payments) {
                if (payment.getCustomerloanId().getLoanId().getLoanId() == loanId) {
                    outstandingPrincipal -= payment.getAmountPaid();
                    remainingMonths--;
                }
            }

            // Calculate new loan tenure with additional monthly payments
            int newTenureMonths = 0;
            while (outstandingPrincipal > 0) {
                outstandingPrincipal = outstandingPrincipal * (1 + customerLoan.getLoanId().getLoanInterest() / 1200) - newMonthlyPayment;
                newTenureMonths++;
            }

            System.out.println("New loan tenure with additional monthly payment of $" + additionalAmount + ": " + newTenureMonths + " months.");
        } else {
            System.out.println("Loan not found.");
        }
    }

    private static CustomerLoan findCustomerLoan(int loanId) {
        for (CustomerLoan customerLoan : customerLoans) {
            if (customerLoan.getLoanId().getLoanId() == loanId) {
                return customerLoan;
            }
        }
        return null;
    }
}
