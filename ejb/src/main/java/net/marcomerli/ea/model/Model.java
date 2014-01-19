/**
 *	Copyright (c) 2013 Marco Merli <yohji@marcomerli.net>
 *
 *	This program is free software; you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation; either version 2 of the License, or
 *	(at your option) any later version.
 *
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *
 *	You should have received a copy of the GNU General Public License
 *	along with this program; if not, write to the Free Software Foundation,
 *	Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package net.marcomerli.ea.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.log4j.Logger;

public abstract class Model implements Serializable, Comparable<Model> {

	private static final long serialVersionUID = 505175542353287599L;
	protected static Logger logger = Logger.getLogger( "model" );

	public int compareTo( Model object )
	{
		return CompareToBuilder.reflectionCompare( this, object );
	}

	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString( this );
	}

	public abstract Long getId();

	public abstract void setId( Long id );
}
