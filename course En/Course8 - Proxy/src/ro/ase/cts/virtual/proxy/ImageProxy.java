package ro.ase.cts.virtual.proxy;

public class ImageProxy implements ImageInterface {

	private Image realImage = null;
	private String file = null;

	public ImageProxy(final String image) {
		this.file = image;
	}

	@Override
	public void displayImage() {

		// check if we have enough memory
		if (DoWeHaveMemory(this.file))
			if (realImage == null)
				realImage = new Image(file);
		realImage.displayImage();
	}

	boolean DoWeHaveMemory(String fileName) {
		System.out.println("Memory check...");
		return true;
	}

}
