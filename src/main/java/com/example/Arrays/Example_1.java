package com.example.Arrays;

public class Example_1 {
    //აქ ხდება დეკლარაცია მასივის
    int[] month_days = new  int[12];

    //აქ კი დეკლარაციაც და ინიციალიზაციაც ერთდროულად ხდება
    String[] weekdays =  {"monday", "tuesday", "wednesday", "thursday", "friday"};

// 12 ელემენტიან დეკლარირებულ მასივს მინიჭებას ვუკეთებთ კონსტრუქტორში
    public Example_1() {
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3]= 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 30;
        month_days[8] = 31;
        month_days[9] = 30;
        month_days[10] = 31;
        month_days[11] = 30;
    }

    public void printArray() {
        System.out.println("january has "+month_days[0]+" days");
        System.out.println("second weekday is: " + weekdays[1]);
    }
}
