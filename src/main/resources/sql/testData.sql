insert into FamilyTogether.families (id, designation) values (1, 'Kowalscy');
insert into FamilyTogether.families (id, designation) values (2, 'Jankowscy');
insert into FamilyTogether.families (id, designation) values (3, 'Nowak');

insert into FamilyTogether.users (id, birthday, email, first_name, last_name, password) values (1, '1994-06-17', 'jankowalski@test.pl', 'Jan', 'Kowalski', 'jankowalski@test.pl');
insert into FamilyTogether.users (id, birthday, email, first_name, last_name, password) values (2, '1980-01-12', 'edytakowalska@test.pl', 'Edyta', 'Kowalska', 'edytakowalska@test.pl');
insert into FamilyTogether.users (id, birthday, email, first_name, last_name, password) values (3, '1976-05-26', 'adamkowalski@test.pl', 'Adam', 'Kowalski', 'adamkowalski@test.pl');
insert into FamilyTogether.users (id, birthday, email, first_name, last_name, password) values (4, '1988-06-08', 'malgorzata@test.pl', 'Małgorzata', 'Kowalska-Jankowska', 'malgorzata@test.pl');
insert into FamilyTogether.users (id, birthday, email, first_name, last_name, password) values (5, '1958-09-11', 'tadeuszjankowski@test.pl', 'Tadeusz', 'Jankowski', 'tadeuszjankowski@test.pl');
insert into FamilyTogether.users (id, birthday, email, first_name, last_name, password) values (6, '1967-09-30', 'piotrnowak@test.pl', 'Piotr', 'Nowak', 'piotrnowak@test.pl');
insert into FamilyTogether.users (id, birthday, email, first_name, last_name, password) values (7, '1955-08-29', 'olganowak@test.pl', 'Olga', 'Nowak', 'olganowak@test.pl');
insert into FamilyTogether.users (id, birthday, email, first_name, last_name, password) values (8, '1999-08-11', 'katarzynanowak@test.pl', 'Katarzyna', 'Nowak', 'katarzynanowak@test.pl');

insert into FamilyTogether.user_family (user, family) values (1, 1);
insert into FamilyTogether.user_family (user, family) values (2, 1);
insert into FamilyTogether.user_family (user, family) values (3, 1);
insert into FamilyTogether.user_family (user, family) values (4, 1);
insert into FamilyTogether.user_family (user, family) values (4, 2);
insert into FamilyTogether.user_family (user, family) values (5, 2);
insert into FamilyTogether.user_family (user, family) values (6, 3);
insert into FamilyTogether.user_family (user, family) values (7, 3);
insert into FamilyTogether.user_family (user, family) values (8, 3);

insert into FamilyTogether.calendar (id, date, event, family_id, user_id) values (1, '1994-06-17', 'Urodziny', 1, 1);
insert into FamilyTogether.calendar (id, date, event, family_id, user_id) values (2, '1980-01-12', 'Urodziny', 1, 2);
insert into FamilyTogether.calendar (id, date, event, family_id, user_id) values (3, '1976-05-26', 'Urodziny', 1, 3);
insert into FamilyTogether.calendar (id, date, event, family_id, user_id) values (4, '1988-06-08', 'Urodziny', 1, 4);
insert into FamilyTogether.calendar (id, date, event, family_id, user_id) values (5, '1988-06-08', 'Urodziny', 2, 4);
insert into FamilyTogether.calendar (id, date, event, family_id, user_id) values (6, '1958-09-11', 'Urodziny', 2, 5);
insert into FamilyTogether.calendar (id, date, event, family_id, user_id) values (7, '1967-09-30', 'Urodziny', 3, 6);
insert into FamilyTogether.calendar (id, date, event, family_id, user_id) values (8, '1955-08-29', 'Urodziny', 3, 7);
insert into FamilyTogether.calendar (id, date, event, family_id, user_id) values (9, '1999-08-11', 'Urodziny', 3, 8);
insert into FamilyTogether.calendar (id, date, event, family_id, user_id) values (10, '2021-09-11', 'Chrzciny', 1, 4);
insert into FamilyTogether.calendar (id, date, event, family_id, user_id) values (11, '2021-09-11', 'Chrzciny', 2, 4);

insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (1, 'plecak', 'google.com', 1, 2);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (2, 'garnek', null, 1, 3);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (3, 'miotła', 'google.com', 1, null);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (4, 'telefon', 'google.com', 2, null);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (5, 'komputer', 'google.com', 2, 1);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (6, 'samochód', null, 2, 4);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (7, 'stolik', null, 3, 4);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (8, 'szczoteczka', 'google.com', 3, null);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (9, 'lampa', 'google.com', 3, null);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (10, 'klucze', 'google.com', 4, 5);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (11, 'woda', null, 4, 5);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (12, 'mieszkanie', null, 4, 1);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (13, 'sok', null, 5, 4);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (14, 'sztućce', null, 5, null);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (15, 'obraz', 'google.com', 5, null);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (16, 'radio', 'google.com', 6, 8);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (17, 'gps', 'google.com', 6, null);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (18, 'drzewko', null, 6, 7);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (19, 'hamak', null, 7, null);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (20, 'krzesło', null, 7, 6);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (21, 'talerze', 'google.com', 7, null);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (22, 'pościel', 'google.com', 8, 6);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (23, 'wycieczka', 'google.com', 8, 7);
insert into FamilyTogether.wishlists (id, i_want, link, user_id, who_will_buy_it_id) values (24, 'skok ze spadochronem', null, 8, null);


