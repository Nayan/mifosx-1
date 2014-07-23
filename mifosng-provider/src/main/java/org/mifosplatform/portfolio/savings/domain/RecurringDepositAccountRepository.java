/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.portfolio.savings.domain;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RecurringDepositAccountRepository extends JpaRepository<RecurringDepositAccount, Long>, JpaSpecificationExecutor<RecurringDepositAccount> {
	
	@Query("from RecurringDepositAccount rda where rda.id IN :ids and rda.status IN :savingStatuses ")
    List<RecurringDepositAccount> findByIdsAndStatus(@Param("ids") Collection<Long> ids,
            @Param("savingStatuses") Collection<Integer> savingStatuses);
}