package net.elec_tronics.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.elec_tronics.world.inventory.UpdateMenuMenu;
import net.elec_tronics.network.UpdateMenuButtonMessage;
import net.elec_tronics.ElecTronicsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class UpdateMenuScreen extends AbstractContainerScreen<UpdateMenuMenu> {
	private final static HashMap<String, Object> guistate = UpdateMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_button;
	ImageButton imagebutton_button1;

	public UpdateMenuScreen(UpdateMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 183;
		this.imageHeight = 60;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/updatemenubackground.png"));
		this.blit(ms, this.leftPos + 1, this.topPos + 0, 0, 0, 183, 60, 183, 60);

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
		this.font.draw(poseStack, Component.translatable("gui.elec_tronics.update_menu.label_update"), 118, 29, -1);
		this.font.draw(poseStack, Component.translatable("gui.elec_tronics.update_menu.label_ignore"), 36, 29, -1);
		this.font.draw(poseStack, Component.translatable("gui.elec_tronics.update_menu.label_elec_tronics_is_out_of_date"), 18, 4, -1);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_button = new ImageButton(this.leftPos + 27, this.topPos + 24, 50, 20, 0, 0, 20, new ResourceLocation("elec_tronics:textures/screens/atlas/imagebutton_button.png"), 50, 40, e -> {
			if (true) {
				ElecTronicsMod.PACKET_HANDLER.sendToServer(new UpdateMenuButtonMessage(0, x, y, z));
				UpdateMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button", imagebutton_button);
		this.addRenderableWidget(imagebutton_button);
		imagebutton_button1 = new ImageButton(this.leftPos + 110, this.topPos + 24, 50, 20, 0, 0, 20, new ResourceLocation("elec_tronics:textures/screens/atlas/imagebutton_button1.png"), 50, 40, e -> {
			if (true) {
				ElecTronicsMod.PACKET_HANDLER.sendToServer(new UpdateMenuButtonMessage(1, x, y, z));
				UpdateMenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_button1", imagebutton_button1);
		this.addRenderableWidget(imagebutton_button1);
	}
}
