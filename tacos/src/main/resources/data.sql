delete from Taco_Order_Tacos;
delete from Taco_Ingredients;
delete from Taco;
delete from Taco_Order;
delete from Ingredient;

insert into Ingredient (id, name, type)
values('FLTO', 'pszenna', 'WRAP');
insert into Ingredient (id, name, type)
values('COTO', 'kukurydziana', 'WRAP');
insert into Ingredient (id, name, type)
values('GRBF', 'mielona wolowina', 'PROTEIN');
insert into Ingredient (id, name, type)
values('CARN', 'kawalki miesa', 'PROTEIN');
insert into Ingredient (id, name, type)
values('TMTO', 'pomidory pokrojone w kostke', 'VEGGIES');
insert into Ingredient (id, name, type)
values('LETC', 'salata', 'VEGGIES');
insert into Ingredient (id, name, type)
values('CHED', 'cheddar', 'CHEESE');
insert into Ingredient (id, name, type)
values('JACK', 'Monterey Jack', 'CHEESE');
insert into Ingredient (id, name, type)
values('SLSA', 'smietana', 'SAUCE');
insert into Ingredient (id, name, type)
values('SRCR', 'pikantny sos', 'SAUCE');

----------------------------------------------

insert into Taco (id, name, createAt)
values(1, 'Mateusz', '2023-10-25 14:30:45');
insert into Taco (id, name, createAt)
values(2, 'Pawel', '2023-10-25 14:30:45');
insert into Taco (id, name, createAt)
values(3, 'Piotr', '2023-10-25 14:30:45');
insert into Taco (id, name, createAt)
values(4, 'Lukasz', '2023-10-25 14:30:45');
insert into Taco (id, name, createAt)
values(5, 'Tomek', '2023-10-25 14:30:45');
insert into Taco (id, name, createAt)
values(6, 'Jan', '2023-10-25 14:30:45');
insert into Taco (id, name, createAt)
values(7, 'Kamil', '2023-10-25 14:30:45');
insert into Taco (id, name, createAt)
values(8, 'Kuba', '2023-10-25 14:30:45');

-------------------------------------------------


insert into Taco_Ingredients (taco, ingredient)
values(2, 'SRCR');
insert into Taco_Ingredients (taco, ingredient)
values(6, 'CARN');
insert into Taco_Ingredients (taco, ingredient)
values(7, 'LETC');
insert into Taco_Ingredients (taco, ingredient)
values(1, 'FLTO');
insert into Taco_Ingredients (taco, ingredient)
values(4, 'JACK');


-------------------------------------------------
