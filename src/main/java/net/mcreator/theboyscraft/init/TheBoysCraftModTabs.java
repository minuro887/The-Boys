
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theboyscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.theboyscraft.TheBoysCraftMod;

public class TheBoysCraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheBoysCraftMod.MODID);
	public static final RegistryObject<CreativeModeTab> THE_BOYS_CRAFT = REGISTRY.register("the_boys_craft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_boys_craft.the_boys_craft")).icon(() -> new ItemStack(TheBoysCraftModBlocks.FABRICATOR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheBoysCraftModItems.EMPTY_INJECTION.get());
				tabData.accept(TheBoysCraftModItems.COMP_INJECTION.get());
				tabData.accept(TheBoysCraftModItems.TEMP_INJECTION.get());
				tabData.accept(TheBoysCraftModBlocks.FABRICATOR.get().asItem());
			}).withSearchBar().build());
}
