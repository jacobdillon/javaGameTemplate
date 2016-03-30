import java.util.*;
public class Location{

	private String Name;
	private String Desc;
	private String Img;

	private String Left;
	private String Right;
	private String Up;
	private String Down;

	public void Location(){
		this.Name = null;
		this.Desc = null;
		this.Img = null;

		this.Left = null;
		this.Right = null;
		this.Up = null;
		this.Down = null;
	}

	public void setName(String Name){
		this.Name = Name;
	}

	public void setDesc(String Desc){
		this.Desc = Desc;
	}

	public void setImg(String Img){
		this.Img = Img;
	}

	public void setLeft(String Left){
		this.Left = Left;
	}

	public void setRight(String Right){
		this.Right = Right;
	}

	public void setUp(String Up){
		this.Up = Up;
	}

	public void setDown(String Down){
		this.Down = Down;
	}


	public String getName(){
		return this.Name;
	}

	public String getDesc(){
		return this.Desc;
	}

	public String getImg(){
		return this.Img;
	}

	public String getLeft(){
		return this.Left;
	}

	public String getRight(){
		return this.Right;
	}

	public String getUp(){
		return this.Up;
	}

	public String getDown(){
		return this.Down;
	}

}//End of Class