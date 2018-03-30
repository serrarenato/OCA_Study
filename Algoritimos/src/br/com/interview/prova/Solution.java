package br.com.interview.prova;
teste
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Solution {
	private static class Drone {
		private int id;
		private int flightRange;

		public Drone(int id, int flightRange) {

			this.id = id;
			this.flightRange = flightRange;
		}

		public int getId() {
			return id;
		}

		public int getFlightRange() {
			return flightRange;
		}

		@Override
		public String toString() {
			return "Drone [id=" + id + ", flightRange=" + flightRange + "]";
		}

	}

	public static void main(String[] args) {
		Collection<Drone> drones = new HashSet<>();
		Collection<Integer> inMaintenanceDrones = new HashSet<>();
	
		for (int x=1; x< 100000; x++) {
			drones.add(new Drone(x, (int) Math.random()*100));
		}
		for (int x=1; x< 40000; x++) {
			inMaintenanceDrones.add(x);
		}
//		Primeiro teste
		
	/*	inMaintenanceDrones.add(1);
		inMaintenanceDrones.add(5);
		inMaintenanceDrones.add(9);
	 	drones.add(new Drone(4, 11));
		drones.add(new Drone(2, 15));
		drones.add(new Drone(5, 16));
		drones.add(new Drone(3, 40));
		drones.add(new Drone(1, 20));
		drones.add(new Drone(9, 60));
		drones.add(new Drone(6, 22));*/
		long tempoInicial = System.currentTimeMillis();
		Collection<Integer> greatestFlightRangeDrones = greatestFlightRangeDrones(3, drones, inMaintenanceDrones);

		/*for (int i = 0; i < greatestFlightRangeDrones.size(); i++) {
			System.out.println(greatestFlightRangeDrones.get(i));
		}*/
		for (Integer integer : greatestFlightRangeDrones) {
			System.out.println(integer);
		}
		long tempoFinal = System.currentTimeMillis();
		System.out.printf("%.3f segundos%n", (tempoFinal - tempoInicial) / 1000d);
	}

	static Collection<Integer> greatestFlightRangeDrones(Integer numberOfRequiredDrones, Collection<Drone> drones,
			Collection<Integer> inMaintenanceDrones) {
		Collection<Drone> listOK = new HashSet<>();
		Collection<Integer> listBetters = new HashSet<>();

		for (Drone drone : drones) {
			boolean nOK = false;
			for (Integer dronesNumbers : inMaintenanceDrones) {
				if (drone.getId() == dronesNumbers) {
					nOK = true;
					break;
				}
			}
			if (!nOK) {
				listOK.add(drone.getFlightRange());
			}

		}

		Collections.sort(listOK, Collections.reverseOrder());
		
		for (int x = 0; x < numberOfRequiredDrones; x++) {
			for (Drone drone : drones) {
				if (drone.getFlightRange()==listOK.get(x)){
					listBetters.add(x, drone.getId());
					break;
				}
			}
		}

		return listBetters;

	}

}
