package io.github.nabobery.sdkgen.generated.stripe.disputes

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
import io.github.nabobery.sdkgen.generated.stripe.Dispute
import io.github.nabobery.sdkgen.generated.stripe.Error
import io.github.nabobery.sdkgen.generated.stripe.InlineV1DisputesClosePostRequestFormXb955ff2c
import io.github.nabobery.sdkgen.generated.stripe.InlineV1DisputesGetParameterXd37f23c7
import io.github.nabobery.sdkgen.generated.stripe.InlineV1DisputesGetResponse200JsonX99aa80b1
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object DisputesCodecs {
  internal const val GETDISPUTES_REQUEST_CODEC_ID: String = "GetDisputes.request"

  private val getDisputesRequestCodec: MediaTypeCodec<JsonObject?> = GetDisputesFormCodec

  private val getDisputesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1DisputesGetResponse200JsonX99aa80b1> =
      KotlinxSerializationCodec("GetDisputes.response.alternative0", InlineV1DisputesGetResponse200JsonX99aa80b1.Serializer, SdkJson)

  internal val getDisputesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1DisputesGetResponse200JsonX99aa80b1> =
      MediaTypeCodecRegistry.of(getDisputesResponseCodecAlternative0Codec)

  private val getDisputesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetDisputes.response.alternative1", Error.Serializer, SdkJson)

  internal val getDisputesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getDisputesResponseCodecAlternative1Codec)

  internal val getDisputesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getDisputesRequestCodec)

  internal const val GETDISPUTESDISPUTE_REQUEST_CODEC_ID: String = "GetDisputesDispute.request"

  private val getDisputesDisputeRequestCodec: MediaTypeCodec<JsonObject?> =
      GetDisputesDisputeFormCodec

  private val getDisputesDisputeResponseCodecAlternative0Codec: MediaTypeCodec<Dispute> =
      KotlinxSerializationCodec("GetDisputesDispute.response.alternative0", Dispute.Serializer, SdkJson)

  internal val getDisputesDisputeResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Dispute>
      = MediaTypeCodecRegistry.of(getDisputesDisputeResponseCodecAlternative0Codec)

  private val getDisputesDisputeResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetDisputesDispute.response.alternative1", Error.Serializer, SdkJson)

  internal val getDisputesDisputeResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getDisputesDisputeResponseCodecAlternative1Codec)

  internal val getDisputesDisputeRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getDisputesDisputeRequestCodec)

  internal const val POSTDISPUTESDISPUTECLOSE_REQUEST_CODEC_ID: String =
      "PostDisputesDisputeClose.request"

  private val postDisputesDisputeCloseRequestCodec:
      MediaTypeCodec<InlineV1DisputesClosePostRequestFormXb955ff2c?> =
      PostDisputesDisputeCloseFormCodec

  private val postDisputesDisputeCloseResponseCodecAlternative0Codec: MediaTypeCodec<Dispute> =
      KotlinxSerializationCodec("PostDisputesDisputeClose.response.alternative0", Dispute.Serializer, SdkJson)

  internal val postDisputesDisputeCloseResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Dispute> =
      MediaTypeCodecRegistry.of(postDisputesDisputeCloseResponseCodecAlternative0Codec)

  private val postDisputesDisputeCloseResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostDisputesDisputeClose.response.alternative1", Error.Serializer, SdkJson)

  internal val postDisputesDisputeCloseResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postDisputesDisputeCloseResponseCodecAlternative1Codec)

  internal val postDisputesDisputeCloseRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1DisputesClosePostRequestFormXb955ff2c?> =
      MediaTypeCodecRegistry.of(postDisputesDisputeCloseRequestCodec)

  internal object GetDisputesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetDisputes.request"

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

  internal object GetDisputesDisputeFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetDisputesDispute.request"

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

  internal object PostDisputesDisputeCloseFormCodec : MediaTypeCodec<InlineV1DisputesClosePostRequestFormXb955ff2c?> {
    override val id: String = "PostDisputesDisputeClose.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1DisputesClosePostRequestFormXb955ff2c?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1DisputesClosePostRequestFormXb955ff2c? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'disputes' group of Stripe API.
 */
public class DisputesClient(
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
      SdkExecutor(transport, authentication = this@DisputesClient.authentication)

  /**
   * <p>Returns a list of your disputes.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param charge Only return disputes associated to the charge specified by this charge ID.
   * @param created Only return disputes that were created during the given date interval.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param paymentIntent Only return disputes associated to the PaymentIntent specified by this PaymentIntent ID.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getDisputesWithResponse(
    request: JsonObject? = null,
    charge: String? = null,
    created: InlineV1DisputesGetParameterXd37f23c7? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    paymentIntent: String? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetDisputesResponse> = executor.executeWithResponse<JsonObject?, GetDisputesResponse>(SdkExecutionRequest(getDisputesMetadata, baseUri, request, listOf(DisputesCodecs.GETDISPUTES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "charge", values = charge?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "payment_intent", values = paymentIntent?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), DisputesCodecs.getDisputesRequestCodecRegistry, GetDisputesResponseDecoder, options)

  /**
   * <p>Retrieves the dispute with the given ID.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param dispute Wire parameter `dispute`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getDisputesDisputeWithResponse(
    request: JsonObject? = null,
    dispute: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetDisputesDisputeResponse> = executor.executeWithResponse<JsonObject?, GetDisputesDisputeResponse>(SdkExecutionRequest(getDisputesDisputeMetadata, baseUri, request, listOf(DisputesCodecs.GETDISPUTESDISPUTE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "dispute", values = listOf(dispute.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), DisputesCodecs.getDisputesDisputeRequestCodecRegistry, GetDisputesDisputeResponseDecoder, options)

  /**
   * <p>Closing the dispute for a charge indicates that you do not have any evidence to submit and are essentially
   * dismissing the dispute, acknowledging it as lost.</p>
   *
   * <p>The status of the dispute will change from <code>needs_response</code> to <code>lost</code>. <em>Closing a
   * dispute is irreversible</em>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param dispute Wire parameter `dispute`.
   * @param options Execution options.
   */
  public suspend fun postDisputesDisputeCloseWithResponse(
    request: InlineV1DisputesClosePostRequestFormXb955ff2c? = null,
    dispute: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostDisputesDisputeCloseResponse> = executor.executeWithResponse<InlineV1DisputesClosePostRequestFormXb955ff2c?, PostDisputesDisputeCloseResponse>(SdkExecutionRequest(postDisputesDisputeCloseMetadata, baseUri, request, listOf(DisputesCodecs.POSTDISPUTESDISPUTECLOSE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "dispute", values = listOf(dispute.toString())))
  }), DisputesCodecs.postDisputesDisputeCloseRequestCodecRegistry, PostDisputesDisputeCloseResponseDecoder, options)

  /**
   * Typed response alternatives for `GetDisputes`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetDisputesResponse {
    public class SuccessJson(
      public val json: InlineV1DisputesGetResponse200JsonX99aa80b1,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetDisputesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetDisputesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetDisputesResponse
  }

  private object GetDisputesResponseDecoder : SdkResponseAlternativeDecoder<GetDisputesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetDisputesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetDisputesResponse> = when {
      alternative.id == "GetDisputes.response.alternative0" -> SdkResponseDecodeResult(
        value = GetDisputesResponse.SuccessJson(
          json = DisputesCodecs.getDisputesResponseCodecAlternative0Registry.select(listOf("GetDisputes.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetDisputes.response.alternative1" -> SdkResponseDecodeResult(
        value = GetDisputesResponse.DefaultJson(
          json = DisputesCodecs.getDisputesResponseCodecAlternative1Registry.select(listOf("GetDisputes.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetDisputesResponse = GetDisputesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetDisputesDispute`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetDisputesDisputeResponse {
    public class SuccessJson(
      public val json: Dispute,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetDisputesDisputeResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetDisputesDisputeResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetDisputesDisputeResponse
  }

  private object GetDisputesDisputeResponseDecoder : SdkResponseAlternativeDecoder<GetDisputesDisputeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetDisputesDisputeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetDisputesDisputeResponse> = when {
      alternative.id == "GetDisputesDispute.response.alternative0" -> SdkResponseDecodeResult(
        value = GetDisputesDisputeResponse.SuccessJson(
          json = DisputesCodecs.getDisputesDisputeResponseCodecAlternative0Registry.select(listOf("GetDisputesDispute.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetDisputesDispute.response.alternative1" -> SdkResponseDecodeResult(
        value = GetDisputesDisputeResponse.DefaultJson(
          json = DisputesCodecs.getDisputesDisputeResponseCodecAlternative1Registry.select(listOf("GetDisputesDispute.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetDisputesDisputeResponse = GetDisputesDisputeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostDisputesDisputeClose`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostDisputesDisputeCloseResponse {
    public class SuccessJson(
      public val json: Dispute,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostDisputesDisputeCloseResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostDisputesDisputeCloseResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostDisputesDisputeCloseResponse
  }

  private object PostDisputesDisputeCloseResponseDecoder : SdkResponseAlternativeDecoder<PostDisputesDisputeCloseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostDisputesDisputeCloseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostDisputesDisputeCloseResponse> = when {
      alternative.id == "PostDisputesDisputeClose.response.alternative0" -> SdkResponseDecodeResult(
        value = PostDisputesDisputeCloseResponse.SuccessJson(
          json = DisputesCodecs.postDisputesDisputeCloseResponseCodecAlternative0Registry.select(listOf("PostDisputesDisputeClose.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostDisputesDisputeClose.response.alternative1" -> SdkResponseDecodeResult(
        value = PostDisputesDisputeCloseResponse.DefaultJson(
          json = DisputesCodecs.postDisputesDisputeCloseResponseCodecAlternative1Registry.select(listOf("PostDisputesDisputeClose.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostDisputesDisputeCloseResponse = PostDisputesDisputeCloseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getDisputesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetDisputes",
          method = "GET",
          path = "/v1/disputes",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1DisputesGetResponse200JsonX99aa80b1",
              mode = SdkResponseMode.BUFFERED,
              id = "GetDisputes.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetDisputes.response.alternative1",
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

    internal val getDisputesDisputeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetDisputesDispute",
          method = "GET",
          path = "/v1/disputes/{dispute}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Dispute",
              mode = SdkResponseMode.BUFFERED,
              id = "GetDisputesDispute.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetDisputesDispute.response.alternative1",
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

    internal val postDisputesDisputeCloseMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostDisputesDisputeClose",
          method = "POST",
          path = "/v1/disputes/{dispute}/close",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Dispute",
              mode = SdkResponseMode.BUFFERED,
              id = "PostDisputesDisputeClose.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostDisputesDisputeClose.response.alternative1",
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
