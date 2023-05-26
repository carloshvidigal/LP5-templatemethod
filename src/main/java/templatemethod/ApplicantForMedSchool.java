package templatemethod;

public class ApplicantForMedSchool extends Applicant{
    public String checkApproval() {
        if (this.generateAverage() >= 7.8) {
            return "Approved to enter medical school";
        }else {
            return "Not approved to enter medical school";
        }
    }
}
