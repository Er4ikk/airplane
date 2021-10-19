package app;

public class engine {
    private float power;
    
    public engine() {
	this.setPower(0);
    }
    
    public float getPower() {
	return power;
    }

    public void setPower(float power) {
	this.power = power;
    }
    
    public void increasePower() {
	this.setPower(this.getPower()+1);
    }
    
    public void decreasePower() {
	this.setPower(this.getPower()-1);
    }

}
