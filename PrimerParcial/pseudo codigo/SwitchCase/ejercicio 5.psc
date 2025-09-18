Algoritmo ACTIVIDAD5
Definir dia, mes Como Entero
Definir signo Como Cadena
Escribir "Ingresa tu dia de nacimiento: "
Leer dia
Escribir "Ingresa tu mes de nacimiento (1-12): "	
Leer mes
		Si mes < 1 O mes > 12 Entonces
			Escribir "Mes invalido"
		Sino
			Si dia < 1 O dia > 31 Entonces
			Escribir "Dia invalido"
			Sino
			Segun mes Hacer
			1:
				Si dia < 20 Entonces
				signo <- "Capricornio"
				Sino
				signo <- "Acuario"
				FinSi
			2:
				Si dia < 19 Entonces
				signo <- "Acuario"
				Sino
				signo <- "Piscis"
				FinSi
			3:
				Si dia < 21 Entonces
				signo <- "Piscis"
				Sino
				signo <- "Aries"
				FinSi
			4:
				Si dia < 20 Entonces
				signo <- "Aries"
				Sino
				signo <- "Tauro"
				FinSi
			5:
				Si dia < 21 Entonces
				signo <- "Tauro"
				Sino
				signo <- "Geminis"
				FinSi
			6:
				Si dia < 21 Entonces
				signo <- "Geminis"
				Sino
				signo <- "Cancer"
				FinSi
				7:
				Si dia < 23 Entonces
				signo <- "Cancer"
				Sino
				signo <- "Leo"
				FinSi
			8:
				Si dia < 23 Entonces
				signo <- "Leo"
				Sino
				signo <- "Virgo"
				FinSi
			9:
				Si dia < 23 Entonces
				signo <- "Virgo"
				Sino
				signo <- "Libra"
				FinSi
			10:
				Si dia < 23 Entonces
				signo <- "Libra"
				Sino
				signo <- "Escorpio"
				FinSi
			11:
				Si dia < 22 Entonces
				signo <- "Escorpio"
				Sino
				signo <- "Sagitario"
				FinSi
			12:
				Si dia < 22 Entonces
				signo <- "Sagitario"
				Sino
				signo <- "Capricornio"
			FinSi
			FinSegun
				Escribir "Tu signo zodiacal es: ", signo
			FinSi
		FinSi
FinAlgoritmo
