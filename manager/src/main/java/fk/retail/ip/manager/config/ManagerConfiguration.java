package fk.retail.ip.manager.config;

import fk.sp.common.extensions.dropwizard.db.HasDataSourceFactory;
import flipkart.retail.server.admin.config.RotationManagementConfig;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ManagerConfiguration extends Configuration implements HasDataSourceFactory {

    private DataSourceFactory dataSource;

    @Valid
    @NotNull
    private RotationManagementConfig rotationManagementConfig;

    @Override
    public DataSourceFactory getDatabaseConfiguration() {
        return dataSource;
    }
}
