package dev.Vazquezponce.fullupgraded119minecraftmod.init;

import dev.Vazquezponce.fullupgraded119minecraftmod.FullUpgraded119Minecraftmod;
import dev.Vazquezponce.fullupgraded119minecraftmod.base.FluidRegistryContainer;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidInit {
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, FullUpgraded119Minecraftmod.MODID);

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, FullUpgraded119Minecraftmod.MODID);

    public static final FluidRegistryContainer PETROLEUM =
            new FluidRegistryContainer("petroleum", FluidType.Properties.create().canDrown(true).canPushEntity(true),
                    () -> FluidRegistryContainer.createExtension(new FluidRegistryContainer.ClientExtensions(FullUpgraded119Minecraftmod.MODID,
                            "petroleum").tint(0x000000)), BlockBehaviour.Properties.copy(Blocks.WATER),
                    new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(1));




}
