package com.elaachiq.exam.observer;

import com.elaachiq.exam.composite.Figure;

public interface Observable {
	public void ntifyAll();
	public void remove(Figure figure);
	public void add(Figure figure);
}
