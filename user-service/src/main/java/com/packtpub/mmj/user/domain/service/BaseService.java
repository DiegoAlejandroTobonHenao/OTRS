package com.packtpub.mmj.user.domain.service;

import com.packtpub.mmj.user.domain.repository.Repository;
import java.util.Collection;


public abstract class BaseService<TE, T> extends ReadOnlyBaseService<TE, T> {

  private Repository<TE, T> _repository;

  BaseService(Repository<TE, T> repository) {
    super(repository);
    _repository = repository;
  }

  /**
   * @param entity
   */
  public void add(TE entity) throws Exception {
    _repository.add(entity);
  }

  /**
   *
   * @return
   */
  public Collection<TE> getAll() {
    return _repository.getAll();
  }
}
