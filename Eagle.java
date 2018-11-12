public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    public void takeOff() {
 	System.out.printf("%s takes off in the sky.%n", this.getName());	
    }

    public int ascend(int meters) {
	this.altitude += meters;
	System.out.printf("%s flies upward " + meters + " meters %n", this.getName());
    	return meters;
    }

    public int descend(int meters) {
    	this.altitude += meters;
	System.out.printf("%s flies downward " + meters + " meters %n", this.getName());
	return meters;
    }

    public void land () {

        if (this.altitude <= 5 ) {
            System.out.println("Gotta land ma men !");
            this.altitude = 0;
        } else {
            System.out.println("Ain't landin from so high ! I'm too high ... <)~");
        }
    }
}
