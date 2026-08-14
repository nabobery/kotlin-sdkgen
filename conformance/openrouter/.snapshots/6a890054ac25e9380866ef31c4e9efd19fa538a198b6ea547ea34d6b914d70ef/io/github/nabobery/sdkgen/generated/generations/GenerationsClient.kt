package io.github.nabobery.sdkgen.generated.generations

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
import io.github.nabobery.sdkgen.generated.GenerationContentResponse
import io.github.nabobery.sdkgen.generated.GenerationResponse
import io.github.nabobery.sdkgen.generated.InternalServerResponse
import io.github.nabobery.sdkgen.generated.NotFoundResponse
import io.github.nabobery.sdkgen.generated.PaymentRequiredResponse
import io.github.nabobery.sdkgen.generated.ProviderOverloadedResponse
import io.github.nabobery.sdkgen.generated.SdkJson
import io.github.nabobery.sdkgen.generated.SubmitGenerationFeedbackRequest
import io.github.nabobery.sdkgen.generated.SubmitGenerationFeedbackResponse
import io.github.nabobery.sdkgen.generated.TooManyRequestsResponse
import io.github.nabobery.sdkgen.generated.UnauthorizedResponse
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

internal object GenerationsCodecs {
  internal const val GETGENERATION_RESPONSE_CODEC_ID: String = "getGeneration.response"

  private val getGenerationResponseCodec: MediaTypeCodec<GenerationResponse> =
      KotlinxSerializationCodec(GETGENERATION_RESPONSE_CODEC_ID, GenerationResponse.Serializer, SdkJson)

  private val getGenerationResponseCodecAlternative0Codec: MediaTypeCodec<GenerationResponse> =
      KotlinxSerializationCodec("getGeneration.response.alternative0", GenerationResponse.Serializer, SdkJson)

  internal val getGenerationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<GenerationResponse> =
      MediaTypeCodecRegistry.of(getGenerationResponseCodecAlternative0Codec)

  private val getGenerationResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getGeneration.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val getGenerationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getGenerationResponseCodecAlternative1Codec)

  private val getGenerationResponseCodecAlternative2Codec: MediaTypeCodec<PaymentRequiredResponse> =
      KotlinxSerializationCodec("getGeneration.response.alternative2", PaymentRequiredResponse.Serializer, SdkJson)

  internal val getGenerationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<PaymentRequiredResponse> =
      MediaTypeCodecRegistry.of(getGenerationResponseCodecAlternative2Codec)

  private val getGenerationResponseCodecAlternative3Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getGeneration.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  internal val getGenerationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(getGenerationResponseCodecAlternative3Codec)

  private val getGenerationResponseCodecAlternative4Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("getGeneration.response.alternative4", TooManyRequestsResponse.Serializer, SdkJson)

  internal val getGenerationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(getGenerationResponseCodecAlternative4Codec)

  private val getGenerationResponseCodecAlternative5Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getGeneration.response.alternative5", InternalServerResponse.Serializer, SdkJson)

  internal val getGenerationResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getGenerationResponseCodecAlternative5Codec)

  private val getGenerationResponseCodecAlternative6Codec: MediaTypeCodec<BadGatewayResponse> =
      KotlinxSerializationCodec("getGeneration.response.alternative6", BadGatewayResponse.Serializer, SdkJson)

  internal val getGenerationResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<BadGatewayResponse> =
      MediaTypeCodecRegistry.of(getGenerationResponseCodecAlternative6Codec)

  private val getGenerationResponseCodecAlternative7Codec:
      MediaTypeCodec<EdgeNetworkTimeoutResponse> =
      KotlinxSerializationCodec("getGeneration.response.alternative7", EdgeNetworkTimeoutResponse.Serializer, SdkJson)

  internal val getGenerationResponseCodecAlternative7Registry:
      MediaTypeCodecRegistry<EdgeNetworkTimeoutResponse> =
      MediaTypeCodecRegistry.of(getGenerationResponseCodecAlternative7Codec)

  private val getGenerationResponseCodecAlternative8Codec:
      MediaTypeCodec<ProviderOverloadedResponse> =
      KotlinxSerializationCodec("getGeneration.response.alternative8", ProviderOverloadedResponse.Serializer, SdkJson)

  internal val getGenerationResponseCodecAlternative8Registry:
      MediaTypeCodecRegistry<ProviderOverloadedResponse> =
      MediaTypeCodecRegistry.of(getGenerationResponseCodecAlternative8Codec)

  internal val getGenerationRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val getGenerationResponseCodecRegistry: MediaTypeCodecRegistry<GenerationResponse> =
      MediaTypeCodecRegistry.of(getGenerationResponseCodec)

  internal const val LISTGENERATIONCONTENT_RESPONSE_CODEC_ID: String =
      "listGenerationContent.response"

  private val listGenerationContentResponseCodec: MediaTypeCodec<GenerationContentResponse> =
      KotlinxSerializationCodec(LISTGENERATIONCONTENT_RESPONSE_CODEC_ID, GenerationContentResponse.Serializer, SdkJson)

  private val listGenerationContentResponseCodecAlternative0Codec:
      MediaTypeCodec<GenerationContentResponse> =
      KotlinxSerializationCodec("listGenerationContent.response.alternative0", GenerationContentResponse.Serializer, SdkJson)

  internal val listGenerationContentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<GenerationContentResponse> =
      MediaTypeCodecRegistry.of(listGenerationContentResponseCodecAlternative0Codec)

  private val listGenerationContentResponseCodecAlternative1Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listGenerationContent.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val listGenerationContentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listGenerationContentResponseCodecAlternative1Codec)

  private val listGenerationContentResponseCodecAlternative2Codec: MediaTypeCodec<ForbiddenResponse>
      =
      KotlinxSerializationCodec("listGenerationContent.response.alternative2", ForbiddenResponse.Serializer, SdkJson)

  internal val listGenerationContentResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(listGenerationContentResponseCodecAlternative2Codec)

  private val listGenerationContentResponseCodecAlternative3Codec: MediaTypeCodec<NotFoundResponse>
      =
      KotlinxSerializationCodec("listGenerationContent.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  internal val listGenerationContentResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(listGenerationContentResponseCodecAlternative3Codec)

  private val listGenerationContentResponseCodecAlternative4Codec:
      MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("listGenerationContent.response.alternative4", TooManyRequestsResponse.Serializer, SdkJson)

  internal val listGenerationContentResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(listGenerationContentResponseCodecAlternative4Codec)

  private val listGenerationContentResponseCodecAlternative5Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listGenerationContent.response.alternative5", InternalServerResponse.Serializer, SdkJson)

  internal val listGenerationContentResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listGenerationContentResponseCodecAlternative5Codec)

  private val listGenerationContentResponseCodecAlternative6Codec:
      MediaTypeCodec<BadGatewayResponse> =
      KotlinxSerializationCodec("listGenerationContent.response.alternative6", BadGatewayResponse.Serializer, SdkJson)

  internal val listGenerationContentResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<BadGatewayResponse> =
      MediaTypeCodecRegistry.of(listGenerationContentResponseCodecAlternative6Codec)

  private val listGenerationContentResponseCodecAlternative7Codec:
      MediaTypeCodec<EdgeNetworkTimeoutResponse> =
      KotlinxSerializationCodec("listGenerationContent.response.alternative7", EdgeNetworkTimeoutResponse.Serializer, SdkJson)

  internal val listGenerationContentResponseCodecAlternative7Registry:
      MediaTypeCodecRegistry<EdgeNetworkTimeoutResponse> =
      MediaTypeCodecRegistry.of(listGenerationContentResponseCodecAlternative7Codec)

  private val listGenerationContentResponseCodecAlternative8Codec:
      MediaTypeCodec<ProviderOverloadedResponse> =
      KotlinxSerializationCodec("listGenerationContent.response.alternative8", ProviderOverloadedResponse.Serializer, SdkJson)

  internal val listGenerationContentResponseCodecAlternative8Registry:
      MediaTypeCodecRegistry<ProviderOverloadedResponse> =
      MediaTypeCodecRegistry.of(listGenerationContentResponseCodecAlternative8Codec)

  internal val listGenerationContentRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listGenerationContentResponseCodecRegistry:
      MediaTypeCodecRegistry<GenerationContentResponse> =
      MediaTypeCodecRegistry.of(listGenerationContentResponseCodec)

  internal const val SUBMITGENERATIONFEEDBACK_REQUEST_CODEC_ID: String =
      "submitGenerationFeedback.request"

  private val submitGenerationFeedbackRequestCodec: MediaTypeCodec<SubmitGenerationFeedbackRequest>
      =
      KotlinxSerializationCodec(SUBMITGENERATIONFEEDBACK_REQUEST_CODEC_ID, SubmitGenerationFeedbackRequest.Serializer, SdkJson)

  internal const val SUBMITGENERATIONFEEDBACK_RESPONSE_CODEC_ID: String =
      "submitGenerationFeedback.response"

  private val submitGenerationFeedbackResponseCodec:
      MediaTypeCodec<SubmitGenerationFeedbackResponse> =
      KotlinxSerializationCodec(SUBMITGENERATIONFEEDBACK_RESPONSE_CODEC_ID, SubmitGenerationFeedbackResponse.Serializer, SdkJson)

  private val submitGenerationFeedbackResponseCodecAlternative0Codec:
      MediaTypeCodec<SubmitGenerationFeedbackResponse> =
      KotlinxSerializationCodec("submitGenerationFeedback.response.alternative0", SubmitGenerationFeedbackResponse.Serializer, SdkJson)

  internal val submitGenerationFeedbackResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SubmitGenerationFeedbackResponse> =
      MediaTypeCodecRegistry.of(submitGenerationFeedbackResponseCodecAlternative0Codec)

  private val submitGenerationFeedbackResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("submitGenerationFeedback.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val submitGenerationFeedbackResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(submitGenerationFeedbackResponseCodecAlternative1Codec)

  private val submitGenerationFeedbackResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("submitGenerationFeedback.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val submitGenerationFeedbackResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(submitGenerationFeedbackResponseCodecAlternative2Codec)

  private val submitGenerationFeedbackResponseCodecAlternative3Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("submitGenerationFeedback.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  internal val submitGenerationFeedbackResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(submitGenerationFeedbackResponseCodecAlternative3Codec)

  private val submitGenerationFeedbackResponseCodecAlternative4Codec:
      MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("submitGenerationFeedback.response.alternative4", TooManyRequestsResponse.Serializer, SdkJson)

  internal val submitGenerationFeedbackResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(submitGenerationFeedbackResponseCodecAlternative4Codec)

  private val submitGenerationFeedbackResponseCodecAlternative5Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("submitGenerationFeedback.response.alternative5", InternalServerResponse.Serializer, SdkJson)

  internal val submitGenerationFeedbackResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(submitGenerationFeedbackResponseCodecAlternative5Codec)

  internal val submitGenerationFeedbackRequestCodecRegistry:
      MediaTypeCodecRegistry<SubmitGenerationFeedbackRequest> =
      MediaTypeCodecRegistry.of(submitGenerationFeedbackRequestCodec)

  internal val submitGenerationFeedbackResponseCodecRegistry:
      MediaTypeCodecRegistry<SubmitGenerationFeedbackResponse> =
      MediaTypeCodecRegistry.of(submitGenerationFeedbackResponseCodec)
}

/**
 * Client for the 'Generations' group of OpenRouter API.
 */
public class GenerationsClient(
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
      SdkExecutor(transport, authentication = this@GenerationsClient.authentication)

  /**
   * Get request & usage metadata for a generation
   *
   * @param id The generation ID
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
   * @throws GetGenerationApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GetGenerationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getGeneration(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): GenerationResponse = executor.executeWithTypedErrors<Unit, GetGenerationResponse, GenerationResponse>(
    request = SdkExecutionRequest(getGenerationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = GenerationsCodecs.getGenerationRequestCodecRegistry,
    responseDecoder = GetGenerationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GetGenerationResponse.SuccessJson -> response.json
        is GetGenerationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is GetGenerationResponse.Http402Json -> error("Runtime selected a non-success response for success mapping.")
        is GetGenerationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GetGenerationResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is GetGenerationResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is GetGenerationResponse.Http502Json -> error("Runtime selected a non-success response for success mapping.")
        is GetGenerationResponse.Http524Json -> error("Runtime selected a non-success response for success mapping.")
        is GetGenerationResponse.Http529Json -> error("Runtime selected a non-success response for success mapping.")
        is GetGenerationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GetGenerationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GetGenerationResponse.Http401Json -> GetGenerationApiException(response, statusCode, headers)
        is GetGenerationResponse.Http402Json -> GetGenerationApiException(response, statusCode, headers)
        is GetGenerationResponse.Http404Json -> GetGenerationApiException(response, statusCode, headers)
        is GetGenerationResponse.Http429Json -> GetGenerationApiException(response, statusCode, headers)
        is GetGenerationResponse.Http500Json -> GetGenerationApiException(response, statusCode, headers)
        is GetGenerationResponse.Http502Json -> GetGenerationApiException(response, statusCode, headers)
        is GetGenerationResponse.Http524Json -> GetGenerationApiException(response, statusCode, headers)
        is GetGenerationResponse.Http529Json -> GetGenerationApiException(response, statusCode, headers)
        is GetGenerationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Get request & usage metadata for a generation
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param id The generation ID
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
  public suspend fun getGenerationWithResponse(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetGenerationResponse> = executor.executeWithResponse<Unit, GetGenerationResponse>(SdkExecutionRequest(getGenerationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GenerationsCodecs.getGenerationRequestCodecRegistry, GetGenerationResponseDecoder, options)

  /**
   * Get stored prompt and completion content for a generation
   *
   * @param id The generation ID
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
   * @throws ListGenerationContentApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ListGenerationContentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listGenerationContent(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): GenerationContentResponse = executor.executeWithTypedErrors<Unit, ListGenerationContentResponse, GenerationContentResponse>(
    request = SdkExecutionRequest(listGenerationContentMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = GenerationsCodecs.listGenerationContentRequestCodecRegistry,
    responseDecoder = ListGenerationContentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ListGenerationContentResponse.SuccessJson -> response.json
        is ListGenerationContentResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ListGenerationContentResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ListGenerationContentResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ListGenerationContentResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is ListGenerationContentResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is ListGenerationContentResponse.Http502Json -> error("Runtime selected a non-success response for success mapping.")
        is ListGenerationContentResponse.Http524Json -> error("Runtime selected a non-success response for success mapping.")
        is ListGenerationContentResponse.Http529Json -> error("Runtime selected a non-success response for success mapping.")
        is ListGenerationContentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ListGenerationContentResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ListGenerationContentResponse.Http401Json -> ListGenerationContentApiException(response, statusCode, headers)
        is ListGenerationContentResponse.Http403Json -> ListGenerationContentApiException(response, statusCode, headers)
        is ListGenerationContentResponse.Http404Json -> ListGenerationContentApiException(response, statusCode, headers)
        is ListGenerationContentResponse.Http429Json -> ListGenerationContentApiException(response, statusCode, headers)
        is ListGenerationContentResponse.Http500Json -> ListGenerationContentApiException(response, statusCode, headers)
        is ListGenerationContentResponse.Http502Json -> ListGenerationContentApiException(response, statusCode, headers)
        is ListGenerationContentResponse.Http524Json -> ListGenerationContentApiException(response, statusCode, headers)
        is ListGenerationContentResponse.Http529Json -> ListGenerationContentApiException(response, statusCode, headers)
        is ListGenerationContentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Get stored prompt and completion content for a generation
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param id The generation ID
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
  public suspend fun listGenerationContentWithResponse(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListGenerationContentResponse> = executor.executeWithResponse<Unit, ListGenerationContentResponse>(SdkExecutionRequest(listGenerationContentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GenerationsCodecs.listGenerationContentRequestCodecRegistry, ListGenerationContentResponseDecoder, options)

  /**
   * Submit structured feedback on a generation the authenticated user made. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
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
   * @throws SubmitGenerationFeedbackApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded SubmitGenerationFeedbackError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun submitGenerationFeedback(
    request: SubmitGenerationFeedbackRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): io.github.nabobery.sdkgen.generated.SubmitGenerationFeedbackResponse = executor.executeWithTypedErrors<SubmitGenerationFeedbackRequest, SubmitGenerationFeedbackResponse, io.github.nabobery.sdkgen.generated.SubmitGenerationFeedbackResponse>(
    request = SdkExecutionRequest(submitGenerationFeedbackMetadata, baseUri, request, listOf(GenerationsCodecs.SUBMITGENERATIONFEEDBACK_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = GenerationsCodecs.submitGenerationFeedbackRequestCodecRegistry,
    responseDecoder = SubmitGenerationFeedbackResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SubmitGenerationFeedbackResponse.SuccessJson -> response.json
        is SubmitGenerationFeedbackResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is SubmitGenerationFeedbackResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is SubmitGenerationFeedbackResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SubmitGenerationFeedbackResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is SubmitGenerationFeedbackResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is SubmitGenerationFeedbackResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SubmitGenerationFeedbackResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SubmitGenerationFeedbackResponse.Http400Json -> SubmitGenerationFeedbackApiException(response, statusCode, headers)
        is SubmitGenerationFeedbackResponse.Http401Json -> SubmitGenerationFeedbackApiException(response, statusCode, headers)
        is SubmitGenerationFeedbackResponse.Http404Json -> SubmitGenerationFeedbackApiException(response, statusCode, headers)
        is SubmitGenerationFeedbackResponse.Http429Json -> SubmitGenerationFeedbackApiException(response, statusCode, headers)
        is SubmitGenerationFeedbackResponse.Http500Json -> SubmitGenerationFeedbackApiException(response, statusCode, headers)
        is SubmitGenerationFeedbackResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Submit structured feedback on a generation the authenticated user made. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
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
  public suspend fun submitGenerationFeedbackWithResponse(
    request: SubmitGenerationFeedbackRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SubmitGenerationFeedbackResponse> = executor.executeWithResponse<SubmitGenerationFeedbackRequest, SubmitGenerationFeedbackResponse>(SdkExecutionRequest(submitGenerationFeedbackMetadata, baseUri, request, listOf(GenerationsCodecs.SUBMITGENERATIONFEEDBACK_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GenerationsCodecs.submitGenerationFeedbackRequestCodecRegistry, SubmitGenerationFeedbackResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `getGeneration` may expose through its typed API exception.
   */
  public sealed interface GetGenerationError

  /**
   * Typed response alternatives for `getGeneration`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetGenerationResponse {
    public class SuccessJson(
      public val json: GenerationResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetGenerationResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetGenerationResponse,
        GetGenerationError

    public class Http402Json(
      public val json: PaymentRequiredResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetGenerationResponse,
        GetGenerationError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetGenerationResponse,
        GetGenerationError

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetGenerationResponse,
        GetGenerationError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetGenerationResponse,
        GetGenerationError

    public class Http502Json(
      public val json: BadGatewayResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetGenerationResponse,
        GetGenerationError

    public class Http524Json(
      public val json: EdgeNetworkTimeoutResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetGenerationResponse,
        GetGenerationError

    public class Http529Json(
      public val json: ProviderOverloadedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetGenerationResponse,
        GetGenerationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetGenerationResponse
  }

  /**
   * Raised by `getGeneration` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class GetGenerationApiException(
    public val error: GetGenerationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "getGeneration")

  private object GetGenerationResponseDecoder : SdkResponseAlternativeDecoder<GetGenerationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetGenerationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetGenerationResponse> = when {
      alternative.id == "getGeneration.response.alternative0" -> SdkResponseDecodeResult(
        value = GetGenerationResponse.SuccessJson(
          json = GenerationsCodecs.getGenerationResponseCodecAlternative0Registry.select(listOf("getGeneration.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getGeneration.response.alternative1" -> SdkResponseDecodeResult(
        value = GetGenerationResponse.Http401Json(
          json = GenerationsCodecs.getGenerationResponseCodecAlternative1Registry.select(listOf("getGeneration.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getGeneration.response.alternative2" -> SdkResponseDecodeResult(
        value = GetGenerationResponse.Http402Json(
          json = GenerationsCodecs.getGenerationResponseCodecAlternative2Registry.select(listOf("getGeneration.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getGeneration.response.alternative3" -> SdkResponseDecodeResult(
        value = GetGenerationResponse.Http404Json(
          json = GenerationsCodecs.getGenerationResponseCodecAlternative3Registry.select(listOf("getGeneration.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getGeneration.response.alternative4" -> SdkResponseDecodeResult(
        value = GetGenerationResponse.Http429Json(
          json = GenerationsCodecs.getGenerationResponseCodecAlternative4Registry.select(listOf("getGeneration.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getGeneration.response.alternative5" -> SdkResponseDecodeResult(
        value = GetGenerationResponse.Http500Json(
          json = GenerationsCodecs.getGenerationResponseCodecAlternative5Registry.select(listOf("getGeneration.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getGeneration.response.alternative6" -> SdkResponseDecodeResult(
        value = GetGenerationResponse.Http502Json(
          json = GenerationsCodecs.getGenerationResponseCodecAlternative6Registry.select(listOf("getGeneration.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getGeneration.response.alternative7" -> SdkResponseDecodeResult(
        value = GetGenerationResponse.Http524Json(
          json = GenerationsCodecs.getGenerationResponseCodecAlternative7Registry.select(listOf("getGeneration.response.alternative7"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getGeneration.response.alternative8" -> SdkResponseDecodeResult(
        value = GetGenerationResponse.Http529Json(
          json = GenerationsCodecs.getGenerationResponseCodecAlternative8Registry.select(listOf("getGeneration.response.alternative8"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetGenerationResponse = GetGenerationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `listGenerationContent` may expose through its typed API exception.
   */
  public sealed interface ListGenerationContentError

  /**
   * Typed response alternatives for `listGenerationContent`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ListGenerationContentResponse {
    public class SuccessJson(
      public val json: GenerationContentResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGenerationContentResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGenerationContentResponse,
        ListGenerationContentError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGenerationContentResponse,
        ListGenerationContentError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGenerationContentResponse,
        ListGenerationContentError

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGenerationContentResponse,
        ListGenerationContentError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGenerationContentResponse,
        ListGenerationContentError

    public class Http502Json(
      public val json: BadGatewayResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGenerationContentResponse,
        ListGenerationContentError

    public class Http524Json(
      public val json: EdgeNetworkTimeoutResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGenerationContentResponse,
        ListGenerationContentError

    public class Http529Json(
      public val json: ProviderOverloadedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGenerationContentResponse,
        ListGenerationContentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGenerationContentResponse
  }

  /**
   * Raised by `listGenerationContent` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ListGenerationContentApiException(
    public val error: ListGenerationContentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listGenerationContent")

  private object ListGenerationContentResponseDecoder : SdkResponseAlternativeDecoder<ListGenerationContentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListGenerationContentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListGenerationContentResponse> = when {
      alternative.id == "listGenerationContent.response.alternative0" -> SdkResponseDecodeResult(
        value = ListGenerationContentResponse.SuccessJson(
          json = GenerationsCodecs.listGenerationContentResponseCodecAlternative0Registry.select(listOf("listGenerationContent.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGenerationContent.response.alternative1" -> SdkResponseDecodeResult(
        value = ListGenerationContentResponse.Http401Json(
          json = GenerationsCodecs.listGenerationContentResponseCodecAlternative1Registry.select(listOf("listGenerationContent.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGenerationContent.response.alternative2" -> SdkResponseDecodeResult(
        value = ListGenerationContentResponse.Http403Json(
          json = GenerationsCodecs.listGenerationContentResponseCodecAlternative2Registry.select(listOf("listGenerationContent.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGenerationContent.response.alternative3" -> SdkResponseDecodeResult(
        value = ListGenerationContentResponse.Http404Json(
          json = GenerationsCodecs.listGenerationContentResponseCodecAlternative3Registry.select(listOf("listGenerationContent.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGenerationContent.response.alternative4" -> SdkResponseDecodeResult(
        value = ListGenerationContentResponse.Http429Json(
          json = GenerationsCodecs.listGenerationContentResponseCodecAlternative4Registry.select(listOf("listGenerationContent.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGenerationContent.response.alternative5" -> SdkResponseDecodeResult(
        value = ListGenerationContentResponse.Http500Json(
          json = GenerationsCodecs.listGenerationContentResponseCodecAlternative5Registry.select(listOf("listGenerationContent.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGenerationContent.response.alternative6" -> SdkResponseDecodeResult(
        value = ListGenerationContentResponse.Http502Json(
          json = GenerationsCodecs.listGenerationContentResponseCodecAlternative6Registry.select(listOf("listGenerationContent.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGenerationContent.response.alternative7" -> SdkResponseDecodeResult(
        value = ListGenerationContentResponse.Http524Json(
          json = GenerationsCodecs.listGenerationContentResponseCodecAlternative7Registry.select(listOf("listGenerationContent.response.alternative7"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGenerationContent.response.alternative8" -> SdkResponseDecodeResult(
        value = ListGenerationContentResponse.Http529Json(
          json = GenerationsCodecs.listGenerationContentResponseCodecAlternative8Registry.select(listOf("listGenerationContent.response.alternative8"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ListGenerationContentResponse = ListGenerationContentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `submitGenerationFeedback` may expose through its typed API
   * exception.
   */
  public sealed interface SubmitGenerationFeedbackError

  /**
   * Typed response alternatives for `submitGenerationFeedback`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface SubmitGenerationFeedbackResponse {
    public class SuccessJson(
      public val json: io.github.nabobery.sdkgen.generated.SubmitGenerationFeedbackResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SubmitGenerationFeedbackResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SubmitGenerationFeedbackResponse,
        SubmitGenerationFeedbackError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SubmitGenerationFeedbackResponse,
        SubmitGenerationFeedbackError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SubmitGenerationFeedbackResponse,
        SubmitGenerationFeedbackError

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SubmitGenerationFeedbackResponse,
        SubmitGenerationFeedbackError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SubmitGenerationFeedbackResponse,
        SubmitGenerationFeedbackError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SubmitGenerationFeedbackResponse
  }

  /**
   * Raised by `submitGenerationFeedback` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class SubmitGenerationFeedbackApiException(
    public val error: SubmitGenerationFeedbackError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "submitGenerationFeedback")

  private object SubmitGenerationFeedbackResponseDecoder : SdkResponseAlternativeDecoder<SubmitGenerationFeedbackResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SubmitGenerationFeedbackResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SubmitGenerationFeedbackResponse> = when {
      alternative.id == "submitGenerationFeedback.response.alternative0" -> SdkResponseDecodeResult(
        value = SubmitGenerationFeedbackResponse.SuccessJson(
          json = GenerationsCodecs.submitGenerationFeedbackResponseCodecAlternative0Registry.select(listOf("submitGenerationFeedback.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "submitGenerationFeedback.response.alternative1" -> SdkResponseDecodeResult(
        value = SubmitGenerationFeedbackResponse.Http400Json(
          json = GenerationsCodecs.submitGenerationFeedbackResponseCodecAlternative1Registry.select(listOf("submitGenerationFeedback.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "submitGenerationFeedback.response.alternative2" -> SdkResponseDecodeResult(
        value = SubmitGenerationFeedbackResponse.Http401Json(
          json = GenerationsCodecs.submitGenerationFeedbackResponseCodecAlternative2Registry.select(listOf("submitGenerationFeedback.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "submitGenerationFeedback.response.alternative3" -> SdkResponseDecodeResult(
        value = SubmitGenerationFeedbackResponse.Http404Json(
          json = GenerationsCodecs.submitGenerationFeedbackResponseCodecAlternative3Registry.select(listOf("submitGenerationFeedback.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "submitGenerationFeedback.response.alternative4" -> SdkResponseDecodeResult(
        value = SubmitGenerationFeedbackResponse.Http429Json(
          json = GenerationsCodecs.submitGenerationFeedbackResponseCodecAlternative4Registry.select(listOf("submitGenerationFeedback.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "submitGenerationFeedback.response.alternative5" -> SdkResponseDecodeResult(
        value = SubmitGenerationFeedbackResponse.Http500Json(
          json = GenerationsCodecs.submitGenerationFeedbackResponseCodecAlternative5Registry.select(listOf("submitGenerationFeedback.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SubmitGenerationFeedbackResponse = SubmitGenerationFeedbackResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getGenerationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "getGeneration",
          method = "GET",
          path = "/generation",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GenerationResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getGeneration.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getGeneration.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 402),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentRequiredResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getGeneration.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getGeneration.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getGeneration.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getGeneration.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 502),
              mediaTypes = listOf("application/json"),
              typeTag = "BadGatewayResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getGeneration.response.alternative6",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 524),
              mediaTypes = listOf("application/json"),
              typeTag = "EdgeNetworkTimeoutResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getGeneration.response.alternative7",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 529),
              mediaTypes = listOf("application/json"),
              typeTag = "ProviderOverloadedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getGeneration.response.alternative8",
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

    internal val listGenerationContentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "listGenerationContent",
          method = "GET",
          path = "/generation/content",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GenerationContentResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGenerationContent.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGenerationContent.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGenerationContent.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGenerationContent.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGenerationContent.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGenerationContent.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 502),
              mediaTypes = listOf("application/json"),
              typeTag = "BadGatewayResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGenerationContent.response.alternative6",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 524),
              mediaTypes = listOf("application/json"),
              typeTag = "EdgeNetworkTimeoutResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGenerationContent.response.alternative7",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 529),
              mediaTypes = listOf("application/json"),
              typeTag = "ProviderOverloadedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGenerationContent.response.alternative8",
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

    internal val submitGenerationFeedbackMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "submitGenerationFeedback",
          method = "POST",
          path = "/generation/feedback",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SubmitGenerationFeedbackResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "submitGenerationFeedback.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "submitGenerationFeedback.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "submitGenerationFeedback.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "submitGenerationFeedback.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "submitGenerationFeedback.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "submitGenerationFeedback.response.alternative5",
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
  }
}
