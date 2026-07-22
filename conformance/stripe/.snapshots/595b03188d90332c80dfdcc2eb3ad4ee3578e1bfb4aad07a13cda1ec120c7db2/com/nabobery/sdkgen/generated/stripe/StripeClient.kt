package com.nabobery.sdkgen.generated.stripe

import com.nabobery.sdkgen.generated.stripe.v1.V1Client
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.Map

/**
 * Client for Stripe API.
 */
public class StripeClient(
    transport: SdkTransport,
    baseUri: String,
    credentialProviders: Map<String, CredentialProvider> = emptyMap(),
    trustedHosts: TrustedHosts? = null,
    authentication: SdkAuthentication? = null,
) {
    /**
     * Operations tagged/grouped under 'v1'.
     */
    public val v1: V1Client by lazy(LazyThreadSafetyMode.PUBLICATION) {
        V1Client(transport, baseUri, credentialProviders, trustedHosts, authentication)
    }
}
