package Builder;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareBeefMeal() {
        Meal meal = new Meal();
        meal.addItem(new BeefBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
