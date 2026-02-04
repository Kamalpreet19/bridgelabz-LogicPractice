package com.test;

import junit.framework.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvoiceServiceTest {
    InvoiceGenerator invoiceGenerator=null;
@BeforeMethod
public void setUp() throws Exception{
     invoiceGenerator = new InvoiceGenerator();
}



    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {

        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals( 25.0, fare);

    }

    @Test
    public void givenLessDistanceAndTime_ShouldReturnTotalFare(){

        double distance=0.1;
        int time=1;
        double fare=invoiceGenerator.calculateFareForLessDistanceTime(distance,time);
        Assert.assertEquals(5.0, fare);

    }


    @Test
//    public void givenMultipleRides_ShouldReturnTotalFare(){
//    Ride[] rides={ new Ride(2.0, 5),
//            new Ride(0.1, 1)};
//
//    double fare=invoiceGenerator.calculateFareForRide(rides);
//        Assert.assertEquals(30.0, fare);
//
//
//}

            public void givenMultipleRides_ShouldReturnInvoiceSummary(){
        Ride[] rides={ new Ride(2.0, 5),
        new Ride(0.1, 1)};

        InvoiceSummary summary=invoiceGenerator.calculateFareForRide(rides);
        InvoiceSummary expectedInvoiceSummary=new InvoiceSummary(2, 30.0);
        Assert.assertEquals(expectedInvoiceSummary, summary);


    }

}