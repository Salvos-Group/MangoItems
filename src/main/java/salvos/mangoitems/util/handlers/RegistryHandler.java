package salvos.mangoitems.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Rotation;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import salvos.mangoitems.blocks.furnitures.FurnitureHorizontal;
import salvos.mangoitems.init.ModBlocks;
import salvos.mangoitems.init.ModItems;
import salvos.mangoitems.util.IHasModel;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ModItems.items.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(ModBlocks.blocks.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event){
        for(Item item : ModItems.items){
            if(item instanceof IHasModel){
                ((IHasModel) item).registerModels();
            }
        }

        for(Block block : ModBlocks.blocks) {
            if (block instanceof IHasModel) {
                ((IHasModel) block).registerModels();
            }
        }
    }

    @SubscribeEvent
    public static void rightClickInteract(PlayerInteractEvent.RightClickBlock event){
        if(event.getEntityPlayer().getHeldItemMainhand().getItem() == ModItems.MANGO_WRENCH) {
            IBlockState state = event.getWorld().getBlockState(event.getPos());
            Block block = state.getBlock();
            if (ModBlocks.furnitures.contains(block) && block instanceof FurnitureHorizontal) {

            }
        }
    }

}
