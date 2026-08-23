package com.nabobery.sdkgen.generated.stripe.sigma

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1SigmaSavedQueriesPostRequestFormXc06cd5a0
import com.nabobery.sdkgen.generated.stripe.InlineV1SigmaScheduledQueryRunsGetResponse200JsonX4a3afa83
import com.nabobery.sdkgen.generated.stripe.ScheduledQueryRun
import com.nabobery.sdkgen.generated.stripe.SdkJson
import com.nabobery.sdkgen.generated.stripe.SigmaSigmaApiQuery
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

internal object SigmaCodecs {
  internal const val GETSIGMASCHEDULEDQUERYRUNS_REQUEST_CODEC_ID: String =
      "GetSigmaScheduledQueryRuns.request"

  private val getSigmaScheduledQueryRunsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetSigmaScheduledQueryRunsFormCodec

  private val getSigmaScheduledQueryRunsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1SigmaScheduledQueryRunsGetResponse200JsonX4a3afa83> =
      KotlinxSerializationCodec("GetSigmaScheduledQueryRuns.response.alternative0", InlineV1SigmaScheduledQueryRunsGetResponse200JsonX4a3afa83.Serializer, SdkJson)

  internal val getSigmaScheduledQueryRunsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1SigmaScheduledQueryRunsGetResponse200JsonX4a3afa83> =
      MediaTypeCodecRegistry.of(getSigmaScheduledQueryRunsResponseCodecAlternative0Codec)

  private val getSigmaScheduledQueryRunsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetSigmaScheduledQueryRuns.response.alternative1", Error.Serializer, SdkJson)

  internal val getSigmaScheduledQueryRunsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getSigmaScheduledQueryRunsResponseCodecAlternative1Codec)

  internal val getSigmaScheduledQueryRunsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getSigmaScheduledQueryRunsRequestCodec)

  internal const val GETSIGMASCHEDULEDQUERYRUNSSCHEDULEDQUERYRUN_REQUEST_CODEC_ID: String =
      "GetSigmaScheduledQueryRunsScheduledQueryRun.request"

  private val getSigmaScheduledQueryRunsScheduledQueryRunRequestCodec: MediaTypeCodec<JsonObject?> =
      GetSigmaScheduledQueryRunsScheduledQueryRunFormCodec

  private val getSigmaScheduledQueryRunsScheduledQueryRunResponseCodecAlternative0Codec:
      MediaTypeCodec<ScheduledQueryRun> =
      KotlinxSerializationCodec("GetSigmaScheduledQueryRunsScheduledQueryRun.response.alternative0", ScheduledQueryRun.Serializer, SdkJson)

  internal val getSigmaScheduledQueryRunsScheduledQueryRunResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ScheduledQueryRun> =
      MediaTypeCodecRegistry.of(getSigmaScheduledQueryRunsScheduledQueryRunResponseCodecAlternative0Codec)

  private val getSigmaScheduledQueryRunsScheduledQueryRunResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetSigmaScheduledQueryRunsScheduledQueryRun.response.alternative1", Error.Serializer, SdkJson)

  internal val getSigmaScheduledQueryRunsScheduledQueryRunResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getSigmaScheduledQueryRunsScheduledQueryRunResponseCodecAlternative1Codec)

  internal val getSigmaScheduledQueryRunsScheduledQueryRunRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getSigmaScheduledQueryRunsScheduledQueryRunRequestCodec)

  internal const val POSTSIGMASAVEDQUERIESID_REQUEST_CODEC_ID: String =
      "PostSigmaSavedQueriesId.request"

  private val postSigmaSavedQueriesIdRequestCodec:
      MediaTypeCodec<InlineV1SigmaSavedQueriesPostRequestFormXc06cd5a0?> =
      PostSigmaSavedQueriesIdFormCodec

  private val postSigmaSavedQueriesIdResponseCodecAlternative0Codec:
      MediaTypeCodec<SigmaSigmaApiQuery> =
      KotlinxSerializationCodec("PostSigmaSavedQueriesId.response.alternative0", SigmaSigmaApiQuery.Serializer, SdkJson)

  internal val postSigmaSavedQueriesIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SigmaSigmaApiQuery> =
      MediaTypeCodecRegistry.of(postSigmaSavedQueriesIdResponseCodecAlternative0Codec)

  private val postSigmaSavedQueriesIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostSigmaSavedQueriesId.response.alternative1", Error.Serializer, SdkJson)

  internal val postSigmaSavedQueriesIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postSigmaSavedQueriesIdResponseCodecAlternative1Codec)

  internal val postSigmaSavedQueriesIdRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1SigmaSavedQueriesPostRequestFormXc06cd5a0?> =
      MediaTypeCodecRegistry.of(postSigmaSavedQueriesIdRequestCodec)

  internal object GetSigmaScheduledQueryRunsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetSigmaScheduledQueryRuns.request"

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

  internal object GetSigmaScheduledQueryRunsScheduledQueryRunFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetSigmaScheduledQueryRunsScheduledQueryRun.request"

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

  internal object PostSigmaSavedQueriesIdFormCodec : MediaTypeCodec<InlineV1SigmaSavedQueriesPostRequestFormXc06cd5a0?> {
    override val id: String = "PostSigmaSavedQueriesId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1SigmaSavedQueriesPostRequestFormXc06cd5a0?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.name?.let { formValue0 ->
        form.add("name", formValue0)
      }
      request.sql?.let { formValue0 ->
        form.add("sql", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1SigmaSavedQueriesPostRequestFormXc06cd5a0? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'sigma' group of Stripe API.
 */
public class SigmaClient(
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
      SdkExecutor(transport, authentication = this@SigmaClient.authentication)

  /**
   * <p>Returns a list of scheduled query runs.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getSigmaScheduledQueryRunsWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetSigmaScheduledQueryRunsResponse> = executor.executeWithResponse<JsonObject?, GetSigmaScheduledQueryRunsResponse>(SdkExecutionRequest(getSigmaScheduledQueryRunsMetadata, baseUri, request, listOf(SigmaCodecs.GETSIGMASCHEDULEDQUERYRUNS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), SigmaCodecs.getSigmaScheduledQueryRunsRequestCodecRegistry, GetSigmaScheduledQueryRunsResponseDecoder, options)

  /**
   * <p>Retrieves the details of an scheduled query run.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param scheduledQueryRun Wire parameter `scheduled_query_run`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getSigmaScheduledQueryRunsScheduledQueryRunWithResponse(
    request: JsonObject? = null,
    scheduledQueryRun: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetSigmaScheduledQueryRunsScheduledQueryRunResponse> = executor.executeWithResponse<JsonObject?, GetSigmaScheduledQueryRunsScheduledQueryRunResponse>(SdkExecutionRequest(getSigmaScheduledQueryRunsScheduledQueryRunMetadata, baseUri, request, listOf(SigmaCodecs.GETSIGMASCHEDULEDQUERYRUNSSCHEDULEDQUERYRUN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "scheduled_query_run", values = listOf(scheduledQueryRun.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), SigmaCodecs.getSigmaScheduledQueryRunsScheduledQueryRunRequestCodecRegistry, GetSigmaScheduledQueryRunsScheduledQueryRunResponseDecoder, options)

  /**
   * <p>Update an existing Sigma query that previously exists</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The `id` of the saved query to update. This should be a valid `id` that was previously created.
   * @param options Execution options.
   */
  public suspend fun postSigmaSavedQueriesIdWithResponse(
    request: InlineV1SigmaSavedQueriesPostRequestFormXc06cd5a0? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostSigmaSavedQueriesIdResponse> = executor.executeWithResponse<InlineV1SigmaSavedQueriesPostRequestFormXc06cd5a0?, PostSigmaSavedQueriesIdResponse>(SdkExecutionRequest(postSigmaSavedQueriesIdMetadata, baseUri, request, listOf(SigmaCodecs.POSTSIGMASAVEDQUERIESID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), SigmaCodecs.postSigmaSavedQueriesIdRequestCodecRegistry, PostSigmaSavedQueriesIdResponseDecoder, options)

  /**
   * Typed response alternatives for `GetSigmaScheduledQueryRuns`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetSigmaScheduledQueryRunsResponse {
    public class SuccessJson(
      public val json: InlineV1SigmaScheduledQueryRunsGetResponse200JsonX4a3afa83,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSigmaScheduledQueryRunsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSigmaScheduledQueryRunsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSigmaScheduledQueryRunsResponse
  }

  private object GetSigmaScheduledQueryRunsResponseDecoder : SdkResponseAlternativeDecoder<GetSigmaScheduledQueryRunsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetSigmaScheduledQueryRunsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetSigmaScheduledQueryRunsResponse> = when {
      alternative.id == "GetSigmaScheduledQueryRuns.response.alternative0" -> SdkResponseDecodeResult(
        value = GetSigmaScheduledQueryRunsResponse.SuccessJson(
          json = SigmaCodecs.getSigmaScheduledQueryRunsResponseCodecAlternative0Registry.select(listOf("GetSigmaScheduledQueryRuns.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetSigmaScheduledQueryRuns.response.alternative1" -> SdkResponseDecodeResult(
        value = GetSigmaScheduledQueryRunsResponse.DefaultJson(
          json = SigmaCodecs.getSigmaScheduledQueryRunsResponseCodecAlternative1Registry.select(listOf("GetSigmaScheduledQueryRuns.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetSigmaScheduledQueryRunsResponse = GetSigmaScheduledQueryRunsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetSigmaScheduledQueryRunsScheduledQueryRun`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetSigmaScheduledQueryRunsScheduledQueryRunResponse {
    public class SuccessJson(
      public val json: ScheduledQueryRun,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSigmaScheduledQueryRunsScheduledQueryRunResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSigmaScheduledQueryRunsScheduledQueryRunResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSigmaScheduledQueryRunsScheduledQueryRunResponse
  }

  private object GetSigmaScheduledQueryRunsScheduledQueryRunResponseDecoder : SdkResponseAlternativeDecoder<GetSigmaScheduledQueryRunsScheduledQueryRunResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetSigmaScheduledQueryRunsScheduledQueryRunResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetSigmaScheduledQueryRunsScheduledQueryRunResponse> = when {
      alternative.id == "GetSigmaScheduledQueryRunsScheduledQueryRun.response.alternative0" -> SdkResponseDecodeResult(
        value = GetSigmaScheduledQueryRunsScheduledQueryRunResponse.SuccessJson(
          json = SigmaCodecs.getSigmaScheduledQueryRunsScheduledQueryRunResponseCodecAlternative0Registry.select(listOf("GetSigmaScheduledQueryRunsScheduledQueryRun.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetSigmaScheduledQueryRunsScheduledQueryRun.response.alternative1" -> SdkResponseDecodeResult(
        value = GetSigmaScheduledQueryRunsScheduledQueryRunResponse.DefaultJson(
          json = SigmaCodecs.getSigmaScheduledQueryRunsScheduledQueryRunResponseCodecAlternative1Registry.select(listOf("GetSigmaScheduledQueryRunsScheduledQueryRun.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetSigmaScheduledQueryRunsScheduledQueryRunResponse = GetSigmaScheduledQueryRunsScheduledQueryRunResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostSigmaSavedQueriesId`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostSigmaSavedQueriesIdResponse {
    public class SuccessJson(
      public val json: SigmaSigmaApiQuery,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSigmaSavedQueriesIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSigmaSavedQueriesIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSigmaSavedQueriesIdResponse
  }

  private object PostSigmaSavedQueriesIdResponseDecoder : SdkResponseAlternativeDecoder<PostSigmaSavedQueriesIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostSigmaSavedQueriesIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostSigmaSavedQueriesIdResponse> = when {
      alternative.id == "PostSigmaSavedQueriesId.response.alternative0" -> SdkResponseDecodeResult(
        value = PostSigmaSavedQueriesIdResponse.SuccessJson(
          json = SigmaCodecs.postSigmaSavedQueriesIdResponseCodecAlternative0Registry.select(listOf("PostSigmaSavedQueriesId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostSigmaSavedQueriesId.response.alternative1" -> SdkResponseDecodeResult(
        value = PostSigmaSavedQueriesIdResponse.DefaultJson(
          json = SigmaCodecs.postSigmaSavedQueriesIdResponseCodecAlternative1Registry.select(listOf("PostSigmaSavedQueriesId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostSigmaSavedQueriesIdResponse = PostSigmaSavedQueriesIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getSigmaScheduledQueryRunsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetSigmaScheduledQueryRuns",
          method = "GET",
          path = "/v1/sigma/scheduled_query_runs",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1SigmaScheduledQueryRunsGetResponse200JsonX4a3afa83",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSigmaScheduledQueryRuns.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSigmaScheduledQueryRuns.response.alternative1",
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

    internal val getSigmaScheduledQueryRunsScheduledQueryRunMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetSigmaScheduledQueryRunsScheduledQueryRun",
          method = "GET",
          path = "/v1/sigma/scheduled_query_runs/{scheduled_query_run}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ScheduledQueryRun",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSigmaScheduledQueryRunsScheduledQueryRun.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSigmaScheduledQueryRunsScheduledQueryRun.response.alternative1",
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

    internal val postSigmaSavedQueriesIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostSigmaSavedQueriesId",
          method = "POST",
          path = "/v1/sigma/saved_queries/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SigmaSigmaApiQuery",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSigmaSavedQueriesId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSigmaSavedQueriesId.response.alternative1",
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
