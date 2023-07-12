package net.elec_tronics.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;

import net.elec_tronics.world.inventory.ExtrusinmachineGUIMenu;
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
import net.elec_tronics.procedures.PowerAmountProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ExtrusinmachineGUIScreen extends AbstractContainerScreen<ExtrusinmachineGUIMenu> {
	private final static HashMap<String, Object> guistate = ExtrusinmachineGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ExtrusinmachineGUIScreen(ExtrusinmachineGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 177;
	}

	private static final ResourceLocation texture = new ResourceLocation("elec_tronics:textures/screens/extrusinmachine_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		if (mouseX > leftPos + 8 && mouseX < leftPos + 18 && mouseY > topPos + 23 && mouseY < topPos + 47)
			this.renderTooltip(ms, Component.literal(PowerAmountProcedure.execute(world, x, y, z)), mouseX, mouseY);
		if (mouseX > leftPos + 8 && mouseX < leftPos + 18 && mouseY > topPos + 47 && mouseY < topPos + 71)
			this.renderTooltip(ms, Component.literal(PowerAmountProcedure.execute(world, x, y, z)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (Powertick0Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/batterv1.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery5.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery10.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery20.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery30.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery40.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery50.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery60.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery70.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery80.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery92full.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/input.png"));
		this.blit(ms, this.leftPos + 47, this.topPos + 38, 0, 0, 25, 25, 25, 25);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/output.png"));
		this.blit(ms, this.leftPos + 101, this.topPos + 38, 0, 0, 25, 25, 25, 25);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/ingotgui.png"));
		this.blit(ms, this.leftPos + 51, this.topPos + 22, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/extrusion0.png"));
		this.blit(ms, this.leftPos + 72, this.topPos + 43, 0, 0, 0, 0, 0, 0);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/batteryoverlay.png"));
		this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);

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
		this.font.draw(poseStack, Component.translatable("gui.elec_tronics.extrusinmachine_gui.label_extrusion_machine"), 5, 4, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.elec_tronics.extrusinmachine_gui.label_inventory"), 5, 83, -12829636);
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
