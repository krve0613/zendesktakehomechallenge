package com.zendesk.zd.searchChallenge.solution;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/*
 * This controller needs to expose the following rest endpoints.  You need to fill in the implementation here
 *
 * Required REST Endpoints
 *
 *      /item                       Get all items
 *      /item?category=C            Get all items in category specified by Category shortName
 *      /item/{itemShortName}       Get item that matches the specified Item shortName
 */


@Profile("default")
@RestController
@RequestMapping("/api")
public class SearchRestControllerImpl {
	
	private SearchSvcImpl searchsvc;
	
	/*public SearchRestControllerImpl() {
		
	}*/
	
	public SearchRestControllerImpl(SearchSvcImpl searchsvc) {
		this.searchsvc = searchsvc;
		searchsvc.init("temp");
	}
	
	@GetMapping("/items")
	@ResponseBody
	public List<Object> getitems() {
	    return searchsvc.getAllItems();
	}
	
	@GetMapping("/item")
	@ResponseBody
	public List<Object> getitemsBycategory(@RequestParam(name="value") String id) {
	    //return searchsvc.getOrganizations(id);
		return searchsvc.getItems(id);
	}
	
	
}

