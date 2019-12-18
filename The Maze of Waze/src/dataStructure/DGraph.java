package dataStructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class DGraph implements graph
{
	HashMap<Integer ,GNode_v1 > Verticies;
	HashMap<Integer , GNode_v1> Edges;

	@Override
	public node_data getNode(int key) 
	{
		node_data node = Verticies.get(key);
		return node;
	}

	@Override
	public edge_data getEdge(int src, int dest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNode(node_data n) 
	{
		Verticies.put(n.getKey(), (GNode_v1) n);
	}

	@Override
	public void connect(int src, int dest, double w) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<node_data> getV() 
	{
		Collection<node_data> values = (Collection<node_data>) Verticies.values();
		return values;
	}

	@Override
	public Collection<edge_data> getE(int node_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public node_data removeNode(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public edge_data removeEdge(int src, int dest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int nodeSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int edgeSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMC() {
		// TODO Auto-generated method stub
		return 0;
	}

}
