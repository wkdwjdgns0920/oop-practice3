package org.example;

import java.util.GregorianCalendar;
import java.util.List;

public class GradeCalculator {

    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public GradeCalculator(Courses courses){
        this.courses = courses;
    }

    public double calculateGrade() {
        // (학점수x교과목 평점)의 합계
        double totalMultipliedCreditAndCouseGrade = courses.multiplyCreditAndCourseGrade();

        // 수강신청 총학점 수
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();

        return totalMultipliedCreditAndCouseGrade / totalCompletedCredit;
    }
}
