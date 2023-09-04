# Сервис для получения fake данных

### Описание
Обеспечивает генерацию fake данных.
Используется в проекте [timesheet-accounting](https://github.com/4kin/timesheet-accounting)

### Описание

http://localhost:9898/random-person 

Генерирует fake персону 

```json
{
  "firstName": "Ситников",
  "secondName": "Виктор",
  "middleName": "Дмитриевич",
  "dateOfBirth": "1983-02-22",
  "personNumber": 199
}
```

http://localhost:9898/fake-ts 

Генерирует fake запись по учёту времени

```json
{
  "hours": 2,
  "types": "TRANSFER_ADD",
  "fileName": "eum_occaecati\\quisquam.gif",
  "notes": "Nemo labore odit",
  "date": "2021-10-29T04:36:44.537+00:00"
}
```


