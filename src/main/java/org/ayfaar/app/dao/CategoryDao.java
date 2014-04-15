package org.ayfaar.app.dao;

import org.ayfaar.app.model.Category;

import java.util.List;

public interface CategoryDao extends BasicCrudDao<Category> {
    List<Category> getTopLevel();

//    List<Category> getChildren(String uri);
}
