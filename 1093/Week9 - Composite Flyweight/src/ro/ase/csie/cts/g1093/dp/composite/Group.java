package ro.ase.csie.cts.g1093.dp.composite;

import java.util.ArrayList;

public class Group extends AbstractNode{
	
	String name;
	ArrayList<AbstractNode> nodes = new ArrayList<>();
	

	public Group(String name) {
		super();
		this.name = name;
	}

	@Override
	public void attack(String playerName) {
		for(AbstractNode node : nodes) {
			node.attack(playerName);
		}
	}

	@Override
	public void retreat() {
		for(AbstractNode node : nodes) {
			node.retreat();;
		}
	}

	@Override
	public void move() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addNode(AbstractNode node) {
		this.nodes.add(node);
	}

	@Override
	public AbstractNode getNode(int index) {
		return this.nodes.get(index);
	}

	@Override
	public void deleteNode(AbstractNode node) {
		this.nodes.remove(node);
	}

}
