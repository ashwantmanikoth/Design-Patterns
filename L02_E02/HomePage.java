package L02_E02;

public class HomePage {
    private WorkoutPlan workoutPlan;
    private MealPlan mealPlan;

    public void setGoal(GoalFactory goalFactory) {
        workoutPlan = goalFactory.createWorkoutPlan();
        mealPlan = goalFactory.createMealPlan();

        //implementation of created plans from the factory
        mealPlan.showMeals();
        workoutPlan.showWorkoutPlan();
        }
}
