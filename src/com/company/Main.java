package com.company;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;

public class Main {

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






























































    }
}
