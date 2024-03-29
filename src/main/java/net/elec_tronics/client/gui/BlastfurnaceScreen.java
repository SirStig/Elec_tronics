package net.elec_tronics.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;

import net.elec_tronics.world.inventory.BlastfurnaceMenu;
import net.elec_tronics.procedures.FuelburningProcedure;
import net.elec_tronics.procedures.Fuelburning9Procedure;
import net.elec_tronics.procedures.Fuelburning8Procedure;
import net.elec_tronics.procedures.Fuelburning7Procedure;
import net.elec_tronics.procedures.Fuelburning6Procedure;
import net.elec_tronics.procedures.Fuelburning5Procedure;
import net.elec_tronics.procedures.Fuelburning4Procedure;
import net.elec_tronics.procedures.Fuelburning3Procedure;
import net.elec_tronics.procedures.Fuelburning2Procedure;
import net.elec_tronics.procedures.Fuelburning10Procedure;
import net.elec_tronics.procedures.Craftingtime9Procedure;
import net.elec_tronics.procedures.Craftingtime8Procedure;
import net.elec_tronics.procedures.Craftingtime6Procedure;
import net.elec_tronics.procedures.Craftingtime5Procedure;
import net.elec_tronics.procedures.Craftingtime4Procedure;
import net.elec_tronics.procedures.Craftingtime3Procedure;
import net.elec_tronics.procedures.Craftingtime2Procedure;
import net.elec_tronics.procedures.Craftingtime10Procedure;
import net.elec_tronics.procedures.Craftingtie7Procedure;
import net.elec_tronics.procedures.CraftingTime1Procedure;
import net.elec_tronics.procedures.CraftingTime0Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BlastfurnaceScreen extends AbstractContainerScreen<BlastfurnaceMenu> {
	private final static HashMap<String, Object> guistate = BlastfurnaceMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BlastfurnaceScreen(BlastfurnaceMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 186;
	}

	private static final ResourceLocation texture = new ResourceLocation("elec_tronics:textures/screens/blastfurnace.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (Fuelburning10Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/images_1_1.png"));
			this.blit(ms, this.leftPos + 61, this.topPos + 51, 0, 0, 16, 16, 16, 16);
		}
		if (Fuelburning9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/fuel2.png"));
			this.blit(ms, this.leftPos + 61, this.topPos + 51, 0, 0, 16, 16, 16, 16);
		}
		if (Fuelburning8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/fuel3.png"));
			this.blit(ms, this.leftPos + 61, this.topPos + 51, 0, 0, 16, 16, 16, 16);
		}
		if (Fuelburning7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/fuel4.png"));
			this.blit(ms, this.leftPos + 61, this.topPos + 51, 0, 0, 16, 16, 16, 16);
		}
		if (Fuelburning6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/fuel5.png"));
			this.blit(ms, this.leftPos + 61, this.topPos + 51, 0, 0, 16, 16, 16, 16);
		}
		if (Fuelburning5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/fuel6.png"));
			this.blit(ms, this.leftPos + 61, this.topPos + 51, 0, 0, 16, 16, 16, 16);
		}
		if (Fuelburning4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/fuel7.png"));
			this.blit(ms, this.leftPos + 61, this.topPos + 51, 0, 0, 16, 16, 16, 16);
		}
		if (Fuelburning3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/fuel8.png"));
			this.blit(ms, this.leftPos + 61, this.topPos + 51, 0, 0, 16, 16, 16, 16);
		}
		if (Fuelburning2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/fuel9.png"));
			this.blit(ms, this.leftPos + 61, this.topPos + 51, 0, 0, 16, 16, 16, 16);
		}
		if (FuelburningProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/burningfull.png"));
			this.blit(ms, this.leftPos + 61, this.topPos + 51, 0, 0, 16, 16, 16, 16);
		}
		if (CraftingTime0Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/furnace_gui_1.png"));
			this.blit(ms, this.leftPos + 102, this.topPos + 51, 0, 0, 25, 17, 25, 17);
		}
		if (CraftingTime1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/arrow9.png"));
			this.blit(ms, this.leftPos + 99, this.topPos + 52, 0, 0, 32, 16, 32, 16);
		}
		if (Craftingtime2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/arrow8.png"));
			this.blit(ms, this.leftPos + 99, this.topPos + 52, 0, 0, 32, 16, 32, 16);
		}
		if (Craftingtime3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/arrow7.png"));
			this.blit(ms, this.leftPos + 99, this.topPos + 52, 0, 0, 32, 16, 32, 16);
		}
		if (Craftingtime4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/arrow6.png"));
			this.blit(ms, this.leftPos + 99, this.topPos + 52, 0, 0, 32, 16, 32, 16);
		}
		if (Craftingtime5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/arrow5.png"));
			this.blit(ms, this.leftPos + 99, this.topPos + 52, 0, 0, 32, 16, 32, 16);
		}
		if (Craftingtime6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/arrow4.png"));
			this.blit(ms, this.leftPos + 99, this.topPos + 52, 0, 0, 32, 16, 32, 16);
		}
		if (Craftingtie7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/arrow3.png"));
			this.blit(ms, this.leftPos + 99, this.topPos + 52, 0, 0, 32, 16, 32, 16);
		}
		if (Craftingtime8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/arrow2.png"));
			this.blit(ms, this.leftPos + 99, this.topPos + 52, 0, 0, 32, 16, 32, 16);
		}
		if (Craftingtime9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/arrow1.png"));
			this.blit(ms, this.leftPos + 99, this.topPos + 52, 0, 0, 32, 16, 32, 16);
		}
		if (Craftingtime10Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/2474b6354f6757ab86373259b87a2ad3_1.png"));
			this.blit(ms, this.leftPos + 100, this.topPos + 50, 0, 0, 28, 18, 28, 18);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/input.png"));
		this.blit(ms, this.leftPos + 38, this.topPos + 67, 0, 0, 25, 25, 25, 25);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/input.png"));
		this.blit(ms, this.leftPos + 56, this.topPos + 67, 0, 0, 25, 25, 25, 25);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/input.png"));
		this.blit(ms, this.leftPos + 74, this.topPos + 67, 0, 0, 25, 25, 25, 25);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/input.png"));
		this.blit(ms, this.leftPos + 46, this.topPos + 23, 0, 0, 25, 25, 25, 25);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/input.png"));
		this.blit(ms, this.leftPos + 65, this.topPos + 23, 0, 0, 25, 25, 25, 25);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/output.png"));
		this.blit(ms, this.leftPos + 128, this.topPos + 47, 0, 0, 25, 25, 25, 25);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.elec_tronics.blastfurnace.label_blast_furnace"), 7, 7, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.elec_tronics.blastfurnace.label_inventory"), 7, 91, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
