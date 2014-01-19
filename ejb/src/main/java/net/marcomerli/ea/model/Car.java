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

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table( name = "CAR" )
public class Car extends Model {

	private static final long serialVersionUID = 2685548658805632015L;

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private String constructor;

	@NotNull
	private String engine;

	@NotNull
	private String chassis;

	public Long getId()
	{
		return id;
	}

	public void setId( Long id )
	{
		this.id = id;
	}

	public String getConstructor()
	{
		return constructor;
	}

	public void setConstructor( String constructor )
	{
		this.constructor = constructor;
	}

	public String getEngine()
	{
		return engine;
	}

	public void setEngine( String engine )
	{
		this.engine = engine;
	}

	public String getChassis()
	{
		return chassis;
	}

	public void setChassis( String chassis )
	{
		this.chassis = chassis;
	}

}
