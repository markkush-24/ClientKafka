package com.example.clientkafkaapp.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class ClientOrder {

    private int id;

    private String nameClient;

    private String numberPhone;

    private String status;
}
