package com.sequenceiq.cloudbreak.converter;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.sequenceiq.cloudbreak.api.model.KerberosRequest;
import com.sequenceiq.cloudbreak.domain.KerberosConfig;
import com.sequenceiq.cloudbreak.type.KerberosType;

@Component
public class KerbersoRequestToKerberosConfigConverter extends AbstractConversionServiceAwareConverter<KerberosRequest, KerberosConfig> {
    @Override
    public KerberosConfig convert(KerberosRequest source) {
        KerberosConfig kerberosConfig = new KerberosConfig();
        kerberosConfig.setType(KerberosType.valueOf(source));
        kerberosConfig.setMasterKey(source.getMasterKey());
        kerberosConfig.setAdmin(source.getAdmin());
        kerberosConfig.setPassword(source.getPassword());
        kerberosConfig.setUrl(source.getUrl());
        kerberosConfig.setAdminUrl(Optional.ofNullable(source.getAdminUrl()).orElse(source.getUrl()));
        kerberosConfig.setRealm(source.getRealm());
        kerberosConfig.setTcpAllowed(source.getTcpAllowed());
        kerberosConfig.setPrincipal(source.getPrincipal());
        kerberosConfig.setLdapUrl(source.getLdapUrl());
        kerberosConfig.setContainerDn(source.getContainerDn());
        kerberosConfig.setDescriptor(source.getDescriptor());
        kerberosConfig.setKrb5Conf(source.getKrb5Conf());
        return kerberosConfig;
    }
}
