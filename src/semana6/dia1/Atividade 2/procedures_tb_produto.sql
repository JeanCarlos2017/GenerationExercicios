USE db_pizzaria_legal;

DELIMITER //
CREATE PROCEDURE `addProduto` (nome_produto varchar(50), preco float, descricao varchar(500), 
		categoria_id int(6))
	BEGIN
		INSERT INTO tb_produto (nome_produto, preco, descricao, categoria_id)
		VALUES (nome_produto, preco, descricao, categoria_id);
	END//

DELIMITER ;