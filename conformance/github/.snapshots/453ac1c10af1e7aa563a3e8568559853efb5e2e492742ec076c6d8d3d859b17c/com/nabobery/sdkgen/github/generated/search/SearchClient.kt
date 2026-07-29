package com.nabobery.sdkgen.github.generated.search

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.CodeSearchResultItem
import com.nabobery.sdkgen.github.generated.InlineOrderParameterXdbee056c
import com.nabobery.sdkgen.github.generated.InlineSearchCodeGetParameterX2eed72ad
import com.nabobery.sdkgen.github.generated.InlineSearchCodeGetParameterX80cd8ae0
import com.nabobery.sdkgen.github.generated.InlineSearchCodeGetResponse200JsonXb9c4f78c
import com.nabobery.sdkgen.github.generated.InlineSearchCommitsGetParameterX2e3bce45
import com.nabobery.sdkgen.github.generated.InlineSearchCommitsGetResponse200JsonX5c0af761
import com.nabobery.sdkgen.github.generated.InlineSearchIssuesGetParameterXb2138b73
import com.nabobery.sdkgen.github.generated.InlineSearchIssuesGetResponse200JsonX88eab09b
import com.nabobery.sdkgen.github.generated.InlineSearchLabelsGetParameterXcd7e463a
import com.nabobery.sdkgen.github.generated.InlineSearchLabelsGetResponse200JsonXbfd7ef5a
import com.nabobery.sdkgen.github.generated.InlineSearchRepositoriesGetParameterXfdb394e6
import com.nabobery.sdkgen.github.generated.InlineSearchRepositoriesGetResponse200JsonX6b104402
import com.nabobery.sdkgen.github.generated.InlineSearchTopicsGetResponse200JsonX9098be1f
import com.nabobery.sdkgen.github.generated.InlineSearchTypeParameterXd3ea51fa
import com.nabobery.sdkgen.github.generated.InlineSearchUsersGetParameterXb95f88ed
import com.nabobery.sdkgen.github.generated.InlineSearchUsersGetResponse200JsonXde96f739
import com.nabobery.sdkgen.github.generated.InlineServiceUnavailableResponseJsonX4cf316d5
import com.nabobery.sdkgen.github.generated.SdkJson
import com.nabobery.sdkgen.github.generated.ValidationError
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

public object SearchCodecs {
  public const val SEARCHCODE_RESPONSE_CODEC_ID: String = "search/code.response"

  private val searchCodeResponseCodec: MediaTypeCodec<InlineSearchCodeGetResponse200JsonXb9c4f78c> =
      KotlinxSerializationCodec(SEARCHCODE_RESPONSE_CODEC_ID, InlineSearchCodeGetResponse200JsonXb9c4f78c.Serializer, SdkJson)

  private val searchCodeResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineSearchCodeGetResponse200JsonXb9c4f78c> =
      KotlinxSerializationCodec("search/code.response.alternative0", InlineSearchCodeGetResponse200JsonXb9c4f78c.Serializer, SdkJson)

  public val searchCodeResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineSearchCodeGetResponse200JsonXb9c4f78c> =
      MediaTypeCodecRegistry.of(searchCodeResponseCodecAlternative0Codec)

  private val searchCodeResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("search/code.response.alternative2", BasicError.Serializer, SdkJson)

  public val searchCodeResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(searchCodeResponseCodecAlternative2Codec)

  private val searchCodeResponseCodecAlternative3Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("search/code.response.alternative3", ValidationError.Serializer, SdkJson)

  public val searchCodeResponseCodecAlternative3Registry: MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(searchCodeResponseCodecAlternative3Codec)

  private val searchCodeResponseCodecAlternative4Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("search/code.response.alternative4", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val searchCodeResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(searchCodeResponseCodecAlternative4Codec)

  public val searchCodeRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val searchCodeResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineSearchCodeGetResponse200JsonXb9c4f78c> =
      MediaTypeCodecRegistry.of(searchCodeResponseCodec)

  public const val SEARCHCOMMITS_RESPONSE_CODEC_ID: String = "search/commits.response"

  private val searchCommitsResponseCodec:
      MediaTypeCodec<InlineSearchCommitsGetResponse200JsonX5c0af761> =
      KotlinxSerializationCodec(SEARCHCOMMITS_RESPONSE_CODEC_ID, InlineSearchCommitsGetResponse200JsonX5c0af761.Serializer, SdkJson)

  private val searchCommitsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineSearchCommitsGetResponse200JsonX5c0af761> =
      KotlinxSerializationCodec("search/commits.response.alternative0", InlineSearchCommitsGetResponse200JsonX5c0af761.Serializer, SdkJson)

  public val searchCommitsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineSearchCommitsGetResponse200JsonX5c0af761> =
      MediaTypeCodecRegistry.of(searchCommitsResponseCodecAlternative0Codec)

  public val searchCommitsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val searchCommitsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineSearchCommitsGetResponse200JsonX5c0af761> =
      MediaTypeCodecRegistry.of(searchCommitsResponseCodec)

  public const val SEARCHISSUESANDPULLREQUESTS_RESPONSE_CODEC_ID: String =
      "search/issues-and-pull-requests.response"

  private val searchIssuesAndPullRequestsResponseCodec:
      MediaTypeCodec<InlineSearchIssuesGetResponse200JsonX88eab09b> =
      KotlinxSerializationCodec(SEARCHISSUESANDPULLREQUESTS_RESPONSE_CODEC_ID, InlineSearchIssuesGetResponse200JsonX88eab09b.Serializer, SdkJson)

  private val searchIssuesAndPullRequestsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineSearchIssuesGetResponse200JsonX88eab09b> =
      KotlinxSerializationCodec("search/issues-and-pull-requests.response.alternative0", InlineSearchIssuesGetResponse200JsonX88eab09b.Serializer, SdkJson)

  public val searchIssuesAndPullRequestsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineSearchIssuesGetResponse200JsonX88eab09b> =
      MediaTypeCodecRegistry.of(searchIssuesAndPullRequestsResponseCodecAlternative0Codec)

  private val searchIssuesAndPullRequestsResponseCodecAlternative2Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("search/issues-and-pull-requests.response.alternative2", BasicError.Serializer, SdkJson)

  public val searchIssuesAndPullRequestsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(searchIssuesAndPullRequestsResponseCodecAlternative2Codec)

  private val searchIssuesAndPullRequestsResponseCodecAlternative3Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("search/issues-and-pull-requests.response.alternative3", BasicError.Serializer, SdkJson)

  public val searchIssuesAndPullRequestsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(searchIssuesAndPullRequestsResponseCodecAlternative3Codec)

  private val searchIssuesAndPullRequestsResponseCodecAlternative4Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("search/issues-and-pull-requests.response.alternative4", ValidationError.Serializer, SdkJson)

  public val searchIssuesAndPullRequestsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(searchIssuesAndPullRequestsResponseCodecAlternative4Codec)

  private val searchIssuesAndPullRequestsResponseCodecAlternative5Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("search/issues-and-pull-requests.response.alternative5", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val searchIssuesAndPullRequestsResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(searchIssuesAndPullRequestsResponseCodecAlternative5Codec)

  public val searchIssuesAndPullRequestsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val searchIssuesAndPullRequestsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineSearchIssuesGetResponse200JsonX88eab09b> =
      MediaTypeCodecRegistry.of(searchIssuesAndPullRequestsResponseCodec)

  public const val SEARCHLABELS_RESPONSE_CODEC_ID: String = "search/labels.response"

  private val searchLabelsResponseCodec:
      MediaTypeCodec<InlineSearchLabelsGetResponse200JsonXbfd7ef5a> =
      KotlinxSerializationCodec(SEARCHLABELS_RESPONSE_CODEC_ID, InlineSearchLabelsGetResponse200JsonXbfd7ef5a.Serializer, SdkJson)

  private val searchLabelsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineSearchLabelsGetResponse200JsonXbfd7ef5a> =
      KotlinxSerializationCodec("search/labels.response.alternative0", InlineSearchLabelsGetResponse200JsonXbfd7ef5a.Serializer, SdkJson)

  public val searchLabelsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineSearchLabelsGetResponse200JsonXbfd7ef5a> =
      MediaTypeCodecRegistry.of(searchLabelsResponseCodecAlternative0Codec)

  private val searchLabelsResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("search/labels.response.alternative2", BasicError.Serializer, SdkJson)

  public val searchLabelsResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(searchLabelsResponseCodecAlternative2Codec)

  private val searchLabelsResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("search/labels.response.alternative3", BasicError.Serializer, SdkJson)

  public val searchLabelsResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(searchLabelsResponseCodecAlternative3Codec)

  private val searchLabelsResponseCodecAlternative4Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("search/labels.response.alternative4", ValidationError.Serializer, SdkJson)

  public val searchLabelsResponseCodecAlternative4Registry: MediaTypeCodecRegistry<ValidationError>
      = MediaTypeCodecRegistry.of(searchLabelsResponseCodecAlternative4Codec)

  public val searchLabelsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val searchLabelsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineSearchLabelsGetResponse200JsonXbfd7ef5a> =
      MediaTypeCodecRegistry.of(searchLabelsResponseCodec)

  public const val SEARCHREPOS_RESPONSE_CODEC_ID: String = "search/repos.response"

  private val searchReposResponseCodec:
      MediaTypeCodec<InlineSearchRepositoriesGetResponse200JsonX6b104402> =
      KotlinxSerializationCodec(SEARCHREPOS_RESPONSE_CODEC_ID, InlineSearchRepositoriesGetResponse200JsonX6b104402.Serializer, SdkJson)

  private val searchReposResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineSearchRepositoriesGetResponse200JsonX6b104402> =
      KotlinxSerializationCodec("search/repos.response.alternative0", InlineSearchRepositoriesGetResponse200JsonX6b104402.Serializer, SdkJson)

  public val searchReposResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineSearchRepositoriesGetResponse200JsonX6b104402> =
      MediaTypeCodecRegistry.of(searchReposResponseCodecAlternative0Codec)

  private val searchReposResponseCodecAlternative2Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("search/repos.response.alternative2", ValidationError.Serializer, SdkJson)

  public val searchReposResponseCodecAlternative2Registry: MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(searchReposResponseCodecAlternative2Codec)

  private val searchReposResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("search/repos.response.alternative3", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val searchReposResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(searchReposResponseCodecAlternative3Codec)

  public val searchReposRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val searchReposResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineSearchRepositoriesGetResponse200JsonX6b104402> =
      MediaTypeCodecRegistry.of(searchReposResponseCodec)

  public const val SEARCHTOPICS_RESPONSE_CODEC_ID: String = "search/topics.response"

  private val searchTopicsResponseCodec:
      MediaTypeCodec<InlineSearchTopicsGetResponse200JsonX9098be1f> =
      KotlinxSerializationCodec(SEARCHTOPICS_RESPONSE_CODEC_ID, InlineSearchTopicsGetResponse200JsonX9098be1f.Serializer, SdkJson)

  private val searchTopicsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineSearchTopicsGetResponse200JsonX9098be1f> =
      KotlinxSerializationCodec("search/topics.response.alternative0", InlineSearchTopicsGetResponse200JsonX9098be1f.Serializer, SdkJson)

  public val searchTopicsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineSearchTopicsGetResponse200JsonX9098be1f> =
      MediaTypeCodecRegistry.of(searchTopicsResponseCodecAlternative0Codec)

  public val searchTopicsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val searchTopicsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineSearchTopicsGetResponse200JsonX9098be1f> =
      MediaTypeCodecRegistry.of(searchTopicsResponseCodec)

  public const val SEARCHUSERS_RESPONSE_CODEC_ID: String = "search/users.response"

  private val searchUsersResponseCodec: MediaTypeCodec<InlineSearchUsersGetResponse200JsonXde96f739>
      =
      KotlinxSerializationCodec(SEARCHUSERS_RESPONSE_CODEC_ID, InlineSearchUsersGetResponse200JsonXde96f739.Serializer, SdkJson)

  private val searchUsersResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineSearchUsersGetResponse200JsonXde96f739> =
      KotlinxSerializationCodec("search/users.response.alternative0", InlineSearchUsersGetResponse200JsonXde96f739.Serializer, SdkJson)

  public val searchUsersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineSearchUsersGetResponse200JsonXde96f739> =
      MediaTypeCodecRegistry.of(searchUsersResponseCodecAlternative0Codec)

  private val searchUsersResponseCodecAlternative2Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("search/users.response.alternative2", ValidationError.Serializer, SdkJson)

  public val searchUsersResponseCodecAlternative2Registry: MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(searchUsersResponseCodecAlternative2Codec)

  private val searchUsersResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("search/users.response.alternative3", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val searchUsersResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(searchUsersResponseCodecAlternative3Codec)

  public val searchUsersRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val searchUsersResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineSearchUsersGetResponse200JsonXde96f739> =
      MediaTypeCodecRegistry.of(searchUsersResponseCodec)
}

/**
 * Client for the 'search' group of GitHub v3 REST API.
 */
public class SearchClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  private val contractSecuritySchemes: Map<String, SecurityScheme> = mapOf(
        "githubBearer" to SecurityScheme.HttpBearer(),
      )

  private val authentication: SdkAuthentication? = authentication ?: SecuritySchemeAuthentication(
        bindings =
          contractSecuritySchemes.mapNotNull { (schemeId, scheme) ->
            credentialProviders[schemeId]?.let { provider -> schemeId to SecuritySchemeBinding(scheme, provider) }
          }.toMap(),
        trustedHosts = trustedHosts ?: TrustedHosts.of(baseUri),
      )

  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@SearchClient.authentication)

  private val paginationTrustedHosts: TrustedHosts = trustedHosts ?: TrustedHosts.of(baseUri)

  /**
   * Searches for query terms inside of a file. This method returns up to 100 results [per
   * page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).
   *
   * When searching for code, you can get text match metadata for the file **content** and file **path** fields when you
   * pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text match
   * metadata](https://docs.github.com/rest/search/search#text-match-metadata).
   *
   * For example, if you want to find the definition of the `addClass` function inside
   * [jQuery](https://github.com/jquery/jquery) repository, your query would look something like this:
   *
   * `q=addClass+in:file+language:js+repo:jquery/jquery`
   *
   * This query searches for the keyword `addClass` within a file's contents. The query limits the search to files where
   * the language is JavaScript in the `jquery/jquery` repository.
   *
   * Considerations for code search:
   *
   * Due to the complexity of searching code, there are a few restrictions on how searches are performed:
   *
   * *   Only the _default branch_ is considered. In most cases, this will be the `master` branch.
   * *   Only files smaller than 384 KB are searchable.
   * *   You must always include at least one search term when searching source code. For example, searching for
   * [`language:go`](https://github.com/search?utf8=%E2%9C%93&q=language%3Ago&type=Code) is not valid, while [`amazing
   * language:go`](https://github.com/search?utf8=%E2%9C%93&q=amazing+language%3Ago&type=Code) is.
   *
   * > [!NOTE]
   * > `repository.description`, `repository.owner.type`, and `repository.owner.node_id` are closing down on this
   * endpoint and will return `null` in a future API version. Use the [Get a
   * repository](https://docs.github.com/rest/repos/repos#get-a-repository) endpoint (`GET /repos/{owner}/{repo}`) to
   * retrieve full repository metadata.
   *
   * This endpoint requires you to authenticate and limits you to 10 requests per minute.
   *
   * @param options Execution options, including pagination bounds.
   * @return The first decoded page.
   */
  public suspend fun searchCode(
    order: InlineSearchCodeGetParameterX2eed72ad? = null,
    page: Int? = null,
    perPage: Int? = null,
    q: String,
    sort: InlineSearchCodeGetParameterX80cd8ae0? = null,
    options: CallOptions = CallOptions(),
  ): Page<InlineSearchCodeGetResponse200JsonXb9c4f78c, CodeSearchResultItem> {
    val engine = PaginationEngine<InlineSearchCodeGetResponse200JsonXb9c4f78c, CodeSearchResultItem>(
          descriptor = requireNotNull(searchCodeMetadata.pagination as? PaginationDescriptor.HeaderNextUrl),
          operationId = searchCodeMetadata.operationId,
          trustedHosts = paginationTrustedHosts,
        )
    return engine.firstPage { pageRequest -> fetchsearchCodePage(Unit, order, page, perPage, q, sort, pageRequest, options) }
  }

  /**
   * Searches for query terms inside of a file. This method returns up to 100 results [per
   * page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).
   *
   * When searching for code, you can get text match metadata for the file **content** and file **path** fields when you
   * pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text match
   * metadata](https://docs.github.com/rest/search/search#text-match-metadata).
   *
   * For example, if you want to find the definition of the `addClass` function inside
   * [jQuery](https://github.com/jquery/jquery) repository, your query would look something like this:
   *
   * `q=addClass+in:file+language:js+repo:jquery/jquery`
   *
   * This query searches for the keyword `addClass` within a file's contents. The query limits the search to files where
   * the language is JavaScript in the `jquery/jquery` repository.
   *
   * Considerations for code search:
   *
   * Due to the complexity of searching code, there are a few restrictions on how searches are performed:
   *
   * *   Only the _default branch_ is considered. In most cases, this will be the `master` branch.
   * *   Only files smaller than 384 KB are searchable.
   * *   You must always include at least one search term when searching source code. For example, searching for
   * [`language:go`](https://github.com/search?utf8=%E2%9C%93&q=language%3Ago&type=Code) is not valid, while [`amazing
   * language:go`](https://github.com/search?utf8=%E2%9C%93&q=amazing+language%3Ago&type=Code) is.
   *
   * > [!NOTE]
   * > `repository.description`, `repository.owner.type`, and `repository.owner.node_id` are closing down on this
   * endpoint and will return `null` in a future API version. Use the [Get a
   * repository](https://docs.github.com/rest/repos/repos#get-a-repository) endpoint (`GET /repos/{owner}/{repo}`) to
   * retrieve full repository metadata.
   *
   * This endpoint requires you to authenticate and limits you to 10 requests per minute.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param order **This field is closing down.** Determines whether the first search result returned is the highest
   * number of matches (`desc`) or lowest number of matches (`asc`). This parameter is ignored unless you provide
   * `sort`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search
   * to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn
   * more about the format of the query, see [Constructing a search
   * query](https://docs.github.com/rest/search/search#constructing-a-search-query). See "[Searching
   * code](https://docs.github.com/search-github/searching-on-github/searching-code)" for a detailed list of qualifiers.
   * @param sort **This field is closing down.** Sorts the results of your query. Can only be `indexed`, which indicates
   * how recently a file has been indexed by the GitHub search infrastructure. Default: [best
   * match](https://docs.github.com/rest/search/search#ranking-search-results)
   * @param options Execution options.
   */
  public suspend fun searchCodeWithResponse(
    order: InlineSearchCodeGetParameterX2eed72ad? = null,
    page: Int? = null,
    perPage: Int? = null,
    q: String,
    sort: InlineSearchCodeGetParameterX80cd8ae0? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SearchCodeResponse> = executor.executeWithResponse<Unit, SearchCodeResponse>(SdkExecutionRequest(searchCodeMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "order", values = order?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = listOf(q.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
  }), SearchCodecs.searchCodeRequestCodecRegistry, SearchCodeResponseDecoder, options)

  /**
   * Returns a cold page flow for search/code.
   *
   * @param order **This field is closing down.** Determines whether the first search result returned is the highest
   * number of matches (`desc`) or lowest number of matches (`asc`). This parameter is ignored unless you provide
   * `sort`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search
   * to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn
   * more about the format of the query, see [Constructing a search
   * query](https://docs.github.com/rest/search/search#constructing-a-search-query). See "[Searching
   * code](https://docs.github.com/search-github/searching-on-github/searching-code)" for a detailed list of qualifiers.
   * @param sort **This field is closing down.** Sorts the results of your query. Can only be `indexed`, which indicates
   * how recently a file has been indexed by the GitHub search infrastructure. Default: [best
   * match](https://docs.github.com/rest/search/search#ranking-search-results)
   * @param options Execution options, including pagination bounds.
   */
  public fun searchCodePages(
    order: InlineSearchCodeGetParameterX2eed72ad? = null,
    page: Int? = null,
    perPage: Int? = null,
    q: String,
    sort: InlineSearchCodeGetParameterX80cd8ae0? = null,
    options: CallOptions = CallOptions(),
  ): Flow<Page<InlineSearchCodeGetResponse200JsonXb9c4f78c, CodeSearchResultItem>> = PaginationEngine<InlineSearchCodeGetResponse200JsonXb9c4f78c, CodeSearchResultItem>(
    descriptor = requireNotNull(searchCodeMetadata.pagination as? PaginationDescriptor.HeaderNextUrl),
    operationId = searchCodeMetadata.operationId,
    trustedHosts = paginationTrustedHosts,
  ).pages(fetch = { pageRequest -> fetchsearchCodePage(Unit, order, page, perPage, q, sort, pageRequest, options) }, pagination = options.pagination)

  /**
   * Returns a cold item flow for search/code.
   *
   * @param options Execution options, including pagination bounds.
   */
  public fun searchCodeItems(
    order: InlineSearchCodeGetParameterX2eed72ad? = null,
    page: Int? = null,
    perPage: Int? = null,
    q: String,
    sort: InlineSearchCodeGetParameterX80cd8ae0? = null,
    options: CallOptions = CallOptions(),
  ): Flow<CodeSearchResultItem> = PaginationEngine<InlineSearchCodeGetResponse200JsonXb9c4f78c, CodeSearchResultItem>(
    descriptor = requireNotNull(searchCodeMetadata.pagination as? PaginationDescriptor.HeaderNextUrl),
    operationId = searchCodeMetadata.operationId,
    trustedHosts = paginationTrustedHosts,
  ).items(fetch = { pageRequest -> fetchsearchCodePage(Unit, order, page, perPage, q, sort, pageRequest, options) }, pagination = options.pagination)

  private fun metadataForSearchCodePage(
    pageRequest: PageRequest,
    order: InlineSearchCodeGetParameterX2eed72ad? = null,
    page: Int? = null,
    perPage: Int? = null,
    q: String,
    sort: InlineSearchCodeGetParameterX80cd8ae0? = null,
  ): OperationMetadata = searchCodeMetadata

  private suspend fun fetchsearchCodePage(
    request: Unit,
    order: InlineSearchCodeGetParameterX2eed72ad? = null,
    page: Int? = null,
    perPage: Int? = null,
    q: String,
    sort: InlineSearchCodeGetParameterX80cd8ae0? = null,
    pageRequest: PageRequest,
    options: CallOptions,
  ): PageEnvelope<InlineSearchCodeGetResponse200JsonXb9c4f78c, CodeSearchResultItem> {
    val pageRequestValue = when (pageRequest) {
      PageRequest.First -> request
      is PageRequest.NextCursor -> request
      is PageRequest.NextOffset -> request
      is PageRequest.NextPage -> request
      is PageRequest.NextUrl -> request
      is PageRequest.NextToken -> request
    }
    val pageMetadata = metadataForSearchCodePage(pageRequest, order, page, perPage, q, sort)
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
        add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "order", values = order?.let { listOf(it.toString()) }.orEmpty()))
        add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
        add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
        add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = listOf(q.toString())))
        add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      }
    }
    val response = executor.executeWithHeaders<Unit, InlineSearchCodeGetResponse200JsonXb9c4f78c>(
      SdkExecutionRequest(pageMetadata.copy(path = effectivePath), effectiveBaseUri, pageRequestValue, emptyList(), effectiveParameters),
      listOf(SearchCodecs.SEARCHCODE_RESPONSE_CODEC_ID),
      SearchCodecs.searchCodeRequestCodecRegistry,
      SearchCodecs.searchCodeResponseCodecRegistry,
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
   * Find commits via various criteria on the default branch (usually `main`). This method returns up to 100 results
   * [per page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).
   *
   * When searching for commits, you can get text match metadata for the **message** field when you provide the
   * `text-match` media type. For more details about how to receive highlighted search results, see [Text match
   * metadata](https://docs.github.com/rest/search/search#text-match-metadata).
   *
   * For example, if you want to find commits related to CSS in the
   * [octocat/Spoon-Knife](https://github.com/octocat/Spoon-Knife) repository. Your query would look something like
   * this:
   *
   * `q=repo:octocat/Spoon-Knife+css`
   *
   * @param order Determines whether the first search result returned is the highest number of matches (`desc`) or
   * lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search
   * to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn
   * more about the format of the query, see [Constructing a search
   * query](https://docs.github.com/rest/search/search#constructing-a-search-query). See "[Searching
   * commits](https://docs.github.com/search-github/searching-on-github/searching-commits)" for a detailed list of
   * qualifiers.
   * @param sort Sorts the results of your query by `author-date` or `committer-date`. Default: [best
   * match](https://docs.github.com/rest/search/search#ranking-search-results)
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SearchCommitsApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded SearchCommitsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun searchCommits(
    order: InlineOrderParameterXdbee056c? = null,
    page: Int? = null,
    perPage: Int? = null,
    q: String,
    sort: InlineSearchCommitsGetParameterX2e3bce45? = null,
    options: CallOptions = CallOptions(),
  ): InlineSearchCommitsGetResponse200JsonX5c0af761 = executor.executeWithTypedErrors<Unit, SearchCommitsResponse, InlineSearchCommitsGetResponse200JsonX5c0af761>(
    request = SdkExecutionRequest(searchCommitsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "order", values = order?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = listOf(q.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = SearchCodecs.searchCommitsRequestCodecRegistry,
    responseDecoder = SearchCommitsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SearchCommitsResponse.SuccessJson -> response.json
        is SearchCommitsResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is SearchCommitsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SearchCommitsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SearchCommitsResponse.Http304NoContent -> SearchCommitsApiException(response, statusCode, headers)
        is SearchCommitsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Find commits via various criteria on the default branch (usually `main`). This method returns up to 100 results
   * [per page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).
   *
   * When searching for commits, you can get text match metadata for the **message** field when you provide the
   * `text-match` media type. For more details about how to receive highlighted search results, see [Text match
   * metadata](https://docs.github.com/rest/search/search#text-match-metadata).
   *
   * For example, if you want to find commits related to CSS in the
   * [octocat/Spoon-Knife](https://github.com/octocat/Spoon-Knife) repository. Your query would look something like
   * this:
   *
   * `q=repo:octocat/Spoon-Knife+css`
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param order Determines whether the first search result returned is the highest number of matches (`desc`) or
   * lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search
   * to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn
   * more about the format of the query, see [Constructing a search
   * query](https://docs.github.com/rest/search/search#constructing-a-search-query). See "[Searching
   * commits](https://docs.github.com/search-github/searching-on-github/searching-commits)" for a detailed list of
   * qualifiers.
   * @param sort Sorts the results of your query by `author-date` or `committer-date`. Default: [best
   * match](https://docs.github.com/rest/search/search#ranking-search-results)
   * @param options Execution options.
   */
  public suspend fun searchCommitsWithResponse(
    order: InlineOrderParameterXdbee056c? = null,
    page: Int? = null,
    perPage: Int? = null,
    q: String,
    sort: InlineSearchCommitsGetParameterX2e3bce45? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SearchCommitsResponse> = executor.executeWithResponse<Unit, SearchCommitsResponse>(SdkExecutionRequest(searchCommitsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "order", values = order?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = listOf(q.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
  }), SearchCodecs.searchCommitsRequestCodecRegistry, SearchCommitsResponseDecoder, options)

  /**
   * Find issues by state and keyword. This method returns up to 100 results [per
   * page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).
   *
   * When searching for issues, you can get text match metadata for the issue **title**, issue **body**, and issue
   * **comment body** fields when you pass the `text-match` media type. For more details about how to receive
   * highlighted
   * search results, see [Text match metadata](https://docs.github.com/rest/search/search#text-match-metadata).
   *
   * For example, if you want to find the oldest unresolved Python bugs on Windows. Your query might look something like
   * this.
   *
   * `q=windows+label:bug+language:python+state:open&sort=created&order=asc`
   *
   * This query searches for the keyword `windows`, within any open issue that is labeled as `bug`. The search runs
   * across repositories whose primary language is Python. The results are sorted by creation date in ascending order,
   * which means the oldest issues appear first in the search results.
   *
   * > [!NOTE]
   * > For requests made by GitHub Apps with a user access token, you can't retrieve a combination of issues and pull
   * requests in a single query. Requests that don't include the `is:issue` or `is:pull-request` qualifier will receive
   * an HTTP `422 Unprocessable Entity` response. To get results for both issues and pull requests, you must send
   * separate queries for issues and pull requests. For more information about the `is` qualifier, see "[Searching only
   * issues or pull
   * requests](https://docs.github.com/github/searching-for-information-on-github/searching-issues-and-pull-requests#sea
   * rch-only-issues-or-pull-requests)."
   *
   * @param advancedSearch Set to `true` to use advanced search.
   * Example: `http://api.github.com/search/issues?q={query}&advanced_search=true`
   * @param order Determines whether the first search result returned is the highest number of matches (`desc`) or
   * lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search
   * to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn
   * more about the format of the query, see [Constructing a search
   * query](https://docs.github.com/rest/search/search#constructing-a-search-query). See "[Searching issues and pull
   * requests](https://docs.github.com/search-github/searching-on-github/searching-issues-and-pull-requests)" for a
   * detailed list of qualifiers.
   * @param searchType The type of search to perform on issues. When not specified, the default is lexical search.
   *
   * - `semantic` — performs a pure semantic (vector) search using embedding-based understanding.
   * - `hybrid` — combines semantic search with lexical search for best results.
   *
   * Semantic and hybrid search require authentication and are rate limited to 10 requests per minute.
   * Only applies to issue searches (`/search/issues`).
   * @param sort Sorts the results of your query by the number of `comments`, `reactions`, `reactions-+1`,
   * `reactions--1`, `reactions-smile`, `reactions-thinking_face`, `reactions-heart`, `reactions-tada`, or
   * `interactions`. You can also sort results by how recently the items were `created` or `updated`, Default: [best
   * match](https://docs.github.com/rest/search/search#ranking-search-results)
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SearchIssuesAndPullRequestsApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded SearchIssuesAndPullRequestsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun searchIssuesAndPullRequests(
    advancedSearch: String? = null,
    order: InlineOrderParameterXdbee056c? = null,
    page: Int? = null,
    perPage: Int? = null,
    q: String,
    searchType: InlineSearchTypeParameterXd3ea51fa? = null,
    sort: InlineSearchIssuesGetParameterXb2138b73? = null,
    options: CallOptions = CallOptions(),
  ): InlineSearchIssuesGetResponse200JsonX88eab09b = executor.executeWithTypedErrors<Unit, SearchIssuesAndPullRequestsResponse, InlineSearchIssuesGetResponse200JsonX88eab09b>(
    request = SdkExecutionRequest(searchIssuesAndPullRequestsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "advanced_search", values = advancedSearch?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "order", values = order?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = listOf(q.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "search_type", values = searchType?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = SearchCodecs.searchIssuesAndPullRequestsRequestCodecRegistry,
    responseDecoder = SearchIssuesAndPullRequestsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SearchIssuesAndPullRequestsResponse.SuccessJson -> response.json
        is SearchIssuesAndPullRequestsResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is SearchIssuesAndPullRequestsResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is SearchIssuesAndPullRequestsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is SearchIssuesAndPullRequestsResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is SearchIssuesAndPullRequestsResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is SearchIssuesAndPullRequestsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SearchIssuesAndPullRequestsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SearchIssuesAndPullRequestsResponse.Http304NoContent -> SearchIssuesAndPullRequestsApiException(response, statusCode, headers)
        is SearchIssuesAndPullRequestsResponse.Http401Json -> SearchIssuesAndPullRequestsApiException(response, statusCode, headers)
        is SearchIssuesAndPullRequestsResponse.Http403Json -> SearchIssuesAndPullRequestsApiException(response, statusCode, headers)
        is SearchIssuesAndPullRequestsResponse.Http422Json -> SearchIssuesAndPullRequestsApiException(response, statusCode, headers)
        is SearchIssuesAndPullRequestsResponse.Http503Json -> SearchIssuesAndPullRequestsApiException(response, statusCode, headers)
        is SearchIssuesAndPullRequestsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Find issues by state and keyword. This method returns up to 100 results [per
   * page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).
   *
   * When searching for issues, you can get text match metadata for the issue **title**, issue **body**, and issue
   * **comment body** fields when you pass the `text-match` media type. For more details about how to receive
   * highlighted
   * search results, see [Text match metadata](https://docs.github.com/rest/search/search#text-match-metadata).
   *
   * For example, if you want to find the oldest unresolved Python bugs on Windows. Your query might look something like
   * this.
   *
   * `q=windows+label:bug+language:python+state:open&sort=created&order=asc`
   *
   * This query searches for the keyword `windows`, within any open issue that is labeled as `bug`. The search runs
   * across repositories whose primary language is Python. The results are sorted by creation date in ascending order,
   * which means the oldest issues appear first in the search results.
   *
   * > [!NOTE]
   * > For requests made by GitHub Apps with a user access token, you can't retrieve a combination of issues and pull
   * requests in a single query. Requests that don't include the `is:issue` or `is:pull-request` qualifier will receive
   * an HTTP `422 Unprocessable Entity` response. To get results for both issues and pull requests, you must send
   * separate queries for issues and pull requests. For more information about the `is` qualifier, see "[Searching only
   * issues or pull
   * requests](https://docs.github.com/github/searching-for-information-on-github/searching-issues-and-pull-requests#sea
   * rch-only-issues-or-pull-requests)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param advancedSearch Set to `true` to use advanced search.
   * Example: `http://api.github.com/search/issues?q={query}&advanced_search=true`
   * @param order Determines whether the first search result returned is the highest number of matches (`desc`) or
   * lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search
   * to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn
   * more about the format of the query, see [Constructing a search
   * query](https://docs.github.com/rest/search/search#constructing-a-search-query). See "[Searching issues and pull
   * requests](https://docs.github.com/search-github/searching-on-github/searching-issues-and-pull-requests)" for a
   * detailed list of qualifiers.
   * @param searchType The type of search to perform on issues. When not specified, the default is lexical search.
   *
   * - `semantic` — performs a pure semantic (vector) search using embedding-based understanding.
   * - `hybrid` — combines semantic search with lexical search for best results.
   *
   * Semantic and hybrid search require authentication and are rate limited to 10 requests per minute.
   * Only applies to issue searches (`/search/issues`).
   * @param sort Sorts the results of your query by the number of `comments`, `reactions`, `reactions-+1`,
   * `reactions--1`, `reactions-smile`, `reactions-thinking_face`, `reactions-heart`, `reactions-tada`, or
   * `interactions`. You can also sort results by how recently the items were `created` or `updated`, Default: [best
   * match](https://docs.github.com/rest/search/search#ranking-search-results)
   * @param options Execution options.
   */
  public suspend fun searchIssuesAndPullRequestsWithResponse(
    advancedSearch: String? = null,
    order: InlineOrderParameterXdbee056c? = null,
    page: Int? = null,
    perPage: Int? = null,
    q: String,
    searchType: InlineSearchTypeParameterXd3ea51fa? = null,
    sort: InlineSearchIssuesGetParameterXb2138b73? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SearchIssuesAndPullRequestsResponse> = executor.executeWithResponse<Unit, SearchIssuesAndPullRequestsResponse>(SdkExecutionRequest(searchIssuesAndPullRequestsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "advanced_search", values = advancedSearch?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "order", values = order?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = listOf(q.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "search_type", values = searchType?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
  }), SearchCodecs.searchIssuesAndPullRequestsRequestCodecRegistry, SearchIssuesAndPullRequestsResponseDecoder, options)

  /**
   * Find labels in a repository with names or descriptions that match search keywords. Returns up to 100 results [per
   * page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).
   *
   * When searching for labels, you can get text match metadata for the label **name** and **description** fields when
   * you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text
   * match metadata](https://docs.github.com/rest/search/search#text-match-metadata).
   *
   * For example, if you want to find labels in the `linguist` repository that match `bug`, `defect`, or `enhancement`.
   * Your query might look like this:
   *
   * `q=bug+defect+enhancement&repository_id=64778136`
   *
   * The labels that best match the query appear first in the search results.
   *
   * @param order Determines whether the first search result returned is the highest number of matches (`desc`) or
   * lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q The search keywords. This endpoint does not accept qualifiers in the query. To learn more about the format
   * of the query, see [Constructing a search
   * query](https://docs.github.com/rest/search/search#constructing-a-search-query).
   * @param repositoryId The id of the repository.
   * @param sort Sorts the results of your query by when the label was `created` or `updated`. Default: [best
   * match](https://docs.github.com/rest/search/search#ranking-search-results)
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SearchLabelsApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded SearchLabelsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun searchLabels(
    order: InlineOrderParameterXdbee056c? = null,
    page: Int? = null,
    perPage: Int? = null,
    q: String,
    repositoryId: Int,
    sort: InlineSearchLabelsGetParameterXcd7e463a? = null,
    options: CallOptions = CallOptions(),
  ): InlineSearchLabelsGetResponse200JsonXbfd7ef5a = executor.executeWithTypedErrors<Unit, SearchLabelsResponse, InlineSearchLabelsGetResponse200JsonXbfd7ef5a>(
    request = SdkExecutionRequest(searchLabelsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "order", values = order?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = listOf(q.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "repository_id", values = listOf(repositoryId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = SearchCodecs.searchLabelsRequestCodecRegistry,
    responseDecoder = SearchLabelsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SearchLabelsResponse.SuccessJson -> response.json
        is SearchLabelsResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is SearchLabelsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is SearchLabelsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SearchLabelsResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is SearchLabelsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SearchLabelsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SearchLabelsResponse.Http304NoContent -> SearchLabelsApiException(response, statusCode, headers)
        is SearchLabelsResponse.Http403Json -> SearchLabelsApiException(response, statusCode, headers)
        is SearchLabelsResponse.Http404Json -> SearchLabelsApiException(response, statusCode, headers)
        is SearchLabelsResponse.Http422Json -> SearchLabelsApiException(response, statusCode, headers)
        is SearchLabelsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Find labels in a repository with names or descriptions that match search keywords. Returns up to 100 results [per
   * page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).
   *
   * When searching for labels, you can get text match metadata for the label **name** and **description** fields when
   * you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text
   * match metadata](https://docs.github.com/rest/search/search#text-match-metadata).
   *
   * For example, if you want to find labels in the `linguist` repository that match `bug`, `defect`, or `enhancement`.
   * Your query might look like this:
   *
   * `q=bug+defect+enhancement&repository_id=64778136`
   *
   * The labels that best match the query appear first in the search results.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param order Determines whether the first search result returned is the highest number of matches (`desc`) or
   * lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q The search keywords. This endpoint does not accept qualifiers in the query. To learn more about the format
   * of the query, see [Constructing a search
   * query](https://docs.github.com/rest/search/search#constructing-a-search-query).
   * @param repositoryId The id of the repository.
   * @param sort Sorts the results of your query by when the label was `created` or `updated`. Default: [best
   * match](https://docs.github.com/rest/search/search#ranking-search-results)
   * @param options Execution options.
   */
  public suspend fun searchLabelsWithResponse(
    order: InlineOrderParameterXdbee056c? = null,
    page: Int? = null,
    perPage: Int? = null,
    q: String,
    repositoryId: Int,
    sort: InlineSearchLabelsGetParameterXcd7e463a? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SearchLabelsResponse> = executor.executeWithResponse<Unit, SearchLabelsResponse>(SdkExecutionRequest(searchLabelsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "order", values = order?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = listOf(q.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "repository_id", values = listOf(repositoryId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
  }), SearchCodecs.searchLabelsRequestCodecRegistry, SearchLabelsResponseDecoder, options)

  /**
   * Find repositories via various criteria. This method returns up to 100 results [per
   * page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).
   *
   * When searching for repositories, you can get text match metadata for the **name** and **description** fields when
   * you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text
   * match metadata](https://docs.github.com/rest/search/search#text-match-metadata).
   *
   * For example, if you want to search for popular Tetris repositories written in assembly code, your query might look
   * like this:
   *
   * `q=tetris+language:assembly&sort=stars&order=desc`
   *
   * This query searches for repositories with the word `tetris` in the name, the description, or the README. The
   * results are limited to repositories where the primary language is assembly. The results are sorted by stars in
   * descending order, so that the most popular repositories appear first in the search results.
   *
   * @param order Determines whether the first search result returned is the highest number of matches (`desc`) or
   * lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search
   * to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn
   * more about the format of the query, see [Constructing a search
   * query](https://docs.github.com/rest/search/search#constructing-a-search-query). See "[Searching for
   * repositories](https://docs.github.com/articles/searching-for-repositories/)" for a detailed list of qualifiers.
   * @param sort Sorts the results of your query by number of `stars`, `forks`, or `help-wanted-issues` or how recently
   * the items were `updated`. Default: [best match](https://docs.github.com/rest/search/search#ranking-search-results)
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SearchReposApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded SearchReposError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun searchRepos(
    order: InlineOrderParameterXdbee056c? = null,
    page: Int? = null,
    perPage: Int? = null,
    q: String,
    sort: InlineSearchRepositoriesGetParameterXfdb394e6? = null,
    options: CallOptions = CallOptions(),
  ): InlineSearchRepositoriesGetResponse200JsonX6b104402 = executor.executeWithTypedErrors<Unit, SearchReposResponse, InlineSearchRepositoriesGetResponse200JsonX6b104402>(
    request = SdkExecutionRequest(searchReposMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "order", values = order?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = listOf(q.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = SearchCodecs.searchReposRequestCodecRegistry,
    responseDecoder = SearchReposResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SearchReposResponse.SuccessJson -> response.json
        is SearchReposResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is SearchReposResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is SearchReposResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is SearchReposResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SearchReposResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SearchReposResponse.Http304NoContent -> SearchReposApiException(response, statusCode, headers)
        is SearchReposResponse.Http422Json -> SearchReposApiException(response, statusCode, headers)
        is SearchReposResponse.Http503Json -> SearchReposApiException(response, statusCode, headers)
        is SearchReposResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Find repositories via various criteria. This method returns up to 100 results [per
   * page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).
   *
   * When searching for repositories, you can get text match metadata for the **name** and **description** fields when
   * you pass the `text-match` media type. For more details about how to receive highlighted search results, see [Text
   * match metadata](https://docs.github.com/rest/search/search#text-match-metadata).
   *
   * For example, if you want to search for popular Tetris repositories written in assembly code, your query might look
   * like this:
   *
   * `q=tetris+language:assembly&sort=stars&order=desc`
   *
   * This query searches for repositories with the word `tetris` in the name, the description, or the README. The
   * results are limited to repositories where the primary language is assembly. The results are sorted by stars in
   * descending order, so that the most popular repositories appear first in the search results.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param order Determines whether the first search result returned is the highest number of matches (`desc`) or
   * lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search
   * to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn
   * more about the format of the query, see [Constructing a search
   * query](https://docs.github.com/rest/search/search#constructing-a-search-query). See "[Searching for
   * repositories](https://docs.github.com/articles/searching-for-repositories/)" for a detailed list of qualifiers.
   * @param sort Sorts the results of your query by number of `stars`, `forks`, or `help-wanted-issues` or how recently
   * the items were `updated`. Default: [best match](https://docs.github.com/rest/search/search#ranking-search-results)
   * @param options Execution options.
   */
  public suspend fun searchReposWithResponse(
    order: InlineOrderParameterXdbee056c? = null,
    page: Int? = null,
    perPage: Int? = null,
    q: String,
    sort: InlineSearchRepositoriesGetParameterXfdb394e6? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SearchReposResponse> = executor.executeWithResponse<Unit, SearchReposResponse>(SdkExecutionRequest(searchReposMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "order", values = order?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = listOf(q.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
  }), SearchCodecs.searchReposRequestCodecRegistry, SearchReposResponseDecoder, options)

  /**
   * Find topics via various criteria. Results are sorted by best match. This method returns up to 100 results [per
   * page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api). See "[Searching
   * topics](https://docs.github.com/articles/searching-topics/)" for a detailed list of qualifiers.
   *
   * When searching for topics, you can get text match metadata for the topic's **short\_description**, **description**,
   * **name**, or **display\_name** field when you pass the `text-match` media type. For more details about how to
   * receive highlighted search results, see [Text match
   * metadata](https://docs.github.com/rest/search/search#text-match-metadata).
   *
   * For example, if you want to search for topics related to Ruby that are featured on https://github.com/topics. Your
   * query might look like this:
   *
   * `q=ruby+is:featured`
   *
   * This query searches for topics with the keyword `ruby` and limits the results to find only topics that are
   * featured. The topics that are the best match for the query appear first in the search results.
   *
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search
   * to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn
   * more about the format of the query, see [Constructing a search
   * query](https://docs.github.com/rest/search/search#constructing-a-search-query).
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SearchTopicsApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded SearchTopicsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun searchTopics(
    page: Int? = null,
    perPage: Int? = null,
    q: String,
    options: CallOptions = CallOptions(),
  ): InlineSearchTopicsGetResponse200JsonX9098be1f = executor.executeWithTypedErrors<Unit, SearchTopicsResponse, InlineSearchTopicsGetResponse200JsonX9098be1f>(
    request = SdkExecutionRequest(searchTopicsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = listOf(q.toString())))
    }),
    requestCodecs = SearchCodecs.searchTopicsRequestCodecRegistry,
    responseDecoder = SearchTopicsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SearchTopicsResponse.SuccessJson -> response.json
        is SearchTopicsResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is SearchTopicsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SearchTopicsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SearchTopicsResponse.Http304NoContent -> SearchTopicsApiException(response, statusCode, headers)
        is SearchTopicsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Find topics via various criteria. Results are sorted by best match. This method returns up to 100 results [per
   * page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api). See "[Searching
   * topics](https://docs.github.com/articles/searching-topics/)" for a detailed list of qualifiers.
   *
   * When searching for topics, you can get text match metadata for the topic's **short\_description**, **description**,
   * **name**, or **display\_name** field when you pass the `text-match` media type. For more details about how to
   * receive highlighted search results, see [Text match
   * metadata](https://docs.github.com/rest/search/search#text-match-metadata).
   *
   * For example, if you want to search for topics related to Ruby that are featured on https://github.com/topics. Your
   * query might look like this:
   *
   * `q=ruby+is:featured`
   *
   * This query searches for topics with the keyword `ruby` and limits the results to find only topics that are
   * featured. The topics that are the best match for the query appear first in the search results.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search
   * to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn
   * more about the format of the query, see [Constructing a search
   * query](https://docs.github.com/rest/search/search#constructing-a-search-query).
   * @param options Execution options.
   */
  public suspend fun searchTopicsWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    q: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SearchTopicsResponse> = executor.executeWithResponse<Unit, SearchTopicsResponse>(SdkExecutionRequest(searchTopicsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = listOf(q.toString())))
  }), SearchCodecs.searchTopicsRequestCodecRegistry, SearchTopicsResponseDecoder, options)

  /**
   * Find users via various criteria. This method returns up to 100 results [per
   * page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).
   *
   * When searching for users, you can get text match metadata for the issue **login**, public **email**, and **name**
   * fields when you pass the `text-match` media type. For more details about highlighting search results, see [Text
   * match metadata](https://docs.github.com/rest/search/search#text-match-metadata). For more details about how to
   * receive highlighted search results, see [Text match
   * metadata](https://docs.github.com/rest/search/search#text-match-metadata).
   *
   * For example, if you're looking for a list of popular users, you might try this query:
   *
   * `q=tom+repos:%3E42+followers:%3E1000`
   *
   * This query searches for users with the name `tom`. The results are restricted to users with more than 42
   * repositories and over 1,000 followers.
   *
   * This endpoint does not accept authentication and will only include publicly visible users. As an alternative, you
   * can use the GraphQL API. The GraphQL API requires authentication and will return private users, including
   * Enterprise Managed Users (EMUs), that you are authorized to view. For more information, see "[GraphQL
   * Queries](https://docs.github.com/graphql/reference/queries#search)."
   *
   * @param order Determines whether the first search result returned is the highest number of matches (`desc`) or
   * lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search
   * to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn
   * more about the format of the query, see [Constructing a search
   * query](https://docs.github.com/rest/search/search#constructing-a-search-query). See "[Searching
   * users](https://docs.github.com/search-github/searching-on-github/searching-users)" for a detailed list of
   * qualifiers.
   * @param sort Sorts the results of your query by number of `followers` or `repositories`, or when the person `joined`
   * GitHub. Default: [best match](https://docs.github.com/rest/search/search#ranking-search-results)
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SearchUsersApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded SearchUsersError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun searchUsers(
    order: InlineOrderParameterXdbee056c? = null,
    page: Int? = null,
    perPage: Int? = null,
    q: String,
    sort: InlineSearchUsersGetParameterXb95f88ed? = null,
    options: CallOptions = CallOptions(),
  ): InlineSearchUsersGetResponse200JsonXde96f739 = executor.executeWithTypedErrors<Unit, SearchUsersResponse, InlineSearchUsersGetResponse200JsonXde96f739>(
    request = SdkExecutionRequest(searchUsersMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "order", values = order?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = listOf(q.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = SearchCodecs.searchUsersRequestCodecRegistry,
    responseDecoder = SearchUsersResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SearchUsersResponse.SuccessJson -> response.json
        is SearchUsersResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is SearchUsersResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is SearchUsersResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is SearchUsersResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SearchUsersResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SearchUsersResponse.Http304NoContent -> SearchUsersApiException(response, statusCode, headers)
        is SearchUsersResponse.Http422Json -> SearchUsersApiException(response, statusCode, headers)
        is SearchUsersResponse.Http503Json -> SearchUsersApiException(response, statusCode, headers)
        is SearchUsersResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Find users via various criteria. This method returns up to 100 results [per
   * page](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api).
   *
   * When searching for users, you can get text match metadata for the issue **login**, public **email**, and **name**
   * fields when you pass the `text-match` media type. For more details about highlighting search results, see [Text
   * match metadata](https://docs.github.com/rest/search/search#text-match-metadata). For more details about how to
   * receive highlighted search results, see [Text match
   * metadata](https://docs.github.com/rest/search/search#text-match-metadata).
   *
   * For example, if you're looking for a list of popular users, you might try this query:
   *
   * `q=tom+repos:%3E42+followers:%3E1000`
   *
   * This query searches for users with the name `tom`. The results are restricted to users with more than 42
   * repositories and over 1,000 followers.
   *
   * This endpoint does not accept authentication and will only include publicly visible users. As an alternative, you
   * can use the GraphQL API. The GraphQL API requires authentication and will return private users, including
   * Enterprise Managed Users (EMUs), that you are authorized to view. For more information, see "[GraphQL
   * Queries](https://docs.github.com/graphql/reference/queries#search)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param order Determines whether the first search result returned is the highest number of matches (`desc`) or
   * lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q The query contains one or more search keywords and qualifiers. Qualifiers allow you to limit your search
   * to specific areas of GitHub. The REST API supports the same qualifiers as the web interface for GitHub. To learn
   * more about the format of the query, see [Constructing a search
   * query](https://docs.github.com/rest/search/search#constructing-a-search-query). See "[Searching
   * users](https://docs.github.com/search-github/searching-on-github/searching-users)" for a detailed list of
   * qualifiers.
   * @param sort Sorts the results of your query by number of `followers` or `repositories`, or when the person `joined`
   * GitHub. Default: [best match](https://docs.github.com/rest/search/search#ranking-search-results)
   * @param options Execution options.
   */
  public suspend fun searchUsersWithResponse(
    order: InlineOrderParameterXdbee056c? = null,
    page: Int? = null,
    perPage: Int? = null,
    q: String,
    sort: InlineSearchUsersGetParameterXb95f88ed? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SearchUsersResponse> = executor.executeWithResponse<Unit, SearchUsersResponse>(SdkExecutionRequest(searchUsersMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "order", values = order?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = listOf(q.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
  }), SearchCodecs.searchUsersRequestCodecRegistry, SearchUsersResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `search/code` may expose through its typed API exception.
   */
  public sealed interface SearchCodeError

  /**
   * Typed response alternatives for `search/code`. Non-success alternatives are not converted into success values.
   */
  public sealed interface SearchCodeResponse {
    public class SuccessJson(
      public val json: InlineSearchCodeGetResponse200JsonXb9c4f78c,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchCodeResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchCodeResponse,
        SearchCodeError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchCodeResponse,
        SearchCodeError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchCodeResponse,
        SearchCodeError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchCodeResponse,
        SearchCodeError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchCodeResponse
  }

  /**
   * Raised by `search/code` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class SearchCodeApiException(
    public val error: SearchCodeError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "search/code")

  private object SearchCodeResponseDecoder : SdkResponseAlternativeDecoder<SearchCodeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SearchCodeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SearchCodeResponse> = when {
      alternative.id == "search/code.response.alternative0" -> SdkResponseDecodeResult(
        value = SearchCodeResponse.SuccessJson(
          json = SearchCodecs.searchCodeResponseCodecAlternative0Registry.select(listOf("search/code.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/code.response.alternative1" -> SdkResponseDecodeResult(
        value = SearchCodeResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/code.response.alternative2" -> SdkResponseDecodeResult(
        value = SearchCodeResponse.Http403Json(
          json = SearchCodecs.searchCodeResponseCodecAlternative2Registry.select(listOf("search/code.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/code.response.alternative3" -> SdkResponseDecodeResult(
        value = SearchCodeResponse.Http422Json(
          json = SearchCodecs.searchCodeResponseCodecAlternative3Registry.select(listOf("search/code.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/code.response.alternative4" -> SdkResponseDecodeResult(
        value = SearchCodeResponse.Http503Json(
          json = SearchCodecs.searchCodeResponseCodecAlternative4Registry.select(listOf("search/code.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SearchCodeResponse = SearchCodeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `search/commits` may expose through its typed API exception.
   */
  public sealed interface SearchCommitsError

  /**
   * Typed response alternatives for `search/commits`. Non-success alternatives are not converted into success values.
   */
  public sealed interface SearchCommitsResponse {
    public class SuccessJson(
      public val json: InlineSearchCommitsGetResponse200JsonX5c0af761,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchCommitsResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchCommitsResponse,
        SearchCommitsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchCommitsResponse
  }

  /**
   * Raised by `search/commits` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class SearchCommitsApiException(
    public val error: SearchCommitsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "search/commits")

  private object SearchCommitsResponseDecoder : SdkResponseAlternativeDecoder<SearchCommitsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SearchCommitsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SearchCommitsResponse> = when {
      alternative.id == "search/commits.response.alternative0" -> SdkResponseDecodeResult(
        value = SearchCommitsResponse.SuccessJson(
          json = SearchCodecs.searchCommitsResponseCodecAlternative0Registry.select(listOf("search/commits.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/commits.response.alternative1" -> SdkResponseDecodeResult(
        value = SearchCommitsResponse.Http304NoContent(
          unit = Unit,
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
    ): SearchCommitsResponse = SearchCommitsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `search/issues-and-pull-requests` may expose through its typed API
   * exception.
   */
  public sealed interface SearchIssuesAndPullRequestsError

  /**
   * Typed response alternatives for `search/issues-and-pull-requests`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface SearchIssuesAndPullRequestsResponse {
    public class SuccessJson(
      public val json: InlineSearchIssuesGetResponse200JsonX88eab09b,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchIssuesAndPullRequestsResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchIssuesAndPullRequestsResponse,
        SearchIssuesAndPullRequestsError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchIssuesAndPullRequestsResponse,
        SearchIssuesAndPullRequestsError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchIssuesAndPullRequestsResponse,
        SearchIssuesAndPullRequestsError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchIssuesAndPullRequestsResponse,
        SearchIssuesAndPullRequestsError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchIssuesAndPullRequestsResponse,
        SearchIssuesAndPullRequestsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchIssuesAndPullRequestsResponse
  }

  /**
   * Raised by `search/issues-and-pull-requests` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class SearchIssuesAndPullRequestsApiException(
    public val error: SearchIssuesAndPullRequestsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "search/issues-and-pull-requests")

  private object SearchIssuesAndPullRequestsResponseDecoder : SdkResponseAlternativeDecoder<SearchIssuesAndPullRequestsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SearchIssuesAndPullRequestsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SearchIssuesAndPullRequestsResponse> = when {
      alternative.id == "search/issues-and-pull-requests.response.alternative0" -> SdkResponseDecodeResult(
        value = SearchIssuesAndPullRequestsResponse.SuccessJson(
          json = SearchCodecs.searchIssuesAndPullRequestsResponseCodecAlternative0Registry.select(listOf("search/issues-and-pull-requests.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/issues-and-pull-requests.response.alternative1" -> SdkResponseDecodeResult(
        value = SearchIssuesAndPullRequestsResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/issues-and-pull-requests.response.alternative2" -> SdkResponseDecodeResult(
        value = SearchIssuesAndPullRequestsResponse.Http401Json(
          json = SearchCodecs.searchIssuesAndPullRequestsResponseCodecAlternative2Registry.select(listOf("search/issues-and-pull-requests.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/issues-and-pull-requests.response.alternative3" -> SdkResponseDecodeResult(
        value = SearchIssuesAndPullRequestsResponse.Http403Json(
          json = SearchCodecs.searchIssuesAndPullRequestsResponseCodecAlternative3Registry.select(listOf("search/issues-and-pull-requests.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/issues-and-pull-requests.response.alternative4" -> SdkResponseDecodeResult(
        value = SearchIssuesAndPullRequestsResponse.Http422Json(
          json = SearchCodecs.searchIssuesAndPullRequestsResponseCodecAlternative4Registry.select(listOf("search/issues-and-pull-requests.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/issues-and-pull-requests.response.alternative5" -> SdkResponseDecodeResult(
        value = SearchIssuesAndPullRequestsResponse.Http503Json(
          json = SearchCodecs.searchIssuesAndPullRequestsResponseCodecAlternative5Registry.select(listOf("search/issues-and-pull-requests.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SearchIssuesAndPullRequestsResponse = SearchIssuesAndPullRequestsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `search/labels` may expose through its typed API exception.
   */
  public sealed interface SearchLabelsError

  /**
   * Typed response alternatives for `search/labels`. Non-success alternatives are not converted into success values.
   */
  public sealed interface SearchLabelsResponse {
    public class SuccessJson(
      public val json: InlineSearchLabelsGetResponse200JsonXbfd7ef5a,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchLabelsResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchLabelsResponse,
        SearchLabelsError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchLabelsResponse,
        SearchLabelsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchLabelsResponse,
        SearchLabelsError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchLabelsResponse,
        SearchLabelsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchLabelsResponse
  }

  /**
   * Raised by `search/labels` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class SearchLabelsApiException(
    public val error: SearchLabelsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "search/labels")

  private object SearchLabelsResponseDecoder : SdkResponseAlternativeDecoder<SearchLabelsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SearchLabelsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SearchLabelsResponse> = when {
      alternative.id == "search/labels.response.alternative0" -> SdkResponseDecodeResult(
        value = SearchLabelsResponse.SuccessJson(
          json = SearchCodecs.searchLabelsResponseCodecAlternative0Registry.select(listOf("search/labels.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/labels.response.alternative1" -> SdkResponseDecodeResult(
        value = SearchLabelsResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/labels.response.alternative2" -> SdkResponseDecodeResult(
        value = SearchLabelsResponse.Http403Json(
          json = SearchCodecs.searchLabelsResponseCodecAlternative2Registry.select(listOf("search/labels.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/labels.response.alternative3" -> SdkResponseDecodeResult(
        value = SearchLabelsResponse.Http404Json(
          json = SearchCodecs.searchLabelsResponseCodecAlternative3Registry.select(listOf("search/labels.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/labels.response.alternative4" -> SdkResponseDecodeResult(
        value = SearchLabelsResponse.Http422Json(
          json = SearchCodecs.searchLabelsResponseCodecAlternative4Registry.select(listOf("search/labels.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SearchLabelsResponse = SearchLabelsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `search/repos` may expose through its typed API exception.
   */
  public sealed interface SearchReposError

  /**
   * Typed response alternatives for `search/repos`. Non-success alternatives are not converted into success values.
   */
  public sealed interface SearchReposResponse {
    public class SuccessJson(
      public val json: InlineSearchRepositoriesGetResponse200JsonX6b104402,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchReposResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchReposResponse,
        SearchReposError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchReposResponse,
        SearchReposError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchReposResponse,
        SearchReposError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchReposResponse
  }

  /**
   * Raised by `search/repos` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class SearchReposApiException(
    public val error: SearchReposError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "search/repos")

  private object SearchReposResponseDecoder : SdkResponseAlternativeDecoder<SearchReposResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SearchReposResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SearchReposResponse> = when {
      alternative.id == "search/repos.response.alternative0" -> SdkResponseDecodeResult(
        value = SearchReposResponse.SuccessJson(
          json = SearchCodecs.searchReposResponseCodecAlternative0Registry.select(listOf("search/repos.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/repos.response.alternative1" -> SdkResponseDecodeResult(
        value = SearchReposResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/repos.response.alternative2" -> SdkResponseDecodeResult(
        value = SearchReposResponse.Http422Json(
          json = SearchCodecs.searchReposResponseCodecAlternative2Registry.select(listOf("search/repos.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/repos.response.alternative3" -> SdkResponseDecodeResult(
        value = SearchReposResponse.Http503Json(
          json = SearchCodecs.searchReposResponseCodecAlternative3Registry.select(listOf("search/repos.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SearchReposResponse = SearchReposResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `search/topics` may expose through its typed API exception.
   */
  public sealed interface SearchTopicsError

  /**
   * Typed response alternatives for `search/topics`. Non-success alternatives are not converted into success values.
   */
  public sealed interface SearchTopicsResponse {
    public class SuccessJson(
      public val json: InlineSearchTopicsGetResponse200JsonX9098be1f,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchTopicsResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchTopicsResponse,
        SearchTopicsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchTopicsResponse
  }

  /**
   * Raised by `search/topics` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class SearchTopicsApiException(
    public val error: SearchTopicsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "search/topics")

  private object SearchTopicsResponseDecoder : SdkResponseAlternativeDecoder<SearchTopicsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SearchTopicsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SearchTopicsResponse> = when {
      alternative.id == "search/topics.response.alternative0" -> SdkResponseDecodeResult(
        value = SearchTopicsResponse.SuccessJson(
          json = SearchCodecs.searchTopicsResponseCodecAlternative0Registry.select(listOf("search/topics.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/topics.response.alternative1" -> SdkResponseDecodeResult(
        value = SearchTopicsResponse.Http304NoContent(
          unit = Unit,
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
    ): SearchTopicsResponse = SearchTopicsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `search/users` may expose through its typed API exception.
   */
  public sealed interface SearchUsersError

  /**
   * Typed response alternatives for `search/users`. Non-success alternatives are not converted into success values.
   */
  public sealed interface SearchUsersResponse {
    public class SuccessJson(
      public val json: InlineSearchUsersGetResponse200JsonXde96f739,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchUsersResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchUsersResponse,
        SearchUsersError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchUsersResponse,
        SearchUsersError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchUsersResponse,
        SearchUsersError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SearchUsersResponse
  }

  /**
   * Raised by `search/users` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class SearchUsersApiException(
    public val error: SearchUsersError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "search/users")

  private object SearchUsersResponseDecoder : SdkResponseAlternativeDecoder<SearchUsersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SearchUsersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SearchUsersResponse> = when {
      alternative.id == "search/users.response.alternative0" -> SdkResponseDecodeResult(
        value = SearchUsersResponse.SuccessJson(
          json = SearchCodecs.searchUsersResponseCodecAlternative0Registry.select(listOf("search/users.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/users.response.alternative1" -> SdkResponseDecodeResult(
        value = SearchUsersResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/users.response.alternative2" -> SdkResponseDecodeResult(
        value = SearchUsersResponse.Http422Json(
          json = SearchCodecs.searchUsersResponseCodecAlternative2Registry.select(listOf("search/users.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "search/users.response.alternative3" -> SdkResponseDecodeResult(
        value = SearchUsersResponse.Http503Json(
          json = SearchCodecs.searchUsersResponseCodecAlternative3Registry.select(listOf("search/users.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SearchUsersResponse = SearchUsersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val searchCodeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "search/code",
          method = "GET",
          path = "/search/code",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineSearchCodeGetResponse200JsonXb9c4f78c",
              mode = SdkResponseMode.BUFFERED,
              id = "search/code.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "search/code.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "search/code.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "search/code.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "search/code.response.alternative4",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "githubBearer", scopes = emptyList()),
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

    public val searchCommitsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "search/commits",
          method = "GET",
          path = "/search/commits",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineSearchCommitsGetResponse200JsonX5c0af761",
              mode = SdkResponseMode.BUFFERED,
              id = "search/commits.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "search/commits.response.alternative1",
            ),
          ),
          security = emptyList(),
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

    public val searchIssuesAndPullRequestsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "search/issues-and-pull-requests",
          method = "GET",
          path = "/search/issues",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineSearchIssuesGetResponse200JsonX88eab09b",
              mode = SdkResponseMode.BUFFERED,
              id = "search/issues-and-pull-requests.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "search/issues-and-pull-requests.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "search/issues-and-pull-requests.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "search/issues-and-pull-requests.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "search/issues-and-pull-requests.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "search/issues-and-pull-requests.response.alternative5",
            ),
          ),
          security = emptyList(),
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

    public val searchLabelsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "search/labels",
          method = "GET",
          path = "/search/labels",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineSearchLabelsGetResponse200JsonXbfd7ef5a",
              mode = SdkResponseMode.BUFFERED,
              id = "search/labels.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "search/labels.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "search/labels.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "search/labels.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "search/labels.response.alternative4",
            ),
          ),
          security = emptyList(),
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

    public val searchReposMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "search/repos",
          method = "GET",
          path = "/search/repositories",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineSearchRepositoriesGetResponse200JsonX6b104402",
              mode = SdkResponseMode.BUFFERED,
              id = "search/repos.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "search/repos.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "search/repos.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "search/repos.response.alternative3",
            ),
          ),
          security = emptyList(),
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

    public val searchTopicsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "search/topics",
          method = "GET",
          path = "/search/topics",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineSearchTopicsGetResponse200JsonX9098be1f",
              mode = SdkResponseMode.BUFFERED,
              id = "search/topics.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "search/topics.response.alternative1",
            ),
          ),
          security = emptyList(),
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

    public val searchUsersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "search/users",
          method = "GET",
          path = "/search/users",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineSearchUsersGetResponse200JsonXde96f739",
              mode = SdkResponseMode.BUFFERED,
              id = "search/users.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "search/users.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "search/users.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "search/users.response.alternative3",
            ),
          ),
          security = emptyList(),
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
