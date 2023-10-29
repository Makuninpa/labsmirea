package laba4;

public enum Seasons {
    SPRING(10),
    SUMMER(30),
    AUTUMN(8),
    WINTER(-15);

    private int averageTemperature;

    Seasons(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getDescription() {
        if (this == SUMMER) {
            return "Тёплое время года";
        } else {
            return "Холодное время года";
        }
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public static void printSeasonDescription(Seasons seasons) {
        switch (seasons) {
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
        }
    }
}

