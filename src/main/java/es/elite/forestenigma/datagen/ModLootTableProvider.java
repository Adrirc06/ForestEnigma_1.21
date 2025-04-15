package es.elite.forestenigma.datagen;

import es.elite.forestenigma.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModLootTableProvider extends BlockLootSubProvider {
    protected ModLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.MOSSY_WOOD_LOG.get());
        dropSelf(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get());
        dropSelf(ModBlocks.MOSSY_WOOD_PLANKS.get());
        dropSelf(ModBlocks.CARITA_BLOCK.get());
        dropSelf(ModBlocks.MOSSY_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_MOSSY_WOOD.get());
        dropSelf(ModBlocks.MOSSY_TREE_LEAVES.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
