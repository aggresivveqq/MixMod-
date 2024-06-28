package net.ez.mixcraft.items;

import net.ez.mixcraft.Mixcraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item DIAMOND_IRON =registerItem("diamondiron",new Item(new FabricItemSettings()));
    public static final Item DIAMOND_GOLD =registerItem("diamondgold",new Item(new FabricItemSettings()));

    public static final Item GOLD_IRON =registerItem("goldiron",new Item(new FabricItemSettings()));
    public static final Item DIAMOND_IRON_SWORD =registerItem("diamondiron_sword",
            new SwordItem(ModToolMaterials.DIAMOND_IRON,4,-2.3f,new FabricItemSettings()));
    public static final Item GOLD_IRON_SWORD =registerItem("goldiron_sword",
            new SwordItem(ModToolMaterials.GOLD_IRON,3,-2.3f,new FabricItemSettings()));
    public static final Item DIAMOND_GOLD_SWORD =registerItem("diamondgold_sword",
            new SwordItem(ModToolMaterials.DIAMOND_GOLD,3,-2.3f,new FabricItemSettings()));
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
      entries.add(DIAMOND_IRON);
      entries.add(GOLD_IRON);
    }
    private static Item registerItem(String name, Item item){
      return Registry.register(Registries.ITEM,new Identifier(Mixcraft.MOD_ID,name),item);
    }
    public static void registerModItems(){
        Mixcraft.LOGGER.info("reg mod item for" + Mixcraft.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
