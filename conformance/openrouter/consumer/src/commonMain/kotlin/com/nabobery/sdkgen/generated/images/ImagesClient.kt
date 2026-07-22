package com.nabobery.sdkgen.generated.images

import com.nabobery.sdkgen.generated.BadGatewayResponse
import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.EdgeNetworkTimeoutResponse
import com.nabobery.sdkgen.generated.ForbiddenResponse
import com.nabobery.sdkgen.generated.ImageGenerationRequest
import com.nabobery.sdkgen.generated.ImageGenerationResponse
import com.nabobery.sdkgen.generated.ImageModelEndpointsResponse
import com.nabobery.sdkgen.generated.ImageModelsListResponse
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.NotFoundResponse
import com.nabobery.sdkgen.generated.PayloadTooLargeResponse
import com.nabobery.sdkgen.generated.PaymentRequiredResponse
import com.nabobery.sdkgen.generated.ProviderOverloadedResponse
import com.nabobery.sdkgen.generated.SdkJson
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

public object ImagesCodecs {
  public const val CREATEIMAGES_REQUEST_CODEC_ID: String = "createImages.request"

  private val createImagesRequestCodec: MediaTypeCodec<ImageGenerationRequest> =
      KotlinxSerializationCodec(CREATEIMAGES_REQUEST_CODEC_ID, ImageGenerationRequest.Serializer, SdkJson)

  public const val CREATEIMAGES_RESPONSE_CODEC_ID: String = "createImages.response"

  private val createImagesResponseCodec: MediaTypeCodec<ImageGenerationResponse> =
      KotlinxSerializationCodec(CREATEIMAGES_RESPONSE_CODEC_ID, ImageGenerationResponse.Serializer, SdkJson)

  private val createImagesResponseCodecAlternative0Codec: MediaTypeCodec<ImageGenerationResponse> =
      KotlinxSerializationCodec("createImages.response.alternative0", ImageGenerationResponse.Serializer, SdkJson)

  public val createImagesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ImageGenerationResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative0Codec)

  private val createImagesResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createImages.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val createImagesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative1Codec)

  private val createImagesResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createImages.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val createImagesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative2Codec)

  private val createImagesResponseCodecAlternative3Codec: MediaTypeCodec<PaymentRequiredResponse> =
      KotlinxSerializationCodec("createImages.response.alternative3", PaymentRequiredResponse.Serializer, SdkJson)

  public val createImagesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<PaymentRequiredResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative3Codec)

  private val createImagesResponseCodecAlternative4Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("createImages.response.alternative4", ForbiddenResponse.Serializer, SdkJson)

  public val createImagesResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative4Codec)

  private val createImagesResponseCodecAlternative5Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("createImages.response.alternative5", NotFoundResponse.Serializer, SdkJson)

  public val createImagesResponseCodecAlternative5Registry: MediaTypeCodecRegistry<NotFoundResponse>
      = MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative5Codec)

  private val createImagesResponseCodecAlternative6Codec: MediaTypeCodec<PayloadTooLargeResponse> =
      KotlinxSerializationCodec("createImages.response.alternative6", PayloadTooLargeResponse.Serializer, SdkJson)

  public val createImagesResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<PayloadTooLargeResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative6Codec)

  private val createImagesResponseCodecAlternative7Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("createImages.response.alternative7", TooManyRequestsResponse.Serializer, SdkJson)

  public val createImagesResponseCodecAlternative7Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative7Codec)

  private val createImagesResponseCodecAlternative8Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createImages.response.alternative8", InternalServerResponse.Serializer, SdkJson)

  public val createImagesResponseCodecAlternative8Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative8Codec)

  private val createImagesResponseCodecAlternative9Codec: MediaTypeCodec<BadGatewayResponse> =
      KotlinxSerializationCodec("createImages.response.alternative9", BadGatewayResponse.Serializer, SdkJson)

  public val createImagesResponseCodecAlternative9Registry:
      MediaTypeCodecRegistry<BadGatewayResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative9Codec)

  private val createImagesResponseCodecAlternative10Codec:
      MediaTypeCodec<EdgeNetworkTimeoutResponse> =
      KotlinxSerializationCodec("createImages.response.alternative10", EdgeNetworkTimeoutResponse.Serializer, SdkJson)

  public val createImagesResponseCodecAlternative10Registry:
      MediaTypeCodecRegistry<EdgeNetworkTimeoutResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative10Codec)

  private val createImagesResponseCodecAlternative11Codec:
      MediaTypeCodec<ProviderOverloadedResponse> =
      KotlinxSerializationCodec("createImages.response.alternative11", ProviderOverloadedResponse.Serializer, SdkJson)

  public val createImagesResponseCodecAlternative11Registry:
      MediaTypeCodecRegistry<ProviderOverloadedResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative11Codec)

  public val createImagesRequestCodecRegistry: MediaTypeCodecRegistry<ImageGenerationRequest> =
      MediaTypeCodecRegistry.of(createImagesRequestCodec)

  public val createImagesResponseCodecRegistry: MediaTypeCodecRegistry<ImageGenerationResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodec)

  public const val LISTIMAGEMODELENDPOINTS_RESPONSE_CODEC_ID: String =
      "listImageModelEndpoints.response"

  private val listImageModelEndpointsResponseCodec: MediaTypeCodec<ImageModelEndpointsResponse> =
      KotlinxSerializationCodec(LISTIMAGEMODELENDPOINTS_RESPONSE_CODEC_ID, ImageModelEndpointsResponse.Serializer,
        SdkJson)

  private val listImageModelEndpointsResponseCodecAlternative0Codec:
      MediaTypeCodec<ImageModelEndpointsResponse> =
      KotlinxSerializationCodec("listImageModelEndpoints.response.alternative0", ImageModelEndpointsResponse
        .Serializer, SdkJson)

  public val listImageModelEndpointsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ImageModelEndpointsResponse> =
      MediaTypeCodecRegistry.of(listImageModelEndpointsResponseCodecAlternative0Codec)

  private val listImageModelEndpointsResponseCodecAlternative1Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("listImageModelEndpoints.response.alternative1", NotFoundResponse.Serializer, SdkJson)

  public val listImageModelEndpointsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(listImageModelEndpointsResponseCodecAlternative1Codec)

  private val listImageModelEndpointsResponseCodecAlternative2Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listImageModelEndpoints.response.alternative2", InternalServerResponse.Serializer,
        SdkJson)

  public val listImageModelEndpointsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listImageModelEndpointsResponseCodecAlternative2Codec)

  public val listImageModelEndpointsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listImageModelEndpointsResponseCodecRegistry:
      MediaTypeCodecRegistry<ImageModelEndpointsResponse> =
      MediaTypeCodecRegistry.of(listImageModelEndpointsResponseCodec)

  public const val LISTIMAGEMODELS_RESPONSE_CODEC_ID: String = "listImageModels.response"

  private val listImageModelsResponseCodec: MediaTypeCodec<ImageModelsListResponse> =
      KotlinxSerializationCodec(LISTIMAGEMODELS_RESPONSE_CODEC_ID, ImageModelsListResponse.Serializer, SdkJson)

  private val listImageModelsResponseCodecAlternative0Codec: MediaTypeCodec<ImageModelsListResponse>
      =
      KotlinxSerializationCodec("listImageModels.response.alternative0", ImageModelsListResponse.Serializer, SdkJson)

  public val listImageModelsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ImageModelsListResponse> =
      MediaTypeCodecRegistry.of(listImageModelsResponseCodecAlternative0Codec)

  private val listImageModelsResponseCodecAlternative1Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("listImageModels.response.alternative1", InternalServerResponse.Serializer, SdkJson)

  public val listImageModelsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listImageModelsResponseCodecAlternative1Codec)

  public val listImageModelsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listImageModelsResponseCodecRegistry: MediaTypeCodecRegistry<ImageModelsListResponse> =
      MediaTypeCodecRegistry.of(listImageModelsResponseCodec)
}

/**
 * Client for the 'Images' group of OpenRouter API.
 */
public class ImagesClient(
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
      SdkExecutor(transport, authentication = this@ImagesClient.authentication)

  /**
   * Generates an image from a text prompt via the image generation router
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createImages(
    request: ImageGenerationRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): ImageGenerationResponse = executor.execute<ImageGenerationRequest,
    ImageGenerationResponse>(SdkExecutionRequest(createImagesMetadata, baseUri, request, listOf(ImagesCodecs
      .CREATEIMAGES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ImagesCodecs.CREATEIMAGES_RESPONSE_CODEC_ID), ImagesCodecs.createImagesRequestCodecRegistry, ImagesCodecs
    .createImagesResponseCodecRegistry, options)

  /**
   * Generates an image from a text prompt via the image generation router
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun createImagesWithResponse(
    request: ImageGenerationRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateImagesResponse> = executor.executeWithResponse<ImageGenerationRequest,
    CreateImagesResponse>(SdkExecutionRequest(createImagesMetadata, baseUri, request, listOf(ImagesCodecs
      .CREATEIMAGES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ImagesCodecs.createImagesRequestCodecRegistry, CreateImagesResponseDecoder, options)

  /**
   * Returns the full per-endpoint records for an image model: each endpoint's definitive supported parameters, pricing,
   * and passthrough allowlist.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listImageModelEndpoints(
    author: String,
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): ImageModelEndpointsResponse = executor.execute<Unit,
    ImageModelEndpointsResponse>(SdkExecutionRequest(listImageModelEndpointsMetadata, baseUri, Unit, emptyList(),
      buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "author", values = listOf(author.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ImagesCodecs.LISTIMAGEMODELENDPOINTS_RESPONSE_CODEC_ID), ImagesCodecs
    .listImageModelEndpointsRequestCodecRegistry, ImagesCodecs.listImageModelEndpointsResponseCodecRegistry, options)

  /**
   * Returns the full per-endpoint records for an image model: each endpoint's definitive supported parameters, pricing,
   * and passthrough allowlist.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listImageModelEndpointsWithResponse(
    author: String,
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListImageModelEndpointsResponse> = executor.executeWithResponse<Unit,
    ListImageModelEndpointsResponse>(SdkExecutionRequest(listImageModelEndpointsMetadata, baseUri, Unit, emptyList(),
      buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "author", values = listOf(author.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ImagesCodecs.listImageModelEndpointsRequestCodecRegistry, ListImageModelEndpointsResponseDecoder, options)

  /**
   * Lists every image generation model with its top-level supported-parameter superset and a URL to its full
   * per-endpoint records.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listImageModels(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): ImageModelsListResponse = executor.execute<Unit,
    ImageModelsListResponse>(SdkExecutionRequest(listImageModelsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ImagesCodecs.LISTIMAGEMODELS_RESPONSE_CODEC_ID), ImagesCodecs.listImageModelsRequestCodecRegistry,
    ImagesCodecs.listImageModelsResponseCodecRegistry, options)

  /**
   * Lists every image generation model with its top-level supported-parameter superset and a URL to its full
   * per-endpoint records.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listImageModelsWithResponse(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListImageModelsResponse> = executor.executeWithResponse<Unit,
    ListImageModelsResponse>(SdkExecutionRequest(listImageModelsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ImagesCodecs.listImageModelsRequestCodecRegistry, ListImageModelsResponseDecoder, options)

  /**
   * Typed response alternatives for `createImages`. Non-success alternatives are not converted into success values.
   */
  public sealed interface CreateImagesResponse {
    public class SuccessJson(
      public val json: ImageGenerationResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse

    public class Http402Json(
      public val json: PaymentRequiredResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse

    public class Http413Json(
      public val json: PayloadTooLargeResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse

    public class Http502Json(
      public val json: BadGatewayResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse

    public class Http524Json(
      public val json: EdgeNetworkTimeoutResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse

    public class Http529Json(
      public val json: ProviderOverloadedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse
  }

  private object CreateImagesResponseDecoder : SdkResponseAlternativeDecoder<CreateImagesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CreateImagesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CreateImagesResponse> = when {
      alternative.id == "createImages.response.alternative0" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.SuccessJson(
          json = ImagesCodecs.createImagesResponseCodecAlternative0Registry
            .select(listOf("createImages.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http400Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative1Registry
            .select(listOf("createImages.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http401Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative2Registry
            .select(listOf("createImages.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http402Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative3Registry
            .select(listOf("createImages.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http403Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative4Registry
            .select(listOf("createImages.response.alternative4"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative5" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http404Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative5Registry
            .select(listOf("createImages.response.alternative5"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative6" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http413Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative6Registry
            .select(listOf("createImages.response.alternative6"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative7" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http429Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative7Registry
            .select(listOf("createImages.response.alternative7"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative8" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http500Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative8Registry
            .select(listOf("createImages.response.alternative8"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative9" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http502Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative9Registry
            .select(listOf("createImages.response.alternative9"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative10" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http524Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative10Registry
            .select(listOf("createImages.response.alternative10"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative11" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http529Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative11Registry
            .select(listOf("createImages.response.alternative11"), mediaType ?: "application/json").decode(body,
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
    ): CreateImagesResponse = CreateImagesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `listImageModelEndpoints`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ListImageModelEndpointsResponse {
    public class SuccessJson(
      public val json: ImageModelEndpointsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListImageModelEndpointsResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListImageModelEndpointsResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListImageModelEndpointsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListImageModelEndpointsResponse
  }

  private object ListImageModelEndpointsResponseDecoder : SdkResponseAlternativeDecoder<ListImageModelEndpointsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListImageModelEndpointsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListImageModelEndpointsResponse> = when {
      alternative.id == "listImageModelEndpoints.response.alternative0" -> SdkResponseDecodeResult(
        value = ListImageModelEndpointsResponse.SuccessJson(
          json = ImagesCodecs.listImageModelEndpointsResponseCodecAlternative0Registry
            .select(listOf("listImageModelEndpoints.response.alternative0"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listImageModelEndpoints.response.alternative1" -> SdkResponseDecodeResult(
        value = ListImageModelEndpointsResponse.Http404Json(
          json = ImagesCodecs.listImageModelEndpointsResponseCodecAlternative1Registry
            .select(listOf("listImageModelEndpoints.response.alternative1"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listImageModelEndpoints.response.alternative2" -> SdkResponseDecodeResult(
        value = ListImageModelEndpointsResponse.Http500Json(
          json = ImagesCodecs.listImageModelEndpointsResponseCodecAlternative2Registry
            .select(listOf("listImageModelEndpoints.response.alternative2"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
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
    ): ListImageModelEndpointsResponse = ListImageModelEndpointsResponse.Unknown(statusCode = statusCode, headers =
      headers)
  }

  /**
   * Typed response alternatives for `listImageModels`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ListImageModelsResponse {
    public class SuccessJson(
      public val json: ImageModelsListResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListImageModelsResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListImageModelsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListImageModelsResponse
  }

  private object ListImageModelsResponseDecoder : SdkResponseAlternativeDecoder<ListImageModelsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListImageModelsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListImageModelsResponse> = when {
      alternative.id == "listImageModels.response.alternative0" -> SdkResponseDecodeResult(
        value = ListImageModelsResponse.SuccessJson(
          json = ImagesCodecs.listImageModelsResponseCodecAlternative0Registry
            .select(listOf("listImageModels.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listImageModels.response.alternative1" -> SdkResponseDecodeResult(
        value = ListImageModelsResponse.Http500Json(
          json = ImagesCodecs.listImageModelsResponseCodecAlternative1Registry
            .select(listOf("listImageModels.response.alternative1"), mediaType ?: "application/json").decode(body,
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
    ): ListImageModelsResponse = ListImageModelsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val createImagesMetadata: OperationMetadata = OperationMetadata(
          operationId = "createImages",
          method = "POST",
          path = "/images",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ImageGenerationResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createImages.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createImages.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createImages.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 402),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentRequiredResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createImages.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createImages.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createImages.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 413),
              mediaTypes = listOf("application/json"),
              typeTag = "PayloadTooLargeResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createImages.response.alternative6",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createImages.response.alternative7",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createImages.response.alternative8",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 502),
              mediaTypes = listOf("application/json"),
              typeTag = "BadGatewayResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createImages.response.alternative9",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 524),
              mediaTypes = listOf("application/json"),
              typeTag = "EdgeNetworkTimeoutResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createImages.response.alternative10",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 529),
              mediaTypes = listOf("application/json"),
              typeTag = "ProviderOverloadedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createImages.response.alternative11",
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

    public val listImageModelEndpointsMetadata: OperationMetadata = OperationMetadata(
          operationId = "listImageModelEndpoints",
          method = "GET",
          path = "/images/models/{author}/{slug}/endpoints",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ImageModelEndpointsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listImageModelEndpoints.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listImageModelEndpoints.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listImageModelEndpoints.response.alternative2",
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

    public val listImageModelsMetadata: OperationMetadata = OperationMetadata(
          operationId = "listImageModels",
          method = "GET",
          path = "/images/models",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ImageModelsListResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listImageModels.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listImageModels.response.alternative1",
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
