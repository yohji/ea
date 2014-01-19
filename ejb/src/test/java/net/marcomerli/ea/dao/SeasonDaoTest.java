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

package net.marcomerli.ea.dao;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;

import net.marcomerli.ea.model.Season;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith( Arquillian.class )
public class SeasonDaoTest extends Assert {

	@Deployment
	public static Archive<?> createTestArchive()
	{
		return ShrinkWrap.create( WebArchive.class, "test.war" )
			.addClasses( Season.class, SeasonDao.class, SeasonDao.class )
			.addAsResource( "META-INF/test-persistence.xml" )
			.addAsWebInfResource( EmptyAsset.INSTANCE, "beans.xml" )
			.addAsWebInfResource( "test-ds.xml" );
	}

	@Inject
	SeasonDao seasonDao;

	@Inject
	Logger log;

	@Test
	public void testListOf() throws Exception
	{
		List<Season> list = seasonDao.listOf();

		assertNotNull( list );
		assertEquals( 1, list.size() );
	}
}
