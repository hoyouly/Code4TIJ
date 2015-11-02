package com.hoyouly.chap10.ch8;

public class GreenhouseController extends Con {

	private boolean light = false;

	public class LightOn extends AAAA {

		public LightOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			light = true;
		}

		@Override
		public String toString() {
			return "light is on";
		}
	}

	public class LightOff extends AAAA {

		public LightOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			light = false;
		}

		@Override
		public String toString() {
			return "light is off";
		}
	}

	private boolean water = false;

	public class WaterOn extends AAAA {

		public WaterOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			water = true;
		}

		@Override
		public String toString() {
			return "Greenhouse water is on";
		}
	}

	public class WaterOff extends AAAA {

		public WaterOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			water = false;
		}

		@Override
		public String toString() {
			return "Greenhouse water  is off";
		}
	}

	private String thermostat = "Day";// n. 恒温(调节)器

	public class ThermostatDay extends AAAA {

		public ThermostatDay(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			thermostat = "day";
		}

		@Override
		public String toString() {
			return "thermostat on day settin";
		}
	}

	public class ThermostatNight extends AAAA {

		public ThermostatNight(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			thermostat = "nigth";
		}

		@Override
		public String toString() {
			return "thermostat on nigth setting";
		}
	}

	public class Bell extends AAAA {
		public Bell(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			addEvent(new Bell(delayTime));
		}

		@Override
		public String toString() {
			return "bing!!!";
		}
	}

	public class Restart extends AAAA {
		private AAAA[] events;

		public Restart(long delayTime, AAAA[] events) {
			super(delayTime);
			this.events = events;
			for (AAAA e : events) {
				addEvent(e);
			}
		}

		@Override
		public void action() {
			for (AAAA e : events) {
				e.start();
				addEvent(e);
			}
			start();
			addEvent(this);
		}

		@Override
		public String toString() {
			return "Restart System !!!";
		}
	}

	public static class Terminate extends AAAA {

		public Terminate(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			System.exit(0);
		}

		@Override
		public String toString() {
			return "Terminating!!!";
		}
	}

	public  static void main(String [] args){

		GreenhouseController gc = new GreenhouseController();
		gc.addEvent(gc.new Bell(900));

		AAAA[] eventList = { gc.new ThermostatNight(0), gc.new LightOn(220),
				gc.new LightOff(400), gc.new WaterOn(600),
				gc.new WaterOff(800), gc.new ThermostatDay(1400), };

		gc.new Restart(2000, eventList);
		if (args.length == 1) {
			gc.addEvent(new GreenhouseController.Terminate(new Integer(args[0])));
		}
		gc.run();

	}
	
	

}
