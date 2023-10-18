package tacos.data;

import tacos.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();         //wykonanie zapytania pobierajacaego wszystkie elementy kolekcji Ingredient
    Ingredient findById(String id);         //wykonanie zapyatnai pobierajacaego jeden element Infgredient na podstawie wartosci id
    Ingredient save(Ingredient ingredient); //zapisanie obiektu Ingradient
}
