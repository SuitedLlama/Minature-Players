package com.suitedllama.miniatureplayers.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.PlayerEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntityRenderer.class)
public class PlayerEntityRendererMixin {
	@Inject(at = @At("HEAD"), method = "scale")
	protected void scale(AbstractClientPlayerEntity abstractClientPlayerEntity, MatrixStack matrixStack, float f, CallbackInfo ci) {
		if(!abstractClientPlayerEntity.getDisplayName().asString().equals("SuitedLlama")){
			matrixStack.scale(0.4F, 0.4F, 0.4F);
		}
	}
}
