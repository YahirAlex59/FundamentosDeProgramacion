Algoritmo ACTIVIDAD7
Definir sabor, tipoChocolate Como Cadena
Definir precio Como Real
Definir snacks Como Entero
Definir personaliza Como Logico
	precio = 0
		Escribir "¿Qué sabor quieres? (manzana, fresa, chocolate): "
		Leer sabor
		Segun sabor Hacer
			"manzana":
				precio = 200
			"fresa":
				precio = 250
			"chocolate":
				Escribir "¿Chocolate negro o blanco?: "
				Leer tipoChocolate
				Si tipoChocolate = "negro" Entonces
					precio = 280
				Sino
					Si tipoChocolate = "blanco" Entonces
						precio = 300
					FinSi
				FinSi
			De Otro Modo:
				Escribir "Sabor no válido."
		FinSegun
		Escribir "¿Cuántos snacks adicionales deseas? ($25 c/u): "
		Leer snacks
		precio = precio + snacks * 25
		
		Escribir "¿Deseas personalizar con nombre? (Verdadero/Falso): "
		Leer personaliza
		Si personaliza = Verdadero Entonces
			precio = precio + 30
		FinSi
		
	Escribir "El precio total de la tarta es: $", precio
FinAlgoritmo
