package L02_E02;

public class StrengthTrainingFactory implements GoalFactory{
    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new StrengthTrainingWorkout();
    }

    @Override
    public MealPlan createMealPlan() {
        return new StrengthTrainingMealPlan();
    }
}
