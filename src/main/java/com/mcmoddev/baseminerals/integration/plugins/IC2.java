package com.mcmoddev.baseminerals.integration.plugins;

import com.mcmoddev.baseminerals.BaseMinerals;
import com.mcmoddev.lib.integration.MMDPlugin;
import com.mcmoddev.lib.integration.IIntegration;

@MMDPlugin(addonId = BaseMinerals.MODID, pluginId = IC2.PLUGIN_MODID)
public class IC2 extends com.mcmoddev.lib.integration.plugins.IC2 implements IIntegration {

	private static boolean initDone = false;

	@Override
	public void init() {
		if (initDone || !com.mcmoddev.basemetals.util.Config.Options.enableIC2) {
			return;
		}

		initDone = true;
	}
}
