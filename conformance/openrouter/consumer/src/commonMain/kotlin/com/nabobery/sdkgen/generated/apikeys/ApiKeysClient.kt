package com.nabobery.sdkgen.generated.apikeys

import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.ForbiddenResponse
import com.nabobery.sdkgen.generated.InlinePathsKeyGetResponses200ContentApplicationJsonSchema
import com.nabobery.sdkgen.generated.InlinePathsKeysGetResponses200ContentApplicationJsonSchema
import com.nabobery.sdkgen.generated.InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema
import com.nabobery.sdkgen.generated.InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema
import com.nabobery.sdkgen.generated.InlinePathsKeysHashPatchRequestBodyContentApplicationJsonSchema
import com.nabobery.sdkgen.generated.InlinePathsKeysHashPatchResponses200ContentApplicationJsonSchema
import com.nabobery.sdkgen.generated.InlinePathsKeysPostRequestBodyContentApplicationJsonSchema
import com.nabobery.sdkgen.generated.InlinePathsKeysPostResponses201ContentApplicationJsonSchema
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.NotFoundResponse
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public object ApiKeysCodecs {
  public const val CREATEKEYS_REQUEST_CODEC_ID: String = "createKeys.request"

  private val createKeysRequestCodec:
      MediaTypeCodec<InlinePathsKeysPostRequestBodyContentApplicationJsonSchema> =
      KotlinxSerializationCodec(CREATEKEYS_REQUEST_CODEC_ID, InlinePathsKeysPostRequestBodyContentApplicationJsonSchema
        .Serializer, SdkJson)

  public const val CREATEKEYS_RESPONSE_CODEC_ID: String = "createKeys.response"

  private val createKeysResponseCodec:
      MediaTypeCodec<InlinePathsKeysPostResponses201ContentApplicationJsonSchema> =
      KotlinxSerializationCodec(CREATEKEYS_RESPONSE_CODEC_ID,
        InlinePathsKeysPostResponses201ContentApplicationJsonSchema.Serializer, SdkJson)

  private val createKeysResponseCodecAlternative0Codec:
      MediaTypeCodec<InlinePathsKeysPostResponses201ContentApplicationJsonSchema> =
      KotlinxSerializationCodec("createKeys.response.alternative0",
        InlinePathsKeysPostResponses201ContentApplicationJsonSchema.Serializer, SdkJson)

  public val createKeysResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlinePathsKeysPostResponses201ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(createKeysResponseCodecAlternative0Codec)

  private val createKeysResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createKeys.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val createKeysResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BadRequestResponse>
      = MediaTypeCodecRegistry.of(createKeysResponseCodecAlternative1Codec)

  private val createKeysResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createKeys.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val createKeysResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createKeysResponseCodecAlternative2Codec)

  private val createKeysResponseCodecAlternative3Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("createKeys.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  public val createKeysResponseCodecAlternative3Registry: MediaTypeCodecRegistry<ForbiddenResponse>
      = MediaTypeCodecRegistry.of(createKeysResponseCodecAlternative3Codec)

  private val createKeysResponseCodecAlternative4Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("createKeys.response.alternative4", TooManyRequestsResponse.Serializer, SdkJson)

  public val createKeysResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(createKeysResponseCodecAlternative4Codec)

  private val createKeysResponseCodecAlternative5Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createKeys.response.alternative5", InternalServerResponse.Serializer, SdkJson)

  public val createKeysResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createKeysResponseCodecAlternative5Codec)

  public val createKeysRequestCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsKeysPostRequestBodyContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(createKeysRequestCodec)

  public val createKeysResponseCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsKeysPostResponses201ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(createKeysResponseCodec)

  public const val DELETEKEYS_RESPONSE_CODEC_ID: String = "deleteKeys.response"

  private val deleteKeysResponseCodec:
      MediaTypeCodec<InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec(DELETEKEYS_RESPONSE_CODEC_ID,
        InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  private val deleteKeysResponseCodecAlternative0Codec:
      MediaTypeCodec<InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec("deleteKeys.response.alternative0",
        InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  public val deleteKeysResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(deleteKeysResponseCodecAlternative0Codec)

  private val deleteKeysResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("deleteKeys.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  public val deleteKeysResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(deleteKeysResponseCodecAlternative1Codec)

  private val deleteKeysResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("deleteKeys.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  public val deleteKeysResponseCodecAlternative2Registry: MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(deleteKeysResponseCodecAlternative2Codec)

  private val deleteKeysResponseCodecAlternative3Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("deleteKeys.response.alternative3", TooManyRequestsResponse.Serializer, SdkJson)

  public val deleteKeysResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(deleteKeysResponseCodecAlternative3Codec)

  private val deleteKeysResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("deleteKeys.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  public val deleteKeysResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(deleteKeysResponseCodecAlternative4Codec)

  public val deleteKeysRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val deleteKeysResponseCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(deleteKeysResponseCodec)

  public const val GETCURRENTKEY_RESPONSE_CODEC_ID: String = "getCurrentKey.response"

  private val getCurrentKeyResponseCodec:
      MediaTypeCodec<InlinePathsKeyGetResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec(GETCURRENTKEY_RESPONSE_CODEC_ID,
        InlinePathsKeyGetResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  private val getCurrentKeyResponseCodecAlternative0Codec:
      MediaTypeCodec<InlinePathsKeyGetResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec("getCurrentKey.response.alternative0",
        InlinePathsKeyGetResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  public val getCurrentKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlinePathsKeyGetResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(getCurrentKeyResponseCodecAlternative0Codec)

  private val getCurrentKeyResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getCurrentKey.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  public val getCurrentKeyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getCurrentKeyResponseCodecAlternative1Codec)

  private val getCurrentKeyResponseCodecAlternative2Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getCurrentKey.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  public val getCurrentKeyResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getCurrentKeyResponseCodecAlternative2Codec)

  public val getCurrentKeyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val getCurrentKeyResponseCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsKeyGetResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(getCurrentKeyResponseCodec)

  public const val GETKEY_RESPONSE_CODEC_ID: String = "getKey.response"

  private val getKeyResponseCodec:
      MediaTypeCodec<InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec(GETKEY_RESPONSE_CODEC_ID,
        InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  private val getKeyResponseCodecAlternative0Codec:
      MediaTypeCodec<InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec("getKey.response.alternative0",
        InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  public val getKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(getKeyResponseCodecAlternative0Codec)

  private val getKeyResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getKey.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  public val getKeyResponseCodecAlternative1Registry: MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getKeyResponseCodecAlternative1Codec)

  private val getKeyResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getKey.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  public val getKeyResponseCodecAlternative2Registry: MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(getKeyResponseCodecAlternative2Codec)

  private val getKeyResponseCodecAlternative3Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("getKey.response.alternative3", TooManyRequestsResponse.Serializer, SdkJson)

  public val getKeyResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(getKeyResponseCodecAlternative3Codec)

  private val getKeyResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getKey.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  public val getKeyResponseCodecAlternative4Registry: MediaTypeCodecRegistry<InternalServerResponse>
      = MediaTypeCodecRegistry.of(getKeyResponseCodecAlternative4Codec)

  public val getKeyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val getKeyResponseCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(getKeyResponseCodec)

  public const val LIST_RESPONSE_CODEC_ID: String = "list.response"

  private val listResponseCodec:
      MediaTypeCodec<InlinePathsKeysGetResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec(LIST_RESPONSE_CODEC_ID, InlinePathsKeysGetResponses200ContentApplicationJsonSchema
        .Serializer, SdkJson)

  private val listResponseCodecAlternative0Codec:
      MediaTypeCodec<InlinePathsKeysGetResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec("list.response.alternative0",
        InlinePathsKeysGetResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  public val listResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlinePathsKeysGetResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(listResponseCodecAlternative0Codec)

  private val listResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("list.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  public val listResponseCodecAlternative1Registry: MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listResponseCodecAlternative1Codec)

  private val listResponseCodecAlternative2Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("list.response.alternative2", TooManyRequestsResponse.Serializer, SdkJson)

  public val listResponseCodecAlternative2Registry: MediaTypeCodecRegistry<TooManyRequestsResponse>
      = MediaTypeCodecRegistry.of(listResponseCodecAlternative2Codec)

  private val listResponseCodecAlternative3Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("list.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  public val listResponseCodecAlternative3Registry: MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listResponseCodecAlternative3Codec)

  public val listRequestCodecRegistry: MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val listResponseCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsKeysGetResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(listResponseCodec)

  public const val UPDATEKEYS_REQUEST_CODEC_ID: String = "updateKeys.request"

  private val updateKeysRequestCodec:
      MediaTypeCodec<InlinePathsKeysHashPatchRequestBodyContentApplicationJsonSchema> =
      KotlinxSerializationCodec(UPDATEKEYS_REQUEST_CODEC_ID,
        InlinePathsKeysHashPatchRequestBodyContentApplicationJsonSchema.Serializer, SdkJson)

  public const val UPDATEKEYS_RESPONSE_CODEC_ID: String = "updateKeys.response"

  private val updateKeysResponseCodec:
      MediaTypeCodec<InlinePathsKeysHashPatchResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec(UPDATEKEYS_RESPONSE_CODEC_ID,
        InlinePathsKeysHashPatchResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  private val updateKeysResponseCodecAlternative0Codec:
      MediaTypeCodec<InlinePathsKeysHashPatchResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec("updateKeys.response.alternative0",
        InlinePathsKeysHashPatchResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  public val updateKeysResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlinePathsKeysHashPatchResponses200ContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(updateKeysResponseCodecAlternative0Codec)

  private val updateKeysResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("updateKeys.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val updateKeysResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BadRequestResponse>
      = MediaTypeCodecRegistry.of(updateKeysResponseCodecAlternative1Codec)

  private val updateKeysResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("updateKeys.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val updateKeysResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(updateKeysResponseCodecAlternative2Codec)

  private val updateKeysResponseCodecAlternative3Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("updateKeys.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  public val updateKeysResponseCodecAlternative3Registry: MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(updateKeysResponseCodecAlternative3Codec)

  private val updateKeysResponseCodecAlternative4Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("updateKeys.response.alternative4", TooManyRequestsResponse.Serializer, SdkJson)

  public val updateKeysResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(updateKeysResponseCodecAlternative4Codec)

  private val updateKeysResponseCodecAlternative5Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("updateKeys.response.alternative5", InternalServerResponse.Serializer, SdkJson)

  public val updateKeysResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(updateKeysResponseCodecAlternative5Codec)

  public val updateKeysRequestCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsKeysHashPatchRequestBodyContentApplicationJsonSchema> =
      MediaTypeCodecRegistry.of(updateKeysRequestCodec)

  public val updateKeysResponseCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsKeysHashPatchResponses200ContentApplicationJsonSchema> =
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
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createKeys(
    request: InlinePathsKeysPostRequestBodyContentApplicationJsonSchema,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlinePathsKeysPostResponses201ContentApplicationJsonSchema = executor
    .execute<InlinePathsKeysPostRequestBodyContentApplicationJsonSchema,
      InlinePathsKeysPostResponses201ContentApplicationJsonSchema>(SdkExecutionRequest(createKeysMetadata, baseUri,
        request, listOf(ApiKeysCodecs.CREATEKEYS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ApiKeysCodecs.CREATEKEYS_RESPONSE_CODEC_ID), ApiKeysCodecs.createKeysRequestCodecRegistry, ApiKeysCodecs
    .createKeysResponseCodecRegistry, options)

  /**
   * Create a new API key for the authenticated user. The plaintext `key` is returned only in this response. Treat it as
   * a write-only, sensitive value; it cannot be retrieved later. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun createKeysWithResponse(
    request: InlinePathsKeysPostRequestBodyContentApplicationJsonSchema,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateKeysResponse> = executor
    .executeWithResponse<InlinePathsKeysPostRequestBodyContentApplicationJsonSchema,
      CreateKeysResponse>(SdkExecutionRequest(createKeysMetadata, baseUri, request, listOf(ApiKeysCodecs
        .CREATEKEYS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ApiKeysCodecs.createKeysRequestCodecRegistry, CreateKeysResponseDecoder, options)

  /**
   * Delete an existing API key. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun deleteKeys(
    hash: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema = executor.execute<Unit,
    InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema>(SdkExecutionRequest(deleteKeysMetadata, baseUri,
      Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "hash", values = listOf(hash.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ApiKeysCodecs.DELETEKEYS_RESPONSE_CODEC_ID), ApiKeysCodecs.deleteKeysRequestCodecRegistry, ApiKeysCodecs
    .deleteKeysResponseCodecRegistry, options)

  /**
   * Delete an existing API key. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun deleteKeysWithResponse(
    hash: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteKeysResponse> = executor.executeWithResponse<Unit,
    DeleteKeysResponse>(SdkExecutionRequest(deleteKeysMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "hash", values = listOf(hash.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ApiKeysCodecs.deleteKeysRequestCodecRegistry, DeleteKeysResponseDecoder, options)

  /**
   * Get information on the API key associated with the current authentication session
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getCurrentKey(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlinePathsKeyGetResponses200ContentApplicationJsonSchema = executor.execute<Unit,
    InlinePathsKeyGetResponses200ContentApplicationJsonSchema>(SdkExecutionRequest(getCurrentKeyMetadata, baseUri,
      Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ApiKeysCodecs.GETCURRENTKEY_RESPONSE_CODEC_ID), ApiKeysCodecs.getCurrentKeyRequestCodecRegistry,
    ApiKeysCodecs.getCurrentKeyResponseCodecRegistry, options)

  /**
   * Get information on the API key associated with the current authentication session
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun getCurrentKeyWithResponse(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCurrentKeyResponse> = executor.executeWithResponse<Unit,
    GetCurrentKeyResponse>(SdkExecutionRequest(getCurrentKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ApiKeysCodecs.getCurrentKeyRequestCodecRegistry, GetCurrentKeyResponseDecoder, options)

  /**
   * Get a single API key by hash. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getKey(
    hash: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema = executor.execute<Unit,
    InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema>(SdkExecutionRequest(getKeyMetadata, baseUri, Unit,
      emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "hash", values = listOf(hash.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ApiKeysCodecs.GETKEY_RESPONSE_CODEC_ID), ApiKeysCodecs.getKeyRequestCodecRegistry, ApiKeysCodecs
    .getKeyResponseCodecRegistry, options)

  /**
   * Get a single API key by hash. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun getKeyWithResponse(
    hash: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetKeyResponse> = executor.executeWithResponse<Unit,
    GetKeyResponse>(SdkExecutionRequest(getKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "hash", values = listOf(hash.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ApiKeysCodecs.getKeyRequestCodecRegistry, GetKeyResponseDecoder, options)

  /**
   * List all API keys for the authenticated user. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
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
  ): InlinePathsKeysGetResponses200ContentApplicationJsonSchema = executor.execute<Unit,
    InlinePathsKeysGetResponses200ContentApplicationJsonSchema>(SdkExecutionRequest(listMetadata, baseUri, Unit,
      emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "include_disabled", values =
      includeDisabled?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ApiKeysCodecs.LIST_RESPONSE_CODEC_ID), ApiKeysCodecs.listRequestCodecRegistry, ApiKeysCodecs
    .listResponseCodecRegistry, options)

  /**
   * List all API keys for the authenticated user. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listWithResponse(
    includeDisabled: Boolean? = null,
    offset: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListResponse> = executor.executeWithResponse<Unit,
    ListResponse>(SdkExecutionRequest(listMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "include_disabled", values =
      includeDisabled?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ApiKeysCodecs.listRequestCodecRegistry, ListResponseDecoder, options)

  /**
   * Update an existing API key. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun updateKeys(
    request: InlinePathsKeysHashPatchRequestBodyContentApplicationJsonSchema,
    hash: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlinePathsKeysHashPatchResponses200ContentApplicationJsonSchema = executor
    .execute<InlinePathsKeysHashPatchRequestBodyContentApplicationJsonSchema,
      InlinePathsKeysHashPatchResponses200ContentApplicationJsonSchema>(SdkExecutionRequest(updateKeysMetadata,
        baseUri, request, listOf(ApiKeysCodecs.UPDATEKEYS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "hash", values = listOf(hash.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ApiKeysCodecs.UPDATEKEYS_RESPONSE_CODEC_ID), ApiKeysCodecs.updateKeysRequestCodecRegistry, ApiKeysCodecs
    .updateKeysResponseCodecRegistry, options)

  /**
   * Update an existing API key. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun updateKeysWithResponse(
    request: InlinePathsKeysHashPatchRequestBodyContentApplicationJsonSchema,
    hash: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UpdateKeysResponse> = executor
    .executeWithResponse<InlinePathsKeysHashPatchRequestBodyContentApplicationJsonSchema,
      UpdateKeysResponse>(SdkExecutionRequest(updateKeysMetadata, baseUri, request, listOf(ApiKeysCodecs
        .UPDATEKEYS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "hash", values = listOf(hash.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ApiKeysCodecs.updateKeysRequestCodecRegistry, UpdateKeysResponseDecoder, options)

  /**
   * Typed response alternatives for `createKeys`. Non-success alternatives are not converted into success values.
   */
  public sealed interface CreateKeysResponse {
    public class SuccessJson(
      public val json: InlinePathsKeysPostResponses201ContentApplicationJsonSchema,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateKeysResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateKeysResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateKeysResponse

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateKeysResponse

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateKeysResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateKeysResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateKeysResponse
  }

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
          json = ApiKeysCodecs.createKeysResponseCodecAlternative0Registry
            .select(listOf("createKeys.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createKeys.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateKeysResponse.Http400Json(
          json = ApiKeysCodecs.createKeysResponseCodecAlternative1Registry
            .select(listOf("createKeys.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createKeys.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateKeysResponse.Http401Json(
          json = ApiKeysCodecs.createKeysResponseCodecAlternative2Registry
            .select(listOf("createKeys.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createKeys.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateKeysResponse.Http403Json(
          json = ApiKeysCodecs.createKeysResponseCodecAlternative3Registry
            .select(listOf("createKeys.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createKeys.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateKeysResponse.Http429Json(
          json = ApiKeysCodecs.createKeysResponseCodecAlternative4Registry
            .select(listOf("createKeys.response.alternative4"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createKeys.response.alternative5" -> SdkResponseDecodeResult(
        value = CreateKeysResponse.Http500Json(
          json = ApiKeysCodecs.createKeysResponseCodecAlternative5Registry
            .select(listOf("createKeys.response.alternative5"), mediaType ?: "application/json").decode(body,
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
    ): CreateKeysResponse = CreateKeysResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `deleteKeys`. Non-success alternatives are not converted into success values.
   */
  public sealed interface DeleteKeysResponse {
    public class SuccessJson(
      public val json: InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteKeysResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteKeysResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteKeysResponse

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteKeysResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteKeysResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteKeysResponse
  }

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
          json = ApiKeysCodecs.deleteKeysResponseCodecAlternative0Registry
            .select(listOf("deleteKeys.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteKeys.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteKeysResponse.Http401Json(
          json = ApiKeysCodecs.deleteKeysResponseCodecAlternative1Registry
            .select(listOf("deleteKeys.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteKeys.response.alternative2" -> SdkResponseDecodeResult(
        value = DeleteKeysResponse.Http404Json(
          json = ApiKeysCodecs.deleteKeysResponseCodecAlternative2Registry
            .select(listOf("deleteKeys.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteKeys.response.alternative3" -> SdkResponseDecodeResult(
        value = DeleteKeysResponse.Http429Json(
          json = ApiKeysCodecs.deleteKeysResponseCodecAlternative3Registry
            .select(listOf("deleteKeys.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteKeys.response.alternative4" -> SdkResponseDecodeResult(
        value = DeleteKeysResponse.Http500Json(
          json = ApiKeysCodecs.deleteKeysResponseCodecAlternative4Registry
            .select(listOf("deleteKeys.response.alternative4"), mediaType ?: "application/json").decode(body,
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
    ): DeleteKeysResponse = DeleteKeysResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `getCurrentKey`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetCurrentKeyResponse {
    public class SuccessJson(
      public val json: InlinePathsKeyGetResponses200ContentApplicationJsonSchema,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCurrentKeyResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCurrentKeyResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCurrentKeyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCurrentKeyResponse
  }

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
          json = ApiKeysCodecs.getCurrentKeyResponseCodecAlternative0Registry
            .select(listOf("getCurrentKey.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getCurrentKey.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCurrentKeyResponse.Http401Json(
          json = ApiKeysCodecs.getCurrentKeyResponseCodecAlternative1Registry
            .select(listOf("getCurrentKey.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getCurrentKey.response.alternative2" -> SdkResponseDecodeResult(
        value = GetCurrentKeyResponse.Http500Json(
          json = ApiKeysCodecs.getCurrentKeyResponseCodecAlternative2Registry
            .select(listOf("getCurrentKey.response.alternative2"), mediaType ?: "application/json").decode(body,
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
    ): GetCurrentKeyResponse = GetCurrentKeyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `getKey`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetKeyResponse {
    public class SuccessJson(
      public val json: InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetKeyResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetKeyResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetKeyResponse

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetKeyResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetKeyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetKeyResponse
  }

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
          json = ApiKeysCodecs.getKeyResponseCodecAlternative0Registry.select(listOf("getKey.response.alternative0"),
            mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getKey.response.alternative1" -> SdkResponseDecodeResult(
        value = GetKeyResponse.Http401Json(
          json = ApiKeysCodecs.getKeyResponseCodecAlternative1Registry.select(listOf("getKey.response.alternative1"),
            mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getKey.response.alternative2" -> SdkResponseDecodeResult(
        value = GetKeyResponse.Http404Json(
          json = ApiKeysCodecs.getKeyResponseCodecAlternative2Registry.select(listOf("getKey.response.alternative2"),
            mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getKey.response.alternative3" -> SdkResponseDecodeResult(
        value = GetKeyResponse.Http429Json(
          json = ApiKeysCodecs.getKeyResponseCodecAlternative3Registry.select(listOf("getKey.response.alternative3"),
            mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getKey.response.alternative4" -> SdkResponseDecodeResult(
        value = GetKeyResponse.Http500Json(
          json = ApiKeysCodecs.getKeyResponseCodecAlternative4Registry.select(listOf("getKey.response.alternative4"),
            mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
   * Typed response alternatives for `list`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ListResponse {
    public class SuccessJson(
      public val json: InlinePathsKeysGetResponses200ContentApplicationJsonSchema,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListResponse

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListResponse
  }

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
          json = ApiKeysCodecs.listResponseCodecAlternative0Registry.select(listOf("list.response.alternative0"),
            mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "list.response.alternative1" -> SdkResponseDecodeResult(
        value = ListResponse.Http401Json(
          json = ApiKeysCodecs.listResponseCodecAlternative1Registry.select(listOf("list.response.alternative1"),
            mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "list.response.alternative2" -> SdkResponseDecodeResult(
        value = ListResponse.Http429Json(
          json = ApiKeysCodecs.listResponseCodecAlternative2Registry.select(listOf("list.response.alternative2"),
            mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "list.response.alternative3" -> SdkResponseDecodeResult(
        value = ListResponse.Http500Json(
          json = ApiKeysCodecs.listResponseCodecAlternative3Registry.select(listOf("list.response.alternative3"),
            mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
   * Typed response alternatives for `updateKeys`. Non-success alternatives are not converted into success values.
   */
  public sealed interface UpdateKeysResponse {
    public class SuccessJson(
      public val json: InlinePathsKeysHashPatchResponses200ContentApplicationJsonSchema,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateKeysResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateKeysResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateKeysResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateKeysResponse

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateKeysResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateKeysResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateKeysResponse
  }

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
          json = ApiKeysCodecs.updateKeysResponseCodecAlternative0Registry
            .select(listOf("updateKeys.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateKeys.response.alternative1" -> SdkResponseDecodeResult(
        value = UpdateKeysResponse.Http400Json(
          json = ApiKeysCodecs.updateKeysResponseCodecAlternative1Registry
            .select(listOf("updateKeys.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateKeys.response.alternative2" -> SdkResponseDecodeResult(
        value = UpdateKeysResponse.Http401Json(
          json = ApiKeysCodecs.updateKeysResponseCodecAlternative2Registry
            .select(listOf("updateKeys.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateKeys.response.alternative3" -> SdkResponseDecodeResult(
        value = UpdateKeysResponse.Http404Json(
          json = ApiKeysCodecs.updateKeysResponseCodecAlternative3Registry
            .select(listOf("updateKeys.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateKeys.response.alternative4" -> SdkResponseDecodeResult(
        value = UpdateKeysResponse.Http429Json(
          json = ApiKeysCodecs.updateKeysResponseCodecAlternative4Registry
            .select(listOf("updateKeys.response.alternative4"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateKeys.response.alternative5" -> SdkResponseDecodeResult(
        value = UpdateKeysResponse.Http500Json(
          json = ApiKeysCodecs.updateKeysResponseCodecAlternative5Registry
            .select(listOf("updateKeys.response.alternative5"), mediaType ?: "application/json").decode(body,
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
    ): UpdateKeysResponse = UpdateKeysResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val createKeysMetadata: OperationMetadata = OperationMetadata(
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
              typeTag = "InlinePathsKeysPostResponses201ContentApplicationJsonSchema",
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
        )

    public val deleteKeysMetadata: OperationMetadata = OperationMetadata(
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
              typeTag = "InlinePathsKeysHashDeleteResponses200ContentApplicationJsonSchema",
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
        )

    public val getCurrentKeyMetadata: OperationMetadata = OperationMetadata(
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
              typeTag = "InlinePathsKeyGetResponses200ContentApplicationJsonSchema",
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
        )

    public val getKeyMetadata: OperationMetadata = OperationMetadata(
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
              typeTag = "InlinePathsKeysHashGetResponses200ContentApplicationJsonSchema",
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
        )

    public val listMetadata: OperationMetadata = OperationMetadata(
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
              typeTag = "InlinePathsKeysGetResponses200ContentApplicationJsonSchema",
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
        )

    public val updateKeysMetadata: OperationMetadata = OperationMetadata(
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
              typeTag = "InlinePathsKeysHashPatchResponses200ContentApplicationJsonSchema",
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
        )
  }
}
