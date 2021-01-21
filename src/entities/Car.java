package entities;

public class Car {

	private String carBrand, carName, carColor;
	private short carYear, carPower;
	private double carPrice;

	public Car() {

	}

	public Car(String carBrand, String carName, String carColor, short carYear, short carPower, double carPrice) {

		this.carBrand = carBrand;
		this.carName = carName;
		this.carColor = carColor;
		this.carYear = carYear;
		this.carPower = carPower;
		this.carPrice = carPrice;
	}

	public String getCarBrand() {

		return carBrand;

	}

	public void setCarBrand(String carBrand) {

		this.carBrand = carBrand;

	}

	public String getCarName() {

		return carName;
	}

	public void setCarName(String carName) {

		this.carName = carName;
	}

	public String getCarColor() {

		return carColor;
	}

	public void setCarColor(String carColor) {

		this.carColor = carColor;
	}

	public short getCarYear() {
		return carYear;
	}

	public void setCarYear(short carYear) {

		this.carYear = carYear;

	}

	public short getCarPower() {

		return carPower;

	}

	public void setCarPower(short carPower) {

		this.carPower = carPower;

	}

	public double getCarPrice() {
		return carPrice;

	}

	public void setCarPrice(double carPrice) {

		this.carPrice = carPrice;

	}

	public String showCarInfo (int i) {
		i++;
		
		return
			"Car #"+ i + " Name: "+ carBrand + " " + carName + ".\n" +
			"Car #"+ i +" Color: "+ carColor + ".\n" +
			"Car #"+ i + " Year: "+ carYear +".\n" +
			"Car #"+ i + " Power: "+ carPower +" HP.\n" +
			"Car #" + i + String.format(" Price: $%.2f.%n", carPrice);
		}
}
