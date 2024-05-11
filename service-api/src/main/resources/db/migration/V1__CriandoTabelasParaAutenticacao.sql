CREATE TABLE usuario (
  id INT NOT NULL,
   `role` INT NOT NULL,
   username VARCHAR(255) NOT NULL,
   password VARCHAR(255) NOT NULL,
   CONSTRAINT pk_usuario PRIMARY KEY (id)
);

CREATE TABLE permissao (
  id INT NOT NULL,
   id_username INT NOT NULL,
   nome VARCHAR(255) NOT NULL,
   descricao VARCHAR(255) NOT NULL,
   CONSTRAINT pk_permissao PRIMARY KEY (id)
);
CREATE TABLE `role` (
  id INT NOT NULL,
   nome VARCHAR(255) NOT NULL,
   CONSTRAINT pk_role PRIMARY KEY (id)
);