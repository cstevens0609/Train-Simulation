/*
 * Dave Rosenberg
 * Comp 2000 - Data Structures
 * Lab: Queue App: Train Simulation
 * Fall, 2019
 * 
 * Usage restrictions:
 * 
 * You may use this code for exploration, experimentation, and furthering your
 * learning for this course. You may not use this code for any other
 * assignments, in my course or elsewhere, without explicit permission, in
 * advance, from myself (and the instructor of any other course).
 * 
 * Further, you may not post or otherwise share this code with anyone other than
 * current students in my sections of this course. Violation of these usage
 * restrictions will be considered a violation of the Wentworth Institute of
 * Technology Academic Honesty Policy.
 *
 * Do not remove this notice.
 */

package edu.wit.dcsn.comp2000.queueapp;

import java.io.FileNotFoundException;

import edu.wit.dcsn.comp2000.queueapp.Configuration.PairedLimit;
import edu.wit.dcsn.comp2000.queueapp.Configuration.RouteSpec;
import edu.wit.dcsn.comp2000.queueapp.Configuration.TrainSpec;

/**
 * @author Connor Stevens, Eli Dunker-Bendigo, Quinn Montgomery
 * @version 1.0.0
 */
public class TrainSimulation
	{

	private static Logger log = new Logger();
	
    
   // private static TrainRoute route = new TrainRoute(specification) ;
	/**
	 * @param args -unused-
	 * @throws FileNotFoundException 
	 */
	public static void main( String[] args ) throws FileNotFoundException{
        
		log.create();
        //log.write(Train.toString());

		Configuration    theConfiguration =    new Configuration() ;

	    int ticks = theConfiguration.getTicks();
	    int seed = theConfiguration.getSeed();
	    RouteSpec specification = theConfiguration.getRoute() ;
	    int[] stations = theConfiguration.getStations() ;
	    PairedLimit[] passengers = theConfiguration.getPassengers() ;
	    TrainSpec[] trains = theConfiguration.getTrains() ;
        
        //generate 50 original passengers
        
        //run simulate()
        
        System.out.println(theConfiguration.toString()) ;
	}
	
	
	public void simulate(int duration, Direction trainDirection, Station currentStation) {
        
		for(int tick = 0; tick < duration;  tick++) 
        {
            

            //if(currentStation.getLocation() == highest || currentStation.getLocation() == lowest) {
            	//route.reverseDirection(trainDirection) ; 
            //}
            //generate passenger
        }

	}
	
	
	}

