package fr.boulderdash.model;

import java.sql.SQLException;
import java.util.List;

import model.Example;
import model.IModel;
import model.dao.FilData;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ModelFacade implements IModel {

	/**
	 * Instantiates a new model facade.
	 */
	public ModelFacade() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see model.IModel#getExampleById(int)
	 */
	@Override
	public Example getAll(final int id) throws SQLException {
		return FilData.getAll(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see model.IModel#getExampleByName(java.lang.String)
	 */
	@Override
	public Example getExampleByName(final String name) throws SQLException {
		return FilData.getExampleByName(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see model.IModel#getAllExamples()
	 */
	@Override
	public List<Example> getAllExamples() throws SQLException {
		return FilData.getAllExamples();
	}

}
