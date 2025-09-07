Algoritmo areas
		Definir opcion Como Entero
		Definir lado, base, altura, radio, area Como real
		
		Escribir "MENÚ DE ÁREAS"
		Escribir "1. Cuadrado"
		Escribir "2. Rectángulo"
		Escribir "3. Triángulo"
		Escribir "4. Círculo"
		Escribir "Elija una opción: "
		Leer opcion
		
		Segun opcion Hacer
			1:
				Escribir "Ingrese el lado del cuadrado: "
				Leer lado
				area = lado * lado
				Escribir "El área del cuadrado es: ", area
			2:
				Escribir "Ingrese la base del rectángulo: "
				Leer base
				Escribir "Ingrese la altura del rectángulo: "
				Leer altura
				area = base * altura
				Escribir "El área del rectángulo es: ", area
			3:
				Escribir "Ingrese la base del triángulo: "
				Leer base
				Escribir "Ingrese la altura del triángulo: "
				Leer altura
				area = (base * altura) / 2
				Escribir "El área del triángulo es: ", area
			4:
				Escribir "Ingrese el radio del círculo: "
				Leer radio
				area = PI * radio * radio
				Escribir "El área del círculo es: ", area
			De Otro Modo:
				Escribir "Opción inválida"
		FinSegun
FinAlgoritmo
