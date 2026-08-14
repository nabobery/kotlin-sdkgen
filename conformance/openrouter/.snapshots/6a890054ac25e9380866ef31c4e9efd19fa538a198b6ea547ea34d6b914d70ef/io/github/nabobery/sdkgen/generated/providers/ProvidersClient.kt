package io.github.nabobery.sdkgen.generated.providers

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
import com.nabobery.sdkgen.runtime.SdkApiException
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkParameterLocation
import com.nabobery.sdkgen.runtime.SdkRequestParameter
import com.nabobery.sdkgen.runtime.SdkResponseAlternativeDecoder
import com.nabobery.sdkgen.runtime.SdkResponseDecodeResult
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.SecurityRequirement
import com.nabobery.sdkgen.runtime.SecuritySchemeRef
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.SecurityScheme
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeAuthentication
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeBinding
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import io.github.nabobery.sdkgen.generated.InlineProvidersGetResponse200JsonX0103c106
import io.github.nabobery.sdkgen.generated.InternalServerResponse
import io.github.nabobery.sdkgen.generated.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

internal object ProvidersCodecs {
  internal const val LISTPROVIDERS_RESPONSE_CODEC_ID: String = "listProviders.response"

  private val listProvidersResponseCodec: MediaTypeCodec<InlineProvidersGetResponse200JsonX0103c106>
      =
      KotlinxSerializationCodec(LISTPROVIDERS_RESPONSE_CODEC_ID, InlineProvidersGetResponse200JsonX0103c106.Serializer, SdkJson)

  private val listProvidersResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineProvidersGetResponse200JsonX0103c106> =
      KotlinxSerializationCodec("listProviders.response.alternative0", InlineProvidersGetResponse200JsonX0103c106.Serializer, SdkJson)

  internal val listProvidersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineProvidersGetResponse200JsonX0103c106> =
      MediaTypeCodecRegistry.of(listProvidersResponseCodecAlternative0Codec)

  private val listProvidersResponseCodecAlternative1Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listProviders.response.alternative1", InternalServerResponse.Serializer, SdkJson)

  internal val listProvidersResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listProvidersResponseCodecAlternative1Codec)

  internal val listProvidersRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listProvidersResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineProvidersGetResponse200JsonX0103c106> =
      MediaTypeCodecRegistry.of(listProvidersResponseCodec)
}

/**
 * Client for the 'Providers' group of OpenRouter API.
 */
public class ProvidersClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  private val contractSecuritySchemes: Map<String, SecurityScheme> = mapOf(
        "apiKey" to SecurityScheme.HttpBearer(),
      )

  private val authentication: SdkAuthentication? = authentication ?: SecuritySchemeAuthentication(
        bindings =
          contractSecuritySchemes.mapNotNull { (schemeId, scheme) ->
            credentialProviders[schemeId]?.let { provider -> schemeId to SecuritySchemeBinding(scheme, provider) }
          }.toMap(),
        trustedHosts = trustedHosts ?: TrustedHosts.of(baseUri),
      )

  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@ProvidersClient.authentication)

  /**
   * List all providers
   *
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ListProvidersApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded ListProvidersError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listProviders(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlineProvidersGetResponse200JsonX0103c106 = executor.executeWithTypedErrors<Unit, ListProvidersResponse, InlineProvidersGetResponse200JsonX0103c106>(
    request = SdkExecutionRequest(listProvidersMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ProvidersCodecs.listProvidersRequestCodecRegistry,
    responseDecoder = ListProvidersResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ListProvidersResponse.SuccessJson -> response.json
        is ListProvidersResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is ListProvidersResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ListProvidersResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ListProvidersResponse.Http500Json -> ListProvidersApiException(response, statusCode, headers)
        is ListProvidersResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List all providers
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   */
  public suspend fun listProvidersWithResponse(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListProvidersResponse> = executor.executeWithResponse<Unit, ListProvidersResponse>(SdkExecutionRequest(listProvidersMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ProvidersCodecs.listProvidersRequestCodecRegistry, ListProvidersResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `listProviders` may expose through its typed API exception.
   */
  public sealed interface ListProvidersError

  /**
   * Typed response alternatives for `listProviders`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ListProvidersResponse {
    public class SuccessJson(
      public val json: InlineProvidersGetResponse200JsonX0103c106,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListProvidersResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListProvidersResponse,
        ListProvidersError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListProvidersResponse
  }

  /**
   * Raised by `listProviders` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class ListProvidersApiException(
    public val error: ListProvidersError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listProviders")

  private object ListProvidersResponseDecoder : SdkResponseAlternativeDecoder<ListProvidersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListProvidersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListProvidersResponse> = when {
      alternative.id == "listProviders.response.alternative0" -> SdkResponseDecodeResult(
        value = ListProvidersResponse.SuccessJson(
          json = ProvidersCodecs.listProvidersResponseCodecAlternative0Registry.select(listOf("listProviders.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listProviders.response.alternative1" -> SdkResponseDecodeResult(
        value = ListProvidersResponse.Http500Json(
          json = ProvidersCodecs.listProvidersResponseCodecAlternative1Registry.select(listOf("listProviders.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ListProvidersResponse = ListProvidersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val listProvidersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "listProviders",
          method = "GET",
          path = "/providers",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineProvidersGetResponse200JsonX0103c106",
              mode = SdkResponseMode.BUFFERED,
              id = "listProviders.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listProviders.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "apiKey", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }
  }
}
