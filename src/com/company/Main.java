package com.company;

import com.mxgraph.view.mxGraph;
import org.jgrapht.Graph;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import javax.swing.JFrame;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.*;


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

        schoolMap.addEdge("Security Gate", "Rock");
        schoolMap.addEdge("Security Gate", "Senior Lot");
        schoolMap.addEdge("Security Gate", "Administration");
        schoolMap.addEdge("Security Gate", "Teachers Lot");

        schoolMap.addEdge("Senior Lot", "Security Gate");
        schoolMap.addEdge("Senior Lot", "Administration");

        schoolMap.addEdge("Teachers Lot", "US Classes");
        schoolMap.addEdge("Teachers Lot", "Girls Dorm");
        schoolMap.addEdge("Teachers Lot", "Security Gate");

        schoolMap.addEdge("US Classes", "Teachers Lot");
        schoolMap.addEdge("US Classes", "Visual Arts");
        schoolMap.addEdge("US Classes", "Administration");

        schoolMap.addEdge("Administration", "US Classes");
        schoolMap.addEdge("Administration", "Security Gate");
        schoolMap.addEdge("Administration", "Alumni");
        schoolMap.addEdge("Administration", "Senior Lot");

        schoolMap.addEdge("Rock", "Security Gate");
        schoolMap.addEdge("Rock", "Dining Hall");
        schoolMap.addEdge("Rock", "Entrepreneurial Center");

        schoolMap.addEdge("Visual Arts", "US Classes");
        schoolMap.addEdge("Visual Arts", "Girls Dorm");

        schoolMap.addEdge("Entrepreneurial Center", "Dining Hall");
        schoolMap.addEdge("Entrepreneurial Center", "Rock");
        schoolMap.addEdge("Entrepreneurial Center", "Chapel");

        schoolMap.addEdge("Girls Dorm", "Teachers Lot");
        schoolMap.addEdge("Girls Dorm", "Alumni");
        schoolMap.addEdge("Girls Dorm", "Visual Arts");

        schoolMap.addEdge("Alumni", "Administration");
        schoolMap.addEdge("Alumni", "Girls Dorm");
        schoolMap.addEdge("Alumni", "Chapel");

        schoolMap.addEdge("Chapel", "Alumni");
        schoolMap.addEdge("Chapel", "Entrepreneurial Center");
        schoolMap.addEdge("Chapel", "Boys Dorm");

        schoolMap.addEdge("Boys Dorm", "Chapel");
        schoolMap.addEdge("Boys Dorm", "Science Building");

        schoolMap.addEdge("Science Building", "Boys Dorm");
        schoolMap.addEdge("Science Building", "Dining Hall");

        schoolMap.addEdge("Dining Hall", "Science Building");
        schoolMap.addEdge("Dining Hall", "Entrepreneurial Center");
        schoolMap.addEdge("Dining Hall", "Rock");


        //setting each path's value/distance

        schoolMap.setEdgeWeight("Security Gate", "Rock", 1);
        schoolMap.setEdgeWeight("Security Gate", "Senior Lot", 1);
        schoolMap.setEdgeWeight("Security Gate", "Administration", 1);
        schoolMap.setEdgeWeight("Security Gate", "Teachers Lot", 3);

        schoolMap.setEdgeWeight("Senior Lot", "Security Gate", 1);
        schoolMap.setEdgeWeight("Senior Lot", "Administration", 2);

        schoolMap.setEdgeWeight("Teachers Lot", "US Classes", 1);
        schoolMap.setEdgeWeight("Teachers Lot", "Security Gate", 3);
        schoolMap.setEdgeWeight("Teachers Lot", "Girls Dorm", 2);

        schoolMap.setEdgeWeight("US Classes", "Teachers Lot", 1);
        schoolMap.setEdgeWeight("US Classes", "Visual Arts", 1);
        schoolMap.setEdgeWeight("US Classes", "Administration", 1);

        schoolMap.setEdgeWeight("Administration", "Security Gate", 1);
        schoolMap.setEdgeWeight("Administration", "US Classes", 1);
        schoolMap.setEdgeWeight("Administration", "Senior Lot", 2);

        schoolMap.setEdgeWeight("Rock", "Security Gate", 1);
        schoolMap.setEdgeWeight("Rock", "Dining Hall", 2);
        schoolMap.setEdgeWeight("Rock", "Entrepreneurial Center", 2);

        schoolMap.setEdgeWeight("Visual Arts", "US Classes", 1);
        schoolMap.setEdgeWeight("Visual Arts", "Girls Dorm", 1);

        schoolMap.setEdgeWeight("Entrepreneurial Center", "Dining Hall", 2);
        schoolMap.setEdgeWeight("Entrepreneurial Center", "Rock", 2);
        schoolMap.setEdgeWeight("Entrepreneurial Center", "Chapel", 5);

        schoolMap.setEdgeWeight("Girls Dorm", "Teachers Lot", 2);
        schoolMap.setEdgeWeight("Girls Dorm", "Alumni", 3);
        schoolMap.setEdgeWeight("Girls Dorm", "Visual Arts", 1);

        schoolMap.setEdgeWeight("Alumni", "Administration", 4);
        schoolMap.setEdgeWeight("Alumni", "Girls Dorm", 3);
        schoolMap.setEdgeWeight("Alumni", "Chapel", 2);

        schoolMap.setEdgeWeight("Chapel", "Alumni", 2);
        schoolMap.setEdgeWeight("Chapel", "Entrepreneurial Center", 5);
        schoolMap.setEdgeWeight("Chapel", "Boys Dorm", 1);

        schoolMap.setEdgeWeight("Boys Dorm", "Chapel", 1);
        schoolMap.setEdgeWeight("Boys Dorm", "Science Building", 1);

        schoolMap.setEdgeWeight("Science Building", "Boys Dorm", 1);
        schoolMap.setEdgeWeight("Science Building", "Dining Hall", 1);

        schoolMap.setEdgeWeight("Dining Hall", "Science Building", 1);
        schoolMap.setEdgeWeight("Dining Hall", "Entrepreneurial Center", 2);
        schoolMap.setEdgeWeight("Dining Hall", "Rock", 3);


        // randomDistances(schoolMap);
        // System.out.println(schoolMap.getEdgeWeight(schoolMap.getEdge("Dining Hall","Science Building")));

        //  System.out.println(schoolMap.edgesOf("Visual Arts"));
        System.out.println(schoolMap.outgoingEdgesOf("Visual Arts"));


        //very important info
        //Object[] arr = schoolMap.vertexSet().toArray();
        //System.out.println(arr[0]);
        // System.out.println(schoolMap.vertexSet());
        //  schoolMap.getEdgeWeight(schoolMap.)
     /* PriorityQueue queue = new PriorityQueue();
         queue.add("Visual arts",5);
        queue.add("Science Building",8);
        queue.add("Chapel",2);
        queue.add("Boys dorm",1);
        queue.display();

      */


        //  System.out.println(traversalNode(schoolMap));


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
        Dijkstra dijkstra = new Dijkstra(schoolMap);
        System.out.println(dijkstra.shortestPathingAlgorithm("Chapel", "Rock"));


    }


    static class Dijkstra {

        Graph<String, DefaultWeightedEdge> schoolmap2;


        public Dijkstra(Graph<String, DefaultWeightedEdge> map) {

            this.schoolmap2 = map;

        }

        public int shortestPathingAlgorithm(String startpoint, String ep) {
/*
            String startingPoint = startpoint;
            String endpoint = ep;
            String stringName = "";
            Object[] vertexArr = schoolmap2.vertexSet().toArray();
            PriorityQueue pQueue = new PriorityQueue(vertexArr.length, vertexArr);

            //  PriorityQueue pQueue = new PriorityQueue(schoolmap2.vertexSet().toArray().length);
            Object[] namesArr = schoolmap2.vertexSet().toArray();


            pQueue.add(startingPoint, 0);


            while (!pQueue.isEmpty()) {
                String tempname = pQueue.getFirst().getName();
                System.out.println("Pqueue");
                pQueue.display();
                Object[] arr = schoolmap2.outgoingEdgesOf(tempname).toArray();
                System.out.println(arr[0]);
                Object[] vertxarr = schoolmap2.vertexSet().toArray();
                int length = schoolmap2.outgoingEdgesOf(tempname).toArray().length;
                int index = 0;
                int tempsize = 0;
                PriorityQueue.Node tempNode = null;


                PriorityQueue pQueue2 = new PriorityQueue(vertexArr.length, vertexArr);
                int minDistance = Integer.MAX_VALUE;
                for (int i = 0; i < length; i++) {

                    for (int j = 0; j <vertexArr.length; j++) {

                        if (vertexArr[j].equals(arr[i])) {
                            tempsize = pQueue2.getFirst().distance;
                            System.out.println("Vertx I" + vertexArr[i]);
                            tempNode = pQueue2.getFirst();
                        } else {
                            //pQueue2.remove();
                        }
                    }
                    System.out.println("On point" + arr[i]);

                    for (int x = 0; x < schoolmap2.vertexSet().size(); x++) {


                        if (schoolmap2.getEdge(tempname, vertexArr[x].toString()) == arr[i]) {
                                System.out.println(arr[i] + " EEEE");
                            stringName = vertexArr[x].toString();
                            System.out.println(schoolmap2.getEdge(tempname, vertexArr[x].toString()));
                            System.out.println("E");
                            //System.out.println(arr[i]);

                        }
                    }



                        if (((int) (schoolmap2.getEdgeWeight(schoolmap2.getEdge(tempname, stringName)) + pQueue.getFirst().distance)) < tempsize) {

                            pQueue.getFirst().distance = (int) schoolmap2.getEdgeWeight(schoolmap2.getEdge(tempname, stringName));
                            pQueue.getFirst().previous = new PriorityQueue.Node(pQueue.getFirst().name, pQueue.getFirst().distance);
                            int tempdist = pQueue.getFirst().distance;
                            System.out.println("removing" + pQueue.getFirst().getName());
                            pQueue.remove();

                            for (int k = 0; k < pQueue.size; k++) {
                                System.out.println(arr[i]);
                                if (vertexArr[i].equals(pQueue.getFirst())) {
                                    pQueue.remove();
                                }
                            }
                            pQueue.add(vertexArr[i].toString(), tempdist);
                            System.out.println(vertexArr[i].toString() + "ASDASDASD");
                            pQueue.display();

                        }



                    }
                pQueue.remove();
                }
            return 0;

 */

            SimpleWeightedGraph<String, DefaultWeightedEdge> saMap = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);

            System.out.println(schoolmap2.vertexSet() + " erasads");

           Object[] arr = schoolmap2.vertexSet().toArray();


            String startingPoint = startpoint;
            String endpoint = ep;
            String stringName = "";
            Object[] vertexArr = schoolmap2.vertexSet().toArray();


            PriorityQueue pQueue = new PriorityQueue(vertexArr.length, vertexArr);



            //  PriorityQueue pQueue = new PriorityQueue(schoolmap2.vertexSet().toArray().length);

            PriorityQueue nodesQueue = new PriorityQueue(schoolmap2.vertexSet().toArray().length,vertexArr);
            PriorityQueue pq = new PriorityQueue(schoolmap2.vertexSet().toArray().length,vertexArr);
            Object[] namesArr = schoolmap2.vertexSet().toArray();


            for(int i = 0; i < namesArr.length; i++) {

                if(namesArr[i].toString().equals(startingPoint)) {
                    nodesQueue.add(namesArr[i].toString(),0);
                }
                else {
                    nodesQueue.add(namesArr[i].toString(), Integer.MAX_VALUE);
                }

            }

            pq.add(nodesQueue.getFirst().name,nodesQueue.getFirst().distance);


          System.out.println(nodesQueue.getFirst().name);


            while(pq.getSize() != 0) {
                //getting outgoing nodes

               // PriorityQueue tempArr = new PriorityQueue(schoolmap2.vertexSet().toArray().length,vertexArr);


                int length = schoolmap2.outgoingEdgesOf(pq.getFirst().getName()).size();

                System.out.println("GETTING OUTGOING EDGES OF " + schoolmap2.outgoingEdgesOf(pq.getFirst().getName()));

                Object[] blah = schoolmap2.outgoingEdgesOf(pq.getFirst().getName()).toArray();
                System.out.println(blah[0].toString());




                for (int i = 0; i < length; i++) {
                    String edgeName = "";
            System.out.println("on i + " + i);

                    for(int j = 0; j < schoolmap2.vertexSet().size(); j++) {

                       // System.out.println("blahh" + blah[i]);
                      //  System.out.println("namesarr" + namesArr[j]);
                        if (blah[i] == schoolmap2.getEdge(pq.getFirst().getName(), namesArr[j].toString())) {
                            edgeName = namesArr[j].toString();
                            System.out.println("YAAAAAAAAAAAAAAAA");

                        }
                    }
                    System.out.println("Edgename" + edgeName);
                            if(replaceThisNode(edgeName,pq,namesArr) != null) {
                                System.out.println("FOUND THAT");
// needsReplacementBoolean(pq,vertexArr,edgeName
                                //replaceThisNode(edgeName,pq,namesArr) != null
                                // pq.getFirst().distance + (int) schoolmap2.getEdgeWeight(schoolmap2.getEdge(pq.getFirst().getName(),edgeName)) < replaceThisNode(edgeName,pq).getDistance()
                                for(int l = 0; l < pq.size; l++) {

                                    if(pq.getFirst().name.equals(edgeName)) {

                                        pq.add(edgeName,pq.getFirst().getDistance() + (int) schoolmap2.getEdgeWeight(schoolmap2.getEdge(pq.getFirst().getName(),edgeName)) );
                                        pq.remove();
                                    }
                                    else {

                                        pq.add(pq.getFirst().getName(),pq.getFirst().getDistance());
                                        pq.remove();
                                    }

                                }

                            }

                            else {
                                String tempname = pq.getFirst().getName();

                                if(pq.getFirst().getName().equals(startingPoint)) {

                                    pq.getFirst().setPrevious(null);
                                    pq.add(edgeName,pq.getFirst().getDistance() + (int)schoolmap2.getEdgeWeight(schoolmap2.getEdge(pq.getFirst().getName(),edgeName)));

                                }
                                else {

                                    for (int i1 = 0; i1 < nodesQueue.size; i1++) {
                                        if (tempname.equals(nodesQueue.getFirst().getName())) {

                                        }
                                        String tempName = nodesQueue.getFirst().getName();
                                        int tempval = nodesQueue.getFirst().getDistance();
                                        nodesQueue.remove();
                                        nodesQueue.add(tempName,tempval);
                                    }

                                    pq.add(edgeName,(int)schoolmap2.getEdgeWeight(schoolmap2.getEdge(pq.getFirst().getName(),tempname)));
                                    pq.getFirst().setPrevious(pq.getFirst());
                                }

                            // pq.add(edgeName,(int)schoolmap2.getEdgeWeight(schoolmap2.getEdge(pq.getFirst().getName(),edgeName)));
                            }
                           pq.display();
                        }
                System.out.println("Removing... " + pq.getFirst().getName());
                pq.remove();
                    }

















return 0;

        }


        public void findAndReplace(String name,PriorityQueue queue,Object[] arr) {

            PriorityQueue pq = new PriorityQueue(schoolmap2.vertexSet().toArray().length,arr);

            for(int i = 0; i < pq.size; i++) {

                pq.add(queue.getFirst().getName(),queue.getFirst().getDistance());
            }

            while(pq.getFirst().getName() != name) {

                pq.remove();

            }

        }

        public boolean needsReplacementBoolean(PriorityQueue queue,Object[] arr,String replacementName) {

            PriorityQueue pq = new PriorityQueue(schoolmap2.vertexSet().toArray().length,arr);
            for(int i = 0; i < pq.size; i++) {

                pq.add(queue.getFirst().getName(),queue.getFirst().getDistance());
            }

            for(int i = 0; i < pq.size; i++) {
                if(pq.getFirst().name == replacementName) {
                    return true;
                }
                else {
                    pq.remove();
                }
            }
            return false;

        }


        public PriorityQueue.Node replaceThisNode(String name,PriorityQueue queue,Object[] arr) {


            PriorityQueue tempQueue = new PriorityQueue(queue.size,arr);

            System.out.println(queue.size);
            for(int i = 0; i < queue.size; i++) {

                if(queue.getFirst().name.equals(name)) {

                    return queue.getFirst();
                }

                else {

                    String tempName = queue.getFirst().getName();
                    int tempVal = queue.getFirst().getDistance();
                    System.out.println("removed" + queue.getFirst().getName());
                    queue.remove();
                    tempQueue.add(tempName,tempVal);

                }

            }

         System.out.println("Plz work-----");
            tempQueue.display();

            System.out.println("---------" + tempQueue.size);
            for(int i = 0; i < tempQueue.size; i++) {
                System.out.println("hello " + tempQueue.getFirst().getName());
                queue.add(tempQueue.getFirst().getName(),tempQueue.getFirst().getDistance());
                tempQueue.remove();
            }
System.out.println("queue--------");
            queue.display();
            System.out.println("----------");

            return null;


/*
            for(int i = 0; i < queue.size; i++) {

                if (queue.getFirst().getName().equals(name)) {

                    return queue.getFirst();
                }
                else {

                    String tempName = queue.getFirst().getName();
                    int tempVal = queue.getFirst().getDistance();
                    System.out.println("Removing sdasd " + queue.getFirst().getName());
                    queue.remove();
                    System.out.println("asdasdasdas" + queue.getFirst().getName());
                    tempQueue.add(tempName, tempVal);
                }
            }





            return null;

 */


        }










            private static void randomDistances (Graph <String, DefaultWeightedEdge > schoolMap){

                schoolMap.setEdgeWeight("Security Gate", "Rock", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Security Gate", "Senior Lot", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Security Gate", "Administration", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Security Gate", "Teachers Lot", ((int) (Math.random() * 20) + 1));

                schoolMap.setEdgeWeight("Senior Lot", "Security Gate", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Senior Lot", "Administration", ((int) (Math.random() * 20) + 1));

                schoolMap.setEdgeWeight("Teachers Lot", "US Classes", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Teachers Lot", "Security Gate", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Teachers Lot", "Girls Dorm", ((int) (Math.random() * 20) + 1));

                schoolMap.setEdgeWeight("US Classes", "Teachers Lot", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("US Classes", "Visual Arts", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("US Classes", "Administration", ((int) (Math.random() * 20) + 1));

                schoolMap.setEdgeWeight("Administration", "Security Gate", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Administration", "US Classes", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Administration", "Senior Lot", ((int) (Math.random() * 20) + 1));

                schoolMap.setEdgeWeight("Rock", "Security Gate", (int) ((Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Rock", "Dining Hall", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Rock", "Entrepreneurial Center", ((int) (Math.random() * 20) + 1));

                schoolMap.setEdgeWeight("Visual Arts", "US Classes", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Visual Arts", "Girls Dorm", ((int) (Math.random() * 20) + 1));

                schoolMap.setEdgeWeight("Entrepreneurial Center", "Dining Hall", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Entrepreneurial Center", "Rock", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Entrepreneurial Center", "Chapel", ((int) (Math.random() * 20) + 1));

                schoolMap.setEdgeWeight("Girls Dorm", "Teachers Lot", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Girls Dorm", "Alumni", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Girls Dorm", "Visual Arts", ((int) (Math.random() * 20) + 1));

                schoolMap.setEdgeWeight("Alumni", "Administration", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Alumni", "Girls Dorm", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Alumni", "Chapel", ((int) (Math.random() * 20) + 1));

                schoolMap.setEdgeWeight("Chapel", "Alumni", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Chapel", "Entrepreneurial Center", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Chapel", "Boys Dorm", ((int) (Math.random() * 20) + 1));

                schoolMap.setEdgeWeight("Boys Dorm", "Chapel", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Boys Dorm", "Science Building", ((int) (Math.random() * 20) + 1));

                schoolMap.setEdgeWeight("Science Building", "Boys Dorm", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Science Building", "Dining Hall", ((int) (Math.random() * 20) + 1));

                schoolMap.setEdgeWeight("Dining Hall", "Science Building", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Dining Hall", "Entrepreneurial Center", ((int) (Math.random() * 20) + 1));
                schoolMap.setEdgeWeight("Dining Hall", "Rock", ((int) (Math.random() * 20) + 1));


            }


            private static int traversalNode (Graph < String, DefaultWeightedEdge > schoolMap){
                int runningCount = 0;
                String response = "";
                Scanner in = new Scanner(System.in);

                System.out.println("Hello welcome to traversing the school map, please type a starting position you want to start at");

                String startingPoint = in.nextLine();

                System.out.println("Thank you for your starting point");

                schoolMap.edgesOf(startingPoint);

                while (!response.equals("exit") || !startingPoint.equals("exit")) {


                    int possiblePaths = schoolMap.outgoingEdgesOf(startingPoint).size();

                    Object[] arr = schoolMap.outgoingEdgesOf(startingPoint).toArray();

                    for (int i = 0; i < possiblePaths; i++) {

                        System.out.println("Would you like to go to " + arr[i]);

                    }

                    System.out.println("Please type in which path you would like to go to or hit exit to stop");

                    response = in.nextLine();


                    for (int i = 0; i < possiblePaths; i++) {

                        if (schoolMap.getEdge(startingPoint, response) == arr[i]) {

                            runningCount += schoolMap.getEdgeWeight(schoolMap.getEdge(startingPoint, response));

                        }
                    }

                    startingPoint = response;
                }

                System.out.println("↓ Total path Distance");
                return runningCount;

            }
        }
    }

