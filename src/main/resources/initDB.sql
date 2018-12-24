create table if not exists companies
(
  id          varchar      not null
    constraint companies_pk
    primary key,
  name        varchar(100) not null,
  description varchar(255),
  address     varchar(255) not null
);

create unique index if not exists companies_id_uindex
  on companies (id);

create table if not exists categories
(
  id   varchar      not null
    constraint categories_pkey
    primary key,
  name varchar(100) not null
);

create unique index if not exists categories_id_uindex
  on categories (id);

create table if not exists ads
(
  id          varchar      not null
    constraint ads_pkey
    primary key,
  name        varchar(100) not null,
  content     varchar(255) not null,
  phone_num   varchar(12)  not null,
  company_id  varchar
    constraint ads_companies_id_fk
    references companies,
  category_id varchar
    constraint ads_categories_id_fk
    references categories
);

create unique index if not exists ads_id_uindex
  on ads (id);

