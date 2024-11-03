## This is the db model

```sql 
create table sorravit.user
(
    id   int auto_increment
        primary key,
    name varchar(30) null,
    age  int         null
);

create index user_id_index
    on sorravit.user (id);
```
