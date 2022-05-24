package com.github.nearata.nohurtcameraeffect.mixin;

import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.github.nearata.nohurtcameraeffect.NoHurtCameraEffect;

@Mixin(GameRenderer.class)
public class GameRendererMixin
{
    @Inject(at = @At("HEAD"), method = "bobViewWhenHurt", cancellable = true)
    private void bobViewWhenHurt(MatrixStack matrices, float tickDelta, CallbackInfo info)
    {
        if (NoHurtCameraEffect.MODCONFIG.toggle)
        {
            info.cancel();
        }
    }
}
