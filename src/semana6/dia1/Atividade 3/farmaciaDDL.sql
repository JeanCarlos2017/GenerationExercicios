-- CREATE DATABASE db_farmacia_do_bem;
 use db_farmacia_do_bem;
 
 CREATE TABLE tb_categoria(
	id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL, 
    categoria VARCHAR(50) NOT NULL
);

CREATE TABLE tb_produto(
	id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nome_produto VARCHAR(50) NOT NULL, 
    preco FLOAT NOT NULL, 
    descricao VARCHAR(500) NOT NULL,
    categoria_id INT(6) UNSIGNED NOT NULL,
    CONSTRAINT `fk_categoria_id`
     FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
     ON DELETE CASCADE
     ON UPDATE RESTRICT
);