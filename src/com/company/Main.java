package com.company;

import com.mxgraph.view.mxGraph;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;
import javax.swing.JFrame;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;





public class Main{

    public static void main(String[] args) {

        Graph<String, DefaultWeightedEdge> schoolMap = new DefaultDirectedWeightedGraph<>(DefaultWeightedEdge.class);

      //creating all verticies or Nodes

        schoolMap.addVertex("Security Gate");
        schoolMap.addVertex("Senior Lot");
        schoolMap.addVertex("Rock");
        schoolMap.addVertex("Teachers Lot");
        schoolMap.addVertex("Entrepreneurial Center");
        schoolMap.addVertex("Dining Hall");
        schoolMap.addVertex("Science Building");
        schoolMap.addVertex("Boys Dorm");
        schoolMap.addVertex("Chapel");
        schoolMap.addVertex("Alumni");
        schoolMap.addVertex("Girls Dorm");
        schoolMap.addVertex("Visual Arts");
        schoolMap.addVertex("US Classes");
        schoolMap.addVertex("Administration");


        // assigning each node or verticies its path to other verticies or nodes

        schoolMap.addEdge("Security Gate","Rock");
        schoolMap.addEdge("Security Gate","Senior Lot");
        schoolMap.addEdge("Security Gate","Administration");
        schoolMap.addEdge("Security Gate","Teachers Lot");

        schoolMap.addEdge("Senior Lot","Security Gate");
        schoolMap.addEdge("Senior Lot","Administration");

        schoolMap.addEdge("Teachers Lot","US Classes");
        schoolMap.addEdge("Teachers Lot","Girls Dorm");
        schoolMap.addEdge("Teachers Lot","Security Gate");

        schoolMap.addEdge("US Classes","Teachers Lot");
        schoolMap.addEdge("US Classes","Visual Arts");
        schoolMap.addEdge("US Classes","Administration");

        schoolMap.addEdge("Administration","US Classes");
        schoolMap.addEdge("Administration","Security Gate");
        schoolMap.addEdge("Administration","Alumni");
        schoolMap.addEdge("Administration","Senior Lot");

        schoolMap.addEdge("Rock","Security Gate");
        schoolMap.addEdge("Rock","Dining Hall");
        schoolMap.addEdge("Rock","Entrepreneurial Center");

        schoolMap.addEdge("Visual Arts","US Classes");
        schoolMap.addEdge("Visual Arts","Girls Dorm");

        schoolMap.addEdge("Entrepreneurial Center","Dining Hall");
        schoolMap.addEdge("Entrepreneurial Center","Rock");
        schoolMap.addEdge("Entrepreneurial Center","Chapel");

        schoolMap.addEdge("Girls Dorm","Teachers Lot");
        schoolMap.addEdge("Girls Dorm","Alumni");
        schoolMap.addEdge("Girls Dorm","Visual Arts");

        schoolMap.addEdge("Alumni","Administration");
        schoolMap.addEdge("Alumni","Girls Dorm");
        schoolMap.addEdge("Alumni","Chapel");

        schoolMap.addEdge("Chapel","Alumni");
        schoolMap.addEdge("Chapel","Entrepreneurial Center");
        schoolMap.addEdge("Chapel","Boys Dorm");

        schoolMap.addEdge("Boys Dorm","Chapel");
        schoolMap.addEdge("Boys Dorm","Science Building");

        schoolMap.addEdge("Science Building","Boys Dorm");
        schoolMap.addEdge("Science Building","Dining Hall");

        schoolMap.addEdge("Dining Hall","Science Building");
        schoolMap.addEdge("Dining Hall","Entrepreneurial Center");
        schoolMap.addEdge("Dining Hall","Rock");



        //setting each path's value/distance

        schoolMap.setEdgeWeight("Security Gate","Rock",1);
        schoolMap.setEdgeWeight("Security Gate","Senior Lot",1);
        schoolMap.setEdgeWeight("Security Gate","Administration",1);
        schoolMap.setEdgeWeight("Security Gate","Teachers Lot",3);

        schoolMap.setEdgeWeight("Senior Lot","Security Gate",1);
        schoolMap.setEdgeWeight("Senior Lot","Administration",2);

        schoolMap.setEdgeWeight("Teachers Lot","US Classes",1);
        schoolMap.setEdgeWeight("Teachers Lot","Security Gate",3);
        schoolMap.setEdgeWeight("Teachers Lot","Girls Dorm",2);

        schoolMap.setEdgeWeight("US Classes","Teachers Lot",1);
        schoolMap.setEdgeWeight("US Classes","Visual Arts",1);
        schoolMap.setEdgeWeight("US Classes","Administration",1);

        schoolMap.setEdgeWeight("Administration","Security Gate",1);
        schoolMap.setEdgeWeight("Administration","US Classes",1);
        schoolMap.setEdgeWeight("Administration","Senior Lot",2);

        schoolMap.setEdgeWeight("Rock","Security Gate",1);
        schoolMap.setEdgeWeight("Rock","Dining Hall",2);
        schoolMap.setEdgeWeight("Rock","Entrepreneurial Center",2);

        schoolMap.setEdgeWeight("Visual Arts","US Classes",1);
        schoolMap.setEdgeWeight("Visual Arts","Girls Dorm",1);

        schoolMap.setEdgeWeight("Entrepreneurial Center","Dining Hall",2);
        schoolMap.setEdgeWeight("Entrepreneurial Center","Rock",2);
        schoolMap.setEdgeWeight("Entrepreneurial Center","Chapel",5);

        schoolMap.setEdgeWeight("Girls Dorm","Teachers Lot",2);
        schoolMap.setEdgeWeight("Girls Dorm","Alumni",3);
        schoolMap.setEdgeWeight("Girls Dorm","Visual Arts",1);

        schoolMap.setEdgeWeight("Alumni","Administration",4);
        schoolMap.setEdgeWeight("Alumni","Girls Dorm",3);
        schoolMap.setEdgeWeight("Alumni","Chapel",2);

        schoolMap.setEdgeWeight("Chapel","Alumni",2);
        schoolMap.setEdgeWeight("Chapel","Entrepreneurial Center",5);
        schoolMap.setEdgeWeight("Chapel","Boys Dorm",1);

        schoolMap.setEdgeWeight("Boys Dorm","Chapel",1);
        schoolMap.setEdgeWeight("Boys Dorm","Science Building",1);

        schoolMap.setEdgeWeight("Science Building","Boys Dorm",1);
        schoolMap.setEdgeWeight("Science Building","Dining Hall",1);

        schoolMap.setEdgeWeight("Dining Hall","Science Building",1);
        schoolMap.setEdgeWeight("Dining Hall","Entrepreneurial Center",2);
        schoolMap.setEdgeWeight("Dining Hall","Rock",3);



   // randomDistances(schoolMap);
   // System.out.println(schoolMap.getEdgeWeight(schoolMap.getEdge("Dining Hall","Science Building")));

     //  System.out.println(schoolMap.edgesOf("Visual Arts"));
        System.out.println(schoolMap.outgoingEdgesOf("Visual Arts"));

      System.out.println(traversalNode(schoolMap));


    // Map Visualizer
/*
        mxGraph graph = new mxGraph();
        Object parent = graph.getDefaultParent();

        graph.getModel().beginUpdate();
        try
        {
            Object v1 = graph.insertVertex(parent, null, "Hello", 20, 20, 80,
                    30);
            Object v2 = graph.insertVertex(parent, null, "World!",
                    240, 150, 80, 30);
            graph.insertEdge(parent, null, "Edge", v1, v2);
        }
        finally
        {
            graph.getModel().endUpdate();
        }


 */























































    }

    private static void randomDistances(Graph<String, DefaultWeightedEdge> schoolMap) {

        schoolMap.setEdgeWeight("Security Gate","Rock",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Security Gate","Senior Lot",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Security Gate","Administration",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Security Gate","Teachers Lot",((int)(Math.random() * 20) + 1));

        schoolMap.setEdgeWeight("Senior Lot","Security Gate",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Senior Lot","Administration",((int)(Math.random() * 20) + 1));

        schoolMap.setEdgeWeight("Teachers Lot","US Classes",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Teachers Lot","Security Gate",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Teachers Lot","Girls Dorm",((int)(Math.random() * 20) + 1));

        schoolMap.setEdgeWeight("US Classes","Teachers Lot",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("US Classes","Visual Arts",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("US Classes","Administration",((int)(Math.random() * 20) + 1));

        schoolMap.setEdgeWeight("Administration","Security Gate",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Administration","US Classes",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Administration","Senior Lot",((int)(Math.random() * 20) + 1));

        schoolMap.setEdgeWeight("Rock","Security Gate",(int)((Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Rock","Dining Hall",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Rock","Entrepreneurial Center",((int)(Math.random() * 20) + 1));

        schoolMap.setEdgeWeight("Visual Arts","US Classes",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Visual Arts","Girls Dorm",((int)(Math.random() * 20) + 1));

        schoolMap.setEdgeWeight("Entrepreneurial Center","Dining Hall",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Entrepreneurial Center","Rock",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Entrepreneurial Center","Chapel",((int)(Math.random() * 20) + 1));

        schoolMap.setEdgeWeight("Girls Dorm","Teachers Lot",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Girls Dorm","Alumni",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Girls Dorm","Visual Arts",((int)(Math.random() * 20) + 1));

        schoolMap.setEdgeWeight("Alumni","Administration",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Alumni","Girls Dorm",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Alumni","Chapel",((int)(Math.random() * 20) + 1));

        schoolMap.setEdgeWeight("Chapel","Alumni",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Chapel","Entrepreneurial Center",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Chapel","Boys Dorm",((int)(Math.random() * 20) + 1));

        schoolMap.setEdgeWeight("Boys Dorm","Chapel",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Boys Dorm","Science Building",((int)(Math.random() * 20) + 1));

        schoolMap.setEdgeWeight("Science Building","Boys Dorm",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Science Building","Dining Hall",((int)(Math.random() * 20) + 1));

        schoolMap.setEdgeWeight("Dining Hall","Science Building",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Dining Hall","Entrepreneurial Center",((int)(Math.random() * 20) + 1));
        schoolMap.setEdgeWeight("Dining Hall","Rock",((int)(Math.random() * 20) + 1));

    }

    private static int traversalNode(Graph<String, DefaultWeightedEdge> schoolMap) {
        int runningCount = 0;
        String response = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Hello welcome to traversing the school map, please type a starting position you want to start at");

        String startingPoint = in.nextLine();

        System.out.println("Thank you for your starting point");

        schoolMap.edgesOf(startingPoint);

        while(!response.equals("exit") || !startingPoint.equals("exit")){


          int possiblePaths = schoolMap.outgoingEdgesOf(startingPoint).size();

            Object[] arr = schoolMap.outgoingEdgesOf(startingPoint).toArray();

            for(int i = 0; i < possiblePaths; i++) {

                System.out.println("Would you like to go to " + arr[i]);

            }

            System.out.println("Please type in which path you would like to go to or hit exit to stop");

            response = in.nextLine();


            for(int i = 0; i < possiblePaths; i++) {

                if(schoolMap.getEdge(startingPoint,response) == arr[i]) {

                    runningCount += schoolMap.getEdgeWeight(schoolMap.getEdge(startingPoint,response));

                }
            }

            startingPoint = response;
        }

        System.out.println("↓ Total path Distance");
        return runningCount;

    }
}
