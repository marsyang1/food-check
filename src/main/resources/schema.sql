drop table if exists Food;
CREATE TABLE Food (SID char(36) NOT NULL,ID varchar(45) NOT NULL,NAME varchar(100) DEFAULT '',DESCRIPTION varchar(3000) DEFAULT '',PRIMARY KEY (SID)) ENGINE=InnoDB DEFAULT CHARSET=UTF8;
INSERT INTO Food (SID,ID, NAME, DESCRIPTION)
VALUES (UUID() ,'Cranberry', '蔓越莓', '可以吃,由於蔓越莓可以降低細菌沾黏性,故也被用來減少胃幽門螺旋桿菌附著於腸胃道,來降低其造成的胃潰瘍，但值得注意的是，蔓越莓本身帶酸澀性，故建議飯後服用，以免胃疾復發')
,(UUID() ,'Soda', '蘇打水', '不適合,蘇打水中的氣泡會刺激腸胃')
,(UUID() ,'Cola', '可樂', '不適合,可樂中的氣泡會刺激腸胃')
,(UUID() ,'Yogurt', '優格', '可以吃喔')
,(UUID() ,'Tea', '茶', '不適合,茶中的茶鹼素對胃不好')
,(UUID() ,'Coffee', '咖啡', '不適合,咖啡中的咖啡因對胃不好,喝的時候要適量')
;