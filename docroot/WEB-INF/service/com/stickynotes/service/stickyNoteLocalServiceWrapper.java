/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.stickynotes.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link stickyNoteLocalService}.
 * </p>
 *
 * @author    mbelda
 * @see       stickyNoteLocalService
 * @generated
 */
public class stickyNoteLocalServiceWrapper implements stickyNoteLocalService,
	ServiceWrapper<stickyNoteLocalService> {
	public stickyNoteLocalServiceWrapper(
		stickyNoteLocalService stickyNoteLocalService) {
		_stickyNoteLocalService = stickyNoteLocalService;
	}

	/**
	* Adds the sticky note to the database. Also notifies the appropriate model listeners.
	*
	* @param stickyNote the sticky note
	* @return the sticky note that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.stickynotes.model.stickyNote addstickyNote(
		com.stickynotes.model.stickyNote stickyNote)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stickyNoteLocalService.addstickyNote(stickyNote);
	}

	/**
	* Creates a new sticky note with the primary key. Does not add the sticky note to the database.
	*
	* @param stickyNoteId the primary key for the new sticky note
	* @return the new sticky note
	*/
	public com.stickynotes.model.stickyNote createstickyNote(long stickyNoteId) {
		return _stickyNoteLocalService.createstickyNote(stickyNoteId);
	}

	/**
	* Deletes the sticky note with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stickyNoteId the primary key of the sticky note
	* @return the sticky note that was removed
	* @throws PortalException if a sticky note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.stickynotes.model.stickyNote deletestickyNote(long stickyNoteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _stickyNoteLocalService.deletestickyNote(stickyNoteId);
	}

	/**
	* Deletes the sticky note from the database. Also notifies the appropriate model listeners.
	*
	* @param stickyNote the sticky note
	* @return the sticky note that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.stickynotes.model.stickyNote deletestickyNote(
		com.stickynotes.model.stickyNote stickyNote)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stickyNoteLocalService.deletestickyNote(stickyNote);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _stickyNoteLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stickyNoteLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _stickyNoteLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stickyNoteLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stickyNoteLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.stickynotes.model.stickyNote fetchstickyNote(long stickyNoteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stickyNoteLocalService.fetchstickyNote(stickyNoteId);
	}

	/**
	* Returns the sticky note with the primary key.
	*
	* @param stickyNoteId the primary key of the sticky note
	* @return the sticky note
	* @throws PortalException if a sticky note with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.stickynotes.model.stickyNote getstickyNote(long stickyNoteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _stickyNoteLocalService.getstickyNote(stickyNoteId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _stickyNoteLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the sticky notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of sticky notes
	* @param end the upper bound of the range of sticky notes (not inclusive)
	* @return the range of sticky notes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.stickynotes.model.stickyNote> getstickyNotes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stickyNoteLocalService.getstickyNotes(start, end);
	}

	/**
	* Returns the number of sticky notes.
	*
	* @return the number of sticky notes
	* @throws SystemException if a system exception occurred
	*/
	public int getstickyNotesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stickyNoteLocalService.getstickyNotesCount();
	}

	/**
	* Updates the sticky note in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param stickyNote the sticky note
	* @return the sticky note that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.stickynotes.model.stickyNote updatestickyNote(
		com.stickynotes.model.stickyNote stickyNote)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stickyNoteLocalService.updatestickyNote(stickyNote);
	}

	/**
	* Updates the sticky note in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param stickyNote the sticky note
	* @param merge whether to merge the sticky note with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the sticky note that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.stickynotes.model.stickyNote updatestickyNote(
		com.stickynotes.model.stickyNote stickyNote, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stickyNoteLocalService.updatestickyNote(stickyNote, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _stickyNoteLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_stickyNoteLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _stickyNoteLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public com.stickynotes.model.stickyNote addstickyNote(
		com.stickynotes.model.stickyNote newStickyNote, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _stickyNoteLocalService.addstickyNote(newStickyNote, userId);
	}

	public java.util.List<com.stickynotes.model.stickyNote> getStickyNotesByGroup(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stickyNoteLocalService.getStickyNotesByGroup(groupId);
	}

	public java.util.List<com.stickynotes.model.stickyNote> getStickyNotesByGroupAndUser(
		long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stickyNoteLocalService.getStickyNotesByGroupAndUser(groupId,
			userId);
	}

	public java.util.List<com.stickynotes.model.stickyNote> getStickyNotesByPlid(
		long plid) throws com.liferay.portal.kernel.exception.SystemException {
		return _stickyNoteLocalService.getStickyNotesByPlid(plid);
	}

	public java.util.List<com.stickynotes.model.stickyNote> getStickyNotesByPlidAndUser(
		long plid, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stickyNoteLocalService.getStickyNotesByPlidAndUser(plid, userId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public stickyNoteLocalService getWrappedstickyNoteLocalService() {
		return _stickyNoteLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedstickyNoteLocalService(
		stickyNoteLocalService stickyNoteLocalService) {
		_stickyNoteLocalService = stickyNoteLocalService;
	}

	public stickyNoteLocalService getWrappedService() {
		return _stickyNoteLocalService;
	}

	public void setWrappedService(stickyNoteLocalService stickyNoteLocalService) {
		_stickyNoteLocalService = stickyNoteLocalService;
	}

	private stickyNoteLocalService _stickyNoteLocalService;
}