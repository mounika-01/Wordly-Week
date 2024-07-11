package com.example.wordlyWeek.repository;

import java.util.ArrayList;
import java.util.List;
import com.example.wordlyWeek.model.*;

public interface MagazineRepository {
    ArrayList<Magazine> getMagazines();

    Magazine getMagazineById(int magazineId);

    Magazine addMagazine(Magazine magazine);

    Magazine updateMagazine(int magazineId, Magazine magazine);

    void deleteMagazine(int magazineId);

    List<Writer> getMagazineWriters(int magazineId);
}