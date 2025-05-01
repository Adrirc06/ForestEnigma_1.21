package es.elite.forestenigma.datagen;

import es.elite.forestenigma.block.ModBlocks;
import es.elite.forestenigma.item.ModItems;
import es.elite.forestenigma.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_WOOD_PLANKS.get(), 4)
                .requires(ModTags.Items.MOSSY_WOOD_BLOCKS)
                        .unlockedBy(getHasName(ModBlocks.MOSSY_WOOD_LOG.get()), has(ModBlocks.MOSSY_WOOD_LOG.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_WOOD.get(), 3)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.MOSSY_WOOD_LOG.get())
                .unlockedBy(getHasName(ModBlocks.MOSSY_WOOD_LOG.get()), has(ModBlocks.MOSSY_WOOD_LOG.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_MOSSY_WOOD.get(), 3)
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get())
                .unlockedBy(getHasName(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get()), has(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get())).save(pRecipeOutput);

        stairBuilder(ModBlocks.MOSSY_WOOD_STAIRS.get(), Ingredient.of(ModBlocks.MOSSY_WOOD_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.MOSSY_WOOD_PLANKS.get()), has(ModBlocks.MOSSY_WOOD_PLANKS.get())).save(pRecipeOutput);

        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_WOOD_SLAB.get(), ModBlocks.MOSSY_WOOD_PLANKS.get());

        buttonBuilder(ModBlocks.MOSSY_WOOD_BUTTON.get(), Ingredient.of(ModBlocks.MOSSY_WOOD_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.MOSSY_WOOD_PLANKS.get()), has(ModBlocks.MOSSY_WOOD_PLANKS.get())).save(pRecipeOutput);

        pressurePlate(pRecipeOutput, ModBlocks.MOSSY_WOOD_PRESSURE_PLATE.get(), ModBlocks.MOSSY_WOOD_PLANKS.get());

        fenceBuilder(ModBlocks.MOSSY_WOOD_FENCE.get(), Ingredient.of(ModBlocks.MOSSY_WOOD_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.MOSSY_WOOD_PLANKS.get()), has(ModBlocks.MOSSY_WOOD_PLANKS.get())).save(pRecipeOutput);

        fenceGateBuilder(ModBlocks.MOSSY_WOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.MOSSY_WOOD_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.MOSSY_WOOD_PLANKS.get()), has(ModBlocks.MOSSY_WOOD_PLANKS.get())).save(pRecipeOutput);

        doorBuilder(ModBlocks.MOSSY_WOOD_DOOR.get(), Ingredient.of(ModBlocks.MOSSY_WOOD_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.MOSSY_WOOD_PLANKS.get()), has(ModBlocks.MOSSY_WOOD_PLANKS.get())).save(pRecipeOutput);

        trapdoorBuilder(ModBlocks.MOSSY_WOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.MOSSY_WOOD_PLANKS.get()))
                .unlockedBy(getHasName(ModBlocks.MOSSY_WOOD_PLANKS.get()), has(ModBlocks.MOSSY_WOOD_PLANKS.get())).save(pRecipeOutput);
    }
}
