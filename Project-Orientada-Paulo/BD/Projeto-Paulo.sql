CREATE DATABASE sistema;

USE sistema;

CREATE TABLE Produto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    quantidade INT NOT NULL,
    preco DOUBLE NOT NULL
);

CREATE TABLE Venda (
    id INT AUTO_INCREMENT PRIMARY KEY,
    data DATE NOT NULL,
    valorTotal DOUBLE NOT NULL
);

CREATE TABLE Fornecedor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    contato VARCHAR(255)
);

SHOW TABLES;

INSERT INTO Produto (nome, quantidade, preco) VALUES ('Produto A', 10, 25.50);
INSERT INTO Venda (data, valorTotal) VALUES ('2024-11-24', 100.00);
INSERT INTO Fornecedor (nome, contato) VALUES ('Fornecedor X', '1234-5678');

SELECT * FROM Produto;
SELECT * FROM Venda;
SELECT * FROM Fornecedor;
