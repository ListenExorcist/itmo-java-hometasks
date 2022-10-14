package ru.itmo.homeworks.hw8;

public class School {
    private final String name;
    private Director director;
    private Teacher[] teachers;
    private Pupil[] pupils;

    public School(String name, Director director, Teacher[] teachers, Pupil[] pupils) {
        this.name = name;
        this.director = director;
        this.teachers = teachers;
        this.pupils = pupils;
    }

    public void dayAtSchool() {
        director.startLessons();
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                break;
            }
            for (int j = 0; j < pupils.length; j++) {
                if (pupils[i] == null) {
                    break;
                }
                if (teachers[i].getSubject().equals(pupils[j].getSubject())) {
                    teachers[i].teach(pupils[j]);
                }
            }
        }
        director.endLessons();
    }
}
