package com.practice.oops.encapsulation;

public class Test1 {
    public static void main(String[] args) {
        User user = new User("Allu Arjun", "Saalar", 44, 9948488370L);
        user.display();

        user.setPhoneNumber(-868804618L); // invalid
        user.setAge(-45);                 // invalid

        System.out.println(user.getAge());

        long phoneNumber1 = 8499931370L;
        System.out.println(user.getPhoneNumber() == phoneNumber1);

        user.display();
    }
}
