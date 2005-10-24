/******************************************************************************* * Copyright (c) 2005 IBM Corporation and others. * All rights reserved. This program and the accompanying materials * are made available under the terms of the Eclipse Public License v1.0 * which accompanies this distribution, and is available at * http://www.eclipse.org/legal/epl-v10.html * * Contributors: *     IBM Corporation - initial API and implementation ******************************************************************************/package org.eclipse.jface.menus;/** * <p> * An event describing changes to <code>MenuCollection</code>. * </p> * <p> * Clients must not instantiate or extend this class. * </p> * <p> * <strong>EXPERIMENTAL</strong>. This class or interface has been added as * part of a work in progress. There is a guarantee neither that this API will * work nor that it will remain the same. Please do not use this API without * consulting with the Platform/UI team. * </p> *  * @since 3.2 */class MenuCollectionEvent extends MenuElementEvent {	/**	 * The bit used to represent whether the menu has changed its dynamic class.	 */	private static final int CHANGED_DYNAMIC = LAST_USED_BIT_MENU_ELEMENT << 1;	/**	 * The last used bit so that subclasses can add more properties.	 */	protected static final int LAST_USED_BIT_MENU_COLLECTION = CHANGED_DYNAMIC;	/**	 * Creates a new instance of <code>MenuCollectionEventcode>.	 * 	 * @param locationsChanged	 *            <code>true</code> if the locations have changed;	 *            <code>false</code> otherwise.	 * @param dynamicChanged	 *            <code>true</code> if the dynamic class has changed;	 *            <code>false</code> otherwise.	 * @param definedChanged	 *            <code>true</code>, iff the defined property changed.	 */	protected MenuCollectionEvent(final boolean locationsChanged,			final boolean dynamicChanged, final boolean definedChanged) {		super(locationsChanged, definedChanged);		if (dynamicChanged) {			changedValues |= CHANGED_DYNAMIC;		}	}	/**	 * Returns whether or not the dynamic class changed.	 * 	 * @return <code>true</code>, iff the dynamic class changed.	 */	public final boolean isDynamicChanged() {		return ((changedValues & CHANGED_DYNAMIC) != 0);	}}