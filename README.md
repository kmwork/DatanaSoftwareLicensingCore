#  Механизмы лицензирования


## Варианты кодов (Free)
https://www.license4j.com/features/
https://cryptolens.io/2019/01/protect-java-code-with-software-licensing/
(он же в github https://github.com/Cryptolens/license-server)


## Кратное описание

суть передставлена по ссылке
https://cryptolens.io/2019/01/protect-java-code-with-software-licensing/

имеем в коде механизмы проверки сертификата на базе ключей RSA  -  сертификат например стандарта X509

## сборка Maven 3 + OpenJDK 11 (или выше 11ой явы)
```
mvn clean compile package spring-boot:repackage 
```