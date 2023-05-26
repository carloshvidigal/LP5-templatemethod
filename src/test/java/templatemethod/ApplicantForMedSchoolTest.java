package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicantForMedSchoolTest {

    @Test
    void shouldReturnApproved() {
        ApplicantForMedSchool applicant = new ApplicantForMedSchool();
        applicant.setClosedBookExamGrade(6.8f);
        applicant.setOpenBookExamGrade(8.6f);
        applicant.setEssayGrade(8.5f);
        assertEquals("Approved to enter medical school", applicant.checkApproval());
    }

    @Test
    void shouldReturnNotApproved() {
        ApplicantForMedSchool applicant = new ApplicantForMedSchool();
        applicant.setClosedBookExamGrade(4.5f);
        applicant.setOpenBookExamGrade(6.0f);
        applicant.setEssayGrade(9.5f);
        assertEquals("Not approved to enter medical school", applicant.checkApproval());
    }

    @Test
    void shouldReturnApplicantInfo() {
        ApplicantForMedSchool applicant = new ApplicantForMedSchool();
        applicant.setClosedBookExamGrade(5.0f);
        applicant.setOpenBookExamGrade(5.5f);
        applicant.setEssayGrade(9.5f);
        applicant.setID("925092");
        applicant.setName("WaLe Escka Doifetti");
        assertEquals("Applicant named WaLe Escka Doifetti, ID (925092): Not approved to enter medical school.", applicant.getInfo());

    }
}
