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
public class Rectangle extends Figure {
	private Point point;
	private double height;
	private double width;
	
	@Override
	public double calculerSurface() {
		return this.height * this.width;
	}

	@Override
	public double calculerPerimetre() {
		return (this.height + this.width) * 2;
	}
    @MyLog
	@Override
	public void draw() {
		System.out.println(String.format(
				"Draw Function Of rectangle with starting (x = %s, y = %s) and Hieght = %s and Width = %s", 
				this.point.getX(),this.point.getY(), this.height,this.width));
	}

	@Override
	public void update(Observable observable) {
		 int contourEpesseur = ((Options) observable).getCountourEpesseur();
	     Color fillColor =((Options) observable).getFillColor();
	     Color contourColor =((Options) observable).getCountourColor();
	     
	     System.out.println(String.format("Updated -> Fill : %s, Stroke : %s, StrokFill : %s ",fillColor,contourEpesseur,contourColor));
		
	}
	
}
	