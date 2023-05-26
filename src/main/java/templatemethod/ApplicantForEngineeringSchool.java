package templatemethod;

public class ApplicantForEngineeringSchool extends Applicant {

    public String checkApproval() {
        if (this.generateAverage() >= 6.5) {
            return "Approved to enter engineering school";
        }else {
            return "Not approved to enter engineering school";
        }
    }
}

