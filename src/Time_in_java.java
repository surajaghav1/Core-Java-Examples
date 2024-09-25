/*
currentTimeMillis() :
        This function is used to get milliseconds from 1 january  1970
        java gives output in format of milliseconds, and we need to convert it into second,minute,hour,year
         syntax :
         System.currentTimeMillis()

second,minute,hour,year : from 1 jan 1970

          second =System.currentTimeMillis()/1000;
          minute = System.currentTimeMillis()/1000/3600;
          hour = System.currentTimeMillis()/1000/3600/24;
          year = System.currentTimeMillis()/1000/3600/24/365;
 */

public class Time_in_java {
    public static void main(String[] args) {
        System.out.println("Milliseconds upto now from 19 jan  1970 : "+System.currentTimeMillis());
        System.out.println("Seconds from 19 jan 1970 : "+System.currentTimeMillis()/1000);
        float f=System.currentTimeMillis()/1000/3600;
        System.out.println(f);
        System.out.println(f/24/365);
        System.out.println("time : "+System.currentTimeMillis()/1000/3600/24/365);
    }
}
