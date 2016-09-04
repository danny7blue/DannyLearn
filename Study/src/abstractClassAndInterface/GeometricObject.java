/**
 * 
 */
package abstractClassAndInterface;

import java.util.Date;

/**
 * @author Danny
 *
 */
public abstract class GeometricObject implements Comparable<GeometricObject>, Cloneable{
	private String color = "white";
	private boolean isFilled;
	private Date dateCreated;
	protected GeometricObject() {
		dateCreated = new Date();
	}
	
	protected GeometricObject(String color, boolean isFilled) {
		this.color = color;
		this.isFilled = isFilled;
		dateCreated = new Date();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", isFilled=" + isFilled
				+ ", dateCreated=" + dateCreated + "]";
	}

	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	@Override
	public int compareTo(GeometricObject o) {
		if (getArea() > o.getArea()) {
			return 1;
		} else if (getArea() == o.getArea()) {
			return 0;
		} else 
			return -1;
	}
	
}
