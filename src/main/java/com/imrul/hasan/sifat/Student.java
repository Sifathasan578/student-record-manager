package com.imrul.hasan.sifat;

public final class Student {
    private final long id;
    private final String fullName;
    private final String bloodGroup;
    private final float cgpa;

    public Student(long id, String fullName, String bloodGroup, float cgpa) {
        this.id = id;
        this.fullName = fullName;
        this.bloodGroup = bloodGroup;
        this.cgpa = cgpa;
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("CGPA: " + cgpa);
    }

    public Boolean matchingCriteriaCheck(String query) {
        String[] parts = fullName.trim().split(" ");
        String lastWord = parts[parts.length - 1];

        return query.equalsIgnoreCase(lastWord) || query.equalsIgnoreCase(bloodGroup);
    }
}
