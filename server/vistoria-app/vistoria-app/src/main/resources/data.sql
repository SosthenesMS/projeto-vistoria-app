INSERT INTO agenteVistoriador (nome, sobrenome, email, matricula) VALUES ('Vistoriador01', 'Vistoriador01', 'vistoria01@mdb.com', 'vit0001'),('Vistoriador02', 'Vistoriador02', 'vistoria02@mdb.com', 'vit0002');

INSERT INTO statusVistoria (descricao) VALUES ('Aprovado'),('Reprovado');

INSERT INTO vistoria (dataDaVistoria, motorista, cpf, turno, perfilDaCarga, perfilDoVeiculo, placaDoCavalo, placaDaCarreta, remessa, transportador, destinoDaCarga, observacoes, idAgenteVistoriador, idStatusVistoria) VALUES 
('2023-03-08', 'Motorista01', '11111111111', 'tarde', 'estivada', 'truck', 'klk0001', 'null', '0000000100', 'setag', 'Paulista', 'O motorista estava muito estressado!', 1, 1),
('2023-03-09', 'Motorista02', '22222222222', 'manha', 'estivada', 'carreta', 'klk0002', 'jlb4543', '0000000200', 'setag', 'Natal', 'Motorista esperando por mais de 10 hrs!', 2, 1),
('2023-03-12', 'Motorista03', '33333333333', 'tarde', 'estivada', '3x4', 'ftr0003', 'null', '0000000300', 'setag', 'Recife', 'Sem observacoes', 1, 1),
('2023-03-12', 'Motorista04', '44444444444', 'noite', 'estivada', '3x4', 'ftr0004', 'null', '0000000400', 'setag', 'Recife', 'Sem observacoes', 1, 1),
('2023-03-12', 'Motorista05', '55555555555', 'tarde', 'estivada', 'carreta', 'ftr0005', 'jlb4522', '0000000500', 'setag', 'Recife', 'Sem observacoes', 2, 2),
('2023-03-12', 'Motorista06', '66666666666', 'noite', 'estivada', '3x4', 'ftr0006', 'null', '0000000600', 'setag', 'Recife', 'Sem observacoes', 2, 2),
('2023-03-12', 'Motorista07', '77777777777', 'tarde', 'estivada', 'carreta', 'ftr0007', 'jlb4555', '0000000700', 'setag', 'Recife', 'Sem observacoes', 1, 2),
('2023-03-15', 'Motorista08', '88888888888', 'tarde', 'estivada', '3x4', 'ftr0008', 'null', '0000000800', 'setag', 'jaboatao', 'Sem observacoes', 1, 2);