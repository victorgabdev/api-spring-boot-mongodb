# API Fake Twitter


## Índice


- [Sobre](#sobre)
- [Tecnologias Usadas](#tecnologias-usadas)
- [Instância de Domínio](#instância-de-domínio)
- [JSON](#json)

## Sobre


O objetivo desta API é criar um software que funcione como um fake
backend do Twitter. Nesse app, um **Usuário** pode criar vários **Posts**
que também pode receber vários **Comentários**. A API foi criada utilizando
o padrão de arquitetura de software *MVC*.

## Tecnologias Usadas


- [Java 17](https://docs.oracle.com/en/java/javase/17/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Sprint Data MongoDB](https://spring.io/projects/spring-data-mongodb)
- [Git e Github](https://git-scm.com/doc)

## Instância de Domínio

![dominioFakeTwitter](https://github.com/victorgabdev/api-spring-boot-mongodb/assets/75862737/0314bd25-39aa-4373-89dc-330fe270a00f)

## JSON

Exemplo de saída JSON da API:

```
    {
        "id": "1001",
        "name": "Maria Brown",
        "email": "maria@gmail.com",
        "posts": [
                {
                    "date": "2018-03-21",
                    "title": "Partiu viagem",
                    "body": "Vou viajar para São Paulo. Abraços!",
                    "comments": [
                                {      
                                    "text": "Boa viagem mano!",
                                    "date": "2018-03-21",
                                    "author": {
                                        "id": "1013",
                                        "name": "Alex Green"
                                    }
                                },
                                {
                                    "text": "Aproveite!",
                                    "date": "2018-03-22",
                                    "author": {
                                        "id": "1027",
                                        "name": "Bob Grey"
                                    }
                                }
                    ]
                },
                {
                    "date": "2018-03-23",
                    "title": "Bom dia",
                    "body": "Acordei feliz hoje!",
                    "comments": [
                            {
                                "text": "Tenha um ótimo dia!",
                                "date": "2018-03-23",
                                "author": {
                                    "id": "1013",
                                    "name": "Alex Green"
                                }
                            }
                    ]
                }
        ]
    }
```
