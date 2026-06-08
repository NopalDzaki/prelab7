//Note: Please log in to Codeboard with your account before submission. Anonymous submissions will strictly not be graded.

/**
 * ES234211 - Programming Fundamental
 * Genap, 2025/2026
 * Labwork      : 06
 * Part         : A
 * Student ID   : 5026251219
 * Full Name    : Naufal Dzaki Al Thaafah
 * Class        : C
 */

/**
 * Step by Step Problem Solving:
 * Input        :
 * data diambil dari file vehicle.txt
 * isinya ada ukuran roda sepeda, data motor, dan data bus
 * baris pertama untuk wheel size sepeda
 * baris kedua untuk fuel capacity dan mileage motor
 * baris ketiga untuk passenger count dan capacity bus
 *
 * Steps        :
 * 1. program membaca isi file vehicle.txt dengan Scanner
 * 2. data pertama dipakai untuk membuat object A dari class Bicycle
 * 3. data kedua dan ketiga dipakai untuk membuat object B dari class Motorcycle
 * 4. data keempat dan kelima dipakai untuk membuat object C dari class Bus
 * 5. setelah object dibuat, program mengambil data tiap kendaraan lewat getter
 * 6. program menghitung jarak maksimum sepeda dari ukuran rodanya
 * 7. program menghitung luas roda sepeda memakai rumus luas lingkaran
 * 8. program menghitung jarak maksimum motor dri kapasitas bensin dan mileage
 * 9. program menghitung bensin yang dibutuhkan motor untuk menempuh 360 km
 * 10. program menghitung jumlah perjalanan bus dengan rekursi
 * 11. semua hasil ditampilkan sesuai format output yg diminta
 *
 * Output       :
 * program menampilkan informasi sepeda, motor, dan bus
 * program juga menampilkan hasil perhitungan jarak maksimum,
 * luas roda, kebutuhan bensin, dan jumlah minimum perjalanan bus
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(Main.class.getResourceAsStream("vehicle.txt"));

        int wheelSize = sc.nextInt();

        int fuelCapacity = sc.nextInt();
        int mileage = sc.nextInt();

        int passengerCount = sc.nextInt();
        int capacity = sc.nextInt();

        Bicycle A = new Bicycle(wheelSize);
        Motorcycle B = new Motorcycle(fuelCapacity, mileage);
        Bus C = new Bus(passengerCount, capacity);

        System.out.printf("A is a bicycle with wheel size of %d, maximum travel%n", A.getWheelSize());
        System.out.printf("distance of %.1f km, and wheel area of %.1f.%n", A.maxDistance(), A.wheelArea());

        System.out.printf("B is a motorcycle with fuel capacity of %d liters, mileage%n", B.getFuelCapacity());
        System.out.printf("of %d km/l, and maximum travel distance of %.1f km.%n", B.getMileage(), B.maxDistance());

        System.out.printf("The fuel needed by B to travel 360 km is %.1f liters.%n", B.fuelNeeded(360));

        System.out.printf("C is a bus with passenger count of %d and capacity of %d%n", C.getPassengerCount(), C.getCapacity());
        System.out.printf("passengers per trip.%n");

        System.out.printf("The minimum number of trips required by C is %d.%n", C.countTrips(C.getPassengerCount(), C.getCapacity()));

        sc.close();
    }
}