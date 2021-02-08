	package com.elaachiq.exam;

import java.util.List;

import org.springframework.stereotype.Component;

import com.elaachiq.exam.composite.Figure;
import com.elaachiq.exam.stategy.Traitement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dessin {
	private List<Figure> figures;
	private Traitement traitement;
	
	
	public void ajouter(Figure figure) {
		figures.add(figure);
	}
	public void supprimer(Figure figure) {
		figures.remove(figure);
	}
	
}
