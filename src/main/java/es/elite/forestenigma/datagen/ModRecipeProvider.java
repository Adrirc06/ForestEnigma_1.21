package es.elite.forestenigma.datagen;

import es.elite.forestenigma.block.ModBlocks;
import es.elite.forestenigma.item.ModItems;
import es.elite.forestenigma.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
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

    }
}
