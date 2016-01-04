package VideoGameDatabase;

import java.text.*;
import VideoGameDatabase.Element;


public class LinkedList 
{
		private Element[] collection;
		private int count;
		private double totalPrice, averagePrice;
		DecimalFormat df = new DecimalFormat("#.##");
		
		//-----------------------------------------------------------------
		//Constructor: Creates an initially empty collection.
		//-----------------------------------------------------------------
		public LinkedList ()
		{
			collection = new Element[10];
			count = 0;
			totalPrice = 0.0;
			averagePrice = 0.0;

		}
				//counter for total amount of games in collection
				public void add(Object object)
				{
					if (count == collection.length)
						increaseSize();
						collection[count] = (Element) object;

						count++;
				}
				
				//tally's the total price of the collection and the average price of each game in the collection
				public void total(Double price)
				{
					totalPrice = totalPrice + price;
					averagePrice = totalPrice / count;
					
				}
				
				

				
				private void increaseSize ()
				{
				Element[] temp = new Element[collection.length * 2];

				for (int index = 0; index < collection.length; index++)
					temp[index] = collection[index];
						collection = temp;
				
				}
				
				
				
		//-----------------------------------------------------------------
		//The toString method returns a report describing the Pokemon collection.
		//-----------------------------------------------------------------
		public String toString()
			{
		
			
		String report = "\nMy Video Game Collection:\n\nNumber of Games: " + count 
						+ "\n\nTotal Price of Collection: $" + df.format(totalPrice) 
						+ "\n\nAverage Price of Collection: $" + df.format(averagePrice) 
						+ "\n\nGames List:\n\n";
		
		report += "Title\t\tConsole\t\tPrice\t\tComplete\tItems Missing\n\n";

		

			for (int Game = 0; Game < count; Game++)
				report += collection[Game].toString() + "\n";
				return report;
			}

}
