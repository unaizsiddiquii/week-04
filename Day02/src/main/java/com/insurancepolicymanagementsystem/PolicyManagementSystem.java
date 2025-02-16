package com.insurancepolicymanagementsystem;

import java.util.*;

public class PolicyManagementSystem {
    // For quick lookups
    private Set<Policy> hashSet = new HashSet<>();
    // To maintain insertion order
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    // To maintain sorted order by expiry date
    private Set<Policy> treeSet = new TreeSet<>();

    // Add a policy to all sets
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    // Retrieve all unique policies
    public void displayAllPolicies() {
        System.out.println("All Policies (HashSet):");
        for (Policy policy : hashSet) {
            System.out.println(policy);
        }

        System.out.println("\nAll Policies (LinkedHashSet):");
        for (Policy policy : linkedHashSet) {
            System.out.println(policy);
        }

        System.out.println("\nAll Policies (TreeSet):");
        for (Policy policy : treeSet) {
            System.out.println(policy);
        }
    }

    // Retrieve policies expiring within the next 30 days
    public void displayPoliciesExpiringSoon() {
        // Get today's date
        Date today = new Date();

        // Calculate the date 30 days from now
        long millisecondsIn30Days = 30L * 24 * 60 * 60 * 1000; // 30 days in milliseconds
        Date futureDate = new Date(today.getTime() + millisecondsIn30Days);

        System.out.println("Policies Expiring Soon (within the next 30 days):");

        // Loop through all policies in the TreeSet
        for (Policy policy : treeSet) {
            Date expiryDate = policy.getExpiryDate();

            // Check if the policy expires between today and 30 days from now
            if (expiryDate.after(today) && expiryDate.before(futureDate)) {
                System.out.println(policy); // Print the policy
            }
        }
    }

    // Retrieve policies by coverage type
    public void displayPoliciesByCoverageType(String coverageType) {
        System.out.println("Policies with Coverage Type: " + coverageType);

        // Loop through all policies in the HashSet
        for (Policy policy : hashSet) {
            // Check if the policy's coverage type matches the given type (case-insensitive)
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(policy); // Print the policy
            }
        }
    }

    // Find duplicate policies based on policy numbers
    public void findDuplicatePolicies() {
        // Create a set to store unique policy numbers
        Set<String> policyNumbers = new HashSet<>();

        System.out.println("Duplicate Policies:");

        // Loop through all policies in the HashSet
        for (Policy policy : hashSet) {
            // Try to add the policy number to the set
            boolean isDuplicate = !policyNumbers.add(policy.getPolicyNumber());

            // If the policy number is already in the set, it's a duplicate
            if (isDuplicate) {
                System.out.println(policy); // Print the duplicate policy
            }
        }
    }

    // Performance comparison for adding, removing, and searching
    public void comparePerformance() {
        Policy samplePolicy = new Policy("P123", "John Doe", new Date(), "Health", 1000.0);

        // Adding
        long startTime = System.nanoTime();
        hashSet.add(samplePolicy);
        long endTime = System.nanoTime();
        System.out.println("HashSet Add Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedHashSet.add(samplePolicy);
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        treeSet.add(samplePolicy);
        endTime = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (endTime - startTime) + " ns");

        // Searching
        startTime = System.nanoTime();
        hashSet.contains(samplePolicy);
        endTime = System.nanoTime();
        System.out.println("HashSet Search Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedHashSet.contains(samplePolicy);
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet Search Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        treeSet.contains(samplePolicy);
        endTime = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (endTime - startTime) + " ns");

        // Removing
        startTime = System.nanoTime();
        hashSet.remove(samplePolicy);
        endTime = System.nanoTime();
        System.out.println("HashSet Remove Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedHashSet.remove(samplePolicy);
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet Remove Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        treeSet.remove(samplePolicy);
        endTime = System.nanoTime();
        System.out.println("TreeSet Remove Time: " + (endTime - startTime) + " ns");
    }
}