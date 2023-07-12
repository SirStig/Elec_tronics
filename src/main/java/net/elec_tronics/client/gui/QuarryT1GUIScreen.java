package net.elec_tronics.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;

import net.elec_tronics.world.inventory.QuarryT1GUIMenu;
import net.elec_tronics.procedures.TankOilAmountProcedure;
import net.elec_tronics.procedures.TankCoolantAmountProcedure;
import net.elec_tronics.procedures.QuarryOnOffButtonProcedure;
import net.elec_tronics.procedures.QuarryOnOffButtonOffProcedure;
import net.elec_tronics.procedures.PowerAmountProcedure;
import net.elec_tronics.procedures.InfoLogTypeProcedure;
import net.elec_tronics.procedures.InfoLogTextProcedure;
import net.elec_tronics.procedures.InfoLogText3Procedure;
import net.elec_tronics.procedures.InfoLogText2Procedure;
import net.elec_tronics.procedures.InfoLogShowProcedure;
import net.elec_tronics.procedures.InfoLogOreBrokenProcedure;
import net.elec_tronics.procedures.InfoLogBlocksBrokenProcedure;
import net.elec_tronics.network.QuarryT1GUIButtonMessage;
import net.elec_tronics.ElecTronicsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class QuarryT1GUIScreen extends AbstractContainerScreen<QuarryT1GUIMenu> {
	private final static HashMap<String, Object> guistate = QuarryT1GUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_on;
	ImageButton imagebutton_1171173571_logscommentsicon;

	public QuarryT1GUIScreen(QuarryT1GUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		if (mouseX > leftPos + 10 && mouseX < leftPos + 18 && mouseY > topPos + 30 && mouseY < topPos + 54)
			this.renderTooltip(ms, Component.literal(PowerAmountProcedure.execute(world, x, y, z)), mouseX, mouseY);
		if (mouseX > leftPos + 9 && mouseX < leftPos + 19 && mouseY > topPos + 54 && mouseY < topPos + 78)
			this.renderTooltip(ms, Component.literal(PowerAmountProcedure.execute(world, x, y, z)), mouseX, mouseY);
		if (mouseX > leftPos + 21 && mouseX < leftPos + 31 && mouseY > topPos + 31 && mouseY < topPos + 55)
			this.renderTooltip(ms, Component.literal(TankCoolantAmountProcedure.execute(world, x, y, z)), mouseX, mouseY);
		if (mouseX > leftPos + 21 && mouseX < leftPos + 31 && mouseY > topPos + 55 && mouseY < topPos + 79)
			this.renderTooltip(ms, Component.literal(TankCoolantAmountProcedure.execute(world, x, y, z)), mouseX, mouseY);
		if (mouseX > leftPos + 74 && mouseX < leftPos + 84 && mouseY > topPos + 30 && mouseY < topPos + 54)
			this.renderTooltip(ms, Component.literal(TankOilAmountProcedure.execute(world, x, y, z)), mouseX, mouseY);
		if (mouseX > leftPos + 74 && mouseX < leftPos + 84 && mouseY > topPos + 54 && mouseY < topPos + 78)
			this.renderTooltip(ms, Component.literal(TankOilAmountProcedure.execute(world, x, y, z)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/quarryback.png"));
		this.blit(ms, this.leftPos + -1, this.topPos + 0, 0, 0, 177, 166, 177, 166);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/quarry_t_1_gui.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + -1, 0, 0, 176, 166, 176, 166);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/13158264-minecraftglass_l.png"));
		this.blit(ms, this.leftPos + 21, this.topPos + 30, 0, 0, 10, 50, 10, 50);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/batterv1.png"));
		this.blit(ms, this.leftPos + 9, this.topPos + 30, 0, 0, 10, 50, 10, 50);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/batteryoverlay.png"));
		this.blit(ms, this.leftPos + 9, this.topPos + 30, 0, 0, 10, 50, 10, 50);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/13158264-minecraftglass_l.png"));
		this.blit(ms, this.leftPos + 74, this.topPos + 30, 0, 0, 10, 50, 10, 50);

		if (InfoLogShowProcedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/guibackground.png"));
			this.blit(ms, this.leftPos + -90, this.topPos + 80, 0, 0, 88, 83, 88, 83);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/coolantcontainer.png"));
		this.blit(ms, this.leftPos + 32, this.topPos + 63, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/oilcontainer.png"));
		this.blit(ms, this.leftPos + 57, this.topPos + 63, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, Component.translatable("gui.elec_tronics.quarry_t_1_gui.label_quarry_tier_1"), 104, 4, -16737895);
		if (InfoLogShowProcedure.execute(world, x, y, z))
			this.font.draw(poseStack,

					InfoLogTextProcedure.execute(world, x, y, z), -87, 96, -3355444);
		if (InfoLogShowProcedure.execute(world, x, y, z))
			this.font.draw(poseStack,

					InfoLogTypeProcedure.execute(world, x, y, z), -87, 83, -3355444);
		if (InfoLogShowProcedure.execute(world, x, y, z))
			this.font.draw(poseStack,

					InfoLogText2Procedure.execute(world, x, y, z), -87, 109, -3355444);
		if (InfoLogShowProcedure.execute(world, x, y, z))
			this.font.draw(poseStack,

					InfoLogText3Procedure.execute(world, x, y, z), -87, 122, -3355444);
		if (InfoLogShowProcedure.execute(world, x, y, z))
			this.font.draw(poseStack,

					InfoLogBlocksBrokenProcedure.execute(world, x, y, z), -87, 150, -1);
		if (InfoLogShowProcedure.execute(world, x, y, z))
			this.font.draw(poseStack,

					InfoLogOreBrokenProcedure.execute(world, x, y, z), -87, 139, -16737895);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.elec_tronics.quarry_t_1_gui.button_empty"), e -> {
			if (QuarryOnOffButtonOffProcedure.execute(world, x, y, z)) {
				ElecTronicsMod.PACKET_HANDLER.sendToServer(new QuarryT1GUIButtonMessage(0, x, y, z));
				QuarryT1GUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 149, this.topPos + 60, 19, 20).build(builder -> new Button(builder) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (QuarryOnOffButtonOffProcedure.execute(world, x, y, z))
					super.render(ms, gx, gy, ticks);
			}
		});
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_on = Button.builder(Component.translatable("gui.elec_tronics.quarry_t_1_gui.button_on"), e -> {
			if (QuarryOnOffButtonProcedure.execute(world, x, y, z)) {
				ElecTronicsMod.PACKET_HANDLER.sendToServer(new QuarryT1GUIButtonMessage(1, x, y, z));
				QuarryT1GUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 149, this.topPos + 60, 19, 20).build(builder -> new Button(builder) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (QuarryOnOffButtonProcedure.execute(world, x, y, z))
					super.render(ms, gx, gy, ticks);
			}
		});
		guistate.put("button:button_on", button_on);
		this.addRenderableWidget(button_on);
		imagebutton_1171173571_logscommentsicon = new ImageButton(this.leftPos + -18, this.topPos + 63, 16, 16, 0, 0, 16, new ResourceLocation("elec_tronics:textures/screens/atlas/imagebutton_1171173571_logscommentsicon.png"), 16, 32, e -> {
			if (true) {
				ElecTronicsMod.PACKET_HANDLER.sendToServer(new QuarryT1GUIButtonMessage(2, x, y, z));
				QuarryT1GUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_1171173571_logscommentsicon", imagebutton_1171173571_logscommentsicon);
		this.addRenderableWidget(imagebutton_1171173571_logscommentsicon);
	}
}
