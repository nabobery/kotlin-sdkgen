package com.nabobery.sdkgen.generated.stripe.forwarding

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.ForwardingRequest
import com.nabobery.sdkgen.generated.stripe.InlineV1ForwardingRequestsGetParameterX9a27da50
import com.nabobery.sdkgen.generated.stripe.InlineV1ForwardingRequestsGetResponse200JsonX84c350c4
import com.nabobery.sdkgen.generated.stripe.InlineV1ForwardingRequestsPostRequestFormXe4abb4a8
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

public object ForwardingCodecs {
  public const val GETFORWARDINGREQUESTS_REQUEST_CODEC_ID: String = "GetForwardingRequests.request"

  private val getForwardingRequestsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetForwardingRequestsFormCodec

  private val getForwardingRequestsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1ForwardingRequestsGetResponse200JsonX84c350c4> =
      KotlinxSerializationCodec("GetForwardingRequests.response.alternative0", InlineV1ForwardingRequestsGetResponse200JsonX84c350c4.Serializer, SdkJson)

  public val getForwardingRequestsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1ForwardingRequestsGetResponse200JsonX84c350c4> =
      MediaTypeCodecRegistry.of(getForwardingRequestsResponseCodecAlternative0Codec)

  private val getForwardingRequestsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetForwardingRequests.response.alternative1", Error.Serializer, SdkJson)

  public val getForwardingRequestsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getForwardingRequestsResponseCodecAlternative1Codec)

  public val getForwardingRequestsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getForwardingRequestsRequestCodec)

  public const val GETFORWARDINGREQUESTSID_REQUEST_CODEC_ID: String =
      "GetForwardingRequestsId.request"

  private val getForwardingRequestsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetForwardingRequestsIdFormCodec

  private val getForwardingRequestsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<ForwardingRequest> =
      KotlinxSerializationCodec("GetForwardingRequestsId.response.alternative0", ForwardingRequest.Serializer, SdkJson)

  public val getForwardingRequestsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ForwardingRequest> =
      MediaTypeCodecRegistry.of(getForwardingRequestsIdResponseCodecAlternative0Codec)

  private val getForwardingRequestsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetForwardingRequestsId.response.alternative1", Error.Serializer, SdkJson)

  public val getForwardingRequestsIdResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(getForwardingRequestsIdResponseCodecAlternative1Codec)

  public val getForwardingRequestsIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getForwardingRequestsIdRequestCodec)

  public const val POSTFORWARDINGREQUESTS_REQUEST_CODEC_ID: String =
      "PostForwardingRequests.request"

  private val postForwardingRequestsRequestCodec:
      MediaTypeCodec<InlineV1ForwardingRequestsPostRequestFormXe4abb4a8> =
      PostForwardingRequestsFormCodec

  private val postForwardingRequestsResponseCodecAlternative0Codec:
      MediaTypeCodec<ForwardingRequest> =
      KotlinxSerializationCodec("PostForwardingRequests.response.alternative0", ForwardingRequest.Serializer, SdkJson)

  public val postForwardingRequestsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ForwardingRequest> =
      MediaTypeCodecRegistry.of(postForwardingRequestsResponseCodecAlternative0Codec)

  private val postForwardingRequestsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostForwardingRequests.response.alternative1", Error.Serializer, SdkJson)

  public val postForwardingRequestsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(postForwardingRequestsResponseCodecAlternative1Codec)

  public val postForwardingRequestsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ForwardingRequestsPostRequestFormXe4abb4a8> =
      MediaTypeCodecRegistry.of(postForwardingRequestsRequestCodec)

  public object GetForwardingRequestsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetForwardingRequests.request"

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

  public object GetForwardingRequestsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetForwardingRequestsId.request"

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

  public object PostForwardingRequestsFormCodec : MediaTypeCodec<InlineV1ForwardingRequestsPostRequestFormXe4abb4a8> {
    override val id: String = "PostForwardingRequests.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ForwardingRequestsPostRequestFormXe4abb4a8, mediaType: String): SdkRequestBody {
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
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      form.add("payment_method", request.paymentMethod)
      if (request.replacements.isEmpty()) {
        form.add("replacements", "")
      } else {
        request.replacements.forEachIndexed { formIndex0, formElement0 ->
          form.add("replacements" + "[" + formIndex0 + "]", formElement0.value)
        }
      }
      request.request?.let { formValue0 ->
        formValue0.body?.let { formValue2 ->
          form.add("request" + "[body]", formValue2)
        }
        formValue0.headers?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("request" + "[headers]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              form.add("request" + "[headers]" + "[" + formIndex3 + "]" + "[name]", formElement3.name)
              form.add("request" + "[headers]" + "[" + formIndex3 + "]" + "[value]", formElement3.value)
            }
          }
        }
      }
      form.add("url", request.url)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ForwardingRequestsPostRequestFormXe4abb4a8 {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'forwarding' group of Stripe API.
 */
public class ForwardingClient(
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
      SdkExecutor(transport, authentication = this@ForwardingClient.authentication)

  /**
   * <p>Lists all ForwardingRequest objects.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Similar to other List endpoints, filters results based on created timestamp. You can pass gt, gte,
   * lt, and lte timestamp values.
   * @param endingBefore A pagination cursor to fetch the previous page of the list. The value must be a
   * ForwardingRequest ID.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A pagination cursor to fetch the next page of the list. The value must be a ForwardingRequest
   * ID.
   * @param options Execution options.
   */
  public suspend fun getForwardingRequestsWithResponse(
    request: JsonObject? = null,
    created: InlineV1ForwardingRequestsGetParameterX9a27da50? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetForwardingRequestsResponse> = executor.executeWithResponse<JsonObject?, GetForwardingRequestsResponse>(SdkExecutionRequest(getForwardingRequestsMetadata, baseUri, request, listOf(ForwardingCodecs.GETFORWARDINGREQUESTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created[gt]", values = created?.gt?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created[gte]", values = created?.gte?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created[lt]", values = created?.lt?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created[lte]", values = created?.lte?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), ForwardingCodecs.getForwardingRequestsRequestCodecRegistry, GetForwardingRequestsResponseDecoder, options)

  /**
   * <p>Retrieves a ForwardingRequest object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getForwardingRequestsIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetForwardingRequestsIdResponse> = executor.executeWithResponse<JsonObject?, GetForwardingRequestsIdResponse>(SdkExecutionRequest(getForwardingRequestsIdMetadata, baseUri, request, listOf(ForwardingCodecs.GETFORWARDINGREQUESTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), ForwardingCodecs.getForwardingRequestsIdRequestCodecRegistry, GetForwardingRequestsIdResponseDecoder, options)

  /**
   * <p>Creates a ForwardingRequest object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postForwardingRequestsWithResponse(request: InlineV1ForwardingRequestsPostRequestFormXe4abb4a8, options: CallOptions = CallOptions()): SdkResponseResult<PostForwardingRequestsResponse> = executor.executeWithResponse<InlineV1ForwardingRequestsPostRequestFormXe4abb4a8, PostForwardingRequestsResponse>(SdkExecutionRequest(postForwardingRequestsMetadata, baseUri, request, listOf(ForwardingCodecs.POSTFORWARDINGREQUESTS_REQUEST_CODEC_ID), emptyList()), ForwardingCodecs.postForwardingRequestsRequestCodecRegistry, PostForwardingRequestsResponseDecoder, options)

  /**
   * Typed response alternatives for `GetForwardingRequests`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetForwardingRequestsResponse {
    public class SuccessJson(
      public val json: InlineV1ForwardingRequestsGetResponse200JsonX84c350c4,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetForwardingRequestsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetForwardingRequestsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetForwardingRequestsResponse
  }

  private object GetForwardingRequestsResponseDecoder : SdkResponseAlternativeDecoder<GetForwardingRequestsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetForwardingRequestsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetForwardingRequestsResponse> = when {
      alternative.id == "GetForwardingRequests.response.alternative0" -> SdkResponseDecodeResult(
        value = GetForwardingRequestsResponse.SuccessJson(
          json = ForwardingCodecs.getForwardingRequestsResponseCodecAlternative0Registry.select(listOf("GetForwardingRequests.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetForwardingRequests.response.alternative1" -> SdkResponseDecodeResult(
        value = GetForwardingRequestsResponse.DefaultJson(
          json = ForwardingCodecs.getForwardingRequestsResponseCodecAlternative1Registry.select(listOf("GetForwardingRequests.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetForwardingRequestsResponse = GetForwardingRequestsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetForwardingRequestsId`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetForwardingRequestsIdResponse {
    public class SuccessJson(
      public val json: ForwardingRequest,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetForwardingRequestsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetForwardingRequestsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetForwardingRequestsIdResponse
  }

  private object GetForwardingRequestsIdResponseDecoder : SdkResponseAlternativeDecoder<GetForwardingRequestsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetForwardingRequestsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetForwardingRequestsIdResponse> = when {
      alternative.id == "GetForwardingRequestsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetForwardingRequestsIdResponse.SuccessJson(
          json = ForwardingCodecs.getForwardingRequestsIdResponseCodecAlternative0Registry.select(listOf("GetForwardingRequestsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetForwardingRequestsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetForwardingRequestsIdResponse.DefaultJson(
          json = ForwardingCodecs.getForwardingRequestsIdResponseCodecAlternative1Registry.select(listOf("GetForwardingRequestsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetForwardingRequestsIdResponse = GetForwardingRequestsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostForwardingRequests`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostForwardingRequestsResponse {
    public class SuccessJson(
      public val json: ForwardingRequest,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostForwardingRequestsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostForwardingRequestsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostForwardingRequestsResponse
  }

  private object PostForwardingRequestsResponseDecoder : SdkResponseAlternativeDecoder<PostForwardingRequestsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostForwardingRequestsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostForwardingRequestsResponse> = when {
      alternative.id == "PostForwardingRequests.response.alternative0" -> SdkResponseDecodeResult(
        value = PostForwardingRequestsResponse.SuccessJson(
          json = ForwardingCodecs.postForwardingRequestsResponseCodecAlternative0Registry.select(listOf("PostForwardingRequests.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostForwardingRequests.response.alternative1" -> SdkResponseDecodeResult(
        value = PostForwardingRequestsResponse.DefaultJson(
          json = ForwardingCodecs.postForwardingRequestsResponseCodecAlternative1Registry.select(listOf("PostForwardingRequests.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostForwardingRequestsResponse = PostForwardingRequestsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val getForwardingRequestsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetForwardingRequests",
          method = "GET",
          path = "/v1/forwarding/requests",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1ForwardingRequestsGetResponse200JsonX84c350c4",
              mode = SdkResponseMode.BUFFERED,
              id = "GetForwardingRequests.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetForwardingRequests.response.alternative1",
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

    public val getForwardingRequestsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetForwardingRequestsId",
          method = "GET",
          path = "/v1/forwarding/requests/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ForwardingRequest",
              mode = SdkResponseMode.BUFFERED,
              id = "GetForwardingRequestsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetForwardingRequestsId.response.alternative1",
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

    public val postForwardingRequestsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostForwardingRequests",
          method = "POST",
          path = "/v1/forwarding/requests",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ForwardingRequest",
              mode = SdkResponseMode.BUFFERED,
              id = "PostForwardingRequests.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostForwardingRequests.response.alternative1",
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
