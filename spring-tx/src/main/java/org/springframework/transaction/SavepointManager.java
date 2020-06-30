/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.transaction;

/**
 * Interface that specifies an API to programmatically manage transaction
 * savepoints in a generic fashion. Extended by TransactionStatus to
 * expose savepoint management functionality for a specific transaction.
 * <p>
 * 该接口指定API以通用方式以编程方式管理事务保存点。由TransactionStatus扩展以公开特定事务的保存点管理功能。
 *
 * <p>Note that savepoints can only work within an active transaction.
 * Just use this programmatic savepoint handling for advanced needs;
 * else, a subtransaction with PROPAGATION_NESTED is preferable.
 *
 * <p>This interface is inspired by JDBC 3.0's Savepoint mechanism
 * but is independent from any specific persistence technology.
 *
 * @author Juergen Hoeller
 * @see TransactionStatus
 * @see TransactionDefinition#PROPAGATION_NESTED
 * @see java.sql.Savepoint
 * @since 1.1
 */
public interface SavepointManager {

	/**
	 * Create a new savepoint. You can roll back to a specific savepoint
	 * via {@code rollbackToSavepoint}, and explicitly release a savepoint
	 * that you don't need anymore via {@code releaseSavepoint}.
	 * <p>Note that most transaction managers will automatically release
	 * savepoints at transaction completion.
	 * <p>
	 * 创建一个新的保存点。你可以通过{@code rollbackToSavepoint}回滚到一个特定的保存点，
	 * 并通过{@code releaseSavepoint}显式释放不再需要的保存点。
	 * <p>
	 * 请注意，大多数事务管理器将在事务完成时自动释放保存点。
	 *
	 * @return a savepoint object, to be passed into
	 * {@link #rollbackToSavepoint} or {@link #releaseSavepoint}
	 * @throws NestedTransactionNotSupportedException if the underlying
	 *                                                transaction does not support savepoints
	 * @throws TransactionException                   if the savepoint could not be created,
	 *                                                for example because the transaction is not in an appropriate state
	 * @see java.sql.Connection#setSavepoint
	 */
	Object createSavepoint() throws TransactionException;

	/**
	 * Roll back to the given savepoint.
	 * <p>The savepoint will <i>not</i> be automatically released afterwards.
	 * You may explicitly call {@link #releaseSavepoint(Object)} or rely on
	 * automatic release on transaction completion.
	 * <p>
	 * 回滚到给定的保存点。保存点不会自动释放。 您可以显式调用{@link #releaseSavepoint（Object）}或依靠在事务完成时自动释放。
	 *
	 * @param savepoint the savepoint to roll back to
	 * @throws NestedTransactionNotSupportedException if the underlying
	 *                                                transaction does not support savepoints
	 * @throws TransactionException                   if the rollback failed
	 * @see java.sql.Connection#rollback(java.sql.Savepoint)
	 */
	void rollbackToSavepoint(Object savepoint) throws TransactionException;

	/**
	 * Explicitly release the given savepoint.
	 * <p>Note that most transaction managers will automatically release
	 * savepoints on transaction completion.
	 * <p>Implementations should fail as silently as possible if proper
	 * resource cleanup will eventually happen at transaction completion.
	 * <p>
	 * 明确释放给定的保存点。
	 *
	 * @param savepoint the savepoint to release
	 * @throws NestedTransactionNotSupportedException if the underlying
	 *                                                transaction does not support savepoints
	 * @throws TransactionException                   if the release failed
	 * @see java.sql.Connection#releaseSavepoint
	 */
	void releaseSavepoint(Object savepoint) throws TransactionException;

}
