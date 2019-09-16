package threads;

import model.Inventory;
import ui.MinecraftStorageController;

public class AnimationThread extends Thread{
	
	private MinecraftStorageController msc;
	private Inventory inventory;
	
	public AnimationThread(MinecraftStorageController msc, Inventory inventory) {
		this.msc = msc;
		this.inventory = inventory;
	}
	
	@Override 
	public void run() {
	   	
		int cont = 0;
		while(cont<=26) {
			String id = "/images/block"+cont+".png";
			
			try {
				
			    msc.setImageRandom(id);
				sleep(80);
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cont++;	
		}
		msc.getAddInventory().setVisible(true);
		if(msc.getFeature()==msc.QUICK_ACCESS) {
			msc.getAddInventory().setVisible(false);
		}
		msc.setImageRandom("/images/"+inventory.getBlock()+".png");
		
	}

}
