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
@Table( name = "SEASON" )
public class Season extends Model {

	private static final long serialVersionUID = 9082227383427546711L;

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private Short year;

	@NotNull
	private Short rounds;

	public Long getId()
	{
		return id;
	}

	public void setId( Long id )
	{
		this.id = id;
	}

	public Short getYear()
	{
		return year;
	}

	public void setYear( Short year )
	{
		this.year = year;
	}

	public Short getRounds()
	{
		return rounds;
	}

	public void setRounds( Short rounds )
	{
		this.rounds = rounds;
	}
}
