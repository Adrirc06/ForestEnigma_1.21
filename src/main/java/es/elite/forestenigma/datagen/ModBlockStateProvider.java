package es.elite.forestenigma.datagen;

import es.elite.forestenigma.ForestEnigma;
import es.elite.forestenigma.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ForestEnigma.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.CARITA_BLOCK);
        blockWithItem(ModBlocks.MOSSY_WOOD_PLANKS);

        logBlock(ModBlocks.MOSSY_WOOD_LOG.get());
        axisBlock(ModBlocks.MOSSY_WOOD.get(), blockTexture(ModBlocks.MOSSY_WOOD_LOG.get()), blockTexture(ModBlocks.MOSSY_WOOD_LOG.get()));
        logBlock(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get());
        axisBlock(ModBlocks.STRIPPED_MOSSY_WOOD.get(), blockTexture(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get()), blockTexture(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get()));

        blockItem(ModBlocks.MOSSY_WOOD_LOG);
        blockItem(ModBlocks.MOSSY_WOOD);
        blockItem(ModBlocks.STRIPPED_MOSSY_WOOD_LOG);
        blockItem(ModBlocks.STRIPPED_MOSSY_WOOD);
    }


    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    @Override
    public void simpleBlockItem(Block block, ModelFile model) {
        super.simpleBlockItem(block, model);
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("forestenigma:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("forestenigma:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }
}
