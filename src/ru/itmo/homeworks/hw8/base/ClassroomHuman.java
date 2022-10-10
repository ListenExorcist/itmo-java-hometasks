package ru.itmo.homeworks.hw8.base;

public class ClassroomHuman extends Human {
    private String subject;

    public ClassroomHuman(String name, int age, String subject) {
        super(name, age);
        setSubject(subject);
    }

    public String getSubject() {
        return subject;
    }

    private void setSubject(String subject) {
        if (subject == null) {
            throw new IllegalArgumentException("имя предмета не может быть null");
        }
        if (subject.equals("")) {
            throw new IllegalArgumentException("имя предмета не может быть пустым");
        }
        this.subject = subject;
    }
}
