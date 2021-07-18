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
    id_family bigint not null,
    id_user   bigint not null,
    constraint FK8a1hi8a8jpwywtiu1gk0jb0tu
        foreign key (id_user) references families (id),
    constraint FKk6v29rauw3tmqglbhan2vs5ar
        foreign key (id_family) references users (id)
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