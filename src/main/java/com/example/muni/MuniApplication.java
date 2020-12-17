package com.example.muni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//Relevamiento Municipalidad de Mendoza
//Sistema de control de stock de medicamentos, contemplando la 
//interconexion entre el sistema del deposito central con todos 
//los centros de salud del municipio.
//El depósito central genera ingresos de medicamentos a partir de
//compras o devoluciones de medicamentos. Este puede enviar medicamentos
//a los centros de salud o bien enviarlos entre centros. 
//Cada centro de salud debe tener un control de stock indicando el 
//porcentaje de insumos con los que cuenta para saber cuando realizar
//un pedido al depósito central. Dicho pedido se realiza por fuera de la plataforma
//Se deben cargar las fechas de caducidad y los códigos de lote de los 
//medicamentos para llevar un mejor control a traves de 
//notificaciones sobre los medicamentos proximos a vencerse.
//También, se busca generar una base de datos con las personas 
//que reciban los medicamentos para comparar con la informacion 
//de las obras sociales, y de esta manera evitar que la misma persona reciba dos veces el mismo medicamento


@SpringBootApplication
public class MuniApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuniApplication.class, args);
	}

}
