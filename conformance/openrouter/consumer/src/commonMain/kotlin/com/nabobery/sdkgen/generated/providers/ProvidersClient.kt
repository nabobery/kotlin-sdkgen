package com.nabobery.sdkgen.generated.providers

import com.nabobery.sdkgen.generated.InlinePathsProvidersGetResponses200ContentApplicationJsonSchema
import com.nabobery.sdkgen.generated.InternalServerResponse
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public object ProvidersCodecs {
  public const val LISTPROVIDERS_RESPONSE_CODEC_ID: String = "listProviders.response"

  private val listProvidersResponseCodec:
      MediaTypeCodec<InlinePathsProvidersGetResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec(LISTPROVIDERS_RESPONSE_CODEC_ID,
        InlinePathsProvidersGetResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  private val listProvidersResponseCodecAlternative0Codec:
      MediaTypeCodec<InlinePathsProvidersGetResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec("listProviders.response.alternative0",
        InlinePathsProvidersGetResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  public val listProvidersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlinePathsProvidersGetResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(listProvidersResponseCodecAlternative0Codec)

  private val listProvidersResponseCodecAlternative1Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listProviders.response.alternative1", InternalServerResponse.Serializer, SdkJson)

  public val listProvidersResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listProvidersResponseCodecAlternative1Codec)

  public val listProvidersRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listProvidersResponseCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsProvidersGetResponses200ContentApplicationJsonSchema> =
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
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listProviders(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlinePathsProvidersGetResponses200ContentApplicationJsonSchema = executor.execute<Unit,
    InlinePathsProvidersGetResponses200ContentApplicationJsonSchema>(SdkExecutionRequest(listProvidersMetadata,
      baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ProvidersCodecs.LISTPROVIDERS_RESPONSE_CODEC_ID), ProvidersCodecs.listProvidersRequestCodecRegistry,
    ProvidersCodecs.listProvidersResponseCodecRegistry, options)

  /**
   * List all providers
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listProvidersWithResponse(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListProvidersResponse> = executor.executeWithResponse<Unit,
    ListProvidersResponse>(SdkExecutionRequest(listProvidersMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ProvidersCodecs.listProvidersRequestCodecRegistry, ListProvidersResponseDecoder, options)

  /**
   * Typed response alternatives for `listProviders`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ListProvidersResponse {
    public class SuccessJson(
      public val json: InlinePathsProvidersGetResponses200ContentApplicationJsonSchema,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListProvidersResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListProvidersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListProvidersResponse
  }

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
          json = ProvidersCodecs.listProvidersResponseCodecAlternative0Registry
            .select(listOf("listProviders.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listProviders.response.alternative1" -> SdkResponseDecodeResult(
        value = ListProvidersResponse.Http500Json(
          json = ProvidersCodecs.listProvidersResponseCodecAlternative1Registry
            .select(listOf("listProviders.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
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
    public val listProvidersMetadata: OperationMetadata = OperationMetadata(
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
              typeTag = "InlinePathsProvidersGetResponses200ContentApplicationJsonSchema",
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
        )
  }
}
