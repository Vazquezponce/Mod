package dev.Vazquezponce.fullupgraded119minecraftmod.init;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import dev.Vazquezponce.fullupgraded119minecraftmod.FullUpgraded119Minecraftmod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FullUpgraded119Minecraftmod.MODID);

    public static final RegistryObject<Block> SANDWICHITO1_BLOCK = register(
            "sandwichito1_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).friction((float) 0.98)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    private  static <T extends Block> RegistryObject<T> register(
            String name,
            Supplier<T> supplier,
            Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;

    }
        public static final RegistryObject<Block> RAW_RUBI = register("raw_rubi",
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)),
                new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS));


    public static final RegistryObject<Block> TITANIUM_ORE = register("titanium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE)),
            new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS));









}
