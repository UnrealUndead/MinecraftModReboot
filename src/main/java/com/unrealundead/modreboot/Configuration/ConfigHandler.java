package com.unrealundead.modreboot.Configuration;

import java.io.File;
import com.unrealundead.modreboot.reference.ConfigRef;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler
{
	
	
	public static void initialisation(File configFile)
	{
		// This will create a file in E:\Java Workspace\Minecraft\1.7\MinecraftModReboot\eclipse\config
		Configuration config = new Configuration(configFile);//from net.minecraftforge.common.config.Configuration
		
		try
		{
			config.load();	
			ConfigRef.testValue = config.get("Test Category", "Test Value", 0, "This is just a test value").getInt();
		}
		catch(Exception ex)
		{
			//Throw exception and log it
		}
		finally
		{
			config.save();
		}
	}	
}
