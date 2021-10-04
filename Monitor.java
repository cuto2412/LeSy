package obab;


public class Monitor extends Device {
	

	public Monitor(int id, String name, String manufacturer, String importedDate) {
		super(id, name, manufacturer, importedDate);
		// TODO Auto-generated constructor stub

	}

	public Monitor() {
		// TODO Auto-generated constructor stub
	}

	private String size;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.print("Id: ");
		this.id =Integer.parseInt(sc.nextLine());
		this.name="Monitor";
		System.out.print("Manufacturer: ");
//		input.nextline();
		this.manufacturer = sc.nextLine();
		System.out.print("ImportedDate: ");
		this.importedDate = sc.nextLine();
		System.out.print("Size: ");
		this.size = sc.nextLine();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Monitor [size=" + size + ", id=" + id + ", name=" + name + ", manufacturer=" + manufacturer
				+ ", importedDate=" + importedDate + "]");
	}

}
