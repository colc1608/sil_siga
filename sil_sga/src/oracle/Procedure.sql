

------------------------------
-- PROCEDURE PARA EL DOCENTE :)


create or replace procedure sp_addDocente
(espec in int, nom in varchar, apater in varchar, amater in varchar, dni in varchar)
as

VID INT;

begin

      SELECT sq_usuario.NEXTVAL
      INTO VID
      FROM DUAL;
      
insert into usuario ( id, usuario, clave, tipo)
values (VID, (select usuario+1  from usuario where id = (select max(id) from usuario)), (SELECT dbms_random.string('p', 8) FROM dual),'1');
      
      SELECT sq_docente.NEXTVAL
      INTO VID
      FROM DUAL;

insert into docente (id, idespecialidad, nombre, APELLIDOPATERNO, APELLIDOMATERNO, dni, idusuario)
values (VID, espec,nom,apater,amater,dni,(select max(id) from usuario));

end;


------------------------------
-- PROCEDURE PARA EL ALUMNO :)

