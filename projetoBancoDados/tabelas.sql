---------------------------------
---------------------------------

ORDEM SERVIÇO

CREATE TABLE TB_ORDSERV (
    ID_ORDSERV INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    DATA_ORDSERV TIMESTAMP DEFAULT CURRENT_TIMESTAMP,  
    EQUIPAMENTO VARCHAR(200) NOT NULL,
    DEFEITO VARCHAR(200),
    SERVICO VARCHAR(200),
    TECNICO INTEGER NOT NULL,
    VALOR DECIMAL(10,2) NOT NULL,
    ID_CLIENTE INTEGER NOT NULL,
    NOME_CLIENTE VARCHAR(200),
    NOME_TECNICO VARCHAR(200),
    FINALIZADO VARCHAR(200),
    PRIMARY KEY (ID_ORDSERV),
    FOREIGN KEY (ID_CLIENTE) REFERENCES TB_CLIENTES(ID_CLIENTE),
    FOREIGN KEY (TECNICO) REFERENCES TB_USERS(ID_USER)
);

--------------------------------

--------------------------------

USUÁRIOS



CREATE TABLE TB_USERS (
    id_user integer not null generated always 
    as identity (start with 1, increment by 1),
    user_name varchar(50) not null,
    email varchar(50) not null unique,
    login varchar(50) not null unique,
    password varchar(10),
    PERFIL_USER VARCHAR(20);
    primary key (id_user)
);


-------------------------------------

-------------------------------------


CLIENTES



CREATE TABLE TB_CLIENTES (
    id_cliente integer not null generated always as identity (start with 1, increment by 1),
    nome_cliente varchar(50) not null,
    cep_cliente varchar(9) not null,
    endereco_cliente varchar(100),
    fone_cliente varchar(50) not null,
    email_cliente varchar(50),
    primary key (id_cliente)
);



-------------------------------------
-------------------------------------

