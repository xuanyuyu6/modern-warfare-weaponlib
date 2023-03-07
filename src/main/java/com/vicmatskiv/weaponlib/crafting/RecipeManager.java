package com.vicmatskiv.weaponlib.crafting;

import static com.vicmatskiv.weaponlib.compatibility.CompatibilityProvider.compatibility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.compatibility.CompatibleItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipeManager {

    private static final Logger logger = LogManager.getLogger(RecipeManager.class);

    private RecipeGenerator recipeGenerator = new RecipeGenerator();

    private Map<Item, List<Object>> recipes = new HashMap<>();

    public List<Object> createShapedRecipe(Item item, String name, OptionsMetadata optionsMetadata) {
        List<Object> recipe = recipeGenerator.createShapedRecipe(name, optionsMetadata);
        if(recipes.put(item, recipe) != null) {
            logger.warn("Duplicate recipe registered for item {}", item);
        }
        return recipe;
    }

    public List<Object> registerShapedRecipe(Item item, Object...recipe) {
        return registerShapedRecipe(new ItemStack(item), recipe);
    }

    public List<Object> registerShapedRecipe(ItemStack itemStack, Object...recipe) {
        List<Object> recipeAslist = new ArrayList<>(recipe.length);
        boolean hasOres = false;
        for(Object option: recipe) {
            if(option instanceof CompatibleBlocks) {
                option = ((CompatibleBlocks) option).getBlock();
            } else if(option instanceof CompatibleItems) {
                option = ((CompatibleItems) option).getItem();
            } else if(option instanceof String) {
                hasOres = true;
            }
            recipeAslist.add(option);
        }

        if(hasOres) {
            compatibility.addShapedOreRecipe(itemStack, recipeAslist.toArray());
        } else {
            compatibility.addShapedRecipe(itemStack, recipeAslist.toArray());
        }

        if(recipes.put(itemStack.getItem(), recipeAslist) != null) {
            logger.warn("Duplicate recipe registered for item {}", itemStack.getItem());
        }
        return recipeAslist;
    }

    public List<Object> getRecipe(Item item) {
        return recipes.get(item);
    }

}
