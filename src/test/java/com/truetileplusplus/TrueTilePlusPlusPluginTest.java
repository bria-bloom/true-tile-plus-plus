package com.truetileplusplus;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class TrueTilePlusPlusPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(TrueTilePlusPlusPlugin.class);
		RuneLite.main(args);
	}
}