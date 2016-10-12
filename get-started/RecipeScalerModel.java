/*
 *	RecipeScalerModel.java
 * @author Marc Cataford
 */
public class RecipeScalerModel {
	public static void main(String[] args) {
		//The sample recipe; feel free to include your own!
		//Sidenote: this is an actual recipe for cookies, I highly recommend it!
		String[] ingredients = {"Flour (cups)", "Butter (cups)", "Brown sugar (cups)", "White sugar (cups)", "Eggs"};
		double[] quantities = {2.25, 1.0, 0.75, 0.75, 2.0};
		
		//Give this a value by which you want to 'scale' your recipe!
		int recipeMultiple;
		
		/*
		 * Insert your code here.
		 */
		
		/*
		 * Neat printing example: here, we print the first element of each array in a nice and
		 * readable way! It of course doesn't scale it up, so there's something to add to this.
		 * Also feel free to make it 'neater' by adding words, or making the recipe listing
		 * into sentences that use the numbers and ingredient names given in the arrays!
		 */
		System.out.println(ingredients[0] + ": " + quantities[0]);
		
	}
}
