package ro.ase.cts.virtual.proxy;

//test git

public class Image implements ImageInterface{

	private String file = null;
	
	@Override
	public void displayImage() {

		System.out.println("Display:"+file);
	}
	
	public Image(final String Imagine){
		file = Imagine;
		loadImage();
	}
	
	public void loadImage(){
		System.out.println(this.file+
				" Load image ...");
	}
}
