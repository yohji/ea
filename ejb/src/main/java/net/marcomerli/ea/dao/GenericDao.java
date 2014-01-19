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

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import net.marcomerli.ea.model.Model;

import org.apache.log4j.Logger;

@SuppressWarnings( "rawtypes" )
public abstract class GenericDao<M extends Model> implements IGenericDao<M> {

	protected static Logger logger = Logger.getLogger( "dao" );

	@Inject
	private EntityManager em;

	@SuppressWarnings( "unchecked" )
	public List<M> listOf() throws Exception
	{
		Class mClass = getMClass();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<M> criteria = cb.createQuery( mClass );
		Root<M> list = criteria.from( mClass );
		criteria.select( list );

		return em.createQuery( criteria ).getResultList();
	}

	@SuppressWarnings( "unchecked" )
	public M readBy( Long id ) throws Exception
	{
		Class mClass = getMClass();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<M> criteria = cb.createQuery( mClass );
		Root<M> m = criteria.from( mClass );
		criteria.select( m ).where( cb.equal( m.get( "id" ), id ) );

		return em.createQuery( criteria ).getSingleResult();
	}

	public void createOrUpdateOf( M model ) throws Exception
	{
		em.persist( model );
	}

	public void deleteOf( M model ) throws Exception
	{
		em.remove( model );
	}

	private Class getMClass()
	{
		return (Class) ( (ParameterizedType) getClass().getGenericSuperclass() ).getActualTypeArguments()[0];
	}
}
