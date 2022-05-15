public class HW8 {


    public static void main(String[] args) {
        int cats = 8;
        int dogs = 24;
        int numbersOfMeals = 3;
        int foodPrice = 2;
        int foodWeight = 50;

        int weightPerDayCats;
        int weightPerMonthCats = 0;
        int pricePerDayCats;

        int weightPerMonthDogs = 0;
        int weightPerDayDogs;
        int pricePerDayDogs;

        int pricePerMonth = 0;

        weightPerDayCats = cats * numbersOfMeals * foodWeight;
        pricePerDayCats = cats * numbersOfMeals * foodPrice;

        weightPerDayDogs = dogs * numbersOfMeals * foodWeight;
        pricePerDayDogs = dogs * numbersOfMeals * foodPrice;

        for (int day = 1; day <= 30; day++) {
            weightPerMonthCats += weightPerDayCats;
        }

        System.out.println("Weight Per month for cats :" + weightPerMonthCats);

        for (int day = 1; day <= 30; day++) {
            weightPerMonthDogs += weightPerDayDogs;
        }

        System.out.println("Weight Per month for Dogs :" + weightPerMonthDogs);

        for (int day=1; day <=30; day++ ) {
            pricePerMonth += pricePerDayCats+pricePerDayDogs;
        }
        System.out.println("Amount for the shelter :"+ pricePerMonth);
    }











}
