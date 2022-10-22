package com.packtpub.mmj.booking.domain.service;

import com.packtpub.mmj.booking.domain.repository.ReadOnlyRepository;


public abstract class ReadOnlyBaseService<TE, T> {

  private ReadOnlyRepository<TE, T> repository;

  ReadOnlyBaseService(ReadOnlyRepository<TE, T> repository) {
    this.repository = repository;
  }
}
