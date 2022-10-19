/* Lógico v3: */

CREATE TABLE Usuario (
    Nome VARCHAR,
    Matricula INT PRIMARY KEY,
    Senha VARCHAR
);

CREATE TABLE Problema_Foto (
    Urgencia VARCHAR,
    Status VARCHAR,
    Local VARCHAR,
    Descricao VARCHAR,
    Objeto VARCHAR,
    Categoria VARCHAR,
    Img BLOB,
    PRIMARY KEY (Local, Objeto)
);

CREATE TABLE Enviou (
    fk_Usuario_Matricula INT,
    fk_Problema_Foto_Local VARCHAR,
    fk_Problema_Foto_Nome VARCHAR
);
 
ALTER TABLE Enviou ADD CONSTRAINT FK_Enviou_1
    FOREIGN KEY (fk_Usuario_Matricula)
    REFERENCES Usuario (Matricula)
    ON DELETE RESTRICT;
 
ALTER TABLE Enviou ADD CONSTRAINT FK_Enviou_2
    FOREIGN KEY (fk_Problema_Foto_Local, fk_Problema_Foto_Nome)
    REFERENCES Problema_Foto (Local, Objeto)
    ON DELETE SET NULL;