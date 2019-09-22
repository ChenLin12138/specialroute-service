CREATE TABLE `abtesting` (
  `service_name` char(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `active` char(1) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `endpoint` char(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `weight` INT NOT NULL,
  PRIMARY KEY (`service_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='abtesting';

INSERT INTO abtesting (service_name, active,  endpoint, weight) VALUES ('organizationservice', 'Y','http://orgservice-new:8087',5);