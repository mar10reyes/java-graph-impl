/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphapp;

/**
 *
 * @author Mario Reyes
 */
public class Graph 
{
    private final int MAX_VERTS = 20;
    private Vertex[] verts;
    private int[][] matAdj;
    
    public Graph()
    {
        //prepare the matrix
        initMatAdj();
    }
    
    private void initMatAdj()
    {
        //create the matrix
        matAdj = new int[MAX_VERTS][MAX_VERTS];
        
        //set all values to 0
        for (int i = 0; i < MAX_VERTS; i++) 
        {
            for (int j = 0; j < MAX_VERTS; j++)
            {
                matAdj[i][j] = 0;
            }
        }
    }
    
    public boolean AddVertex(Vertex v)
    {
        if(vertPos(v) == -1)
        {
            for(int i=0; i<MAX_VERTS; i++)
            {
                if(verts[i] == null)
                {
                    verts[i] = v;
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public void AddEdge(Vertex v0, Vertex v1)
    {
        int v0Pos = vertPos(v0);
        int v1Pos = vertPos(v1);
        
        matAdj[v0Pos][v1Pos] = 1;
        matAdj[v1Pos][v0Pos] = 1;
    }
    
    private int vertPos(Vertex v)
    {
        for(int i=0; i<MAX_VERTS; i++)
        {
            if(verts[i] != null)
            {
                if(verts[i] == v)
                {
                    return i;
                }
            }
        }
        
        //return -1 if the vertex was not found
        return -1;
    }
    
    public void printMatrix()
    {
        for (int i = 0; i < MAX_VERTS; i++) 
        {
            for (int j = 0; j < MAX_VERTS; j++)
            {
                System.out.println(matAdj[i][j]);
            }
            System.out.println("\n");
        }
    }
}
