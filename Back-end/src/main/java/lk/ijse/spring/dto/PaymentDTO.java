package lk.ijse.spring.dto;

import lk.ijse.spring.entity.Rent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaymentDTO {

    private String payment_Id;
    private String paymentType;
    private LocalDate payment_date;
    private LocalTime payment_time;
    private Double lostDamage;
    private Double rentCost;
    private Double driverCost;
    private Double total;
    private Rent rent_Id;
}
