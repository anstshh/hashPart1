package Product;

public class Main {
            public static void main(String[] args) {

                var productList = new ProductList();

                productList.add("Сельдерей", 50f,10f);
                productList.add("Укроп", 100f, 25f);
                productList.add("Тунец", 150f, 13f);
                productList.add("Манго", 200f, 31f);
                productList.add("Чипсы", 250f, 14f);
                productList.add("Кабачок", 125f, 35f);
                productList.add("Морковка", 50f,10f);
                productList.add("Салат",330f,55f);

                productList.show();

                var recipeBook = new RecipeBook();

                var recipe = new Recipe("Салат из овощей");
                recipe.addProduct(new Product("Кабачок", 100f, 25f));
                recipe.addProduct(new Product("Морковка", 150f, 13f));
                recipeBook.addRecipe(recipe);
            }

}
