package com.elaachiq.exam.observer;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.elaachiq.exam.Color;
import com.elaachiq.exam.composite.Figure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Options implements Observable{
	private Color fillColor;
	private Color countourColor;
	private int countourEpesseur;
	
	public ArrayList<Observer> figurs;
	
	@Override
	public void ntifyAll() {
		figurs.forEach(observer -> observer.update(this));
		
	}
	@Override
	public void remove(Figure figure) {
		figurs.remove(figure);
		
	}
	@Override
	public void add(Figure figure) {
		figurs.add(figure);
		
	}
}