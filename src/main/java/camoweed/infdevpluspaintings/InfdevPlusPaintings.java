package camoweed.infdevpluspaintings;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.enums.ArtType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.EnvironmentHelper;
import turniplabs.halplibe.helper.TextureHelper;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class InfdevPlusPaintings implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint {
	public static final String MOD_ID = "infdevpluspaintings";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
// define every painting
	public static ArtType HS;
	public static ArtType CLOUD;
	public static ArtType ITALY;
	public static ArtType BLANKET;
	public static ArtType PERGOLA;
	public static ArtType PATIO;
	public static ArtType GOLDENRUINS;
	public static ArtType SEASIDE;
	public static ArtType HUMMINGBIRD;
	public static ArtType VIEW;
	public static ArtType CHATEAU;
	public static ArtType STANDARD;
	public static ArtType GOLDENAPPLE;
	public static ArtType BOMBED;
	public static ArtType EASEL;
	public static ArtType DENSE;
	public static ArtType LUTEPLAYER;
	public static ArtType ELEGY;
	public static ArtType ACROBATS;
	public static ArtType STAGEWORKER;
	public static ArtType MONOLOGUE;
	public static ArtType ALLEGORY;
	public static ArtType WAIT;
	public static ArtType GROVE;
	public static ArtType LANDSCAPE;
	public static ArtType CHANGING;
	public static ArtType GATE;
	public static ArtType SEAMSTRESS;
	public static ArtType PASSAGE;
	public static ArtType EARLYMORN;
	public static ArtType RUINS;
	public static ArtType STEPS;

// this is the meat of the mod
	@Override
	public void onInitialize() {
// 16x16 paintings (1 block)
		HS 			=  new ArtType("hs", "HS", "Infdev+", "infdevpluspaintings:art/HS", 16, 16);
		CLOUD 		=  new ArtType("cloud", "Cloud", "Infdev+", "infdevpluspaintings:art/cloud", 16, 16);
		ITALY 		=  new ArtType("italy", "Italy", "Infdev+", "infdevpluspaintings:art/italy", 16, 16);
		BLANKET 	=  new ArtType("blanket", "Blanket", "Infdev+", "infdevpluspaintings:art/blanket", 16, 16);
		PERGOLA 	=  new ArtType("pergola", "Pergola", "Infdev+", "infdevpluspaintings:art/pergola", 16, 16);
		PATIO 		=  new ArtType("patio", "Patio", "Infdev+", "infdevpluspaintings:art/patio", 16, 16);
		GOLDENRUINS	=  new ArtType("goldenruins", "Golden Ruins", "Infdev+", "infdevpluspaintings:art/goldenruins", 16, 16);
		SEASIDE 	=  new ArtType("seaside", "Seaside", "Infdev+", "infdevpluspaintings:art/seaside", 16, 16);
		HUMMINGBIRD =  new ArtType("hummingbird", "Humming Bird", "Infdev+", "infdevpluspaintings:art/hummingbird", 16, 16);
// 32x16 paintings (2 block wide)
		VIEW 		=  new ArtType("view", "View", "Infdev+", "infdevpluspaintings:art/view", 32, 16);
		CHATEAU 	=  new ArtType("chateau", "Chateau", "Infdev+", "infdevpluspaintings:art/chateau", 32, 16);
		GOLDENAPPLE =  new ArtType("goldenapple", "Golden Apple", "Infdev+", "infdevpluspaintings:art/goldenapple", 32, 16);
		BOMBED 		=  new ArtType("bombed", "Bombed", "Infdev+", "infdevpluspaintings:art/bombed", 32, 16);
		EASEL 		=  new ArtType("easel", "Easel", "Infdev+", "infdevpluspaintings:art/easel", 32, 16);
		DENSE 		=  new ArtType("dense", "Dense", "Infdev+", "infdevpluspaintings:art/dense", 32, 16);
// 16x32 paintings (2 block tall)
		LUTEPLAYER 	=  new ArtType("luteplayer", "Lute Player", "Infdev+", "infdevpluspaintings:art/luteplayer", 16, 32);
		ELEGY 		=  new ArtType("elegy", "Elegy", "Infdev+", "infdevpluspaintings:art/elegy", 16, 32);
// 32x32 paintings (2x2 blocks)
		ACROBATS 	=  new ArtType("acrobats", "Acrobats", "Infdev+", "infdevpluspaintings:art/acrobats", 32, 32);
		STAGEWORKER =  new ArtType("stageworkers", "Stage Workers", "Infdev+", "infdevpluspaintings:art/stageworkers", 32, 32);
		MONOLOGUE 	=  new ArtType("monologue", "Monologue", "Infdev+", "infdevpluspaintings:art/monologue", 32, 32);
		ALLEGORY 	=  new ArtType("allegory", "Allegory", "Infdev+", "infdevpluspaintings:art/allegory", 32, 32);
		WAIT 		=  new ArtType("wait", "Wait", "Infdev+", "infdevpluspaintings:art/wait", 32, 32);
		GROVE 		=  new ArtType("grove", "Grove", "Infdev+", "infdevpluspaintings:art/grove", 32, 32);
// 64x32 paintings (4x2 blocks)
		LANDSCAPE	=  new ArtType("landscape", "Landscape", "Infdev+", "infdevpluspaintings:art/landscape", 64, 32);
		CHANGING	=  new ArtType("changing", "Changing", "Infdev+", "infdevpluspaintings:art/changing", 64, 32);
		GATE		=  new ArtType("gate", "Gate", "Infdev+", "infdevpluspaintings:art/gate", 64, 32);
		SEAMSTRESS	=  new ArtType("seamstress", "Seamstress", "Infdev+", "infdevpluspaintings:art/seamstress", 64, 32);
		PASSAGE		=  new ArtType("passage", "Passage", "Infdev+", "infdevpluspaintings:art/passage", 64, 32);
// 32x48 paintings (2x3 blocks)
		EARLYMORN	=  new ArtType("earlymorning", "Early Morning", "Infdev+", "infdevpluspaintings:art/earlymorning", 32, 48);
		RUINS		=  new ArtType("ruins", "Ruins", "Infdev+", "infdevpluspaintings:art/ruins", 32, 48);
// 64x48 paintings (4x3 blocks)
		STEPS		=  new ArtType("steps", "Steps", "Infdev+", "infdevpluspaintings:art/steps", 64, 48);
// just let the log know the mod is active
		LOGGER.info("Infdev+ paintings added!");
	}

	@Override
	public void onRecipesReady() {}

	@Override
	public void initNamespaces() {}

	@Override
	public void beforeGameStart() {
// needed for multiplayer
		if (!EnvironmentHelper.isServerEnvironment()) {
		TextureHelper.initializeAllFiles("infdevpluspaintings", TextureRegistry.artAtlas);
	}}

	@Override
	public void afterGameStart() {}
}
