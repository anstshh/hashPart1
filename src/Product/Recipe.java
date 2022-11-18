package Product;

import java.util.*;

public class Recipe {
    private String name;
    private Float recipeCost;
    private final Map<Product,Integer> products;
    private int count;


    public Recipe(String name) {
        setName(name);
        recipeCost = 0f;
        products = new HashMap<>();

    }
    public void addProduct(Product product){
        if (products.containsKey(product)){
            throw new IllegalArgumentException("Этот продукт уже в списке!");
        }
        products.put(product,count);
        recipeCost += product.getAmountProduct() + count ;
    }

    public String getName() {
        return name;
    }

    public Float getRecipeCost() {
        return recipeCost;
    }

    public Map<Product,Integer> getProducts() {
        return Collections.unmodifiableMap(products);
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Карточка товара заполнена не полностью!");
        }
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        if (Float.compare(recipe.recipeCost,recipeCost) !=0) return false;
        if (Objects.equals(name,recipe.name)) return false;
        return Objects.equals(products,recipe.products);
    }

    @Override
    public int hashCode() {{
            return Objects.hash(name, products, recipeCost);
        }
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", recipeCost=" + recipeCost +
                ", products=" + products +
                '}';
    }
}