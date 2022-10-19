INSERT INTO users (username, password, enabled) values ('user', '$2a$10$8.UnVuG9HHgffUDAlk8qfOuVGkqRzgVymGe07xd00DMxs.AQubh4a', true);

INSERT INTO authorities (username, authority) values ('user', 'ROLE_USER');

insert into users(username, password, enabled) values('admin', '$2a$10$CXelaqpcOhzdOjEmSy9IG.cT4Ge.96fvQ/dvcilTxlidzTKSV7zxi', true);
insert into authorities values('admin', 'ROLE_ADMIN');
