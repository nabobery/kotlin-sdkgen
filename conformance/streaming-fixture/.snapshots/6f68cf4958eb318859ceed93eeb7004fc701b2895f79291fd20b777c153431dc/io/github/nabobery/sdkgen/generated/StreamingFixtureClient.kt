package io.github.nabobery.sdkgen.generated

import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import io.github.nabobery.sdkgen.generated.chat.ChatClient
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.Map

/**
 * Client for Streaming Fixture.
 */
public class StreamingFixtureClient(
  transport: SdkTransport,
  baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  /**
   * Operations tagged/grouped under 'chat'.
   */
  public val chat: ChatClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ChatClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }
}
