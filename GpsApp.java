/*
 * A simple Java Programm that simulates a GPGGA GPS device
 * and processes the GPGGA data output stream
 */

package GpsApp;

/**
 *
 * @author KIBOI
 */
public class GpsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // splits the gpsdata stream into individaul components
        String Output = GpsSimulator.GpsOutput();
        System.out.println("Your GPS device returned:");
        System.out.println(Output);
        String[] dataprocd = Output.split(",");
        String[] time = dataprocd[1].split("");
        System.out.println("GPS Device Type :" + dataprocd[0]);
        System.out.println("Time :" + time[1]+time[2]+" Hrs  "+time[3]+time[4]+" Mins  "+time[5]+time[6]+" secs");
        System.out.println("Latitude :" + dataprocd[2]+dataprocd[3]);
        System.out.println("Longitude :" + dataprocd[4]+ dataprocd[5]);
        System.out.println("Fix Quality :" + dataprocd[6]);
        System.out.println("Number of Satellites:" + dataprocd[7]);
        System.out.println("Horizontal Dilution of Precision (HDOP):" + dataprocd[8]);
        System.out.println("Altitude:" + dataprocd[9]+dataprocd[10]);
        System.out.println("Height of geoid above WGS84 ellipsoid:" + dataprocd[11] + dataprocd[12]);
        System.out.println("Time since last DGPS update:" + dataprocd[13]);
        System.out.println("DGPS reference station id:" + "No station id captured");
        System.out.println("Checksum:" + dataprocd[14]);
        
        // prints out our gpggadata samples
    }
        
}

