package L04;

public enum DayOfTheWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(3),
    FRIDAY(6),
    SATURDAY(8),
    SUNDAY(2);
    int koef;
    DayOfTheWeek(int koef) {
        koef = this.koef;
    }

    public int getKoef() {
        return koef;
    }
}

