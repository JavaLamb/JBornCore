import L04.DayOfTheWeek;

void main() {
    int sale = saleDayOfWeek(DayOfTheWeek.SUNDAY);
    int sale2 = saleDayOfWeek(DayOfTheWeek.MONDAY);
    System.out.println(sale);
    System.out.println(factorial(4));

    System.out.println(piece(4));
}

static int saleDayOfWeek(DayOfTheWeek dayOfTheWeek) {
    return dayOfTheWeek.getKoef() * 10;
}

int factorial(int f) {
    if (f == 1) {
        return f;
    }
    return f * factorial(f - 1);
}

int piece(int n) {
    if (n == 1) {
        return 0;
    }
    return n + piece(n - 1);
}
