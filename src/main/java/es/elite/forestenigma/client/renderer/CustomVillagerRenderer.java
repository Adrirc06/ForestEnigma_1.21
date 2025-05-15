package es.elite.forestenigma.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.VillagerModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.VillagerRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.Villager;

public class CustomVillagerRenderer extends VillagerRenderer {

    public CustomVillagerRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(Villager villager) {
        if ("kaupenger".equals(villager.getVillagerData().getProfession().toString())) {
            return ResourceLocation.fromNamespaceAndPath("forestenigma", "textures/entity/villager/profession/kaupenger.png");
        }
        return super.getTextureLocation(villager);
    }
}
