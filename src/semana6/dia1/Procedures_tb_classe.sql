USE db_generation_game_online;
DELIMITER //
CREATE PROCEDURE `addClasse` ( `nome` varchar(50), `tipo_classe` varchar(50))
	BEGIN
		INSERT INTO tb_classe (nome_classe, tipo)
		VALUES (nome, tipo_classe);
	END//

DELIMITER ;