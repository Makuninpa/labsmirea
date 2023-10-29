package laba4;

public class Seasonstest {
    public static void main(String[] args) {
        Seasons myFavoriteSeason = Seasons.SUMMER;
        System.out.println("Мое любимое время года: " + myFavoriteSeason);
        System.out.println("Средняя температура: " + myFavoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание времени года: " + myFavoriteSeason.getDescription());

        System.out.println("============================================");

        for (Seasons seasons : Seasons.values()) {
            System.out.println("Время года: " + seasons);
            System.out.println("Средняя температура: " + seasons.getAverageTemperature() + "°C");
            System.out.println("Описание времени года: " + seasons.getDescription());
            System.out.println("--------------------------------------------");
        }

        Seasons.printSeasonDescription(myFavoriteSeason);
    }

}
