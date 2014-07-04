package com.unrealundead.modreboot.handlers;

import java.io.File;

import com.unrealundead.modreboot.reference.ConfigRef;
import com.unrealundead.modreboot.reference.GeneralRef;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler
{
	public static Configuration config;
	
	public static void initialize(File configFile)
	{
		// This will create a file in E:\Java Workspace\Minecraft\1.7\MinecraftModReboot\eclipse\config
		if(config == null)
		{
			config = new Configuration(configFile);//from net.minecraftforge.common.config.Configuration
			syncConfig();
		}			
	}
	
	public static void syncConfig()
	{
		ConfigRef.testValue = config.get(ConfigRef.testCategory, "Test Value", 0, "This is just a test value").getInt();

		if(config.hasChanged())
		{
			config.save();
		}
	}
	
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if(event.modID.equals(GeneralRef.modId))
		{
			syncConfig();	
		}
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	}
}
