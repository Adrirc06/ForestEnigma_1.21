package es.elite.forestenigma.datagen;

import es.elite.forestenigma.ForestEnigma;
import es.elite.forestenigma.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ForestEnigma.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.MOSSY_WOOD_LOG.get())
                .add(ModBlocks.MOSSY_WOOD.get())
                .add(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get())
                .add(ModBlocks.STRIPPED_MOSSY_WOOD.get())
                .add(ModBlocks.MOSSY_WOOD_PLANKS.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.MOSSY_WOOD_LOG.get())
                .add(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get())
                .add(ModBlocks.MOSSY_WOOD.get())
                .add(ModBlocks.STRIPPED_MOSSY_WOOD.get());
    }
}
