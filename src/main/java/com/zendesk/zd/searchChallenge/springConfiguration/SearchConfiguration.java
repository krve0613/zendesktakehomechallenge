package com.zendesk.zd.searchChallenge.springConfiguration;

import com.zendesk.zd.searchChallenge.api.SearchSvcInterface;
import com.zendesk.zd.searchChallenge.solution.SearchSvcImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("default")
public class SearchConfiguration {
    @Bean
    public SearchSvcInterface candSearch() {
        return new SearchSvcImpl();
    }
}

