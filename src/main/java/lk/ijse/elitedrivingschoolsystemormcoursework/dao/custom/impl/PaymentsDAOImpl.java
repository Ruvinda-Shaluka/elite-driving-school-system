package lk.ijse.elitedrivingschoolsystemormcoursework.dao.custom.impl;

import lk.ijse.elitedrivingschoolsystemormcoursework.dao.custom.PaymentDAO;
import lk.ijse.elitedrivingschoolsystemormcoursework.entity.Payments;

import java.util.List;
import java.util.Optional;

public class PaymentsDAOImpl implements PaymentDAO {
    @Override
    public List<Payments> getAll() throws Exception {
        return List.of();
    }

    @Override
    public String getLastId() throws Exception {
        return "";
    }

    @Override
    public boolean save(Payments payments) throws Exception {
        return false;
    }

    @Override
    public boolean update(Payments payments) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public List<String> getAllIds() throws Exception {
        return List.of();
    }

    @Override
    public Optional<Payments> findById(String id) throws Exception {
        return Optional.empty();
    }
}
