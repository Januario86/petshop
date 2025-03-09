-- Criar Tabela Cliente
CREATE TABLE cliente (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(14) UNIQUE NOT NULL,
    data_cadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Criar Tabela Endereco
CREATE TABLE endereco (
    id SERIAL PRIMARY KEY,
    cliente_id INT REFERENCES cliente(id) ON DELETE CASCADE,
    logradouro VARCHAR(255) NOT NULL,
    cidade VARCHAR(100) NOT NULL,
    bairro VARCHAR(100) NOT NULL,
    complemento VARCHAR(255),
    tag VARCHAR(50)
);

-- Criar Tabela Contato
CREATE TABLE contato (
    id SERIAL PRIMARY KEY,
    cliente_id INT REFERENCES cliente(id) ON DELETE CASCADE,
    tag VARCHAR(50),
    tipo VARCHAR(50) CHECK (tipo IN ('E-mail', 'Telefone')),
    valor VARCHAR(100) NOT NULL
);

-- Criar Tabela Raca
CREATE TABLE raca (
    id SERIAL PRIMARY KEY,
    descricao VARCHAR(100) NOT NULL
);

-- Criar Tabela Pet
CREATE TABLE pet (
    id SERIAL PRIMARY KEY,
    cliente_id INT REFERENCES cliente(id) ON DELETE CASCADE,
    raca_id INT REFERENCES raca(id) ON DELETE SET NULL,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE
);

-- Criar Tabela Atendimento
CREATE TABLE atendimento (
    id SERIAL PRIMARY KEY,
    pet_id INT REFERENCES pet(id) ON DELETE CASCADE,
    descricao TEXT NOT NULL,
    valor DECIMAL(10,2) NOT NULL,
    data TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Criar Tabela Usuario
CREATE TABLE usuario (
    cpf VARCHAR(14) PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    perfil VARCHAR(20) CHECK (perfil IN ('CLIENTE', 'ADMIN')) NOT NULL
);
