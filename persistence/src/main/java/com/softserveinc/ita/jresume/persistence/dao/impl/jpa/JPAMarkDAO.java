package com.softserveinc.ita.jresume.persistence.dao.impl.jpa;

import org.springframework.stereotype.Repository;

import com.softserveinc.ita.jresume.common.entity.Mark;
import com.softserveinc.ita.jresume.persistence.dao.impl.MarkDAO;
/**
 * JPA implementation for MarkDAO.
 * @author Golovii Sergii
 */
@Repository
public class JPAMarkDAO extends JPAGenericDAO<Mark, Long> implements MarkDAO {

}
