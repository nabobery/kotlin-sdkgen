package com.nabobery.sdkgen.generated.stripe.linkaccountsessions

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.FinancialConnectionsSession
import com.nabobery.sdkgen.generated.stripe.InlineV1LinkAccountSessionsPostRequestFormX42f81b04
import com.nabobery.sdkgen.generated.stripe.SdkJson
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
import com.nabobery.sdkgen.runtime.SdkRequestBody
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
import com.nabobery.sdkgen.runtime.bodies.FormUrlEncodedBody
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject

public object LinkAccountSessionsCodecs {
  public const val GETLINKACCOUNTSESSIONSSESSION_REQUEST_CODEC_ID: String =
      "GetLinkAccountSessionsSession.request"

  private val getLinkAccountSessionsSessionRequestCodec: MediaTypeCodec<JsonObject?> =
      GetLinkAccountSessionsSessionFormCodec

  private val getLinkAccountSessionsSessionResponseCodecAlternative0Codec:
      MediaTypeCodec<FinancialConnectionsSession> =
      KotlinxSerializationCodec("GetLinkAccountSessionsSession.response.alternative0", FinancialConnectionsSession.Serializer, SdkJson)

  public val getLinkAccountSessionsSessionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FinancialConnectionsSession> =
      MediaTypeCodecRegistry.of(getLinkAccountSessionsSessionResponseCodecAlternative0Codec)

  private val getLinkAccountSessionsSessionResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetLinkAccountSessionsSession.response.alternative1", Error.Serializer, SdkJson)

  public val getLinkAccountSessionsSessionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getLinkAccountSessionsSessionResponseCodecAlternative1Codec)

  public val getLinkAccountSessionsSessionRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?>
      = MediaTypeCodecRegistry.of(getLinkAccountSessionsSessionRequestCodec)

  public const val POSTLINKACCOUNTSESSIONS_REQUEST_CODEC_ID: String =
      "PostLinkAccountSessions.request"

  private val postLinkAccountSessionsRequestCodec:
      MediaTypeCodec<InlineV1LinkAccountSessionsPostRequestFormX42f81b04> =
      PostLinkAccountSessionsFormCodec

  private val postLinkAccountSessionsResponseCodecAlternative0Codec:
      MediaTypeCodec<FinancialConnectionsSession> =
      KotlinxSerializationCodec("PostLinkAccountSessions.response.alternative0", FinancialConnectionsSession.Serializer, SdkJson)

  public val postLinkAccountSessionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FinancialConnectionsSession> =
      MediaTypeCodecRegistry.of(postLinkAccountSessionsResponseCodecAlternative0Codec)

  private val postLinkAccountSessionsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostLinkAccountSessions.response.alternative1", Error.Serializer, SdkJson)

  public val postLinkAccountSessionsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(postLinkAccountSessionsResponseCodecAlternative1Codec)

  public val postLinkAccountSessionsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1LinkAccountSessionsPostRequestFormX42f81b04> =
      MediaTypeCodecRegistry.of(postLinkAccountSessionsRequestCodec)

  public object GetLinkAccountSessionsSessionFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetLinkAccountSessionsSession.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostLinkAccountSessionsFormCodec : MediaTypeCodec<InlineV1LinkAccountSessionsPostRequestFormX42f81b04> {
    override val id: String = "PostLinkAccountSessions.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1LinkAccountSessionsPostRequestFormX42f81b04, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.accountHolder.account?.let { formValue1 ->
        form.add("account_holder" + "[account]", formValue1)
      }
      request.accountHolder.customer?.let { formValue1 ->
        form.add("account_holder" + "[customer]", formValue1)
      }
      request.accountHolder.customerAccount?.let { formValue1 ->
        form.add("account_holder" + "[customer_account]", formValue1)
      }
      form.add("account_holder" + "[type]", request.accountHolder.type.value)
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.filters?.let { formValue0 ->
        formValue0.accountSubcategories?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("filters" + "[account_subcategories]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              form.add("filters" + "[account_subcategories]" + "[" + formIndex3 + "]", formElement3.value)
            }
          }
        }
        formValue0.countries?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("filters" + "[countries]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              form.add("filters" + "[countries]" + "[" + formIndex3 + "]", formElement3)
            }
          }
        }
      }
      if (request.permissions.isEmpty()) {
        form.add("permissions", "")
      } else {
        request.permissions.forEachIndexed { formIndex0, formElement0 ->
          form.add("permissions" + "[" + formIndex0 + "]", formElement0.value)
        }
      }
      request.prefetch?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("prefetch", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("prefetch" + "[" + formIndex1 + "]", formElement1.value)
          }
        }
      }
      request.returnUrl?.let { formValue0 ->
        form.add("return_url", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1LinkAccountSessionsPostRequestFormX42f81b04 {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'link_account_sessions' group of Stripe API.
 */
public class LinkAccountSessionsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  private val contractSecuritySchemes: Map<String, SecurityScheme> = mapOf(
        "basicAuth" to SecurityScheme.HttpBasic,
        "bearerAuth" to SecurityScheme.HttpBearer(),
      )

  private val authentication: SdkAuthentication? = authentication ?: SecuritySchemeAuthentication(
        bindings =
          contractSecuritySchemes.mapNotNull { (schemeId, scheme) ->
            credentialProviders[schemeId]?.let { provider -> schemeId to SecuritySchemeBinding(scheme, provider) }
          }.toMap(),
        trustedHosts = trustedHosts ?: TrustedHosts.of(baseUri),
      )

  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@LinkAccountSessionsClient.authentication)

  /**
   * <p>Retrieves the details of a Financial Connections <code>Session</code></p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param session Wire parameter `session`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getLinkAccountSessionsSessionWithResponse(
    request: JsonObject? = null,
    session: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetLinkAccountSessionsSessionResponse> = executor.executeWithResponse<JsonObject?, GetLinkAccountSessionsSessionResponse>(SdkExecutionRequest(getLinkAccountSessionsSessionMetadata, baseUri, request, listOf(LinkAccountSessionsCodecs.GETLINKACCOUNTSESSIONSSESSION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "session", values = listOf(session.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), LinkAccountSessionsCodecs.getLinkAccountSessionsSessionRequestCodecRegistry, GetLinkAccountSessionsSessionResponseDecoder, options)

  /**
   * <p>To launch the Financial Connections authorization flow, create a <code>Session</code>. The session’s
   * <code>client_secret</code> can be used to launch the flow using Stripe.js.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postLinkAccountSessionsWithResponse(request: InlineV1LinkAccountSessionsPostRequestFormX42f81b04, options: CallOptions = CallOptions()): SdkResponseResult<PostLinkAccountSessionsResponse> = executor.executeWithResponse<InlineV1LinkAccountSessionsPostRequestFormX42f81b04, PostLinkAccountSessionsResponse>(SdkExecutionRequest(postLinkAccountSessionsMetadata, baseUri, request, listOf(LinkAccountSessionsCodecs.POSTLINKACCOUNTSESSIONS_REQUEST_CODEC_ID), emptyList()), LinkAccountSessionsCodecs.postLinkAccountSessionsRequestCodecRegistry, PostLinkAccountSessionsResponseDecoder, options)

  /**
   * Typed response alternatives for `GetLinkAccountSessionsSession`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetLinkAccountSessionsSessionResponse {
    public class SuccessJson(
      public val json: FinancialConnectionsSession,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetLinkAccountSessionsSessionResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetLinkAccountSessionsSessionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetLinkAccountSessionsSessionResponse
  }

  private object GetLinkAccountSessionsSessionResponseDecoder : SdkResponseAlternativeDecoder<GetLinkAccountSessionsSessionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetLinkAccountSessionsSessionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetLinkAccountSessionsSessionResponse> = when {
      alternative.id == "GetLinkAccountSessionsSession.response.alternative0" -> SdkResponseDecodeResult(
        value = GetLinkAccountSessionsSessionResponse.SuccessJson(
          json = LinkAccountSessionsCodecs.getLinkAccountSessionsSessionResponseCodecAlternative0Registry.select(listOf("GetLinkAccountSessionsSession.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetLinkAccountSessionsSession.response.alternative1" -> SdkResponseDecodeResult(
        value = GetLinkAccountSessionsSessionResponse.DefaultJson(
          json = LinkAccountSessionsCodecs.getLinkAccountSessionsSessionResponseCodecAlternative1Registry.select(listOf("GetLinkAccountSessionsSession.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetLinkAccountSessionsSessionResponse = GetLinkAccountSessionsSessionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostLinkAccountSessions`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostLinkAccountSessionsResponse {
    public class SuccessJson(
      public val json: FinancialConnectionsSession,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostLinkAccountSessionsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostLinkAccountSessionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostLinkAccountSessionsResponse
  }

  private object PostLinkAccountSessionsResponseDecoder : SdkResponseAlternativeDecoder<PostLinkAccountSessionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostLinkAccountSessionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostLinkAccountSessionsResponse> = when {
      alternative.id == "PostLinkAccountSessions.response.alternative0" -> SdkResponseDecodeResult(
        value = PostLinkAccountSessionsResponse.SuccessJson(
          json = LinkAccountSessionsCodecs.postLinkAccountSessionsResponseCodecAlternative0Registry.select(listOf("PostLinkAccountSessions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostLinkAccountSessions.response.alternative1" -> SdkResponseDecodeResult(
        value = PostLinkAccountSessionsResponse.DefaultJson(
          json = LinkAccountSessionsCodecs.postLinkAccountSessionsResponseCodecAlternative1Registry.select(listOf("PostLinkAccountSessions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostLinkAccountSessionsResponse = PostLinkAccountSessionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val getLinkAccountSessionsSessionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetLinkAccountSessionsSession",
          method = "GET",
          path = "/v1/link_account_sessions/{session}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FinancialConnectionsSession",
              mode = SdkResponseMode.BUFFERED,
              id = "GetLinkAccountSessionsSession.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetLinkAccountSessionsSession.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val postLinkAccountSessionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostLinkAccountSessions",
          method = "POST",
          path = "/v1/link_account_sessions",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FinancialConnectionsSession",
              mode = SdkResponseMode.BUFFERED,
              id = "PostLinkAccountSessions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostLinkAccountSessions.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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
