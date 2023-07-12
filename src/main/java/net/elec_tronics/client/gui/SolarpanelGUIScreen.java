package net.elec_tronics.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;

import net.elec_tronics.world.inventory.SolarpanelGUIMenu;
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
import net.elec_tronics.procedures.PowerSendingAmountProcedure;
import net.elec_tronics.procedures.NightorDayProcedure;
import net.elec_tronics.procedures.DayornightProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SolarpanelGUIScreen extends AbstractContainerScreen<SolarpanelGUIMenu> {
	private final static HashMap<String, Object> guistate = SolarpanelGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SolarpanelGUIScreen(SolarpanelGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 100;
		this.imageHeight = 92;
	}

	private static final ResourceLocation texture = new ResourceLocation("elec_tronics:textures/screens/solarpanel_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		if (mouseX > leftPos + 19 && mouseX < leftPos + 29 && mouseY > topPos + 26 && mouseY < topPos + 50)
			this.renderTooltip(ms, Component.literal(PowerSendingAmountProcedure.execute(world, x, y, z)), mouseX, mouseY);
		if (mouseX > leftPos + 19 && mouseX < leftPos + 29 && mouseY > topPos + 50 && mouseY < topPos + 74)
			this.renderTooltip(ms, Component.literal(PowerSendingAmountProcedure.execute(world, x, y, z)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (DayornightProcedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/sun.png"));
			this.blit(ms, this.leftPos + 54, this.topPos + 30, 0, 0, 32, 32, 32, 32);
		}
		if (NightorDayProcedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/sunoff.png"));
			this.blit(ms, this.leftPos + 54, this.topPos + 30, 0, 0, 32, 32, 32, 32);
		}
		if (Powertick0Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/batterv1.png"));
			this.blit(ms, this.leftPos + 19, this.topPos + 25, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery5.png"));
			this.blit(ms, this.leftPos + 19, this.topPos + 25, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery10.png"));
			this.blit(ms, this.leftPos + 19, this.topPos + 25, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery20.png"));
			this.blit(ms, this.leftPos + 19, this.topPos + 25, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery30.png"));
			this.blit(ms, this.leftPos + 19, this.topPos + 25, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery40.png"));
			this.blit(ms, this.leftPos + 19, this.topPos + 25, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery50.png"));
			this.blit(ms, this.leftPos + 19, this.topPos + 25, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery60.png"));
			this.blit(ms, this.leftPos + 19, this.topPos + 25, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery70.png"));
			this.blit(ms, this.leftPos + 19, this.topPos + 25, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery80.png"));
			this.blit(ms, this.leftPos + 19, this.topPos + 25, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery92full.png"));
			this.blit(ms, this.leftPos + 19, this.topPos + 25, 0, 0, 10, 50, 10, 50);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/batteryoverlay.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 25, 0, 0, 10, 50, 10, 50);

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
		this.font.draw(poseStack, Component.translatable("gui.elec_tronics.solarpanel_gui.label_solar_panel_t1"), 11, 4, -16737895);
		this.font.draw(poseStack, Component.translatable("gui.elec_tronics.solarpanel_gui.label_time"), 60, 24, -12829636);
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
