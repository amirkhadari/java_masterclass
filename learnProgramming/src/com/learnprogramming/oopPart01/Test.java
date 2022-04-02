package com.learnprogramming.oopPart01;

public class Test {

    public static void main(String[] args){
//        Car porsche =  new Car();
//        porsche.setColour("Blue");
//        BankAccount amirAccount = new BankAccount("SBIN0002814", 12345.25,
//                "Amir Syed", "test.test01@mailinator.com", "+91-901824123");
//        System.out.println("Actual Balance: "+amirAccount.getBalance());
//        double depositedMoney = amirAccount.depositFunds(2345);
//        System.out.println("Account balance: "+depositedMoney);
//        double withdrawn = amirAccount.withdrawFunds(15000);
//        if(withdrawn==0){
//            System.out.println("Insufficient funds");
//        }else{
//            System.out.println("Account Balance: "+withdrawn);
//        }
//
//        System.out.println("Account Number: "+amirAccount.getAccountNumber());
//        System.out.println("Customer Name: "+amirAccount.getCustomerName());
//        System.out.println("Email id: "+amirAccount.getEmail());
//        System.out.println("Phone No. "+amirAccount.getPhoneNumber());
//
//        BankAccount naimsAccount = new BankAccount("Naim", "Naim.bank@gmail.com",
//                "12345");
//        System.out.println(naimsAccount.getAccountNumber()+" name "+naimsAccount.getCustomerName());


//        VipCustomer cust01 = new VipCustomer();
//        System.out.println(cust01.getName());
//
//        VipCustomer cust02 = new VipCustomer("AMir", 25000, "test.test01@test.com");
//        System.out.println(cust02.getName());

//        Point first = new Point(6,5);
//        Point second = new Point(3,1);
//        System.out.println(first.distance());
//        System.out.println(first.distance(second));
//        System.out.println(first.distance(2,2));
//        Point point = new Point();
//        System.out.println(point.distance());

//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75,4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//
//        System.out.println("total cost: "+calculator.getTotalCost());
//
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4,4.5);
//        calculator = new Calculator(floor, carpet);
//
//        System.out.println("Total Cost: "+calculator.getTotalCost());

        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber number = new ComplexNumber(2.5,-1.5);
        one.add(1,1);
        System.out.println("One Real: "+one.getReal());
        System.out.println("One Imaginary: "+one.getImaginary());
        one.subtract(number);
        System.out.println("One Real: "+one.getReal());
        System.out.println("One Imaginary: "+one.getImaginary());
        number.subtract(one);
        System.out.println("Number Real: "+number.getReal());
        System.out.println("Number Imaginary: "+number.getImaginary());

    }

}
