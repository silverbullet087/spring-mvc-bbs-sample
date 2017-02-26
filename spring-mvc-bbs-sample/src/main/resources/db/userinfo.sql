drop table userinfo;
create table userinfo(  userid varchar2(100) primary key,
						password varchar2(100) not null,
						name varchar2(200) not null,
						email varchar2(300) not null);
select * from userinfo;
commit;