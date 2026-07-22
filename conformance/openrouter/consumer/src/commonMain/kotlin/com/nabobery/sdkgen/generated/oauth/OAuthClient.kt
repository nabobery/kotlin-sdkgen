package com.nabobery.sdkgen.generated.oauth

import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.ConflictResponse
import com.nabobery.sdkgen.generated.ForbiddenResponse
import com.nabobery.sdkgen.generated.InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema
import com.nabobery.sdkgen.generated.InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema
import com.nabobery.sdkgen.generated.InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema
import com.nabobery.sdkgen.generated.InlinePathsAuthKeysPostResponses200ContentApplicationJsonSchema
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
import kotlin.collections.List
import kotlin.collections.Map

public object OAuthCodecs {
  public const val CREATEAUTHKEYSCODE_REQUEST_CODEC_ID: String = "createAuthKeysCode.request"

  private val createAuthKeysCodeRequestCodec:
      MediaTypeCodec<InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema> =
      KotlinxSerializationCodec(CREATEAUTHKEYSCODE_REQUEST_CODEC_ID,
        InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema.Serializer, SdkJson)

  public const val CREATEAUTHKEYSCODE_RESPONSE_CODEC_ID: String = "createAuthKeysCode.response"

  private val createAuthKeysCodeResponseCodec:
      MediaTypeCodec<InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec(CREATEAUTHKEYSCODE_RESPONSE_CODEC_ID,
        InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  private val createAuthKeysCodeResponseCodecAlternative0Codec:
      MediaTypeCodec<InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec("createAuthKeysCode.response.alternative0",
        InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  public val createAuthKeysCodeResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(createAuthKeysCodeResponseCodecAlternative0Codec)

  private val createAuthKeysCodeResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createAuthKeysCode.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val createAuthKeysCodeResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createAuthKeysCodeResponseCodecAlternative1Codec)

  private val createAuthKeysCodeResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse>
      =
      KotlinxSerializationCodec("createAuthKeysCode.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val createAuthKeysCodeResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createAuthKeysCodeResponseCodecAlternative2Codec)

  private val createAuthKeysCodeResponseCodecAlternative3Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("createAuthKeysCode.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  public val createAuthKeysCodeResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createAuthKeysCodeResponseCodecAlternative3Codec)

  private val createAuthKeysCodeResponseCodecAlternative4Codec: MediaTypeCodec<ConflictResponse> =
      KotlinxSerializationCodec("createAuthKeysCode.response.alternative4", ConflictResponse.Serializer, SdkJson)

  public val createAuthKeysCodeResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ConflictResponse> =
      MediaTypeCodecRegistry.of(createAuthKeysCodeResponseCodecAlternative4Codec)

  private val createAuthKeysCodeResponseCodecAlternative5Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createAuthKeysCode.response.alternative5", InternalServerResponse.Serializer, SdkJson)

  public val createAuthKeysCodeResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createAuthKeysCodeResponseCodecAlternative5Codec)

  public val createAuthKeysCodeRequestCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(createAuthKeysCodeRequestCodec)

  public val createAuthKeysCodeResponseCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(createAuthKeysCodeResponseCodec)

  public const val EXCHANGEAUTHCODEFORAPIKEY_REQUEST_CODEC_ID: String =
      "exchangeAuthCodeForAPIKey.request"

  private val exchangeAuthCodeForApiKeyRequestCodec:
      MediaTypeCodec<InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema> =
      KotlinxSerializationCodec(EXCHANGEAUTHCODEFORAPIKEY_REQUEST_CODEC_ID,
        InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema.Serializer, SdkJson)

  public const val EXCHANGEAUTHCODEFORAPIKEY_RESPONSE_CODEC_ID: String =
      "exchangeAuthCodeForAPIKey.response"

  private val exchangeAuthCodeForApiKeyResponseCodec:
      MediaTypeCodec<InlinePathsAuthKeysPostResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec(EXCHANGEAUTHCODEFORAPIKEY_RESPONSE_CODEC_ID,
        InlinePathsAuthKeysPostResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  private val exchangeAuthCodeForApiKeyResponseCodecAlternative0Codec:
      MediaTypeCodec<InlinePathsAuthKeysPostResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec("exchangeAuthCodeForAPIKey.response.alternative0",
        InlinePathsAuthKeysPostResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  public val exchangeAuthCodeForApiKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlinePathsAuthKeysPostResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(exchangeAuthCodeForApiKeyResponseCodecAlternative0Codec)

  private val exchangeAuthCodeForApiKeyResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("exchangeAuthCodeForAPIKey.response.alternative1", BadRequestResponse.Serializer,
        SdkJson)

  public val exchangeAuthCodeForApiKeyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(exchangeAuthCodeForApiKeyResponseCodecAlternative1Codec)

  private val exchangeAuthCodeForApiKeyResponseCodecAlternative2Codec:
      MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("exchangeAuthCodeForAPIKey.response.alternative2", ForbiddenResponse.Serializer,
        SdkJson)

  public val exchangeAuthCodeForApiKeyResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(exchangeAuthCodeForApiKeyResponseCodecAlternative2Codec)

  private val exchangeAuthCodeForApiKeyResponseCodecAlternative3Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("exchangeAuthCodeForAPIKey.response.alternative3", InternalServerResponse.Serializer,
        SdkJson)

  public val exchangeAuthCodeForApiKeyResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(exchangeAuthCodeForApiKeyResponseCodecAlternative3Codec)

  public val exchangeAuthCodeForApiKeyRequestCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(exchangeAuthCodeForApiKeyRequestCodec)

  public val exchangeAuthCodeForApiKeyResponseCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsAuthKeysPostResponses200ContentApplicationJsonSchema> =
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
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createAuthKeysCode(
    request: InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema = executor
    .execute<InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema,
      InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema>(SdkExecutionRequest(createAuthKeysCodeMetadata, baseUri, request, listOf(OAuthCodecs.CREATEAUTHKEYSCODE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(OAuthCodecs.CREATEAUTHKEYSCODE_RESPONSE_CODEC_ID), OAuthCodecs.createAuthKeysCodeRequestCodecRegistry,
    OAuthCodecs.createAuthKeysCodeResponseCodecRegistry, options)

  /**
   * Create an authorization code for the PKCE flow to generate a user-controlled API key
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun createAuthKeysCodeWithResponse(
    request: InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateAuthKeysCodeResponse> = executor
    .executeWithResponse<InlinePathsAuthKeysCodePostRequestBodyContentApplicationJsonSchema,
      CreateAuthKeysCodeResponse>(SdkExecutionRequest(createAuthKeysCodeMetadata, baseUri, request, listOf(OAuthCodecs
        .CREATEAUTHKEYSCODE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), OAuthCodecs.createAuthKeysCodeRequestCodecRegistry, CreateAuthKeysCodeResponseDecoder, options)

  /**
   * Exchange an authorization code from the PKCE flow for a user-controlled API key
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun exchangeAuthCodeForApiKey(
    request: InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlinePathsAuthKeysPostResponses200ContentApplicationJsonSchema = executor
    .execute<InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema,
      InlinePathsAuthKeysPostResponses200ContentApplicationJsonSchema>(SdkExecutionRequest(exchangeAuthCodeForApiKeyMetadata, baseUri, request, listOf(OAuthCodecs.EXCHANGEAUTHCODEFORAPIKEY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(OAuthCodecs.EXCHANGEAUTHCODEFORAPIKEY_RESPONSE_CODEC_ID), OAuthCodecs
    .exchangeAuthCodeForApiKeyRequestCodecRegistry, OAuthCodecs.exchangeAuthCodeForApiKeyResponseCodecRegistry, options)

  /**
   * Exchange an authorization code from the PKCE flow for a user-controlled API key
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun exchangeAuthCodeForApiKeyWithResponse(
    request: InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ExchangeAuthCodeForApiKeyResponse> = executor
    .executeWithResponse<InlinePathsAuthKeysPostRequestBodyContentApplicationJsonSchema,
      ExchangeAuthCodeForApiKeyResponse>(SdkExecutionRequest(exchangeAuthCodeForApiKeyMetadata, baseUri, request,
        listOf(OAuthCodecs.EXCHANGEAUTHCODEFORAPIKEY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), OAuthCodecs.exchangeAuthCodeForApiKeyRequestCodecRegistry, ExchangeAuthCodeForApiKeyResponseDecoder, options)

  /**
   * Typed response alternatives for `createAuthKeysCode`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface CreateAuthKeysCodeResponse {
    public class SuccessJson(
      public val json: InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAuthKeysCodeResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAuthKeysCodeResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAuthKeysCodeResponse

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAuthKeysCodeResponse

    public class Http409Json(
      public val json: ConflictResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAuthKeysCodeResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAuthKeysCodeResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAuthKeysCodeResponse
  }

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
          json = OAuthCodecs.createAuthKeysCodeResponseCodecAlternative0Registry
            .select(listOf("createAuthKeysCode.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAuthKeysCode.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateAuthKeysCodeResponse.Http400Json(
          json = OAuthCodecs.createAuthKeysCodeResponseCodecAlternative1Registry
            .select(listOf("createAuthKeysCode.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAuthKeysCode.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateAuthKeysCodeResponse.Http401Json(
          json = OAuthCodecs.createAuthKeysCodeResponseCodecAlternative2Registry
            .select(listOf("createAuthKeysCode.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAuthKeysCode.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateAuthKeysCodeResponse.Http403Json(
          json = OAuthCodecs.createAuthKeysCodeResponseCodecAlternative3Registry
            .select(listOf("createAuthKeysCode.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAuthKeysCode.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateAuthKeysCodeResponse.Http409Json(
          json = OAuthCodecs.createAuthKeysCodeResponseCodecAlternative4Registry
            .select(listOf("createAuthKeysCode.response.alternative4"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAuthKeysCode.response.alternative5" -> SdkResponseDecodeResult(
        value = CreateAuthKeysCodeResponse.Http500Json(
          json = OAuthCodecs.createAuthKeysCodeResponseCodecAlternative5Registry
            .select(listOf("createAuthKeysCode.response.alternative5"), mediaType ?: "application/json").decode(body,
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
    ): CreateAuthKeysCodeResponse = CreateAuthKeysCodeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `exchangeAuthCodeForAPIKey`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ExchangeAuthCodeForApiKeyResponse {
    public class SuccessJson(
      public val json: InlinePathsAuthKeysPostResponses200ContentApplicationJsonSchema,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ExchangeAuthCodeForApiKeyResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ExchangeAuthCodeForApiKeyResponse

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ExchangeAuthCodeForApiKeyResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ExchangeAuthCodeForApiKeyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ExchangeAuthCodeForApiKeyResponse
  }

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
          json = OAuthCodecs.exchangeAuthCodeForApiKeyResponseCodecAlternative0Registry
            .select(listOf("exchangeAuthCodeForAPIKey.response.alternative0"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "exchangeAuthCodeForAPIKey.response.alternative1" -> SdkResponseDecodeResult(
        value = ExchangeAuthCodeForApiKeyResponse.Http400Json(
          json = OAuthCodecs.exchangeAuthCodeForApiKeyResponseCodecAlternative1Registry
            .select(listOf("exchangeAuthCodeForAPIKey.response.alternative1"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "exchangeAuthCodeForAPIKey.response.alternative2" -> SdkResponseDecodeResult(
        value = ExchangeAuthCodeForApiKeyResponse.Http403Json(
          json = OAuthCodecs.exchangeAuthCodeForApiKeyResponseCodecAlternative2Registry
            .select(listOf("exchangeAuthCodeForAPIKey.response.alternative2"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "exchangeAuthCodeForAPIKey.response.alternative3" -> SdkResponseDecodeResult(
        value = ExchangeAuthCodeForApiKeyResponse.Http500Json(
          json = OAuthCodecs.exchangeAuthCodeForApiKeyResponseCodecAlternative3Registry
            .select(listOf("exchangeAuthCodeForAPIKey.response.alternative3"), mediaType ?: "application/json")
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
    ): ExchangeAuthCodeForApiKeyResponse = ExchangeAuthCodeForApiKeyResponse.Unknown(statusCode = statusCode, headers =
      headers)
  }

  public companion object {
    public val createAuthKeysCodeMetadata: OperationMetadata = OperationMetadata(
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
              typeTag = "InlinePathsAuthKeysCodePostResponses200ContentApplicationJsonSchema",
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
        )

    public val exchangeAuthCodeForApiKeyMetadata: OperationMetadata = OperationMetadata(
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
              typeTag = "InlinePathsAuthKeysPostResponses200ContentApplicationJsonSchema",
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
        )
  }
}
