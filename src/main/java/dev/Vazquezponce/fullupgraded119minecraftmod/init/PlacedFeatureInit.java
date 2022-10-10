package dev.Vazquezponce.fullupgraded119minecraftmod.init;

import dev.Vazquezponce.fullupgraded119minecraftmod.FullUpgraded119Minecraftmod;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class PlacedFeatureInit {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, FullUpgraded119Minecraftmod.MODID);

    public static final RegistryObject<PlacedFeature> RAW_RUBI = PLACED_FEATURES.register("raw_rubi",
            () -> new PlacedFeature(ConfiguredFeatureInit.RAW_RUBI.getHolder().get(),
                    commonOrePlacement(7, HeightRangePlacement.triangle(
                            VerticalAnchor.bottom(),
                            VerticalAnchor.absolute(25)
                    ))));



    public static final RegistryObject<PlacedFeature> TITANIUM_ORE = PLACED_FEATURES.register("titanium_ore",
            () -> new PlacedFeature(ConfiguredFeatureInit.titanium_ore.getHolder().get(),
                    commonOrePlacement(3, HeightRangePlacement.uniform(
                            VerticalAnchor.bottom(),
                            VerticalAnchor.belowTop(0)
                    ))));


    private static List<PlacementModifier> commonOrePlacement(int countPerChunk, PlacementModifier height) {
        return orePlacement(CountPlacement.of(countPerChunk), height);
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier count, PlacementModifier height) {
        return List.of(count, InSquarePlacement.spread(), height, BiomeFilter.biome());
    }
}

