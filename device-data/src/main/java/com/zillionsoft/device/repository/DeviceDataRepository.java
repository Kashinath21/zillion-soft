package com.zillionsoft.device.repository;
import com.zillionsoft.device.entity.ConnectedDevices;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceDataRepository extends CassandraRepository<ConnectedDevices,Long> {
}

