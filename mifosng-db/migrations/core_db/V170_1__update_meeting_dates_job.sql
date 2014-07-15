CREATE TABLE `ct_calendar_dates` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`entity_type_id` SMALLINT(5) NOT NULL,
	`entity_id` BIGINT(20) NOT NULL,
	`meeting_date` DATE NOT NULL,
	PRIMARY KEY (id),
	CONSTRAINT uk_EntityDateId UNIQUE (`entity_type_id`,`entity_id`,`meeting_date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `job` (`name`, `display_name`, `cron_expression`, `create_time`, `task_priority`, `group_name`, `previous_run_start_time`, `next_run_time`, `job_key`, `initializing_errorlog`, `is_active`, `currently_running`, `updates_allowed`, `scheduler_group`) VALUES ('Update Calendar Dates', 'Update Calendar Dates', '0 0 1 1/1 * ? *', now(), 5, NULL, NULL, NULL, NULL, NULL, 1, 0, 1, 0);