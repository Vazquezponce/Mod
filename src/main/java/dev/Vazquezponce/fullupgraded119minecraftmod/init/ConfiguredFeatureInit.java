package dev.Vazquezponce.fullupgraded119minecraftmod.init;

import com.google.common.base.Suppliers;
import dev.Vazquezponce.fullupgraded119minecraftmod.FullUpgraded119Minecraftmod;
import net.minecraft.client.renderer.texture.Stitcher;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ConfiguredFeatureInit {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, FullUpgraded119Minecraftmod.MODID);

    private static final Supplier<List<OreConfiguration.TargetBlockState>> RUBI_REPLACEMENT = Suppliers.memoize(() ->
            List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.RAW_RUBI.get().defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.RAW_RUBI.get().defaultBlockState())
            )
    );


    private static final Supplier<List<OreConfiguration.TargetBlockState>> TITANIUM_REPLACEMENT = Suppliers.memoize(() ->
            List.of(
                    OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), BlockInit.TITANIUM_ORE.get().defaultBlockState())
            )
    );

    public static final RegistryObject<ConfiguredFeature<?, ?>> titanium_ore = CONFIGURED_FEATURES.register("titanium_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(TITANIUM_REPLACEMENT.get(), 11)));



    public static final RegistryObject<ConfiguredFeature<?, ?>> RAW_RUBI = CONFIGURED_FEATURES.register("rubi_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(RUBI_REPLACEMENT.get(), 15)));
}