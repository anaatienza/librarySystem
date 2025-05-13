drop database if exists library_system;
create database library_system;
use library_system;

create table if not exists Genre (
    id int auto_increment,
    name varchar(100) not null unique check (length(name)>2),
    primary key (id)
);

create table if not exists Book (
    id int auto_increment,
    isbn varchar(20) not null unique,
    title varchar(200) not null,
    genreId int,
    publicationDate int,
    totalCopies int not null ,
    author varchar(100) default 'Anonimo',
    editorial varchar(100),
    primary key(id),
    foreign key(genreId) references Genre(id),
    check (char_length(title)>2),
    check (totalCopies>0),
    check (char_length(author)>2)
);

create table if not exists Client (
    id int auto_increment,
    firstName varchar(100) not null,
    lastName varchar(100) not null,
    email varchar(150) not null unique,
    phoneNumber varchar(9) not null unique,
    birthDate date not null,
    primary key (id),
    check (char_length(firstName)>2),
    check (char_length(lastName)>2),
    check (email like '%_@__%.__%')
);

create table if not exists Loan (
    id int auto_increment,
    loanDate date not null,
    dueDate date not null,
    returnDate date,
    clientId int not null,
    bookId int not null,
    primary key (id),
    foreign key (clientId) references Client (id),
    foreign key (bookId) references Book (id),
    check (dueDate>loanDate),
    check (returnDate is null or returnDate>=loanDate)
);