package Builder;

public class Main {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println(vegMeal.getCost());


        Meal beefMeal = mealBuilder.prepareBeefMeal();
        beefMeal.showItems();
        System.out.println( beefMeal.getCost());
    }
}
