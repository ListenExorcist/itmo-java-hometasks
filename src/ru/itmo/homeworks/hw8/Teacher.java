package ru.itmo.homeworks.hw8;

import ru.itmo.homeworks.hw8.base.ClassroomHuman;
import ru.itmo.homeworks.hw8.base.Human;

public class Teacher extends ClassroomHuman {
    private int skill;

    public Teacher(String name, int age, String subject, int skill) {
        super(name, age, subject);
        setSkill(skill);
    }

    private void setSkill(int skill) {
        if (skill < 0) {
            throw new IllegalArgumentException("навык не может быть меньше 0");
        }
        this.skill = skill;
    }

    public void teach(Pupil pupil) {
        pupil.learn(skill);
    }
}
