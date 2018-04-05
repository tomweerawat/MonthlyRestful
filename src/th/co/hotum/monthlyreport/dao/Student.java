package th.co.hotum.monthlyreport.dao;

public class Student {
    private int id;
    private String name;
    private String branch;
    private int percentage;
    private int phone;
    private String email;

    public Student(int id, String name, String branch, int percentage, int phone, String email) {
        super();
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.percentage = percentage;
        this.phone = phone;
        this.email = email;
    }

    public Student() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getBranch() {
        return branch;
    }

    public int getPercentage() {
        return percentage;
    }

}
