package com.mcmoddev.baseminerals.init;

/**
 *
 * @author Jasmine Iwanek
 *
 */
public class VillagerTrades extends com.mcmoddev.lib.init.VillagerTrades {

	private static boolean initDone = false;

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		Materials.init();
		Items.init();

		registerCommonTrades();

		initDone = true;
	}
}
