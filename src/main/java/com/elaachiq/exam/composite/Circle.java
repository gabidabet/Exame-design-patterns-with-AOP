package com.elaachiq.exam.composite;

import org.springframework.stereotype.Component;

import com.elaachiq.exam.Color;
import com.elaachiq.exam.Point;
import com.elaachiq.exam.aspect.MyLog;
import com.elaachiq.exam.observer.Observable;
import com.elaachiq.exam.observer.Options;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Circle extends Figure{
	private Point center;
	private double rayon;
	@Override
	@MyLog
	public double calculerSurface() {
		return Math.PI * Math.pow(rayon, 2);
	}

	@Override
	@MyLog
	public double calculerPerimetre() {
		return 2 * Math.PI * rayon;
	}


	@Override
    @MyLog
	public void draw() {
		System.out.println(String.format(
				"Draw Function Of Circle with center (x = %s, y = %s) and r = %s", 
				this.center.getX(),this.center.getY(), this.rayon));
	}

	@Override
	public void update(Observable observable) {
		 int contourEpesseur = ((Options) observable).getCountourEpesseur();
	     Color fillColor =((Options) observable).getFillColor();
	     Color contourColor =((Options) observable).getCountourColor();
	     
	     System.out.println(String.format("Updated -> Fill : %s, Stroke : %s, StrokFill : %s ",fillColor,contourEpesseur,contourColor));
		
	}
	

}
