INSERT INTO `c_configuration` (`id`, `name`, `value`, `enabled`) VALUES (NULL, 'reschedule-future-installments', NULL, '1');
INSERT INTO `c_configuration` (`id`, `name`, `value`, `enabled`) VALUES (NULL, 'reschedule-repayments-on-holidays', NULL, '1');
UPDATE c_configuration set enabled=1 where name = 'reschedule-repayments-on-holidays';
