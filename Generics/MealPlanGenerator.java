import java.util.*;
interface MealPlan{
	void generateMeal();
}
class VegetarianMeal implements MealPlan{
	public void generateMeal(){
		System.out.println("Generating Vegetarian Meal Plan");
	}
}
class VeganMeal implements MealPlan{
	public void generateMeal(){
		System.out.println("Generating Vegan Meal Plan");
	}
}
class KetoMeal implements MealPlan{
	public void generateMeal(){
		System.out.println("Generating Keto Meal Plan");
	}
}
class HighProteinMeal implements MealPlan{
	public void generateMeal(){
		System.out.println("Generating High-Protein Meal Plan");
	}
}
class Meal<T extends MealPlan>{
	private T mealPlan;
	public Meal(T mealPlan){
		this.mealPlan=mealPlan;
	}
	public void generate(){
		mealPlan.generateMeal();
	}
}
class MealPlanner{
	public <T extends MealPlan> void validateAndGenerateMeal(T mealPlan){
		if(mealPlan instanceof MealPlan)mealPlan.generateMeal();
		else System.out.println("Invalid Meal Plan.");
	}
}
public class MealPlanGenerator{
    public static void main(String[] args){
		Meal<VegetarianMeal> vegetarianMeal=new Meal<>(new VegetarianMeal());
		Meal<VeganMeal> veganMeal=new Meal<>(new VeganMeal());
		Meal<KetoMeal> ketoMeal=new Meal<>(new KetoMeal());
		Meal<HighProteinMeal> highProteinMeal=new Meal<>(new HighProteinMeal());
		vegetarianMeal.generate();
		veganMeal.generate();
		ketoMeal.generate();
		highProteinMeal.generate();
		MealPlanner planner=new MealPlanner();
		planner.validateAndGenerateMeal(new VegetarianMeal());
		planner.validateAndGenerateMeal(new KetoMeal());
	}
}