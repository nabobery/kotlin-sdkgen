package io.github.nabobery.sdkgen.generated

import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import io.github.nabobery.sdkgen.generated.analytics.AnalyticsClient
import io.github.nabobery.sdkgen.generated.apikeys.ApiKeysClient
import io.github.nabobery.sdkgen.generated.benchmarks.BenchmarksClient
import io.github.nabobery.sdkgen.generated.betaanalytics.BetaAnalyticsClient
import io.github.nabobery.sdkgen.generated.byok.ByokClient
import io.github.nabobery.sdkgen.generated.chat.ChatClient
import io.github.nabobery.sdkgen.generated.classifications.ClassificationsClient
import io.github.nabobery.sdkgen.generated.credits.CreditsClient
import io.github.nabobery.sdkgen.generated.datasets.DatasetsClient
import io.github.nabobery.sdkgen.generated.embeddings.EmbeddingsClient
import io.github.nabobery.sdkgen.generated.endpoints.EndpointsClient
import io.github.nabobery.sdkgen.generated.files.FilesClient
import io.github.nabobery.sdkgen.generated.generations.GenerationsClient
import io.github.nabobery.sdkgen.generated.guardrails.GuardrailsClient
import io.github.nabobery.sdkgen.generated.images.ImagesClient
import io.github.nabobery.sdkgen.generated.models.ModelsClient
import io.github.nabobery.sdkgen.generated.oauth.OAuthClient
import io.github.nabobery.sdkgen.generated.observability.ObservabilityClient
import io.github.nabobery.sdkgen.generated.organization.OrganizationClient
import io.github.nabobery.sdkgen.generated.presets.PresetsClient
import io.github.nabobery.sdkgen.generated.providers.ProvidersClient
import io.github.nabobery.sdkgen.generated.rerank.RerankClient
import io.github.nabobery.sdkgen.generated.tts.TtsClient
import io.github.nabobery.sdkgen.generated.videogeneration.VideoGenerationClient
import io.github.nabobery.sdkgen.generated.workspaces.WorkspacesClient
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.Map

/**
 * Client for OpenRouter API.
 */
public class OpenRouterClient(
  transport: SdkTransport,
  baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  /**
   * Operations tagged/grouped under 'Analytics'.
   */
  public val analytics: AnalyticsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        AnalyticsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'API Keys'.
   */
  public val apiKeys: ApiKeysClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ApiKeysClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'Benchmarks'.
   */
  public val benchmarks: BenchmarksClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        BenchmarksClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'beta.Analytics'.
   */
  public val betaAnalytics: BetaAnalyticsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        BetaAnalyticsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'BYOK'.
   */
  public val byok: ByokClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ByokClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'Chat'.
   */
  public val chat: ChatClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ChatClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'Classifications'.
   */
  public val classifications: ClassificationsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ClassificationsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'Credits'.
   */
  public val credits: CreditsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        CreditsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'Datasets'.
   */
  public val datasets: DatasetsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        DatasetsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'Embeddings'.
   */
  public val embeddings: EmbeddingsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        EmbeddingsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'Endpoints'.
   */
  public val endpoints: EndpointsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        EndpointsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'Files'.
   */
  public val files: FilesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        FilesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'Generations'.
   */
  public val generations: GenerationsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        GenerationsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'Guardrails'.
   */
  public val guardrails: GuardrailsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        GuardrailsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'Images'.
   */
  public val images: ImagesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ImagesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'Models'.
   */
  public val models: ModelsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ModelsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'OAuth'.
   */
  public val oAuth: OAuthClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        OAuthClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'Observability'.
   */
  public val observability: ObservabilityClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ObservabilityClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'Organization'.
   */
  public val organization: OrganizationClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        OrganizationClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'Presets'.
   */
  public val presets: PresetsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        PresetsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'Providers'.
   */
  public val providers: ProvidersClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ProvidersClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'Rerank'.
   */
  public val rerank: RerankClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        RerankClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'TTS'.
   */
  public val tts: TtsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        TtsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'Video Generation'.
   */
  public val videoGeneration: VideoGenerationClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        VideoGenerationClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'Workspaces'.
   */
  public val workspaces: WorkspacesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        WorkspacesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }
}
