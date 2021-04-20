package ro.ase.csie.cts.g1094.dp.composite;

public class TestComposite {
	
	public static void main(String[] args) {
		
		AbstractNode group1 = new Group("Red team");
		group1.addNewNode(new NPC("Soldier 1", 100));
		group1.addNewNode(new NPC("Soldier 2", 100));
		
		AbstractNode group2 = new Group("Blue team");
		group2.addNewNode(new NPC("Soldier 3", 100));
		group2.addNewNode(new NPC("Tank", 500));
		
		AbstractNode levelGroup = new Group("Level 2");
		levelGroup.addNewNode(new NPC("Level Boss", 1000));
		levelGroup.addNewNode(group1);
		levelGroup.addNewNode(group2);
		
		levelGroup.attack("Superman");
		levelGroup.retreat();
		levelGroup.getNode(0).move();
		
		
	}
	
	
	
}
