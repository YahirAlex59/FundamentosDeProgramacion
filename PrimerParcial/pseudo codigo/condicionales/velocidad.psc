Algoritmo sin_titulo
	Definir velocidad Como Entero
	Definir cumpleaños Como Caracter
	escribir "velocidad?"
	leer velocidad
	escribir "es tu cumpleaños?"
	leer cumpleaños
	si cumpleaños = 'si" Entonces
		Escribir "no hay multa"
	sino 
		si velocidad <= 60 Entonces
			Escribir "0=sin multa"
		sino si velocidad > 61 y velocidad < 80 Entonces
				escribir "1=multa pequeña"
			sino escribir "multa grande";
			fin si
		FinSi
	Fin si


FinAlgoritmo
