package com.nabobery.sdkgen.generated

import com.nabobery.sdkgen.generated.chat.ChatClient
import com.nabobery.sdkgen.generated.events.EventsClient
import com.nabobery.sdkgen.generated.files.FilesClient
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
 * Client for Streaming Fixture.
 */
public class StreamingFixtureClient private constructor(
  transport: SdkTransport,
  baseUri: String,
  private val clientConfig: SdkClientConfig,
  credentialProviders: Map<String, CredentialProvider>,
  trustedHosts: TrustedHosts?,
  authentication: SdkAuthentication?,
  marker: Unit,
) {
  /**
   * Operations tagged/grouped under 'chat'.
   */
  public val chat: ChatClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ChatClient(transport, baseUri, clientConfig, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'events'.
   */
  public val events: EventsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        EventsClient(transport, baseUri, clientConfig, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'files'.
   */
  public val files: FilesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        FilesClient(transport, baseUri, clientConfig, credentialProviders, trustedHosts, authentication)
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
