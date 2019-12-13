package kebab;

import kebab.ingredient.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class Assiette {

    private List<Ingredient> ingredients;

    public Assiette(){
        this.ingredients = new ArrayList<Ingredient>();
    }

    public Assiette avec(Ingredient ingredient) {
        this.ingredients.add(ingredient);
        return this;
    }

    public Kebab confectionnerKebab() {
        return new Kebab(ingredients);
    }
}
