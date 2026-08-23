package com.nabobery.sdkgen.generated.organization

import com.nabobery.sdkgen.generated.InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724
import com.nabobery.sdkgen.generated.InlineOrganizationMembersGetResponse200JsonX65dd6b8f
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.NotFoundResponse
import com.nabobery.sdkgen.generated.SdkJson
import com.nabobery.sdkgen.generated.UnauthorizedResponse
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

internal object OrganizationCodecs {
  internal const val LISTORGANIZATIONMEMBERS_RESPONSE_CODEC_ID: String =
      "listOrganizationMembers.response"

  private val listOrganizationMembersResponseCodec:
      MediaTypeCodec<InlineOrganizationMembersGetResponse200JsonX65dd6b8f> =
      KotlinxSerializationCodec(LISTORGANIZATIONMEMBERS_RESPONSE_CODEC_ID, InlineOrganizationMembersGetResponse200JsonX65dd6b8f.Serializer, SdkJson)

  private val listOrganizationMembersResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrganizationMembersGetResponse200JsonX65dd6b8f> =
      KotlinxSerializationCodec("listOrganizationMembers.response.alternative0", InlineOrganizationMembersGetResponse200JsonX65dd6b8f.Serializer, SdkJson)

  internal val listOrganizationMembersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrganizationMembersGetResponse200JsonX65dd6b8f> =
      MediaTypeCodecRegistry.of(listOrganizationMembersResponseCodecAlternative0Codec)

  private val listOrganizationMembersResponseCodecAlternative1Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listOrganizationMembers.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val listOrganizationMembersResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listOrganizationMembersResponseCodecAlternative1Codec)

  private val listOrganizationMembersResponseCodecAlternative2Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("listOrganizationMembers.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  internal val listOrganizationMembersResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(listOrganizationMembersResponseCodecAlternative2Codec)

  private val listOrganizationMembersResponseCodecAlternative3Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listOrganizationMembers.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  internal val listOrganizationMembersResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listOrganizationMembersResponseCodecAlternative3Codec)

  internal val listOrganizationMembersRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listOrganizationMembersResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrganizationMembersGetResponse200JsonX65dd6b8f> =
      MediaTypeCodecRegistry.of(listOrganizationMembersResponseCodec)
}

/**
 * Client for the 'Organization' group of OpenRouter API.
 */
public class OrganizationClient(
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
      SdkExecutor(transport, authentication = this@OrganizationClient.authentication)

  /**
   * List all members of the organization associated with the authenticated management key. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options, including pagination bounds.
   * @return The first decoded page.
   */
  public suspend fun listOrganizationMembers(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Page<InlineOrganizationMembersGetResponse200JsonX65dd6b8f, InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724> {
    val engine = PaginationEngine<InlineOrganizationMembersGetResponse200JsonX65dd6b8f, InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724>(
          descriptor = requireNotNull(listOrganizationMembersMetadata.pagination as? PaginationDescriptor.OffsetLimit),
          operationId = listOrganizationMembersMetadata.operationId,
          requestedPageSize = limit,
          initialOffset = offset?.toLong() ?: 0L,
        )
    return engine.firstPage { pageRequest -> fetchlistOrganizationMembersPage(Unit, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }
  }

  /**
   * List all members of the organization associated with the authenticated management key. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param limit Maximum number of records to return (max 100)
   * @param offset Number of records to skip for pagination
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
  public suspend fun listOrganizationMembersWithResponse(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListOrganizationMembersResponse> = executor.executeWithResponse<Unit, ListOrganizationMembersResponse>(SdkExecutionRequest(listOrganizationMembersMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), OrganizationCodecs.listOrganizationMembersRequestCodecRegistry, ListOrganizationMembersResponseDecoder, options)

  /**
   * Returns a cold page flow for listOrganizationMembers.
   *
   * @param limit Maximum number of records to return (max 100)
   * @param offset Number of records to skip for pagination
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
  public fun listOrganizationMembersPages(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Flow<Page<InlineOrganizationMembersGetResponse200JsonX65dd6b8f, InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724>> = PaginationEngine<InlineOrganizationMembersGetResponse200JsonX65dd6b8f, InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724>(
    descriptor = requireNotNull(listOrganizationMembersMetadata.pagination as? PaginationDescriptor.OffsetLimit),
    operationId = listOrganizationMembersMetadata.operationId,
    requestedPageSize = limit,
    initialOffset = offset?.toLong() ?: 0L,
  ).pages(fetch = { pageRequest -> fetchlistOrganizationMembersPage(Unit, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }, pagination = options.pagination)

  /**
   * Returns a cold item flow for listOrganizationMembers.
   *
   * @param options Execution options, including pagination bounds.
   */
  public fun listOrganizationMembersItems(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Flow<InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724> = PaginationEngine<InlineOrganizationMembersGetResponse200JsonX65dd6b8f, InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724>(
    descriptor = requireNotNull(listOrganizationMembersMetadata.pagination as? PaginationDescriptor.OffsetLimit),
    operationId = listOrganizationMembersMetadata.operationId,
    requestedPageSize = limit,
    initialOffset = offset?.toLong() ?: 0L,
  ).items(fetch = { pageRequest -> fetchlistOrganizationMembersPage(Unit, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }, pagination = options.pagination)

  private fun metadataForListOrganizationMembersPage(
    pageRequest: PageRequest,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
  ): OperationMetadata = listOrganizationMembersMetadata

  private suspend fun fetchlistOrganizationMembersPage(
    request: Unit,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    pageRequest: PageRequest,
    options: CallOptions,
  ): PageEnvelope<InlineOrganizationMembersGetResponse200JsonX65dd6b8f, InlineOrganizationMembersGetResponse200JsonDataItemX43d6a724> {
    val pageRequestValue = when (pageRequest) {
      PageRequest.First -> request
      is PageRequest.NextCursor -> request
      is PageRequest.NextOffset -> request
      is PageRequest.NextPage -> request
      is PageRequest.NextUrl -> request
      is PageRequest.NextToken -> request
    }
    val pageMetadata = metadataForListOrganizationMembersPage(pageRequest, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle)
    val response = executor.execute<Unit, InlineOrganizationMembersGetResponse200JsonX65dd6b8f>(SdkExecutionRequest(pageMetadata, baseUri, pageRequestValue, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = when (pageRequest) {
        is PageRequest.NextOffset -> listOf(pageRequest.offset.toString())
        else -> offset?.let { listOf(it.toString()) }.orEmpty()
      }))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }), listOf(OrganizationCodecs.LISTORGANIZATIONMEMBERS_RESPONSE_CODEC_ID), OrganizationCodecs.listOrganizationMembersRequestCodecRegistry, OrganizationCodecs.listOrganizationMembersResponseCodecRegistry, options)
    return PageEnvelope(value = response, items = response.data.orEmpty())
  }

  /**
   * Decoded non-success response alternatives that `listOrganizationMembers` may expose through its typed API
   * exception.
   */
  public sealed interface ListOrganizationMembersError

  /**
   * Typed response alternatives for `listOrganizationMembers`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ListOrganizationMembersResponse {
    public class SuccessJson(
      public val json: InlineOrganizationMembersGetResponse200JsonX65dd6b8f,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListOrganizationMembersResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListOrganizationMembersResponse,
        ListOrganizationMembersError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListOrganizationMembersResponse,
        ListOrganizationMembersError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListOrganizationMembersResponse,
        ListOrganizationMembersError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListOrganizationMembersResponse
  }

  /**
   * Raised by `listOrganizationMembers` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ListOrganizationMembersApiException(
    public val error: ListOrganizationMembersError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listOrganizationMembers")

  private object ListOrganizationMembersResponseDecoder : SdkResponseAlternativeDecoder<ListOrganizationMembersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListOrganizationMembersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListOrganizationMembersResponse> = when {
      alternative.id == "listOrganizationMembers.response.alternative0" -> SdkResponseDecodeResult(
        value = ListOrganizationMembersResponse.SuccessJson(
          json = OrganizationCodecs.listOrganizationMembersResponseCodecAlternative0Registry.select(listOf("listOrganizationMembers.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listOrganizationMembers.response.alternative1" -> SdkResponseDecodeResult(
        value = ListOrganizationMembersResponse.Http401Json(
          json = OrganizationCodecs.listOrganizationMembersResponseCodecAlternative1Registry.select(listOf("listOrganizationMembers.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listOrganizationMembers.response.alternative2" -> SdkResponseDecodeResult(
        value = ListOrganizationMembersResponse.Http404Json(
          json = OrganizationCodecs.listOrganizationMembersResponseCodecAlternative2Registry.select(listOf("listOrganizationMembers.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listOrganizationMembers.response.alternative3" -> SdkResponseDecodeResult(
        value = ListOrganizationMembersResponse.Http500Json(
          json = OrganizationCodecs.listOrganizationMembersResponseCodecAlternative3Registry.select(listOf("listOrganizationMembers.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ListOrganizationMembersResponse = ListOrganizationMembersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val listOrganizationMembersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "listOrganizationMembers",
          method = "GET",
          path = "/organization/members",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrganizationMembersGetResponse200JsonX65dd6b8f",
              mode = SdkResponseMode.BUFFERED,
              id = "listOrganizationMembers.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listOrganizationMembers.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listOrganizationMembers.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listOrganizationMembers.response.alternative3",
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
  }
}
