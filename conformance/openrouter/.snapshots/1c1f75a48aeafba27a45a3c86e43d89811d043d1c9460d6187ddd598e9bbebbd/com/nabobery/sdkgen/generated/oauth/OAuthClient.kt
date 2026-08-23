package com.nabobery.sdkgen.generated.oauth

import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.ConflictResponse
import com.nabobery.sdkgen.generated.ForbiddenResponse
import com.nabobery.sdkgen.generated.InlineAuthKeysCodePostRequestJsonXc0977d70
import com.nabobery.sdkgen.generated.InlineAuthKeysCodePostResponse200JsonX46e90520
import com.nabobery.sdkgen.generated.InlineAuthKeysPostRequestJsonX55ee707e
import com.nabobery.sdkgen.generated.InlineAuthKeysPostResponse200JsonX2c58353e
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
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

internal object OAuthCodecs {
  internal const val CREATEAUTHKEYSCODE_REQUEST_CODEC_ID: String = "createAuthKeysCode.request"

  private val createAuthKeysCodeRequestCodec:
      MediaTypeCodec<InlineAuthKeysCodePostRequestJsonXc0977d70> =
      KotlinxSerializationCodec(CREATEAUTHKEYSCODE_REQUEST_CODEC_ID, InlineAuthKeysCodePostRequestJsonXc0977d70.Serializer, SdkJson)

  internal const val CREATEAUTHKEYSCODE_RESPONSE_CODEC_ID: String = "createAuthKeysCode.response"

  private val createAuthKeysCodeResponseCodec:
      MediaTypeCodec<InlineAuthKeysCodePostResponse200JsonX46e90520> =
      KotlinxSerializationCodec(CREATEAUTHKEYSCODE_RESPONSE_CODEC_ID, InlineAuthKeysCodePostResponse200JsonX46e90520.Serializer, SdkJson)

  private val createAuthKeysCodeResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineAuthKeysCodePostResponse200JsonX46e90520> =
      KotlinxSerializationCodec("createAuthKeysCode.response.alternative0", InlineAuthKeysCodePostResponse200JsonX46e90520.Serializer, SdkJson)

  internal val createAuthKeysCodeResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineAuthKeysCodePostResponse200JsonX46e90520> =
      MediaTypeCodecRegistry.of(createAuthKeysCodeResponseCodecAlternative0Codec)

  private val createAuthKeysCodeResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createAuthKeysCode.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val createAuthKeysCodeResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createAuthKeysCodeResponseCodecAlternative1Codec)

  private val createAuthKeysCodeResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse>
      =
      KotlinxSerializationCodec("createAuthKeysCode.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val createAuthKeysCodeResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createAuthKeysCodeResponseCodecAlternative2Codec)

  private val createAuthKeysCodeResponseCodecAlternative3Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("createAuthKeysCode.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  internal val createAuthKeysCodeResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createAuthKeysCodeResponseCodecAlternative3Codec)

  private val createAuthKeysCodeResponseCodecAlternative4Codec: MediaTypeCodec<ConflictResponse> =
      KotlinxSerializationCodec("createAuthKeysCode.response.alternative4", ConflictResponse.Serializer, SdkJson)

  internal val createAuthKeysCodeResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ConflictResponse> =
      MediaTypeCodecRegistry.of(createAuthKeysCodeResponseCodecAlternative4Codec)

  private val createAuthKeysCodeResponseCodecAlternative5Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createAuthKeysCode.response.alternative5", InternalServerResponse.Serializer, SdkJson)

  internal val createAuthKeysCodeResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createAuthKeysCodeResponseCodecAlternative5Codec)

  internal val createAuthKeysCodeRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineAuthKeysCodePostRequestJsonXc0977d70> =
      MediaTypeCodecRegistry.of(createAuthKeysCodeRequestCodec)

  internal val createAuthKeysCodeResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineAuthKeysCodePostResponse200JsonX46e90520> =
      MediaTypeCodecRegistry.of(createAuthKeysCodeResponseCodec)

  internal const val EXCHANGEAUTHCODEFORAPIKEY_REQUEST_CODEC_ID: String =
      "exchangeAuthCodeForAPIKey.request"

  private val exchangeAuthCodeForApiKeyRequestCodec:
      MediaTypeCodec<InlineAuthKeysPostRequestJsonX55ee707e> =
      KotlinxSerializationCodec(EXCHANGEAUTHCODEFORAPIKEY_REQUEST_CODEC_ID, InlineAuthKeysPostRequestJsonX55ee707e.Serializer, SdkJson)

  internal const val EXCHANGEAUTHCODEFORAPIKEY_RESPONSE_CODEC_ID: String =
      "exchangeAuthCodeForAPIKey.response"

  private val exchangeAuthCodeForApiKeyResponseCodec:
      MediaTypeCodec<InlineAuthKeysPostResponse200JsonX2c58353e> =
      KotlinxSerializationCodec(EXCHANGEAUTHCODEFORAPIKEY_RESPONSE_CODEC_ID, InlineAuthKeysPostResponse200JsonX2c58353e.Serializer, SdkJson)

  private val exchangeAuthCodeForApiKeyResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineAuthKeysPostResponse200JsonX2c58353e> =
      KotlinxSerializationCodec("exchangeAuthCodeForAPIKey.response.alternative0", InlineAuthKeysPostResponse200JsonX2c58353e.Serializer, SdkJson)

  internal val exchangeAuthCodeForApiKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineAuthKeysPostResponse200JsonX2c58353e> =
      MediaTypeCodecRegistry.of(exchangeAuthCodeForApiKeyResponseCodecAlternative0Codec)

  private val exchangeAuthCodeForApiKeyResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("exchangeAuthCodeForAPIKey.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val exchangeAuthCodeForApiKeyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(exchangeAuthCodeForApiKeyResponseCodecAlternative1Codec)

  private val exchangeAuthCodeForApiKeyResponseCodecAlternative2Codec:
      MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("exchangeAuthCodeForAPIKey.response.alternative2", ForbiddenResponse.Serializer, SdkJson)

  internal val exchangeAuthCodeForApiKeyResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(exchangeAuthCodeForApiKeyResponseCodecAlternative2Codec)

  private val exchangeAuthCodeForApiKeyResponseCodecAlternative3Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("exchangeAuthCodeForAPIKey.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  internal val exchangeAuthCodeForApiKeyResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(exchangeAuthCodeForApiKeyResponseCodecAlternative3Codec)

  internal val exchangeAuthCodeForApiKeyRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineAuthKeysPostRequestJsonX55ee707e> =
      MediaTypeCodecRegistry.of(exchangeAuthCodeForApiKeyRequestCodec)

  internal val exchangeAuthCodeForApiKeyResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineAuthKeysPostResponse200JsonX2c58353e> =
      MediaTypeCodecRegistry.of(exchangeAuthCodeForApiKeyResponseCodec)
}

/**
 * Client for the 'OAuth' group of OpenRouter API.
 */
public class OAuthClient(
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
      SdkExecutor(transport, authentication = this@OAuthClient.authentication)

  /**
   * Create an authorization code for the PKCE flow to generate a user-controlled API key
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
   * @throws CreateAuthKeysCodeApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CreateAuthKeysCodeError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createAuthKeysCode(
    request: InlineAuthKeysCodePostRequestJsonXc0977d70,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlineAuthKeysCodePostResponse200JsonX46e90520 = executor.executeWithTypedErrors<InlineAuthKeysCodePostRequestJsonXc0977d70, CreateAuthKeysCodeResponse, InlineAuthKeysCodePostResponse200JsonX46e90520>(
    request = SdkExecutionRequest(createAuthKeysCodeMetadata, baseUri, request, listOf(OAuthCodecs.CREATEAUTHKEYSCODE_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = OAuthCodecs.createAuthKeysCodeRequestCodecRegistry,
    responseDecoder = CreateAuthKeysCodeResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CreateAuthKeysCodeResponse.SuccessJson -> response.json
        is CreateAuthKeysCodeResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAuthKeysCodeResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAuthKeysCodeResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAuthKeysCodeResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAuthKeysCodeResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAuthKeysCodeResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CreateAuthKeysCodeResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CreateAuthKeysCodeResponse.Http400Json -> CreateAuthKeysCodeApiException(response, statusCode, headers)
        is CreateAuthKeysCodeResponse.Http401Json -> CreateAuthKeysCodeApiException(response, statusCode, headers)
        is CreateAuthKeysCodeResponse.Http403Json -> CreateAuthKeysCodeApiException(response, statusCode, headers)
        is CreateAuthKeysCodeResponse.Http409Json -> CreateAuthKeysCodeApiException(response, statusCode, headers)
        is CreateAuthKeysCodeResponse.Http500Json -> CreateAuthKeysCodeApiException(response, statusCode, headers)
        is CreateAuthKeysCodeResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Create an authorization code for the PKCE flow to generate a user-controlled API key
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
  public suspend fun createAuthKeysCodeWithResponse(
    request: InlineAuthKeysCodePostRequestJsonXc0977d70,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateAuthKeysCodeResponse> = executor.executeWithResponse<InlineAuthKeysCodePostRequestJsonXc0977d70, CreateAuthKeysCodeResponse>(SdkExecutionRequest(createAuthKeysCodeMetadata, baseUri, request, listOf(OAuthCodecs.CREATEAUTHKEYSCODE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), OAuthCodecs.createAuthKeysCodeRequestCodecRegistry, CreateAuthKeysCodeResponseDecoder, options)

  /**
   * Exchange an authorization code from the PKCE flow for a user-controlled API key
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
   * @throws ExchangeAuthCodeForApiKeyApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ExchangeAuthCodeForApiKeyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun exchangeAuthCodeForApiKey(
    request: InlineAuthKeysPostRequestJsonX55ee707e,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlineAuthKeysPostResponse200JsonX2c58353e = executor.executeWithTypedErrors<InlineAuthKeysPostRequestJsonX55ee707e, ExchangeAuthCodeForApiKeyResponse, InlineAuthKeysPostResponse200JsonX2c58353e>(
    request = SdkExecutionRequest(exchangeAuthCodeForApiKeyMetadata, baseUri, request, listOf(OAuthCodecs.EXCHANGEAUTHCODEFORAPIKEY_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = OAuthCodecs.exchangeAuthCodeForApiKeyRequestCodecRegistry,
    responseDecoder = ExchangeAuthCodeForApiKeyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ExchangeAuthCodeForApiKeyResponse.SuccessJson -> response.json
        is ExchangeAuthCodeForApiKeyResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is ExchangeAuthCodeForApiKeyResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ExchangeAuthCodeForApiKeyResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is ExchangeAuthCodeForApiKeyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ExchangeAuthCodeForApiKeyResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ExchangeAuthCodeForApiKeyResponse.Http400Json -> ExchangeAuthCodeForApiKeyApiException(response, statusCode, headers)
        is ExchangeAuthCodeForApiKeyResponse.Http403Json -> ExchangeAuthCodeForApiKeyApiException(response, statusCode, headers)
        is ExchangeAuthCodeForApiKeyResponse.Http500Json -> ExchangeAuthCodeForApiKeyApiException(response, statusCode, headers)
        is ExchangeAuthCodeForApiKeyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Exchange an authorization code from the PKCE flow for a user-controlled API key
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
  public suspend fun exchangeAuthCodeForApiKeyWithResponse(
    request: InlineAuthKeysPostRequestJsonX55ee707e,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ExchangeAuthCodeForApiKeyResponse> = executor.executeWithResponse<InlineAuthKeysPostRequestJsonX55ee707e, ExchangeAuthCodeForApiKeyResponse>(SdkExecutionRequest(exchangeAuthCodeForApiKeyMetadata, baseUri, request, listOf(OAuthCodecs.EXCHANGEAUTHCODEFORAPIKEY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), OAuthCodecs.exchangeAuthCodeForApiKeyRequestCodecRegistry, ExchangeAuthCodeForApiKeyResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `createAuthKeysCode` may expose through its typed API exception.
   */
  public sealed interface CreateAuthKeysCodeError

  /**
   * Typed response alternatives for `createAuthKeysCode`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface CreateAuthKeysCodeResponse {
    public class SuccessJson(
      public val json: InlineAuthKeysCodePostResponse200JsonX46e90520,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAuthKeysCodeResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAuthKeysCodeResponse,
        CreateAuthKeysCodeError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAuthKeysCodeResponse,
        CreateAuthKeysCodeError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAuthKeysCodeResponse,
        CreateAuthKeysCodeError

    public class Http409Json(
      public val json: ConflictResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAuthKeysCodeResponse,
        CreateAuthKeysCodeError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAuthKeysCodeResponse,
        CreateAuthKeysCodeError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAuthKeysCodeResponse
  }

  /**
   * Raised by `createAuthKeysCode` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class CreateAuthKeysCodeApiException(
    public val error: CreateAuthKeysCodeError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "createAuthKeysCode")

  private object CreateAuthKeysCodeResponseDecoder : SdkResponseAlternativeDecoder<CreateAuthKeysCodeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CreateAuthKeysCodeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CreateAuthKeysCodeResponse> = when {
      alternative.id == "createAuthKeysCode.response.alternative0" -> SdkResponseDecodeResult(
        value = CreateAuthKeysCodeResponse.SuccessJson(
          json = OAuthCodecs.createAuthKeysCodeResponseCodecAlternative0Registry.select(listOf("createAuthKeysCode.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAuthKeysCode.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateAuthKeysCodeResponse.Http400Json(
          json = OAuthCodecs.createAuthKeysCodeResponseCodecAlternative1Registry.select(listOf("createAuthKeysCode.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAuthKeysCode.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateAuthKeysCodeResponse.Http401Json(
          json = OAuthCodecs.createAuthKeysCodeResponseCodecAlternative2Registry.select(listOf("createAuthKeysCode.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAuthKeysCode.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateAuthKeysCodeResponse.Http403Json(
          json = OAuthCodecs.createAuthKeysCodeResponseCodecAlternative3Registry.select(listOf("createAuthKeysCode.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAuthKeysCode.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateAuthKeysCodeResponse.Http409Json(
          json = OAuthCodecs.createAuthKeysCodeResponseCodecAlternative4Registry.select(listOf("createAuthKeysCode.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAuthKeysCode.response.alternative5" -> SdkResponseDecodeResult(
        value = CreateAuthKeysCodeResponse.Http500Json(
          json = OAuthCodecs.createAuthKeysCodeResponseCodecAlternative5Registry.select(listOf("createAuthKeysCode.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CreateAuthKeysCodeResponse = CreateAuthKeysCodeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `exchangeAuthCodeForAPIKey` may expose through its typed API
   * exception.
   */
  public sealed interface ExchangeAuthCodeForApiKeyError

  /**
   * Typed response alternatives for `exchangeAuthCodeForAPIKey`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ExchangeAuthCodeForApiKeyResponse {
    public class SuccessJson(
      public val json: InlineAuthKeysPostResponse200JsonX2c58353e,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ExchangeAuthCodeForApiKeyResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ExchangeAuthCodeForApiKeyResponse,
        ExchangeAuthCodeForApiKeyError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ExchangeAuthCodeForApiKeyResponse,
        ExchangeAuthCodeForApiKeyError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ExchangeAuthCodeForApiKeyResponse,
        ExchangeAuthCodeForApiKeyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ExchangeAuthCodeForApiKeyResponse
  }

  /**
   * Raised by `exchangeAuthCodeForAPIKey` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ExchangeAuthCodeForApiKeyApiException(
    public val error: ExchangeAuthCodeForApiKeyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "exchangeAuthCodeForAPIKey")

  private object ExchangeAuthCodeForApiKeyResponseDecoder : SdkResponseAlternativeDecoder<ExchangeAuthCodeForApiKeyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ExchangeAuthCodeForApiKeyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ExchangeAuthCodeForApiKeyResponse> = when {
      alternative.id == "exchangeAuthCodeForAPIKey.response.alternative0" -> SdkResponseDecodeResult(
        value = ExchangeAuthCodeForApiKeyResponse.SuccessJson(
          json = OAuthCodecs.exchangeAuthCodeForApiKeyResponseCodecAlternative0Registry.select(listOf("exchangeAuthCodeForAPIKey.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "exchangeAuthCodeForAPIKey.response.alternative1" -> SdkResponseDecodeResult(
        value = ExchangeAuthCodeForApiKeyResponse.Http400Json(
          json = OAuthCodecs.exchangeAuthCodeForApiKeyResponseCodecAlternative1Registry.select(listOf("exchangeAuthCodeForAPIKey.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "exchangeAuthCodeForAPIKey.response.alternative2" -> SdkResponseDecodeResult(
        value = ExchangeAuthCodeForApiKeyResponse.Http403Json(
          json = OAuthCodecs.exchangeAuthCodeForApiKeyResponseCodecAlternative2Registry.select(listOf("exchangeAuthCodeForAPIKey.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "exchangeAuthCodeForAPIKey.response.alternative3" -> SdkResponseDecodeResult(
        value = ExchangeAuthCodeForApiKeyResponse.Http500Json(
          json = OAuthCodecs.exchangeAuthCodeForApiKeyResponseCodecAlternative3Registry.select(listOf("exchangeAuthCodeForAPIKey.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ExchangeAuthCodeForApiKeyResponse = ExchangeAuthCodeForApiKeyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val createAuthKeysCodeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "createAuthKeysCode",
          method = "POST",
          path = "/auth/keys/code",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAuthKeysCodePostResponse200JsonX46e90520",
              mode = SdkResponseMode.BUFFERED,
              id = "createAuthKeysCode.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAuthKeysCode.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAuthKeysCode.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAuthKeysCode.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "ConflictResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAuthKeysCode.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAuthKeysCode.response.alternative5",
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

    internal val exchangeAuthCodeForApiKeyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "exchangeAuthCodeForAPIKey",
          method = "POST",
          path = "/auth/keys",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAuthKeysPostResponse200JsonX2c58353e",
              mode = SdkResponseMode.BUFFERED,
              id = "exchangeAuthCodeForAPIKey.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "exchangeAuthCodeForAPIKey.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "exchangeAuthCodeForAPIKey.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "exchangeAuthCodeForAPIKey.response.alternative3",
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
