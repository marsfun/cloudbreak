package com.sequenceiq.cloudbreak.reactor.api.event.resource;

public class InstallServicesResult extends AbstractClusterScaleResult<InstallServicesRequest> {

    public InstallServicesResult(InstallServicesRequest request) {
        super(request);
    }

    public InstallServicesResult(String statusReason, Exception errorDetails, InstallServicesRequest request) {
        super(statusReason, errorDetails, request);
    }
}