package se.kth.iv1350.pointofsale.integration;

import se.kth.iv1350.pointofsale.model.ItemIdentifier;
/*******************************************************
 * Thrown if the ItemIdentifier isn't compatible when
 * trying to perform operation in <code>ItemIdentifier</code>
 * The error message contains more information regarding the
 * issue at hand.
 *******************************************************/
public class NonExistingItemException extends Exception {

	private ItemIdentifier itemIdentifierThatDoesntExist;

	/*
	 * Constructor for NonExistingItemException. Used to throw
	 * exception when items are not in the database. 
	 * 
	 */
	public NonExistingItemException(ItemIdentifier itemIdentifierThatDoesntExist) {
		
		super("Cannot find item with itemID: " + itemIdentifierThatDoesntExist.getItemId() + 
				". Please try another itemID.");
		this.itemIdentifierThatDoesntExist = itemIdentifierThatDoesntExist; 
	}

	/*
	 * Getter for the value of the ItemIdentifier.
	 */
	public int getItemIdentifierThatDoesntExist() {
		return itemIdentifierThatDoesntExist.getItemId();
	}
}


