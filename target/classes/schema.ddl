
    create table Person (
        DTYPE varchar(31) not null,
        id bytea not null,
        first_name varchar(255),
        surname varchar(255),
        doctor_id varchar(255),
        primary key (id)
    );
