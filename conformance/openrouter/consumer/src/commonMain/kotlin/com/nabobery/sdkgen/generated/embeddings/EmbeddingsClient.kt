package com.nabobery.sdkgen.generated.embeddings

import com.nabobery.sdkgen.generated.BadGatewayResponse
import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.EdgeNetworkTimeoutResponse
import com.nabobery.sdkgen.generated.InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema
import com.nabobery.sdkgen.generated.InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.ModelsListResponse
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
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public object EmbeddingsCodecs {
  public const val CREATEEMBEDDINGS_REQUEST_CODEC_ID: String = "createEmbeddings.request"

  private val createEmbeddingsRequestCodec:
      MediaTypeCodec<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema> =
      KotlinxSerializationCodec(CREATEEMBEDDINGS_REQUEST_CODEC_ID,
        InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema.Serializer, SdkJson)

  public const val CREATEEMBEDDINGS_RESPONSE_CODEC_ID: String = "createEmbeddings.response"

  private val createEmbeddingsResponseCodec:
      MediaTypeCodec<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec(CREATEEMBEDDINGS_RESPONSE_CODEC_ID,
        InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  private val createEmbeddingsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec("createEmbeddings.response.alternative0",
        InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  public val createEmbeddingsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(createEmbeddingsResponseCodecAlternative0Codec)

  private val createEmbeddingsResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createEmbeddings.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val createEmbeddingsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createEmbeddingsResponseCodecAlternative1Codec)

  private val createEmbeddingsResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createEmbeddings.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val createEmbeddingsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createEmbeddingsResponseCodecAlternative2Codec)

  private val createEmbeddingsResponseCodecAlternative3Codec:
      MediaTypeCodec<PaymentRequiredResponse> =
      KotlinxSerializationCodec("createEmbeddings.response.alternative3", PaymentRequiredResponse.Serializer, SdkJson)

  public val createEmbeddingsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<PaymentRequiredResponse> =
      MediaTypeCodecRegistry.of(createEmbeddingsResponseCodecAlternative3Codec)

  private val createEmbeddingsResponseCodecAlternative4Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("createEmbeddings.response.alternative4", NotFoundResponse.Serializer, SdkJson)

  public val createEmbeddingsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(createEmbeddingsResponseCodecAlternative4Codec)

  private val createEmbeddingsResponseCodecAlternative5Codec:
      MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("createEmbeddings.response.alternative5", TooManyRequestsResponse.Serializer, SdkJson)

  public val createEmbeddingsResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(createEmbeddingsResponseCodecAlternative5Codec)

  private val createEmbeddingsResponseCodecAlternative6Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("createEmbeddings.response.alternative6", InternalServerResponse.Serializer, SdkJson)

  public val createEmbeddingsResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createEmbeddingsResponseCodecAlternative6Codec)

  private val createEmbeddingsResponseCodecAlternative7Codec: MediaTypeCodec<BadGatewayResponse> =
      KotlinxSerializationCodec("createEmbeddings.response.alternative7", BadGatewayResponse.Serializer, SdkJson)

  public val createEmbeddingsResponseCodecAlternative7Registry:
      MediaTypeCodecRegistry<BadGatewayResponse> =
      MediaTypeCodecRegistry.of(createEmbeddingsResponseCodecAlternative7Codec)

  private val createEmbeddingsResponseCodecAlternative8Codec:
      MediaTypeCodec<ServiceUnavailableResponse> =
      KotlinxSerializationCodec("createEmbeddings.response.alternative8", ServiceUnavailableResponse.Serializer,
        SdkJson)

  public val createEmbeddingsResponseCodecAlternative8Registry:
      MediaTypeCodecRegistry<ServiceUnavailableResponse> =
      MediaTypeCodecRegistry.of(createEmbeddingsResponseCodecAlternative8Codec)

  private val createEmbeddingsResponseCodecAlternative9Codec:
      MediaTypeCodec<EdgeNetworkTimeoutResponse> =
      KotlinxSerializationCodec("createEmbeddings.response.alternative9", EdgeNetworkTimeoutResponse.Serializer,
        SdkJson)

  public val createEmbeddingsResponseCodecAlternative9Registry:
      MediaTypeCodecRegistry<EdgeNetworkTimeoutResponse> =
      MediaTypeCodecRegistry.of(createEmbeddingsResponseCodecAlternative9Codec)

  private val createEmbeddingsResponseCodecAlternative10Codec:
      MediaTypeCodec<ProviderOverloadedResponse> =
      KotlinxSerializationCodec("createEmbeddings.response.alternative10", ProviderOverloadedResponse.Serializer,
        SdkJson)

  public val createEmbeddingsResponseCodecAlternative10Registry:
      MediaTypeCodecRegistry<ProviderOverloadedResponse> =
      MediaTypeCodecRegistry.of(createEmbeddingsResponseCodecAlternative10Codec)

  public val createEmbeddingsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(createEmbeddingsRequestCodec)

  public val createEmbeddingsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(createEmbeddingsResponseCodec)

  public const val LISTEMBEDDINGSMODELS_RESPONSE_CODEC_ID: String = "listEmbeddingsModels.response"

  private val listEmbeddingsModelsResponseCodec: MediaTypeCodec<ModelsListResponse> =
      KotlinxSerializationCodec(LISTEMBEDDINGSMODELS_RESPONSE_CODEC_ID, ModelsListResponse.Serializer, SdkJson)

  private val listEmbeddingsModelsResponseCodecAlternative0Codec: MediaTypeCodec<ModelsListResponse>
      =
      KotlinxSerializationCodec("listEmbeddingsModels.response.alternative0", ModelsListResponse.Serializer, SdkJson)

  public val listEmbeddingsModelsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ModelsListResponse> =
      MediaTypeCodecRegistry.of(listEmbeddingsModelsResponseCodecAlternative0Codec)

  private val listEmbeddingsModelsResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse>
      =
      KotlinxSerializationCodec("listEmbeddingsModels.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val listEmbeddingsModelsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(listEmbeddingsModelsResponseCodecAlternative1Codec)

  private val listEmbeddingsModelsResponseCodecAlternative2Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listEmbeddingsModels.response.alternative2", InternalServerResponse.Serializer,
        SdkJson)

  public val listEmbeddingsModelsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listEmbeddingsModelsResponseCodecAlternative2Codec)

  public val listEmbeddingsModelsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listEmbeddingsModelsResponseCodecRegistry: MediaTypeCodecRegistry<ModelsListResponse> =
      MediaTypeCodecRegistry.of(listEmbeddingsModelsResponseCodec)
}

/**
 * Client for the 'Embeddings' group of OpenRouter API.
 */
public class EmbeddingsClient(
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
      SdkExecutor(transport, authentication = this@EmbeddingsClient.authentication)

  /**
   * Submits an embedding request to the embeddings router
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createEmbeddings(
    request: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema = executor
    .execute<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema,
      InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema>(SdkExecutionRequest(createEmbeddingsMetadata,
        baseUri, request, listOf(EmbeddingsCodecs.CREATEEMBEDDINGS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(EmbeddingsCodecs.CREATEEMBEDDINGS_RESPONSE_CODEC_ID), EmbeddingsCodecs
    .createEmbeddingsRequestCodecRegistry, EmbeddingsCodecs.createEmbeddingsResponseCodecRegistry, options)

  /**
   * Submits an embedding request to the embeddings router
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun createEmbeddingsWithResponse(
    request: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateEmbeddingsResponse> = executor
    .executeWithResponse<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchema,
      CreateEmbeddingsResponse>(SdkExecutionRequest(createEmbeddingsMetadata, baseUri, request, listOf(EmbeddingsCodecs
        .CREATEEMBEDDINGS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), EmbeddingsCodecs.createEmbeddingsRequestCodecRegistry, CreateEmbeddingsResponseDecoder, options)

  /**
   * Returns a list of all available embeddings models and their properties
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listEmbeddingsModels(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): ModelsListResponse = executor.execute<Unit, ModelsListResponse>(SdkExecutionRequest(listEmbeddingsModelsMetadata,
    baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(EmbeddingsCodecs.LISTEMBEDDINGSMODELS_RESPONSE_CODEC_ID), EmbeddingsCodecs
    .listEmbeddingsModelsRequestCodecRegistry, EmbeddingsCodecs.listEmbeddingsModelsResponseCodecRegistry, options)

  /**
   * Returns a list of all available embeddings models and their properties
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listEmbeddingsModelsWithResponse(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListEmbeddingsModelsResponse> = executor.executeWithResponse<Unit,
    ListEmbeddingsModelsResponse>(SdkExecutionRequest(listEmbeddingsModelsMetadata, baseUri, Unit, emptyList(),
      buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), EmbeddingsCodecs.listEmbeddingsModelsRequestCodecRegistry, ListEmbeddingsModelsResponseDecoder, options)

  /**
   * Typed response alternatives for `createEmbeddings`. Non-success alternatives are not converted into success values.
   */
  public sealed interface CreateEmbeddingsResponse {
    public class SuccessJson(
      public val json: InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateEmbeddingsResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateEmbeddingsResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateEmbeddingsResponse

    public class Http402Json(
      public val json: PaymentRequiredResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateEmbeddingsResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateEmbeddingsResponse

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateEmbeddingsResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateEmbeddingsResponse

    public class Http502Json(
      public val json: BadGatewayResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateEmbeddingsResponse

    public class Http503Json(
      public val json: ServiceUnavailableResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateEmbeddingsResponse

    public class Http524Json(
      public val json: EdgeNetworkTimeoutResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateEmbeddingsResponse

    public class Http529Json(
      public val json: ProviderOverloadedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateEmbeddingsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateEmbeddingsResponse
  }

  private object CreateEmbeddingsResponseDecoder : SdkResponseAlternativeDecoder<CreateEmbeddingsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CreateEmbeddingsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CreateEmbeddingsResponse> = when {
      alternative.id == "createEmbeddings.response.alternative0" -> SdkResponseDecodeResult(
        value = CreateEmbeddingsResponse.SuccessJson(
          json = EmbeddingsCodecs.createEmbeddingsResponseCodecAlternative0Registry
            .select(listOf("createEmbeddings.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createEmbeddings.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateEmbeddingsResponse.Http400Json(
          json = EmbeddingsCodecs.createEmbeddingsResponseCodecAlternative1Registry
            .select(listOf("createEmbeddings.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createEmbeddings.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateEmbeddingsResponse.Http401Json(
          json = EmbeddingsCodecs.createEmbeddingsResponseCodecAlternative2Registry
            .select(listOf("createEmbeddings.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createEmbeddings.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateEmbeddingsResponse.Http402Json(
          json = EmbeddingsCodecs.createEmbeddingsResponseCodecAlternative3Registry
            .select(listOf("createEmbeddings.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createEmbeddings.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateEmbeddingsResponse.Http404Json(
          json = EmbeddingsCodecs.createEmbeddingsResponseCodecAlternative4Registry
            .select(listOf("createEmbeddings.response.alternative4"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createEmbeddings.response.alternative5" -> SdkResponseDecodeResult(
        value = CreateEmbeddingsResponse.Http429Json(
          json = EmbeddingsCodecs.createEmbeddingsResponseCodecAlternative5Registry
            .select(listOf("createEmbeddings.response.alternative5"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createEmbeddings.response.alternative6" -> SdkResponseDecodeResult(
        value = CreateEmbeddingsResponse.Http500Json(
          json = EmbeddingsCodecs.createEmbeddingsResponseCodecAlternative6Registry
            .select(listOf("createEmbeddings.response.alternative6"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createEmbeddings.response.alternative7" -> SdkResponseDecodeResult(
        value = CreateEmbeddingsResponse.Http502Json(
          json = EmbeddingsCodecs.createEmbeddingsResponseCodecAlternative7Registry
            .select(listOf("createEmbeddings.response.alternative7"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createEmbeddings.response.alternative8" -> SdkResponseDecodeResult(
        value = CreateEmbeddingsResponse.Http503Json(
          json = EmbeddingsCodecs.createEmbeddingsResponseCodecAlternative8Registry
            .select(listOf("createEmbeddings.response.alternative8"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createEmbeddings.response.alternative9" -> SdkResponseDecodeResult(
        value = CreateEmbeddingsResponse.Http524Json(
          json = EmbeddingsCodecs.createEmbeddingsResponseCodecAlternative9Registry
            .select(listOf("createEmbeddings.response.alternative9"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createEmbeddings.response.alternative10" -> SdkResponseDecodeResult(
        value = CreateEmbeddingsResponse.Http529Json(
          json = EmbeddingsCodecs.createEmbeddingsResponseCodecAlternative10Registry
            .select(listOf("createEmbeddings.response.alternative10"), mediaType ?: "application/json").decode(body,
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
    ): CreateEmbeddingsResponse = CreateEmbeddingsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `listEmbeddingsModels`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ListEmbeddingsModelsResponse {
    public class SuccessJson(
      public val json: ModelsListResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListEmbeddingsModelsResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListEmbeddingsModelsResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListEmbeddingsModelsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListEmbeddingsModelsResponse
  }

  private object ListEmbeddingsModelsResponseDecoder : SdkResponseAlternativeDecoder<ListEmbeddingsModelsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListEmbeddingsModelsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListEmbeddingsModelsResponse> = when {
      alternative.id == "listEmbeddingsModels.response.alternative0" -> SdkResponseDecodeResult(
        value = ListEmbeddingsModelsResponse.SuccessJson(
          json = EmbeddingsCodecs.listEmbeddingsModelsResponseCodecAlternative0Registry
            .select(listOf("listEmbeddingsModels.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listEmbeddingsModels.response.alternative1" -> SdkResponseDecodeResult(
        value = ListEmbeddingsModelsResponse.Http400Json(
          json = EmbeddingsCodecs.listEmbeddingsModelsResponseCodecAlternative1Registry
            .select(listOf("listEmbeddingsModels.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listEmbeddingsModels.response.alternative2" -> SdkResponseDecodeResult(
        value = ListEmbeddingsModelsResponse.Http500Json(
          json = EmbeddingsCodecs.listEmbeddingsModelsResponseCodecAlternative2Registry
            .select(listOf("listEmbeddingsModels.response.alternative2"), mediaType ?: "application/json").decode(body,
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
    ): ListEmbeddingsModelsResponse = ListEmbeddingsModelsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val createEmbeddingsMetadata: OperationMetadata = OperationMetadata(
          operationId = "createEmbeddings",
          method = "POST",
          path = "/embeddings",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlinePathsEmbeddingsPostResponses200ContentApplicationJsonSchema",
              mode = SdkResponseMode.BUFFERED,
              id = "createEmbeddings.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createEmbeddings.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createEmbeddings.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 402),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentRequiredResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createEmbeddings.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createEmbeddings.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createEmbeddings.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createEmbeddings.response.alternative6",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 502),
              mediaTypes = listOf("application/json"),
              typeTag = "BadGatewayResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createEmbeddings.response.alternative7",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "ServiceUnavailableResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createEmbeddings.response.alternative8",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 524),
              mediaTypes = listOf("application/json"),
              typeTag = "EdgeNetworkTimeoutResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createEmbeddings.response.alternative9",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 529),
              mediaTypes = listOf("application/json"),
              typeTag = "ProviderOverloadedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createEmbeddings.response.alternative10",
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

    public val listEmbeddingsModelsMetadata: OperationMetadata = OperationMetadata(
          operationId = "listEmbeddingsModels",
          method = "GET",
          path = "/embeddings/models",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ModelsListResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listEmbeddingsModels.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listEmbeddingsModels.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listEmbeddingsModels.response.alternative2",
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
