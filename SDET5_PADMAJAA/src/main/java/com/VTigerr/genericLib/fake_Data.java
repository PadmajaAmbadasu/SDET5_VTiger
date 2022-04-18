package com.VTigerr.genericLib;

import java.util.Date;
import java.util.Random;

import com.github.javafaker.Faker;

public class fake_Data {
	/**
	 * This is used to create random number till 1000
	 * @return
	 */
	public int randomNumber() 
	{
		Random random=new Random();
		return random.nextInt(1000);
    }
	/**
	 * This faker dependency help us to create fake firstName
	 * @return
	 */
	public String firstName() 
	{
	Faker faker=new Faker();
    return faker.name().firstName();
	}
	/**
	 * This faker document help us to create fake lastName
	 * @return
	 */
	public String lastName() 
	{
		Faker faker=new Faker();
		return faker.name().lastName();
	}
	/**
	 * This faker document help us to create fake organizationName
	 * @return
	 */
	public String orgName()
	{
	Faker faker =new Faker();
	return faker.company().industry();
	}
	
	/**
	 * This faker document help us to create fake phone number
	 * @return
	 */

	public String phoneNumber() 
	{
		Faker faker= new Faker();
		return faker.phoneNumber().phoneNumber();
	}
	
	public String getTodaysDate() {
		Date date = new Date();
		return date.toString();
	}
}
