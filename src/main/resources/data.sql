-- Insertamos 3 películas de prueba en la tabla general de CONTENIDO
INSERT INTO contenido (id_contenido, titulo, descripcion, url_poster, tipo) 
VALUES (1, 'Interstellar', 'Un equipo de exploradores viaja a través de un agujero de gusano en el espacio.', 'https://image.tmdb.org/t/p/w500/gEU2QniE6E77NI6lCU6MxlNBvIx.jpg', 'PELICULA');

INSERT INTO contenido (id_contenido, titulo, descripcion, url_poster, tipo) 
VALUES (2, 'The Matrix', 'Un hacker descubre la verdadera naturaleza de su realidad y su papel en la guerra contra sus controladores.', 'https://image.tmdb.org/t/p/w500/f89U3ADr1oiB1s9GkdPOEpXUk5H.jpg', 'PELICULA');

INSERT INTO contenido (id_contenido, titulo, descripcion, url_poster, tipo) 
VALUES (3, 'El Padrino', 'El patriarca envejecido de una dinastía del crimen organizado transfiere el control a su hijo.', 'https://image.tmdb.org/t/p/w500/rPdtLWNsZmAtoZl9PK7S2wE3qiS.jpg', 'PELICULA');

-- Vinculamos esas 3 películas con sus detalles de video y duración en la tabla PELICULA
INSERT INTO pelicula (id_contenido, duracion_minutos, url_video) 
VALUES (1, 169, 'http://ejemplo.com/video-interstellar.mp4');

INSERT INTO pelicula (id_contenido, duracion_minutos, url_video) 
VALUES (2, 136, 'http://ejemplo.com/video-matrix.mp4');

INSERT INTO pelicula (id_contenido, duracion_minutos, url_video) 
VALUES (3, 175, 'http://ejemplo.com/video-padrino.mp4');
