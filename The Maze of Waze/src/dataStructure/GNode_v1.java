package dataStructure;

import java.util.LinkedList;
import java.util.List;
import utils.Point3D;
import java.lang.Integer;

public class GNode_v1 implements node_data
{
	static Integer idGenerator = 0 ;
	///////////// Node Info //////////

	Integer _id;
	//int _weight;
	//int _tag;
	//Point3D _location;
	//Object _nodeData;

	//String _info;
	///////////Edge Info ////////////
	
	//LinkedList<Integer> _edgeDestNodes; 
	
	///////////Constructor//////
	public GNode_v1() 
	{
		this._id = idGenerator++;
	}



	@Override
	public int getKey() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Point3D getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLocation(Point3D p) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setWeight(double w) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInfo(String s) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getTag() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTag(int t) {
		// TODO Auto-generated method stub

	}
}