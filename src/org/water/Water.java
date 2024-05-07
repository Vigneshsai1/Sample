
package org.water;

import org.air.Air;
import org.road.Road;
import org.transport.Transport;

public class Water {
	private void boat() {
		System.out.println("Naice to travel");
	}
	private void ship() {
		System.out.println("Its fastest to travel");

	}
	public static void main(String[] args) {
		
		Water a=new Water();
		a.boat();
		a.ship();
		
		Air b=new Air();
		b.aeroPlane();
		b.heliCopter();
		
		Transport c=new Transport();
		c.transportForm();
		
		Road d=new Road();
		d.bike();
		d.bus();
		d.cycle();
		d.car();
		
		
		
	}

}
