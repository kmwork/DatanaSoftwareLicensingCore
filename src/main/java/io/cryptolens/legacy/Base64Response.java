package io.cryptolens.legacy;

@Deprecated
public class Base64Response {
    public byte[] licenseKey;
    public byte[] signature;
    public String message;

    Base64Response(String message) {
        this.message = message;
    }

    Base64Response(byte[] licenseKey, byte[] signature) {
        this.licenseKey = licenseKey;
        this.signature = signature;
    }
}
