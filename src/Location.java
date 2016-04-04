public class Location {
	private String name;
	private String desc;
	private String img;
	private String left;
	private String right;
	private String up;
	private String down;

	public void Location() {
		this.name = null;
		this.desc = null;
		this.img = null;
		this.left = null;
		this.right = null;
		this.up = null;
		this.down = null;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public void setLeft(String left) {
		this.left = left;
	}

	public void setRight(String right) {
		this.right = right;
	}

	public void setUp(String up) {
		this.up = up;
	}

	public void setDown(String down) {
		this.down = down;
	}


	public String getName() {
		return this.name;
	}

	public String getDesc() {
		return this.desc;
	}

	public String getImg() {
		return this.img;
	}

	public String getLeft() {
		return this.left;
	}

	public String getRight() {
		return this.right;
	}

	public String getUp() {
		return this.up;
	}

	public String getDown() {
		return this.down;
	}

	public String toString() {
		String output = "";

		output = "Name: " + this.name + "\n"+
		         "Description: " + this.desc + "\n" +
		         "Image: " + this.img + "\n" +
		         "Left: " + this.left + "\n" +
		         "Right: " + this.right + "\n" +
		         "Up: " + this.up + "\n" +
		         "Down: " + this.down;

		return output;
	}
}
