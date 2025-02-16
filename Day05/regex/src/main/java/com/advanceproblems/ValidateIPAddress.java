package com.advanceproblems;

public class ValidateIPAddress {

    //method to find valid ip address
    public static void findValidIPAddress(String[] testIPs) {

        String regex = "\\b((25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\b";

        //displaying valid and invalid IP address
        for (String ip : testIPs) {
            if (ip.matches(regex)) {
                System.out.println(ip + " is valid: ");
            } else {
                System.out.println(ip + " Invalid: ");
            }
        }
    }

    public static void main(String[] args) {

        //list of IP address
        String[] testIPs = {
                "192.168.1.1",   // Valid
                "255.255.255.255", // Valid
                "256.100.100.100", // Invalid
                "192.168.1",      // Invalid
                "192.168.1.300",  // Invalid
                "10.0.0.1"        // Valid
        };

        findValidIPAddress(testIPs);

    }
}
