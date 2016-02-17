package graphs.graphAlgs.matching;

import net.datastructures.*;
import graphs.graphAlgs.EdgeComparator;
import graphs.graphAlgs.VertexDegreeComparator;

import java.awt.geom.Point2D;
import java.util.PriorityQueue;
import java.util.Iterator;

import javax.swing.*;

import java.awt.*;

public class GreedyUnweightedMatchingStatic extends MatchingAlgorithm
{
    // decoration that indicates whether or not a Vertex has been added to the MST
    public static final Object VERTEX_STATUS = new Object();
    // decoration that indicates whether or not an Edge has been added to the MST
    public static final Object EDGE_STATUS = new Object();
    
	// Values for STATUS decorations
    public static final Object MATCHED = new Object();
    public static final Object FREE = new Object();

    public void runAlgorithm( AdjacencyListGraph<Point2D.Double, Double>  g )
    {
      // Complete the code for the Greedy Algorithm for creating a Matching in a Graph

        // This heap will contain all the edges in the graph
        // We will examine the edges from the least-costly to the most-costly
        PriorityQueue<Edge<Double>> heap = new PriorityQueue<Edge<Double>>(11, new EdgeComparator());

        // decorate all vertices as NOT USED  
        for ( Vertex v : g.vertices() ) {
            v.put ( VERTEX_STATUS, FREE );          
        }

        /* unsure if needed in this
        // initialize all the edges of the graph as being NOT USED
        for ( Edge e : g.edges() )
            e.put ( EDGE_STATUS, NOT_USED ); 
        */
        
        // If graph is empty, return immediately 
        if ( g.numVertices() == 0 )  
        	return;
    }

    public void draw ( Graphics screen, AdjacencyListGraph<Point2D.Double,Double> testGraph, int minDimension )
    {
        drawNodes ( screen, testGraph, minDimension );
        drawEdges ( screen, testGraph, minDimension );
    }   

    public void drawNodes ( Graphics screen, AdjacencyListGraph<Point2D.Double,Double> graph, int minDimension )
    {     
        super.drawNodes(  screen, graph, minDimension );

        // label each vertex in the graph with its degree on the output screen
        for ( Vertex u : graph.vertices() )
        {
            Point2D p = (Point2D) u.element(); 

            double xPos = p.getX()  *  minDimension;
            double yPos = p.getY()  *  minDimension;

//                         screen.drawString( (u.get(DEGREE)) + "", 
//                                 (int)(xPos + 1.5*DOTRADIUS ), 
//                                 (int)(yPos + 1.5*DOTRADIUS ) );  
        }
    }	
}
