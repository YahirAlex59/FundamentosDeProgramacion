Algoritmo CompaniaTelefonica
		Definir minutos Como Entero
		Definir dia, turno Como Cadena
		Definir total, impuesto Como Real
		Escribir "Duración de la llamada (en minutos): "
		Leer minutos
		Escribir "¿Qué día es hoy? "
		Leer dia
		dia <- Minusculas(dia)
		total <- 0
		Si minutos <= 5 Entonces
			total <- minutos * 1.0
		Sino
			Si minutos <= 8 Entonces
				total <- 5 * 1.0 + (minutos - 5) * 0.8
			Sino
				Si minutos <= 10 Entonces
					total <- 5 * 1.0 + 3 * 0.8 + (minutos - 8) * 0.7
				Sino
					total <- 5 * 1.0 + 3 * 0.8 + 2 * 0.7 + (minutos - 10) * 0.5
				FinSi
			FinSi
		FinSi
		impuesto <- 0
		Si dia = "domingo" Entonces
			impuesto <- total * 0.03
		Sino
			Escribir "¿La llamada fue en matutino o vespertino? "
			Leer turno
			turno <- Minusculas(turno)
			
			Si turno = "matutino" Entonces
				impuesto <- total * 0.15
			Sino
				impuesto <- total * 0.10
			FinSi
		FinSi
		Escribir "Debe pagar: $", total + impuesto
FinAlgoritmo