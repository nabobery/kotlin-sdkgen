package com.nabobery.sdkgen.generated.stripe.events

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.Event
import com.nabobery.sdkgen.generated.stripe.InlineV1EventsGetParameterX0238b28f
import com.nabobery.sdkgen.generated.stripe.InlineV1EventsGetResponse200JsonX3e0b7a5f
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
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object EventsCodecs {
  internal const val GETEVENTS_REQUEST_CODEC_ID: String = "GetEvents.request"

  private val getEventsRequestCodec: MediaTypeCodec<JsonObject?> = GetEventsFormCodec

  private val getEventsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1EventsGetResponse200JsonX3e0b7a5f> =
      KotlinxSerializationCodec("GetEvents.response.alternative0", InlineV1EventsGetResponse200JsonX3e0b7a5f.Serializer, SdkJson)

  internal val getEventsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1EventsGetResponse200JsonX3e0b7a5f> =
      MediaTypeCodecRegistry.of(getEventsResponseCodecAlternative0Codec)

  private val getEventsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetEvents.response.alternative1", Error.Serializer, SdkJson)

  internal val getEventsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getEventsResponseCodecAlternative1Codec)

  internal val getEventsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getEventsRequestCodec)

  internal const val GETEVENTSID_REQUEST_CODEC_ID: String = "GetEventsId.request"

  private val getEventsIdRequestCodec: MediaTypeCodec<JsonObject?> = GetEventsIdFormCodec

  private val getEventsIdResponseCodecAlternative0Codec: MediaTypeCodec<Event> =
      KotlinxSerializationCodec("GetEventsId.response.alternative0", Event.Serializer, SdkJson)

  internal val getEventsIdResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Event> =
      MediaTypeCodecRegistry.of(getEventsIdResponseCodecAlternative0Codec)

  private val getEventsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetEventsId.response.alternative1", Error.Serializer, SdkJson)

  internal val getEventsIdResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getEventsIdResponseCodecAlternative1Codec)

  internal val getEventsIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getEventsIdRequestCodec)

  internal object GetEventsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetEvents.request"

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

  internal object GetEventsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetEventsId.request"

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
}

/**
 * Client for the 'events' group of Stripe API.
 */
public class EventsClient(
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
      SdkExecutor(transport, authentication = this@EventsClient.authentication)

  /**
   * <p>List events, going back up to 30 days. Each event data is rendered according to Stripe API version at its
   * creation time, specified in <a href="https://docs.stripe.com/api/events/object">event object</a>
   * <code>api_version</code> attribute (not according to your current Stripe API version or <code>Stripe-Version</code>
   * header).</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return events that were created during the given date interval.
   * @param deliverySuccess Filter events by whether all webhooks were successfully delivered. If false, events which
   * are still pending or have failed all delivery attempts to a webhook endpoint will be returned.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param type A string containing a specific event name, or group of events using * as a wildcard. The list will be
   * filtered to include only events with a matching event property.
   * @param types An array of up to 20 strings containing specific event names. The list will be filtered to include
   * only events with a matching event property. You may pass either `type` or `types`, but not both.
   * @param options Execution options.
   */
  public suspend fun getEventsWithResponse(
    request: JsonObject? = null,
    created: InlineV1EventsGetParameterX0238b28f? = null,
    deliverySuccess: Boolean? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    type: String? = null,
    types: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetEventsResponse> = executor.executeWithResponse<JsonObject?, GetEventsResponse>(SdkExecutionRequest(getEventsMetadata, baseUri, request, listOf(EventsCodecs.GETEVENTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "delivery_success", values = deliverySuccess?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "type", values = type?.let { listOf(it.toString()) }.orEmpty()))
    types?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "types" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), EventsCodecs.getEventsRequestCodecRegistry, GetEventsResponseDecoder, options)

  /**
   * <p>Retrieves the details of an event if it was created in the last 30 days. Supply the unique identifier of the
   * event, which you might have received in a webhook.</p>
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
  public suspend fun getEventsIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetEventsIdResponse> = executor.executeWithResponse<JsonObject?, GetEventsIdResponse>(SdkExecutionRequest(getEventsIdMetadata, baseUri, request, listOf(EventsCodecs.GETEVENTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), EventsCodecs.getEventsIdRequestCodecRegistry, GetEventsIdResponseDecoder, options)

  /**
   * Typed response alternatives for `GetEvents`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetEventsResponse {
    public class SuccessJson(
      public val json: InlineV1EventsGetResponse200JsonX3e0b7a5f,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetEventsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetEventsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetEventsResponse
  }

  private object GetEventsResponseDecoder : SdkResponseAlternativeDecoder<GetEventsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetEventsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetEventsResponse> = when {
      alternative.id == "GetEvents.response.alternative0" -> SdkResponseDecodeResult(
        value = GetEventsResponse.SuccessJson(
          json = EventsCodecs.getEventsResponseCodecAlternative0Registry.select(listOf("GetEvents.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetEvents.response.alternative1" -> SdkResponseDecodeResult(
        value = GetEventsResponse.DefaultJson(
          json = EventsCodecs.getEventsResponseCodecAlternative1Registry.select(listOf("GetEvents.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetEventsResponse = GetEventsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetEventsId`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetEventsIdResponse {
    public class SuccessJson(
      public val json: Event,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetEventsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetEventsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetEventsIdResponse
  }

  private object GetEventsIdResponseDecoder : SdkResponseAlternativeDecoder<GetEventsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetEventsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetEventsIdResponse> = when {
      alternative.id == "GetEventsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetEventsIdResponse.SuccessJson(
          json = EventsCodecs.getEventsIdResponseCodecAlternative0Registry.select(listOf("GetEventsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetEventsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetEventsIdResponse.DefaultJson(
          json = EventsCodecs.getEventsIdResponseCodecAlternative1Registry.select(listOf("GetEventsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetEventsIdResponse = GetEventsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getEventsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetEvents",
          method = "GET",
          path = "/v1/events",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1EventsGetResponse200JsonX3e0b7a5f",
              mode = SdkResponseMode.BUFFERED,
              id = "GetEvents.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetEvents.response.alternative1",
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

    internal val getEventsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetEventsId",
          method = "GET",
          path = "/v1/events/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Event",
              mode = SdkResponseMode.BUFFERED,
              id = "GetEventsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetEventsId.response.alternative1",
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
  }
}
