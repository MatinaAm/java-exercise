package section7;

import java.time.LocalTime;
import java.time.Duration;



    public class AirTrip {


            private String destination;
            private String flightNumber;
            private LocalTime departureTime;
            private String status;
            private Duration delay;

            public AirTrip(String destination, String flightNumber, LocalTime departureTime) {
                this.destination = destination;
                this.flightNumber = flightNumber;
                this.departureTime = departureTime;
                this.status = "سروقت";
                this.delay = Duration.ZERO;
            }

            public String getFlightStatus() {
                if (status.equals("تاخیر دارد")) {
                    long hours = delay.toHours();
                    long minutes = delay.toMinutes() % 60;
                    return String.format("%s: %02d:%02d", status, hours, minutes);
                } else {
                    return status;
                }
            }

            public void changeFlightStatus(String newStatus, Duration delay) {
                this.status = newStatus;
                if (newStatus.equals("تاخیر دارد")) {
                    this.delay = delay;
                } else {
                    this.delay = Duration.ZERO;
                }
            }

            public static void main(String[] args) {
                AirTrip trip = new AirTrip("Tehran", "IR123", LocalTime.of(14, 30));
                System.out.println(trip.getFlightStatus()); // Output: سروقت

                trip.changeFlightStatus("در حال مسافر گیری", Duration.ZERO);
                System.out.println(trip.getFlightStatus()); // Output: در حال مسافر گیری

                trip.changeFlightStatus("تاخیر دارد", Duration.ofMinutes(90));
                System.out.println(trip.getFlightStatus()); // Output: تاخیر دارد: 01:30
            }


    }
