# email-book

"Записная книжка" 

Команды:

  - ADD <email> : добавление новой записи;
  - LIST : просмотр всех записей.

Электронная почта проверяется с помощью регулярных выражений.
Данные хранятся в TreeSet<String>, что позволяет хранить уникальные элементы.   

Пример (жирным шрифтом выделен ввод пользователя):
  
  **ADD mail@mail.ru**
  
  **ADD hello@gmail.ru**
  
  **ADD hello@mail**
  
  **ADD hello@gmail.ru**
  
  **LIST**
  
  *hello@skillbox.ru*
  
  *mail@mail.ru*
  
