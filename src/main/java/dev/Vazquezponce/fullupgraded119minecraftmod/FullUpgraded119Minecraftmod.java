package dev.Vazquezponce.fullupgraded119minecraftmod;

import dev.Vazquezponce.fullupgraded119minecraftmod.init.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FullUpgraded119Minecraftmod.MODID)
public class FullUpgraded119Minecraftmod {
    public static final String MODID = "fullupgraded119minecraftmod";



    public FullUpgraded119Minecraftmod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();


        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);
        ConfiguredFeatureInit.CONFIGURED_FEATURES.register(bus);
        PlacedFeatureInit.PLACED_FEATURES.register(bus);
        FluidInit.FLUID_TYPES.register(bus);
        FluidInit.FLUIDS.register(bus);
    }
}

