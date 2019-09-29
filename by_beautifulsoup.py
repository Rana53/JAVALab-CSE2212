from bs4 import BeautifulSoup
import requests

with requests.Session() as s:
	url = "http://quotes.toscrape.com/tag/love/";
	res = s.get(url);
	soup = BeautifulSoup(res.content, 'html.parser');

	quotes = soup.find_all('div', class_ = 'quote');

	for i in range(0, 3):
		text = quotes[i].find('span', class_ = 'text').text;
		author = quotes[i].find('small', class_ = 'author').text;
		print([text, author]);
		print('\n');
