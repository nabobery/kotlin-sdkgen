package com.nabobery.sdkgen.generated.endpoints

import com.nabobery.sdkgen.generated.InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema
import com.nabobery.sdkgen.generated.InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.NotFoundResponse
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

public object EndpointsCodecs {
  public const val LISTENDPOINTS_RESPONSE_CODEC_ID: String = "listEndpoints.response"

  private val listEndpointsResponseCodec:
      MediaTypeCodec<InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema>
      =
      KotlinxSerializationCodec(LISTENDPOINTS_RESPONSE_CODEC_ID,
        InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  private val listEndpointsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema>
      =
      KotlinxSerializationCodec("listEndpoints.response.alternative0",
        InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  public val listEndpointsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema>
      = MediaTypeCodecRegistry.of(listEndpointsResponseCodecAlternative0Codec)

  private val listEndpointsResponseCodecAlternative1Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("listEndpoints.response.alternative1", NotFoundResponse.Serializer, SdkJson)

  public val listEndpointsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(listEndpointsResponseCodecAlternative1Codec)

  private val listEndpointsResponseCodecAlternative2Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listEndpoints.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  public val listEndpointsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listEndpointsResponseCodecAlternative2Codec)

  public val listEndpointsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listEndpointsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema>
      = MediaTypeCodecRegistry.of(listEndpointsResponseCodec)

  public const val LISTENDPOINTSZDR_RESPONSE_CODEC_ID: String = "listEndpointsZdr.response"

  private val listEndpointsZdrResponseCodec:
      MediaTypeCodec<InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec(LISTENDPOINTSZDR_RESPONSE_CODEC_ID,
        InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  private val listEndpointsZdrResponseCodecAlternative0Codec:
      MediaTypeCodec<InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec("listEndpointsZdr.response.alternative0",
        InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  public val listEndpointsZdrResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(listEndpointsZdrResponseCodecAlternative0Codec)

  private val listEndpointsZdrResponseCodecAlternative1Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("listEndpointsZdr.response.alternative1", InternalServerResponse.Serializer, SdkJson)

  public val listEndpointsZdrResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listEndpointsZdrResponseCodecAlternative1Codec)

  public val listEndpointsZdrRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listEndpointsZdrResponseCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(listEndpointsZdrResponseCodec)
}

/**
 * Client for the 'Endpoints' group of OpenRouter API.
 */
public class EndpointsClient(
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
      SdkExecutor(transport, authentication = this@EndpointsClient.authentication)

  /**
   * List all endpoints for a model
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listEndpoints(
    author: String,
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema = executor.execute<Unit,
    InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema>(SdkExecutionRequest(listEndpointsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "author", values = listOf(author.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(EndpointsCodecs.LISTENDPOINTS_RESPONSE_CODEC_ID), EndpointsCodecs.listEndpointsRequestCodecRegistry,
    EndpointsCodecs.listEndpointsResponseCodecRegistry, options)

  /**
   * List all endpoints for a model
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listEndpointsWithResponse(
    author: String,
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListEndpointsResponse> = executor.executeWithResponse<Unit,
    ListEndpointsResponse>(SdkExecutionRequest(listEndpointsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "author", values = listOf(author.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), EndpointsCodecs.listEndpointsRequestCodecRegistry, ListEndpointsResponseDecoder, options)

  /**
   * Preview the impact of ZDR on the available endpoints
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listEndpointsZdr(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema = executor.execute<Unit,
    InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema>(SdkExecutionRequest(listEndpointsZdrMetadata,
      baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(EndpointsCodecs.LISTENDPOINTSZDR_RESPONSE_CODEC_ID), EndpointsCodecs.listEndpointsZdrRequestCodecRegistry,
    EndpointsCodecs.listEndpointsZdrResponseCodecRegistry, options)

  /**
   * Preview the impact of ZDR on the available endpoints
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listEndpointsZdrWithResponse(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListEndpointsZdrResponse> = executor.executeWithResponse<Unit,
    ListEndpointsZdrResponse>(SdkExecutionRequest(listEndpointsZdrMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), EndpointsCodecs.listEndpointsZdrRequestCodecRegistry, ListEndpointsZdrResponseDecoder, options)

  /**
   * Typed response alternatives for `listEndpoints`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ListEndpointsResponse {
    public class SuccessJson(
      public val json:
          InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListEndpointsResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListEndpointsResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListEndpointsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListEndpointsResponse
  }

  private object ListEndpointsResponseDecoder : SdkResponseAlternativeDecoder<ListEndpointsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListEndpointsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListEndpointsResponse> = when {
      alternative.id == "listEndpoints.response.alternative0" -> SdkResponseDecodeResult(
        value = ListEndpointsResponse.SuccessJson(
          json = EndpointsCodecs.listEndpointsResponseCodecAlternative0Registry
            .select(listOf("listEndpoints.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listEndpoints.response.alternative1" -> SdkResponseDecodeResult(
        value = ListEndpointsResponse.Http404Json(
          json = EndpointsCodecs.listEndpointsResponseCodecAlternative1Registry
            .select(listOf("listEndpoints.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listEndpoints.response.alternative2" -> SdkResponseDecodeResult(
        value = ListEndpointsResponse.Http500Json(
          json = EndpointsCodecs.listEndpointsResponseCodecAlternative2Registry
            .select(listOf("listEndpoints.response.alternative2"), mediaType ?: "application/json").decode(body,
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
    ): ListEndpointsResponse = ListEndpointsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `listEndpointsZdr`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ListEndpointsZdrResponse {
    public class SuccessJson(
      public val json: InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListEndpointsZdrResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListEndpointsZdrResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListEndpointsZdrResponse
  }

  private object ListEndpointsZdrResponseDecoder : SdkResponseAlternativeDecoder<ListEndpointsZdrResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListEndpointsZdrResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListEndpointsZdrResponse> = when {
      alternative.id == "listEndpointsZdr.response.alternative0" -> SdkResponseDecodeResult(
        value = ListEndpointsZdrResponse.SuccessJson(
          json = EndpointsCodecs.listEndpointsZdrResponseCodecAlternative0Registry
            .select(listOf("listEndpointsZdr.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listEndpointsZdr.response.alternative1" -> SdkResponseDecodeResult(
        value = ListEndpointsZdrResponse.Http500Json(
          json = EndpointsCodecs.listEndpointsZdrResponseCodecAlternative1Registry
            .select(listOf("listEndpointsZdr.response.alternative1"), mediaType ?: "application/json").decode(body,
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
    ): ListEndpointsZdrResponse = ListEndpointsZdrResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val listEndpointsMetadata: OperationMetadata = OperationMetadata(
          operationId = "listEndpoints",
          method = "GET",
          path = "/models/{author}/{slug}/endpoints",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlinePathsModelsAuthorSlugEndpointsGetResponses200ContentApplicationJsonSchema",
              mode = SdkResponseMode.BUFFERED,
              id = "listEndpoints.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listEndpoints.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listEndpoints.response.alternative2",
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

    public val listEndpointsZdrMetadata: OperationMetadata = OperationMetadata(
          operationId = "listEndpointsZdr",
          method = "GET",
          path = "/endpoints/zdr",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlinePathsEndpointsZdrGetResponses200ContentApplicationJsonSchema",
              mode = SdkResponseMode.BUFFERED,
              id = "listEndpointsZdr.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listEndpointsZdr.response.alternative1",
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
