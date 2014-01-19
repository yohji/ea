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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table( name = "PARTICIPATION" )
public class Participation extends Model {

	private static final long serialVersionUID = 582551084197723940L;

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private Short number;

	@OneToOne
	private Pilot pilot;

	@OneToOne
	private Car car;

	@OneToOne
	private Team team;

	@OneToOne
	private Season season;

	public Long getId()
	{
		return id;
	}

	public void setId( Long id )
	{
		this.id = id;
	}

	public Short getNumber()
	{
		return number;
	}

	public void setNumber( Short number )
	{
		this.number = number;
	}

	public Pilot getPilot()
	{
		return pilot;
	}

	public void setPilot( Pilot pilot )
	{
		this.pilot = pilot;
	}

	public Car getCar()
	{
		return car;
	}

	public void setCar( Car car )
	{
		this.car = car;
	}

	public Team getTeam()
	{
		return team;
	}

	public void setTeam( Team team )
	{
		this.team = team;
	}

	public Season getSeason()
	{
		return season;
	}

	public void setSeason( Season season )
	{
		this.season = season;
	}
}
