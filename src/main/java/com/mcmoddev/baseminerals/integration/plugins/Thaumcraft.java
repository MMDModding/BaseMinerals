package com.mcmoddev.baseminerals.integration.plugins;

import com.mcmoddev.baseminerals.integration.BaseMineralsPlugin;
import com.mcmoddev.lib.integration.IIntegration;

@BaseMineralsPlugin(Thaumcraft.PLUGIN_MODID)
public class Thaumcraft extends com.mcmoddev.lib.integration.plugins.Thaumcraft implements IIntegration {

	private static boolean initDone = false;

	@Override
	public void init() {
		if (initDone || !com.mcmoddev.basemetals.util.Config.Options.enableThaumcraft) {
			return;
		}

		initDone = true;
	}
}
