CREATE SCHEMA fullstack_java_teste;

USE fullstack_java_teste;



CREATE TABLE fullstack_java_teste.aereo (
	id_aereo INT NOT NULL,
	cia_aerea VARCHAR(200) NULL,
	datahora_saida DATETIME NULL ,
	datahora_chegada DATETIME NULL ,
	cidade_origem VARCHAR(200) NULL ,
	cidade_destino VARCHAR(200) NULL,
	id_solicitacao INT NOT NULL,
	
    PRIMARY KEY(id_aereo),
	UNIQUE INDEX id_aereo_UNIQUE (id_aereo ASC)
);

CREATE TABLE fullstack_java_teste.passageiro(
	id_passageiro INT NOT NULL,
	nome VARCHAR(200) null,
	sobrenome VARCHAR(200) null,

	PRIMARY KEY (id_passageiro),
	UNIQUE INDEX id_passageiro_UNIQUE (id_passageiro ASC)
);

CREATE TABLE fullstack_java_teste.aereo_passageiro(
	id INT NOT NULL AUTO_INCREMENT,
	id_aereo INT NOT NULL,
	id_passageiro INT NOT NULL,
	
	PRIMARY KEY (id),
	FOREIGN KEY (id_aereo) REFERENCES fullstack_java_teste.aereo(id_aereo),
	FOREIGN KEY (id_passageiro) REFERENCES fullstack_java_teste.passageiro(id_passageiro)
);