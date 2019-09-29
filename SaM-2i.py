from selenium import webdriver
from selenium.webdriver.support.select import Select

#chrome_option = webdriver.ChromeOptions();

browser = webdriver.Chrome("C:\\Program Files\\chromedriver_win32\\chromedriver.exe");

browser.set_page_load_timeout(5);

browser.maximize_window();

exam = "ssc";
year = "2012";
board = "rajshahi";
roll = "191276";
reg = "682703";

browser.get('http://www.educationboardresults.gov.bd/');

obj = Select(browser.find_element_by_id('exam'));
obj.select_by_value(exam);

obj = Select(browser.find_element_by_id('year'));
obj.select_by_value(year);

obj = Select(browser.find_element_by_id('board'));
obj.select_by_value(board);

element = browser.find_element_by_id('roll');
element.send_keys(roll);

element = browser.find_element_by_id('reg');
element.send_keys(reg);

element = browser.find_element_by_xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/form/table/tbody/tr/td[2]/fieldset/table/tbody/tr[7]/td[2]");

eq = element.text;

val = ord(eq[0]) + ord(eq[-1]) - 2*ord('0');

element = browser.find_element_by_id('value_s');
element.send_keys(val);

element = browser.find_element_by_name('button2');
element.click();

info = browser.find_element_by_xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody");

print(info.text);