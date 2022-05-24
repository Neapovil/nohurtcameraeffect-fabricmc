package com.github.nearata.nohurtcameraeffect;

import com.github.nearata.nohurtcameraeffect.modmenu.ModConfig;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;

public class NoHurtCameraEffect implements ClientModInitializer
{
    public static ModConfig MODCONFIG;

    @Override
    public void onInitializeClient()
    {
        AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
        MODCONFIG = (ModConfig) AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }
}
