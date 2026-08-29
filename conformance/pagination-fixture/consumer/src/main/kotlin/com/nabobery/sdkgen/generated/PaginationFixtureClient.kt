package com.nabobery.sdkgen.generated

import com.nabobery.sdkgen.generated.repos.ReposClient
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkClientConfig
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Client for Pagination Fixture.
 */
public class PaginationFixtureClient private constructor(
  transport: SdkTransport,
  baseUri: String,
  private val clientConfig: SdkClientConfig,
  credentialProviders: Map<String, CredentialProvider>,
  trustedHosts: TrustedHosts?,
  authentication: SdkAuthentication?,
  marker: Unit,
) {
  /**
   * Operations tagged/grouped under 'repos'.
   */
  public val repos: ReposClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ReposClient(transport, baseUri, clientConfig, credentialProviders, trustedHosts, authentication)
      }

  public constructor(
    transport: SdkTransport,
    baseUri: String,
    credentialProviders: Map<String, CredentialProvider> = emptyMap(),
    trustedHosts: TrustedHosts? = null,
    authentication: SdkAuthentication? = null,
  ) : this(transport, baseUri, SdkClientConfig(), credentialProviders, trustedHosts, authentication, Unit)

  public constructor(
    transport: SdkTransport,
    baseUri: String,
    clientConfig: SdkClientConfig,
    credentialProviders: Map<String, CredentialProvider> = emptyMap(),
    trustedHosts: TrustedHosts? = null,
    authentication: SdkAuthentication? = null,
  ) : this(transport, baseUri, clientConfig, credentialProviders, trustedHosts, authentication, Unit)
}
