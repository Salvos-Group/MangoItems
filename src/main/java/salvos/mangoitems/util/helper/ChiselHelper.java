package salvos.mangoitems.util.helper;

import net.minecraftforge.fml.common.event.FMLInterModComms;

public class ChiselHelper{

    public static void init(){
        FMLInterModComms.sendMessage("chisel", "variation:add", "marble|mangoitems:marble_stone|0");
        FMLInterModComms.sendMessage("chisel", "variation:add", "basalt|mangoitems:basalt_stone|0");
        FMLInterModComms.sendMessage("chisel", "variation:add", "limestone|mangoitems:limestone_stone|0");
    }

}
