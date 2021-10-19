package app;

public class gyroscope {
    private float axisX;
    private float axisY;
    private float axisZ;
    
    public gyroscope(float x,float y,float z) {
	this.setAxisX(x);
	this.setAxisY(y);
	this.setAxisZ(z);
    }
    
    
    public float getAxisX() {
	return axisX;
    }
    
    public void setAxisX(float axisX) {
	this.axisX = axisX;
    }
    
    public float getAxisY() {
	return axisY;
    }
    
    public void setAxisY(float axisY) {
	this.axisY = axisY;
    }
    
    public float getAxisZ() {
	return axisZ;
    }
    
    public void setAxisZ(float axisZ) {
	this.axisZ = axisZ;
    }
    
    public void onRun(float x,float y,float z){
	this.setAxisX(x);
	this.setAxisY(y);
	this.setAxisZ(z);
    }
    
}
