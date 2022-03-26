package com.parkinglot;

import java.util.Scanner;

import com.parkinglot.entity.Command;
import com.parkinglot.entity.DisplayType;
import com.parkinglot.entity.ParkingLot;
import com.parkinglot.entity.VehicleType;
import com.parkinglot.service.ParkingLotService;

// https://www.youtube.com/watch?v=aQf-ovnR8go
// https://workat.tech/machine-coding/practice/design-parking-lot-qm6hwq4wkhp8
public class Main {

	public static void main(String[] args) {

		ParkingLotService parkingLotService = new ParkingLotService();

		while (true) {
			Scanner scan = new Scanner(System.in);
			Command type = Command.of(scan.next());
			switch (type) {
			case CREATE_PARKING_LOT:
				parkingLotService.createParkingLot(new ParkingLot(scan.next(), scan.nextInt(), scan.nextInt()));
				break;
			case PARK_VEHICLE:
				parkingLotService.parkVehicle(VehicleType.valueOf(scan.next()), scan.next(), scan.next());
				break;
			case UNPARK_VEHICLE:
				parkingLotService.unParkVehicle(scan.next());
				break;
			case DISPLAY:
				parkingLotService.display(DisplayType.of(scan.next()), VehicleType.valueOf(scan.next()));
				break;
			case EXIT:
				return;
			}
		}
	}

}

/*
Input / Output :
	create_parking_lot PR1234 2 6
	Created parking lot with 2floors and 6 slots per floor
	display free_count CAR
	 No. of free slots for CAR on Floor 1 :3
	 No. of free slots for CAR on Floor 2 :3
	display free_count BIKE
	 No. of free slots for BIKE on Floor 1 :2
	 No. of free slots for BIKE on Floor 2 :2

	display free_count TRUCK
	 No. of free slots for TRUCK on Floor 1 :1
	 No. of free slots for TRUCK on Floor 2 :1

	display free_slots CAR
	Free slots for CAR on Floor 1 :4,5,6,
	Free slots for CAR on Floor 2 :4,5,6,

	display free_slots BIKE
	Free slots for BIKE on Floor 1 :2,3,
	Free slots for BIKE on Floor 2 :2,3,

	display free_slots TRUCK
	Free slots for TRUCK on Floor 1 :1,
	Free slots for TRUCK on Floor 2 :1,

	display occupied_slots CAR
	Occupied slots for CAR on Floor 1 :
	Occupied slots for CAR on Floor 2 :

	display occupied_slots BIKE
	Occupied slots for BIKE on Floor 1 :
	Occupied slots for BIKE on Floor 2 :

	display occupied_slots TRUCK
	Occupied slots for TRUCK on Floor 1 :
	Occupied slots for TRUCK on Floor 2 :

	park_vehicle CAR KA-01-DB-1234 black
	Parked vehicle. Ticket ID: PR1234_1_4
	park_vehicle CAR KA-02-CB-1334 red
	Parked vehicle. Ticket ID: PR1234_1_5

	park_vehicle CAR KA-01-DB-1133 black
	Parked vehicle. Ticket ID: PR1234_1_6


	park_vehicle CAR KA-05-HJ-8432 white
	Parked vehicle. Ticket ID: PR1234_2_4

	park_vehicle CAR WB-45-HO-9032 white
	Parked vehicle. Ticket ID: PR1234_2_5

	park_vehicle CAR KA-01-DF-8230 black
	Parked vehicle. Ticket ID: PR1234_2_6

	park_vehicle CAR KA-21-HS-2347 red
	Parking Lot Full

	display free_count CAR
	 No. of free slots for CAR on Floor 1 :0
	 No. of free slots for CAR on Floor 2 :0

	display free_count BIKE
	 No. of free slots for BIKE on Floor 1 :2
	 No. of free slots for BIKE on Floor 2 :2

	display free_count TRUCK
	 No. of free slots for TRUCK on Floor 1 :1
	 No. of free slots for TRUCK on Floor 2 :1

	unpark_vehicle PR1234_2_5
	Unparked vehicle with Registration Number:WB-45-HO-9032and Color:white

	unpark_vehicle PR1234_2_5
	Invalid Ticket

	unpark_vehicle PR1234_2_7
	Invalid Ticket

	display free_count CAR
	 No. of free slots for CAR on Floor 1 :0
	 No. of free slots for CAR on Floor 2 :1

	display free_count BIKE
	 No. of free slots for BIKE on Floor 1 :2
	 No. of free slots for BIKE on Floor 2 :2

	display free_count TRUCK
	 No. of free slots for TRUCK on Floor 1 :1
	 No. of free slots for TRUCK on Floor 2 :1

	display free_slots CAR
	Free slots for CAR on Floor 1 :
	Free slots for CAR on Floor 2 :5,

	display free_slots BIKE
	Free slots for BIKE on Floor 1 :2,3,
	Free slots for BIKE on Floor 2 :2,3,

	display free_slots TRUCK
	Free slots for TRUCK on Floor 1 :1,
	Free slots for TRUCK on Floor 2 :1,

	display occupied_slots CAR
	Occupied slots for CAR on Floor 1 :4,5,6,
	Occupied slots for CAR on Floor 2 :4,6,

	display occupied_slots BIKE
	Occupied slots for BIKE on Floor 1 :
	Occupied slots for BIKE on Floor 2 :

	display occupied_slots TRUCK
	Occupied slots for TRUCK on Floor 1 :
	Occupied slots for TRUCK on Floor 2 :


	park_vehicle BIKE KA-01-DB-1541 black
	Parked vehicle. Ticket ID: PR1234_1_2

	park_vehicle TRUCK KA-32-SJ-5389 orange
	Parked vehicle. Ticket ID: PR1234_1_1

	park_vehicle TRUCK KL-54-DN-4582 green
	Parked vehicle. Ticket ID: PR1234_2_1

	park_vehicle TRUCK KL-12-HF-4542 green
	Parking Lot Full

	display free_count CAR
	 No. of free slots for CAR on Floor 1 :0
	 No. of free slots for CAR on Floor 2 :1

	display free_count BIKE
	 No. of free slots for BIKE on Floor 1 :1
	 No. of free slots for BIKE on Floor 2 :2

	display free_count TRUCK
	 No. of free slots for TRUCK on Floor 1 :0
	 No. of free slots for TRUCK on Floor 2 :0

	display free_slots CAR
	Free slots for CAR on Floor 1 :
	Free slots for CAR on Floor 2 :5,

	display free_slots BIKE
	Free slots for BIKE on Floor 1 :3,
	Free slots for BIKE on Floor 2 :2,3,

	display free_slots TRUCK
	Free slots for TRUCK on Floor 1 :
	Free slots for TRUCK on Floor 2 :

	display occupied_slots CAR
	Occupied slots for CAR on Floor 1 :4,5,6,
	Occupied slots for CAR on Floor 2 :4,6,

	display occupied_slots BIKE
	Occupied slots for BIKE on Floor 1 :2,
	Occupied slots for BIKE on Floor 2 :

	display occupied_slots TRUCK
	Occupied slots for TRUCK on Floor 1 :1,
	Occupied slots for TRUCK on Floor 2 :1,

*/