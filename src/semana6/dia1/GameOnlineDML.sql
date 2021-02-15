USE db_generation_game_online;

/*
CALL addClasse('Mago', 'distancia');
CALL addClasse('Arqueiro', 'distancia');
CALL addClasse('Atirador', 'distancia');
CALL addClasse('Espadachin', 'perto');
CALL addClasse('assassino', 'perto');


CALL addPersonagem('Mago fracote', 1, 10, 2, 8);
CALL addPersonagem('Mago apelão', 8001, 2500, 20, 8);
CALL addPersonagem('Arqueiro fracote', 1, 10, 2, 9);
CALL addPersonagem('Arqueiro apelão', 8001, 2500, 20, 9);
CALL addPersonagem('Atirador fracote', 1, 10, 2, 10);
CALL addPersonagem('Atirador apelão', 8001, 2500, 20, 10);
CALL addPersonagem('Espadachin fracote', 1, 10, 2, 11);
CALL addPersonagem('Espadachin apelão', 8001, 2500, 20, 11);
CALL addPersonagem('Assassino fracote', 1, 10, 2, 12);
CALL addPersonagem('Assassino apelão', 8001, 2500, 20, 12);



 -- CALL selectPoderAtaque(2000);
 
 CALL addPersonagem('Assassino apelão 2', 8001, 2500, 30, 12);
 CALL addPersonagem('Assassino apelão 3', 8001, 2500, 31, 12);
 CALL selectPoderDefesa(19, 31)
 
 */
 -- SELECT * FROM tb_personagem WHERE tb_personagem.nome LIKE 'A%';
 
-- CALL selectPersonagemPorIdClasse(9);

CALL PersonagemJoinClasse();
 