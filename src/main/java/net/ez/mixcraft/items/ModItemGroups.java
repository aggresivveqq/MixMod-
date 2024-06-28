package net.ez.mixcraft.items;

import net.ez.mixcraft.Mixcraft;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static ItemGroup ALLOY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Mixcraft.MOD_ID,"diamondiron"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.diamondiron")).
                    icon(() -> new ItemStack(ModItems.DIAMOND_IRON)).entries((displayContext, entries) -> {
             entries.add(ModItems.DIAMOND_IRON);
             entries.add(ModItems.GOLD_IRON);
             entries.add(ModItems.DIAMOND_GOLD);
             entries.add(Items.DIAMOND);
             entries.add(Items.IRON_INGOT);
             entries.add(Items.GOLD_INGOT);
             entries.add(ModItems.DIAMOND_IRON_SWORD);
             entries.add(ModItems.GOLD_IRON_SWORD);
             entries.add(ModItems.DIAMOND_GOLD_SWORD);

            }).build());

    public static void registerItemGroups(){
        Mixcraft.LOGGER.info("reg item groups" + Mixcraft.MOD_ID);

    }
}
