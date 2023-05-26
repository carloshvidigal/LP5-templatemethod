package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicantForEngineeringSchoolTest {

    @Test
    void shouldReturnApproved() {
        ApplicantForEngineeringSchool applicant = new ApplicantForEngineeringSchool();
        applicant.setClosedBookExamGrade(6.0f);
        applicant.setOpenBookExamGrade(8.0f);
        applicant.setEssayGrade(8.5f);
        assertEquals("Approved to enter engineering school", applicant.checkApproval());
    }

    @Test
    void shouldReturnNotApproved() {
        ApplicantForEngineeringSchool applicant = new ApplicantForEngineeringSchool();
        applicant.setClosedBookExamGrade(4.0f);
        applicant.setOpenBookExamGrade(5.0f);
        applicant.setEssayGrade(5.5f);
        assertEquals("Not approved to enter engineering school", applicant.checkApproval());
    }

    @Test
    void shouldReturnApplicantInfo() {
        ApplicantForEngineeringSchool applicant = new ApplicantForEngineeringSchool();
        applicant.setClosedBookExamGrade(5.0f);
        applicant.setOpenBookExamGrade(5.5f);
        applicant.setEssayGrade(9.5f);
        applicant.setID("198239");
        applicant.setName("Amarildo Bicão");
        assertEquals("Applicant named Amarildo Bicão, ID (198239): Approved to enter engineering school.", applicant.getInfo());

    }
}
