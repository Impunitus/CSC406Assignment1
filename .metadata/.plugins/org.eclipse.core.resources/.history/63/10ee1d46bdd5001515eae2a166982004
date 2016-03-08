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
    public static final Object VERTEX_DEGREE = new Object();
    public static final Object VERTEX_NAME = new Object();

	// Values for STATUS decorations
    public static final Object MATCHED = new Object();
    public static final Object FREE = new Object();

    public void runAlgorithm( AdjacencyListGraph<Point2D.Double, Double>  g )
    {
      // Complete the code for the Greedy Algorithm for creating a Matching in a Graph

        // This heap will contain all the edges in the graph
        // We will examine the edges from the least-costly to the most-costly
        PriorityQueue<Vertex<Double>> heap = new PriorityQueue<Vertex<Double>>(230, new VertexDegreeComparator());

        // decorate all vertices as FREE
        for ( Vertex v : g.vertices() ) {
            v.put ( VERTEX_STATUS, FREE );
        }

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
