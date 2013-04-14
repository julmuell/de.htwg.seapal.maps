package de.htwg.seapal.maps.models;

import java.awt.Point;

public interface IMaps {
	
	/**
	 * Indicates whether the menu of the maps menu is visible or not.
	 * @return Returns true, if the maps menu is visible.
	 */
	boolean isMenuVisible();
	
	/**
	 * Hides the maps menu
	 */
	void hideMenu();
	
	/**
	 * Shows the maps menu.
	 */
	void showMenu();
	
	/**
	 * Gets the maps position state.
	 * @return The maps position state.
	 */
	MapsMenuPositionState getMenuPositionState();
	
	/**
	 * Sets the position state of the menu.
	 * @param menuPositionState The menu position state.
	 */
	void setMenuPositionState(MapsMenuPositionState menuPositionState);
	
	/**
	 * Gets the position state of the map.
	 * @return The maps position state.
	 */
	MapsPositionState getPositionState();
	
	/**
	 * Sets the maps position state.
	 * @param positionState The maps position state.
	 */
	void setPositionState(MapsPositionState positionState);
	
	/**
	 * Gets the maps center position.
	 * @return
	 */
	Point getPosition();
	
	/**
	 * Sets the maps center position
	 * @param position The position where the maps center should be located.
	 * @throws IllegalStateException If getPositionState() is not MapsPositionState.FIXED.
	 */
	void setPosition(Point position) throws IllegalStateException;
	
	/**
	 * Gets the maps type.
	 * @return The current maps type.
	 */
	MapsType getType();
	
	/**
	 * Sets the preferred maps type.
	 * @param type The maps type.
	 */
	void setType(MapsType type);
}