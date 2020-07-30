package cn.ac.caict.iiiiot.id.client.adapter;

public class IDAdapterFactory {

    private static IDAdapter cachedPrefixIDAdapter = new CachedPrefixIDAdapter();

    public static IDAdapter cachedInstance() {
        return cachedPrefixIDAdapter;
    }

    public static IDAdapter newInstance() {
        return new DefaultIDAdapter();
    }

    public static IDAdapter cachedInstance(final String adminIdentifier, final int keyIndex, final String privateKeyPem, int cipher) {
        return new DefaultIDAdapter(adminIdentifier, keyIndex, privateKeyPem, cipher);
    }


    public static IDAdapter cachedInstance(final String serverPrefix, final String adminIdentifier, final int keyIndex, final String privateKeyPem, int cipher) {
        return new DefaultIDAdapter(serverPrefix, adminIdentifier, keyIndex, privateKeyPem, cipher);
    }


    public static IDAdapter cachedInstance(String serverIp, int port, final String adminIdentifier, final int keyIndex, final String privateKeyPem, int cipher) {
        return new DefaultIDAdapter(serverIp, port, adminIdentifier, keyIndex, privateKeyPem, cipher);
    }


    public static IDAdapter cachedInstance(String serverIp, int port) {
        return new DefaultIDAdapter(serverIp, port);
    }




//    public static IDAdapter newInstance(final String adminIdentifier, final int keyIndex, final byte[] secretKey) {
//        return new DefaultIDAdapter();
//    }

//
//    public static IDAdapter newInstance(final String serverPrefix,final String adminIdentifier, final int keyIndex, final byte[] secretKey) {
//        return new DefaultIDAdapter();
//    }

}