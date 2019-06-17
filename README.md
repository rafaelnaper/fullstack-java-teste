# Consulta de Solicitações de Viagem

Aplicação JEE 7 com arquitetura componentizada, sendo o componente **consulta-viagem-ws** responsável por consumir o web service de consulta de viagens da Lemontech, apresentar as informações de Aéreo em uma página web e enviar essas informações para uma fila para que o módulo **persiste-viagem-db** possa salva-las no banco de dados a qualquer momento, independente do serviço de consulta estar no ar ou não.

# Arquitetura utilizada no Sistema

A aplicação foi desenvolvida seguindo a especificação JEE 7 afim de nos beneficiar de seus recursos oferecidos, sendo eles :

* Fácil configuração e utilização de Mensageria (JMS)
* Facilidades do CDI

Para hospedar a aplicação foi utilizado o servidor **WildFly**, para que fosse possível se beneficiar de um ambiente transacional totalmente gerenciado pelo servidor e também na facilidade de utilização do middleware de mensageria **HornetQ** que está embutido nele.

### Tecnologias

* JDK 8
* JEE 7
* CDI 1.2
* JTA 1.3
* JPA 2.1
* JSF 2.2
* MAVEN 3.6
* JUNIt 4.2
* POWERMOCK 2.0.2
* MOCKITO 2.0.2

### Banco de dados

* MySQL 8.0

### Server

* WildFly 8.2.1
* HornetQ 2.4

# Configuração do ambiente

* Banco de dados

Para criação do banco de dados e suas respectivas tabelas, executar o script **db-create.sql** localizado em **scripts-db\db-create.sql** no diretório raiz do projeto.

Antes de inicializar o servidor **WildFly**, referencie o arquivo **standalone-full.xml** para que ele utilize as configurações de mensageria do servidor já declaradas.

* WildFly

Necessário configurar o data source com as suas credenciais de acesso.

Incluir o trecho abaixo no arquivo **standalone-full.xml**, dentro da tag **<datasources>**. Lembre-se de substituir **{usuario}** e **{senha}** por seu usuário e senha de conexão com o database.

```
<datasource jndi-name="java:jboss/datasources/fullstackDS" pool-name="fullstackDS" enabled="true">
 <connection-url>jdbc:mysql://localhost:3306/fullstack_java_teste?useTimezone=true&amp;serverTimezone=UTC</connection-url>
 <driver>mysql</driver>
 <security>
  <user-name>{usuario}</user-name>
  <password>{senha}</password>
 </security>
</datasource>
```

Também é necessário fazer a inclusão do driver do **MySQL** dentro da tag **<drivers>**

```
<driver name="mysql" module="com.mysql">
 <driver-class>com.mysql.cj.jdbc.Driver</driver-class>
</driver>
```

O **WildFly** não possui o jar do connector **MySQL** em sua instalação, portanto, é necessário criar uma estrutura de diretórios nomeados **mysql/main** dentro de **<dir_instalacao_wildfly>/modules/system/layers/base/com** e incluir os seguintes arquivos:

  - module.xml
  - mysql-connector-java-8.0.16.jar

Ambos arquivos estão dentro do diretório **conf-wildfly** que se encontra na raiz do projeto.

**Obs.:** Não esquecer de mencionar o arquivo **standalone-full.xml** antes de iniciar o **WildFly**, para que possamos nos beneficiar de todos os recursos JEE cujo gerenciamento fica a cargo do servidor (mensageria, gerenciameto da conexão com o banco de dados, etc).
