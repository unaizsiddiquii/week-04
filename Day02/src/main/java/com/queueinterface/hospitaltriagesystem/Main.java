package com.queueinterface.hospitaltriagesystem;

public class Main {
    public static void main(String[] args) {
        HospitalTriageSystem<Integer> cb = new HospitalTriageSystem<>(3);
        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.display();
        cb.add(4);
        cb.display();
    }
}
