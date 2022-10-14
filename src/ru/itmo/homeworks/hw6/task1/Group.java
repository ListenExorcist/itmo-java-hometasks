package ru.itmo.homeworks.hw6.task1;

public class Group {
    private boolean isRecruiting;
    private Alpinist[] alpinists;
    private Mountain mountain;

    public Group(boolean isRecruiting, Alpinist[] alpinists, Mountain mountain) {
        this.isRecruiting = isRecruiting;
        this.alpinists = alpinists;
        this.mountain = mountain;
    }

    public void addMember(Alpinist alpinist) {
        if (isRecruiting) {
            for (int i = 0; i < alpinists.length; i++) {
                if (alpinists[i] == null) {
                    alpinists[i] = alpinist;
                    return;
                }
            }
        }
    }
}
