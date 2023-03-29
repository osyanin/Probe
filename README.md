
Установка openjdk-java8, Ubuntu:

`sudo apt update`

`sudo apt install openjdk-8-jdk`

`sudo update-alternatives --config java`

Донастроить локали:

`apt-get install --reinstall locales && sudo dpkg-reconfigure locales`

`dpkg-reconfigure locales`

Команда строится по принципу: 

`./gradlew` запускает тесты, вытягивая актуальные изменения из репозитория. Дополнительные команды выполняются на текущей версии.

`./gradlew clean test --tests api.*` запускает тесты в пакете api

`./gradlew clean test --tests api.Errors` запускает все тесты в классе Errors пакета api.

`./gradlew clean test --tests api.Errors.signatureWrong` запускает конкретный тест из пакета api и класса Errors

`./gradlew clean test --tests *.Errors` запускает все тесты Errors из всех пакетов.

`./gradlew clean test --tests api.*` запускает все тесты из пакета api


Конфиги окружений лежат в папке conf в корне проекта.

Посмотреть-изменить можно в - `gradle.properties`

После прогона тестов сгенерируется отчет:`./build/reports/allure-reports/index.html`

Выполненная команда покажет, где лежит отчет. 
Открывать отчет локально лучше через Firefox. 
