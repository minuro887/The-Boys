
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theboyscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.theboyscraft.item.EmptyInjectionItem;
import net.mcreator.theboyscraft.item.CompInjectionItem;
import net.mcreator.theboyscraft.TheBoysCraftMod;

public class TheBoysCraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheBoysCraftMod.MODID);
	public static final RegistryObject<Item> EMPTY_INJECTION = REGISTRY.register("empty_injection", () -> new EmptyInjectionItem());
	public static final RegistryObject<Item> COMP_INJECTION = REGISTRY.register("comp_injection", () -> new CompInjectionItem());
	// Start of user code block custom items
	// End of user code block custom items
}
