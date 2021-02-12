-- create database ecommerceGB;

use ecommercegb;

CREATE TABLE produto(
 id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
 nome_produto varchar(50) not null,
 fabricante varchar(50) not null,
 preco FLOAT NOT NULL,
 marca varchar(50) not null,
 tipo varchar(50) not null
 );
 
 DELIMITER //
CREATE PROCEDURE `addProduto` ( `nome_prod` varchar(50), `fab_prod` varchar(50), 
					`preco_prod` varchar(50), `marca_prod` varchar(50), `tipo_prod`varchar(50))
	BEGIN
		DECLARE countProd int;
		DECLARE contCadastrados int;
		SELECT COUNT(*) INTO contCadastrados FROM produto;
		IF contCadastrados > 0 THEN
			SELECT (MAX(id) + 1) INTO countProd FROM produto;
		ELSE 
			SET countProd = 1;
		END IF;
		INSERT INTO produto (id, nome_produto, fabricante, preco, marca, tipo)
		VALUES (countProd, nome_prod, fab_prod, preco_prod, marca_prod, tipo_prod);
	END//

DELIMITER ;

call addProduto('produto1', 'fabricante1', 1000, 'marca1', 'tipo1');


call addProduto('produto2', 'fabricante2', 1000, 'marca2', 'tipo2');
call addProduto('produto3', 'fabricante3', 100, 'marca3', 'tipo3');
call addProduto('produto4', 'fabricante4', 2000, 'marca4', 'tipo4');
call addProduto('produto5', 'fabricante5', 200, 'marca5', 'tipo5');
call addProduto('produto6', 'fabricante6', 3000, 'marca6', 'tipo6');
call addProduto('produto7', 'fabricante7', 300, 'marca7', 'tipo7');
call addProduto('produto8', 'fabricante8', 400, 'marca8', 'tipo8');
call addProduto('produto9', 'fabricante9', 4000, 'marca9', 'tipo9');
call addProduto('produto10', 'fabricante10', 1000, 'marca10', 'tipo10');


 
 SELECT * FROM produto WHERE produto.preco > 500;
  SELECT * FROM produto WHERE produto.preco < 500;

UPDATE ecommercegb.produto
set marca = "Crefisa"
WHERE id = 5;