package com.insurancepolicymanagementsystem;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PolicyManagementSystem system = new PolicyManagementSystem();

        // Add policies
        system.addPolicy(new Policy("P123", "John Doe", new Date(2023, 12, 31), "Health", 1000.0));
        system.addPolicy(new Policy("P456", "Jane Smith", new Date(2023, 11, 15), "Auto", 500.0));
        system.addPolicy(new Policy("P789", "Alice Johnson", new Date(2023, 10, 1), "Home", 1500.0));

        // Display all policies
        system.displayAllPolicies();

        // Display policies expiring soon
        system.displayPoliciesExpiringSoon();

        // Display policies by coverage type
        system.displayPoliciesByCoverageType("Auto");

        // Find duplicate policies
        system.addPolicy(new Policy("P123", "John Doe", new Date(2023, 12, 31), "Health", 1000.0)); // Duplicate
        system.findDuplicatePolicies();

        // Compare performance
        system.comparePerformance();
    }
}