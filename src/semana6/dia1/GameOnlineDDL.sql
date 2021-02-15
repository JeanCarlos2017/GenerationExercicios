-- CREATE DATABASE db_generation_game_online;
-- USE db_generation_game_online;

/*
CREATE TABLE tb_classe(
	id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	nome_classe varchar(50) not null,
	tipo varchar(50) not null
)ENGINE = InnoDB;

*/

CREATE TABLE tb_personagem(
	id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
    nome VARCHAR(50) NOT NULL, 
    ataque INT(4) NOT NULL, 
    vida INT(5) NOT NULL, 
    defesa INT(6) NOT NULL,
    classe_id INT(6) UNSIGNED NOT NULL,
	CONSTRAINT `fk_classe_id`
     FOREIGN KEY (classe_id) REFERENCES tb_classe (id)
     ON DELETE CASCADE
     ON UPDATE RESTRICT
    
)ENGINE = InnoDB;

