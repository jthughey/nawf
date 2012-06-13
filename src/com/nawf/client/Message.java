package com.nawf.client;
/*  Copyright 2011 Justin Hughey
*
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/
public class Message{
	private String message = null;
	private Level level = null;

	public enum Level {Info, Warning, Error, System}

	public Message(Level level, String message){
		this.level = level;
		this.message = message;
	}
	
	public Level getLevel(){
		return this.level;
	}
	
	public String getMessage(){
		return this.message;
	}
	
	public String toString(){
		return this.message + ':'+this.level;
	}
}
