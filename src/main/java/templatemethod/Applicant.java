package templatemethod;

public abstract class Applicant {
    private String ID;
    protected String name;
    private float closedBookExamGrade;
    private float openBookExamGrade;
    private float essayGrade;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getClosedBookExamGrade() {
        return closedBookExamGrade;
    }

    public void setClosedBookExamGrade(float closedBookExamGrade) {
        this.closedBookExamGrade = closedBookExamGrade;
    }

    public float getOpenBookExamGrade() {
        return openBookExamGrade;
    }

    public void setOpenBookExamGrade(float openBookExamGrade) {
        this.openBookExamGrade = openBookExamGrade;
    }

    public float getEssayGrade() {
        return essayGrade;
    }

    public void setEssayGrade(float essayGrade) {
        this.essayGrade = essayGrade;
    }

    public float generateAverage() {
        return (this.closedBookExamGrade + this.openBookExamGrade + this.essayGrade)/3;
    }

    public abstract String checkApproval();

    public String getType() {
        return "Applicant ";
    }

    public String getInfo() {
        return getType() + "named " + this.name + ", ID (" + this.ID + "): " + this.checkApproval() + ".";
    }
}

