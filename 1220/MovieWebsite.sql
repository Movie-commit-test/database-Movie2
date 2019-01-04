/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2008                    */
/* Created on:     2018-12-20 19:38:22                          */
/*==============================================================*/


if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Collection') and o.name = 'FK_COLLECTI_COLLECTIO_FILM')
alter table Collection
   drop constraint FK_COLLECTI_COLLECTIO_FILM
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Collection') and o.name = 'FK_COLLECTI_COLLECTIO_USER')
alter table Collection
   drop constraint FK_COLLECTI_COLLECTIO_USER
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Comment') and o.name = 'FK_COMMENT_COMMENT_FILM')
alter table Comment
   drop constraint FK_COMMENT_COMMENT_FILM
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Comment') and o.name = 'FK_COMMENT_COMMENT2_USER')
alter table Comment
   drop constraint FK_COMMENT_COMMENT2_USER
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Film') and o.name = 'FK_FILM_DIRECTOR__DIRECTOR')
alter table Film
   drop constraint FK_FILM_DIRECTOR__DIRECTOR
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Film') and o.name = 'FK_FILM_SCREENWRI_SCREENWR')
alter table Film
   drop constraint FK_FILM_SCREENWRI_SCREENWR
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Film') and o.name = 'FK_FILM_ZONE_FILM_ZONE')
alter table Film
   drop constraint FK_FILM_ZONE_FILM_ZONE
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Film_Type') and o.name = 'FK_FILM_TYP_FILM_TYPE_TYPE')
alter table Film_Type
   drop constraint FK_FILM_TYP_FILM_TYPE_TYPE
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Film_Type') and o.name = 'FK_FILM_TYP_FILM_TYPE_FILM')
alter table Film_Type
   drop constraint FK_FILM_TYP_FILM_TYPE_FILM
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Play') and o.name = 'FK_PLAY_PLAY_ACTOR')
alter table Play
   drop constraint FK_PLAY_PLAY_ACTOR
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Play') and o.name = 'FK_PLAY_PLAY2_FILM')
alter table Play
   drop constraint FK_PLAY_PLAY2_FILM
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Relationship_14') and o.name = 'FK_RELATION_PRINTING_RELEASE')
alter table Relationship_14
   drop constraint FK_RELATION_PRINTING_RELEASE
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Relationship_14') and o.name = 'FK_RELATION_PURCHASE_USER')
alter table Relationship_14
   drop constraint FK_RELATION_PURCHASE_USER
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Release') and o.name = 'FK_RELEASE_RELEASE_CINEMA')
alter table Release
   drop constraint FK_RELEASE_RELEASE_CINEMA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Release') and o.name = 'FK_RELEASE_RELEASE2_FILM')
alter table Release
   drop constraint FK_RELEASE_RELEASE2_FILM
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Actor')
            and   type = 'U')
   drop table Actor
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Advertise')
            and   type = 'U')
   drop table Advertise
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Cinema')
            and   type = 'U')
   drop table Cinema
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Collection')
            and   name  = 'Collection_FK'
            and   indid > 0
            and   indid < 255)
   drop index Collection.Collection_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Collection')
            and   name  = 'Collection2_FK'
            and   indid > 0
            and   indid < 255)
   drop index Collection.Collection2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Collection')
            and   type = 'U')
   drop table Collection
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Comment')
            and   name  = 'Comment_FK'
            and   indid > 0
            and   indid < 255)
   drop index Comment.Comment_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Comment')
            and   name  = 'Comment2_FK'
            and   indid > 0
            and   indid < 255)
   drop index Comment.Comment2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Comment')
            and   type = 'U')
   drop table Comment
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Director')
            and   type = 'U')
   drop table Director
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Film')
            and   name  = 'Zone_Film_FK'
            and   indid > 0
            and   indid < 255)
   drop index Film.Zone_Film_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Film')
            and   name  = 'Screenwriter_Film_FK'
            and   indid > 0
            and   indid < 255)
   drop index Film.Screenwriter_Film_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Film')
            and   name  = 'Director_Film_FK'
            and   indid > 0
            and   indid < 255)
   drop index Film.Director_Film_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Film')
            and   type = 'U')
   drop table Film
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Film_Type')
            and   name  = 'Film_Type_FK'
            and   indid > 0
            and   indid < 255)
   drop index Film_Type.Film_Type_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Film_Type')
            and   name  = 'Film_Type2_FK'
            and   indid > 0
            and   indid < 255)
   drop index Film_Type.Film_Type2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Film_Type')
            and   type = 'U')
   drop table Film_Type
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Play')
            and   name  = 'Play_FK'
            and   indid > 0
            and   indid < 255)
   drop index Play.Play_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Play')
            and   name  = 'Play2_FK'
            and   indid > 0
            and   indid < 255)
   drop index Play.Play2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Play')
            and   type = 'U')
   drop table Play
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Relationship_14')
            and   name  = 'Printing_FK'
            and   indid > 0
            and   indid < 255)
   drop index Relationship_14.Printing_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Relationship_14')
            and   name  = 'Purchase_FK'
            and   indid > 0
            and   indid < 255)
   drop index Relationship_14.Purchase_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Relationship_14')
            and   type = 'U')
   drop table Relationship_14
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Release')
            and   name  = 'Release_FK'
            and   indid > 0
            and   indid < 255)
   drop index Release.Release_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Release')
            and   name  = 'Release2_FK'
            and   indid > 0
            and   indid < 255)
   drop index Release.Release2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Release')
            and   type = 'U')
   drop table Release
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Screenwriter')
            and   type = 'U')
   drop table Screenwriter
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Type')
            and   type = 'U')
   drop table Type
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"User"')
            and   type = 'U')
   drop table "User"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Zone')
            and   type = 'U')
   drop table Zone
go

/*==============================================================*/
/* Table: Actor                                                 */
/*==============================================================*/
create table Actor (
   actorId              int                  not null,
   actorName            varchar(20)          not null,
   actorSex             char(10)             not null,
   actorBirthday        datetime             not null,
   constraint PK_ACTOR primary key (actorId)
)
go

/*==============================================================*/
/* Table: Advertise                                             */
/*==============================================================*/
create table Advertise (
   adId                 int                  not null,
   adContent            varchar(1000)        not null,
   adProduct            varchar(50)          not null,
   adType               varchar(50)          not null,
   constraint PK_ADVERTISE primary key (adId)
)
go

/*==============================================================*/
/* Table: Cinema                                                */
/*==============================================================*/
create table Cinema (
   cinemaId             int                  not null,
   cinemaName           varchar(20)          not null,
   cinmeaAddress        varchar(50)          not null,
   constraint PK_CINEMA primary key (cinemaId)
)
go

/*==============================================================*/
/* Table: Collection                                            */
/*==============================================================*/
create table Collection (
   movieId              int                  not null,
   userId               int                  not null,
   constraint PK_COLLECTION primary key (movieId, userId)
)
go

/*==============================================================*/
/* Index: Collection2_FK                                        */
/*==============================================================*/
create index Collection2_FK on Collection (
userId ASC
)
go

/*==============================================================*/
/* Index: Collection_FK                                         */
/*==============================================================*/
create index Collection_FK on Collection (
movieId ASC
)
go

/*==============================================================*/
/* Table: Comment                                               */
/*==============================================================*/
create table Comment (
   movieId              int                  not null,
   userId               int                  not null,
   content              varchar(3000)        not null,
   score                float                not null,
   constraint PK_COMMENT primary key (movieId, userId)
)
go

/*==============================================================*/
/* Index: Comment2_FK                                           */
/*==============================================================*/
create index Comment2_FK on Comment (
userId ASC
)
go

/*==============================================================*/
/* Index: Comment_FK                                            */
/*==============================================================*/
create index Comment_FK on Comment (
movieId ASC
)
go

/*==============================================================*/
/* Table: Director                                              */
/*==============================================================*/
create table Director (
   directorId           int                  not null,
   directorNmae         varchar(20)          not null,
   directorSex          char(10)             not null,
   directorBirthday     datetime             not null,
   constraint PK_DIRECTOR primary key (directorId)
)
go

/*==============================================================*/
/* Table: Film                                                  */
/*==============================================================*/
create table Film (
   movieId              int                  not null,
   directorId           int                  not null,
   screenwriterId       int                  not null,
   zoneId               int                  not null,
   movieName            varchar(50)          not null,
   movieLanguage        varchar(20)          not null,
   movieIntroduction    varchar(3000)        not null,
   movieScore           float                not null,
   movieAlias           varchar(50)          not null,
   movieDate            datetime             not null,
   constraint PK_FILM primary key (movieId)
)
go

/*==============================================================*/
/* Index: Director_Film_FK                                      */
/*==============================================================*/
create index Director_Film_FK on Film (
directorId ASC
)
go

/*==============================================================*/
/* Index: Screenwriter_Film_FK                                  */
/*==============================================================*/
create index Screenwriter_Film_FK on Film (
screenwriterId ASC
)
go

/*==============================================================*/
/* Index: Zone_Film_FK                                          */
/*==============================================================*/
create index Zone_Film_FK on Film (
zoneId ASC
)
go

/*==============================================================*/
/* Table: Film_Type                                             */
/*==============================================================*/
create table Film_Type (
   typeId               int                  not null,
   movieId              int                  not null,
   constraint PK_FILM_TYPE primary key (typeId, movieId)
)
go

/*==============================================================*/
/* Index: Film_Type2_FK                                         */
/*==============================================================*/
create index Film_Type2_FK on Film_Type (
movieId ASC
)
go

/*==============================================================*/
/* Index: Film_Type_FK                                          */
/*==============================================================*/
create index Film_Type_FK on Film_Type (
typeId ASC
)
go

/*==============================================================*/
/* Table: Play                                                  */
/*==============================================================*/
create table Play (
   actorId              int                  not null,
   movieId              int                  not null,
   constraint PK_PLAY primary key (actorId, movieId)
)
go

/*==============================================================*/
/* Index: Play2_FK                                              */
/*==============================================================*/
create index Play2_FK on Play (
movieId ASC
)
go

/*==============================================================*/
/* Index: Play_FK                                               */
/*==============================================================*/
create index Play_FK on Play (
actorId ASC
)
go

/*==============================================================*/
/* Table: Relationship_14                                       */
/*==============================================================*/
create table Relationship_14 (
   cinemaId             int                  not null,
   movieId              int                  not null,
   userId               int                  not null,
   constraint PK_RELATIONSHIP_14 primary key (cinemaId, movieId, userId)
)
go

/*==============================================================*/
/* Index: Purchase_FK                                           */
/*==============================================================*/
create index Purchase_FK on Relationship_14 (
userId ASC
)
go

/*==============================================================*/
/* Index: Printing_FK                                           */
/*==============================================================*/
create index Printing_FK on Relationship_14 (
cinemaId ASC,
movieId ASC
)
go

/*==============================================================*/
/* Table: Release                                               */
/*==============================================================*/
create table Release (
   cinemaId             int                  not null,
   movieId              int                  not null,
   constraint PK_RELEASE primary key (cinemaId, movieId)
)
go

/*==============================================================*/
/* Index: Release2_FK                                           */
/*==============================================================*/
create index Release2_FK on Release (
movieId ASC
)
go

/*==============================================================*/
/* Index: Release_FK                                            */
/*==============================================================*/
create index Release_FK on Release (
cinemaId ASC
)
go

/*==============================================================*/
/* Table: Screenwriter                                          */
/*==============================================================*/
create table Screenwriter (
   screenwriterId       int                  not null,
   screenwriterName     varchar(20)          not null,
   screenwriterSex      char(10)             not null,
   screenwriterBirthday datetime             not null,
   constraint PK_SCREENWRITER primary key (screenwriterId)
)
go

/*==============================================================*/
/* Table: Type                                                  */
/*==============================================================*/
create table Type (
   typeId               int                  not null,
   typeName             varchar(50)          not null,
   constraint PK_TYPE primary key (typeId)
)
go

/*==============================================================*/
/* Table: "User"                                                */
/*==============================================================*/
create table "User" (
   userId               int                  not null,
   userName             varchar(20)          not null,
   userSex              char(10)             not null,
   userPwd              varchar(20)          not null,
   userQQ               int                  not null,
   userPhone            int                  not null,
   userPictureUrl       varchar(255)         not null,
   constraint PK_USER primary key (userId)
)
go

/*==============================================================*/
/* Table: Zone                                                  */
/*==============================================================*/
create table Zone (
   zoneId               int                  not null,
   zoneName             varchar(50)          not null,
   constraint PK_ZONE primary key (zoneId)
)
go

alter table Collection
   add constraint FK_COLLECTI_COLLECTIO_FILM foreign key (movieId)
      references Film (movieId)
go

alter table Collection
   add constraint FK_COLLECTI_COLLECTIO_USER foreign key (userId)
      references "User" (userId)
go

alter table Comment
   add constraint FK_COMMENT_COMMENT_FILM foreign key (movieId)
      references Film (movieId)
go

alter table Comment
   add constraint FK_COMMENT_COMMENT2_USER foreign key (userId)
      references "User" (userId)
go

alter table Film
   add constraint FK_FILM_DIRECTOR__DIRECTOR foreign key (directorId)
      references Director (directorId)
go

alter table Film
   add constraint FK_FILM_SCREENWRI_SCREENWR foreign key (screenwriterId)
      references Screenwriter (screenwriterId)
go

alter table Film
   add constraint FK_FILM_ZONE_FILM_ZONE foreign key (zoneId)
      references Zone (zoneId)
go

alter table Film_Type
   add constraint FK_FILM_TYP_FILM_TYPE_TYPE foreign key (typeId)
      references Type (typeId)
go

alter table Film_Type
   add constraint FK_FILM_TYP_FILM_TYPE_FILM foreign key (movieId)
      references Film (movieId)
go

alter table Play
   add constraint FK_PLAY_PLAY_ACTOR foreign key (actorId)
      references Actor (actorId)
go

alter table Play
   add constraint FK_PLAY_PLAY2_FILM foreign key (movieId)
      references Film (movieId)
go

alter table Relationship_14
   add constraint FK_RELATION_PRINTING_RELEASE foreign key (cinemaId, movieId)
      references Release (cinemaId, movieId)
go

alter table Relationship_14
   add constraint FK_RELATION_PURCHASE_USER foreign key (userId)
      references "User" (userId)
go

alter table Release
   add constraint FK_RELEASE_RELEASE_CINEMA foreign key (cinemaId)
      references Cinema (cinemaId)
go

alter table Release
   add constraint FK_RELEASE_RELEASE2_FILM foreign key (movieId)
      references Film (movieId)
go

