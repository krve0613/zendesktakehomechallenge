package com.zendesk.zd.searchChallenge.api;


/*   my searchsvcimpl class solution will implement this interface
 */

import java.io.File;
import java.util.List;

public interface SearchSvcInterface {

    //to initially read all the json files and convert them to java objects

    public void init(String jsonFileName);
    
    /*
     * getOrganizations - this will read all the organizations values and filter by category.
     * category is the value which we are giving in REST URL as input
     */

    public List<Object> getOrganizations(String category, List<Object> result);
    
    /*
     * getUsers - this will read all the users values and filter by category.
     * category is the value which we are giving in REST URL as input
     */
    public List<Object> getUsers(String category, List<Object> result);
    
    /*
     * getTickets - this will read all the tickets values and filter by category.
     * category is the value which we are giving in REST URL as input
     */
    public List<Object> getTickets(String category, List<Object> result);

    /*
     * getItems:  all items with filter
     * this will call all the three above methods and perform matching search
     * 
     * 
     */
    
    public List<Object> getItems(String category);
    
    /*
     * getItems:  all items
     * if we want to have an API where it will give all the values from all the files with out any filter,
     *  we can use this in future.
     * 
     */
    
    public List<Object> getAllItems();

    /*
     * getItem:  filtered by Item's name
     * if we want to do filtering by specific field for example only by name
     * which is if name equals the value in given URL
     * we can use this method. But I am not implementing this because we have to have different methods
     * with different input param value.
     */

    //public List<User> getUser(String name);
}

