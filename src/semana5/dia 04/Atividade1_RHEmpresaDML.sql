use empresaRh;

INSERT INTO empresarh() values(1);
INSERT INTO empresarh() values(2);

USE `empresarh`;
DROP procedure IF EXISTS `addEmpresaRH`;

DELIMITER $$
USE `empresarh`$$
CREATE PROCEDURE `addEmpresaRH` (`idEmpresaRH`int)
BEGIN
	INSERT INTO empresarh() values(idEmpresaRH);
END$$

DELIMITER ;
 call addEmpresaRH(3);

DELIMITER //
CREATE PROCEDURE `addFuncionario` ( `nomeFunc` varchar(45), `salarioFunc` varchar(45), 
					`rgFunc` varchar(45), `cpfFunc` varchar(45), `cargoFunc` varchar(45), 
                    `idEmpresaRH` int(10))
	BEGIN
		DECLARE countFunc int;
		DECLARE contCadastrados int;
		SELECT COUNT(*) INTO contCadastrados FROM funcionário;
		IF contCadastrados > 0 THEN
			SELECT (MAX(idFuncionário) + 1) INTO countFunc FROM funcionário;
		ELSE 
			SET countFunc = 1;
		END IF;
		INSERT INTO funcionário (idFuncionário, nome, salario, rg, cpf, cargo, EmpresaRH_idEmpresaRH)
		VALUES (countFunc, nomeFunc, salarioFunc, rgFunc, cpfFunc, cargoFunc, idEmpresaRH);
	END//addFuncionario

DELIMITER ;


ALTER TABLE `empresarh`.`funcionário` 
CHANGE COLUMN `salario` `salario` FLOAT NOT NULL ;


call  addFuncionario('Ishalá', 3400.20, 'rgJean', 'cpfJean', 'sumosacerdote', 1);
call  addFuncionario('Natacha a bilionária', 300000000, 'rgNatacha', 'cpfNatacha', 'dona de tudo', 1);
call  addFuncionario('Gabs o pensador', 1500, 'rgGabs', 'cpfGabs', 'Filósofa', 1);
call  addFuncionario('Karinedas finanças', 3500.99, 'rgKarine', 'cpfKarine', 'gerente itaú', 1);
call  addFuncionario('Bruna a apaixonada', 20000, 'rgBruna', 'cpfBruna', 'coach de relacionamento', 1);

SELECT * FROM funcionário WHERE funcionário.salario < 2000;
SELECT * FROM funcionário WHERE funcionário.salario > 2000;