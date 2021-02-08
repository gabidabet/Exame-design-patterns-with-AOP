package com.elaachiq.exam;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.elaachiq.exam.aspect.AppContext;
import com.elaachiq.exam.composite.Circle;
import com.elaachiq.exam.composite.Figure;
import com.elaachiq.exam.composite.Groupe;
import com.elaachiq.exam.composite.Rectangle;
import com.elaachiq.exam.observer.Observer;
import com.elaachiq.exam.observer.Options;
import com.elaachiq.exam.stategy.Algo1;

@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {
		AppContext.authenticateUser("admin","admin",new String[]{"USER"});
		SpringApplication.run(DemoApplication.class, args);
	}
	 @Bean
	    CommandLineRunner commandLineRunner(){
	        return args -> {
	        	Dessin dessin1 = new Dessin(new ArrayList<Figure>(),new Algo1());
	        	Circle c = new Circle(new Point(0,0), 3);
	        	System.out.println(c.calculerPerimetre());
	        	
	        	dessin1.ajouter(c);
	        	
	        	List<Figure> list = new ArrayList<Figure>();
	        	list.add(new Rectangle(new Point(0,0),20,30));
	        	list.add(new Circle(new Point(1,1), 3));
	            Groupe g1=new Groupe(list);
	        
	            dessin1.ajouter(g1);
	            
	            dessin1.getFigures().forEach(f->f.draw());
	            
	            ArrayList<Observer> ol = new ArrayList<>();
	            
	            Options options = new Options(Color.RED,Color.BLACK,10,ol);
	            
	           ol.add(c);
	           
	           options.ntifyAll();
	            
	            
	       
	        };
	    }
}
