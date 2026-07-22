package com.nabobery.sdkgen.generated.byok

import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.CreateByokKeyRequest
import com.nabobery.sdkgen.generated.CreateByokKeyResponse
import com.nabobery.sdkgen.generated.DeleteByokKeyResponse
import com.nabobery.sdkgen.generated.ForbiddenResponse
import com.nabobery.sdkgen.generated.GetByokKeyResponse
import com.nabobery.sdkgen.generated.InlinePathsByokGetParameters3Schema
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.ListByokKeysResponse
import com.nabobery.sdkgen.generated.NotFoundResponse
import com.nabobery.sdkgen.generated.SdkJson
import com.nabobery.sdkgen.generated.UnauthorizedResponse
import com.nabobery.sdkgen.generated.UpdateByokKeyRequest
import com.nabobery.sdkgen.generated.UpdateByokKeyResponse
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

public object ByokCodecs {
  public const val CREATEBYOKKEY_REQUEST_CODEC_ID: String = "createBYOKKey.request"

  private val createByokKeyRequestCodec: MediaTypeCodec<CreateByokKeyRequest> =
      KotlinxSerializationCodec(CREATEBYOKKEY_REQUEST_CODEC_ID, CreateByokKeyRequest.Serializer, SdkJson)

  public const val CREATEBYOKKEY_RESPONSE_CODEC_ID: String = "createBYOKKey.response"

  private val createByokKeyResponseCodec: MediaTypeCodec<CreateByokKeyResponse> =
      KotlinxSerializationCodec(CREATEBYOKKEY_RESPONSE_CODEC_ID, CreateByokKeyResponse.Serializer, SdkJson)

  private val createByokKeyResponseCodecAlternative0Codec: MediaTypeCodec<CreateByokKeyResponse> =
      KotlinxSerializationCodec("createBYOKKey.response.alternative0", CreateByokKeyResponse.Serializer, SdkJson)

  public val createByokKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CreateByokKeyResponse> =
      MediaTypeCodecRegistry.of(createByokKeyResponseCodecAlternative0Codec)

  private val createByokKeyResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createBYOKKey.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val createByokKeyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createByokKeyResponseCodecAlternative1Codec)

  private val createByokKeyResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createBYOKKey.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val createByokKeyResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createByokKeyResponseCodecAlternative2Codec)

  private val createByokKeyResponseCodecAlternative3Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("createBYOKKey.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  public val createByokKeyResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createByokKeyResponseCodecAlternative3Codec)

  private val createByokKeyResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createBYOKKey.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  public val createByokKeyResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createByokKeyResponseCodecAlternative4Codec)

  public val createByokKeyRequestCodecRegistry: MediaTypeCodecRegistry<CreateByokKeyRequest> =
      MediaTypeCodecRegistry.of(createByokKeyRequestCodec)

  public val createByokKeyResponseCodecRegistry: MediaTypeCodecRegistry<CreateByokKeyResponse> =
      MediaTypeCodecRegistry.of(createByokKeyResponseCodec)

  public const val DELETEBYOKKEY_RESPONSE_CODEC_ID: String = "deleteBYOKKey.response"

  private val deleteByokKeyResponseCodec: MediaTypeCodec<DeleteByokKeyResponse> =
      KotlinxSerializationCodec(DELETEBYOKKEY_RESPONSE_CODEC_ID, DeleteByokKeyResponse.Serializer, SdkJson)

  private val deleteByokKeyResponseCodecAlternative0Codec: MediaTypeCodec<DeleteByokKeyResponse> =
      KotlinxSerializationCodec("deleteBYOKKey.response.alternative0", DeleteByokKeyResponse.Serializer, SdkJson)

  public val deleteByokKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeleteByokKeyResponse> =
      MediaTypeCodecRegistry.of(deleteByokKeyResponseCodecAlternative0Codec)

  private val deleteByokKeyResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("deleteBYOKKey.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  public val deleteByokKeyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(deleteByokKeyResponseCodecAlternative1Codec)

  private val deleteByokKeyResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("deleteBYOKKey.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  public val deleteByokKeyResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(deleteByokKeyResponseCodecAlternative2Codec)

  private val deleteByokKeyResponseCodecAlternative3Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("deleteBYOKKey.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  public val deleteByokKeyResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(deleteByokKeyResponseCodecAlternative3Codec)

  public val deleteByokKeyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val deleteByokKeyResponseCodecRegistry: MediaTypeCodecRegistry<DeleteByokKeyResponse> =
      MediaTypeCodecRegistry.of(deleteByokKeyResponseCodec)

  public const val GETBYOKKEY_RESPONSE_CODEC_ID: String = "getBYOKKey.response"

  private val getByokKeyResponseCodec: MediaTypeCodec<GetByokKeyResponse> =
      KotlinxSerializationCodec(GETBYOKKEY_RESPONSE_CODEC_ID, GetByokKeyResponse.Serializer, SdkJson)

  private val getByokKeyResponseCodecAlternative0Codec: MediaTypeCodec<GetByokKeyResponse> =
      KotlinxSerializationCodec("getBYOKKey.response.alternative0", GetByokKeyResponse.Serializer, SdkJson)

  public val getByokKeyResponseCodecAlternative0Registry: MediaTypeCodecRegistry<GetByokKeyResponse>
      = MediaTypeCodecRegistry.of(getByokKeyResponseCodecAlternative0Codec)

  private val getByokKeyResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getBYOKKey.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  public val getByokKeyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getByokKeyResponseCodecAlternative1Codec)

  private val getByokKeyResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getBYOKKey.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  public val getByokKeyResponseCodecAlternative2Registry: MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(getByokKeyResponseCodecAlternative2Codec)

  private val getByokKeyResponseCodecAlternative3Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getBYOKKey.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  public val getByokKeyResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getByokKeyResponseCodecAlternative3Codec)

  public val getByokKeyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val getByokKeyResponseCodecRegistry: MediaTypeCodecRegistry<GetByokKeyResponse> =
      MediaTypeCodecRegistry.of(getByokKeyResponseCodec)

  public const val LISTBYOKKEYS_RESPONSE_CODEC_ID: String = "listBYOKKeys.response"

  private val listByokKeysResponseCodec: MediaTypeCodec<ListByokKeysResponse> =
      KotlinxSerializationCodec(LISTBYOKKEYS_RESPONSE_CODEC_ID, ListByokKeysResponse.Serializer, SdkJson)

  private val listByokKeysResponseCodecAlternative0Codec: MediaTypeCodec<ListByokKeysResponse> =
      KotlinxSerializationCodec("listBYOKKeys.response.alternative0", ListByokKeysResponse.Serializer, SdkJson)

  public val listByokKeysResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListByokKeysResponse> =
      MediaTypeCodecRegistry.of(listByokKeysResponseCodecAlternative0Codec)

  private val listByokKeysResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listBYOKKeys.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  public val listByokKeysResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listByokKeysResponseCodecAlternative1Codec)

  private val listByokKeysResponseCodecAlternative2Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listBYOKKeys.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  public val listByokKeysResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listByokKeysResponseCodecAlternative2Codec)

  public val listByokKeysRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listByokKeysResponseCodecRegistry: MediaTypeCodecRegistry<ListByokKeysResponse> =
      MediaTypeCodecRegistry.of(listByokKeysResponseCodec)

  public const val UPDATEBYOKKEY_REQUEST_CODEC_ID: String = "updateBYOKKey.request"

  private val updateByokKeyRequestCodec: MediaTypeCodec<UpdateByokKeyRequest> =
      KotlinxSerializationCodec(UPDATEBYOKKEY_REQUEST_CODEC_ID, UpdateByokKeyRequest.Serializer, SdkJson)

  public const val UPDATEBYOKKEY_RESPONSE_CODEC_ID: String = "updateBYOKKey.response"

  private val updateByokKeyResponseCodec: MediaTypeCodec<UpdateByokKeyResponse> =
      KotlinxSerializationCodec(UPDATEBYOKKEY_RESPONSE_CODEC_ID, UpdateByokKeyResponse.Serializer, SdkJson)

  private val updateByokKeyResponseCodecAlternative0Codec: MediaTypeCodec<UpdateByokKeyResponse> =
      KotlinxSerializationCodec("updateBYOKKey.response.alternative0", UpdateByokKeyResponse.Serializer, SdkJson)

  public val updateByokKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<UpdateByokKeyResponse> =
      MediaTypeCodecRegistry.of(updateByokKeyResponseCodecAlternative0Codec)

  private val updateByokKeyResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("updateBYOKKey.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val updateByokKeyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(updateByokKeyResponseCodecAlternative1Codec)

  private val updateByokKeyResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("updateBYOKKey.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val updateByokKeyResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(updateByokKeyResponseCodecAlternative2Codec)

  private val updateByokKeyResponseCodecAlternative3Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("updateBYOKKey.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  public val updateByokKeyResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(updateByokKeyResponseCodecAlternative3Codec)

  private val updateByokKeyResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("updateBYOKKey.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  public val updateByokKeyResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(updateByokKeyResponseCodecAlternative4Codec)

  public val updateByokKeyRequestCodecRegistry: MediaTypeCodecRegistry<UpdateByokKeyRequest> =
      MediaTypeCodecRegistry.of(updateByokKeyRequestCodec)

  public val updateByokKeyResponseCodecRegistry: MediaTypeCodecRegistry<UpdateByokKeyResponse> =
      MediaTypeCodecRegistry.of(updateByokKeyResponseCodec)
}

/**
 * Client for the 'BYOK' group of OpenRouter API.
 */
public class ByokClient(
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
      SdkExecutor(transport, authentication = this@ByokClient.authentication)

  /**
   * Create a new bring-your-own-key (BYOK) provider credential. The raw key is encrypted at rest and never returned in
   * API responses. Defaults to the authenticated entity's default workspace; use the `workspace_id` body field to scope
   * to a different workspace. Treat the raw key as write-only; it is never returned after creation. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createByokKey(
    request: CreateByokKeyRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.CreateByokKeyResponse = executor.execute<CreateByokKeyRequest, com.nabobery.sdkgen
    .generated.CreateByokKeyResponse>(SdkExecutionRequest(createByokKeyMetadata, baseUri, request, listOf(ByokCodecs
      .CREATEBYOKKEY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ByokCodecs.CREATEBYOKKEY_RESPONSE_CODEC_ID), ByokCodecs.createByokKeyRequestCodecRegistry, ByokCodecs
    .createByokKeyResponseCodecRegistry, options)

  /**
   * Create a new bring-your-own-key (BYOK) provider credential. The raw key is encrypted at rest and never returned in
   * API responses. Defaults to the authenticated entity's default workspace; use the `workspace_id` body field to scope
   * to a different workspace. Treat the raw key as write-only; it is never returned after creation. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun createByokKeyWithResponse(
    request: CreateByokKeyRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateByokKeyResponse> = executor.executeWithResponse<CreateByokKeyRequest,
    CreateByokKeyResponse>(SdkExecutionRequest(createByokKeyMetadata, baseUri, request, listOf(ByokCodecs
      .CREATEBYOKKEY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ByokCodecs.createByokKeyRequestCodecRegistry, CreateByokKeyResponseDecoder, options)

  /**
   * Delete (soft-delete) a bring-your-own-key (BYOK) provider credential by its `id`. The encrypted key material is
   * wiped and the record is marked as deleted. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun deleteByokKey(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.DeleteByokKeyResponse = executor.execute<Unit, com.nabobery.sdkgen.generated
    .DeleteByokKeyResponse>(SdkExecutionRequest(deleteByokKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ByokCodecs.DELETEBYOKKEY_RESPONSE_CODEC_ID), ByokCodecs.deleteByokKeyRequestCodecRegistry, ByokCodecs
    .deleteByokKeyResponseCodecRegistry, options)

  /**
   * Delete (soft-delete) a bring-your-own-key (BYOK) provider credential by its `id`. The encrypted key material is
   * wiped and the record is marked as deleted. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun deleteByokKeyWithResponse(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteByokKeyResponse> = executor.executeWithResponse<Unit,
    DeleteByokKeyResponse>(SdkExecutionRequest(deleteByokKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ByokCodecs.deleteByokKeyRequestCodecRegistry, DeleteByokKeyResponseDecoder, options)

  /**
   * Get a single bring-your-own-key (BYOK) provider credential by its `id`. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getByokKey(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.GetByokKeyResponse = executor.execute<Unit, com.nabobery.sdkgen.generated
    .GetByokKeyResponse>(SdkExecutionRequest(getByokKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ByokCodecs.GETBYOKKEY_RESPONSE_CODEC_ID), ByokCodecs.getByokKeyRequestCodecRegistry, ByokCodecs
    .getByokKeyResponseCodecRegistry, options)

  /**
   * Get a single bring-your-own-key (BYOK) provider credential by its `id`. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun getByokKeyWithResponse(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetByokKeyResponse> = executor.executeWithResponse<Unit,
    GetByokKeyResponse>(SdkExecutionRequest(getByokKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ByokCodecs.getByokKeyRequestCodecRegistry, GetByokKeyResponseDecoder, options)

  /**
   * List the bring-your-own-key (BYOK) provider credentials for the authenticated entity's default workspace. Use the
   * `workspace_id` query parameter to scope the result to a different workspace, or the `provider` query parameter to
   * filter by upstream provider. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listByokKeys(
    limit: Int? = null,
    offset: Int? = null,
    provider: InlinePathsByokGetParameters3Schema? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.ListByokKeysResponse = executor.execute<Unit, com.nabobery.sdkgen.generated
    .ListByokKeysResponse>(SdkExecutionRequest(listByokKeysMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "provider", values = provider?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ByokCodecs.LISTBYOKKEYS_RESPONSE_CODEC_ID), ByokCodecs.listByokKeysRequestCodecRegistry, ByokCodecs
    .listByokKeysResponseCodecRegistry, options)

  /**
   * List the bring-your-own-key (BYOK) provider credentials for the authenticated entity's default workspace. Use the
   * `workspace_id` query parameter to scope the result to a different workspace, or the `provider` query parameter to
   * filter by upstream provider. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listByokKeysWithResponse(
    limit: Int? = null,
    offset: Int? = null,
    provider: InlinePathsByokGetParameters3Schema? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListByokKeysResponse> = executor.executeWithResponse<Unit,
    ListByokKeysResponse>(SdkExecutionRequest(listByokKeysMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "provider", values = provider?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ByokCodecs.listByokKeysRequestCodecRegistry, ListByokKeysResponseDecoder, options)

  /**
   * Update an existing bring-your-own-key (BYOK) provider credential by its `id`. Include the `key` field to rotate the
   * raw provider API key in-place (the previous key material is overwritten). [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun updateByokKey(
    request: UpdateByokKeyRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.UpdateByokKeyResponse = executor.execute<UpdateByokKeyRequest, com.nabobery.sdkgen
    .generated.UpdateByokKeyResponse>(SdkExecutionRequest(updateByokKeyMetadata, baseUri, request, listOf(ByokCodecs
      .UPDATEBYOKKEY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ByokCodecs.UPDATEBYOKKEY_RESPONSE_CODEC_ID), ByokCodecs.updateByokKeyRequestCodecRegistry, ByokCodecs
    .updateByokKeyResponseCodecRegistry, options)

  /**
   * Update an existing bring-your-own-key (BYOK) provider credential by its `id`. Include the `key` field to rotate the
   * raw provider API key in-place (the previous key material is overwritten). [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun updateByokKeyWithResponse(
    request: UpdateByokKeyRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UpdateByokKeyResponse> = executor.executeWithResponse<UpdateByokKeyRequest,
    UpdateByokKeyResponse>(SdkExecutionRequest(updateByokKeyMetadata, baseUri, request, listOf(ByokCodecs
      .UPDATEBYOKKEY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ByokCodecs.updateByokKeyRequestCodecRegistry, UpdateByokKeyResponseDecoder, options)

  /**
   * Typed response alternatives for `createBYOKKey`. Non-success alternatives are not converted into success values.
   */
  public sealed interface CreateByokKeyResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.CreateByokKeyResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateByokKeyResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateByokKeyResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateByokKeyResponse

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateByokKeyResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateByokKeyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateByokKeyResponse
  }

  private object CreateByokKeyResponseDecoder : SdkResponseAlternativeDecoder<CreateByokKeyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CreateByokKeyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CreateByokKeyResponse> = when {
      alternative.id == "createBYOKKey.response.alternative0" -> SdkResponseDecodeResult(
        value = CreateByokKeyResponse.SuccessJson(
          json = ByokCodecs.createByokKeyResponseCodecAlternative0Registry
            .select(listOf("createBYOKKey.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createBYOKKey.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateByokKeyResponse.Http400Json(
          json = ByokCodecs.createByokKeyResponseCodecAlternative1Registry
            .select(listOf("createBYOKKey.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createBYOKKey.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateByokKeyResponse.Http401Json(
          json = ByokCodecs.createByokKeyResponseCodecAlternative2Registry
            .select(listOf("createBYOKKey.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createBYOKKey.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateByokKeyResponse.Http403Json(
          json = ByokCodecs.createByokKeyResponseCodecAlternative3Registry
            .select(listOf("createBYOKKey.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createBYOKKey.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateByokKeyResponse.Http500Json(
          json = ByokCodecs.createByokKeyResponseCodecAlternative4Registry
            .select(listOf("createBYOKKey.response.alternative4"), mediaType ?: "application/json").decode(body,
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
    ): CreateByokKeyResponse = CreateByokKeyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `deleteBYOKKey`. Non-success alternatives are not converted into success values.
   */
  public sealed interface DeleteByokKeyResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.DeleteByokKeyResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteByokKeyResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteByokKeyResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteByokKeyResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteByokKeyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteByokKeyResponse
  }

  private object DeleteByokKeyResponseDecoder : SdkResponseAlternativeDecoder<DeleteByokKeyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteByokKeyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteByokKeyResponse> = when {
      alternative.id == "deleteBYOKKey.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteByokKeyResponse.SuccessJson(
          json = ByokCodecs.deleteByokKeyResponseCodecAlternative0Registry
            .select(listOf("deleteBYOKKey.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteBYOKKey.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteByokKeyResponse.Http401Json(
          json = ByokCodecs.deleteByokKeyResponseCodecAlternative1Registry
            .select(listOf("deleteBYOKKey.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteBYOKKey.response.alternative2" -> SdkResponseDecodeResult(
        value = DeleteByokKeyResponse.Http404Json(
          json = ByokCodecs.deleteByokKeyResponseCodecAlternative2Registry
            .select(listOf("deleteBYOKKey.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteBYOKKey.response.alternative3" -> SdkResponseDecodeResult(
        value = DeleteByokKeyResponse.Http500Json(
          json = ByokCodecs.deleteByokKeyResponseCodecAlternative3Registry
            .select(listOf("deleteBYOKKey.response.alternative3"), mediaType ?: "application/json").decode(body,
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
    ): DeleteByokKeyResponse = DeleteByokKeyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `getBYOKKey`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetByokKeyResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.GetByokKeyResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetByokKeyResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetByokKeyResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetByokKeyResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetByokKeyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetByokKeyResponse
  }

  private object GetByokKeyResponseDecoder : SdkResponseAlternativeDecoder<GetByokKeyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetByokKeyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetByokKeyResponse> = when {
      alternative.id == "getBYOKKey.response.alternative0" -> SdkResponseDecodeResult(
        value = GetByokKeyResponse.SuccessJson(
          json = ByokCodecs.getByokKeyResponseCodecAlternative0Registry
            .select(listOf("getBYOKKey.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getBYOKKey.response.alternative1" -> SdkResponseDecodeResult(
        value = GetByokKeyResponse.Http401Json(
          json = ByokCodecs.getByokKeyResponseCodecAlternative1Registry
            .select(listOf("getBYOKKey.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getBYOKKey.response.alternative2" -> SdkResponseDecodeResult(
        value = GetByokKeyResponse.Http404Json(
          json = ByokCodecs.getByokKeyResponseCodecAlternative2Registry
            .select(listOf("getBYOKKey.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getBYOKKey.response.alternative3" -> SdkResponseDecodeResult(
        value = GetByokKeyResponse.Http500Json(
          json = ByokCodecs.getByokKeyResponseCodecAlternative3Registry
            .select(listOf("getBYOKKey.response.alternative3"), mediaType ?: "application/json").decode(body,
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
    ): GetByokKeyResponse = GetByokKeyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `listBYOKKeys`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ListByokKeysResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.ListByokKeysResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListByokKeysResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListByokKeysResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListByokKeysResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListByokKeysResponse
  }

  private object ListByokKeysResponseDecoder : SdkResponseAlternativeDecoder<ListByokKeysResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListByokKeysResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListByokKeysResponse> = when {
      alternative.id == "listBYOKKeys.response.alternative0" -> SdkResponseDecodeResult(
        value = ListByokKeysResponse.SuccessJson(
          json = ByokCodecs.listByokKeysResponseCodecAlternative0Registry
            .select(listOf("listBYOKKeys.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listBYOKKeys.response.alternative1" -> SdkResponseDecodeResult(
        value = ListByokKeysResponse.Http401Json(
          json = ByokCodecs.listByokKeysResponseCodecAlternative1Registry
            .select(listOf("listBYOKKeys.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listBYOKKeys.response.alternative2" -> SdkResponseDecodeResult(
        value = ListByokKeysResponse.Http500Json(
          json = ByokCodecs.listByokKeysResponseCodecAlternative2Registry
            .select(listOf("listBYOKKeys.response.alternative2"), mediaType ?: "application/json").decode(body,
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
    ): ListByokKeysResponse = ListByokKeysResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `updateBYOKKey`. Non-success alternatives are not converted into success values.
   */
  public sealed interface UpdateByokKeyResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.UpdateByokKeyResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateByokKeyResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateByokKeyResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateByokKeyResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateByokKeyResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateByokKeyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateByokKeyResponse
  }

  private object UpdateByokKeyResponseDecoder : SdkResponseAlternativeDecoder<UpdateByokKeyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UpdateByokKeyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UpdateByokKeyResponse> = when {
      alternative.id == "updateBYOKKey.response.alternative0" -> SdkResponseDecodeResult(
        value = UpdateByokKeyResponse.SuccessJson(
          json = ByokCodecs.updateByokKeyResponseCodecAlternative0Registry
            .select(listOf("updateBYOKKey.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateBYOKKey.response.alternative1" -> SdkResponseDecodeResult(
        value = UpdateByokKeyResponse.Http400Json(
          json = ByokCodecs.updateByokKeyResponseCodecAlternative1Registry
            .select(listOf("updateBYOKKey.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateBYOKKey.response.alternative2" -> SdkResponseDecodeResult(
        value = UpdateByokKeyResponse.Http401Json(
          json = ByokCodecs.updateByokKeyResponseCodecAlternative2Registry
            .select(listOf("updateBYOKKey.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateBYOKKey.response.alternative3" -> SdkResponseDecodeResult(
        value = UpdateByokKeyResponse.Http404Json(
          json = ByokCodecs.updateByokKeyResponseCodecAlternative3Registry
            .select(listOf("updateBYOKKey.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateBYOKKey.response.alternative4" -> SdkResponseDecodeResult(
        value = UpdateByokKeyResponse.Http500Json(
          json = ByokCodecs.updateByokKeyResponseCodecAlternative4Registry
            .select(listOf("updateBYOKKey.response.alternative4"), mediaType ?: "application/json").decode(body,
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
    ): UpdateByokKeyResponse = UpdateByokKeyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val createByokKeyMetadata: OperationMetadata = OperationMetadata(
          operationId = "createBYOKKey",
          method = "POST",
          path = "/byok",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "CreateByokKeyResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createBYOKKey.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createBYOKKey.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createBYOKKey.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createBYOKKey.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createBYOKKey.response.alternative4",
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

    public val deleteByokKeyMetadata: OperationMetadata = OperationMetadata(
          operationId = "deleteBYOKKey",
          method = "DELETE",
          path = "/byok/{id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeleteByokKeyResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteBYOKKey.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteBYOKKey.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteBYOKKey.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteBYOKKey.response.alternative3",
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

    public val getByokKeyMetadata: OperationMetadata = OperationMetadata(
          operationId = "getBYOKKey",
          method = "GET",
          path = "/byok/{id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GetByokKeyResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getBYOKKey.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getBYOKKey.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getBYOKKey.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getBYOKKey.response.alternative3",
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

    public val listByokKeysMetadata: OperationMetadata = OperationMetadata(
          operationId = "listBYOKKeys",
          method = "GET",
          path = "/byok",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ListByokKeysResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listBYOKKeys.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listBYOKKeys.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listBYOKKeys.response.alternative2",
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

    public val updateByokKeyMetadata: OperationMetadata = OperationMetadata(
          operationId = "updateBYOKKey",
          method = "PATCH",
          path = "/byok/{id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "UpdateByokKeyResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateBYOKKey.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateBYOKKey.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateBYOKKey.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateBYOKKey.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateBYOKKey.response.alternative4",
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
