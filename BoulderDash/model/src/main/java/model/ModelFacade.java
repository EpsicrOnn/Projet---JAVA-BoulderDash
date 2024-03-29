package model;

import java.sql.SQLException;
import java.util.List;

import model.Example;
import model.IModel;
import model.dao.ExampleDAO;

// TODO: Auto-generated Javadoc
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
	public Example getTab(final int id) throws SQLException {
		return ExampleDAO.getTab(id);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.IModel#getExampleByName(java.lang.String)
	 */
	@Override
	public Example getExampleByName(final String name) throws SQLException {
		return ExampleDAO.getExampleByName(name);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.IModel#getAllExamples()
	 */
	@Override
	public List<Example> getAllExamples() throws SQLException {
		return ExampleDAO.getAllExamples();
	}

	/* (non-Javadoc)
	 * @see model.IModel#getExampleById(int)
	 */
	@Override
	public Example getExampleById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
