
package net.elec_tronics.client.gui;

public class ExtrusinmachineGUIScreen extends AbstractContainerScreen<ExtrusinmachineGUIMenu> {

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

	private static final ResourceLocation texture = new ResourceLocation("elec_tronics:textures/extrusinmachine_gui.png");

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

		if (

		Powertick0Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/batterv1.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (

		Powertick1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery5.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (

		Powertick2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery10.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (

		Powertick3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery20.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (

		Powertick4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery30.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (

		Powertick5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery40.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (

		Powertick6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery50.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (

		Powertick7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery60.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (

		Powertick8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery70.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (

		Powertick8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery80.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (

		Powertick9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/battery92full.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 22, 0, 0, 10, 50, 10, 50);
		}
		if (

		CraftingTime0Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/furnace_gui_1.png"));
			this.blit(ms, this.leftPos + 73, this.topPos + 43, 0, 0, 25, 17, 25, 17);
		}
		if (

		CraftingTime1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/arrow9.png"));
			this.blit(ms, this.leftPos + 70, this.topPos + 44, 0, 0, 32, 16, 32, 16);
		}
		if (

		Craftingtime2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/arrow8.png"));
			this.blit(ms, this.leftPos + 70, this.topPos + 44, 0, 0, 32, 16, 32, 16);
		}
		if (

		Craftingtime3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/arrow7.png"));
			this.blit(ms, this.leftPos + 70, this.topPos + 44, 0, 0, 32, 16, 32, 16);
		}
		if (

		Craftingtime4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/arrow6.png"));
			this.blit(ms, this.leftPos + 70, this.topPos + 44, 0, 0, 32, 16, 32, 16);
		}
		if (

		Craftingtime5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/arrow5.png"));
			this.blit(ms, this.leftPos + 70, this.topPos + 44, 0, 0, 32, 16, 32, 16);
		}
		if (

		Craftingtime6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/arrow4.png"));
			this.blit(ms, this.leftPos + 70, this.topPos + 44, 0, 0, 32, 16, 32, 16);
		}
		if (

		Craftingtie7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/arrow3.png"));
			this.blit(ms, this.leftPos + 70, this.topPos + 44, 0, 0, 32, 16, 32, 16);
		}
		if (

		Craftingtime8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/arrow2.png"));
			this.blit(ms, this.leftPos + 70, this.topPos + 44, 0, 0, 32, 16, 32, 16);
		}
		if (

		Craftingtime9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/arrow1.png"));
			this.blit(ms, this.leftPos + 70, this.topPos + 44, 0, 0, 32, 16, 32, 16);
		}
		if (

		Craftingtime10Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/2474b6354f6757ab86373259b87a2ad3_1.png"));
			this.blit(ms, this.leftPos + 71, this.topPos + 42, 0, 0, 28, 18, 28, 18);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/input.png"));
		this.blit(ms, this.leftPos + 47, this.topPos + 38, 0, 0, 25, 25, 25, 25);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/output.png"));
		this.blit(ms, this.leftPos + 101, this.topPos + 38, 0, 0, 25, 25, 25, 25);

		RenderSystem.setShaderTexture(0, new ResourceLocation("elec_tronics:textures/ingotgui.png"));
		this.blit(ms, this.leftPos + 51, this.topPos + 22, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "Extrusion Machine", 5, 4, -12829636);
		this.font.draw(poseStack, "Inventory", 5, 83, -12829636);
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
