create table families
(
    id          bigint auto_increment
        primary key,
    designation varchar(255) not null
);

create table users
(
    id         bigint auto_increment
        primary key,
    birthday   date         not null,
    email      varchar(255) not null,
    first_name varchar(255) not null,
    last_name  varchar(255) not null,
    constraint UK_6dotkott2kjsp8vw4d0m25fb7
        unique (email)
);

create table calendar
(
    id        bigint auto_increment
        primary key,
    date      date         null,
    event     varchar(255) null,
    family_id bigint       null,
    user_id   bigint       null,
    constraint FK7lyt2gd8862h9hhn5ne38l51i
        foreign key (user_id) references users (id),
    constraint FKmndk7t6dwqyn9imtrsyo6cofq
        foreign key (family_id) references families (id)
);

create table user_family
(
    user   bigint not null,
    family bigint not null,
    constraint FK172gqk0yl1th4het9y45dq1pu
        foreign key (user) references users (id),
    constraint FKn4lwe1qc135g2ru56k06ioiuk
        foreign key (family) references families (id)
);

create table wishlists
(
    id                 bigint auto_increment
        primary key,
    i_want             varchar(255) null,
    link               varchar(255) null,
    sb_will_buy_it     bit          null,
    user_id            bigint       null,
    who_will_buy_it_id bigint       null,
    constraint FK330pyw2el06fn5g28ypyljt16
        foreign key (user_id) references users (id),
    constraint FKoswblj50tn5alax998y6e8sjc
        foreign key (who_will_buy_it_id) references users (id)
);

