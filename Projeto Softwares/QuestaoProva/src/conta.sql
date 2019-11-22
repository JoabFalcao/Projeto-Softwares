CREATE TABLE Cliente (
ID_Cliente INTEGER primary key,
Nome varchar(100),
Email varchar(100),
TelPessoa int,
Verificar char boolean
);

CREATE TABLE UsuarioComum (
Nome varchar(100)
);

CREATE TABLE ContaDoCliente (
NumeroConta INTEGER primary key,
Senha int,
Situacao boolean
)

CREATE TABLE AutorDeSoftware (
NomeDoAutor varchar(100),
CPF varchar(9),
TitutoDaObra varchar(100)
)

CREATE TABLE Software (
TipoSoft boolean,
NomeSoft boolean,
DescricaoSoft boolean
)

select * from conta