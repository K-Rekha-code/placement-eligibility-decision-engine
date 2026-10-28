
public class Candidate {

    private String name;
    private double percentage;
    private int backlogs;
    private int graduationYear;

    public Candidate(
            String name,
            double percentage,
            int backlogs,
            int graduationYear
    ) {
        this.name = name;
        this.percentage = percentage;
        this.backlogs = backlogs;
        this.graduationYear = graduationYear;
    }

    // --- Getters ---

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public int getBacklogs() {
        return backlogs;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    // --- Setters ---

    public void setName(String name) {
        this.name = name;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void setBacklogs(int backlogs) {
        this.backlogs = backlogs;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }
}
