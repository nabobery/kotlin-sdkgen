package com.nabobery.sdkgen.generated.rerank

import com.nabobery.sdkgen.generated.BadGatewayResponse
import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.EdgeNetworkTimeoutResponse
import com.nabobery.sdkgen.generated.InlinePathsRerankPostRequestBodyContentApplicationJsonSchema
import com.nabobery.sdkgen.generated.InlinePathsRerankPostResponses200ContentApplicationJsonSchema
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.NotFoundResponse
import com.nabobery.sdkgen.generated.PaymentRequiredResponse
import com.nabobery.sdkgen.generated.ProviderOverloadedResponse
import com.nabobery.sdkgen.generated.SdkJson
import com.nabobery.sdkgen.generated.ServiceUnavailableResponse
import com.nabobery.sdkgen.generated.TooManyRequestsResponse
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
import kotlin.collections.List
import kotlin.collections.Map

public object RerankCodecs {
  public const val CREATERERANK_REQUEST_CODEC_ID: String = "createRerank.request"

  private val createRerankRequestCodec:
      MediaTypeCodec<InlinePathsRerankPostRequestBodyContentApplicationJsonSchema> =
      KotlinxSerializationCodec(CREATERERANK_REQUEST_CODEC_ID,
        InlinePathsRerankPostRequestBodyContentApplicationJsonSchema.Serializer, SdkJson)

  public const val CREATERERANK_RESPONSE_CODEC_ID: String = "createRerank.response"

  private val createRerankResponseCodec:
      MediaTypeCodec<InlinePathsRerankPostResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec(CREATERERANK_RESPONSE_CODEC_ID,
        InlinePathsRerankPostResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  private val createRerankResponseCodecAlternative0Codec:
      MediaTypeCodec<InlinePathsRerankPostResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec("createRerank.response.alternative0",
        InlinePathsRerankPostResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  public val createRerankResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlinePathsRerankPostResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(createRerankResponseCodecAlternative0Codec)

  private val createRerankResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createRerank.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val createRerankResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createRerankResponseCodecAlternative1Codec)

  private val createRerankResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createRerank.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val createRerankResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createRerankResponseCodecAlternative2Codec)

  private val createRerankResponseCodecAlternative3Codec: MediaTypeCodec<PaymentRequiredResponse> =
      KotlinxSerializationCodec("createRerank.response.alternative3", PaymentRequiredResponse.Serializer, SdkJson)

  public val createRerankResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<PaymentRequiredResponse> =
      MediaTypeCodecRegistry.of(createRerankResponseCodecAlternative3Codec)

  private val createRerankResponseCodecAlternative4Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("createRerank.response.alternative4", NotFoundResponse.Serializer, SdkJson)

  public val createRerankResponseCodecAlternative4Registry: MediaTypeCodecRegistry<NotFoundResponse>
      = MediaTypeCodecRegistry.of(createRerankResponseCodecAlternative4Codec)

  private val createRerankResponseCodecAlternative5Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("createRerank.response.alternative5", TooManyRequestsResponse.Serializer, SdkJson)

  public val createRerankResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(createRerankResponseCodecAlternative5Codec)

  private val createRerankResponseCodecAlternative6Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createRerank.response.alternative6", InternalServerResponse.Serializer, SdkJson)

  public val createRerankResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createRerankResponseCodecAlternative6Codec)

  private val createRerankResponseCodecAlternative7Codec: MediaTypeCodec<BadGatewayResponse> =
      KotlinxSerializationCodec("createRerank.response.alternative7", BadGatewayResponse.Serializer, SdkJson)

  public val createRerankResponseCodecAlternative7Registry:
      MediaTypeCodecRegistry<BadGatewayResponse> =
      MediaTypeCodecRegistry.of(createRerankResponseCodecAlternative7Codec)

  private val createRerankResponseCodecAlternative8Codec: MediaTypeCodec<ServiceUnavailableResponse>
      =
      KotlinxSerializationCodec("createRerank.response.alternative8", ServiceUnavailableResponse.Serializer, SdkJson)

  public val createRerankResponseCodecAlternative8Registry:
      MediaTypeCodecRegistry<ServiceUnavailableResponse> =
      MediaTypeCodecRegistry.of(createRerankResponseCodecAlternative8Codec)

  private val createRerankResponseCodecAlternative9Codec: MediaTypeCodec<EdgeNetworkTimeoutResponse>
      =
      KotlinxSerializationCodec("createRerank.response.alternative9", EdgeNetworkTimeoutResponse.Serializer, SdkJson)

  public val createRerankResponseCodecAlternative9Registry:
      MediaTypeCodecRegistry<EdgeNetworkTimeoutResponse> =
      MediaTypeCodecRegistry.of(createRerankResponseCodecAlternative9Codec)

  private val createRerankResponseCodecAlternative10Codec:
      MediaTypeCodec<ProviderOverloadedResponse> =
      KotlinxSerializationCodec("createRerank.response.alternative10", ProviderOverloadedResponse.Serializer, SdkJson)

  public val createRerankResponseCodecAlternative10Registry:
      MediaTypeCodecRegistry<ProviderOverloadedResponse> =
      MediaTypeCodecRegistry.of(createRerankResponseCodecAlternative10Codec)

  public val createRerankRequestCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsRerankPostRequestBodyContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(createRerankRequestCodec)

  public val createRerankResponseCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsRerankPostResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(createRerankResponseCodec)
}

/**
 * Client for the 'Rerank' group of OpenRouter API.
 */
public class RerankClient(
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
      SdkExecutor(transport, authentication = this@RerankClient.authentication)

  /**
   * Submits a rerank request to the rerank router
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createRerank(
    request: InlinePathsRerankPostRequestBodyContentApplicationJsonSchema,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlinePathsRerankPostResponses200ContentApplicationJsonSchema = executor
    .execute<InlinePathsRerankPostRequestBodyContentApplicationJsonSchema,
      InlinePathsRerankPostResponses200ContentApplicationJsonSchema>(SdkExecutionRequest(createRerankMetadata, baseUri,
        request, listOf(RerankCodecs.CREATERERANK_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(RerankCodecs.CREATERERANK_RESPONSE_CODEC_ID), RerankCodecs.createRerankRequestCodecRegistry, RerankCodecs
    .createRerankResponseCodecRegistry, options)

  /**
   * Submits a rerank request to the rerank router
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun createRerankWithResponse(
    request: InlinePathsRerankPostRequestBodyContentApplicationJsonSchema,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateRerankResponse> = executor
    .executeWithResponse<InlinePathsRerankPostRequestBodyContentApplicationJsonSchema,
      CreateRerankResponse>(SdkExecutionRequest(createRerankMetadata, baseUri, request, listOf(RerankCodecs
        .CREATERERANK_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), RerankCodecs.createRerankRequestCodecRegistry, CreateRerankResponseDecoder, options)

  /**
   * Typed response alternatives for `createRerank`. Non-success alternatives are not converted into success values.
   */
  public sealed interface CreateRerankResponse {
    public class SuccessJson(
      public val json: InlinePathsRerankPostResponses200ContentApplicationJsonSchema,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateRerankResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateRerankResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateRerankResponse

    public class Http402Json(
      public val json: PaymentRequiredResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateRerankResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateRerankResponse

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateRerankResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateRerankResponse

    public class Http502Json(
      public val json: BadGatewayResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateRerankResponse

    public class Http503Json(
      public val json: ServiceUnavailableResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateRerankResponse

    public class Http524Json(
      public val json: EdgeNetworkTimeoutResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateRerankResponse

    public class Http529Json(
      public val json: ProviderOverloadedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateRerankResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateRerankResponse
  }

  private object CreateRerankResponseDecoder : SdkResponseAlternativeDecoder<CreateRerankResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CreateRerankResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CreateRerankResponse> = when {
      alternative.id == "createRerank.response.alternative0" -> SdkResponseDecodeResult(
        value = CreateRerankResponse.SuccessJson(
          json = RerankCodecs.createRerankResponseCodecAlternative0Registry
            .select(listOf("createRerank.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createRerank.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateRerankResponse.Http400Json(
          json = RerankCodecs.createRerankResponseCodecAlternative1Registry
            .select(listOf("createRerank.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createRerank.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateRerankResponse.Http401Json(
          json = RerankCodecs.createRerankResponseCodecAlternative2Registry
            .select(listOf("createRerank.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createRerank.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateRerankResponse.Http402Json(
          json = RerankCodecs.createRerankResponseCodecAlternative3Registry
            .select(listOf("createRerank.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createRerank.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateRerankResponse.Http404Json(
          json = RerankCodecs.createRerankResponseCodecAlternative4Registry
            .select(listOf("createRerank.response.alternative4"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createRerank.response.alternative5" -> SdkResponseDecodeResult(
        value = CreateRerankResponse.Http429Json(
          json = RerankCodecs.createRerankResponseCodecAlternative5Registry
            .select(listOf("createRerank.response.alternative5"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createRerank.response.alternative6" -> SdkResponseDecodeResult(
        value = CreateRerankResponse.Http500Json(
          json = RerankCodecs.createRerankResponseCodecAlternative6Registry
            .select(listOf("createRerank.response.alternative6"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createRerank.response.alternative7" -> SdkResponseDecodeResult(
        value = CreateRerankResponse.Http502Json(
          json = RerankCodecs.createRerankResponseCodecAlternative7Registry
            .select(listOf("createRerank.response.alternative7"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createRerank.response.alternative8" -> SdkResponseDecodeResult(
        value = CreateRerankResponse.Http503Json(
          json = RerankCodecs.createRerankResponseCodecAlternative8Registry
            .select(listOf("createRerank.response.alternative8"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createRerank.response.alternative9" -> SdkResponseDecodeResult(
        value = CreateRerankResponse.Http524Json(
          json = RerankCodecs.createRerankResponseCodecAlternative9Registry
            .select(listOf("createRerank.response.alternative9"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createRerank.response.alternative10" -> SdkResponseDecodeResult(
        value = CreateRerankResponse.Http529Json(
          json = RerankCodecs.createRerankResponseCodecAlternative10Registry
            .select(listOf("createRerank.response.alternative10"), mediaType ?: "application/json").decode(body,
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
    ): CreateRerankResponse = CreateRerankResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val createRerankMetadata: OperationMetadata = OperationMetadata(
          operationId = "createRerank",
          method = "POST",
          path = "/rerank",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlinePathsRerankPostResponses200ContentApplicationJsonSchema",
              mode = SdkResponseMode.BUFFERED,
              id = "createRerank.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createRerank.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createRerank.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 402),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentRequiredResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createRerank.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createRerank.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createRerank.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createRerank.response.alternative6",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 502),
              mediaTypes = listOf("application/json"),
              typeTag = "BadGatewayResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createRerank.response.alternative7",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "ServiceUnavailableResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createRerank.response.alternative8",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 524),
              mediaTypes = listOf("application/json"),
              typeTag = "EdgeNetworkTimeoutResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createRerank.response.alternative9",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 529),
              mediaTypes = listOf("application/json"),
              typeTag = "ProviderOverloadedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createRerank.response.alternative10",
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
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        )
  }
}
