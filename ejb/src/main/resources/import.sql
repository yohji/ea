--
--  	Copyright (c) 2013 Marco Merli <yohji@marcomerli.net>
--
--  	This program is free software; you can redistribute it and/or modify
--  	it under the terms of the GNU General Public License as published by
--  	the Free Software Foundation; either version 2 of the License, or
--  	(at your option) any later version.
--
--  	This program is distributed in the hope that it will be useful,
--  	but WITHOUT ANY WARRANTY; without even the implied warranty of
--  	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
--  	GNU General Public License for more details.
--
--  	You should have received a copy of the GNU General Public License
--		along with this program; if not, write to the Free Software Foundation,
--		Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
--

INSERT INTO SEASON (id,year,rounds) VALUES (0,2013,12);

INSERT INTO TEAM (id,name) VALUES (0,'Infiniti Red Bull Racing');
INSERT INTO TEAM (id,name) VALUES (1,'Scuderia Ferrari');
INSERT INTO TEAM (id,name) VALUES (2,'Vodafone McLaren Mercedes');
INSERT INTO TEAM (id,name) VALUES (3,'Lotus F1 Team');
INSERT INTO TEAM (id,name) VALUES (4,'Mercedes AMG Petronas F1 Team');
INSERT INTO TEAM (id,name) VALUES (5,'Sauber F1 Team');
INSERT INTO TEAM (id,name) VALUES (6,'Sahara Force India F1 Team');
INSERT INTO TEAM (id,name) VALUES (7,'Williams F1 Team');
INSERT INTO TEAM (id,name) VALUES (8,'Scuderia Toro Rosso');
INSERT INTO TEAM (id,name) VALUES (9,'Caterham F1 Team');
INSERT INTO TEAM (id,name) VALUES (10,'Marussia F1 Team');

INSERT INTO CAR (id,constructor,engine,chassis) VALUES (0,'Red Bull','Renault','RB9');
INSERT INTO CAR (id,constructor,engine,chassis) VALUES (1,'Ferrari','Ferrari','F138');
INSERT INTO CAR (id,constructor,engine,chassis) VALUES (2,'McLaren','Mercedes','MP4-28');
INSERT INTO CAR (id,constructor,engine,chassis) VALUES (3,'Lotus','Renault','E21');
INSERT INTO CAR (id,constructor,engine,chassis) VALUES (4,'Mercedes','Mercedes','F1 W04');
INSERT INTO CAR (id,constructor,engine,chassis) VALUES (5,'Sauber','Ferrari','C32');
INSERT INTO CAR (id,constructor,engine,chassis) VALUES (6,'Force India','Mercedes','VJM06');
INSERT INTO CAR (id,constructor,engine,chassis) VALUES (7,'Williams','Renault','FW35');
INSERT INTO CAR (id,constructor,engine,chassis) VALUES (8,'Toro Rosso','Ferrari','STR8');
INSERT INTO CAR (id,constructor,engine,chassis) VALUES (9,'Caterham','Renault','CT03');
INSERT INTO CAR (id,constructor,engine,chassis) VALUES (10,'Marussia','Cosworth','MR02');

INSERT INTO PILOT (id,name,surname) VALUES (0,'Sebastian','Vettel');
INSERT INTO PILOT (id,name,surname) VALUES (1,'Mark','Webber');
INSERT INTO PILOT (id,name,surname) VALUES (2,'Fernando','Alonso');
INSERT INTO PILOT (id,name,surname) VALUES (3,'Felipe','Massa');
INSERT INTO PILOT (id,name,surname) VALUES (4,'Jenson','Button');
INSERT INTO PILOT (id,name,surname) VALUES (5,'Sergio','Pérez');
INSERT INTO PILOT (id,name,surname) VALUES (6,'Kimi','Räikkönen');
INSERT INTO PILOT (id,name,surname) VALUES (7,'Romain','Grosjean');
INSERT INTO PILOT (id,name,surname) VALUES (8,'Nico','Rosberg');
INSERT INTO PILOT (id,name,surname) VALUES (9,'Lewis','Hamilton');
INSERT INTO PILOT (id,name,surname) VALUES (10,'Nico','Hülkenberg');
INSERT INTO PILOT (id,name,surname) VALUES (11,'Esteban','Gutiérrez');
INSERT INTO PILOT (id,name,surname) VALUES (12,'Paul','Di Resta');
INSERT INTO PILOT (id,name,surname) VALUES (13,'Adrian','Sutil');
INSERT INTO PILOT (id,name,surname) VALUES (14,'Pastor','Maldonado');
INSERT INTO PILOT (id,name,surname) VALUES (15,'Valtteri','Bottas');
INSERT INTO PILOT (id,name,surname) VALUES (16,'Jean-Éric','Vergne');
INSERT INTO PILOT (id,name,surname) VALUES (17,'Daniel','Ricciardo');
INSERT INTO PILOT (id,name,surname) VALUES (18,'Charles','Pic');
INSERT INTO PILOT (id,name,surname) VALUES (19,'Giedo','Van der Garde');
INSERT INTO PILOT (id,name,surname) VALUES (20,'Jules','Bianchi');
INSERT INTO PILOT (id,name,surname) VALUES (21,'Max','Chilton');

INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (0,0,0,0,0,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (1,1,1,0,0,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (2,2,2,1,1,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (3,3,3,1,1,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (4,4,4,2,2,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (5,5,5,2,2,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (6,6,6,3,3,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (7,7,7,3,3,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (8,8,8,4,4,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (9,9,9,4,4,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (10,10,10,5,5,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (11,11,11,5,5,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (12,12,12,6,6,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (13,13,13,6,6,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (14,14,14,7,7,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (15,15,15,7,7,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (16,16,16,8,8,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (17,17,17,8,8,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (18,18,18,9,9,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (19,19,19,9,9,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (20,20,20,10,10,0);
INSERT INTO PARTICIPATION (id,number,pilot_id,car_id,team_id,season_id) VALUES (21,21,21,10,10,0);
