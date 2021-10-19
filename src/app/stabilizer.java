package app;


public class stabilizer {
    private gyroscope        gyro     =	 new gyroscope(0,0,0);
    private airplane_actions airplane =  new airplane_actions();
    
    public stabilizer() {
	
    }

    public gyroscope getGyro() {
	return gyro;
    }

    public void setGyro(gyroscope gyro) {
	this.gyro = gyro;
    }
    
    public void trimAileron(String signal) {
	
	if(signal.contains("+")) {
	    this.airplane.
	    setAileron_right(this.airplane.getAileron_right()+1);
	    
	    this.airplane.
	    setAileron_left(this.airplane.getAileron_left()-1);
	}
	
	if(signal.contains("-")) {

	    this.airplane.
	    setAileron_left(this.airplane.getAileron_left()+1);
	    
	    this.airplane.
	    setAileron_right(this.airplane.getAileron_right()-1);
	    
	    
	}
    }
    
    public void trimRudder(String signal) {
	if(signal.contains("+")) {
	    this.airplane.
	    setRudder(this.airplane.getRudder()+1);
	}
	
	if(signal.contains("-")) {
	    this.airplane.
	    setRudder(this.airplane.getRudder()-1);
	}
    }
    
    public void trimElevon(String signal) {
	if(signal.contains("+")) {
	    this.airplane.
	    setElevon(this.airplane.getElevon()+1);
	}
	
	if(signal.contains("-")) {
	    this.airplane.
	    setElevon(this.airplane.getElevon()-1);

	}
    }
    
    public void stabilize() {
	this.airplane.setAileron_left(0);
	this.airplane.setAileron_right(0);
	this.airplane.setRudder(0);
	this.airplane.setElevon(0);
    }

    public airplane_actions getAirplane() {
	return airplane;
    }

    public void setAirplane(airplane_actions airplane) {
	this.airplane = airplane;
    }
}
