package com.example.test.ch2;

import org.springframework.beans.factory.parsing.*;

public class UserReaderEventListener implements ReaderEventListener {
	@Override
	public void defaultsRegistered(DefaultsDefinition defaultsDefinition) {
		System.out.println("注册了user默认：" + defaultsDefinition);
	}

	@Override
	public void componentRegistered(ComponentDefinition componentDefinition) {
		System.out.println("注册了user组件：" + componentDefinition);
	}

	@Override
	public void aliasRegistered(AliasDefinition aliasDefinition) {
		System.out.println("注册了user别名：" + aliasDefinition);
	}

	@Override
	public void importProcessed(ImportDefinition importDefinition) {
		System.out.println("注册了user import：" + importDefinition);
	}
}
