package com.nabobery.sdkgen.generated.repos

import com.nabobery.sdkgen.generated.ErrorResponse
import com.nabobery.sdkgen.generated.Issue
import com.nabobery.sdkgen.generated.IssuePage
import com.nabobery.sdkgen.generated.SdkJson
import com.nabobery.sdkgen.generated.Widget
import com.nabobery.sdkgen.generated.WidgetPage
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
import com.nabobery.sdkgen.runtime.buildRequestUri
import com.nabobery.sdkgen.runtime.pagination.Page
import com.nabobery.sdkgen.runtime.pagination.PageEnvelope
import com.nabobery.sdkgen.runtime.pagination.PageRequest
import com.nabobery.sdkgen.runtime.pagination.PaginationEngine
import com.nabobery.sdkgen.runtime.pagination.splitResolvedUrl
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.coroutines.flow.Flow

internal object ReposCodecs {
  internal const val LISTISSUES_RESPONSE_CODEC_ID: String = "listIssues.response"

  private val listIssuesResponseCodec: MediaTypeCodec<IssuePage> =
      KotlinxSerializationCodec(LISTISSUES_RESPONSE_CODEC_ID, IssuePage.Serializer, SdkJson)

  private val listIssuesResponseCodecAlternative0Codec: MediaTypeCodec<IssuePage> =
      KotlinxSerializationCodec("listIssues.response.alternative0", IssuePage.Serializer, SdkJson)

  internal val listIssuesResponseCodecAlternative0Registry: MediaTypeCodecRegistry<IssuePage> =
      MediaTypeCodecRegistry.of(listIssuesResponseCodecAlternative0Codec)

  private val listIssuesResponseCodecAlternative1Codec: MediaTypeCodec<ErrorResponse> =
      KotlinxSerializationCodec("listIssues.response.alternative1", ErrorResponse.Serializer, SdkJson)

  internal val listIssuesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<ErrorResponse> =
      MediaTypeCodecRegistry.of(listIssuesResponseCodecAlternative1Codec)

  private val listIssuesResponseCodecAlternative2Codec: MediaTypeCodec<ErrorResponse> =
      KotlinxSerializationCodec("listIssues.response.alternative2", ErrorResponse.Serializer, SdkJson)

  internal val listIssuesResponseCodecAlternative2Registry: MediaTypeCodecRegistry<ErrorResponse> =
      MediaTypeCodecRegistry.of(listIssuesResponseCodecAlternative2Codec)

  internal val listIssuesRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listIssuesResponseCodecRegistry: MediaTypeCodecRegistry<IssuePage> =
      MediaTypeCodecRegistry.of(listIssuesResponseCodec)

  internal const val LISTWIDGETS_RESPONSE_CODEC_ID: String = "listWidgets.response"

  private val listWidgetsResponseCodec: MediaTypeCodec<WidgetPage> =
      KotlinxSerializationCodec(LISTWIDGETS_RESPONSE_CODEC_ID, WidgetPage.Serializer, SdkJson)

  private val listWidgetsResponseCodecAlternative0Codec: MediaTypeCodec<WidgetPage> =
      KotlinxSerializationCodec("listWidgets.response.alternative0", WidgetPage.Serializer, SdkJson)

  internal val listWidgetsResponseCodecAlternative0Registry: MediaTypeCodecRegistry<WidgetPage> =
      MediaTypeCodecRegistry.of(listWidgetsResponseCodecAlternative0Codec)

  private val listWidgetsResponseCodecAlternative1Codec: MediaTypeCodec<ErrorResponse> =
      KotlinxSerializationCodec("listWidgets.response.alternative1", ErrorResponse.Serializer, SdkJson)

  internal val listWidgetsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<ErrorResponse> =
      MediaTypeCodecRegistry.of(listWidgetsResponseCodecAlternative1Codec)

  internal val listWidgetsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listWidgetsResponseCodecRegistry: MediaTypeCodecRegistry<WidgetPage> =
      MediaTypeCodecRegistry.of(listWidgetsResponseCodec)
}

/**
 * Client for the 'repos' group of Pagination Fixture.
 */
public class ReposClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  private val contractSecuritySchemes: Map<String, SecurityScheme> = mapOf(
        "apiKey" to SecurityScheme.ApiKey(location = SecurityScheme.ApiKeyLocation.HEADER, parameterName = "Authorization"),
      )

  private val authentication: SdkAuthentication? = authentication ?: SecuritySchemeAuthentication(
        bindings =
          contractSecuritySchemes.mapNotNull { (schemeId, scheme) ->
            credentialProviders[schemeId]?.let { provider -> schemeId to SecuritySchemeBinding(scheme, provider) }
          }.toMap(),
        trustedHosts = trustedHosts ?: TrustedHosts.of(baseUri),
      )

  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@ReposClient.authentication)

  private val paginationTrustedHosts: TrustedHosts = trustedHosts ?: TrustedHosts.of(baseUri)

  /**
   * Lists issues for a repository, paginated via the Link response header.
   *
   * @param options Execution options, including pagination bounds.
   * @return The first decoded page.
   */
  public suspend fun listIssues(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Page<IssuePage, Issue> {
    val engine = PaginationEngine<IssuePage, Issue>(
          descriptor = requireNotNull(listIssuesMetadata.pagination as? PaginationDescriptor.HeaderNextUrl),
          operationId = listIssuesMetadata.operationId,
          trustedHosts = paginationTrustedHosts,
        )
    return engine.firstPage { pageRequest -> fetchlistIssuesPage(Unit, owner, repo, pageRequest, options) }
  }

  /**
   * Lists issues for a repository, paginated via the Link response header.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner Wire parameter `owner`.
   * @param repo Wire parameter `repo`.
   * @param options Execution options.
   */
  public suspend fun listIssuesWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListIssuesResponse> = executor.executeWithResponse<Unit, ListIssuesResponse>(SdkExecutionRequest(listIssuesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ReposCodecs.listIssuesRequestCodecRegistry, ListIssuesResponseDecoder, options)

  /**
   * Returns a cold page flow for listIssues.
   *
   * @param owner Wire parameter `owner`.
   * @param repo Wire parameter `repo`.
   * @param options Execution options, including pagination bounds.
   */
  public fun listIssuesPages(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Flow<Page<IssuePage, Issue>> = PaginationEngine<IssuePage, Issue>(
    descriptor = requireNotNull(listIssuesMetadata.pagination as? PaginationDescriptor.HeaderNextUrl),
    operationId = listIssuesMetadata.operationId,
    trustedHosts = paginationTrustedHosts,
  ).pages(fetch = { pageRequest -> fetchlistIssuesPage(Unit, owner, repo, pageRequest, options) }, pagination = options.pagination)

  /**
   * Returns a cold item flow for listIssues.
   *
   * @param options Execution options, including pagination bounds.
   */
  public fun listIssuesItems(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Flow<Issue> = PaginationEngine<IssuePage, Issue>(
    descriptor = requireNotNull(listIssuesMetadata.pagination as? PaginationDescriptor.HeaderNextUrl),
    operationId = listIssuesMetadata.operationId,
    trustedHosts = paginationTrustedHosts,
  ).items(fetch = { pageRequest -> fetchlistIssuesPage(Unit, owner, repo, pageRequest, options) }, pagination = options.pagination)

  private fun metadataForListIssuesPage(
    pageRequest: PageRequest,
    owner: String,
    repo: String,
  ): OperationMetadata = listIssuesMetadata

  private suspend fun fetchlistIssuesPage(
    request: Unit,
    owner: String,
    repo: String,
    pageRequest: PageRequest,
    options: CallOptions,
  ): PageEnvelope<IssuePage, Issue> {
    val pageRequestValue = when (pageRequest) {
      PageRequest.First -> request
      is PageRequest.NextCursor -> request
      is PageRequest.NextOffset -> request
      is PageRequest.NextPage -> request
      is PageRequest.NextUrl -> request
      is PageRequest.NextToken -> request
    }
    val pageMetadata = metadataForListIssuesPage(pageRequest, owner, repo)
    val effectiveBaseUri = when (pageRequest) {
      is PageRequest.NextUrl -> splitResolvedUrl(pageRequest.url).first
      else -> baseUri
    }
    val effectivePath = when (pageRequest) {
      is PageRequest.NextUrl -> splitResolvedUrl(pageRequest.url).second
      else -> pageMetadata.path
    }
    val effectiveParameters = when (pageRequest) {
      is PageRequest.NextUrl -> emptyList()
      else -> buildList {
        add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
        add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      }
    }
    val response = executor.executeWithHeaders<Unit, IssuePage>(
      SdkExecutionRequest(pageMetadata.copy(path = effectivePath), effectiveBaseUri, pageRequestValue, emptyList(), effectiveParameters),
      listOf(ReposCodecs.LISTISSUES_RESPONSE_CODEC_ID),
      ReposCodecs.listIssuesRequestCodecRegistry,
      ReposCodecs.listIssuesResponseCodecRegistry,
      options,
    )
    val requestUri = buildRequestUri(effectiveBaseUri, effectivePath, effectiveParameters)
    return PageEnvelope(
      value = response.value,
      items = response.value.items.orEmpty(),
      responseHeaders = response.headers,
      requestUri = requestUri,
    )
  }

  /**
   * Lists widgets, paginated via numeric offset/limit query parameters.
   *
   * @param options Execution options, including pagination bounds.
   * @return The first decoded page.
   */
  public suspend fun listWidgets(
    kind: String? = null,
    limit: Int? = null,
    offset: Int? = null,
    options: CallOptions = CallOptions(),
  ): Page<WidgetPage, Widget> {
    val engine = PaginationEngine<WidgetPage, Widget>(
          descriptor = requireNotNull(listWidgetsMetadata.pagination as? PaginationDescriptor.OffsetLimit),
          operationId = listWidgetsMetadata.operationId,
          requestedPageSize = limit,
          initialOffset = offset?.toLong() ?: 0L,
        )
    return engine.firstPage { pageRequest -> fetchlistWidgetsPage(Unit, kind, limit, offset, pageRequest, options) }
  }

  /**
   * Lists widgets, paginated via numeric offset/limit query parameters.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param kind Wire parameter `kind`.
   * @param limit Wire parameter `limit`.
   * @param offset Wire parameter `offset`.
   * @param options Execution options.
   */
  public suspend fun listWidgetsWithResponse(
    kind: String? = null,
    limit: Int? = null,
    offset: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListWidgetsResponse> = executor.executeWithResponse<Unit, ListWidgetsResponse>(SdkExecutionRequest(listWidgetsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "kind", values = kind?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
  }), ReposCodecs.listWidgetsRequestCodecRegistry, ListWidgetsResponseDecoder, options)

  /**
   * Returns a cold page flow for listWidgets.
   *
   * @param kind Wire parameter `kind`.
   * @param limit Wire parameter `limit`.
   * @param offset Wire parameter `offset`.
   * @param options Execution options, including pagination bounds.
   */
  public fun listWidgetsPages(
    kind: String? = null,
    limit: Int? = null,
    offset: Int? = null,
    options: CallOptions = CallOptions(),
  ): Flow<Page<WidgetPage, Widget>> = PaginationEngine<WidgetPage, Widget>(
    descriptor = requireNotNull(listWidgetsMetadata.pagination as? PaginationDescriptor.OffsetLimit),
    operationId = listWidgetsMetadata.operationId,
    requestedPageSize = limit,
    initialOffset = offset?.toLong() ?: 0L,
  ).pages(fetch = { pageRequest -> fetchlistWidgetsPage(Unit, kind, limit, offset, pageRequest, options) }, pagination = options.pagination)

  /**
   * Returns a cold item flow for listWidgets.
   *
   * @param options Execution options, including pagination bounds.
   */
  public fun listWidgetsItems(
    kind: String? = null,
    limit: Int? = null,
    offset: Int? = null,
    options: CallOptions = CallOptions(),
  ): Flow<Widget> = PaginationEngine<WidgetPage, Widget>(
    descriptor = requireNotNull(listWidgetsMetadata.pagination as? PaginationDescriptor.OffsetLimit),
    operationId = listWidgetsMetadata.operationId,
    requestedPageSize = limit,
    initialOffset = offset?.toLong() ?: 0L,
  ).items(fetch = { pageRequest -> fetchlistWidgetsPage(Unit, kind, limit, offset, pageRequest, options) }, pagination = options.pagination)

  private fun metadataForListWidgetsPage(
    pageRequest: PageRequest,
    kind: String? = null,
    limit: Int? = null,
    offset: Int? = null,
  ): OperationMetadata = listWidgetsMetadata

  private suspend fun fetchlistWidgetsPage(
    request: Unit,
    kind: String? = null,
    limit: Int? = null,
    offset: Int? = null,
    pageRequest: PageRequest,
    options: CallOptions,
  ): PageEnvelope<WidgetPage, Widget> {
    val pageRequestValue = when (pageRequest) {
      PageRequest.First -> request
      is PageRequest.NextCursor -> request
      is PageRequest.NextOffset -> request
      is PageRequest.NextPage -> request
      is PageRequest.NextUrl -> request
      is PageRequest.NextToken -> request
    }
    val pageMetadata = metadataForListWidgetsPage(pageRequest, kind, limit, offset)
    val response = executor.execute<Unit, WidgetPage>(SdkExecutionRequest(pageMetadata, baseUri, pageRequestValue, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "kind", values = kind?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = when (pageRequest) {
        is PageRequest.NextOffset -> listOf(pageRequest.offset.toString())
        else -> offset?.let { listOf(it.toString()) }.orEmpty()
      }))
    }), listOf(ReposCodecs.LISTWIDGETS_RESPONSE_CODEC_ID), ReposCodecs.listWidgetsRequestCodecRegistry, ReposCodecs.listWidgetsResponseCodecRegistry, options)
    return PageEnvelope(value = response, items = response.data.orEmpty(), totalCount = response.total?.toLong())
  }

  /**
   * Decoded non-success response alternatives that `listIssues` may expose through its typed API exception.
   */
  public sealed interface ListIssuesError

  /**
   * Typed response alternatives for `listIssues`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ListIssuesResponse {
    public class SuccessJson(
      public val json: IssuePage,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListIssuesResponse

    public class Http401Json(
      public val json: ErrorResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListIssuesResponse,
        ListIssuesError

    public class Http500Json(
      public val json: ErrorResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListIssuesResponse,
        ListIssuesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListIssuesResponse
  }

  /**
   * Raised by `listIssues` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class ListIssuesApiException(
    public val error: ListIssuesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listIssues")

  private object ListIssuesResponseDecoder : SdkResponseAlternativeDecoder<ListIssuesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListIssuesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListIssuesResponse> = when {
      alternative.id == "listIssues.response.alternative0" -> SdkResponseDecodeResult(
        value = ListIssuesResponse.SuccessJson(
          json = ReposCodecs.listIssuesResponseCodecAlternative0Registry.select(listOf("listIssues.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listIssues.response.alternative1" -> SdkResponseDecodeResult(
        value = ListIssuesResponse.Http401Json(
          json = ReposCodecs.listIssuesResponseCodecAlternative1Registry.select(listOf("listIssues.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listIssues.response.alternative2" -> SdkResponseDecodeResult(
        value = ListIssuesResponse.Http500Json(
          json = ReposCodecs.listIssuesResponseCodecAlternative2Registry.select(listOf("listIssues.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ListIssuesResponse = ListIssuesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `listWidgets` may expose through its typed API exception.
   */
  public sealed interface ListWidgetsError

  /**
   * Typed response alternatives for `listWidgets`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ListWidgetsResponse {
    public class SuccessJson(
      public val json: WidgetPage,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListWidgetsResponse

    public class Http401Json(
      public val json: ErrorResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListWidgetsResponse,
        ListWidgetsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListWidgetsResponse
  }

  /**
   * Raised by `listWidgets` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class ListWidgetsApiException(
    public val error: ListWidgetsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listWidgets")

  private object ListWidgetsResponseDecoder : SdkResponseAlternativeDecoder<ListWidgetsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListWidgetsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListWidgetsResponse> = when {
      alternative.id == "listWidgets.response.alternative0" -> SdkResponseDecodeResult(
        value = ListWidgetsResponse.SuccessJson(
          json = ReposCodecs.listWidgetsResponseCodecAlternative0Registry.select(listOf("listWidgets.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listWidgets.response.alternative1" -> SdkResponseDecodeResult(
        value = ListWidgetsResponse.Http401Json(
          json = ReposCodecs.listWidgetsResponseCodecAlternative1Registry.select(listOf("listWidgets.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ListWidgetsResponse = ListWidgetsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val listIssuesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "listIssues",
          method = "GET",
          path = "/repos/{owner}/{repo}/issues",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssuePage",
              mode = SdkResponseMode.BUFFERED,
              id = "listIssues.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "ErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listIssues.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "ErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listIssues.response.alternative2",
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
          pagination = PaginationDescriptor.HeaderNextUrl(responseItemsPath = PropertyPath("items")),
          streaming = null,
        ) }

    internal val listWidgetsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "listWidgets",
          method = "GET",
          path = "/repos/widgets",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "WidgetPage",
              mode = SdkResponseMode.BUFFERED,
              id = "listWidgets.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "ErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listWidgets.response.alternative1",
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
          pagination = PaginationDescriptor.OffsetLimit(requestOffsetParam = "offset", requestLimitParam = "limit", responseItemsPath = PropertyPath("data"), responseTotalPath = PropertyPath("total")),
          streaming = null,
        ) }
  }
}
