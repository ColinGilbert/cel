/*
 * Copyright 2009 Julian Mendez
 *
 *
 * This file is part of CEL Plug-in.
 *
 * CEL Plug-in is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * CEL Plug-in is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with CEL Plug-in.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package de.tudresden.inf.lat.cel.translation;

import org.semanticweb.owl.inference.OWLReasonerException;

/**
 * This exception should be thrown when there is a problem trying to use the CEL
 * reasoner.
 * 
 * @author Julian Mendez
 */
public class CelReasonerException extends OWLReasonerException {

	private static final long serialVersionUID = 842029672013546393L;

	public CelReasonerException(String message) {
		super(message);
	}

	public CelReasonerException(String message, Throwable cause) {
		super(message, cause);
	}

	public CelReasonerException(Throwable cause) {
		super(cause);
	}
}