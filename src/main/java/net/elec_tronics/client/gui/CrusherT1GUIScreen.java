
package net.elec_tronics.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.elec_tronics.world.inventory.CrusherT1GUIMenu;
import net.elec_tronics.procedures.Powertick9Procedure;
import net.elec_tronics.procedures.Powertick8Procedure;
import net.elec_tronics.procedures.Powertick7Procedure;
import net.elec_tronics.procedures.Powertick6Procedure;
import net.elec_tronics.procedures.Powertick5Procedure;
import net.elec_tronics.procedures.Powertick4Procedure;
import net.elec_tronics.procedures.Powertick3Procedure;
import net.elec_tronics.procedures.Powertick2Procedure;
import net.elec_tronics.procedures.Powertick1Procedure;
import net.elec_tronics.procedures.Powertick0Procedure;
import net.elec_tronics.procedures.PowercheckprocedureProcedure;
import net.elec_tronics.procedures.Fuelburning6Procedure;
import net.elec_tronics.procedures.Craftingtime9Procedure;
import net.elec_tronics.procedures.Craftingtime8Procedure;
import net.elec_tronics.procedures.Craftingtime5Procedure;
import net.elec_tronics.procedures.Craftingtime4Procedure;
import net.elec_tronics.procedures.Craftingtime3Procedure;
import net.elec_tronics.procedures.Craftingtime2Procedure;
import net.elec_tronics.procedures.Craftingtime10Procedure;
import net.elec_tronics.procedures.Craftingtie7Procedure;
import net.elec_tronics.procedures.CraftingTime1Procedure;
import net.elec_tronics.procedures.CraftingTime0Procedure;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CrusherT1GUIScreen extends AbstractContainerScreen<CrusherT1GUIMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CrusherT1GUIScreen(CrusherT1GUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("elec_tronics:textures/crusher_t_1_gui.png");

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
		if (CraftingTime0Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/furnace_gui_1.png"));
			this.blit(ms, this.leftPos + 74, this.topPos + 34, 0, 0, 25, 17, 25, 17);
		}
		if (CraftingTime1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/arrow9.png"));
			this.blit(ms, this.leftPos + 71, this.topPos + 35, 0, 0, 32, 16, 32, 16);
		}
		if (Craftingtime2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/arrow8.png"));
			this.blit(ms, this.leftPos + 71, this.topPos + 35, 0, 0, 32, 16, 32, 16);
		}
		if (Craftingtime3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/arrow7.png"));
			this.blit(ms, this.leftPos + 71, this.topPos + 35, 0, 0, 32, 16, 32, 16);
		}
		if (Craftingtime4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/arrow6.png"));
			this.blit(ms, this.leftPos + 71, this.topPos + 35, 0, 0, 32, 16, 32, 16);
		}
		if (Craftingtime5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/arrow5.png"));
			this.blit(ms, this.leftPos + 71, this.topPos + 35, 0, 0, 32, 16, 32, 16);
		}
		if (Fuelburning6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/arrow4.png"));
			this.blit(ms, this.leftPos + 71, this.topPos + 35, 0, 0, 32, 16, 32, 16);
		}
		if (Craftingtie7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/arrow3.png"));
			this.blit(ms, this.leftPos + 71, this.topPos + 35, 0, 0, 32, 16, 32, 16);
		}
		if (Craftingtime8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/arrow2.png"));
			this.blit(ms, this.leftPos + 71, this.topPos + 35, 0, 0, 32, 16, 32, 16);
		}
		if (Craftingtime9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/arrow1.png"));
			this.blit(ms, this.leftPos + 71, this.topPos + 35, 0, 0, 32, 16, 32, 16);
		}
		if (Craftingtime10Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/2474b6354f6757ab86373259b87a2ad3_1.png"));
			this.blit(ms, this.leftPos + 72, this.topPos + 33, 0, 0, 28, 18, 28, 18);
		}
		if (Powertick0Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/batterv1.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery5.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery10.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery20.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery30.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery40.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery50.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery60.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery70.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery80.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery92full.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
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
		this.font.draw(poseStack, "Inventory", 6, 72, -12829636);
		this.font.draw(poseStack, "Crusher Tier 1", 3, 4, -16737895);
		if (PowercheckprocedureProcedure.execute(world, x, y, z))
			this.font.draw(poseStack, "No Power!", 63, 57, -6750208);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
