/*******************************************************************************
 * Copyright (c) 2007, 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.ui.internal.views.markers;

import org.eclipse.ui.views.markers.MarkerField;
import org.eclipse.ui.views.markers.MarkerItem;


/**
 * MarkerTypeField is the field that defines the marker type.
 *
 * @since 3.3
 *
 */
public class MarkerTypeField extends MarkerField {

	@Override
	public String getValue(MarkerItem item) {
		return ((MarkerSupportItem) item).getMarkerTypeName();
	}

}
