package lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.impl;

import lk.ijse.elitedrivingschoolsystemormcoursework.bo.SuperBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.bo.custom.PaymentsBO;
import lk.ijse.elitedrivingschoolsystemormcoursework.dto.PaymentsDTO;

import java.util.List;
import java.util.Optional;

public class PaymentsBOImpl implements PaymentsBO {
    @Override
    public List<PaymentsDTO> getAllPayments() throws Exception {
        return List.of();
    }

    @Override
    public String getLastPaymentId() throws Exception {
        return "";
    }

    @Override
    public boolean savePayments(PaymentsDTO t) throws Exception {
        return false;
    }

    @Override
    public boolean updatePayments(PaymentsDTO t) throws Exception {
        return false;
    }

    @Override
    public boolean deletePayments(String id) throws Exception {
        return false;
    }

    @Override
    public List<String> getAllPaymentIds() throws Exception {
        return List.of();
    }

    @Override
    public Optional<PaymentsDTO> findByPaymentId(String id) throws Exception {
        return Optional.empty();
    }
}
