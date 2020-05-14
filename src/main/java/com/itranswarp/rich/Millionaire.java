package com.itranswarp.rich;

import java.util.Objects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * A Millionaire.
 * 
 * @author liaoxuefeng
 */
public final class Millionaire {

	private final Log log = LogFactory.getLog(getClass());

	private final String name;

	/**
	 * Create an anonymous millionaire.
	 */
	public Millionaire() {
		this("Anonymous");
	}

	/**
	 * Create a named millionaire.
	 * 
	 * @param name Millionaire name.
	 */
	public Millionaire(String name) {
		this.name = Objects.requireNonNull(name, "Name must be non null.");
	}

	/**
	 * Get name of the millionaire.
	 * 
	 * @return Millionaire name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Answer the question: "how to become rich?"
	 * 
	 * @return The answer.
	 */
	public String howToBecomeRich() {
		if (log.isDebugEnabled()) {
			log.debug("How to become rich?");
		}
		return "Buy lottery.";
	}
}
