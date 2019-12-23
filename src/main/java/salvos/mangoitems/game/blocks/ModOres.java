package salvos.mangoitems.game.blocks;

import salvos.mangoitems.game.blocks.ores.OreBase;
import salvos.mangoitems.game.blocks.type.OreType;
import salvos.mangoitems.game.blocks.type.RockType;

public class ModOres {

    public static void init(){
        for(RockType rockType : RockType.values()){
            for(OreType oreType : OreType.values()){
                new OreBase(rockType, oreType);
            }
        }
    }

}
