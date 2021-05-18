/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphapp;

/**
 *
 * @author Centro Informatica
 */
public class GraphApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Vertex v0 = new Vertex("v0");
        Vertex v1 = new Vertex("v1");
        
        Graph g0 = new Graph();
        
        g0.AddVertex(v0);
        g0.AddVertex(v1);
        
        g0.AddEdge(v0, v0);
        g0.AddEdge(v1, v1);
        
        g0.printMatrix();
    }
    
}
