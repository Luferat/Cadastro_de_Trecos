-- Apaga as tabelas caso existam
DROP TABLE IF EXISTS tipos;
DROP TABLE IF EXISTS trecos;

CREATE TABLE "tipos" (
    tipoid INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    tiponame TEXT NOT NULL
);

-- Cria a tabela no banco de dados
CREATE TABLE "trecos" (
    "trecoid"           INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    "trecodate"         TEXT NOT NULL,
    "trecotype"         INTEGER NOT NULL,
    "treconame"         TEXT NOT NULL,
    "trecodescription"	TEXT NOT NULL,
    "trecostatus"	TEXT NOT NULL,
    FOREIGN KEY (trecotype) REFERENCES tipos(tipoid)
);

-- Insere alguns dados "fake" para testes

INSERT INTO tipos (tipoid, tiponame) VALUES
('1', 'Bagulho'),
('2', 'Bugiganga'),
('3', 'Brinquedo'),
('4', 'Carnívoro'),
('5', 'Herbíviro'),
('6', 'Tralha'),
('7', 'Eletrônico'),
('8', 'Conleção'),
('9', 'Bibelô'),
('10', 'Parafernalha');

INSERT INTO trecos ( trecoid, trecodate, trecotype, treconame, trecodescription, trecostatus) VALUES (
    '1',
    '2023-01-10 14:12:00',
    '5',
    'Folha de amendoeira',
    'Uma folha de amendoeira seca, desidratada e faltando alguns pedaços.',
    'on'
);

INSERT INTO trecos ( trecoid, trecodate, trecotype, treconame, trecodescription, trecostatus) VALUES (
    '2',
    '2023-01-11 22:23:24',
    '4',
    'Osso de dino',
    'Dino enterrou um osso no quintal, achamos e acolhemos na coleção de trecos.',
    'on'
);

INSERT INTO trecos ( trecoid, trecodate, trecotype, treconame, trecodescription, trecostatus) VALUES (
    '3',
    '2023-01-12 13:14:15',
    '3',
    'Perna do Falcon',
    'Perna de boneco do Falcon de 1978 que está muito danificada e sem tinta. Também está mastigada pelo Dino.',
    'on'
);
