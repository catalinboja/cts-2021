package ro.ase.csie.cts.g1094.dp.composite;
import java.util.ArrayList;
import java.util.List;

public class Group extends AbstractNode{
	
	String description;
	List<AbstractNode> nodes = new ArrayList<>();
	
	public Group(String description) {
		super();
		this.description = description;
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
			node.retreat();
		}
	}

	@Override
	public void move() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addNewNode(AbstractNode node) {
		this.nodes.add(node);
	}

	@Override
	public void deleteNode(AbstractNode node) {
		this.nodes.remove(node);
	}

	@Override
	public AbstractNode getNode(int index) {
		return this.nodes.get(index);
	}
	
	
	
}
