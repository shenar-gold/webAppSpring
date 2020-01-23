package com.sh.mycafe.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyCafeControllers {

	@ModelAttribute
	public void addingCommonObject(Model md) {
		md.addAttribute("headerMessage", "MOM's CAFE");
	}
	
	@RequestMapping("/cafe")
	public String chooseOption(){
		
		return "menu";
	}
	
	@RequestMapping("/options/{item}")
	public ModelAndView showOrderFormPage(@PathVariable("item") String itemValue) {
		
		ModelAndView modelOrderForm = new ModelAndView("order-form"); 
		modelOrderForm.addObject("itemName", itemValue);
		return modelOrderForm;
		
	}
	
	@RequestMapping("/processOrder/{item}")
	public ModelAndView showOrder(@PathVariable("item") String food_name, @ModelAttribute("food") Food food_item) {
		
		food_item.setFoodName(food_name);

		
		ModelAndView model = new ModelAndView("process-order"); 
		model.addObject("headerMessage3", "Order process");
		return model;
	}
	
//	private List<Order> getList(){
//		
//		List<Order> list = new ArrayList<Order>();
//		
//		Order or1 = new Order();
//		or1.setOrderName("one");
//		or1.setCustomerName("onename");
//		
//		list.add(or1);
//		Order or2 = new Order();
//		or2.setOrderName("two");
//		or2.setCustomerName("twoname");
//		
//		
//		list.add(or2);
//		return list;
//		
//	}
	@RequestMapping("/finishOrder")
	public ModelAndView finishOrder() {
		
		ModelAndView model = new ModelAndView("finish-order");
		return model;
	}
}
