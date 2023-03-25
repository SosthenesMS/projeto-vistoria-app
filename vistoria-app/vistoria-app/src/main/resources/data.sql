INSERT INTO agenteVistoriador (nome, sobrenome, email, matricula) VALUES ('Vinicius', 'Rodrigues', 'vini@mdb.com', 'vit0001'),('Fernando', 'Henrrique', 'feu@mdb.com', 'vit0002');

INSERT INTO statusVistoria (descricao) VALUES ('Aprovado'),('Reprovado');

INSERT INTO vistoria (dataDaVistoria, motorista, cpf, turno, perfilDaCarga, perfilDoVeiculo, placaDoCavalo, placaDaCarreta, remessa, transportador, destinoDaCarga, observacoes, idAgenteVistoriador, idStatusVistoria) VALUES 
('2023-03-08', 'Adriano', '12345678', 'tarde', 'estivada', 'truck', 'klk3515', 'null', '000152677', 'setag', 'Paulista', 'O motorista estava muito estressado!', 1, 1),
('2023-03-08', 'Mateus', '1111111111', 'tarde', 'estivada', 'carreta', 'klk3515', 'jlb4543', '000152677', 'setag', 'Natal', 'Motorista esperando por mais de 10 hrs!', 2, 1),
('2023-03-08', 'Silvio', '2222222222', 'tarde', 'estivada', '3x4', 'ftr3453', 'null', '000152677', 'setag', 'Natal', 'Sem observacoes', 1, 2);