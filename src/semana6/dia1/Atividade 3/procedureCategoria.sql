 use db_farmacia_do_bem;
 
DELIMITER //
CREATE PROCEDURE `addCategoria` ( `nome` varchar(50), `categoria` varchar(50))
	BEGIN
		INSERT INTO tb_categoria (nome, categoria)
		VALUES (nome, categoria);
	END//

DELIMITER ;