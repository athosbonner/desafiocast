package com.cast.desafio;

import org.apache.wicket.protocol.http.WebApplication;

import com.cast.desafio.home.SimplePage;

public class WicketApplication extends WebApplication {

	@Override
	public Class<SimplePage> getHomePage() {
		return SimplePage.class;
	}
	
}
