package main.practice3;


public class WorkingClass {

    public static void main(String[] args) {
        getResult("MONDAY");
        getResult("tuesDay");
        getResult("sunday");
        getResult("saturday");
        getResult("1");
        getResult("2");
        getResult("5");
        getResult("7");
        getResult("0");
        getResult("8");
        getResult("apple");
        getResult("sunday sunday");
    }

    private static void getResult(String s) {
        if (!isDigit(s)) {
            dayOfTheWeek(s);
        } else {
            int day = Integer.parseInt(s);
            if (day >= 1 && day <= 5) {
                getDayOf(day);
                System.out.println(workingDay());
            } else if (day > 5 && day <= 7) {
                getDayOf(day);
                System.out.println(weekend());
            } else {
                System.out.println("The day is not exist ---> " + day);
            }
        }
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    private static String workingDay() {
        return " it's a working day";
    }

    private static String weekend() {
        return " it's a weekend";
    }

    private static void getDayOf(int a) {
        WeekDay[] weekDay = WeekDay.values();
        for (WeekDay weekDay1 : weekDay) {
            if (weekDay1.getNumber() == a) {
                System.out.print(weekDay1.name().toLowerCase());
                return;
            }
        }
    }

    private static void dayOfTheWeek(String text) {
        WeekDay[] weekDays = WeekDay.values();
        for (WeekDay weekDay : weekDays) {
            if (weekDay.name().equals(text.toUpperCase())) {
                if (text.equalsIgnoreCase("saturday") || text.equalsIgnoreCase("sunday")) {
                    System.out.println(text.toLowerCase() + weekend());
                } else {
                    System.out.println(text.toLowerCase() + workingDay());
                }
                return;
            }
        }
        System.out.println(text + "---> the day is not exist");
    }


}
