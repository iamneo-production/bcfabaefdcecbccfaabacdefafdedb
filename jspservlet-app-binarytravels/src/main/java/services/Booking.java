package services;

public class Booking{
//	Enter code here...
    public double booking(int noOfPersons,int rates){
        int total = noOfPersons*rates;
        return Double.parseDouble(total+"");
    }
}

