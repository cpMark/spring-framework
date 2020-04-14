/*
 * Copyright 2002-2007 the original author or authors.
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

package org.springframework.beans.factory.parsing;

import java.util.EventListener;

/**
 * Interface that receives callbacks for component, alias and import
 * registrations during a bean definition reading process.
 *
 * 在BeanDefinition的读取过程中，接收组件、别名和导入注册的回调的接口
 *
 * @author Rob Harrop
 * @author Juergen Hoeller
 * @since 2.0
 * @see ReaderContext
 */
public interface ReaderEventListener extends EventListener {

	/**
	 * Notification that the given defaults has been registered.
	 * @param defaultsDefinition a descriptor for the defaults
	 * @see org.springframework.beans.factory.xml.DocumentDefaultsDefinition
	 *
	 * 通知已注册给定的默认值
	 */
	void defaultsRegistered(DefaultsDefinition defaultsDefinition);

	/**
	 * Notification that the given component has been registered.
	 * @param componentDefinition a descriptor for the new component
	 * @see BeanComponentDefinition
	 *
	 * 通知已注册给定的组件
	 */
	void componentRegistered(ComponentDefinition componentDefinition);

	/**
	 * Notification that the given alias has been registered.
	 * @param aliasDefinition a descriptor for the new alias
	 *
	 * 通知已注册给定的别名
	 */
	void aliasRegistered(AliasDefinition aliasDefinition);

	/**
	 * Notification that the given import has been processed.
	 * @param importDefinition a descriptor for the import
	 *
	 * 通知已处理给定的导入
	 */
	void importProcessed(ImportDefinition importDefinition);

}
