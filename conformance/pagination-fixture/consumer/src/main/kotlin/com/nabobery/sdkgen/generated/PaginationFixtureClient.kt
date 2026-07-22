package com.nabobery.sdkgen.generated

import com.nabobery.sdkgen.generated.repos.ReposClient
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.Map

/**
 * Client for Pagination Fixture.
 */
public class PaginationFixtureClient(
  transport: SdkTransport,
  baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  /**
   * Operations tagged/grouped under 'repos'.
   */
  public val repos: ReposClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ReposClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }
}
