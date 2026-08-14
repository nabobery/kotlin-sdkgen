package io.github.nabobery.sdkgen.generated.apikeys

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
import io.github.nabobery.sdkgen.generated.BadRequestResponse
import io.github.nabobery.sdkgen.generated.ForbiddenResponse
import io.github.nabobery.sdkgen.generated.InlineKeyGetResponse200JsonX463fbfab
import io.github.nabobery.sdkgen.generated.InlineKeysDeleteResponse200JsonXc3c3c322
import io.github.nabobery.sdkgen.generated.InlineKeysGetResponse200JsonX70b5db68
import io.github.nabobery.sdkgen.generated.InlineKeysGetResponse200JsonXfd25cd15
import io.github.nabobery.sdkgen.generated.InlineKeysPatchRequestJsonX0d3a5cc0
import io.github.nabobery.sdkgen.generated.InlineKeysPatchResponse200JsonX79fdf341
import io.github.nabobery.sdkgen.generated.InlineKeysPostRequestJsonXc017a059
import io.github.nabobery.sdkgen.generated.InlineKeysPostResponse201JsonXe8baed48
import io.github.nabobery.sdkgen.generated.InternalServerResponse
import io.github.nabobery.sdkgen.generated.NotFoundResponse
import io.github.nabobery.sdkgen.generated.SdkJson
import io.github.nabobery.sdkgen.generated.TooManyRequestsResponse
import io.github.nabobery.sdkgen.generated.UnauthorizedResponse
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

internal object ApiKeysCodecs {
  internal const val CREATEKEYS_REQUEST_CODEC_ID: String = "createKeys.request"

  private val createKeysRequestCodec: MediaTypeCodec<InlineKeysPostRequestJsonXc017a059> =
      KotlinxSerializationCodec(CREATEKEYS_REQUEST_CODEC_ID, InlineKeysPostRequestJsonXc017a059.Serializer, SdkJson)

  internal const val CREATEKEYS_RESPONSE_CODEC_ID: String = "createKeys.response"

  private val createKeysResponseCodec: MediaTypeCodec<InlineKeysPostResponse201JsonXe8baed48> =
      KotlinxSerializationCodec(CREATEKEYS_RESPONSE_CODEC_ID, InlineKeysPostResponse201JsonXe8baed48.Serializer, SdkJson)

  private val createKeysResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineKeysPostResponse201JsonXe8baed48> =
      KotlinxSerializationCodec("createKeys.response.alternative0", InlineKeysPostResponse201JsonXe8baed48.Serializer, SdkJson)

  internal val createKeysResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineKeysPostResponse201JsonXe8baed48> =
      MediaTypeCodecRegistry.of(createKeysResponseCodecAlternative0Codec)

  private val createKeysResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createKeys.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val createKeysResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createKeysResponseCodecAlternative1Codec)

  private val createKeysResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createKeys.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val createKeysResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createKeysResponseCodecAlternative2Codec)

  private val createKeysResponseCodecAlternative3Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("createKeys.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  internal val createKeysResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createKeysResponseCodecAlternative3Codec)

  private val createKeysResponseCodecAlternative4Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("createKeys.response.alternative4", TooManyRequestsResponse.Serializer, SdkJson)

  internal val createKeysResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(createKeysResponseCodecAlternative4Codec)

  private val createKeysResponseCodecAlternative5Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createKeys.response.alternative5", InternalServerResponse.Serializer, SdkJson)

  internal val createKeysResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createKeysResponseCodecAlternative5Codec)

  internal val createKeysRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineKeysPostRequestJsonXc017a059> =
      MediaTypeCodecRegistry.of(createKeysRequestCodec)

  internal val createKeysResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineKeysPostResponse201JsonXe8baed48> =
      MediaTypeCodecRegistry.of(createKeysResponseCodec)

  internal const val DELETEKEYS_RESPONSE_CODEC_ID: String = "deleteKeys.response"

  private val deleteKeysResponseCodec: MediaTypeCodec<InlineKeysDeleteResponse200JsonXc3c3c322> =
      KotlinxSerializationCodec(DELETEKEYS_RESPONSE_CODEC_ID, InlineKeysDeleteResponse200JsonXc3c3c322.Serializer, SdkJson)

  private val deleteKeysResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineKeysDeleteResponse200JsonXc3c3c322> =
      KotlinxSerializationCodec("deleteKeys.response.alternative0", InlineKeysDeleteResponse200JsonXc3c3c322.Serializer, SdkJson)

  internal val deleteKeysResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineKeysDeleteResponse200JsonXc3c3c322> =
      MediaTypeCodecRegistry.of(deleteKeysResponseCodecAlternative0Codec)

  private val deleteKeysResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("deleteKeys.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val deleteKeysResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(deleteKeysResponseCodecAlternative1Codec)

  private val deleteKeysResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("deleteKeys.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  internal val deleteKeysResponseCodecAlternative2Registry: MediaTypeCodecRegistry<NotFoundResponse>
      = MediaTypeCodecRegistry.of(deleteKeysResponseCodecAlternative2Codec)

  private val deleteKeysResponseCodecAlternative3Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("deleteKeys.response.alternative3", TooManyRequestsResponse.Serializer, SdkJson)

  internal val deleteKeysResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(deleteKeysResponseCodecAlternative3Codec)

  private val deleteKeysResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("deleteKeys.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  internal val deleteKeysResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(deleteKeysResponseCodecAlternative4Codec)

  internal val deleteKeysRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val deleteKeysResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineKeysDeleteResponse200JsonXc3c3c322> =
      MediaTypeCodecRegistry.of(deleteKeysResponseCodec)

  internal const val GETCURRENTKEY_RESPONSE_CODEC_ID: String = "getCurrentKey.response"

  private val getCurrentKeyResponseCodec: MediaTypeCodec<InlineKeyGetResponse200JsonX463fbfab> =
      KotlinxSerializationCodec(GETCURRENTKEY_RESPONSE_CODEC_ID, InlineKeyGetResponse200JsonX463fbfab.Serializer, SdkJson)

  private val getCurrentKeyResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineKeyGetResponse200JsonX463fbfab> =
      KotlinxSerializationCodec("getCurrentKey.response.alternative0", InlineKeyGetResponse200JsonX463fbfab.Serializer, SdkJson)

  internal val getCurrentKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineKeyGetResponse200JsonX463fbfab> =
      MediaTypeCodecRegistry.of(getCurrentKeyResponseCodecAlternative0Codec)

  private val getCurrentKeyResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getCurrentKey.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val getCurrentKeyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getCurrentKeyResponseCodecAlternative1Codec)

  private val getCurrentKeyResponseCodecAlternative2Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getCurrentKey.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  internal val getCurrentKeyResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getCurrentKeyResponseCodecAlternative2Codec)

  internal val getCurrentKeyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val getCurrentKeyResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineKeyGetResponse200JsonX463fbfab> =
      MediaTypeCodecRegistry.of(getCurrentKeyResponseCodec)

  internal const val GETKEY_RESPONSE_CODEC_ID: String = "getKey.response"

  private val getKeyResponseCodec: MediaTypeCodec<InlineKeysGetResponse200JsonXfd25cd15> =
      KotlinxSerializationCodec(GETKEY_RESPONSE_CODEC_ID, InlineKeysGetResponse200JsonXfd25cd15.Serializer, SdkJson)

  private val getKeyResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineKeysGetResponse200JsonXfd25cd15> =
      KotlinxSerializationCodec("getKey.response.alternative0", InlineKeysGetResponse200JsonXfd25cd15.Serializer, SdkJson)

  internal val getKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineKeysGetResponse200JsonXfd25cd15> =
      MediaTypeCodecRegistry.of(getKeyResponseCodecAlternative0Codec)

  private val getKeyResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getKey.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val getKeyResponseCodecAlternative1Registry: MediaTypeCodecRegistry<UnauthorizedResponse>
      = MediaTypeCodecRegistry.of(getKeyResponseCodecAlternative1Codec)

  private val getKeyResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getKey.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  internal val getKeyResponseCodecAlternative2Registry: MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(getKeyResponseCodecAlternative2Codec)

  private val getKeyResponseCodecAlternative3Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("getKey.response.alternative3", TooManyRequestsResponse.Serializer, SdkJson)

  internal val getKeyResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(getKeyResponseCodecAlternative3Codec)

  private val getKeyResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getKey.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  internal val getKeyResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getKeyResponseCodecAlternative4Codec)

  internal val getKeyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val getKeyResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineKeysGetResponse200JsonXfd25cd15> =
      MediaTypeCodecRegistry.of(getKeyResponseCodec)

  internal const val LIST_RESPONSE_CODEC_ID: String = "list.response"

  private val listResponseCodec: MediaTypeCodec<InlineKeysGetResponse200JsonX70b5db68> =
      KotlinxSerializationCodec(LIST_RESPONSE_CODEC_ID, InlineKeysGetResponse200JsonX70b5db68.Serializer, SdkJson)

  private val listResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineKeysGetResponse200JsonX70b5db68> =
      KotlinxSerializationCodec("list.response.alternative0", InlineKeysGetResponse200JsonX70b5db68.Serializer, SdkJson)

  internal val listResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineKeysGetResponse200JsonX70b5db68> =
      MediaTypeCodecRegistry.of(listResponseCodecAlternative0Codec)

  private val listResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("list.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val listResponseCodecAlternative1Registry: MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listResponseCodecAlternative1Codec)

  private val listResponseCodecAlternative2Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("list.response.alternative2", TooManyRequestsResponse.Serializer, SdkJson)

  internal val listResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(listResponseCodecAlternative2Codec)

  private val listResponseCodecAlternative3Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("list.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  internal val listResponseCodecAlternative3Registry: MediaTypeCodecRegistry<InternalServerResponse>
      = MediaTypeCodecRegistry.of(listResponseCodecAlternative3Codec)

  internal val listRequestCodecRegistry: MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val listResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineKeysGetResponse200JsonX70b5db68> =
      MediaTypeCodecRegistry.of(listResponseCodec)

  internal const val UPDATEKEYS_REQUEST_CODEC_ID: String = "updateKeys.request"

  private val updateKeysRequestCodec: MediaTypeCodec<InlineKeysPatchRequestJsonX0d3a5cc0> =
      KotlinxSerializationCodec(UPDATEKEYS_REQUEST_CODEC_ID, InlineKeysPatchRequestJsonX0d3a5cc0.Serializer, SdkJson)

  internal const val UPDATEKEYS_RESPONSE_CODEC_ID: String = "updateKeys.response"

  private val updateKeysResponseCodec: MediaTypeCodec<InlineKeysPatchResponse200JsonX79fdf341> =
      KotlinxSerializationCodec(UPDATEKEYS_RESPONSE_CODEC_ID, InlineKeysPatchResponse200JsonX79fdf341.Serializer, SdkJson)

  private val updateKeysResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineKeysPatchResponse200JsonX79fdf341> =
      KotlinxSerializationCodec("updateKeys.response.alternative0", InlineKeysPatchResponse200JsonX79fdf341.Serializer, SdkJson)

  internal val updateKeysResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineKeysPatchResponse200JsonX79fdf341> =
      MediaTypeCodecRegistry.of(updateKeysResponseCodecAlternative0Codec)

  private val updateKeysResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("updateKeys.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val updateKeysResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(updateKeysResponseCodecAlternative1Codec)

  private val updateKeysResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("updateKeys.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val updateKeysResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(updateKeysResponseCodecAlternative2Codec)

  private val updateKeysResponseCodecAlternative3Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("updateKeys.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  internal val updateKeysResponseCodecAlternative3Registry: MediaTypeCodecRegistry<NotFoundResponse>
      = MediaTypeCodecRegistry.of(updateKeysResponseCodecAlternative3Codec)

  private val updateKeysResponseCodecAlternative4Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("updateKeys.response.alternative4", TooManyRequestsResponse.Serializer, SdkJson)

  internal val updateKeysResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(updateKeysResponseCodecAlternative4Codec)

  private val updateKeysResponseCodecAlternative5Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("updateKeys.response.alternative5", InternalServerResponse.Serializer, SdkJson)

  internal val updateKeysResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(updateKeysResponseCodecAlternative5Codec)

  internal val updateKeysRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineKeysPatchRequestJsonX0d3a5cc0> =
      MediaTypeCodecRegistry.of(updateKeysRequestCodec)

  internal val updateKeysResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineKeysPatchResponse200JsonX79fdf341> =
      MediaTypeCodecRegistry.of(updateKeysResponseCodec)
}

/**
 * Client for the 'API Keys' group of OpenRouter API.
 */
public class ApiKeysClient(
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
      SdkExecutor(transport, authentication = this@ApiKeysClient.authentication)

  /**
   * Create a new API key for the authenticated user. The plaintext `key` is returned only in this response. Treat it as
   * a write-only, sensitive value; it cannot be retrieved later. [Management
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
   * @throws CreateKeysApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded CreateKeysError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createKeys(
    request: InlineKeysPostRequestJsonXc017a059,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlineKeysPostResponse201JsonXe8baed48 = executor.executeWithTypedErrors<InlineKeysPostRequestJsonXc017a059, CreateKeysResponse, InlineKeysPostResponse201JsonXe8baed48>(
    request = SdkExecutionRequest(createKeysMetadata, baseUri, request, listOf(ApiKeysCodecs.CREATEKEYS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ApiKeysCodecs.createKeysRequestCodecRegistry,
    responseDecoder = CreateKeysResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CreateKeysResponse.SuccessJson -> response.json
        is CreateKeysResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateKeysResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateKeysResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateKeysResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateKeysResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateKeysResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CreateKeysResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CreateKeysResponse.Http400Json -> CreateKeysApiException(response, statusCode, headers)
        is CreateKeysResponse.Http401Json -> CreateKeysApiException(response, statusCode, headers)
        is CreateKeysResponse.Http403Json -> CreateKeysApiException(response, statusCode, headers)
        is CreateKeysResponse.Http429Json -> CreateKeysApiException(response, statusCode, headers)
        is CreateKeysResponse.Http500Json -> CreateKeysApiException(response, statusCode, headers)
        is CreateKeysResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Create a new API key for the authenticated user. The plaintext `key` is returned only in this response. Treat it as
   * a write-only, sensitive value; it cannot be retrieved later. [Management
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
  public suspend fun createKeysWithResponse(
    request: InlineKeysPostRequestJsonXc017a059,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateKeysResponse> = executor.executeWithResponse<InlineKeysPostRequestJsonXc017a059, CreateKeysResponse>(SdkExecutionRequest(createKeysMetadata, baseUri, request, listOf(ApiKeysCodecs.CREATEKEYS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ApiKeysCodecs.createKeysRequestCodecRegistry, CreateKeysResponseDecoder, options)

  /**
   * Delete an existing API key. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param hash The hash identifier of the API key to delete
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
   * @throws DeleteKeysApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded DeleteKeysError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun deleteKeys(
    hash: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlineKeysDeleteResponse200JsonXc3c3c322 = executor.executeWithTypedErrors<Unit, DeleteKeysResponse, InlineKeysDeleteResponse200JsonXc3c3c322>(
    request = SdkExecutionRequest(deleteKeysMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "hash", values = listOf(hash.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ApiKeysCodecs.deleteKeysRequestCodecRegistry,
    responseDecoder = DeleteKeysResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DeleteKeysResponse.SuccessJson -> response.json
        is DeleteKeysResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteKeysResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteKeysResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteKeysResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteKeysResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DeleteKeysResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is DeleteKeysResponse.Http401Json -> DeleteKeysApiException(response, statusCode, headers)
        is DeleteKeysResponse.Http404Json -> DeleteKeysApiException(response, statusCode, headers)
        is DeleteKeysResponse.Http429Json -> DeleteKeysApiException(response, statusCode, headers)
        is DeleteKeysResponse.Http500Json -> DeleteKeysApiException(response, statusCode, headers)
        is DeleteKeysResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Delete an existing API key. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param hash The hash identifier of the API key to delete
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
  public suspend fun deleteKeysWithResponse(
    hash: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteKeysResponse> = executor.executeWithResponse<Unit, DeleteKeysResponse>(SdkExecutionRequest(deleteKeysMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "hash", values = listOf(hash.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ApiKeysCodecs.deleteKeysRequestCodecRegistry, DeleteKeysResponseDecoder, options)

  /**
   * Get information on the API key associated with the current authentication session
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
   * @throws GetCurrentKeyApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GetCurrentKeyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getCurrentKey(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlineKeyGetResponse200JsonX463fbfab = executor.executeWithTypedErrors<Unit, GetCurrentKeyResponse, InlineKeyGetResponse200JsonX463fbfab>(
    request = SdkExecutionRequest(getCurrentKeyMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ApiKeysCodecs.getCurrentKeyRequestCodecRegistry,
    responseDecoder = GetCurrentKeyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GetCurrentKeyResponse.SuccessJson -> response.json
        is GetCurrentKeyResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is GetCurrentKeyResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is GetCurrentKeyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GetCurrentKeyResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GetCurrentKeyResponse.Http401Json -> GetCurrentKeyApiException(response, statusCode, headers)
        is GetCurrentKeyResponse.Http500Json -> GetCurrentKeyApiException(response, statusCode, headers)
        is GetCurrentKeyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Get information on the API key associated with the current authentication session
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
  public suspend fun getCurrentKeyWithResponse(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCurrentKeyResponse> = executor.executeWithResponse<Unit, GetCurrentKeyResponse>(SdkExecutionRequest(getCurrentKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ApiKeysCodecs.getCurrentKeyRequestCodecRegistry, GetCurrentKeyResponseDecoder, options)

  /**
   * Get a single API key by hash. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param hash The hash identifier of the API key to retrieve
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
   * @throws GetKeyApiException When the service returns a declared non-success response; its `error` property exposes
   * the decoded GetKeyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getKey(
    hash: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlineKeysGetResponse200JsonXfd25cd15 = executor.executeWithTypedErrors<Unit, GetKeyResponse, InlineKeysGetResponse200JsonXfd25cd15>(
    request = SdkExecutionRequest(getKeyMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "hash", values = listOf(hash.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ApiKeysCodecs.getKeyRequestCodecRegistry,
    responseDecoder = GetKeyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GetKeyResponse.SuccessJson -> response.json
        is GetKeyResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is GetKeyResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GetKeyResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is GetKeyResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is GetKeyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GetKeyResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GetKeyResponse.Http401Json -> GetKeyApiException(response, statusCode, headers)
        is GetKeyResponse.Http404Json -> GetKeyApiException(response, statusCode, headers)
        is GetKeyResponse.Http429Json -> GetKeyApiException(response, statusCode, headers)
        is GetKeyResponse.Http500Json -> GetKeyApiException(response, statusCode, headers)
        is GetKeyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Get a single API key by hash. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param hash The hash identifier of the API key to retrieve
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
  public suspend fun getKeyWithResponse(
    hash: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetKeyResponse> = executor.executeWithResponse<Unit, GetKeyResponse>(SdkExecutionRequest(getKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "hash", values = listOf(hash.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ApiKeysCodecs.getKeyRequestCodecRegistry, GetKeyResponseDecoder, options)

  /**
   * List all API keys for the authenticated user. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * @param includeDisabled Whether to include disabled API keys in the response
   * @param offset Number of API keys to skip for pagination
   * @param workspaceId Filter API keys by workspace ID. By default, keys in the default workspace are returned.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
   * @throws ListApiException When the service returns a declared non-success response; its `error` property exposes the
   * decoded ListError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun list(
    includeDisabled: Boolean? = null,
    offset: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlineKeysGetResponse200JsonX70b5db68 = executor.executeWithTypedErrors<Unit, ListResponse, InlineKeysGetResponse200JsonX70b5db68>(
    request = SdkExecutionRequest(listMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "include_disabled", values = includeDisabled?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ApiKeysCodecs.listRequestCodecRegistry,
    responseDecoder = ListResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ListResponse.SuccessJson -> response.json
        is ListResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ListResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is ListResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is ListResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ListResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ListResponse.Http401Json -> ListApiException(response, statusCode, headers)
        is ListResponse.Http429Json -> ListApiException(response, statusCode, headers)
        is ListResponse.Http500Json -> ListApiException(response, statusCode, headers)
        is ListResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List all API keys for the authenticated user. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param includeDisabled Whether to include disabled API keys in the response
   * @param offset Number of API keys to skip for pagination
   * @param workspaceId Filter API keys by workspace ID. By default, keys in the default workspace are returned.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
  public suspend fun listWithResponse(
    includeDisabled: Boolean? = null,
    offset: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListResponse> = executor.executeWithResponse<Unit, ListResponse>(SdkExecutionRequest(listMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "include_disabled", values = includeDisabled?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ApiKeysCodecs.listRequestCodecRegistry, ListResponseDecoder, options)

  /**
   * Update an existing API key. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param hash The hash identifier of the API key to update
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
   * @throws UpdateKeysApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded UpdateKeysError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun updateKeys(
    request: InlineKeysPatchRequestJsonX0d3a5cc0,
    hash: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlineKeysPatchResponse200JsonX79fdf341 = executor.executeWithTypedErrors<InlineKeysPatchRequestJsonX0d3a5cc0, UpdateKeysResponse, InlineKeysPatchResponse200JsonX79fdf341>(
    request = SdkExecutionRequest(updateKeysMetadata, baseUri, request, listOf(ApiKeysCodecs.UPDATEKEYS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "hash", values = listOf(hash.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ApiKeysCodecs.updateKeysRequestCodecRegistry,
    responseDecoder = UpdateKeysResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UpdateKeysResponse.SuccessJson -> response.json
        is UpdateKeysResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateKeysResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateKeysResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateKeysResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateKeysResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateKeysResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UpdateKeysResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UpdateKeysResponse.Http400Json -> UpdateKeysApiException(response, statusCode, headers)
        is UpdateKeysResponse.Http401Json -> UpdateKeysApiException(response, statusCode, headers)
        is UpdateKeysResponse.Http404Json -> UpdateKeysApiException(response, statusCode, headers)
        is UpdateKeysResponse.Http429Json -> UpdateKeysApiException(response, statusCode, headers)
        is UpdateKeysResponse.Http500Json -> UpdateKeysApiException(response, statusCode, headers)
        is UpdateKeysResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Update an existing API key. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param hash The hash identifier of the API key to update
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
  public suspend fun updateKeysWithResponse(
    request: InlineKeysPatchRequestJsonX0d3a5cc0,
    hash: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UpdateKeysResponse> = executor.executeWithResponse<InlineKeysPatchRequestJsonX0d3a5cc0, UpdateKeysResponse>(SdkExecutionRequest(updateKeysMetadata, baseUri, request, listOf(ApiKeysCodecs.UPDATEKEYS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "hash", values = listOf(hash.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ApiKeysCodecs.updateKeysRequestCodecRegistry, UpdateKeysResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `createKeys` may expose through its typed API exception.
   */
  public sealed interface CreateKeysError

  /**
   * Typed response alternatives for `createKeys`. Non-success alternatives are not converted into success values.
   */
  public sealed interface CreateKeysResponse {
    public class SuccessJson(
      public val json: InlineKeysPostResponse201JsonXe8baed48,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateKeysResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateKeysResponse,
        CreateKeysError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateKeysResponse,
        CreateKeysError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateKeysResponse,
        CreateKeysError

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateKeysResponse,
        CreateKeysError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateKeysResponse,
        CreateKeysError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateKeysResponse
  }

  /**
   * Raised by `createKeys` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class CreateKeysApiException(
    public val error: CreateKeysError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "createKeys")

  private object CreateKeysResponseDecoder : SdkResponseAlternativeDecoder<CreateKeysResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CreateKeysResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CreateKeysResponse> = when {
      alternative.id == "createKeys.response.alternative0" -> SdkResponseDecodeResult(
        value = CreateKeysResponse.SuccessJson(
          json = ApiKeysCodecs.createKeysResponseCodecAlternative0Registry.select(listOf("createKeys.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createKeys.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateKeysResponse.Http400Json(
          json = ApiKeysCodecs.createKeysResponseCodecAlternative1Registry.select(listOf("createKeys.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createKeys.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateKeysResponse.Http401Json(
          json = ApiKeysCodecs.createKeysResponseCodecAlternative2Registry.select(listOf("createKeys.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createKeys.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateKeysResponse.Http403Json(
          json = ApiKeysCodecs.createKeysResponseCodecAlternative3Registry.select(listOf("createKeys.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createKeys.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateKeysResponse.Http429Json(
          json = ApiKeysCodecs.createKeysResponseCodecAlternative4Registry.select(listOf("createKeys.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createKeys.response.alternative5" -> SdkResponseDecodeResult(
        value = CreateKeysResponse.Http500Json(
          json = ApiKeysCodecs.createKeysResponseCodecAlternative5Registry.select(listOf("createKeys.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CreateKeysResponse = CreateKeysResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `deleteKeys` may expose through its typed API exception.
   */
  public sealed interface DeleteKeysError

  /**
   * Typed response alternatives for `deleteKeys`. Non-success alternatives are not converted into success values.
   */
  public sealed interface DeleteKeysResponse {
    public class SuccessJson(
      public val json: InlineKeysDeleteResponse200JsonXc3c3c322,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteKeysResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteKeysResponse,
        DeleteKeysError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteKeysResponse,
        DeleteKeysError

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteKeysResponse,
        DeleteKeysError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteKeysResponse,
        DeleteKeysError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteKeysResponse
  }

  /**
   * Raised by `deleteKeys` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class DeleteKeysApiException(
    public val error: DeleteKeysError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "deleteKeys")

  private object DeleteKeysResponseDecoder : SdkResponseAlternativeDecoder<DeleteKeysResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteKeysResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteKeysResponse> = when {
      alternative.id == "deleteKeys.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteKeysResponse.SuccessJson(
          json = ApiKeysCodecs.deleteKeysResponseCodecAlternative0Registry.select(listOf("deleteKeys.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteKeys.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteKeysResponse.Http401Json(
          json = ApiKeysCodecs.deleteKeysResponseCodecAlternative1Registry.select(listOf("deleteKeys.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteKeys.response.alternative2" -> SdkResponseDecodeResult(
        value = DeleteKeysResponse.Http404Json(
          json = ApiKeysCodecs.deleteKeysResponseCodecAlternative2Registry.select(listOf("deleteKeys.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteKeys.response.alternative3" -> SdkResponseDecodeResult(
        value = DeleteKeysResponse.Http429Json(
          json = ApiKeysCodecs.deleteKeysResponseCodecAlternative3Registry.select(listOf("deleteKeys.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteKeys.response.alternative4" -> SdkResponseDecodeResult(
        value = DeleteKeysResponse.Http500Json(
          json = ApiKeysCodecs.deleteKeysResponseCodecAlternative4Registry.select(listOf("deleteKeys.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteKeysResponse = DeleteKeysResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `getCurrentKey` may expose through its typed API exception.
   */
  public sealed interface GetCurrentKeyError

  /**
   * Typed response alternatives for `getCurrentKey`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetCurrentKeyResponse {
    public class SuccessJson(
      public val json: InlineKeyGetResponse200JsonX463fbfab,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCurrentKeyResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCurrentKeyResponse,
        GetCurrentKeyError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCurrentKeyResponse,
        GetCurrentKeyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCurrentKeyResponse
  }

  /**
   * Raised by `getCurrentKey` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class GetCurrentKeyApiException(
    public val error: GetCurrentKeyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "getCurrentKey")

  private object GetCurrentKeyResponseDecoder : SdkResponseAlternativeDecoder<GetCurrentKeyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCurrentKeyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCurrentKeyResponse> = when {
      alternative.id == "getCurrentKey.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCurrentKeyResponse.SuccessJson(
          json = ApiKeysCodecs.getCurrentKeyResponseCodecAlternative0Registry.select(listOf("getCurrentKey.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getCurrentKey.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCurrentKeyResponse.Http401Json(
          json = ApiKeysCodecs.getCurrentKeyResponseCodecAlternative1Registry.select(listOf("getCurrentKey.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getCurrentKey.response.alternative2" -> SdkResponseDecodeResult(
        value = GetCurrentKeyResponse.Http500Json(
          json = ApiKeysCodecs.getCurrentKeyResponseCodecAlternative2Registry.select(listOf("getCurrentKey.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCurrentKeyResponse = GetCurrentKeyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `getKey` may expose through its typed API exception.
   */
  public sealed interface GetKeyError

  /**
   * Typed response alternatives for `getKey`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetKeyResponse {
    public class SuccessJson(
      public val json: InlineKeysGetResponse200JsonXfd25cd15,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetKeyResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetKeyResponse,
        GetKeyError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetKeyResponse,
        GetKeyError

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetKeyResponse,
        GetKeyError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetKeyResponse,
        GetKeyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetKeyResponse
  }

  /**
   * Raised by `getKey` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class GetKeyApiException(
    public val error: GetKeyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "getKey")

  private object GetKeyResponseDecoder : SdkResponseAlternativeDecoder<GetKeyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetKeyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetKeyResponse> = when {
      alternative.id == "getKey.response.alternative0" -> SdkResponseDecodeResult(
        value = GetKeyResponse.SuccessJson(
          json = ApiKeysCodecs.getKeyResponseCodecAlternative0Registry.select(listOf("getKey.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getKey.response.alternative1" -> SdkResponseDecodeResult(
        value = GetKeyResponse.Http401Json(
          json = ApiKeysCodecs.getKeyResponseCodecAlternative1Registry.select(listOf("getKey.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getKey.response.alternative2" -> SdkResponseDecodeResult(
        value = GetKeyResponse.Http404Json(
          json = ApiKeysCodecs.getKeyResponseCodecAlternative2Registry.select(listOf("getKey.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getKey.response.alternative3" -> SdkResponseDecodeResult(
        value = GetKeyResponse.Http429Json(
          json = ApiKeysCodecs.getKeyResponseCodecAlternative3Registry.select(listOf("getKey.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getKey.response.alternative4" -> SdkResponseDecodeResult(
        value = GetKeyResponse.Http500Json(
          json = ApiKeysCodecs.getKeyResponseCodecAlternative4Registry.select(listOf("getKey.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetKeyResponse = GetKeyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `list` may expose through its typed API exception.
   */
  public sealed interface ListError

  /**
   * Typed response alternatives for `list`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ListResponse {
    public class SuccessJson(
      public val json: InlineKeysGetResponse200JsonX70b5db68,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListResponse,
        ListError

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListResponse,
        ListError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListResponse,
        ListError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListResponse
  }

  /**
   * Raised by `list` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class ListApiException(
    public val error: ListError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "list")

  private object ListResponseDecoder : SdkResponseAlternativeDecoder<ListResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListResponse> = when {
      alternative.id == "list.response.alternative0" -> SdkResponseDecodeResult(
        value = ListResponse.SuccessJson(
          json = ApiKeysCodecs.listResponseCodecAlternative0Registry.select(listOf("list.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "list.response.alternative1" -> SdkResponseDecodeResult(
        value = ListResponse.Http401Json(
          json = ApiKeysCodecs.listResponseCodecAlternative1Registry.select(listOf("list.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "list.response.alternative2" -> SdkResponseDecodeResult(
        value = ListResponse.Http429Json(
          json = ApiKeysCodecs.listResponseCodecAlternative2Registry.select(listOf("list.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "list.response.alternative3" -> SdkResponseDecodeResult(
        value = ListResponse.Http500Json(
          json = ApiKeysCodecs.listResponseCodecAlternative3Registry.select(listOf("list.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ListResponse = ListResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `updateKeys` may expose through its typed API exception.
   */
  public sealed interface UpdateKeysError

  /**
   * Typed response alternatives for `updateKeys`. Non-success alternatives are not converted into success values.
   */
  public sealed interface UpdateKeysResponse {
    public class SuccessJson(
      public val json: InlineKeysPatchResponse200JsonX79fdf341,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateKeysResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateKeysResponse,
        UpdateKeysError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateKeysResponse,
        UpdateKeysError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateKeysResponse,
        UpdateKeysError

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateKeysResponse,
        UpdateKeysError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateKeysResponse,
        UpdateKeysError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateKeysResponse
  }

  /**
   * Raised by `updateKeys` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class UpdateKeysApiException(
    public val error: UpdateKeysError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "updateKeys")

  private object UpdateKeysResponseDecoder : SdkResponseAlternativeDecoder<UpdateKeysResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UpdateKeysResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UpdateKeysResponse> = when {
      alternative.id == "updateKeys.response.alternative0" -> SdkResponseDecodeResult(
        value = UpdateKeysResponse.SuccessJson(
          json = ApiKeysCodecs.updateKeysResponseCodecAlternative0Registry.select(listOf("updateKeys.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateKeys.response.alternative1" -> SdkResponseDecodeResult(
        value = UpdateKeysResponse.Http400Json(
          json = ApiKeysCodecs.updateKeysResponseCodecAlternative1Registry.select(listOf("updateKeys.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateKeys.response.alternative2" -> SdkResponseDecodeResult(
        value = UpdateKeysResponse.Http401Json(
          json = ApiKeysCodecs.updateKeysResponseCodecAlternative2Registry.select(listOf("updateKeys.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateKeys.response.alternative3" -> SdkResponseDecodeResult(
        value = UpdateKeysResponse.Http404Json(
          json = ApiKeysCodecs.updateKeysResponseCodecAlternative3Registry.select(listOf("updateKeys.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateKeys.response.alternative4" -> SdkResponseDecodeResult(
        value = UpdateKeysResponse.Http429Json(
          json = ApiKeysCodecs.updateKeysResponseCodecAlternative4Registry.select(listOf("updateKeys.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateKeys.response.alternative5" -> SdkResponseDecodeResult(
        value = UpdateKeysResponse.Http500Json(
          json = ApiKeysCodecs.updateKeysResponseCodecAlternative5Registry.select(listOf("updateKeys.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UpdateKeysResponse = UpdateKeysResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val createKeysMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "createKeys",
          method = "POST",
          path = "/keys",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineKeysPostResponse201JsonXe8baed48",
              mode = SdkResponseMode.BUFFERED,
              id = "createKeys.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createKeys.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createKeys.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createKeys.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createKeys.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createKeys.response.alternative5",
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

    internal val deleteKeysMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "deleteKeys",
          method = "DELETE",
          path = "/keys/{hash}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineKeysDeleteResponse200JsonXc3c3c322",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteKeys.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteKeys.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteKeys.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteKeys.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteKeys.response.alternative4",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "apiKey", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = false, idempotent = true),
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

    internal val getCurrentKeyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "getCurrentKey",
          method = "GET",
          path = "/key",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineKeyGetResponse200JsonX463fbfab",
              mode = SdkResponseMode.BUFFERED,
              id = "getCurrentKey.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getCurrentKey.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getCurrentKey.response.alternative2",
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

    internal val getKeyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "getKey",
          method = "GET",
          path = "/keys/{hash}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineKeysGetResponse200JsonXfd25cd15",
              mode = SdkResponseMode.BUFFERED,
              id = "getKey.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getKey.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getKey.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getKey.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getKey.response.alternative4",
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

    internal val listMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "list",
          method = "GET",
          path = "/keys",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineKeysGetResponse200JsonX70b5db68",
              mode = SdkResponseMode.BUFFERED,
              id = "list.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "list.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "list.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "list.response.alternative3",
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

    internal val updateKeysMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "updateKeys",
          method = "PATCH",
          path = "/keys/{hash}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineKeysPatchResponse200JsonX79fdf341",
              mode = SdkResponseMode.BUFFERED,
              id = "updateKeys.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateKeys.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateKeys.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateKeys.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateKeys.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateKeys.response.alternative5",
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
