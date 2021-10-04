package obab;

public class Computer extends Device{
	private String cpu,ram;
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public Computer(int id, String name, String manufacturer, String importedDate) {
		super(id, name, manufacturer, importedDate);
		// TODO Auto-generated constructor stub
	}

	public Computer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.print("Id: ");
		this.id = sc.nextInt();
		this.name="Computer";
		System.out.print("Manufacturer: ");
		this.manufacturer = sc.nextLine();
		this.manufacturer = sc.nextLine();
		System.out.print("ImportedDate: ");
		this.importedDate = sc.nextLine();
		System.out.print("Cpu: ");
		cpu=sc.nextLine();
		System.out.print("Ram: ");
		ram=sc.nextLine();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Computer [cpu=" + cpu + ", ram=" + ram + ", id=" + id + ", name=" + name
				+ ", manufacturer=" + manufacturer + ", importedDate=" + importedDate + "]");
	}


}
