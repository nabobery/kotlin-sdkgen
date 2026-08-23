package com.nabobery.sdkgen.generated.stripe.subscriptionschedules

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesGetParameterX1be8e61a
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesGetParameterX38d17dac
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesGetParameterX4f6480de
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesGetParameterXaf4a9123
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesGetResponse200JsonXad898741
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79
import com.nabobery.sdkgen.generated.stripe.SdkJson
import com.nabobery.sdkgen.generated.stripe.SubscriptionSchedule
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

internal object SubscriptionSchedulesCodecs {
  internal const val GETSUBSCRIPTIONSCHEDULES_REQUEST_CODEC_ID: String =
      "GetSubscriptionSchedules.request"

  private val getSubscriptionSchedulesRequestCodec: MediaTypeCodec<JsonObject?> =
      GetSubscriptionSchedulesFormCodec

  private val getSubscriptionSchedulesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1SubscriptionSchedulesGetResponse200JsonXad898741> =
      KotlinxSerializationCodec("GetSubscriptionSchedules.response.alternative0", InlineV1SubscriptionSchedulesGetResponse200JsonXad898741.Serializer, SdkJson)

  internal val getSubscriptionSchedulesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1SubscriptionSchedulesGetResponse200JsonXad898741> =
      MediaTypeCodecRegistry.of(getSubscriptionSchedulesResponseCodecAlternative0Codec)

  private val getSubscriptionSchedulesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetSubscriptionSchedules.response.alternative1", Error.Serializer, SdkJson)

  internal val getSubscriptionSchedulesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getSubscriptionSchedulesResponseCodecAlternative1Codec)

  internal val getSubscriptionSchedulesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getSubscriptionSchedulesRequestCodec)

  internal const val GETSUBSCRIPTIONSCHEDULESSCHEDULE_REQUEST_CODEC_ID: String =
      "GetSubscriptionSchedulesSchedule.request"

  private val getSubscriptionSchedulesScheduleRequestCodec: MediaTypeCodec<JsonObject?> =
      GetSubscriptionSchedulesScheduleFormCodec

  private val getSubscriptionSchedulesScheduleResponseCodecAlternative0Codec:
      MediaTypeCodec<SubscriptionSchedule> =
      KotlinxSerializationCodec("GetSubscriptionSchedulesSchedule.response.alternative0", SubscriptionSchedule.Serializer, SdkJson)

  internal val getSubscriptionSchedulesScheduleResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SubscriptionSchedule> =
      MediaTypeCodecRegistry.of(getSubscriptionSchedulesScheduleResponseCodecAlternative0Codec)

  private val getSubscriptionSchedulesScheduleResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("GetSubscriptionSchedulesSchedule.response.alternative1", Error.Serializer, SdkJson)

  internal val getSubscriptionSchedulesScheduleResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getSubscriptionSchedulesScheduleResponseCodecAlternative1Codec)

  internal val getSubscriptionSchedulesScheduleRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getSubscriptionSchedulesScheduleRequestCodec)

  internal const val POSTSUBSCRIPTIONSCHEDULESSCHEDULECANCEL_REQUEST_CODEC_ID: String =
      "PostSubscriptionSchedulesScheduleCancel.request"

  private val postSubscriptionSchedulesScheduleCancelRequestCodec:
      MediaTypeCodec<InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3?> =
      PostSubscriptionSchedulesScheduleCancelFormCodec

  private val postSubscriptionSchedulesScheduleCancelResponseCodecAlternative0Codec:
      MediaTypeCodec<SubscriptionSchedule> =
      KotlinxSerializationCodec("PostSubscriptionSchedulesScheduleCancel.response.alternative0", SubscriptionSchedule.Serializer, SdkJson)

  internal val postSubscriptionSchedulesScheduleCancelResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SubscriptionSchedule> =
      MediaTypeCodecRegistry.of(postSubscriptionSchedulesScheduleCancelResponseCodecAlternative0Codec)

  private val postSubscriptionSchedulesScheduleCancelResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostSubscriptionSchedulesScheduleCancel.response.alternative1", Error.Serializer, SdkJson)

  internal val postSubscriptionSchedulesScheduleCancelResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postSubscriptionSchedulesScheduleCancelResponseCodecAlternative1Codec)

  internal val postSubscriptionSchedulesScheduleCancelRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3?> =
      MediaTypeCodecRegistry.of(postSubscriptionSchedulesScheduleCancelRequestCodec)

  internal const val POSTSUBSCRIPTIONSCHEDULESSCHEDULERELEASE_REQUEST_CODEC_ID: String =
      "PostSubscriptionSchedulesScheduleRelease.request"

  private val postSubscriptionSchedulesScheduleReleaseRequestCodec:
      MediaTypeCodec<InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79?> =
      PostSubscriptionSchedulesScheduleReleaseFormCodec

  private val postSubscriptionSchedulesScheduleReleaseResponseCodecAlternative0Codec:
      MediaTypeCodec<SubscriptionSchedule> =
      KotlinxSerializationCodec("PostSubscriptionSchedulesScheduleRelease.response.alternative0", SubscriptionSchedule.Serializer, SdkJson)

  internal val postSubscriptionSchedulesScheduleReleaseResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SubscriptionSchedule> =
      MediaTypeCodecRegistry.of(postSubscriptionSchedulesScheduleReleaseResponseCodecAlternative0Codec)

  private val postSubscriptionSchedulesScheduleReleaseResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostSubscriptionSchedulesScheduleRelease.response.alternative1", Error.Serializer, SdkJson)

  internal val postSubscriptionSchedulesScheduleReleaseResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postSubscriptionSchedulesScheduleReleaseResponseCodecAlternative1Codec)

  internal val postSubscriptionSchedulesScheduleReleaseRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79?> =
      MediaTypeCodecRegistry.of(postSubscriptionSchedulesScheduleReleaseRequestCodec)

  internal object GetSubscriptionSchedulesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetSubscriptionSchedules.request"

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

  internal object GetSubscriptionSchedulesScheduleFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetSubscriptionSchedulesSchedule.request"

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

  internal object PostSubscriptionSchedulesScheduleCancelFormCodec : MediaTypeCodec<InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3?> {
    override val id: String = "PostSubscriptionSchedulesScheduleCancel.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3?, mediaType: String): SdkRequestBody {
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
      request.invoiceNow?.let { formValue0 ->
        form.add("invoice_now", formValue0.toString())
      }
      request.prorate?.let { formValue0 ->
        form.add("prorate", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostSubscriptionSchedulesScheduleReleaseFormCodec : MediaTypeCodec<InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79?> {
    override val id: String = "PostSubscriptionSchedulesScheduleRelease.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79?, mediaType: String): SdkRequestBody {
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
      request.preserveCancelDate?.let { formValue0 ->
        form.add("preserve_cancel_date", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'subscription_schedules' group of Stripe API.
 */
public class SubscriptionSchedulesClient(
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
      SdkExecutor(transport, authentication = this@SubscriptionSchedulesClient.authentication)

  /**
   * <p>Retrieves the list of your subscription schedules.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param canceledAt Only return subscription schedules that were created canceled the given date interval.
   * @param completedAt Only return subscription schedules that completed during the given date interval.
   * @param created Only return subscription schedules that were created during the given date interval.
   * @param customer Only return subscription schedules for the given customer.
   * @param customerAccount Only return subscription schedules for the given account.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param releasedAt Only return subscription schedules that were released during the given date interval.
   * @param scheduled Only return subscription schedules that have not started yet.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getSubscriptionSchedulesWithResponse(
    request: JsonObject? = null,
    canceledAt: InlineV1SubscriptionSchedulesGetParameterX38d17dac? = null,
    completedAt: InlineV1SubscriptionSchedulesGetParameterXaf4a9123? = null,
    created: InlineV1SubscriptionSchedulesGetParameterX1be8e61a? = null,
    customer: String? = null,
    customerAccount: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    releasedAt: InlineV1SubscriptionSchedulesGetParameterX4f6480de? = null,
    scheduled: Boolean? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetSubscriptionSchedulesResponse> = executor.executeWithResponse<JsonObject?, GetSubscriptionSchedulesResponse>(SdkExecutionRequest(getSubscriptionSchedulesMetadata, baseUri, request, listOf(SubscriptionSchedulesCodecs.GETSUBSCRIPTIONSCHEDULES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "canceled_at", values = canceledAt?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "completed_at", values = completedAt?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer", values = customer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer_account", values = customerAccount?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "released_at", values = releasedAt?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "scheduled", values = scheduled?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), SubscriptionSchedulesCodecs.getSubscriptionSchedulesRequestCodecRegistry, GetSubscriptionSchedulesResponseDecoder, options)

  /**
   * <p>Retrieves the details of an existing subscription schedule. You only need to supply the unique subscription
   * schedule identifier that was returned upon subscription schedule creation.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param schedule Wire parameter `schedule`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getSubscriptionSchedulesScheduleWithResponse(
    request: JsonObject? = null,
    schedule: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetSubscriptionSchedulesScheduleResponse> = executor.executeWithResponse<JsonObject?, GetSubscriptionSchedulesScheduleResponse>(SdkExecutionRequest(getSubscriptionSchedulesScheduleMetadata, baseUri, request, listOf(SubscriptionSchedulesCodecs.GETSUBSCRIPTIONSCHEDULESSCHEDULE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "schedule", values = listOf(schedule.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), SubscriptionSchedulesCodecs.getSubscriptionSchedulesScheduleRequestCodecRegistry, GetSubscriptionSchedulesScheduleResponseDecoder, options)

  /**
   * <p>Cancels a subscription schedule and its associated subscription immediately (if the subscription schedule has an
   * active subscription). A subscription schedule can only be canceled if its status is <code>not_started</code> or
   * <code>active</code>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param schedule Wire parameter `schedule`.
   * @param options Execution options.
   */
  public suspend fun postSubscriptionSchedulesScheduleCancelWithResponse(
    request: InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3? = null,
    schedule: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostSubscriptionSchedulesScheduleCancelResponse> = executor.executeWithResponse<InlineV1SubscriptionSchedulesCancelPostRequestFormXdb19d6b3?, PostSubscriptionSchedulesScheduleCancelResponse>(SdkExecutionRequest(postSubscriptionSchedulesScheduleCancelMetadata, baseUri, request, listOf(SubscriptionSchedulesCodecs.POSTSUBSCRIPTIONSCHEDULESSCHEDULECANCEL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "schedule", values = listOf(schedule.toString())))
  }), SubscriptionSchedulesCodecs.postSubscriptionSchedulesScheduleCancelRequestCodecRegistry, PostSubscriptionSchedulesScheduleCancelResponseDecoder, options)

  /**
   * <p>Releases the subscription schedule immediately, which will stop scheduling of its phases, but leave any existing
   * subscription in place. A schedule can only be released if its status is <code>not_started</code> or
   * <code>active</code>. If the subscription schedule is currently associated with a subscription, releasing it will
   * remove its <code>subscription</code> property and set the subscription’s ID to the
   * <code>released_subscription</code> property.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param schedule Wire parameter `schedule`.
   * @param options Execution options.
   */
  public suspend fun postSubscriptionSchedulesScheduleReleaseWithResponse(
    request: InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79? = null,
    schedule: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostSubscriptionSchedulesScheduleReleaseResponse> = executor.executeWithResponse<InlineV1SubscriptionSchedulesReleasePostRequestFormX598b2e79?, PostSubscriptionSchedulesScheduleReleaseResponse>(SdkExecutionRequest(postSubscriptionSchedulesScheduleReleaseMetadata, baseUri, request, listOf(SubscriptionSchedulesCodecs.POSTSUBSCRIPTIONSCHEDULESSCHEDULERELEASE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "schedule", values = listOf(schedule.toString())))
  }), SubscriptionSchedulesCodecs.postSubscriptionSchedulesScheduleReleaseRequestCodecRegistry, PostSubscriptionSchedulesScheduleReleaseResponseDecoder, options)

  /**
   * Typed response alternatives for `GetSubscriptionSchedules`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetSubscriptionSchedulesResponse {
    public class SuccessJson(
      public val json: InlineV1SubscriptionSchedulesGetResponse200JsonXad898741,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionSchedulesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionSchedulesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionSchedulesResponse
  }

  private object GetSubscriptionSchedulesResponseDecoder : SdkResponseAlternativeDecoder<GetSubscriptionSchedulesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetSubscriptionSchedulesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetSubscriptionSchedulesResponse> = when {
      alternative.id == "GetSubscriptionSchedules.response.alternative0" -> SdkResponseDecodeResult(
        value = GetSubscriptionSchedulesResponse.SuccessJson(
          json = SubscriptionSchedulesCodecs.getSubscriptionSchedulesResponseCodecAlternative0Registry.select(listOf("GetSubscriptionSchedules.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetSubscriptionSchedules.response.alternative1" -> SdkResponseDecodeResult(
        value = GetSubscriptionSchedulesResponse.DefaultJson(
          json = SubscriptionSchedulesCodecs.getSubscriptionSchedulesResponseCodecAlternative1Registry.select(listOf("GetSubscriptionSchedules.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetSubscriptionSchedulesResponse = GetSubscriptionSchedulesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetSubscriptionSchedulesSchedule`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetSubscriptionSchedulesScheduleResponse {
    public class SuccessJson(
      public val json: SubscriptionSchedule,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionSchedulesScheduleResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionSchedulesScheduleResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionSchedulesScheduleResponse
  }

  private object GetSubscriptionSchedulesScheduleResponseDecoder : SdkResponseAlternativeDecoder<GetSubscriptionSchedulesScheduleResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetSubscriptionSchedulesScheduleResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetSubscriptionSchedulesScheduleResponse> = when {
      alternative.id == "GetSubscriptionSchedulesSchedule.response.alternative0" -> SdkResponseDecodeResult(
        value = GetSubscriptionSchedulesScheduleResponse.SuccessJson(
          json = SubscriptionSchedulesCodecs.getSubscriptionSchedulesScheduleResponseCodecAlternative0Registry.select(listOf("GetSubscriptionSchedulesSchedule.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetSubscriptionSchedulesSchedule.response.alternative1" -> SdkResponseDecodeResult(
        value = GetSubscriptionSchedulesScheduleResponse.DefaultJson(
          json = SubscriptionSchedulesCodecs.getSubscriptionSchedulesScheduleResponseCodecAlternative1Registry.select(listOf("GetSubscriptionSchedulesSchedule.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetSubscriptionSchedulesScheduleResponse = GetSubscriptionSchedulesScheduleResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostSubscriptionSchedulesScheduleCancel`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostSubscriptionSchedulesScheduleCancelResponse {
    public class SuccessJson(
      public val json: SubscriptionSchedule,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSubscriptionSchedulesScheduleCancelResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSubscriptionSchedulesScheduleCancelResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSubscriptionSchedulesScheduleCancelResponse
  }

  private object PostSubscriptionSchedulesScheduleCancelResponseDecoder : SdkResponseAlternativeDecoder<PostSubscriptionSchedulesScheduleCancelResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostSubscriptionSchedulesScheduleCancelResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostSubscriptionSchedulesScheduleCancelResponse> = when {
      alternative.id == "PostSubscriptionSchedulesScheduleCancel.response.alternative0" -> SdkResponseDecodeResult(
        value = PostSubscriptionSchedulesScheduleCancelResponse.SuccessJson(
          json = SubscriptionSchedulesCodecs.postSubscriptionSchedulesScheduleCancelResponseCodecAlternative0Registry.select(listOf("PostSubscriptionSchedulesScheduleCancel.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostSubscriptionSchedulesScheduleCancel.response.alternative1" -> SdkResponseDecodeResult(
        value = PostSubscriptionSchedulesScheduleCancelResponse.DefaultJson(
          json = SubscriptionSchedulesCodecs.postSubscriptionSchedulesScheduleCancelResponseCodecAlternative1Registry.select(listOf("PostSubscriptionSchedulesScheduleCancel.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostSubscriptionSchedulesScheduleCancelResponse = PostSubscriptionSchedulesScheduleCancelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostSubscriptionSchedulesScheduleRelease`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostSubscriptionSchedulesScheduleReleaseResponse {
    public class SuccessJson(
      public val json: SubscriptionSchedule,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSubscriptionSchedulesScheduleReleaseResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSubscriptionSchedulesScheduleReleaseResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSubscriptionSchedulesScheduleReleaseResponse
  }

  private object PostSubscriptionSchedulesScheduleReleaseResponseDecoder : SdkResponseAlternativeDecoder<PostSubscriptionSchedulesScheduleReleaseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostSubscriptionSchedulesScheduleReleaseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostSubscriptionSchedulesScheduleReleaseResponse> = when {
      alternative.id == "PostSubscriptionSchedulesScheduleRelease.response.alternative0" -> SdkResponseDecodeResult(
        value = PostSubscriptionSchedulesScheduleReleaseResponse.SuccessJson(
          json = SubscriptionSchedulesCodecs.postSubscriptionSchedulesScheduleReleaseResponseCodecAlternative0Registry.select(listOf("PostSubscriptionSchedulesScheduleRelease.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostSubscriptionSchedulesScheduleRelease.response.alternative1" -> SdkResponseDecodeResult(
        value = PostSubscriptionSchedulesScheduleReleaseResponse.DefaultJson(
          json = SubscriptionSchedulesCodecs.postSubscriptionSchedulesScheduleReleaseResponseCodecAlternative1Registry.select(listOf("PostSubscriptionSchedulesScheduleRelease.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostSubscriptionSchedulesScheduleReleaseResponse = PostSubscriptionSchedulesScheduleReleaseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getSubscriptionSchedulesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetSubscriptionSchedules",
          method = "GET",
          path = "/v1/subscription_schedules",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1SubscriptionSchedulesGetResponse200JsonXad898741",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSubscriptionSchedules.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSubscriptionSchedules.response.alternative1",
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

    internal val getSubscriptionSchedulesScheduleMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetSubscriptionSchedulesSchedule",
          method = "GET",
          path = "/v1/subscription_schedules/{schedule}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SubscriptionSchedule",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSubscriptionSchedulesSchedule.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSubscriptionSchedulesSchedule.response.alternative1",
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

    internal val postSubscriptionSchedulesScheduleCancelMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostSubscriptionSchedulesScheduleCancel",
          method = "POST",
          path = "/v1/subscription_schedules/{schedule}/cancel",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SubscriptionSchedule",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSubscriptionSchedulesScheduleCancel.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSubscriptionSchedulesScheduleCancel.response.alternative1",
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

    internal val postSubscriptionSchedulesScheduleReleaseMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostSubscriptionSchedulesScheduleRelease",
          method = "POST",
          path = "/v1/subscription_schedules/{schedule}/release",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SubscriptionSchedule",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSubscriptionSchedulesScheduleRelease.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSubscriptionSchedulesScheduleRelease.response.alternative1",
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
