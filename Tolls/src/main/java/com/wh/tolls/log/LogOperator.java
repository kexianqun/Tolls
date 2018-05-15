package com.wh.tolls.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogOperator {

	/**
	 * 写入DEBUG日志
	 * 
	 * @param loggerName
	 * @param message
	 *            写入的日志消息
	 */
	public static void debug(String loggerName, String message) {
		if (isDebugEnabled(loggerName)) {
			Logger logger = LoggerFactory.getLogger(loggerName);
			logger.debug(message + "\r\n");
		}
	}

	/**
	 * 写入DEBUG日志
	 * 
	 * @param loggerName
	 * @param message
	 *            写入的日志消息
	 * @param t
	 *            记录抛出的异常信息。
	 */

	public static void debug(String loggerName, String message, Throwable t) {
		Logger logger = LoggerFactory.getLogger(loggerName);
		logger.debug(message, t);
	}

	/**
	 * 写入INFO日志
	 * 
	 * @param loggerName
	 * @param message
	 *            写入的日志消息
	 */
	public static void info(String loggerName, String message) {
		Logger logger = LoggerFactory.getLogger(loggerName);
		logger.info(message + "\r\n");
	}

	/**
	 * 写入INFO日志
	 * 
	 * @param loggerName
	 * @param message
	 *            写入的日志消息
	 * @param t
	 *            记录抛出的异常信息。
	 */
	public static void info(String loggerName, String message, Throwable t) {
		Logger logger = LoggerFactory.getLogger(loggerName);
		logger.info(message, t);
	}

	/**
	 * 写入WARN日志
	 * 
	 * @param loggerName
	 * @param message
	 *            写入的日志消息
	 */
	public static void warn(String loggerName, String message) {
		Logger logger = LoggerFactory.getLogger(loggerName);
		logger.warn(message + "\r\n");

	}

	/**
	 * 写入WARN日志
	 * 
	 * @param loggerName
	 * @param message
	 *            写入的日志消息
	 * @param t
	 *            记录抛出的异常信息。
	 */
	public static void warn(String loggerName, String message, Throwable t) {
		Logger logger = LoggerFactory.getLogger(loggerName);
		logger.warn(message, t);

	}

	/**
	 * 写入ERROR日志
	 * 
	 * @param loggerName
	 * @param message
	 *            写入的日志消息
	 */
	public static void err(String loggerName, String message) {
		Logger logger = LoggerFactory.getLogger(loggerName);
		logger.error(message + "\r\n");

	}

	/**
	 * 写入ERROR日志
	 * 
	 * @param loggerName
	 * @param message
	 *            写入的日志消息
	 * @param t
	 *            记录抛出的异常信息。
	 */
	public static void err(String loggerName, String message, Throwable t) {
		Logger logger = LoggerFactory.getLogger(loggerName);
		logger.error(message, t);

	}

	/**
	 * 判断debug级别的日志是否已打开
	 * 
	 * @param loggerName
	 * @return
	 */
	public static boolean isDebugEnabled(String loggerName) {
		return LoggerFactory.getLogger(loggerName).isDebugEnabled();
	}

	/**
	 * 判断info级别的日志是否已打开
	 * 
	 * @param loggerName
	 * @return
	 */
	public static boolean isInfoEnabled(String loggerName) {
		return LoggerFactory.getLogger(loggerName).isInfoEnabled();
	}

	/**
	 * 数组的字符串形式
	 * 
	 * @param <T>
	 *            元素类型
	 * @param array
	 *            数组
	 * @return String 字符串值
	 */
	public static <T> String getString(T[] array) {
		if (array == null) {
			return "null";
		}
		StringBuilder s = new StringBuilder();
		for (T t : array) {
			s.append(String.valueOf(t));
			s.append(", ");
		}
		return s.toString();
	}
}
