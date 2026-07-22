package com.nabobery.sdkgen.generated.credits

import com.nabobery.sdkgen.generated.ForbiddenResponse
import com.nabobery.sdkgen.generated.GoneResponse
import com.nabobery.sdkgen.generated.InlinePathsCreditsGetResponses200ContentApplicationJsonSchema
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.SdkJson
import com.nabobery.sdkgen.generated.UnauthorizedResponse
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

public object CreditsCodecs {
  private val createCoinbaseChargeResponseCodecAlternative1Codec: MediaTypeCodec<GoneResponse> =
      KotlinxSerializationCodec("createCoinbaseCharge.response.alternative1", GoneResponse.Serializer, SdkJson)

  public val createCoinbaseChargeResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<GoneResponse> =
      MediaTypeCodecRegistry.of(createCoinbaseChargeResponseCodecAlternative1Codec)

  public val createCoinbaseChargeRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val createCoinbaseChargeResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public const val GETCREDITS_RESPONSE_CODEC_ID: String = "getCredits.response"

  private val getCreditsResponseCodec:
      MediaTypeCodec<InlinePathsCreditsGetResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec(GETCREDITS_RESPONSE_CODEC_ID,
        InlinePathsCreditsGetResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  private val getCreditsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlinePathsCreditsGetResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec("getCredits.response.alternative0",
        InlinePathsCreditsGetResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  public val getCreditsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlinePathsCreditsGetResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(getCreditsResponseCodecAlternative0Codec)

  private val getCreditsResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getCredits.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  public val getCreditsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getCreditsResponseCodecAlternative1Codec)

  private val getCreditsResponseCodecAlternative2Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("getCredits.response.alternative2", ForbiddenResponse.Serializer, SdkJson)

  public val getCreditsResponseCodecAlternative2Registry: MediaTypeCodecRegistry<ForbiddenResponse>
      = MediaTypeCodecRegistry.of(getCreditsResponseCodecAlternative2Codec)

  private val getCreditsResponseCodecAlternative3Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getCredits.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  public val getCreditsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getCreditsResponseCodecAlternative3Codec)

  public val getCreditsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val getCreditsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsCreditsGetResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(getCreditsResponseCodec)
}

/**
 * Client for the 'Credits' group of OpenRouter API.
 */
public class CreditsClient(
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
      SdkExecutor(transport, authentication = this@CreditsClient.authentication)

  /**
   * Deprecated. The Coinbase APIs used by this endpoint have been deprecated, so Coinbase Commerce charges have been
   * removed. Use the web credits purchase flow instead.
   *
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createCoinbaseCharge(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(createCoinbaseChargeMetadata, baseUri, Unit,
    emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), CreditsCodecs.createCoinbaseChargeRequestCodecRegistry, options)

  /**
   * Deprecated. The Coinbase APIs used by this endpoint have been deprecated, so Coinbase Commerce charges have been
   * removed. Use the web credits purchase flow instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun createCoinbaseChargeWithResponse(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateCoinbaseChargeResponse> = executor.executeWithResponse<Unit,
    CreateCoinbaseChargeResponse>(SdkExecutionRequest(createCoinbaseChargeMetadata, baseUri, Unit, emptyList(),
      buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), CreditsCodecs.createCoinbaseChargeRequestCodecRegistry, CreateCoinbaseChargeResponseDecoder, options)

  /**
   * Get total credits purchased and used for the authenticated user. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getCredits(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlinePathsCreditsGetResponses200ContentApplicationJsonSchema = executor.execute<Unit,
    InlinePathsCreditsGetResponses200ContentApplicationJsonSchema>(SdkExecutionRequest(getCreditsMetadata, baseUri,
      Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(CreditsCodecs.GETCREDITS_RESPONSE_CODEC_ID), CreditsCodecs.getCreditsRequestCodecRegistry, CreditsCodecs
    .getCreditsResponseCodecRegistry, options)

  /**
   * Get total credits purchased and used for the authenticated user. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun getCreditsWithResponse(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCreditsResponse> = executor.executeWithResponse<Unit,
    GetCreditsResponse>(SdkExecutionRequest(getCreditsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), CreditsCodecs.getCreditsRequestCodecRegistry, GetCreditsResponseDecoder, options)

  /**
   * Typed response alternatives for `createCoinbaseCharge`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface CreateCoinbaseChargeResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateCoinbaseChargeResponse

    public class Http410Json(
      public val json: GoneResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateCoinbaseChargeResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateCoinbaseChargeResponse
  }

  private object CreateCoinbaseChargeResponseDecoder : SdkResponseAlternativeDecoder<CreateCoinbaseChargeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CreateCoinbaseChargeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CreateCoinbaseChargeResponse> = when {
      alternative.id == "createCoinbaseCharge.response.alternative0" -> SdkResponseDecodeResult(
        value = CreateCoinbaseChargeResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createCoinbaseCharge.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateCoinbaseChargeResponse.Http410Json(
          json = CreditsCodecs.createCoinbaseChargeResponseCodecAlternative1Registry
            .select(listOf("createCoinbaseCharge.response.alternative1"), mediaType ?: "application/json").decode(body,
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
    ): CreateCoinbaseChargeResponse = CreateCoinbaseChargeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `getCredits`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetCreditsResponse {
    public class SuccessJson(
      public val json: InlinePathsCreditsGetResponses200ContentApplicationJsonSchema,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCreditsResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCreditsResponse

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCreditsResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCreditsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCreditsResponse
  }

  private object GetCreditsResponseDecoder : SdkResponseAlternativeDecoder<GetCreditsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCreditsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCreditsResponse> = when {
      alternative.id == "getCredits.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCreditsResponse.SuccessJson(
          json = CreditsCodecs.getCreditsResponseCodecAlternative0Registry
            .select(listOf("getCredits.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getCredits.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCreditsResponse.Http401Json(
          json = CreditsCodecs.getCreditsResponseCodecAlternative1Registry
            .select(listOf("getCredits.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getCredits.response.alternative2" -> SdkResponseDecodeResult(
        value = GetCreditsResponse.Http403Json(
          json = CreditsCodecs.getCreditsResponseCodecAlternative2Registry
            .select(listOf("getCredits.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getCredits.response.alternative3" -> SdkResponseDecodeResult(
        value = GetCreditsResponse.Http500Json(
          json = CreditsCodecs.getCreditsResponseCodecAlternative3Registry
            .select(listOf("getCredits.response.alternative3"), mediaType ?: "application/json").decode(body,
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
    ): GetCreditsResponse = GetCreditsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val createCoinbaseChargeMetadata: OperationMetadata = OperationMetadata(
          operationId = "createCoinbaseCharge",
          method = "POST",
          path = "/credits/coinbase",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "createCoinbaseCharge.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 410),
              mediaTypes = listOf("application/json"),
              typeTag = "GoneResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createCoinbaseCharge.response.alternative1",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        )

    public val getCreditsMetadata: OperationMetadata = OperationMetadata(
          operationId = "getCredits",
          method = "GET",
          path = "/credits",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlinePathsCreditsGetResponses200ContentApplicationJsonSchema",
              mode = SdkResponseMode.BUFFERED,
              id = "getCredits.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getCredits.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getCredits.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getCredits.response.alternative3",
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
