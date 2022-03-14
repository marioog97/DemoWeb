insert into empleado (id, nombre, apellidos)
 select 1, 'Rocío', 'De la O' from dual where not exists (select 1 from empleado where id = 1);

insert into empleado (id, nombre, apellidos)
	select 2, 'Alberto', 'Del Monte' from dual where not exists (select 1 from empleado where id = 2);
 insert into empleado (id, nombre, apellidos)
	select 3, 'Lucía', 'Ricarti' from dual where not exists (select 1 from empleado where id = 3);
	
insert into empleado (id, nombre, apellidos) 
	select 4, 'Roberto', 'Sánchez'  from dual where not exists (select 1 from empleado where id = 4);


  insert into rol (id, rol)
	select 1, 'ADMIN' from dual where not exists (select 1 from rol where id = 1);

insert into rol (id, rol)
	select 2, 'GESTOR' from dual where not exists (select 1 from rol where id = 2);

/* pass = 1111 */
insert into usuario (username, nombre, password, rol_id)
	select 'user1', 'Mario Ortiz', '$2a$10$5xOe75pbLcAjp0TbVWaluunrSshgYdH82YNwGd.b0Os4hAWbIEkry', 1 from dual where not exists (select 1 from usuario where username = 'user1');

insert into usuario (username, nombre, password, rol_id)
	select 'user2', 'Empleado de NTTData', '$2a$10$5xOe75pbLcAjp0TbVWaluunrSshgYdH82YNwGd.b0Os4hAWbIEkry', 2 from dual where not exists (select 1 from usuario where username = 'user2');