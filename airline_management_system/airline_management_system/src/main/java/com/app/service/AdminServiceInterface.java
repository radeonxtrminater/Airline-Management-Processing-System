package com.app.service;

import java.util.List;

import com.app.pojos.Bookings;
import com.app.pojos.ContactUs;
import com.app.pojos.Feedback;
import com.app.pojos.Hotels;
import com.app.pojos.Images;
import com.app.pojos.Packages;
import com.app.pojos.Users;
import com.app.pojos.Worker;

public interface AdminServiceInterface {

	List<Feedback> fetchAllFeedback();

	List<Bookings> fetchAllBooking();

	List<ContactUs> fetchAllContactUs();

	List<Packages> fetchAllPackages();

	String addPackage(Packages package1);

	String addImage(Images image1);

	List<Images> fetchAllImages();

	String  removeImage(int pid);

	List<Feedback> fetchAllFeedBack();

	String deletePackage(int pid);

	List<Users> FetchUsers();

	Bookings fetchBookingById(int bid);

	String updatebooking(int bid, String startdate, String enddate);

	void loadWorkers(Worker w);

	List<Worker> getAllWorkers();

	String removeWorkers();

	String saveHotel(Hotels hotel);

	List<Hotels> fetchAllHotels();


	String removehotel(int hid);

}
