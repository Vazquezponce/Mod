package dev.Vazquezponce.fullupgraded119minecraftmod.init;

import dev.Vazquezponce.fullupgraded119minecraftmod.FullUpgraded119Minecraftmod;
import dev.Vazquezponce.fullupgraded119minecraftmod.base.ModArmourMaterial;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FullUpgraded119Minecraftmod.MODID);




   //comida

    public static final RegistryObject<Item> SANDWICHITO = ITEMS.register(
            "sandwichito", () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(16).alwaysEat().build())));

    public static final RegistryObject<Item> RAW_EGG = ITEMS.register(
            "raw_egg", () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(2).fast().meat().build())));






   //herramientas

    public static final RegistryObject<SwordItem> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword",
            () -> new SwordItem(Tiers.EXAMPLE, 8, 3.5f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<PickaxeItem> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe",
            () -> new PickaxeItem(Tiers.EXAMPLE, 2, 8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<ShovelItem> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel",
            () -> new ShovelItem(Tiers.EXAMPLE, 2, 11f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<AxeItem> OBSIDIAN_AXE = ITEMS.register("obsidian_axe",
            () -> new AxeItem(Tiers.EXAMPLE, 7, 3.5f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<HoeItem> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe",
            () -> new HoeItem(Tiers.EXAMPLE, 2, 9f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<SwordItem> COPPER_KNIFE = ITEMS.register("copper_knife",
            () -> new SwordItem(Tiers.KNIVES, 2, 3.5f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static FoodProperties COOKIE() {
        return null;
    }




    //armadura

public static final RegistryObject<ArmorItem> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet",
        () -> new ArmorItem(ArmorTiers.OBSIDIAN_ARMOUR, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate",
            () -> new ArmorItem(ArmorTiers.OBSIDIAN_ARMOUR, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings",
            () -> new ArmorItem(ArmorTiers.OBSIDIAN_ARMOUR, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots",
            () -> new ArmorItem(ArmorTiers.OBSIDIAN_ARMOUR, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));






//tool tiers
    public static class Tiers {
        public static final Tier EXAMPLE = new ForgeTier(4, 1900, 7f, 3, 700, null, () -> Ingredient.of(ItemInit.OBSIDIAN_PICKAXE.get()));




       public static final Tier KNIVES = new ForgeTier(2, 10000, 13f, 2, 200, null, () -> Ingredient.of(ItemInit.COPPER_KNIFE.get()));



    }


    public static class ArmorTiers {
        public static final ArmorMaterial OBSIDIAN_ARMOUR = new ModArmourMaterial(
                "obsidian armour",
                1000,
                new int[] { 6, 8, 9, 7 },
                300,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                0.0f,
                0.4f,
                () -> Ingredient.of(ItemInit.OBSIDIAN_CHESTPLATE.get()));


    }

}
