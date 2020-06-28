/*
 * Copyright 2002-2018 the original author or authors.
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

package org.springframework.jdbc.core;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.lang.Nullable;

/**
 * Callback interface used by {@link JdbcTemplate}'s query methods.
 * Implementations of this interface perform the actual work of extracting
 * results from a {@link java.sql.ResultSet}, but don't need to worry
 * about exception handling. {@link java.sql.SQLException SQLExceptions}
 * will be caught and handled by the calling JdbcTemplate.
 * <p>
 * {@link JdbcTemplate}的查询方法使用的回调接口。
 * 该接口的实现执行从{@link java.sql.ResultSet}提取结果的实际工作，但是不必担心异常处理。
 * {@link java.sql.SQLException SQLExceptions} 将由调用JdbcTemplate捕获和处理。
 *
 * <p>This interface is mainly used within the JDBC framework itself.
 * A {@link RowMapper} is usually a simpler choice for ResultSet processing,
 * mapping one result object per row instead of one result object for
 * the entire ResultSet.
 *
 * <p>Note: In contrast to a {@link RowCallbackHandler}, a ResultSetExtractor
 * object is typically stateless and thus reusable, as long as it doesn't
 * access stateful resources (such as output streams when streaming LOB
 * contents) or keep result state within the object.
 *
 * @param <T> the result type
 * @author Rod Johnson
 * @author Juergen Hoeller
 * @see JdbcTemplate
 * @see RowCallbackHandler
 * @see RowMapper
 * @see org.springframework.jdbc.core.support.AbstractLobStreamingResultSetExtractor
 * @since April 24, 2003
 */
@FunctionalInterface
public interface ResultSetExtractor<T> {

	/**
	 * Implementations must implement this method to process the entire ResultSet.
	 * <p>
	 * 实现者必须实现此方法来处理整个ResultSet
	 *
	 * @param rs the ResultSet to extract data from. Implementations should
	 *           not close this: it will be closed by the calling JdbcTemplate.
	 * @return an arbitrary result object, or {@code null} if none
	 * (the extractor will typically be stateful in the latter case).
	 * @throws SQLException        if a SQLException is encountered getting column
	 *                             values or navigating (that is, there's no need to catch SQLException)
	 * @throws DataAccessException in case of custom exceptions
	 */
	@Nullable
	T extractData(ResultSet rs) throws SQLException, DataAccessException;

}
