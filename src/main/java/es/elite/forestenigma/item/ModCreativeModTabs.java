package es.elite.forestenigma.item;

import es.elite.forestenigma.ForestEnigma;
import es.elite.forestenigma.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ForestEnigma.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FOREST_ENIGMA_TAB = CREATIVE_MODE_TABS.register("forest_enigma_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MOSSY_WOOD_LOG.get()))
                    .title(Component.translatable("creativetab.forestenigma.forestenigmatab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.MOSSY_WOOD_LOG.get());
                        output.accept(ModBlocks.MOSSY_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_MOSSY_WOOD_LOG.get());
                        output.accept(ModBlocks.STRIPPED_MOSSY_WOOD.get());
                        output.accept(ModBlocks.MOSSY_WOOD_PLANKS.get());
                        output.accept(ModBlocks.MOSSY_TREE_LEAVES.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
