drop table if exists orders;
drop table if exists studies;

create table studies (id bigint not null auto_increment, name varchar(255), primary key (id));
create table orders (id bigint not null auto_increment, created_at datetime, name varchar(255), study_id bigint, primary key (id));
alter table orders add constraint FK_astys1dv61mdlp0n0wx0574r2 foreign key (study_id) references studies (id);

