package com.nabobery.sdkgen.generated.organization

import com.nabobery.sdkgen.generated.InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema
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

public object OrganizationCodecs {
  public const val LISTORGANIZATIONMEMBERS_RESPONSE_CODEC_ID: String =
      "listOrganizationMembers.response"

  private val listOrganizationMembersResponseCodec:
      MediaTypeCodec<InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec(LISTORGANIZATIONMEMBERS_RESPONSE_CODEC_ID,
        InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  private val listOrganizationMembersResponseCodecAlternative0Codec:
      MediaTypeCodec<InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema> =
      KotlinxSerializationCodec("listOrganizationMembers.response.alternative0",
        InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema.Serializer, SdkJson)

  public val listOrganizationMembersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema>
      = MediaTypeCodecRegistry.of(listOrganizationMembersResponseCodecAlternative0Codec)

  private val listOrganizationMembersResponseCodecAlternative1Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listOrganizationMembers.response.alternative1", UnauthorizedResponse.Serializer,
        SdkJson)

  public val listOrganizationMembersResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listOrganizationMembersResponseCodecAlternative1Codec)

  private val listOrganizationMembersResponseCodecAlternative2Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("listOrganizationMembers.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  public val listOrganizationMembersResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(listOrganizationMembersResponseCodecAlternative2Codec)

  private val listOrganizationMembersResponseCodecAlternative3Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listOrganizationMembers.response.alternative3", InternalServerResponse.Serializer,
        SdkJson)

  public val listOrganizationMembersResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listOrganizationMembersResponseCodecAlternative3Codec)

  public val listOrganizationMembersRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listOrganizationMembersResponseCodecRegistry:
      MediaTypeCodecRegistry<InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema>
      = MediaTypeCodecRegistry.of(listOrganizationMembersResponseCodec)
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
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listOrganizationMembers(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema = executor.execute<Unit,
    InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema>(SdkExecutionRequest(listOrganizationMembersMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(OrganizationCodecs.LISTORGANIZATIONMEMBERS_RESPONSE_CODEC_ID), OrganizationCodecs
    .listOrganizationMembersRequestCodecRegistry, OrganizationCodecs.listOrganizationMembersResponseCodecRegistry,
      options)

  /**
   * List all members of the organization associated with the authenticated management key. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listOrganizationMembersWithResponse(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListOrganizationMembersResponse> = executor.executeWithResponse<Unit,
    ListOrganizationMembersResponse>(SdkExecutionRequest(listOrganizationMembersMetadata, baseUri, Unit, emptyList(),
      buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), OrganizationCodecs.listOrganizationMembersRequestCodecRegistry, ListOrganizationMembersResponseDecoder, options)

  /**
   * Typed response alternatives for `listOrganizationMembers`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ListOrganizationMembersResponse {
    public class SuccessJson(
      public val json: InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListOrganizationMembersResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListOrganizationMembersResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListOrganizationMembersResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListOrganizationMembersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListOrganizationMembersResponse
  }

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
          json = OrganizationCodecs.listOrganizationMembersResponseCodecAlternative0Registry
            .select(listOf("listOrganizationMembers.response.alternative0"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listOrganizationMembers.response.alternative1" -> SdkResponseDecodeResult(
        value = ListOrganizationMembersResponse.Http401Json(
          json = OrganizationCodecs.listOrganizationMembersResponseCodecAlternative1Registry
            .select(listOf("listOrganizationMembers.response.alternative1"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listOrganizationMembers.response.alternative2" -> SdkResponseDecodeResult(
        value = ListOrganizationMembersResponse.Http404Json(
          json = OrganizationCodecs.listOrganizationMembersResponseCodecAlternative2Registry
            .select(listOf("listOrganizationMembers.response.alternative2"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listOrganizationMembers.response.alternative3" -> SdkResponseDecodeResult(
        value = ListOrganizationMembersResponse.Http500Json(
          json = OrganizationCodecs.listOrganizationMembersResponseCodecAlternative3Registry
            .select(listOf("listOrganizationMembers.response.alternative3"), mediaType ?: "application/json")
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
    ): ListOrganizationMembersResponse = ListOrganizationMembersResponse.Unknown(statusCode = statusCode, headers =
      headers)
  }

  public companion object {
    public val listOrganizationMembersMetadata: OperationMetadata = OperationMetadata(
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
              typeTag = "InlinePathsOrganizationMembersGetResponses200ContentApplicationJsonSchema",
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
          pagination = null,
          streaming = null,
        )
  }
}
