package io.github.tiagoadmstz.modules;

import com.google.inject.AbstractModule;
import io.github.tiagoadmstz.EfdFile;
import io.github.tiagoadmstz.blocks.BlockA;
import io.github.tiagoadmstz.blocks.BlockC;
import io.github.tiagoadmstz.blocks.BlockD;
import io.github.tiagoadmstz.blocks.BlockF;
import io.github.tiagoadmstz.blocks.BlockI;
import io.github.tiagoadmstz.blocks.BlockM;
import io.github.tiagoadmstz.blocks.BlockNine;
import io.github.tiagoadmstz.blocks.BlockOne;
import io.github.tiagoadmstz.blocks.BlockP;
import io.github.tiagoadmstz.blocks.BlockZero;

public class EfdModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(BlockZero.class);
        bind(BlockA.class);
        bind(BlockC.class);
        bind(BlockD.class);
        bind(BlockF.class);
        bind(BlockI.class);
        bind(BlockM.class);
        bind(BlockP.class);
        bind(BlockOne.class);
        bind(BlockNine.class);
        bind(EfdFile.class);
    }
}
