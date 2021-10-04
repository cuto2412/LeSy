package obab;

import java.util.Scanner;

public abstract class Device {
	Scanner sc = new Scanner(System.in);
	protected int id;
	protected String name;
	protected String manufacturer;
	protected String importedDate;

	public int getId() {
		return id;
	}

	public Device() {
	}

	public Device(int id, String name, String manufacturer, String importedDate) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.importedDate = importedDate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getImportedDate() {
		return importedDate;
	}

	public void setImportedDate(String importedDate) {
		this.importedDate = importedDate;
	}

	public abstract void input();

	public abstract void display();

}
