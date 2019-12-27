package com.zendesk.zd.searchChallenge.solution;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zendesk.zd.searchChallenge.api.Organization;
import com.zendesk.zd.searchChallenge.api.SearchSvcInterface;
import com.zendesk.zd.searchChallenge.api.Ticket;
import com.zendesk.zd.searchChallenge.api.User;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


/*
 * implement SearchSvcInterface and add the actual functionality here.
 */

@Component
public class SearchSvcImpl implements SearchSvcInterface {
	
	private static List<Organization> organizations;
	private static List<User> users;
	private static List<Ticket> tickets;
	//private static List<Object> result = new ArrayList<>();
	//private static Item items;
    @Override
    public void init(String itemPriceJsonFileName) {
    	String file = "";
    	toJavaObject(file);
    }
    
    @Override
	public List<Object> getAllItems() {
		// TODO Auto-generated method stub
    	List<Object> result = new ArrayList<>();
    	for(Organization it: organizations) {
    		result.add(it);
    	}
    	for(User it: users) {
    		result.add(it);
    	}
    	for(Ticket it: tickets) {
    		result.add(it);
    	}
    	
		return null;
	}

    @Override
    public List<Object> getItems(String category) {
    	List<Object> result = new ArrayList<>();
    	getOrganizations(category,result);
    	getUsers(category,result);
    	getTickets(category,result);
    	
    	return result;
    }

    @Override
    public List<Object> getOrganizations(String category, List<Object> result) {
    	//List<Organization> result = new ArrayList<>();
    	
    	System.out.println(category);
    	for(Organization it: organizations) {
    		if(it.get_id().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getName().contentEquals(category)) {
    			result.add(it);
    		}   		
    		else if(it.getUrl().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getExternal_id().contentEquals(category)) {
    			result.add(it);
    		}
    		
    		else if(it.getCreated_at().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getDetails().contentEquals(category)) {
    			result.add(it);
    		}  
    		else if(it.getShared_tickets().contentEquals(category)) {
    			result.add(it);
    		}
    		String[] domains = it.getDomain_names();
        	String[] tags = it.getTags();
    		for(String dom: domains) {
    			if(dom.contentEquals(category)) {
    				result.add(it);
    			}
    		}
    		for(String tag: tags) {
    			if(tag.contentEquals(category)) {
    				result.add(it);
    			}
    		}
    		
    	}
        return result;
    }
    
    @Override
	public List<Object> getUsers(String category, List<Object> result) {
		// TODO Auto-generated method stub
		for(User it: users) {
    		if(it.get_id().contentEquals(category)) {
    			result.add(it);
    		}  		
    		else if(it.getUrl().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getExternal_id().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getName().contentEquals(category)) {
    			result.add(it);
    		} 
    		else if(it.getAlias().contentEquals(category)) {
    			result.add(it);
    		}     		
    		else if(it.getCreated_at().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getActive().contentEquals(category)) {
    			result.add(it);
    		}  
    		else if(it.getVerified().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getShared().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getLocale().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getTimezone().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getLast_login_at().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getEmail().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getPhone().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getSignature().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getOrganization_id().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getSuspended().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getRole().contentEquals(category)) {
    			result.add(it);
    		}
    		
        	String[] tags = it.getTags();
    		for(String tag: tags) {
    			if(tag.contentEquals(category)) {
    				result.add(it);
    			}
    		}
    		
    	}
        return result;
	}

    @Override
	public List<Object> getTickets(String category, List<Object> result) {
		// TODO Auto-generated method stub
		for(Ticket it: tickets) {
    		if(it.get_id().contentEquals(category)) {
    			result.add(it);
    		}  		
    		else if(it.getUrl().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getExternal_id().contentEquals(category)) {
    			result.add(it);
    		}    		
    		else if(it.getCreated_at().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getType().contentEquals(category)) {
    			result.add(it);
    		}  
    		else if(it.getSubject().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getDescription().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getPriority().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getStatus().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getStatus().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getSubmitter_id().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getAssignee_id().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getOrganization_id().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getHas_incidents().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getDue_at().contentEquals(category)) {
    			result.add(it);
    		}
    		else if(it.getVia().contentEquals(category)) {
    			result.add(it);
    		}
    		
        	String[] tags = it.getTags();
    		for(String tag: tags) {
    			if(tag.contentEquals(category)) {
    				result.add(it);
    			}
    		}
    		
    	}
        return result;
	}
    
    
    /*@Override
    public List<Item> getUsers(String name) {
    	List<User> result = new ArrayList<>();
    	for(Item it: items) {
    		if(it.getName().contentEquals(name)) {
    			result.add(it);
    		}
    	}
        return result;
        //return null;
    }*/
    
    public static void toJavaObject(String itemPriceJsonFileName) {
        
        // this is the key object to convert JSON to Java
        ObjectMapper mapper = new ObjectMapper();

        try {
        	//File json = new File(itemPriceJsonFileName);
        	File json1 = new File("src/main/resources/users.json");
            
            ObjectMapper mapper1 = new ObjectMapper();
           
            users =  mapper1.readValue(json1, new TypeReference<List<User>>(){});
           
            System.out.println("Java object created from JSON String :");
            
            for(User it:users) {
            	System.out.println(it);
            }
            
        	File json2 = new File("src/main/resources/organizations.json");
            
            ObjectMapper mapper2 = new ObjectMapper();
           
            organizations =  mapper2.readValue(json2, new TypeReference<List<Organization>>(){});
           
            System.out.println("Java object created from JSON String :");
            
            for(Organization it:organizations) {
            	System.out.println(it);
            }
            
           File json3 = new File("src/main/resources/tickets.json");
            
            ObjectMapper mapper3 = new ObjectMapper();
           
            tickets =  mapper3.readValue(json3, new TypeReference<List<Ticket>>(){});
           
            System.out.println("Java object created from JSON String :");
            
            for(Ticket it:tickets) {
            	System.out.println(it.get_id());
            }

        } catch (JsonGenerationException ex) {
            ex.printStackTrace();
        } catch (JsonMappingException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }



	


	
    
}
