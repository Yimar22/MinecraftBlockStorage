package model;

public class Block {
	
	private String id;
	private String pathImg;
	private Block next;
	
	public Block(String id, String pathImg) {
		this.id=id;
		this.pathImg=pathImg;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getPathImg() {
		return pathImg;
	}

	public void setPathImg(String pathImg) {
		this.pathImg = pathImg;
	}

	public Block getNext() {
		return next;
	}

	public void setNext(Block next) {
		this.next = next;
	}
	
	
	
	
}
