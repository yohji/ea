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

package net.marcomerli.ea.rest;

import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.marcomerli.ea.model.Participation;
import net.marcomerli.ea.service.ParticipationService;

@Path( "/participations" )
@RequestScoped
public class ParticipationRESTService {

	@Inject
	private Logger log;

	@Inject
	private ParticipationService participationService;

	@GET
	@Produces( MediaType.APPLICATION_JSON )
	public List<Participation> listAllParticipations() throws Exception
	{
		log.info( "listAllParticipations()" );
		return participationService.listOf();
	}

	@GET
	@Path( "/{id:[0-9][0-9]*}" )
	@Produces( MediaType.APPLICATION_JSON )
	public Participation readParticipationById( @PathParam( "id" ) Long id ) throws Exception
	{
		log.info( "readParticipationById()" );
		return participationService.readBy( id );
	}
}
