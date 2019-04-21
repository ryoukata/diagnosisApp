create table checks {
    id      bigint auto_increment primary key not null,
    name    varchar(255) not null,
    result  varchar(255) not null,
    created timestamp not null default current_timestamp,
    modified timestamp not null default current_timestamp
};