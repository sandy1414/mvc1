package org.cap.controller;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AgeController {
	@GetMapping(value = "/cal")
	public ModelAndView calculate(@RequestParam String date)throws Exception {

		String[] s=date.split("-");
		int year=Integer.parseInt(s[0]);
		int month=Integer.parseInt(s[1]);
		int day=Integer.parseInt(s[2]);
		LocalDate l1 = LocalDate.of(year, month, day);
		LocalDate now1 = LocalDate.now();
		Period age = Period.between(l1, now1);
		System.out.println(s[0]+"----"+s[1]+"-------------"+s[2]+"/--"+age.getYears());
		ModelAndView mv = new ModelAndView("Age", "age", age);
		return mv;
	}

}
