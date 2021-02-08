package com.elaachiq.exam.composite;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.elaachiq.exam.aspect.MyLog;
import com.elaachiq.exam.observer.Observer;
import com.elaachiq.exam.observer.Options;
@Component
abstract public class Figure implements Observer, Serializable{

	protected Options options; 
	@MyLog
	public abstract double calculerSurface();
	@MyLog
	public abstract double calculerPerimetre();
	@MyLog
	public abstract void draw();

}
