-- 1 Nisan 2007 tarihten sonra ödeme yapan müşterileri listeleyen bir sorgu yazınız.
SELECT p.payment_id, c.customer_id,
	c.first_name as musteri_adi, c.last_name as musteri_soyadi,
	p.payment_date as odeme_tarihi
	from payment as p
	INNER JOIN customer as c
	ON p.customer_id = c.customer_id
	WHERE p.payment_date > '2007-04-1';

--Aksiyon ve Animasyon kategorisindeki filmlerin çıkış tarihlerini, başlığını ve kategorisini listeleyen bir sorgu yazınız.
SELECT 
	film.title as Baslik,
	category.name as Kategori,
	film.release_year as Cikis_Tarihi
	from film_category as fc
	INNER JOIN film
	ON fc.film_id = film.film_id
	INNER JOIN category
	ON fc.category_id = category.category_id
	WHERE category.name LIKE 'Action' or category.name LIKE 'Animation';


--Film kiralama ödemesini en yakın tarihte yapan müşterilerin adı, soyadını ve ödeme tarihini listeleyen bir sorgu yazınız.
Select 
	c.first_name as Musteri_Adi,
	c.last_name as Musteri_Soyadi,
	p.payment_date as Odeme_Tarihi
	from payment as p
	INNER JOIN customer as c
	ON p.customer_id = c.customer_id
	ORDER BY p.payment_date DESC
	LIMIT 100;
	

--P ve P'den sonraki harflerle başlayan ve stokta bulunmayan filmleri listeleyen bir sorgu yazınız.
SELECT * from film 
	LEFT JOIN inventory
	ON film.film_id = inventory.film_id
	WHERE inventory.film_id is NULL and film.title ~* '^(p|q|r|s|t|u|v|w|x|y|z).*';


--B harfi ile başlayan müşterileri, film kiralamak için ödedikleri toplam miktarları ile birlikte listeleyen bir sorgu yazınız.
SELECT c.first_name || ' ' || c.last_name as Musteri,
	SUM(p.amount) as Toplam_Miktar
	FROM payment as p
	INNER JOIN customer as c
	ON p.customer_id = c.customer_id
	GROUP BY c.first_name, c.last_name
	HAVING c.first_name LIKE 'B%';
