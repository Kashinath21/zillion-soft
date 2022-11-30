package com.zillionsoft.device.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import java.time.Instant;

@Table
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ConnectedDevices {

    //@PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)
    //private Long seqID;

    @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)
    private Long deviceId;
    @Column
    private Instant timestamp;
    @Column
    private String payload;
    @Column
    private String payload_raw;


}