package com.moxito.mvcApp;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLanguage;

	private String[] operatingSystems;

	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favouriteLanguageOptions;

	public Student() {

		// populate country options
		countryOptions = new LinkedHashMap<String, String>();

		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("JP", "Japan");
		countryOptions.put("IS", "Israel");
		countryOptions.put("US", "United State of America");

		// populate language option in radiobutton

		favouriteLanguageOptions = new LinkedHashMap<String, String>();

		favouriteLanguageOptions.put("Java", "Java");
		favouriteLanguageOptions.put("C#", "C#");
		favouriteLanguageOptions.put("Ruby", "Ruby");
		favouriteLanguageOptions.put("Python", "Python");
		favouriteLanguageOptions.put("PHP", "PHP");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public LinkedHashMap<String, String> getFavouriteLanguageOptions() {
		return favouriteLanguageOptions;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

}
