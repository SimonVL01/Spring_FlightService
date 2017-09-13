insert into passenger(id, firstname, lastname, frequent_flyer_miles) values(1000, 'Simon', 'Vanleeuw', 50);
insert into passenger(id, firstname, lastname, frequent_flyer_miles) values(2000, 'Elijah', 'Ballard', 50);
insert into passenger(id, firstname, lastname, frequent_flyer_miles) values(3000, 'Ennoia', 'Ballard', 50);
insert into passenger(id, firstname, lastname, frequent_flyer_miles) values(4000, 'Chrono', 'Trigger', 50);
insert into passenger(id, firstname, lastname, frequent_flyer_miles) values(5000, 'Christopher', 'Nolan', 50);
insert into passenger(id, firstname, lastname, frequent_flyer_miles) values(6000, 'Abraham', 'Lincoln', 150);
insert into passenger(id, firstname, lastname, frequent_flyer_miles) values(7000, 'Elon', 'Musk', 175);

insert into flight(id, number, departure, destination) values(1000, 'FL3.456', 'Brussels-Airport', 'Italy');
insert into flight(id, number, departure, destination) values(2000, 'FL3.458', 'Brussels-Airport', 'Italy');
insert into flight(id, number, departure, destination) values(3000, 'FL3.460', 'Brussels-Airport', 'Italy');
insert into flight(id, number, departure, destination) values(4000, 'FL3.462', 'Brussels-Airport', 'Italy');
insert into flight(id, number, departure, destination) values(5000, 'FL3.464', 'Brussels-Airport', 'Italy');
insert into flight(id, number, departure, destination) values(6000, 'FL3.568', 'California Airlines', 'New York');
insert into flight(id, number, departure, destination) values(7000, 'FL3.621', 'Earth', 'Mars');

insert into ticket(id, price, flight_id, passenger_id) values(1000, 147.5, 1000, 1000);
insert into ticket(id, price, flight_id, passenger_id) values(2000, 154.5, 2000, 2000);
insert into ticket(id, price, flight_id, passenger_id) values(3000, 165.5, 3000, 3000);
insert into ticket(id, price, flight_id, passenger_id) values(4000, 179.5, 4000, 4000);
insert into ticket(id, price, flight_id, passenger_id) values(5000, 120.5, 5000, 5000);
insert into ticket(id, price, flight_id, passenger_id) values(6000, 132.6, 6000, 6000);
insert into ticket(id, price, flight_id, passenger_id) values(7000, 3000000, 7000, 7000);