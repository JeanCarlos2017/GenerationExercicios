 use db_farmacia_do_bem;
DELIMITER //
CREATE PROCEDURE `addProduto` (nome_produto varchar(50), preco float, descricao varchar(500), 
		categoria_id int(6))
	BEGIN
		INSERT INTO tb_produto (nome_produto, preco, descricao, categoria_id)
		VALUES (nome_produto, preco, descricao, categoria_id);
	END//

DELIMITER ;

DELIMITER //
/*
CREATE PROCEDURE `selectProdutoMaior` (preco float)
	BEGIN
		SELECT * FROM tb_produto WHERE tb_produto.preco > preco;
	END//

DELIMITER ;

DELIMITER //
CREATE PROCEDURE `selectProdutoEntre` (preco_min float, preco_max float)
	BEGIN
		SELECT * FROM tb_produto WHERE tb_produto.preco BETWEEN preco_min AND preco_max;
	END//

DELIMITER ;


DELIMITER //
CREATE PROCEDURE `selectComeceCom` (nome VARCHAR(50))
	BEGIN
		SELECT * FROM tb_produto WHERE tb_produto.nome_produto LIKE CONCAT(nome, '%');
	END//

DELIMITER ;


DELIMITER //
CREATE PROCEDURE `ProdutoInnerJoinCategoria` ()
	BEGIN
		SELECT * FROM tb_produto AS P INNER JOIN tb_categoria AS C
								WHERE P.categoria_id = C.id;
	END//

DELIMITER ;


DELIMITER //
CREATE PROCEDURE `selectProdutoPorCategoria` (categoria varchar(50))
	BEGIN
		SELECT C.nome, C.categoria, P.nome_produto, P.preco, P.descricao
			FROM tb_produto AS P INNER JOIN tb_categoria AS C
								WHERE P.categoria_id = C.id
                                AND C.categoria = categoria;
	END//

DELIMITER ;
*/