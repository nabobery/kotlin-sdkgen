package io.github.nabobery.sdkgen.generated.images

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
import io.github.nabobery.sdkgen.generated.BadGatewayResponse
import io.github.nabobery.sdkgen.generated.BadRequestResponse
import io.github.nabobery.sdkgen.generated.EdgeNetworkTimeoutResponse
import io.github.nabobery.sdkgen.generated.ForbiddenResponse
import io.github.nabobery.sdkgen.generated.ImageGenerationRequest
import io.github.nabobery.sdkgen.generated.ImageGenerationResponse
import io.github.nabobery.sdkgen.generated.ImageModelEndpointsResponse
import io.github.nabobery.sdkgen.generated.ImageModelsListResponse
import io.github.nabobery.sdkgen.generated.InternalServerResponse
import io.github.nabobery.sdkgen.generated.NotFoundResponse
import io.github.nabobery.sdkgen.generated.PayloadTooLargeResponse
import io.github.nabobery.sdkgen.generated.PaymentRequiredResponse
import io.github.nabobery.sdkgen.generated.ProviderOverloadedResponse
import io.github.nabobery.sdkgen.generated.SdkJson
import io.github.nabobery.sdkgen.generated.TooManyRequestsResponse
import io.github.nabobery.sdkgen.generated.UnauthorizedResponse
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

internal object ImagesCodecs {
  internal const val CREATEIMAGES_REQUEST_CODEC_ID: String = "createImages.request"

  private val createImagesRequestCodec: MediaTypeCodec<ImageGenerationRequest> =
      KotlinxSerializationCodec(CREATEIMAGES_REQUEST_CODEC_ID, ImageGenerationRequest.Serializer, SdkJson)

  internal const val CREATEIMAGES_RESPONSE_CODEC_ID: String = "createImages.response"

  private val createImagesResponseCodec: MediaTypeCodec<ImageGenerationResponse> =
      KotlinxSerializationCodec(CREATEIMAGES_RESPONSE_CODEC_ID, ImageGenerationResponse.Serializer, SdkJson)

  private val createImagesResponseCodecAlternative0Codec: MediaTypeCodec<ImageGenerationResponse> =
      KotlinxSerializationCodec("createImages.response.alternative0", ImageGenerationResponse.Serializer, SdkJson)

  internal val createImagesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ImageGenerationResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative0Codec)

  private val createImagesResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createImages.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val createImagesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative1Codec)

  private val createImagesResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createImages.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val createImagesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative2Codec)

  private val createImagesResponseCodecAlternative3Codec: MediaTypeCodec<PaymentRequiredResponse> =
      KotlinxSerializationCodec("createImages.response.alternative3", PaymentRequiredResponse.Serializer, SdkJson)

  internal val createImagesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<PaymentRequiredResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative3Codec)

  private val createImagesResponseCodecAlternative4Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("createImages.response.alternative4", ForbiddenResponse.Serializer, SdkJson)

  internal val createImagesResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative4Codec)

  private val createImagesResponseCodecAlternative5Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("createImages.response.alternative5", NotFoundResponse.Serializer, SdkJson)

  internal val createImagesResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative5Codec)

  private val createImagesResponseCodecAlternative6Codec: MediaTypeCodec<PayloadTooLargeResponse> =
      KotlinxSerializationCodec("createImages.response.alternative6", PayloadTooLargeResponse.Serializer, SdkJson)

  internal val createImagesResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<PayloadTooLargeResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative6Codec)

  private val createImagesResponseCodecAlternative7Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("createImages.response.alternative7", TooManyRequestsResponse.Serializer, SdkJson)

  internal val createImagesResponseCodecAlternative7Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative7Codec)

  private val createImagesResponseCodecAlternative8Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createImages.response.alternative8", InternalServerResponse.Serializer, SdkJson)

  internal val createImagesResponseCodecAlternative8Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative8Codec)

  private val createImagesResponseCodecAlternative9Codec: MediaTypeCodec<BadGatewayResponse> =
      KotlinxSerializationCodec("createImages.response.alternative9", BadGatewayResponse.Serializer, SdkJson)

  internal val createImagesResponseCodecAlternative9Registry:
      MediaTypeCodecRegistry<BadGatewayResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative9Codec)

  private val createImagesResponseCodecAlternative10Codec:
      MediaTypeCodec<EdgeNetworkTimeoutResponse> =
      KotlinxSerializationCodec("createImages.response.alternative10", EdgeNetworkTimeoutResponse.Serializer, SdkJson)

  internal val createImagesResponseCodecAlternative10Registry:
      MediaTypeCodecRegistry<EdgeNetworkTimeoutResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative10Codec)

  private val createImagesResponseCodecAlternative11Codec:
      MediaTypeCodec<ProviderOverloadedResponse> =
      KotlinxSerializationCodec("createImages.response.alternative11", ProviderOverloadedResponse.Serializer, SdkJson)

  internal val createImagesResponseCodecAlternative11Registry:
      MediaTypeCodecRegistry<ProviderOverloadedResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodecAlternative11Codec)

  internal val createImagesRequestCodecRegistry: MediaTypeCodecRegistry<ImageGenerationRequest> =
      MediaTypeCodecRegistry.of(createImagesRequestCodec)

  internal val createImagesResponseCodecRegistry: MediaTypeCodecRegistry<ImageGenerationResponse> =
      MediaTypeCodecRegistry.of(createImagesResponseCodec)

  internal const val LISTIMAGEMODELENDPOINTS_RESPONSE_CODEC_ID: String =
      "listImageModelEndpoints.response"

  private val listImageModelEndpointsResponseCodec: MediaTypeCodec<ImageModelEndpointsResponse> =
      KotlinxSerializationCodec(LISTIMAGEMODELENDPOINTS_RESPONSE_CODEC_ID, ImageModelEndpointsResponse.Serializer, SdkJson)

  private val listImageModelEndpointsResponseCodecAlternative0Codec:
      MediaTypeCodec<ImageModelEndpointsResponse> =
      KotlinxSerializationCodec("listImageModelEndpoints.response.alternative0", ImageModelEndpointsResponse.Serializer, SdkJson)

  internal val listImageModelEndpointsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ImageModelEndpointsResponse> =
      MediaTypeCodecRegistry.of(listImageModelEndpointsResponseCodecAlternative0Codec)

  private val listImageModelEndpointsResponseCodecAlternative1Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("listImageModelEndpoints.response.alternative1", NotFoundResponse.Serializer, SdkJson)

  internal val listImageModelEndpointsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(listImageModelEndpointsResponseCodecAlternative1Codec)

  private val listImageModelEndpointsResponseCodecAlternative2Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listImageModelEndpoints.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  internal val listImageModelEndpointsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listImageModelEndpointsResponseCodecAlternative2Codec)

  internal val listImageModelEndpointsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listImageModelEndpointsResponseCodecRegistry:
      MediaTypeCodecRegistry<ImageModelEndpointsResponse> =
      MediaTypeCodecRegistry.of(listImageModelEndpointsResponseCodec)

  internal const val LISTIMAGEMODELS_RESPONSE_CODEC_ID: String = "listImageModels.response"

  private val listImageModelsResponseCodec: MediaTypeCodec<ImageModelsListResponse> =
      KotlinxSerializationCodec(LISTIMAGEMODELS_RESPONSE_CODEC_ID, ImageModelsListResponse.Serializer, SdkJson)

  private val listImageModelsResponseCodecAlternative0Codec: MediaTypeCodec<ImageModelsListResponse>
      =
      KotlinxSerializationCodec("listImageModels.response.alternative0", ImageModelsListResponse.Serializer, SdkJson)

  internal val listImageModelsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ImageModelsListResponse> =
      MediaTypeCodecRegistry.of(listImageModelsResponseCodecAlternative0Codec)

  private val listImageModelsResponseCodecAlternative1Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("listImageModels.response.alternative1", InternalServerResponse.Serializer, SdkJson)

  internal val listImageModelsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listImageModelsResponseCodecAlternative1Codec)

  internal val listImageModelsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listImageModelsResponseCodecRegistry: MediaTypeCodecRegistry<ImageModelsListResponse>
      = MediaTypeCodecRegistry.of(listImageModelsResponseCodec)
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
   * @throws CreateImagesApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded CreateImagesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createImages(
    request: ImageGenerationRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): ImageGenerationResponse = executor.executeWithTypedErrors<ImageGenerationRequest, CreateImagesResponse, ImageGenerationResponse>(
    request = SdkExecutionRequest(createImagesMetadata, baseUri, request, listOf(ImagesCodecs.CREATEIMAGES_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ImagesCodecs.createImagesRequestCodecRegistry,
    responseDecoder = CreateImagesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CreateImagesResponse.SuccessJson -> response.json
        is CreateImagesResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateImagesResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateImagesResponse.Http402Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateImagesResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateImagesResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateImagesResponse.Http413Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateImagesResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateImagesResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateImagesResponse.Http502Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateImagesResponse.Http524Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateImagesResponse.Http529Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateImagesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CreateImagesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CreateImagesResponse.Http400Json -> CreateImagesApiException(response, statusCode, headers)
        is CreateImagesResponse.Http401Json -> CreateImagesApiException(response, statusCode, headers)
        is CreateImagesResponse.Http402Json -> CreateImagesApiException(response, statusCode, headers)
        is CreateImagesResponse.Http403Json -> CreateImagesApiException(response, statusCode, headers)
        is CreateImagesResponse.Http404Json -> CreateImagesApiException(response, statusCode, headers)
        is CreateImagesResponse.Http413Json -> CreateImagesApiException(response, statusCode, headers)
        is CreateImagesResponse.Http429Json -> CreateImagesApiException(response, statusCode, headers)
        is CreateImagesResponse.Http500Json -> CreateImagesApiException(response, statusCode, headers)
        is CreateImagesResponse.Http502Json -> CreateImagesApiException(response, statusCode, headers)
        is CreateImagesResponse.Http524Json -> CreateImagesApiException(response, statusCode, headers)
        is CreateImagesResponse.Http529Json -> CreateImagesApiException(response, statusCode, headers)
        is CreateImagesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Generates an image from a text prompt via the image generation router
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
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
  public suspend fun createImagesWithResponse(
    request: ImageGenerationRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateImagesResponse> = executor.executeWithResponse<ImageGenerationRequest, CreateImagesResponse>(SdkExecutionRequest(createImagesMetadata, baseUri, request, listOf(ImagesCodecs.CREATEIMAGES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ImagesCodecs.createImagesRequestCodecRegistry, CreateImagesResponseDecoder, options)

  /**
   * Returns the full per-endpoint records for an image model: each endpoint's definitive supported parameters, pricing,
   * and passthrough allowlist.
   *
   * @param author Model author/organization
   * @param slug Model slug
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
   * @throws ListImageModelEndpointsApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ListImageModelEndpointsError payload.
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
  ): ImageModelEndpointsResponse = executor.executeWithTypedErrors<Unit, ListImageModelEndpointsResponse, ImageModelEndpointsResponse>(
    request = SdkExecutionRequest(listImageModelEndpointsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "author", values = listOf(author.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ImagesCodecs.listImageModelEndpointsRequestCodecRegistry,
    responseDecoder = ListImageModelEndpointsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ListImageModelEndpointsResponse.SuccessJson -> response.json
        is ListImageModelEndpointsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ListImageModelEndpointsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is ListImageModelEndpointsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ListImageModelEndpointsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ListImageModelEndpointsResponse.Http404Json -> ListImageModelEndpointsApiException(response, statusCode, headers)
        is ListImageModelEndpointsResponse.Http500Json -> ListImageModelEndpointsApiException(response, statusCode, headers)
        is ListImageModelEndpointsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Returns the full per-endpoint records for an image model: each endpoint's definitive supported parameters, pricing,
   * and passthrough allowlist.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param author Model author/organization
   * @param slug Model slug
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
  public suspend fun listImageModelEndpointsWithResponse(
    author: String,
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListImageModelEndpointsResponse> = executor.executeWithResponse<Unit, ListImageModelEndpointsResponse>(SdkExecutionRequest(listImageModelEndpointsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "author", values = listOf(author.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ImagesCodecs.listImageModelEndpointsRequestCodecRegistry, ListImageModelEndpointsResponseDecoder, options)

  /**
   * Lists every image generation model with its top-level supported-parameter superset and a URL to its full
   * per-endpoint records.
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
   * @throws ListImageModelsApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded ListImageModelsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listImageModels(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): ImageModelsListResponse = executor.executeWithTypedErrors<Unit, ListImageModelsResponse, ImageModelsListResponse>(
    request = SdkExecutionRequest(listImageModelsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ImagesCodecs.listImageModelsRequestCodecRegistry,
    responseDecoder = ListImageModelsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ListImageModelsResponse.SuccessJson -> response.json
        is ListImageModelsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is ListImageModelsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ListImageModelsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ListImageModelsResponse.Http500Json -> ListImageModelsApiException(response, statusCode, headers)
        is ListImageModelsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists every image generation model with its top-level supported-parameter superset and a URL to its full
   * per-endpoint records.
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
  public suspend fun listImageModelsWithResponse(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListImageModelsResponse> = executor.executeWithResponse<Unit, ListImageModelsResponse>(SdkExecutionRequest(listImageModelsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ImagesCodecs.listImageModelsRequestCodecRegistry, ListImageModelsResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `createImages` may expose through its typed API exception.
   */
  public sealed interface CreateImagesError

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
    ) : CreateImagesResponse,
        CreateImagesError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse,
        CreateImagesError

    public class Http402Json(
      public val json: PaymentRequiredResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse,
        CreateImagesError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse,
        CreateImagesError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse,
        CreateImagesError

    public class Http413Json(
      public val json: PayloadTooLargeResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse,
        CreateImagesError

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse,
        CreateImagesError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse,
        CreateImagesError

    public class Http502Json(
      public val json: BadGatewayResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse,
        CreateImagesError

    public class Http524Json(
      public val json: EdgeNetworkTimeoutResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse,
        CreateImagesError

    public class Http529Json(
      public val json: ProviderOverloadedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse,
        CreateImagesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateImagesResponse
  }

  /**
   * Raised by `createImages` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class CreateImagesApiException(
    public val error: CreateImagesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "createImages")

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
          json = ImagesCodecs.createImagesResponseCodecAlternative0Registry.select(listOf("createImages.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http400Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative1Registry.select(listOf("createImages.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http401Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative2Registry.select(listOf("createImages.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http402Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative3Registry.select(listOf("createImages.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http403Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative4Registry.select(listOf("createImages.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative5" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http404Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative5Registry.select(listOf("createImages.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative6" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http413Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative6Registry.select(listOf("createImages.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative7" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http429Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative7Registry.select(listOf("createImages.response.alternative7"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative8" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http500Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative8Registry.select(listOf("createImages.response.alternative8"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative9" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http502Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative9Registry.select(listOf("createImages.response.alternative9"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative10" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http524Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative10Registry.select(listOf("createImages.response.alternative10"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createImages.response.alternative11" -> SdkResponseDecodeResult(
        value = CreateImagesResponse.Http529Json(
          json = ImagesCodecs.createImagesResponseCodecAlternative11Registry.select(listOf("createImages.response.alternative11"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
   * Decoded non-success response alternatives that `listImageModelEndpoints` may expose through its typed API
   * exception.
   */
  public sealed interface ListImageModelEndpointsError

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
    ) : ListImageModelEndpointsResponse,
        ListImageModelEndpointsError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListImageModelEndpointsResponse,
        ListImageModelEndpointsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListImageModelEndpointsResponse
  }

  /**
   * Raised by `listImageModelEndpoints` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ListImageModelEndpointsApiException(
    public val error: ListImageModelEndpointsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listImageModelEndpoints")

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
          json = ImagesCodecs.listImageModelEndpointsResponseCodecAlternative0Registry.select(listOf("listImageModelEndpoints.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listImageModelEndpoints.response.alternative1" -> SdkResponseDecodeResult(
        value = ListImageModelEndpointsResponse.Http404Json(
          json = ImagesCodecs.listImageModelEndpointsResponseCodecAlternative1Registry.select(listOf("listImageModelEndpoints.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listImageModelEndpoints.response.alternative2" -> SdkResponseDecodeResult(
        value = ListImageModelEndpointsResponse.Http500Json(
          json = ImagesCodecs.listImageModelEndpointsResponseCodecAlternative2Registry.select(listOf("listImageModelEndpoints.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ListImageModelEndpointsResponse = ListImageModelEndpointsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `listImageModels` may expose through its typed API exception.
   */
  public sealed interface ListImageModelsError

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
    ) : ListImageModelsResponse,
        ListImageModelsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListImageModelsResponse
  }

  /**
   * Raised by `listImageModels` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class ListImageModelsApiException(
    public val error: ListImageModelsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listImageModels")

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
          json = ImagesCodecs.listImageModelsResponseCodecAlternative0Registry.select(listOf("listImageModels.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listImageModels.response.alternative1" -> SdkResponseDecodeResult(
        value = ListImageModelsResponse.Http500Json(
          json = ImagesCodecs.listImageModelsResponseCodecAlternative1Registry.select(listOf("listImageModels.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    internal val createImagesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
        ) }

    internal val listImageModelEndpointsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
        ) }

    internal val listImageModelsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
        ) }
  }
}
