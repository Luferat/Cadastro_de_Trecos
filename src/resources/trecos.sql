-- apaga a tabela caso exista
DROP TABLE IF EXISTS trecos;

-- Cria a tabela no banco de dados
CREATE TABLE "trecos" (
	"t_id"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	"t_date"	TEXT NOT NULL,
	"t_type"	TEXT NOT NULL,
	"t_name"	TEXT NOT NULL,
	"t_description"	TEXT NOT NULL,
	"t_status"	TEXT NOT NULL
);

-- Insere alguns dados "fake" para testes
INSERT INTO trecos ( t_id, t_date, t_type, t_name, t_description, t_status) VALUES (
    '1',
    '2023-01-10 14:12:00',
    'herbívoro',
    'Folha de amendoeira',
    'Uma folha de amendoeira seca, desidratada e faltando alguns pedaços.',
    'on'
);

INSERT INTO trecos (t_id, t_date, t_type, t_name, t_description, t_status) VALUES (
    '2',
    '2023-01-11 22:23:24',
    'carnívoro',
    'Osso de dino',
    'Dino enterrou um osso no quintal, achamos e acolhemos na coleção de trecos.',
    'on'
);

INSERT INTO trecos (t_id, t_date, t_type, t_name, t_description, t_status) VALUES (
    '3',
    '2023-01-12 13:14:15',
    'brinquedo',
    'Perna do Falcon',
    'Perna de boneco do Falcon de 1978 que está muito danificada e sem tinta. Também está mastigada pelo Dino.',
    'on'
);