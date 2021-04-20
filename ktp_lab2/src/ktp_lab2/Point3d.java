package ktp_lab2;

public class Point3d {
	
	private double x;
	private double y;
	private double z;
	
	public Point3d(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Point3d() {
		this(0.0, 0.0, 0.0);
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return this.x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void setZ(double z) {
		this.z = z;
	}
	
	public double getZ() {
		return this.z;
	}
	
	public boolean equals(Point3d point) {
		return (this.x == point.x && this.y == point.y && this.z == point.z);
	}
	
	public double distanceTo(Point3d point) {
		double t = Math.sqrt((point.x - this.x)*(point.x - this.x) + (point.y - this.y)*(point.y - this.y) + (point.z - this.z)*(point.z - this.z));
		return Math.floor(t*100)/100;
	}
}
