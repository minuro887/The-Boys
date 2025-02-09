
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theboyscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.theboyscraft.block.FabricatorBlock;
import net.mcreator.theboyscraft.TheBoysCraftMod;

public class TheBoysCraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheBoysCraftMod.MODID);
	public static final RegistryObject<Block> FABRICATOR = REGISTRY.register("fabricator", () -> new FabricatorBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
