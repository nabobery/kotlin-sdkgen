package com.nabobery.sdkgen.generated.byok

import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.ByokKey
import com.nabobery.sdkgen.generated.CreateByokKeyRequest
import com.nabobery.sdkgen.generated.CreateByokKeyResponse
import com.nabobery.sdkgen.generated.DeleteByokKeyResponse
import com.nabobery.sdkgen.generated.ForbiddenResponse
import com.nabobery.sdkgen.generated.GetByokKeyResponse
import com.nabobery.sdkgen.generated.InlineByokGetParameterX79c1482f
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
import com.nabobery.sdkgen.runtime.PaginationDescriptor
import com.nabobery.sdkgen.runtime.PropertyPath
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
import com.nabobery.sdkgen.runtime.pagination.Page
import com.nabobery.sdkgen.runtime.pagination.PageEnvelope
import com.nabobery.sdkgen.runtime.pagination.PageRequest
import com.nabobery.sdkgen.runtime.pagination.PaginationEngine
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.coroutines.flow.Flow

internal object ByokCodecs {
  internal const val CREATEBYOKKEY_REQUEST_CODEC_ID: String = "createBYOKKey.request"

  private val createByokKeyRequestCodec: MediaTypeCodec<CreateByokKeyRequest> =
      KotlinxSerializationCodec(CREATEBYOKKEY_REQUEST_CODEC_ID, CreateByokKeyRequest.Serializer, SdkJson)

  internal const val CREATEBYOKKEY_RESPONSE_CODEC_ID: String = "createBYOKKey.response"

  private val createByokKeyResponseCodec: MediaTypeCodec<CreateByokKeyResponse> =
      KotlinxSerializationCodec(CREATEBYOKKEY_RESPONSE_CODEC_ID, CreateByokKeyResponse.Serializer, SdkJson)

  private val createByokKeyResponseCodecAlternative0Codec: MediaTypeCodec<CreateByokKeyResponse> =
      KotlinxSerializationCodec("createBYOKKey.response.alternative0", CreateByokKeyResponse.Serializer, SdkJson)

  internal val createByokKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CreateByokKeyResponse> =
      MediaTypeCodecRegistry.of(createByokKeyResponseCodecAlternative0Codec)

  private val createByokKeyResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createBYOKKey.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val createByokKeyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createByokKeyResponseCodecAlternative1Codec)

  private val createByokKeyResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createBYOKKey.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val createByokKeyResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createByokKeyResponseCodecAlternative2Codec)

  private val createByokKeyResponseCodecAlternative3Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("createBYOKKey.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  internal val createByokKeyResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createByokKeyResponseCodecAlternative3Codec)

  private val createByokKeyResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createBYOKKey.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  internal val createByokKeyResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createByokKeyResponseCodecAlternative4Codec)

  internal val createByokKeyRequestCodecRegistry: MediaTypeCodecRegistry<CreateByokKeyRequest> =
      MediaTypeCodecRegistry.of(createByokKeyRequestCodec)

  internal val createByokKeyResponseCodecRegistry: MediaTypeCodecRegistry<CreateByokKeyResponse> =
      MediaTypeCodecRegistry.of(createByokKeyResponseCodec)

  internal const val DELETEBYOKKEY_RESPONSE_CODEC_ID: String = "deleteBYOKKey.response"

  private val deleteByokKeyResponseCodec: MediaTypeCodec<DeleteByokKeyResponse> =
      KotlinxSerializationCodec(DELETEBYOKKEY_RESPONSE_CODEC_ID, DeleteByokKeyResponse.Serializer, SdkJson)

  private val deleteByokKeyResponseCodecAlternative0Codec: MediaTypeCodec<DeleteByokKeyResponse> =
      KotlinxSerializationCodec("deleteBYOKKey.response.alternative0", DeleteByokKeyResponse.Serializer, SdkJson)

  internal val deleteByokKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeleteByokKeyResponse> =
      MediaTypeCodecRegistry.of(deleteByokKeyResponseCodecAlternative0Codec)

  private val deleteByokKeyResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("deleteBYOKKey.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val deleteByokKeyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(deleteByokKeyResponseCodecAlternative1Codec)

  private val deleteByokKeyResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("deleteBYOKKey.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  internal val deleteByokKeyResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(deleteByokKeyResponseCodecAlternative2Codec)

  private val deleteByokKeyResponseCodecAlternative3Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("deleteBYOKKey.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  internal val deleteByokKeyResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(deleteByokKeyResponseCodecAlternative3Codec)

  internal val deleteByokKeyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val deleteByokKeyResponseCodecRegistry: MediaTypeCodecRegistry<DeleteByokKeyResponse> =
      MediaTypeCodecRegistry.of(deleteByokKeyResponseCodec)

  internal const val GETBYOKKEY_RESPONSE_CODEC_ID: String = "getBYOKKey.response"

  private val getByokKeyResponseCodec: MediaTypeCodec<GetByokKeyResponse> =
      KotlinxSerializationCodec(GETBYOKKEY_RESPONSE_CODEC_ID, GetByokKeyResponse.Serializer, SdkJson)

  private val getByokKeyResponseCodecAlternative0Codec: MediaTypeCodec<GetByokKeyResponse> =
      KotlinxSerializationCodec("getBYOKKey.response.alternative0", GetByokKeyResponse.Serializer, SdkJson)

  internal val getByokKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<GetByokKeyResponse> =
      MediaTypeCodecRegistry.of(getByokKeyResponseCodecAlternative0Codec)

  private val getByokKeyResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getBYOKKey.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val getByokKeyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getByokKeyResponseCodecAlternative1Codec)

  private val getByokKeyResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getBYOKKey.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  internal val getByokKeyResponseCodecAlternative2Registry: MediaTypeCodecRegistry<NotFoundResponse>
      = MediaTypeCodecRegistry.of(getByokKeyResponseCodecAlternative2Codec)

  private val getByokKeyResponseCodecAlternative3Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getBYOKKey.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  internal val getByokKeyResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getByokKeyResponseCodecAlternative3Codec)

  internal val getByokKeyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val getByokKeyResponseCodecRegistry: MediaTypeCodecRegistry<GetByokKeyResponse> =
      MediaTypeCodecRegistry.of(getByokKeyResponseCodec)

  internal const val LISTBYOKKEYS_RESPONSE_CODEC_ID: String = "listBYOKKeys.response"

  private val listByokKeysResponseCodec: MediaTypeCodec<ListByokKeysResponse> =
      KotlinxSerializationCodec(LISTBYOKKEYS_RESPONSE_CODEC_ID, ListByokKeysResponse.Serializer, SdkJson)

  private val listByokKeysResponseCodecAlternative0Codec: MediaTypeCodec<ListByokKeysResponse> =
      KotlinxSerializationCodec("listBYOKKeys.response.alternative0", ListByokKeysResponse.Serializer, SdkJson)

  internal val listByokKeysResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListByokKeysResponse> =
      MediaTypeCodecRegistry.of(listByokKeysResponseCodecAlternative0Codec)

  private val listByokKeysResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listBYOKKeys.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val listByokKeysResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listByokKeysResponseCodecAlternative1Codec)

  private val listByokKeysResponseCodecAlternative2Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listBYOKKeys.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  internal val listByokKeysResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listByokKeysResponseCodecAlternative2Codec)

  internal val listByokKeysRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listByokKeysResponseCodecRegistry: MediaTypeCodecRegistry<ListByokKeysResponse> =
      MediaTypeCodecRegistry.of(listByokKeysResponseCodec)

  internal const val UPDATEBYOKKEY_REQUEST_CODEC_ID: String = "updateBYOKKey.request"

  private val updateByokKeyRequestCodec: MediaTypeCodec<UpdateByokKeyRequest> =
      KotlinxSerializationCodec(UPDATEBYOKKEY_REQUEST_CODEC_ID, UpdateByokKeyRequest.Serializer, SdkJson)

  internal const val UPDATEBYOKKEY_RESPONSE_CODEC_ID: String = "updateBYOKKey.response"

  private val updateByokKeyResponseCodec: MediaTypeCodec<UpdateByokKeyResponse> =
      KotlinxSerializationCodec(UPDATEBYOKKEY_RESPONSE_CODEC_ID, UpdateByokKeyResponse.Serializer, SdkJson)

  private val updateByokKeyResponseCodecAlternative0Codec: MediaTypeCodec<UpdateByokKeyResponse> =
      KotlinxSerializationCodec("updateBYOKKey.response.alternative0", UpdateByokKeyResponse.Serializer, SdkJson)

  internal val updateByokKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<UpdateByokKeyResponse> =
      MediaTypeCodecRegistry.of(updateByokKeyResponseCodecAlternative0Codec)

  private val updateByokKeyResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("updateBYOKKey.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val updateByokKeyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(updateByokKeyResponseCodecAlternative1Codec)

  private val updateByokKeyResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("updateBYOKKey.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val updateByokKeyResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(updateByokKeyResponseCodecAlternative2Codec)

  private val updateByokKeyResponseCodecAlternative3Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("updateBYOKKey.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  internal val updateByokKeyResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(updateByokKeyResponseCodecAlternative3Codec)

  private val updateByokKeyResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("updateBYOKKey.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  internal val updateByokKeyResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(updateByokKeyResponseCodecAlternative4Codec)

  internal val updateByokKeyRequestCodecRegistry: MediaTypeCodecRegistry<UpdateByokKeyRequest> =
      MediaTypeCodecRegistry.of(updateByokKeyRequestCodec)

  internal val updateByokKeyResponseCodecRegistry: MediaTypeCodecRegistry<UpdateByokKeyResponse> =
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
   * @throws CreateByokKeyApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded CreateByokKeyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createByokKey(
    request: CreateByokKeyRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.CreateByokKeyResponse = executor.executeWithTypedErrors<CreateByokKeyRequest, CreateByokKeyResponse, com.nabobery.sdkgen.generated.CreateByokKeyResponse>(
    request = SdkExecutionRequest(createByokKeyMetadata, baseUri, request, listOf(ByokCodecs.CREATEBYOKKEY_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ByokCodecs.createByokKeyRequestCodecRegistry,
    responseDecoder = CreateByokKeyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CreateByokKeyResponse.SuccessJson -> response.json
        is CreateByokKeyResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateByokKeyResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateByokKeyResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateByokKeyResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateByokKeyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CreateByokKeyResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CreateByokKeyResponse.Http400Json -> CreateByokKeyApiException(response, statusCode, headers)
        is CreateByokKeyResponse.Http401Json -> CreateByokKeyApiException(response, statusCode, headers)
        is CreateByokKeyResponse.Http403Json -> CreateByokKeyApiException(response, statusCode, headers)
        is CreateByokKeyResponse.Http500Json -> CreateByokKeyApiException(response, statusCode, headers)
        is CreateByokKeyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Create a new bring-your-own-key (BYOK) provider credential. The raw key is encrypted at rest and never returned in
   * API responses. Defaults to the authenticated entity's default workspace; use the `workspace_id` body field to scope
   * to a different workspace. Treat the raw key as write-only; it is never returned after creation. [Management
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
  public suspend fun createByokKeyWithResponse(
    request: CreateByokKeyRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateByokKeyResponse> = executor.executeWithResponse<CreateByokKeyRequest, CreateByokKeyResponse>(SdkExecutionRequest(createByokKeyMetadata, baseUri, request, listOf(ByokCodecs.CREATEBYOKKEY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ByokCodecs.createByokKeyRequestCodecRegistry, CreateByokKeyResponseDecoder, options)

  /**
   * Delete (soft-delete) a bring-your-own-key (BYOK) provider credential by its `id`. The encrypted key material is
   * wiped and the record is marked as deleted. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * @param id The BYOK credential ID (UUID).
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
   * @throws DeleteByokKeyApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded DeleteByokKeyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun deleteByokKey(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.DeleteByokKeyResponse = executor.executeWithTypedErrors<Unit, DeleteByokKeyResponse, com.nabobery.sdkgen.generated.DeleteByokKeyResponse>(
    request = SdkExecutionRequest(deleteByokKeyMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ByokCodecs.deleteByokKeyRequestCodecRegistry,
    responseDecoder = DeleteByokKeyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DeleteByokKeyResponse.SuccessJson -> response.json
        is DeleteByokKeyResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteByokKeyResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteByokKeyResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteByokKeyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DeleteByokKeyResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is DeleteByokKeyResponse.Http401Json -> DeleteByokKeyApiException(response, statusCode, headers)
        is DeleteByokKeyResponse.Http404Json -> DeleteByokKeyApiException(response, statusCode, headers)
        is DeleteByokKeyResponse.Http500Json -> DeleteByokKeyApiException(response, statusCode, headers)
        is DeleteByokKeyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Delete (soft-delete) a bring-your-own-key (BYOK) provider credential by its `id`. The encrypted key material is
   * wiped and the record is marked as deleted. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param id The BYOK credential ID (UUID).
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
  public suspend fun deleteByokKeyWithResponse(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteByokKeyResponse> = executor.executeWithResponse<Unit, DeleteByokKeyResponse>(SdkExecutionRequest(deleteByokKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ByokCodecs.deleteByokKeyRequestCodecRegistry, DeleteByokKeyResponseDecoder, options)

  /**
   * Get a single bring-your-own-key (BYOK) provider credential by its `id`. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param id The BYOK credential ID (UUID).
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
   * @throws GetByokKeyApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GetByokKeyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getByokKey(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.GetByokKeyResponse = executor.executeWithTypedErrors<Unit, GetByokKeyResponse, com.nabobery.sdkgen.generated.GetByokKeyResponse>(
    request = SdkExecutionRequest(getByokKeyMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ByokCodecs.getByokKeyRequestCodecRegistry,
    responseDecoder = GetByokKeyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GetByokKeyResponse.SuccessJson -> response.json
        is GetByokKeyResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is GetByokKeyResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GetByokKeyResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is GetByokKeyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GetByokKeyResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GetByokKeyResponse.Http401Json -> GetByokKeyApiException(response, statusCode, headers)
        is GetByokKeyResponse.Http404Json -> GetByokKeyApiException(response, statusCode, headers)
        is GetByokKeyResponse.Http500Json -> GetByokKeyApiException(response, statusCode, headers)
        is GetByokKeyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Get a single bring-your-own-key (BYOK) provider credential by its `id`. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param id The BYOK credential ID (UUID).
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
  public suspend fun getByokKeyWithResponse(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetByokKeyResponse> = executor.executeWithResponse<Unit, GetByokKeyResponse>(SdkExecutionRequest(getByokKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ByokCodecs.getByokKeyRequestCodecRegistry, GetByokKeyResponseDecoder, options)

  /**
   * List the bring-your-own-key (BYOK) provider credentials for the authenticated entity's default workspace. Use the
   * `workspace_id` query parameter to scope the result to a different workspace, or the `provider` query parameter to
   * filter by upstream provider. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options, including pagination bounds.
   * @return The first decoded page.
   */
  public suspend fun listByokKeys(
    limit: Int? = null,
    offset: Int? = null,
    provider: InlineByokGetParameterX79c1482f? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Page<com.nabobery.sdkgen.generated.ListByokKeysResponse, ByokKey> {
    val engine = PaginationEngine<com.nabobery.sdkgen.generated.ListByokKeysResponse, ByokKey>(
          descriptor = requireNotNull(listByokKeysMetadata.pagination as? PaginationDescriptor.OffsetLimit),
          operationId = listByokKeysMetadata.operationId,
          requestedPageSize = limit,
          initialOffset = offset?.toLong() ?: 0L,
        )
    return engine.firstPage { pageRequest -> fetchlistByokKeysPage(Unit, limit, offset, provider, workspaceId, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }
  }

  /**
   * List the bring-your-own-key (BYOK) provider credentials for the authenticated entity's default workspace. Use the
   * `workspace_id` query parameter to scope the result to a different workspace, or the `provider` query parameter to
   * filter by upstream provider. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param limit Maximum number of records to return (max 100)
   * @param offset Number of records to skip for pagination
   * @param provider Optional provider slug to filter by (e.g. `openai`, `anthropic`, `amazon-bedrock`).
   * @param workspaceId Optional workspace ID to filter by. Defaults to the authenticated entity's default workspace.
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
  public suspend fun listByokKeysWithResponse(
    limit: Int? = null,
    offset: Int? = null,
    provider: InlineByokGetParameterX79c1482f? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListByokKeysResponse> = executor.executeWithResponse<Unit, ListByokKeysResponse>(SdkExecutionRequest(listByokKeysMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "provider", values = provider?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ByokCodecs.listByokKeysRequestCodecRegistry, ListByokKeysResponseDecoder, options)

  /**
   * Returns a cold page flow for listBYOKKeys.
   *
   * @param limit Maximum number of records to return (max 100)
   * @param offset Number of records to skip for pagination
   * @param provider Optional provider slug to filter by (e.g. `openai`, `anthropic`, `amazon-bedrock`).
   * @param workspaceId Optional workspace ID to filter by. Defaults to the authenticated entity's default workspace.
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
   * @param options Execution options, including pagination bounds.
   */
  public fun listByokKeysPages(
    limit: Int? = null,
    offset: Int? = null,
    provider: InlineByokGetParameterX79c1482f? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Flow<Page<com.nabobery.sdkgen.generated.ListByokKeysResponse, ByokKey>> = PaginationEngine<com.nabobery.sdkgen.generated.ListByokKeysResponse, ByokKey>(
    descriptor = requireNotNull(listByokKeysMetadata.pagination as? PaginationDescriptor.OffsetLimit),
    operationId = listByokKeysMetadata.operationId,
    requestedPageSize = limit,
    initialOffset = offset?.toLong() ?: 0L,
  ).pages(fetch = { pageRequest -> fetchlistByokKeysPage(Unit, limit, offset, provider, workspaceId, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }, pagination = options.pagination)

  /**
   * Returns a cold item flow for listBYOKKeys.
   *
   * @param options Execution options, including pagination bounds.
   */
  public fun listByokKeysItems(
    limit: Int? = null,
    offset: Int? = null,
    provider: InlineByokGetParameterX79c1482f? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Flow<ByokKey> = PaginationEngine<com.nabobery.sdkgen.generated.ListByokKeysResponse, ByokKey>(
    descriptor = requireNotNull(listByokKeysMetadata.pagination as? PaginationDescriptor.OffsetLimit),
    operationId = listByokKeysMetadata.operationId,
    requestedPageSize = limit,
    initialOffset = offset?.toLong() ?: 0L,
  ).items(fetch = { pageRequest -> fetchlistByokKeysPage(Unit, limit, offset, provider, workspaceId, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }, pagination = options.pagination)

  private fun metadataForListByokKeysPage(
    pageRequest: PageRequest,
    limit: Int? = null,
    offset: Int? = null,
    provider: InlineByokGetParameterX79c1482f? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
  ): OperationMetadata = listByokKeysMetadata

  private suspend fun fetchlistByokKeysPage(
    request: Unit,
    limit: Int? = null,
    offset: Int? = null,
    provider: InlineByokGetParameterX79c1482f? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    pageRequest: PageRequest,
    options: CallOptions,
  ): PageEnvelope<com.nabobery.sdkgen.generated.ListByokKeysResponse, ByokKey> {
    val pageRequestValue = when (pageRequest) {
      PageRequest.First -> request
      is PageRequest.NextCursor -> request
      is PageRequest.NextOffset -> request
      is PageRequest.NextPage -> request
      is PageRequest.NextUrl -> request
      is PageRequest.NextToken -> request
    }
    val pageMetadata = metadataForListByokKeysPage(pageRequest, limit, offset, provider, workspaceId, httpReferer, xOpenRouterCategories, xOpenRouterTitle)
    val response = executor.execute<Unit, com.nabobery.sdkgen.generated.ListByokKeysResponse>(SdkExecutionRequest(pageMetadata, baseUri, pageRequestValue, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = when (pageRequest) {
        is PageRequest.NextOffset -> listOf(pageRequest.offset.toString())
        else -> offset?.let { listOf(it.toString()) }.orEmpty()
      }))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "provider", values = provider?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }), listOf(ByokCodecs.LISTBYOKKEYS_RESPONSE_CODEC_ID), ByokCodecs.listByokKeysRequestCodecRegistry, ByokCodecs.listByokKeysResponseCodecRegistry, options)
    return PageEnvelope(value = response, items = response.data.orEmpty())
  }

  /**
   * Update an existing bring-your-own-key (BYOK) provider credential by its `id`. Include the `key` field to rotate the
   * raw provider API key in-place (the previous key material is overwritten). [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param id The BYOK credential ID (UUID).
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
   * @throws UpdateByokKeyApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded UpdateByokKeyError payload.
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
  ): com.nabobery.sdkgen.generated.UpdateByokKeyResponse = executor.executeWithTypedErrors<UpdateByokKeyRequest, UpdateByokKeyResponse, com.nabobery.sdkgen.generated.UpdateByokKeyResponse>(
    request = SdkExecutionRequest(updateByokKeyMetadata, baseUri, request, listOf(ByokCodecs.UPDATEBYOKKEY_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ByokCodecs.updateByokKeyRequestCodecRegistry,
    responseDecoder = UpdateByokKeyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UpdateByokKeyResponse.SuccessJson -> response.json
        is UpdateByokKeyResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateByokKeyResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateByokKeyResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateByokKeyResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateByokKeyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UpdateByokKeyResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UpdateByokKeyResponse.Http400Json -> UpdateByokKeyApiException(response, statusCode, headers)
        is UpdateByokKeyResponse.Http401Json -> UpdateByokKeyApiException(response, statusCode, headers)
        is UpdateByokKeyResponse.Http404Json -> UpdateByokKeyApiException(response, statusCode, headers)
        is UpdateByokKeyResponse.Http500Json -> UpdateByokKeyApiException(response, statusCode, headers)
        is UpdateByokKeyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Update an existing bring-your-own-key (BYOK) provider credential by its `id`. Include the `key` field to rotate the
   * raw provider API key in-place (the previous key material is overwritten). [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The BYOK credential ID (UUID).
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
  public suspend fun updateByokKeyWithResponse(
    request: UpdateByokKeyRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UpdateByokKeyResponse> = executor.executeWithResponse<UpdateByokKeyRequest, UpdateByokKeyResponse>(SdkExecutionRequest(updateByokKeyMetadata, baseUri, request, listOf(ByokCodecs.UPDATEBYOKKEY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ByokCodecs.updateByokKeyRequestCodecRegistry, UpdateByokKeyResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `createBYOKKey` may expose through its typed API exception.
   */
  public sealed interface CreateByokKeyError

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
    ) : CreateByokKeyResponse,
        CreateByokKeyError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateByokKeyResponse,
        CreateByokKeyError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateByokKeyResponse,
        CreateByokKeyError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateByokKeyResponse,
        CreateByokKeyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateByokKeyResponse
  }

  /**
   * Raised by `createBYOKKey` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class CreateByokKeyApiException(
    public val error: CreateByokKeyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "createBYOKKey")

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
          json = ByokCodecs.createByokKeyResponseCodecAlternative0Registry.select(listOf("createBYOKKey.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createBYOKKey.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateByokKeyResponse.Http400Json(
          json = ByokCodecs.createByokKeyResponseCodecAlternative1Registry.select(listOf("createBYOKKey.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createBYOKKey.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateByokKeyResponse.Http401Json(
          json = ByokCodecs.createByokKeyResponseCodecAlternative2Registry.select(listOf("createBYOKKey.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createBYOKKey.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateByokKeyResponse.Http403Json(
          json = ByokCodecs.createByokKeyResponseCodecAlternative3Registry.select(listOf("createBYOKKey.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createBYOKKey.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateByokKeyResponse.Http500Json(
          json = ByokCodecs.createByokKeyResponseCodecAlternative4Registry.select(listOf("createBYOKKey.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
   * Decoded non-success response alternatives that `deleteBYOKKey` may expose through its typed API exception.
   */
  public sealed interface DeleteByokKeyError

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
    ) : DeleteByokKeyResponse,
        DeleteByokKeyError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteByokKeyResponse,
        DeleteByokKeyError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteByokKeyResponse,
        DeleteByokKeyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteByokKeyResponse
  }

  /**
   * Raised by `deleteBYOKKey` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class DeleteByokKeyApiException(
    public val error: DeleteByokKeyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "deleteBYOKKey")

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
          json = ByokCodecs.deleteByokKeyResponseCodecAlternative0Registry.select(listOf("deleteBYOKKey.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteBYOKKey.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteByokKeyResponse.Http401Json(
          json = ByokCodecs.deleteByokKeyResponseCodecAlternative1Registry.select(listOf("deleteBYOKKey.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteBYOKKey.response.alternative2" -> SdkResponseDecodeResult(
        value = DeleteByokKeyResponse.Http404Json(
          json = ByokCodecs.deleteByokKeyResponseCodecAlternative2Registry.select(listOf("deleteBYOKKey.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteBYOKKey.response.alternative3" -> SdkResponseDecodeResult(
        value = DeleteByokKeyResponse.Http500Json(
          json = ByokCodecs.deleteByokKeyResponseCodecAlternative3Registry.select(listOf("deleteBYOKKey.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
   * Decoded non-success response alternatives that `getBYOKKey` may expose through its typed API exception.
   */
  public sealed interface GetByokKeyError

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
    ) : GetByokKeyResponse,
        GetByokKeyError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetByokKeyResponse,
        GetByokKeyError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetByokKeyResponse,
        GetByokKeyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetByokKeyResponse
  }

  /**
   * Raised by `getBYOKKey` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class GetByokKeyApiException(
    public val error: GetByokKeyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "getBYOKKey")

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
          json = ByokCodecs.getByokKeyResponseCodecAlternative0Registry.select(listOf("getBYOKKey.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getBYOKKey.response.alternative1" -> SdkResponseDecodeResult(
        value = GetByokKeyResponse.Http401Json(
          json = ByokCodecs.getByokKeyResponseCodecAlternative1Registry.select(listOf("getBYOKKey.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getBYOKKey.response.alternative2" -> SdkResponseDecodeResult(
        value = GetByokKeyResponse.Http404Json(
          json = ByokCodecs.getByokKeyResponseCodecAlternative2Registry.select(listOf("getBYOKKey.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getBYOKKey.response.alternative3" -> SdkResponseDecodeResult(
        value = GetByokKeyResponse.Http500Json(
          json = ByokCodecs.getByokKeyResponseCodecAlternative3Registry.select(listOf("getBYOKKey.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
   * Decoded non-success response alternatives that `listBYOKKeys` may expose through its typed API exception.
   */
  public sealed interface ListByokKeysError

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
    ) : ListByokKeysResponse,
        ListByokKeysError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListByokKeysResponse,
        ListByokKeysError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListByokKeysResponse
  }

  /**
   * Raised by `listBYOKKeys` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class ListByokKeysApiException(
    public val error: ListByokKeysError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listBYOKKeys")

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
          json = ByokCodecs.listByokKeysResponseCodecAlternative0Registry.select(listOf("listBYOKKeys.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listBYOKKeys.response.alternative1" -> SdkResponseDecodeResult(
        value = ListByokKeysResponse.Http401Json(
          json = ByokCodecs.listByokKeysResponseCodecAlternative1Registry.select(listOf("listBYOKKeys.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listBYOKKeys.response.alternative2" -> SdkResponseDecodeResult(
        value = ListByokKeysResponse.Http500Json(
          json = ByokCodecs.listByokKeysResponseCodecAlternative2Registry.select(listOf("listBYOKKeys.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
   * Decoded non-success response alternatives that `updateBYOKKey` may expose through its typed API exception.
   */
  public sealed interface UpdateByokKeyError

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
    ) : UpdateByokKeyResponse,
        UpdateByokKeyError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateByokKeyResponse,
        UpdateByokKeyError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateByokKeyResponse,
        UpdateByokKeyError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateByokKeyResponse,
        UpdateByokKeyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateByokKeyResponse
  }

  /**
   * Raised by `updateBYOKKey` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class UpdateByokKeyApiException(
    public val error: UpdateByokKeyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "updateBYOKKey")

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
          json = ByokCodecs.updateByokKeyResponseCodecAlternative0Registry.select(listOf("updateBYOKKey.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateBYOKKey.response.alternative1" -> SdkResponseDecodeResult(
        value = UpdateByokKeyResponse.Http400Json(
          json = ByokCodecs.updateByokKeyResponseCodecAlternative1Registry.select(listOf("updateBYOKKey.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateBYOKKey.response.alternative2" -> SdkResponseDecodeResult(
        value = UpdateByokKeyResponse.Http401Json(
          json = ByokCodecs.updateByokKeyResponseCodecAlternative2Registry.select(listOf("updateBYOKKey.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateBYOKKey.response.alternative3" -> SdkResponseDecodeResult(
        value = UpdateByokKeyResponse.Http404Json(
          json = ByokCodecs.updateByokKeyResponseCodecAlternative3Registry.select(listOf("updateBYOKKey.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateBYOKKey.response.alternative4" -> SdkResponseDecodeResult(
        value = UpdateByokKeyResponse.Http500Json(
          json = ByokCodecs.updateByokKeyResponseCodecAlternative4Registry.select(listOf("updateBYOKKey.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    internal val createByokKeyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
        ) }

    internal val deleteByokKeyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
        ) }

    internal val getByokKeyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
        ) }

    internal val listByokKeysMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
          pagination = PaginationDescriptor.OffsetLimit(requestOffsetParam = "offset", requestLimitParam = "limit", responseItemsPath = PropertyPath("data"), responseTotalPath = null),
          streaming = null,
        ) }

    internal val updateByokKeyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
        ) }
  }
}
