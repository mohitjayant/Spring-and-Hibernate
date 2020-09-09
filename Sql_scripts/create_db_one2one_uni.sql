DROP SCHEMA IF EXISTS `one-to-one-uni`;
CREATE SCHEMA `one-to-one-uni`;
USE `one-to-one-uni`;
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `instructor_detail`;
CREATE TABLE `instructor_detail` (
		`id` int(11) NOT NULL AUTO_INCREMENT,
        `youtube_channel` varchar(128)  DEFAULT NULL,
        `hobby` varchar(45) DEFAULT NULL,
        PRIMARY KEY (`id`)
) ENGINE=InnoDB auto_increment=1 default charset=latin1;

drop table if exists `instructor`;
create table `instructor` (
		`id` int(11) not null auto_increment,
        `first_name` varchar(45) default null,
        `last_name` varchar(45) default null,
        `email` varchar(45) default null,
        `instructor_detail_id` int(11) default null,
        primary key (`id`),
        key `FK_DETAIL_idx` (`instructor_detail_id`),
        constraint `FK_DETAIL` foreign key (`instructor_detail_id`) references `instructor_detail` (`id`) on delete no action on update no action
) engine=InnoDB auto_increment=1 default charset=latin1;
        
set FOREIGN_KEY_CHECKS=1;