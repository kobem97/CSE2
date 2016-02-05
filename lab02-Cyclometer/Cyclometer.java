//Kobe Miller
//Demo 0
//Hello World Java Program
//
//  first compile the program
//      javac HelloWorld.java
//  run the program
//      java HelloWorld//

//  define a class
//Kobe Miller
//2-5-16
//Cyclometer will calculate
//Minutes in each trip
//Counts for each trip
//Distance of each trip in miles
//Distiance of two trips combined
//MPG

public class Cyclometer {
       public static void main(String[] args) {
        int secsTrip1=480;  //This will tell the computer there is 480 seconds in trip 1
        int secsTrip2=3220;  //This will tell the computer there is 3220 seconds in trip 2
        int countsTrip1=1561;  //This says there is 1561 rotations in trip 1
        int countsTrip2=9037; //This says there is 9037 rotations in trip 2
        // our intermediate variables and output data. 
        double wheelDiameter=27.0,  //Diameter of the wheel
        PI=3.14159, //This gives a number for the variable PI
        feetPerMile=5280,  //Conversion
        inchesPerFoot=12,   //Conversion
        secondsPerMinute=60;  //Conversion
        double distanceTrip1, distanceTrip2,totalDistance;  //Variables
        //
        //
        System.out.println("Trip 1 took "+
                (secsTrip1/secondsPerMinute)+" minutes and had "+
                 countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
                (secsTrip2/secondsPerMinute)+" minutes and had "+
                 countsTrip2+" counts.");
        //run the calculations; store the values. Document your
        //calculation here. What are you calculating?
        //
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");

    }  //end of main method   
} //end of class