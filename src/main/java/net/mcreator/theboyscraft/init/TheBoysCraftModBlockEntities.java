
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theboyscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.theboyscraft.block.entity.FabricatorBlockEntity;
import net.mcreator.theboyscraft.TheBoysCraftMod;

public class TheBoysCraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TheBoysCraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> FABRICATOR = register("fabricator", TheBoysCraftModBlocks.FABRICATOR, FabricatorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
