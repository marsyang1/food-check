drop table if exists Food;
CREATE TABLE Food (SID char(36) NOT NULL,ID varchar(45) NOT NULL,NAME varchar(100) DEFAULT '',DESCRIPTION varchar(3000) DEFAULT '',PRIMARY KEY (SID)) ENGINE=InnoDB DEFAULT CHARSET=UTF8;
INSERT INTO Food (SID,ID, NAME, DESCRIPTION) VALUES (UUID() ,'Cranberry', '蔓越莓', '由於蔓越莓可以降低細菌沾黏性,故也被用來減少胃幽門螺旋桿菌附著於腸胃道,來降低其造成的胃潰瘍，但值得注意的是，蔓越莓本身帶酸澀性，故建議飯後服用，以免胃疾復發');