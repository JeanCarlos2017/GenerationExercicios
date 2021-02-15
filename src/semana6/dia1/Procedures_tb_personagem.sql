USE db_generation_game_online;
/*
DELIMITER //
CREATE PROCEDURE `addPersonagem` (nome VARCHAR(50), ataque int(4), vida INT(5),defesa int(6), classe_id INT(6))
	BEGIN
		INSERT INTO tb_personagem (nome, ataque, vida, defesa, classe_id)
		VALUES (nome, ataque, vida, defesa, classe_id);
	END//

DELIMITER ;

DELIMITER //
CREATE PROCEDURE `selectPoderAtaque` (poder_ataque INT(4))
	BEGIN
		SELECT * FROM tb_personagem WHERE tb_personagem.ataque > poder_ataque;
	END//

DELIMITER ;


DELIMITER //
CREATE PROCEDURE `selectPoderDefesa` (poder_defesa_min INT(4), poder_defesa_max INT(4))
	BEGIN
		SELECT * FROM tb_personagem WHERE tb_personagem.defesa > poder_defesa_min
											AND tb_personagem.defesa < poder_defesa_max;
	END//

DELIMITER ;


DELIMITER //
CREATE PROCEDURE `selectPersonagemPorIdClasse` (id_classe INT(6))
	BEGIN
		SELECT * FROM tb_personagem WHERE tb_personagem.classe_id = id_classe;
	END//

DELIMITER ;

*/

DELIMITER //
CREATE PROCEDURE `PersonagemJoinClasse` ()
	BEGIN
		SELECT * FROM tb_personagem AS P INNER JOIN tb_classe AS C ON P.classe_id = C.id;
	END//

DELIMITER ;

