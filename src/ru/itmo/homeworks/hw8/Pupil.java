package ru.itmo.homeworks.hw8;

import ru.itmo.homeworks.hw8.base.ClassroomHuman;
import ru.itmo.homeworks.hw8.base.Human;

public class Pupil extends ClassroomHuman {
    private int knowledge;

    public Pupil(String name, int age, String subject, int knowledge) {
        super(name, age, subject);
        setKnowledge(knowledge);
    }

    public int getKnowledge() {
        return knowledge;
    }

    private void setKnowledge(int knowledge) {
        if (knowledge < 0) {
            throw new IllegalArgumentException("уровень знаний не может быть меньше 0");
        }
        this.knowledge = knowledge;
    }

    public void learn(int teacherSkill) {
        knowledge += (int) (Math.random() * (teacherSkill + 1));
    }
}
