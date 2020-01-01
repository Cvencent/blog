/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.7.25-log : Database - blog2
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`blog2` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `blog2`;

/*Table structure for table `album` */

DROP TABLE IF EXISTS `album`;

CREATE TABLE `album` (
  `photo_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '图片id',
  `user_id` int(10) DEFAULT NULL COMMENT '用户id',
  `place` varchar(50) DEFAULT NULL COMMENT '拍摄地点',
  `photo_date` varchar(50) DEFAULT NULL COMMENT '拍摄日期',
  `photo_detail` varchar(100) DEFAULT NULL COMMENT '拍摄说明',
  `src` varchar(100) DEFAULT NULL COMMENT '照片路径',
  PRIMARY KEY (`photo_id`),
  KEY `user_id_fk3` (`user_id`),
  CONSTRAINT `user_id_fk3` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

/*Data for the table `album` */

insert  into `album`(`photo_id`,`user_id`,`place`,`photo_date`,`photo_detail`,`src`) values (1,1,'安徽','2018-07-02','sdsdsds','199.jpg'),(32,1,'浙江','2018-07-02','33333333333丰富','199.jpg');

/*Table structure for table `leacots` */

DROP TABLE IF EXISTS `leacots`;

CREATE TABLE `leacots` (
  `leacots_id` int(50) NOT NULL AUTO_INCREMENT COMMENT '留言id',
  `leacots_date` datetime DEFAULT NULL COMMENT '留言日期',
  `leacots_detail` text COMMENT '留言内容',
  `user_id` int(10) DEFAULT NULL COMMENT '留言人id',
  `usernick` varchar(50) DEFAULT NULL COMMENT '留言人昵称',
  `leacots_to` int(10) DEFAULT NULL COMMENT '留言所属人',
  PRIMARY KEY (`leacots_id`),
  KEY `user_id_fk4` (`leacots_to`),
  KEY `user_id_fk5` (`user_id`),
  CONSTRAINT `user_id_fk4` FOREIGN KEY (`leacots_to`) REFERENCES `sys_user` (`id`),
  CONSTRAINT `user_id_fk5` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `leacots` */

insert  into `leacots`(`leacots_id`,`leacots_date`,`leacots_detail`,`user_id`,`usernick`,`leacots_to`) values (1,'2019-07-31 14:27:52','6666666666666666666666666',1,NULL,1),(2,'2019-07-30 14:28:30','7777777777777777777',2,NULL,1);

/*Table structure for table `reply` */

DROP TABLE IF EXISTS `reply`;

CREATE TABLE `reply` (
  `reply_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `reply_detail` text COMMENT '评论内容',
  `reply_from` int(10) DEFAULT NULL COMMENT '评论人',
  `reply_date` datetime DEFAULT NULL COMMENT '评论日期',
  `text_id` int(100) DEFAULT NULL COMMENT '文章id',
  `whisper_id` int(20) DEFAULT NULL COMMENT '微语id',
  PRIMARY KEY (`reply_id`),
  KEY `text_id_fk1` (`text_id`),
  KEY `whisper_id_fk1` (`whisper_id`),
  KEY `reply_from_fk1` (`reply_from`),
  CONSTRAINT `reply_from_fk1` FOREIGN KEY (`reply_from`) REFERENCES `sys_user` (`id`),
  CONSTRAINT `text_id_fk1` FOREIGN KEY (`text_id`) REFERENCES `text` (`text_id`),
  CONSTRAINT `whisper_id_fk1` FOREIGN KEY (`whisper_id`) REFERENCES `whisper` (`whisper_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `reply` */

insert  into `reply`(`reply_id`,`reply_detail`,`reply_from`,`reply_date`,`text_id`,`whisper_id`) values (1,'66666666666666666666666666666666',1,'2019-07-28 16:21:40',1,NULL),(2,'7777777777777777777777777777777777777777777',2,'2019-07-27 16:23:19',NULL,1);

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(50) NOT NULL COMMENT '用户姓名',
  `password` varchar(100) NOT NULL COMMENT '用户密码',
  `qq` varchar(20) DEFAULT NULL COMMENT '用户qq',
  `wechat` varchar(20) DEFAULT NULL COMMENT '用户微信',
  `email` varchar(20) DEFAULT NULL COMMENT '用户邮箱',
  `tel` varchar(20) DEFAULT NULL COMMENT '用户电话',
  `nickname` varchar(50) DEFAULT NULL COMMENT '用户昵称',
  `sign` varchar(100) DEFAULT NULL COMMENT '用户签名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `sys_user` */

insert  into `sys_user`(`id`,`username`,`password`,`qq`,`wechat`,`email`,`tel`,`nickname`,`sign`) values (1,'chen','123456','1306681486','1306681486','1306681486@qq.com','17352913429','haha','haha'),(2,'wang','123456',NULL,NULL,NULL,NULL,'灭霸',NULL);

/*Table structure for table `text` */

DROP TABLE IF EXISTS `text`;

CREATE TABLE `text` (
  `user_id` int(10) DEFAULT NULL COMMENT '用户id',
  `text_id` int(100) NOT NULL COMMENT '文章id',
  `textline` varchar(100) DEFAULT NULL COMMENT '文章标题',
  `text_type` varchar(30) DEFAULT NULL COMMENT '文章类型',
  `text` text COMMENT '文章内容',
  `click` int(100) NOT NULL DEFAULT '0' COMMENT '点击次数',
  `create_date` datetime DEFAULT NULL COMMENT '创建日期',
  PRIMARY KEY (`text_id`),
  KEY `user_id_fk1` (`user_id`),
  CONSTRAINT `user_id_fk1` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `text` */

insert  into `text`(`user_id`,`text_id`,`textline`,`text_type`,`text`,`click`,`create_date`) values (1,1,'设计文章1','design','上午上班 中午赶到昆山去看房，很不入眼的房型，房价依旧那么傲娇的200多万，不为什么，只为靠近上海，没有在那边过多的停留，马不停蹄赶回上海，和北京来的一个客户谈合作，从他战略投资到高层资源，一顿高谈阔论，我们就像是两个谈判数亿资产的双方一样，据理力争，强势压过对方，可他可能不知道，对面的这个人刚从看房的场地出来，正在思考怎么买到房，我可能我不清楚，对面的这个人葫芦里买的究竟是什么药，人生就像一场戏，回头想想都不容易，天很大，海也很大，人有时候也觉得自己很伟大，就当站在星河穹顶之下，面对万丈高山时，人类才会认识到自己的渺小，人间万物皆有生命，永远记得天外有天，人外有人，过好当下，活出自己想要的那样，才无悔，才不负此生。',4,'2019-07-27 15:43:36'),(1,2,'设计文章2','design','最近，想要落在笔尖的话语实在太多，像是汩汩泉水不断的渗透着，滋养着每日的生活，多么想停下来好好的醉一场，多么想停下来好好的笑一场，就如同胖大星昨天发我的那种，等你熬过这段低谷期，也一定要找一个山花烂漫的地方，发自内心的笑出灿烂。\r\n\r\n　　从早上起来时，内心的自己就呼唤出一个声音：好累啊！',5,'2019-06-01 15:44:47'),(1,3,'前端文章','leading','室内设计作为一门新兴的学科，尽管还只是近数十年的事，但是人们有意识地对自己生活、生产活动的室内进行安排布置，甚至美化装饰，赋予室内环',0,'2019-07-27 10:27:39');

/*Table structure for table `whisper` */

DROP TABLE IF EXISTS `whisper`;

CREATE TABLE `whisper` (
  `whisper_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '微语id',
  `whisper_text` text COMMENT '微语内容',
  `whisper_date` datetime DEFAULT NULL COMMENT '创建日期',
  `user_id` int(10) DEFAULT NULL COMMENT '用户id',
  `click` int(100) NOT NULL DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`whisper_id`),
  KEY `user_id_fk2` (`user_id`),
  CONSTRAINT `user_id_fk2` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `whisper` */

insert  into `whisper`(`whisper_id`,`whisper_text`,`whisper_date`,`user_id`,`click`) values (1,' 感情经不起平淡，友情经不起风雨，心静了，才能听见自己的心声，心清了，才能照见万物的本性。静静的过自己的生活，心若不动，风又奈何。你若不伤，岁月无恙。在乎你的人，会在乎你的感受，不会让你难受；不在乎你的人，不会在乎你的难过，你又何必舍不得。爱是彼此的珍惜，也是双方的在意；情是柔弱的花朵，用心呵护才会醇香。若爱请珍爱，不爱请放手，尊重别人也是尊重自己，彼此安好便是晴天。\r\n\r\n　　 有的人用尽全力珍惜你，你却不在意；有颗心一直为你等待，你却视而不见。有多少情，不被重视，所以走开；有多少身影，不被珍惜，变成背影。感情，不去论对与错，只有真不真；缘分，不去说长与短，只有惜不惜。把你放在心里的人','2019-07-28 00:00:00',1,0),(2,' 感情经不起平淡，友情经不起风雨，心静了，才能听见自己的心声，心清了，才能照见万物的本性。静静的过自己的生活，心若不动，风又奈何。你若不伤，岁月无恙。在乎你的人，会在乎你的感受，不会让你难受；不在乎你的人，不会在乎你的难过，你又何必舍不得。爱是彼此的珍惜，也是双方的在意；情是柔弱的花朵，用心呵护才会醇香。若爱请珍爱，不爱请放手，尊重别人也是尊重自己，彼此安好便是晴天。\r\n\r\n　　 有的人用尽全力珍惜你，你却不在意；有颗心一直为你等待，你却视而不见。有多少情，不被重视，所以走开；有多少身影，不被珍惜，变成背影。感情，不去论对与错，只有真不真；缘分，不去说长与短，只有惜不惜。把你放在心里的人','2019-07-27 00:00:00',1,0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
