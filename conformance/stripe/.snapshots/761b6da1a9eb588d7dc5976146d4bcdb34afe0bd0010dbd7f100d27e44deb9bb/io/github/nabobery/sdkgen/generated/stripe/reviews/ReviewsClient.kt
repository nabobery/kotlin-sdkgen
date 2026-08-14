package io.github.nabobery.sdkgen.generated.stripe.reviews

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
import io.github.nabobery.sdkgen.generated.stripe.Error
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ReviewsApprovePostRequestFormX37111965
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ReviewsGetParameterX513fe451
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ReviewsGetResponse200JsonX5f62b8f9
import io.github.nabobery.sdkgen.generated.stripe.Review
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object ReviewsCodecs {
  internal const val GETREVIEWS_REQUEST_CODEC_ID: String = "GetReviews.request"

  private val getReviewsRequestCodec: MediaTypeCodec<JsonObject?> = GetReviewsFormCodec

  private val getReviewsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1ReviewsGetResponse200JsonX5f62b8f9> =
      KotlinxSerializationCodec("GetReviews.response.alternative0", InlineV1ReviewsGetResponse200JsonX5f62b8f9.Serializer, SdkJson)

  internal val getReviewsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1ReviewsGetResponse200JsonX5f62b8f9> =
      MediaTypeCodecRegistry.of(getReviewsResponseCodecAlternative0Codec)

  private val getReviewsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetReviews.response.alternative1", Error.Serializer, SdkJson)

  internal val getReviewsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getReviewsResponseCodecAlternative1Codec)

  internal val getReviewsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getReviewsRequestCodec)

  internal const val GETREVIEWSREVIEW_REQUEST_CODEC_ID: String = "GetReviewsReview.request"

  private val getReviewsReviewRequestCodec: MediaTypeCodec<JsonObject?> = GetReviewsReviewFormCodec

  private val getReviewsReviewResponseCodecAlternative0Codec: MediaTypeCodec<Review> =
      KotlinxSerializationCodec("GetReviewsReview.response.alternative0", Review.Serializer, SdkJson)

  internal val getReviewsReviewResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Review> =
      MediaTypeCodecRegistry.of(getReviewsReviewResponseCodecAlternative0Codec)

  private val getReviewsReviewResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetReviewsReview.response.alternative1", Error.Serializer, SdkJson)

  internal val getReviewsReviewResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getReviewsReviewResponseCodecAlternative1Codec)

  internal val getReviewsReviewRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getReviewsReviewRequestCodec)

  internal const val POSTREVIEWSREVIEWAPPROVE_REQUEST_CODEC_ID: String =
      "PostReviewsReviewApprove.request"

  private val postReviewsReviewApproveRequestCodec:
      MediaTypeCodec<InlineV1ReviewsApprovePostRequestFormX37111965?> =
      PostReviewsReviewApproveFormCodec

  private val postReviewsReviewApproveResponseCodecAlternative0Codec: MediaTypeCodec<Review> =
      KotlinxSerializationCodec("PostReviewsReviewApprove.response.alternative0", Review.Serializer, SdkJson)

  internal val postReviewsReviewApproveResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Review> =
      MediaTypeCodecRegistry.of(postReviewsReviewApproveResponseCodecAlternative0Codec)

  private val postReviewsReviewApproveResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostReviewsReviewApprove.response.alternative1", Error.Serializer, SdkJson)

  internal val postReviewsReviewApproveResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postReviewsReviewApproveResponseCodecAlternative1Codec)

  internal val postReviewsReviewApproveRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ReviewsApprovePostRequestFormX37111965?> =
      MediaTypeCodecRegistry.of(postReviewsReviewApproveRequestCodec)

  internal object GetReviewsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetReviews.request"

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

  internal object GetReviewsReviewFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetReviewsReview.request"

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

  internal object PostReviewsReviewApproveFormCodec : MediaTypeCodec<InlineV1ReviewsApprovePostRequestFormX37111965?> {
    override val id: String = "PostReviewsReviewApprove.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ReviewsApprovePostRequestFormX37111965?, mediaType: String): SdkRequestBody {
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
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ReviewsApprovePostRequestFormX37111965? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'reviews' group of Stripe API.
 */
public class ReviewsClient(
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
      SdkExecutor(transport, authentication = this@ReviewsClient.authentication)

  /**
   * <p>Returns a list of <code>Review</code> objects that have <code>open</code> set to <code>true</code>. The objects
   * are sorted in descending order by creation date, with the most recently created object appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return reviews that were created during the given date interval.
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
  public suspend fun getReviewsWithResponse(
    request: JsonObject? = null,
    created: InlineV1ReviewsGetParameterX513fe451? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetReviewsResponse> = executor.executeWithResponse<JsonObject?, GetReviewsResponse>(SdkExecutionRequest(getReviewsMetadata, baseUri, request, listOf(ReviewsCodecs.GETREVIEWS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), ReviewsCodecs.getReviewsRequestCodecRegistry, GetReviewsResponseDecoder, options)

  /**
   * <p>Retrieves a <code>Review</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param review Wire parameter `review`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getReviewsReviewWithResponse(
    request: JsonObject? = null,
    review: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetReviewsReviewResponse> = executor.executeWithResponse<JsonObject?, GetReviewsReviewResponse>(SdkExecutionRequest(getReviewsReviewMetadata, baseUri, request, listOf(ReviewsCodecs.GETREVIEWSREVIEW_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "review", values = listOf(review.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), ReviewsCodecs.getReviewsReviewRequestCodecRegistry, GetReviewsReviewResponseDecoder, options)

  /**
   * <p>Approves a <code>Review</code> object, closing it and removing it from the list of reviews.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param review Wire parameter `review`.
   * @param options Execution options.
   */
  public suspend fun postReviewsReviewApproveWithResponse(
    request: InlineV1ReviewsApprovePostRequestFormX37111965? = null,
    review: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostReviewsReviewApproveResponse> = executor.executeWithResponse<InlineV1ReviewsApprovePostRequestFormX37111965?, PostReviewsReviewApproveResponse>(SdkExecutionRequest(postReviewsReviewApproveMetadata, baseUri, request, listOf(ReviewsCodecs.POSTREVIEWSREVIEWAPPROVE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "review", values = listOf(review.toString())))
  }), ReviewsCodecs.postReviewsReviewApproveRequestCodecRegistry, PostReviewsReviewApproveResponseDecoder, options)

  /**
   * Typed response alternatives for `GetReviews`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetReviewsResponse {
    public class SuccessJson(
      public val json: InlineV1ReviewsGetResponse200JsonX5f62b8f9,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetReviewsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetReviewsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetReviewsResponse
  }

  private object GetReviewsResponseDecoder : SdkResponseAlternativeDecoder<GetReviewsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetReviewsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetReviewsResponse> = when {
      alternative.id == "GetReviews.response.alternative0" -> SdkResponseDecodeResult(
        value = GetReviewsResponse.SuccessJson(
          json = ReviewsCodecs.getReviewsResponseCodecAlternative0Registry.select(listOf("GetReviews.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetReviews.response.alternative1" -> SdkResponseDecodeResult(
        value = GetReviewsResponse.DefaultJson(
          json = ReviewsCodecs.getReviewsResponseCodecAlternative1Registry.select(listOf("GetReviews.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetReviewsResponse = GetReviewsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetReviewsReview`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetReviewsReviewResponse {
    public class SuccessJson(
      public val json: Review,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetReviewsReviewResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetReviewsReviewResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetReviewsReviewResponse
  }

  private object GetReviewsReviewResponseDecoder : SdkResponseAlternativeDecoder<GetReviewsReviewResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetReviewsReviewResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetReviewsReviewResponse> = when {
      alternative.id == "GetReviewsReview.response.alternative0" -> SdkResponseDecodeResult(
        value = GetReviewsReviewResponse.SuccessJson(
          json = ReviewsCodecs.getReviewsReviewResponseCodecAlternative0Registry.select(listOf("GetReviewsReview.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetReviewsReview.response.alternative1" -> SdkResponseDecodeResult(
        value = GetReviewsReviewResponse.DefaultJson(
          json = ReviewsCodecs.getReviewsReviewResponseCodecAlternative1Registry.select(listOf("GetReviewsReview.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetReviewsReviewResponse = GetReviewsReviewResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostReviewsReviewApprove`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostReviewsReviewApproveResponse {
    public class SuccessJson(
      public val json: Review,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostReviewsReviewApproveResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostReviewsReviewApproveResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostReviewsReviewApproveResponse
  }

  private object PostReviewsReviewApproveResponseDecoder : SdkResponseAlternativeDecoder<PostReviewsReviewApproveResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostReviewsReviewApproveResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostReviewsReviewApproveResponse> = when {
      alternative.id == "PostReviewsReviewApprove.response.alternative0" -> SdkResponseDecodeResult(
        value = PostReviewsReviewApproveResponse.SuccessJson(
          json = ReviewsCodecs.postReviewsReviewApproveResponseCodecAlternative0Registry.select(listOf("PostReviewsReviewApprove.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostReviewsReviewApprove.response.alternative1" -> SdkResponseDecodeResult(
        value = PostReviewsReviewApproveResponse.DefaultJson(
          json = ReviewsCodecs.postReviewsReviewApproveResponseCodecAlternative1Registry.select(listOf("PostReviewsReviewApprove.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostReviewsReviewApproveResponse = PostReviewsReviewApproveResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getReviewsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetReviews",
          method = "GET",
          path = "/v1/reviews",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1ReviewsGetResponse200JsonX5f62b8f9",
              mode = SdkResponseMode.BUFFERED,
              id = "GetReviews.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetReviews.response.alternative1",
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

    internal val getReviewsReviewMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetReviewsReview",
          method = "GET",
          path = "/v1/reviews/{review}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Review",
              mode = SdkResponseMode.BUFFERED,
              id = "GetReviewsReview.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetReviewsReview.response.alternative1",
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

    internal val postReviewsReviewApproveMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostReviewsReviewApprove",
          method = "POST",
          path = "/v1/reviews/{review}/approve",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Review",
              mode = SdkResponseMode.BUFFERED,
              id = "PostReviewsReviewApprove.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostReviewsReviewApprove.response.alternative1",
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
