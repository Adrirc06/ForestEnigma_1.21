package es.elite.forestenigma.worldgen.tree;

import es.elite.forestenigma.ForestEnigma;
import es.elite.forestenigma.worldgen.ModConfiguredFeatures;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower MOSSY = new TreeGrower(ForestEnigma.MOD_ID + ":mossy",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MOSSY_KEY), Optional.empty());


}
