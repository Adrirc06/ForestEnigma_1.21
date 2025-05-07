package es.elite.forestenigma.villages;

import com.google.common.collect.ImmutableSet;
import es.elite.forestenigma.ForestEnigma;
import es.elite.forestenigma.block.ModBlocks;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
                DeferredRegister.create(ForgeRegistries.POI_TYPES, ForestEnigma.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
                DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, ForestEnigma.MOD_ID);



    public static final RegistryObject<PoiType> ForestEnigma_POI = POI_TYPES.register("forestEnigma_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.CARITA_BLOCK.get().getStateDefinition().getPossibleStates()),
                    1, 1));



    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }


}
