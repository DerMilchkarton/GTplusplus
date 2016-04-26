package miscutil.core.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import miscutil.core.creative.AddToCreativeTab;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CORE {

	public static final String name = "Misc. Utils";	
	public static final String MODID = "miscutils";
	public static final String VERSION = "1.0.1";
	public static final boolean DEBUG = false;	
	public static final boolean LOAD_ALL_CONTENT = false;
	public static final int GREG_FIRST_ID = 760;
	public static Map PlayerCache;
	public static final String[] VOLTAGES = {"ULV","LV","MV","HV","EV","IV","LuV","ZPM","UV","MAX"};
	
	@SideOnly(Side.CLIENT)
    public static IIconRegister GT_BlockIcons, GT_ItemIcons;	
	public static List<Runnable> GT_BlockIconload = new ArrayList<Runnable>();
	public static final Class<AddToCreativeTab> TAB = AddToCreativeTab.class;
	
	//GUIS
	public enum GUI_ENUM 
	{
	    ENERGYBUFFER, TOOLBUILDER, NULL, NULL1, NULL2
	}
	
	/**
     * File Paths and Resource Paths
     */
    public static final String
            TEX_DIR = "textures/", 
            TEX_DIR_GUI = TEX_DIR + "gui/", 
            TEX_DIR_ITEM = TEX_DIR + "items/", 
            TEX_DIR_BLOCK = TEX_DIR/* + "blocks/"*/,
            TEX_DIR_ENTITY = TEX_DIR + "entity/", 
            TEX_DIR_ASPECTS = TEX_DIR + "aspects/", 
            RES_PATH = MODID + ":" + TEX_DIR, 
            RES_PATH_GUI = MODID + ":" + TEX_DIR_GUI, 
            RES_PATH_ITEM = MODID + ":" + TEX_DIR_ITEM, 
            RES_PATH_BLOCK = MODID + ":" + TEX_DIR_BLOCK, 
            RES_PATH_ENTITY = MODID + ":" + TEX_DIR_ENTITY,
            RES_PATH_ASPECTS = MODID + ":" + TEX_DIR_ASPECTS;
   
	
	//public static final Materials2[] MiscGeneratedMaterials = new Materials2[1000];
	
}