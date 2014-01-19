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

package net.marcomerli.ea.service;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;

import net.marcomerli.ea.dao.ParticipationDao;
import net.marcomerli.ea.model.Participation;

@Stateless
public class ParticipationService {

	@Inject
	private Logger log;

	@Inject
	private ParticipationDao participationDao;

	public List<Participation> listOf() throws Exception
	{
		log.info( "listOf()" );
		return participationDao.listOf();
	}

	public Participation readBy( Long id ) throws Exception
	{
		log.info( "readBy()" );
		return participationDao.readBy( id );
	}
}
