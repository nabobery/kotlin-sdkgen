package com.nabobery.sdkgen.generated.videogeneration

import com.nabobery.sdkgen.generated.BadGatewayResponse
import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.NotFoundResponse
import com.nabobery.sdkgen.generated.PaymentRequiredResponse
import com.nabobery.sdkgen.generated.SdkJson
import com.nabobery.sdkgen.generated.TooManyRequestsResponse
import com.nabobery.sdkgen.generated.UnauthorizedResponse
import com.nabobery.sdkgen.generated.VideoGenerationRequest
import com.nabobery.sdkgen.generated.VideoGenerationResponse
import com.nabobery.sdkgen.generated.VideoModelsListResponse
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

public object VideoGenerationCodecs {
  public const val CREATEVIDEOS_REQUEST_CODEC_ID: String = "createVideos.request"

  private val createVideosRequestCodec: MediaTypeCodec<VideoGenerationRequest> =
      KotlinxSerializationCodec(CREATEVIDEOS_REQUEST_CODEC_ID, VideoGenerationRequest.Serializer, SdkJson)

  public const val CREATEVIDEOS_RESPONSE_CODEC_ID: String = "createVideos.response"

  private val createVideosResponseCodec: MediaTypeCodec<VideoGenerationResponse> =
      KotlinxSerializationCodec(CREATEVIDEOS_RESPONSE_CODEC_ID, VideoGenerationResponse.Serializer, SdkJson)

  private val createVideosResponseCodecAlternative0Codec: MediaTypeCodec<VideoGenerationResponse> =
      KotlinxSerializationCodec("createVideos.response.alternative0", VideoGenerationResponse.Serializer, SdkJson)

  public val createVideosResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<VideoGenerationResponse> =
      MediaTypeCodecRegistry.of(createVideosResponseCodecAlternative0Codec)

  private val createVideosResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createVideos.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val createVideosResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createVideosResponseCodecAlternative1Codec)

  private val createVideosResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createVideos.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val createVideosResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createVideosResponseCodecAlternative2Codec)

  private val createVideosResponseCodecAlternative3Codec: MediaTypeCodec<PaymentRequiredResponse> =
      KotlinxSerializationCodec("createVideos.response.alternative3", PaymentRequiredResponse.Serializer, SdkJson)

  public val createVideosResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<PaymentRequiredResponse> =
      MediaTypeCodecRegistry.of(createVideosResponseCodecAlternative3Codec)

  private val createVideosResponseCodecAlternative4Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("createVideos.response.alternative4", NotFoundResponse.Serializer, SdkJson)

  public val createVideosResponseCodecAlternative4Registry: MediaTypeCodecRegistry<NotFoundResponse>
      = MediaTypeCodecRegistry.of(createVideosResponseCodecAlternative4Codec)

  private val createVideosResponseCodecAlternative5Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("createVideos.response.alternative5", TooManyRequestsResponse.Serializer, SdkJson)

  public val createVideosResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(createVideosResponseCodecAlternative5Codec)

  private val createVideosResponseCodecAlternative6Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createVideos.response.alternative6", InternalServerResponse.Serializer, SdkJson)

  public val createVideosResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createVideosResponseCodecAlternative6Codec)

  public val createVideosRequestCodecRegistry: MediaTypeCodecRegistry<VideoGenerationRequest> =
      MediaTypeCodecRegistry.of(createVideosRequestCodec)

  public val createVideosResponseCodecRegistry: MediaTypeCodecRegistry<VideoGenerationResponse> =
      MediaTypeCodecRegistry.of(createVideosResponseCodec)

  public const val GETVIDEOS_RESPONSE_CODEC_ID: String = "getVideos.response"

  private val getVideosResponseCodec: MediaTypeCodec<VideoGenerationResponse> =
      KotlinxSerializationCodec(GETVIDEOS_RESPONSE_CODEC_ID, VideoGenerationResponse.Serializer, SdkJson)

  private val getVideosResponseCodecAlternative0Codec: MediaTypeCodec<VideoGenerationResponse> =
      KotlinxSerializationCodec("getVideos.response.alternative0", VideoGenerationResponse.Serializer, SdkJson)

  public val getVideosResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<VideoGenerationResponse> =
      MediaTypeCodecRegistry.of(getVideosResponseCodecAlternative0Codec)

  private val getVideosResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getVideos.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  public val getVideosResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getVideosResponseCodecAlternative1Codec)

  private val getVideosResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getVideos.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  public val getVideosResponseCodecAlternative2Registry: MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(getVideosResponseCodecAlternative2Codec)

  private val getVideosResponseCodecAlternative3Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getVideos.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  public val getVideosResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getVideosResponseCodecAlternative3Codec)

  public val getVideosRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val getVideosResponseCodecRegistry: MediaTypeCodecRegistry<VideoGenerationResponse> =
      MediaTypeCodecRegistry.of(getVideosResponseCodec)

  private val listVideosContentResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("listVideosContent.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val listVideosContentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(listVideosContentResponseCodecAlternative1Codec)

  private val listVideosContentResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse>
      =
      KotlinxSerializationCodec("listVideosContent.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val listVideosContentResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listVideosContentResponseCodecAlternative2Codec)

  private val listVideosContentResponseCodecAlternative3Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("listVideosContent.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  public val listVideosContentResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(listVideosContentResponseCodecAlternative3Codec)

  private val listVideosContentResponseCodecAlternative4Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listVideosContent.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  public val listVideosContentResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listVideosContentResponseCodecAlternative4Codec)

  private val listVideosContentResponseCodecAlternative5Codec: MediaTypeCodec<BadGatewayResponse> =
      KotlinxSerializationCodec("listVideosContent.response.alternative5", BadGatewayResponse.Serializer, SdkJson)

  public val listVideosContentResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BadGatewayResponse> =
      MediaTypeCodecRegistry.of(listVideosContentResponseCodecAlternative5Codec)

  public val listVideosContentRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listVideosContentResponseCodecRegistry: MediaTypeCodecRegistry<SdkByteStream> =
      MediaTypeCodecRegistry.of()

  public const val LISTVIDEOSMODELS_RESPONSE_CODEC_ID: String = "listVideosModels.response"

  private val listVideosModelsResponseCodec: MediaTypeCodec<VideoModelsListResponse> =
      KotlinxSerializationCodec(LISTVIDEOSMODELS_RESPONSE_CODEC_ID, VideoModelsListResponse.Serializer, SdkJson)

  private val listVideosModelsResponseCodecAlternative0Codec:
      MediaTypeCodec<VideoModelsListResponse> =
      KotlinxSerializationCodec("listVideosModels.response.alternative0", VideoModelsListResponse.Serializer, SdkJson)

  public val listVideosModelsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<VideoModelsListResponse> =
      MediaTypeCodecRegistry.of(listVideosModelsResponseCodecAlternative0Codec)

  private val listVideosModelsResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("listVideosModels.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val listVideosModelsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(listVideosModelsResponseCodecAlternative1Codec)

  private val listVideosModelsResponseCodecAlternative2Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("listVideosModels.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  public val listVideosModelsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listVideosModelsResponseCodecAlternative2Codec)

  public val listVideosModelsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listVideosModelsResponseCodecRegistry: MediaTypeCodecRegistry<VideoModelsListResponse>
      = MediaTypeCodecRegistry.of(listVideosModelsResponseCodec)
}

/**
 * Client for the 'Video Generation' group of OpenRouter API.
 */
public class VideoGenerationClient(
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
      SdkExecutor(transport, authentication = this@VideoGenerationClient.authentication)

  /**
   * Submits a video generation request and returns a polling URL to check status
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createVideos(
    request: VideoGenerationRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): VideoGenerationResponse = executor.execute<VideoGenerationRequest,
    VideoGenerationResponse>(SdkExecutionRequest(createVideosMetadata, baseUri, request, listOf(VideoGenerationCodecs
      .CREATEVIDEOS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(VideoGenerationCodecs.CREATEVIDEOS_RESPONSE_CODEC_ID), VideoGenerationCodecs
    .createVideosRequestCodecRegistry, VideoGenerationCodecs.createVideosResponseCodecRegistry, options)

  /**
   * Submits a video generation request and returns a polling URL to check status
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun createVideosWithResponse(
    request: VideoGenerationRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateVideosResponse> = executor.executeWithResponse<VideoGenerationRequest,
    CreateVideosResponse>(SdkExecutionRequest(createVideosMetadata, baseUri, request, listOf(VideoGenerationCodecs
      .CREATEVIDEOS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), VideoGenerationCodecs.createVideosRequestCodecRegistry, CreateVideosResponseDecoder, options)

  /**
   * Returns job status and content URLs when completed
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getVideos(
    jobId: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): VideoGenerationResponse = executor.execute<Unit, VideoGenerationResponse>(SdkExecutionRequest(getVideosMetadata,
    baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "jobId", values = listOf(jobId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(VideoGenerationCodecs.GETVIDEOS_RESPONSE_CODEC_ID), VideoGenerationCodecs.getVideosRequestCodecRegistry,
    VideoGenerationCodecs.getVideosResponseCodecRegistry, options)

  /**
   * Returns job status and content URLs when completed
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun getVideosWithResponse(
    jobId: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetVideosResponse> = executor.executeWithResponse<Unit,
    GetVideosResponse>(SdkExecutionRequest(getVideosMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "jobId", values = listOf(jobId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), VideoGenerationCodecs.getVideosRequestCodecRegistry, GetVideosResponseDecoder, options)

  /**
   * Streams the generated video content from the upstream provider
   *
   * @param options Execution options.
   * @return Response body stream.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listVideosContent(
    jobId: String,
    index: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkByteStream = executor.executeRaw<Unit>(SdkExecutionRequest(listVideosContentMetadata, baseUri, Unit,
    emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "jobId", values = listOf(jobId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "index", values = index?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), VideoGenerationCodecs.listVideosContentRequestCodecRegistry, options)

  /**
   * Streams the generated video content from the upstream provider
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listVideosContentWithResponse(
    jobId: String,
    index: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListVideosContentResponse> = executor.executeWithResponse<Unit,
    ListVideosContentResponse>(SdkExecutionRequest(listVideosContentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "jobId", values = listOf(jobId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "index", values = index?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), VideoGenerationCodecs.listVideosContentRequestCodecRegistry, ListVideosContentResponseDecoder, options)

  /**
   * Returns a list of all available video generation models and their properties
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listVideosModels(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): VideoModelsListResponse = executor.execute<Unit,
    VideoModelsListResponse>(SdkExecutionRequest(listVideosModelsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(VideoGenerationCodecs.LISTVIDEOSMODELS_RESPONSE_CODEC_ID), VideoGenerationCodecs
    .listVideosModelsRequestCodecRegistry, VideoGenerationCodecs.listVideosModelsResponseCodecRegistry, options)

  /**
   * Returns a list of all available video generation models and their properties
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listVideosModelsWithResponse(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListVideosModelsResponse> = executor.executeWithResponse<Unit,
    ListVideosModelsResponse>(SdkExecutionRequest(listVideosModelsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), VideoGenerationCodecs.listVideosModelsRequestCodecRegistry, ListVideosModelsResponseDecoder, options)

  /**
   * Typed response alternatives for `createVideos`. Non-success alternatives are not converted into success values.
   */
  public sealed interface CreateVideosResponse {
    public class SuccessJson(
      public val json: VideoGenerationResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateVideosResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateVideosResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateVideosResponse

    public class Http402Json(
      public val json: PaymentRequiredResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateVideosResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateVideosResponse

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateVideosResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateVideosResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateVideosResponse
  }

  private object CreateVideosResponseDecoder : SdkResponseAlternativeDecoder<CreateVideosResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CreateVideosResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CreateVideosResponse> = when {
      alternative.id == "createVideos.response.alternative0" -> SdkResponseDecodeResult(
        value = CreateVideosResponse.SuccessJson(
          json = VideoGenerationCodecs.createVideosResponseCodecAlternative0Registry
            .select(listOf("createVideos.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createVideos.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateVideosResponse.Http400Json(
          json = VideoGenerationCodecs.createVideosResponseCodecAlternative1Registry
            .select(listOf("createVideos.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createVideos.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateVideosResponse.Http401Json(
          json = VideoGenerationCodecs.createVideosResponseCodecAlternative2Registry
            .select(listOf("createVideos.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createVideos.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateVideosResponse.Http402Json(
          json = VideoGenerationCodecs.createVideosResponseCodecAlternative3Registry
            .select(listOf("createVideos.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createVideos.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateVideosResponse.Http404Json(
          json = VideoGenerationCodecs.createVideosResponseCodecAlternative4Registry
            .select(listOf("createVideos.response.alternative4"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createVideos.response.alternative5" -> SdkResponseDecodeResult(
        value = CreateVideosResponse.Http429Json(
          json = VideoGenerationCodecs.createVideosResponseCodecAlternative5Registry
            .select(listOf("createVideos.response.alternative5"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createVideos.response.alternative6" -> SdkResponseDecodeResult(
        value = CreateVideosResponse.Http500Json(
          json = VideoGenerationCodecs.createVideosResponseCodecAlternative6Registry
            .select(listOf("createVideos.response.alternative6"), mediaType ?: "application/json").decode(body,
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
    ): CreateVideosResponse = CreateVideosResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `getVideos`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetVideosResponse {
    public class SuccessJson(
      public val json: VideoGenerationResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetVideosResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetVideosResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetVideosResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetVideosResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetVideosResponse
  }

  private object GetVideosResponseDecoder : SdkResponseAlternativeDecoder<GetVideosResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetVideosResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetVideosResponse> = when {
      alternative.id == "getVideos.response.alternative0" -> SdkResponseDecodeResult(
        value = GetVideosResponse.SuccessJson(
          json = VideoGenerationCodecs.getVideosResponseCodecAlternative0Registry
            .select(listOf("getVideos.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getVideos.response.alternative1" -> SdkResponseDecodeResult(
        value = GetVideosResponse.Http401Json(
          json = VideoGenerationCodecs.getVideosResponseCodecAlternative1Registry
            .select(listOf("getVideos.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getVideos.response.alternative2" -> SdkResponseDecodeResult(
        value = GetVideosResponse.Http404Json(
          json = VideoGenerationCodecs.getVideosResponseCodecAlternative2Registry
            .select(listOf("getVideos.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getVideos.response.alternative3" -> SdkResponseDecodeResult(
        value = GetVideosResponse.Http500Json(
          json = VideoGenerationCodecs.getVideosResponseCodecAlternative3Registry
            .select(listOf("getVideos.response.alternative3"), mediaType ?: "application/json").decode(body,
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
    ): GetVideosResponse = GetVideosResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `listVideosContent`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ListVideosContentResponse {
    public class SuccessMp4(
      public val bytes: SdkByteStream,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListVideosContentResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListVideosContentResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListVideosContentResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListVideosContentResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListVideosContentResponse

    public class Http502Json(
      public val json: BadGatewayResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListVideosContentResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListVideosContentResponse
  }

  private object ListVideosContentResponseDecoder : SdkResponseAlternativeDecoder<ListVideosContentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListVideosContentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListVideosContentResponse> = when {
      alternative.id == "listVideosContent.response.alternative0" -> SdkResponseDecodeResult(
        value = ListVideosContentResponse.SuccessMp4(
          bytes = body,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = true,
      )
      alternative.id == "listVideosContent.response.alternative1" -> SdkResponseDecodeResult(
        value = ListVideosContentResponse.Http400Json(
          json = VideoGenerationCodecs.listVideosContentResponseCodecAlternative1Registry
            .select(listOf("listVideosContent.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listVideosContent.response.alternative2" -> SdkResponseDecodeResult(
        value = ListVideosContentResponse.Http401Json(
          json = VideoGenerationCodecs.listVideosContentResponseCodecAlternative2Registry
            .select(listOf("listVideosContent.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listVideosContent.response.alternative3" -> SdkResponseDecodeResult(
        value = ListVideosContentResponse.Http404Json(
          json = VideoGenerationCodecs.listVideosContentResponseCodecAlternative3Registry
            .select(listOf("listVideosContent.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listVideosContent.response.alternative4" -> SdkResponseDecodeResult(
        value = ListVideosContentResponse.Http500Json(
          json = VideoGenerationCodecs.listVideosContentResponseCodecAlternative4Registry
            .select(listOf("listVideosContent.response.alternative4"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listVideosContent.response.alternative5" -> SdkResponseDecodeResult(
        value = ListVideosContentResponse.Http502Json(
          json = VideoGenerationCodecs.listVideosContentResponseCodecAlternative5Registry
            .select(listOf("listVideosContent.response.alternative5"), mediaType ?: "application/json").decode(body,
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
    ): ListVideosContentResponse = ListVideosContentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `listVideosModels`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ListVideosModelsResponse {
    public class SuccessJson(
      public val json: VideoModelsListResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListVideosModelsResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListVideosModelsResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListVideosModelsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListVideosModelsResponse
  }

  private object ListVideosModelsResponseDecoder : SdkResponseAlternativeDecoder<ListVideosModelsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListVideosModelsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListVideosModelsResponse> = when {
      alternative.id == "listVideosModels.response.alternative0" -> SdkResponseDecodeResult(
        value = ListVideosModelsResponse.SuccessJson(
          json = VideoGenerationCodecs.listVideosModelsResponseCodecAlternative0Registry
            .select(listOf("listVideosModels.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listVideosModels.response.alternative1" -> SdkResponseDecodeResult(
        value = ListVideosModelsResponse.Http400Json(
          json = VideoGenerationCodecs.listVideosModelsResponseCodecAlternative1Registry
            .select(listOf("listVideosModels.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listVideosModels.response.alternative2" -> SdkResponseDecodeResult(
        value = ListVideosModelsResponse.Http500Json(
          json = VideoGenerationCodecs.listVideosModelsResponseCodecAlternative2Registry
            .select(listOf("listVideosModels.response.alternative2"), mediaType ?: "application/json").decode(body,
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
    ): ListVideosModelsResponse = ListVideosModelsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val createVideosMetadata: OperationMetadata = OperationMetadata(
          operationId = "createVideos",
          method = "POST",
          path = "/videos",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(202),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 202),
              mediaTypes = listOf("application/json"),
              typeTag = "VideoGenerationResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createVideos.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createVideos.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createVideos.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 402),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentRequiredResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createVideos.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createVideos.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createVideos.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createVideos.response.alternative6",
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

    public val getVideosMetadata: OperationMetadata = OperationMetadata(
          operationId = "getVideos",
          method = "GET",
          path = "/videos/{jobId}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "VideoGenerationResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getVideos.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getVideos.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getVideos.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getVideos.response.alternative3",
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

    public val listVideosContentMetadata: OperationMetadata = OperationMetadata(
          operationId = "listVideosContent",
          method = "GET",
          path = "/videos/{jobId}/content",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("video/mp4"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("video/mp4"),
              typeTag = "SdkByteStream",
              mode = SdkResponseMode.BUFFERED,
              id = "listVideosContent.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listVideosContent.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listVideosContent.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listVideosContent.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listVideosContent.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 502),
              mediaTypes = listOf("application/json"),
              typeTag = "BadGatewayResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listVideosContent.response.alternative5",
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

    public val listVideosModelsMetadata: OperationMetadata = OperationMetadata(
          operationId = "listVideosModels",
          method = "GET",
          path = "/videos/models",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "VideoModelsListResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listVideosModels.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listVideosModels.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listVideosModels.response.alternative2",
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
