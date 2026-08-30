package com.nabobery.sdkgen.generated.events

import com.nabobery.sdkgen.generated.EventChunk
import com.nabobery.sdkgen.generated.EventSubscription
import com.nabobery.sdkgen.generated.SdkJson
import com.nabobery.sdkgen.runtime.BackoffHints
import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.KotlinxSerializationCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodecRegistry
import com.nabobery.sdkgen.runtime.OperationMetadata
import com.nabobery.sdkgen.runtime.OperationSafety
import com.nabobery.sdkgen.runtime.ResponseAlternative
import com.nabobery.sdkgen.runtime.ResponseSelector
import com.nabobery.sdkgen.runtime.RetryDescriptor
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkClientConfig
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.SecurityRequirement
import com.nabobery.sdkgen.runtime.SecuritySchemeRef
import com.nabobery.sdkgen.runtime.StreamingDescriptor
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.SecurityScheme
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeAuthentication
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeBinding
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import com.nabobery.sdkgen.runtime.streaming.decodeData
import com.nabobery.sdkgen.runtime.streaming.sseFlow
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlinx.coroutines.flow.Flow

internal object EventsCodecs {
  internal const val SUBSCRIBEEVENTS_REQUEST_CODEC_ID: String = "subscribeEvents.request"

  private val subscribeEventsRequestCodec: MediaTypeCodec<EventSubscription> =
      KotlinxSerializationCodec(SUBSCRIBEEVENTS_REQUEST_CODEC_ID, EventSubscription.Serializer, SdkJson)

  internal val subscribeEventsRequestCodecRegistry: MediaTypeCodecRegistry<EventSubscription> =
      MediaTypeCodecRegistry.of(subscribeEventsRequestCodec)

  internal val subscribeEventsResponseCodecRegistry: MediaTypeCodecRegistry<EventChunk> =
      MediaTypeCodecRegistry.of()
}

/**
 * Client for the 'events' group of Streaming Fixture.
 */
public class EventsClient private constructor(
  transport: SdkTransport,
  private val baseUri: String,
  private val clientConfig: SdkClientConfig,
  credentialProviders: Map<String, CredentialProvider>,
  trustedHosts: TrustedHosts?,
  authentication: SdkAuthentication?,
  marker: Unit,
) {
  private val contractSecuritySchemes: Map<String, SecurityScheme> = mapOf(
        "apiKey" to SecurityScheme.ApiKey(location = SecurityScheme.ApiKeyLocation.HEADER, parameterName = "Authorization"),
      )

  private val authentication: SdkAuthentication? = authentication ?: SecuritySchemeAuthentication(
        bindings =
          contractSecuritySchemes.mapNotNull { (schemeId, scheme) ->
            credentialProviders[schemeId]?.let { provider -> schemeId to SecuritySchemeBinding(scheme, provider) }
          }.toMap(),
        trustedHosts = trustedHosts ?: TrustedHosts.of(baseUri),
      )

  private val executor: SdkExecutor = SdkExecutor(
        transport,
        authentication = this@EventsClient.authentication,
        requestHook = clientConfig.requestHook,
        retryBudget = clientConfig.retryBudget,
        logicalMiddleware = clientConfig.logicalMiddleware,
        attemptMiddleware = clientConfig.attemptMiddleware,
        observers = clientConfig.observers,
        productToken = clientConfig.productToken ?: SdkExecutor.DEFAULT_PRODUCT_TOKEN,
      )

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

  /**
   * Streams events whose spec models each SSE event as an envelope around a `payload` property.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return A cold flow decoded by the declared streaming descriptor.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or stream item cannot be decoded.
   * @throws SdkStreamingException When the stream framing or declared in-band error fails.
   */
  public fun subscribeEvents(request: EventSubscription, options: CallOptions = CallOptions()): Flow<EventChunk> = sseFlow(
    streamProvider = {
      executor.executeRaw<EventSubscription>(SdkExecutionRequest(subscribeEventsMetadata, baseUri, request, listOf(EventsCodecs.SUBSCRIBEEVENTS_REQUEST_CODEC_ID), emptyList()), EventsCodecs.subscribeEventsRequestCodecRegistry, clientConfig.resolveCallOptions(options))
    },
    descriptor = requireNotNull(subscribeEventsMetadata.streaming as? StreamingDescriptor.ServerSentEvents),
  ).decodeData { data -> SdkJson.decodeFromString(EventChunk.Serializer, data) }

  public companion object {
    internal val subscribeEventsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "subscribeEvents",
          method = "POST",
          path = "/events",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("text/event-stream"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.STREAMING,
          deadlines = SdkDeadlines(null, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("text/event-stream"),
              typeTag = "EventChunk",
              mode = SdkResponseMode.STREAMING,
              id = "subscribeEvents.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "ErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "subscribeEvents.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "apiKey", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 3,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = StreamingDescriptor.ServerSentEvents(terminalSentinel = "[DONE]", inBandError = null, requestFlag = null, responseContentType = "text/event-stream"),
        ) }
  }
}
