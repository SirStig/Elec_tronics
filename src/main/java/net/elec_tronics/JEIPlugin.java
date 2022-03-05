/**
 * The code of this mod element is always locked.
 *
 * You can register new events in this class too.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser -> New... and make sure to make the class
 * outside net.elec_tronics as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
 *
 * This class will be added in the mod root package.
*/
package net.elec_tronics;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IGuiItemStackGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.helpers.IJeiHelpers;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.resources.ResourceLocation;

import net.elec_tronics.init.ElecTronicsModBlocks;
import net.elec_tronics.init.ElecTronicsModItems;

import java.util.ArrayList;
import java.util.List;
import net.java.games.input.Component;
import net.minecraft.network.chat.TextComponent;

@mezz.jei.api.JeiPlugin
public class JEIPlugin implements IModPlugin {
	public static IJeiHelpers jeiHelper;
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("elec_tronics", "default");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		jeiHelper = registration.getJeiHelpers();
		registration.addRecipeCategories(new EngineersWorkbenchJeiCategory(jeiHelper.getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		registration.addRecipes(generateEngineersWorkbenchRecipes(), EngineersWorkbenchJeiCategory.Uid);
		registration.addRecipes(generateEngineersWorkbenchRecipes2(), EngineersWorkbenchJeiCategory.Uid);
	}

	private List<EngineersWorkbenchJeiCategory.EngineersWorkbenchRecipeWrapper> generateEngineersWorkbenchRecipes() {
		List<EngineersWorkbenchJeiCategory.EngineersWorkbenchRecipeWrapper> recipes = new ArrayList<>();
		ArrayList<ItemStack> inputs = new ArrayList<>();
        ArrayList<ItemStack> outputs = new ArrayList<>();
        inputs.add(new ItemStack(ElecTronicsModBlocks.REINFORCEDBLASTBRICK.asItem()));
        inputs.add(new ItemStack(ElecTronicsModItems.INSULATION));
        outputs.add(new ItemStack(ElecTronicsModBlocks.BLASTFURNANCEMACHINE));
		recipes.add(new EngineersWorkbenchJeiCategory.EngineersWorkbenchRecipeWrapper(inputs, outputs));
		return recipes;
	}

		private List<EngineersWorkbenchJeiCategory.EngineersWorkbenchRecipeWrapper> generateEngineersWorkbenchRecipes2() {
		List<EngineersWorkbenchJeiCategory.EngineersWorkbenchRecipeWrapper> recipes = new ArrayList<>();
		ArrayList<ItemStack> inputs = new ArrayList<>();
        ArrayList<ItemStack> outputs = new ArrayList<>();
        inputs.add(new ItemStack(Items.COPPER_INGOT));
        outputs.add(new ItemStack(ElecTronicsModItems.COPPER_SHEET));
		recipes.add(new EngineersWorkbenchJeiCategory.EngineersWorkbenchRecipeWrapper(inputs, outputs));
		return recipes;
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(ElecTronicsModBlocks.ENGINEERSWORKBENCH), EngineersWorkbenchJeiCategory.Uid);
	}

	public static class EngineersWorkbenchJeiCategory implements IRecipeCategory<EngineersWorkbenchJeiCategory.EngineersWorkbenchRecipeWrapper> {
		private static ResourceLocation Uid = new ResourceLocation("elec_tronics", "engineersworkbenchcategory");
		private static final int input1 = 0;
		private static final int input2 = 1;
		private static final int input3 = 2;
		private static final int input4 = 3;
		private static final int input5 = 4;
		private static final int input6 = 5;
		private static final int input7 = 6;
		private static final int input8 = 7;
		private static final int input9 = 8;
		private static final int input10 = 9;
		private static final int input11 = 10;
		private static final int input12 = 11;
		private static final int input13 = 12;
		private static final int input14 = 13;
		private static final int input15 = 14;
		private static final int input16 = 15; // THE NUMBER = SLOTID
		private static final int output1 = 1; // THE NUMBER = SLOTID
		// ...
		private final IDrawable background;
		private final TextComponent title = new TextComponent("Engineers Workbench");

		public EngineersWorkbenchJeiCategory(IGuiHelper guiHelper) {
			this.background = guiHelper.createDrawable(new ResourceLocation("elec_tronics", "textures/jeiengineersworkbench256.png"), 0, 0, 129, 72);
		}

// now you can send `textComponent` to something, such as a client

		@Override
		public ResourceLocation getUid() {
			return Uid;
		}


		@Override
		public Class<? extends EngineersWorkbenchRecipeWrapper> getRecipeClass() {
			return EngineersWorkbenchJeiCategory.EngineersWorkbenchRecipeWrapper.class;
		}

		@Override
		public IDrawable getBackground() {
			return background;
		}

		@Override
		public IDrawable getIcon() {
			return null;
		}

		@Override
		public TextComponent getTitle() {
			return title;
		}

		@Override
		public void setIngredients(EngineersWorkbenchRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            iIngredients.setInputs(VanillaTypes.ITEM, recipeWrapper.getInput());
            iIngredients.setOutputs(VanillaTypes.ITEM, recipeWrapper.getOutput());
			// ...
		}

        public void draw(EngineersWorkbenchRecipeWrapper recipe, double mouseX, double mouseY) {
            ItemStack recipeOutput = (ItemStack) recipe.output.get(0);
            System.out.println(recipeOutput.getItem() == ElecTronicsModBlocks.BLASTFURNANCEMACHINE.asItem());
            
        }
		@Override
		public void setRecipe(IRecipeLayout iRecipeLayout, EngineersWorkbenchRecipeWrapper recipeWrapper, IIngredients iIngredients) {
			IGuiItemStackGroup stacks = iRecipeLayout.getItemStacks();
			stacks.init(input1, true, 19, 54);
			stacks.init(input2, true, 19, 36);
			stacks.init(input3, true, 19, 18);
			stacks.init(input4, true, 38, 54);
			stacks.init(input5, true, 38, 36);
			stacks.init(input6, true, 38, 18);
			stacks.init(input7, true, 56, 54);
			stacks.init(input8, true, 56, 36);
			stacks.init(input9, true, 56, 18);
			stacks.init(input10, true, 0, 54);
			stacks.init(input11, true, 0, 36);
			stacks.init(input12, true, 0, 18);
			stacks.init(input13, true, 0, 0);
			stacks.init(input14, true, 19, 0);
			stacks.init(input15, true, 38, 0);
			stacks.init(input16, true, 65, 0);
			stacks.set(input1, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
			stacks.set(input2, iIngredients.getInputs(VanillaTypes.ITEM).get(1));
			stacks.set(input3, iIngredients.getInputs(VanillaTypes.ITEM).get(1));
			stacks.set(input4, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
			stacks.set(input5, iIngredients.getInputs(VanillaTypes.ITEM).get(1));
			stacks.set(input6, iIngredients.getInputs(VanillaTypes.ITEM).get(1));
			stacks.set(input7, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
			stacks.set(input8, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
			stacks.set(input9, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
			stacks.set(input10, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
			stacks.set(input11, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
			stacks.set(input12, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
			stacks.set(input13, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
			stacks.set(input14, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
			stacks.set(input15, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
			stacks.set(input16, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
			// ,,,
			
			stacks.init(output1, false, 107, 28);
			stacks.set(output1, iIngredients.getOutputs(VanillaTypes.ITEM).get(0));
			// ...
		}
		public static class EngineersWorkbenchRecipeWrapper {
            private ArrayList input;
            private ArrayList output;

            public EngineersWorkbenchRecipeWrapper(ArrayList input, ArrayList output) {
                this.input = input;
                this.output = output;
            }


            public ArrayList getInput() {
                return input;
            }

            public ArrayList getOutput() {
                return output;
            }
        }
	}
}
