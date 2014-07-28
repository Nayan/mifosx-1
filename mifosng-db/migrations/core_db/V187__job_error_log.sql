CREATE TABLE `job_error_log` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`job_run_history_id` BIGINT(20) NOT NULL,
	`entity_type_id` SMALLINT(5) NOT NULL,
	`entity_id` BIGINT(20) NOT NULL,
	`error_message` VARCHAR(100) DEFAULT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (`job_run_history_id`) REFERENCES job_run_history(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;