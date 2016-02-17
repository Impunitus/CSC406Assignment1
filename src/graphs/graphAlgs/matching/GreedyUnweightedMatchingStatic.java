package graphs.graphAlgs.matching;

import net.datastructures.*;
import graphs.graphAlgs.VertexDegreeComparator;

import java.awt.geom.Point2D;
import java.util.PriorityQueue;
import java.util.Iterator;

import javax.swing.*;

import java.awt.*;

public class GreedyUnweightedMatchingStatic extends MatchingAlgorithm
{

    public void runAlgorithm( AdjacencyListGraph<Point2D.Double, Double>  g )
    {
      // Complete the code for the Greedy Algorithm for creating a Matching in a Graph

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
