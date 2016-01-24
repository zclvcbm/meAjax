CREATE TABLE joke(
	joke_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	title VARCHAR(200) DEFAULT "",
	content TEXT,
	stamps VARCHAR(200),
	likes INT UNSIGNED DEFAULT 0,
	dislike INT UNSIGNED DEFAULT 0,
	url VARCHAR(200) DEFAULT "",
	PRIMARY KEY (joke_id)
)ENGINE=InnoDB, CHARSET=UTF8;