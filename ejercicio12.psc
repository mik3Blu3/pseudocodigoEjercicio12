Algoritmo Lector_de_datos
	salir <- 0
	alturaPromedioMujer <- 0
	alturaPromedioHombre <- 0
	promedioEdad <- 0
	contadorEdad <- 0
	contadorMujer <- 0
	contadorHombre <- 0
	promedioAlturaHombreReal <- 0
	promedioAlturaMujerReal <- 0
	Escribir 'Ingrese los datos que se le piden a continuacion'
	Repetir
		Escribir 'Ingrese  la altura de la persona: (mts) '
		Leer altura
		Si altura<0 Entonces
			salir <- salir+1
			Escribir ''
			Escribir 'La altura es negativa por ende termina el programa'
			Escribir ''
		SiNo
			Escribir 'Ingrese la edad de la persona : (años)'
			Leer edad
			promedioEdad <- promedioEdad+edad
			contadorEdad <- contadorEdad+1
			Escribir 'Ingrese el sexo de la persona : (F/M)'
			Leer sexoPersona
			Si sexoPersona=='F' O sexoPersona=='f' Entonces
				alturaPromedioMujer <- alturaPromedioMujer+altura
				contadorMujer <- contadorMujer+1
			FinSi
			Si sexoPersona=='M' O sexoPersona=='m' Entonces
				alturaPromedioHombre <- alturaPromedioHombre+altura
				contadorHombre <- contadorHombre+1
			FinSi
		FinSi
	Hasta Que (salir<>0)
	Si contadorMujer==0 Entonces
		Escribir 'No existen datos de mujeres  almacenados'
		Escribir ''
	FinSi
	Si contadorMujer<>0 Entonces
		promedioAlturaMujerReal <- alturaPromedioMujer/contadorMujer
		Escribir 'El promedio de la altura de las mujeres es de: ',promedioAlturaMujerReal,' mts'
		Escribir ''
	FinSi
	Si contadorHombre<>0 Entonces
		promedioAlturaHombreReal <- alturaPromedioHombre/contadorHombre
		Escribir 'El promedio de la altura de los hombres es de: ',promedioAlturaHombreReal,' mts'
		Escribir ''
	FinSi
	Si contadorHombre==0 Entonces
		Escribir 'No existen datos de hombres almacenados'
		Escribir ''
	FinSi
	Si contadorEdad<>0 Entonces
		promedioEdadTotal <- promedioEdad/contadorEdad
		Escribir 'El promedio de edad de los participantes es de: ',promedioEdadTotal,' años'
		Escribir ''
	FinSi
	Si contadorEdad==0 Entonces
		Escribir 'No existen datos de edades almacenados'
		Escribir ''
	FinSi
FinAlgoritmo
