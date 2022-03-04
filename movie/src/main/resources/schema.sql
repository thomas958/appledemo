CREATE TABLE t_movies(
	movieId DECIMAL not null primary key,
	title char(2000),
	genres char(3000)
);

CREATE TABLE t_links(
	movieId DECIMAL not null primary key,
	imdbid char(20),
	tmdbid char(20)
);

CREATE TABLE t_ratings(
	userid char(20),
	movieid DECIMAL,
	rating char(20),
	timestamp DECIMAL,
	constraint PK_RATING primary key(userid,movieid)
);

CREATE TABLE t_tags(
	userid char(20),
	movieid DECIMAL,
	tag char(2000),
	timestamp DECIMAL,
	constraint PK_TAG primary key(userid,movieid,tag)
);