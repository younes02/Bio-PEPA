/*******************************************************************************
 * Copyright (c) 2009 University of Edinburgh.
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the BSD Licence, which accompanies this feature
 * and can be downloaded from http://groups.inf.ed.ac.uk/pepa/update/licence.txt
 ******************************************************************************/
package uk.ac.ed.inf.biopepa.core.compiler;

import uk.ac.ed.inf.biopepa.core.dom.ASTNode;

/**
 * A class that is capable of collecting problems generated by the compiler.
 * 
 * @author mtribast
 * 
 */
public interface IProblemRequestor {

	public boolean accept(ProblemKind problem, ASTNode affectedNode);

	public boolean accept(ProblemKind problem, String additionalComment, ASTNode affectedNode);

	public boolean accept(ProblemInfo.Severity severity, String message, ASTNode affectedNode);

	public IProblemPolicy getProblemPolicy();

	public void setProblemPolicy(IProblemPolicy policy);
}
