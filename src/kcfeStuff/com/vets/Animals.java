package kcfeStuff.com.vets;
// David O'Connor    13/12/2015
public abstract class Animals {
	
	private String name;
	private boolean isAlive;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
}
