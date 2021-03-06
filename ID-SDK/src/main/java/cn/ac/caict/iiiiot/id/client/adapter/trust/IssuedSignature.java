package cn.ac.caict.iiiiot.id.client.adapter.trust;

import cn.ac.caict.iiiiot.id.client.security.Permission;

import java.security.PublicKey;
import java.util.List;

public class IssuedSignature {
    public JWS jws;
    public PublicKey issuerPublicKey;
    public List<Permission> issuerPermissions;

    public IssuedSignature(JWS jws, PublicKey issuerPublicKey, List<Permission> issuerPermissions) {
        this.jws = jws;
        this.issuerPublicKey = issuerPublicKey;
        this.issuerPermissions = issuerPermissions;
    }
}