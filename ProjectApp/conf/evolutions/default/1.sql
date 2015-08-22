# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table accessUser (
  id                        bigint auto_increment not null,
  userName                  varchar(10) not null,
  password                  varchar(10) not null,
  constraint pk_accessUser primary key (id))
;

create table message (
  id                        bigint auto_increment not null,
  userId                    bigint,
  projectId                 bigint,
  taskId                    bigint,
  content                   varchar(255),
  create_date               datetime,
  constraint pk_message primary key (id))
;

create table project (
  id                        bigint auto_increment not null,
  userId                    bigint,
  projectName               varchar(20) not null,
  deadlineDate              datetime,
  create_date               datetime,
  constraint pk_project primary key (id))
;

create table task (
  id                        bigint auto_increment not null,
  projectId                 bigint,
  userId                    bigint,
  projectName               varchar(20) not null,
  deadlineDate              datetime,
  create_date               datetime,
  constraint pk_task primary key (id))
;

alter table message add constraint fk_message_accessUser_1 foreign key (userId) references accessUser (id) on delete restrict on update restrict;
create index ix_message_accessUser_1 on message (userId);
alter table message add constraint fk_message_project_2 foreign key (projectId) references project (id) on delete restrict on update restrict;
create index ix_message_project_2 on message (projectId);
alter table message add constraint fk_message_task_3 foreign key (taskId) references task (id) on delete restrict on update restrict;
create index ix_message_task_3 on message (taskId);
alter table project add constraint fk_project_accessUser_4 foreign key (userId) references accessUser (id) on delete restrict on update restrict;
create index ix_project_accessUser_4 on project (userId);
alter table task add constraint fk_task_project_5 foreign key (projectId) references project (id) on delete restrict on update restrict;
create index ix_task_project_5 on task (projectId);
alter table task add constraint fk_task_accessUser_6 foreign key (userId) references accessUser (id) on delete restrict on update restrict;
create index ix_task_accessUser_6 on task (userId);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table accessUser;

drop table message;

drop table project;

drop table task;

SET FOREIGN_KEY_CHECKS=1;

