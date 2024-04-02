package br.com.fiap.movietracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class MovietrackerApplication {

		public static void main(String[] args) {
			SpringApplication.run(MovietrackerApplication.class, args);
		}

		@RequestMapping
		@ResponseBody
		public String home (){
			return "MovieTracker";
		}

}
