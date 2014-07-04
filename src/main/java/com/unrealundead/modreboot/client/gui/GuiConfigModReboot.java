package com.unrealundead.modreboot.client.gui;

import com.unrealundead.modreboot.handlers.ConfigHandler;
import com.unrealundead.modreboot.reference.ConfigRef;
import com.unrealundead.modreboot.reference.GeneralRef;

import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;

public class GuiConfigModReboot extends GuiConfig
{
	public GuiConfigModReboot(GuiScreen guiScreen)
	{
		super(
				guiScreen,
				new ConfigElement(ConfigHandler.config.getCategory(ConfigRef.testCategory)).getChildElements(),
				GeneralRef.modId,
				false,
				false,
				GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString())
				);
			
	}
}
