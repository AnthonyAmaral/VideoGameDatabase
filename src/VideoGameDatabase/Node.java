package VideoGameDatabase;

import VideoGameDatabase.Element;  
import VideoGameDatabase.Node;


public class Node
{
	public Element Element;
	public Node next = null;
	
	//constructor for Element attribute console
	//Instantiate the node by telling which attributes are used in the element
	public Node(String console, String title, double price, String complete, String missing)
	{
		this.Element = new Element(console, title, price, complete, missing);
	
	}
	
	public Node getNext()
	{
		return this.next;
	}
	
	public void setNext(Node next)
	{
		this.next = next;
	}
	
	//getName will be the attribute to use as a node
	public String getConsole()
	{
			return this.Element.getConsole();
		
	}
	//returns information (elementPokemon)
	public String toString()
	{
	
			return this.Element.toString();
		
	}
}

