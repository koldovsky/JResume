package com.softserveinc.ita.jresume.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserveinc.ita.jresume.common.entity.User;
import com.softserveinc.ita.jresume.persistence.dao.impl.UserDAO;

/**
 * Class for working with User.
 * 
 * @author Andriy Zykhor
 */
@Service
public class UserService {
    
    /** UserDAO for access to data storage. */
    @Autowired
    private UserDAO userDao;
    
    /**
     * Create a new user.
     * 
     * @param user
     *            to be created.
     * @return created user.
     */
    public final User create(final User user) {
        return userDao.create(user);
    }
    
    /**
     * Update information user.
     * 
     * @param user
     *            object user to be updated.
     *            
     * @return updated user.
     */
    public final User update(final User user) {
        return userDao.update(user);
    }
    
    /**
     * Delete user from data storage.
     * 
     * @param user
     *            the user to be deleted.
     */
    public final void delete(final User user) {
        userDao.delete(user);
    }
    
    /**
     * Find all users.
     * 
     * @return a list of all users.
     */
    public final List<User> findAll() {
        return userDao.findAll();
    }
    
    /**
     * Find user associated with this email.
     * 
     * @param email
     *            email of the user
     * @return the user associated with this email
     */
    public final User findByEmail(final String email) {
        return userDao.findByEmail(email);
    }
    
}
