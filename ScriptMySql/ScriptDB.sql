
CREATE TABLE actividad
(
	idActividad INT AUTO_INCREMENT PRIMARY KEY,
    	nombre varchar(200),
    	estado bool,
	fechaEjecucion date,
	diasRetraso int,
	FOREIGN KEY (idEmpleado)
  	REFERENCES `pruebatecnica`.`actividad` (`idEmpleado`)
);
CREATE TABLE empleado 
(
	idEmpleado INT AUTO_INCREMENT PRIMARY KEY,
	nombre varchar(200)
);

/* datos iniciales para la tabla Empleado*/
insert into empleado(nombre) values('Felipe Vanegas');
insert into empleado(nombre) values('Karol Vanegas');

/* datos iniciales para la tabla Actividad*/
insert into actividad(nombre,estado, fechaEjecucion, diasRetraso, idEmpleado) values('Actividad1',false, STR_TO_DATE("04-25-2022 15:40:10", "%m-%d-%Y %H:%i:%s"),0,1);
insert into actividad(nombre,estado, fechaEjecucion, diasRetraso, idEmpleado) values('Actividad2',false, STR_TO_DATE("04-26-2022 15:40:10", "%m-%d-%Y %H:%i:%s"),0,2);

