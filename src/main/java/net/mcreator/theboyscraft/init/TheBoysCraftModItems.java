
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theboyscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.theboyscraft.item.TempInjectionItem;
import net.mcreator.theboyscraft.item.EmptyInjectionItem;
import net.mcreator.theboyscraft.item.CompInjectionItem;
import net.mcreator.theboyscraft.TheBoysCraftMod;

public class TheBoysCraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheBoysCraftMod.MODID);
	public static final RegistryObject<Item> EMPTY_INJECTION = REGISTRY.register("empty_injection", () -> new EmptyInjectionItem());
	public static final RegistryObject<Item> COMP_INJECTION = REGISTRY.register("comp_injection", () -> new CompInjectionItem());
	public static final RegistryObject<Item> TEMP_INJECTION = REGISTRY.register("temp_injection", () -> new TempInjectionItem());
	public static final RegistryObject<Item> FABRICATOR = block(TheBoysCraftModBlocks.FABRICATOR);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
