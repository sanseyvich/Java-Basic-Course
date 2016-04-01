package ua.artcode.oop.week2.homework.src;

import java.util.Arrays;

/**
 * Created by olsas on 3/29/2016.
 */
public abstract class Student {
    private String name;
    private String adress;
    private Subject[] schedule;

    public Student() {
        this.name = "DefaultName";
        this.adress = "DefaultAdress";
        this.schedule = new Subject[3];
    }

    public abstract void study();

    protected void addSubject(Subject subject) {
        Subject[] newSchedule = Arrays.copyOf(schedule, schedule.length + 1);
        newSchedule[newSchedule.length - 1] = subject;
        schedule = newSchedule;
    }

    protected void deleteLastSubject() {
        Subject[] newSchedule = Arrays.copyOf(schedule, schedule.length - 1);
        schedule = newSchedule;
    }

    public String getScheduleInfo() {
        String info = "";
        for (Subject subject : schedule) {
            info += subject == null ? "null;" : subject.getInfo();
        }
        return info;
    }

    public int getAverageMark() {
        int scheduleSum = 0;
        for (int i = 0; i < schedule.length; i++) {
            scheduleSum += schedule[i] == null ? 0 : schedule[i].getMark();
        }
        return scheduleSum / schedule.length;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getAdress() {
        return adress;
    }

    protected void setAdress(String adress) {
        this.adress = adress;
    }

    public Subject[] getSchedule() {
        return schedule;
    }

    protected void setSchedule(Subject[] schedule) {
        this.schedule = schedule;
    }

}
