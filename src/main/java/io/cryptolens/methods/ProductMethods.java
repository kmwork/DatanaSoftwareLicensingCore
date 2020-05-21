package io.cryptolens.methods;

import io.cryptolens.internal.HelperMethods;
import io.cryptolens.models.GetProductsResult;

import java.util.HashMap;
import java.util.Map;

/**
 * Methods that perform operations on a product. A complete list
 * can be found <a href="https://app.cryptolens.io/docs/api/v3/Product">here</a>.
 */
public class ProductMethods {

    /**
     * This method will return the list of products.
     *
     * @param token An access token with "GetProducts" permission.
     * @return GetProductsResult object if successful and null otherwise.
     */
    public static GetProductsResult GetProducts(String token) {
        Map<String, String> extraParams = new HashMap<>();
        extraParams.put("token", token);

        return HelperMethods.SendRequestToWebAPI("product/GetProducts", new Object(), extraParams, GetProductsResult.class);
    }
}
