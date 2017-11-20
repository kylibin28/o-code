drop table if exists departments;

CREATE TABLE users
(
  id_user integer NOT NULL,
  login character varying(255),
  password character varying(255),
  CONSTRAINT users_pkey PRIMARY KEY (id_user)
);

CREATE TABLE games
(
  id_game integer NOT NULL,
  end_date timestamp without time zone,
  start_date timestamp without time zone,
  id_user integer,
  CONSTRAINT games_pkey PRIMARY KEY (id_game),
  CONSTRAINT fkguo294udfd6498vj6j006mx66 FOREIGN KEY (id_user)
  REFERENCES users (id_user) MATCH SIMPLE
    ON UPDATE NO ACTION ON DELETE NO ACTION
)
