package org.openmrs.module.conceptmanagement;

/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

import java.util.List;

import org.openmrs.Concept;
import org.openmrs.ConceptClass;
import org.openmrs.ConceptDatatype;
import org.openmrs.api.db.DAOException;

/**
 *
 */
public interface ConceptSearchDAO {
	
	public List<Concept> getConcepts(ConceptSearch cs) throws DAOException;
	
	public Concept getConcept(Integer conceptId) throws DAOException;
	
	public Long getNumberOfObsForConcept(Integer conceptId) throws DAOException;
	
	public Long getNumberOfFormsForConcept(Integer conceptId) throws DAOException;
	
	public List<ConceptClass> getAllConceptClasses() throws DAOException;
	
	public List<ConceptDatatype> getAllConceptDatatypes() throws DAOException;
	
	public ConceptDatatype getConceptDatatypeById(int id) throws DAOException;
	
	public ConceptClass getConceptClassById(int id) throws DAOException;
	
}