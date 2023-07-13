package net.elec_tronics.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;

import net.elec_tronics.world.inventory.CoalgeneratorGUIMenu;
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

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CoalgeneratorGUIScreen extends AbstractContainerScreen<CoalgeneratorGUIMenu> {
	private final static HashMap<String, Object> guistate = CoalgeneratorGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CoalgeneratorGUIScreen(CoalgeneratorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 176;
	}

	private static final ResourceLocation texture = new ResourceLocation("elec_tronics:textures/screens/coalgenerator_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		if (mouseX > leftPos + 7 && mouseX < leftPos + 17 && mouseY > topPos + 28 && mouseY < topPos + 52)
			this.renderTooltip(ms, Component.literal(PowerAmountProcedure.execute(world, x, y, z)), mouseX, mouseY);
		if (mouseX > leftPos + 7 && mouseX < leftPos + 17 && mouseY > topPos + 52 && mouseY < topPos + 76)
			this.renderTooltip(ms, Component.literal(PowerAmountProcedure.execute(world, x, y, z)), mouseX, mouseY);
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
			this.blit(ms, this.leftPos + 79, this.topPos + 28, 0, 0, 16, 16, 16, 16);
		}
		if (Fuelburning9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/fuel2.png"));
			this.blit(ms, this.leftPos + 79, this.topPos + 28, 0, 0, 16, 16, 16, 16);
		}
		if (Fuelburning8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/fuel3.png"));
			this.blit(ms, this.leftPos + 79, this.topPos + 28, 0, 0, 16, 16, 16, 16);
		}
		if (Fuelburning7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/fuel4.png"));
			this.blit(ms, this.leftPos + 79, this.topPos + 28, 0, 0, 16, 16, 16, 16);
		}
		if (Fuelburning6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/fuel5.png"));
			this.blit(ms, this.leftPos + 79, this.topPos + 28, 0, 0, 16, 16, 16, 16);
		}
		if (Fuelburning5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/fuel6.png"));
			this.blit(ms, this.leftPos + 79, this.topPos + 28, 0, 0, 16, 16, 16, 16);
		}
		if (Fuelburning4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/fuel7.png"));
			this.blit(ms, this.leftPos + 79, this.topPos + 28, 0, 0, 16, 16, 16, 16);
		}
		if (Fuelburning3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/fuel8.png"));
			this.blit(ms, this.leftPos + 79, this.topPos + 28, 0, 0, 16, 16, 16, 16);
		}
		if (Fuelburning2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/fuel9.png"));
			this.blit(ms, this.leftPos + 79, this.topPos + 28, 0, 0, 16, 16, 16, 16);
		}
		if (FuelburningProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/burningfull.png"));
			this.blit(ms, this.leftPos + 79, this.topPos + 28, 0, 0, 16, 16, 16, 16);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/furnace_gui_1.png"));
		this.blit(ms, this.leftPos + 98, this.topPos + 48, 0, 0, 25, 17, 25, 17);

		if (Powertick0Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/batterv1.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 28, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery5.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 27, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery10.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 27, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery20.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 27, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery30.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 27, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery40.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 27, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery50.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 27, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery60.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 27, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery70.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 27, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery80.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 27, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery92full.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 27, 0, 0, 10, 50, 10, 50);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/input.png"));
		this.blit(ms, this.leftPos + 74, this.topPos + 44, 0, 0, 25, 25, 25, 25);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/output.png"));
		this.blit(ms, this.leftPos + 121, this.topPos + 44, 0, 0, 25, 25, 25, 25);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/fuelgui.png"));
		this.blit(ms, this.leftPos + 79, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/dustgui.png"));
		this.blit(ms, this.leftPos + 126, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/batteryoverlay.png"));
		this.blit(ms, this.leftPos + 7, this.topPos + 28, 0, 0, 10, 50, 10, 50);

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
		this.font.draw(poseStack, Component.translatable("gui.elec_tronics.coalgenerator_gui.label_inventory"), 6, 81, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.elec_tronics.coalgenerator_gui.label_coal_generator"), 4, 4, -13421773);
		this.font.draw(poseStack, Component.translatable("gui.elec_tronics.coalgenerator_gui.label_rf"), 7, 17, -6750208);
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
