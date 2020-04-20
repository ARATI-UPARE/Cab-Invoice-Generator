package com.bl.invoicegenerator.InvoiceGenerator;

public class Ride {

    public double distance;
    public final int time;
    public final CabService cabRide;

    public Ride(double distance, int time, CabService cabRide) {
        this.distance = distance;
        this.time = time;
        this.cabRide = cabRide;
    }
}
