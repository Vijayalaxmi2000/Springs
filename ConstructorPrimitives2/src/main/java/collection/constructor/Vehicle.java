package collection.constructor;

public class Vehicle 
{
	private int vehicleNo;
	private String vehicleName;
	
	public Vehicle(int vehicleNo, String vehicleName)
	{
		super();
		this.vehicleNo = vehicleNo;
		this.vehicleName = vehicleName;
	}
	public int getVehicleNo() 
	{
		return vehicleNo;
	}
	public void setVehicleNo(int vehicleNo) 
	{
		this.vehicleNo = vehicleNo;
	}
	public String getVehicleName()
	{
		return vehicleName;
	}
	public void setVehicleName(String vehicleName)
	{
		this.vehicleName = vehicleName;
	}
	@Override
	public String toString()
	{
		return "Vehicle [VehicleNo=" + vehicleNo + ", VehicleName=" + vehicleName + "]";
	}
	
	
	

}
