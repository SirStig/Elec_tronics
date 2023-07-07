package net.elec_tronics.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

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

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CrusherT1GUIScreen extends AbstractContainerScreen<CrusherT1GUIMenu> {
	private final static HashMap<String, Object> guistate = CrusherT1GUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_output;

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

	private static final ResourceLocation texture = new ResourceLocation("elec_tronics:textures/screens/crusher_t_1_gui.png");

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
		if (Powertick0Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/batterv1.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery5.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery10.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery20.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery30.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery40.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery50.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery60.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery70.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery80.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}
		if (Powertick9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/battery92full.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 10, 50, 10, 50);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/dustgui.png"));
		this.blit(ms, this.leftPos + 115, this.topPos + 46, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/input.png"));
		this.blit(ms, this.leftPos + 63, this.topPos + 17, 0, 0, 25, 25, 25, 25);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/screens/oregui.png"));
		this.blit(ms, this.leftPos + 47, this.topPos + 22, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, Component.translatable("gui.elec_tronics.crusher_t_1_gui.label_inventory"), 6, 72, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.elec_tronics.crusher_t_1_gui.label_crusher_tier_1"), 95, 5, -16737895);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_output = new ImageButton(this.leftPos + 92, this.topPos + 41, 25, 25, 0, 0, 25, new ResourceLocation("elec_tronics:textures/screens/atlas/imagebutton_output.png"), 25, 50, e -> {
		});
		guistate.put("button:imagebutton_output", imagebutton_output);
		this.addRenderableWidget(imagebutton_output);
	}
}
