Algoritmo SaludoPorHora
	Definir hora Como Entero
		
		Escribir "Ingrese la hora (0 - 23): "
		Leer hora
		
		Si hora >= 6 Y hora <= 12 Entonces
			Escribir "Buenos días"
		Sino
			Si hora >= 13 Y hora <= 20 Entonces
				Escribir "Buenas tardes"
			Sino
				Escribir "Buenas noches"
			FinSi
	FinSi
FinAlgoritmo
