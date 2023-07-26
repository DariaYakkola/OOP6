package Homework.service;

import Homework.model.Worker;

import java.util.List;

public interface SearchService {

    List<Worker> searchSurname();

    List<Worker> searchId();
}