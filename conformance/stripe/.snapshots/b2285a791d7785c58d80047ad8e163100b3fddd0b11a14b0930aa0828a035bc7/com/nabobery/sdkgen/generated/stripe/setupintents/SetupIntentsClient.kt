package com.nabobery.sdkgen.generated.stripe.setupintents

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsCancelPostRequestFormXde74045b
import com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsGetParameterX536b4840
import com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsGetResponse200JsonXeb399bcb
import com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d
import com.nabobery.sdkgen.generated.stripe.SdkJson
import com.nabobery.sdkgen.generated.stripe.SetupIntent
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

public object SetupIntentsCodecs {
  public const val GETSETUPINTENTS_REQUEST_CODEC_ID: String = "GetSetupIntents.request"

  private val getSetupIntentsRequestCodec: MediaTypeCodec<JsonObject?> = GetSetupIntentsFormCodec

  private val getSetupIntentsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1SetupIntentsGetResponse200JsonXeb399bcb> =
      KotlinxSerializationCodec("GetSetupIntents.response.alternative0", InlineV1SetupIntentsGetResponse200JsonXeb399bcb.Serializer, SdkJson)

  public val getSetupIntentsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1SetupIntentsGetResponse200JsonXeb399bcb> =
      MediaTypeCodecRegistry.of(getSetupIntentsResponseCodecAlternative0Codec)

  private val getSetupIntentsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetSetupIntents.response.alternative1", Error.Serializer, SdkJson)

  public val getSetupIntentsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getSetupIntentsResponseCodecAlternative1Codec)

  public val getSetupIntentsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getSetupIntentsRequestCodec)

  public const val GETSETUPINTENTSINTENT_REQUEST_CODEC_ID: String = "GetSetupIntentsIntent.request"

  private val getSetupIntentsIntentRequestCodec: MediaTypeCodec<JsonObject?> =
      GetSetupIntentsIntentFormCodec

  private val getSetupIntentsIntentResponseCodecAlternative0Codec: MediaTypeCodec<SetupIntent> =
      KotlinxSerializationCodec("GetSetupIntentsIntent.response.alternative0", SetupIntent.Serializer, SdkJson)

  public val getSetupIntentsIntentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SetupIntent> =
      MediaTypeCodecRegistry.of(getSetupIntentsIntentResponseCodecAlternative0Codec)

  private val getSetupIntentsIntentResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetSetupIntentsIntent.response.alternative1", Error.Serializer, SdkJson)

  public val getSetupIntentsIntentResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getSetupIntentsIntentResponseCodecAlternative1Codec)

  public val getSetupIntentsIntentRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getSetupIntentsIntentRequestCodec)

  public const val POSTSETUPINTENTSINTENTCANCEL_REQUEST_CODEC_ID: String =
      "PostSetupIntentsIntentCancel.request"

  private val postSetupIntentsIntentCancelRequestCodec:
      MediaTypeCodec<InlineV1SetupIntentsCancelPostRequestFormXde74045b?> =
      PostSetupIntentsIntentCancelFormCodec

  private val postSetupIntentsIntentCancelResponseCodecAlternative0Codec:
      MediaTypeCodec<SetupIntent> =
      KotlinxSerializationCodec("PostSetupIntentsIntentCancel.response.alternative0", SetupIntent.Serializer, SdkJson)

  public val postSetupIntentsIntentCancelResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SetupIntent> =
      MediaTypeCodecRegistry.of(postSetupIntentsIntentCancelResponseCodecAlternative0Codec)

  private val postSetupIntentsIntentCancelResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostSetupIntentsIntentCancel.response.alternative1", Error.Serializer, SdkJson)

  public val postSetupIntentsIntentCancelResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postSetupIntentsIntentCancelResponseCodecAlternative1Codec)

  public val postSetupIntentsIntentCancelRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1SetupIntentsCancelPostRequestFormXde74045b?> =
      MediaTypeCodecRegistry.of(postSetupIntentsIntentCancelRequestCodec)

  public const val POSTSETUPINTENTSINTENTVERIFYMICRODEPOSITS_REQUEST_CODEC_ID: String =
      "PostSetupIntentsIntentVerifyMicrodeposits.request"

  private val postSetupIntentsIntentVerifyMicrodepositsRequestCodec:
      MediaTypeCodec<InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d?> =
      PostSetupIntentsIntentVerifyMicrodepositsFormCodec

  private val postSetupIntentsIntentVerifyMicrodepositsResponseCodecAlternative0Codec:
      MediaTypeCodec<SetupIntent> =
      KotlinxSerializationCodec("PostSetupIntentsIntentVerifyMicrodeposits.response.alternative0", SetupIntent.Serializer, SdkJson)

  public val postSetupIntentsIntentVerifyMicrodepositsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SetupIntent> =
      MediaTypeCodecRegistry.of(postSetupIntentsIntentVerifyMicrodepositsResponseCodecAlternative0Codec)

  private val postSetupIntentsIntentVerifyMicrodepositsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostSetupIntentsIntentVerifyMicrodeposits.response.alternative1", Error.Serializer, SdkJson)

  public val postSetupIntentsIntentVerifyMicrodepositsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postSetupIntentsIntentVerifyMicrodepositsResponseCodecAlternative1Codec)

  public val postSetupIntentsIntentVerifyMicrodepositsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d?> =
      MediaTypeCodecRegistry.of(postSetupIntentsIntentVerifyMicrodepositsRequestCodec)

  public object GetSetupIntentsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetSetupIntents.request"

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

  public object GetSetupIntentsIntentFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetSetupIntentsIntent.request"

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

  public object PostSetupIntentsIntentCancelFormCodec : MediaTypeCodec<InlineV1SetupIntentsCancelPostRequestFormXde74045b?> {
    override val id: String = "PostSetupIntentsIntentCancel.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1SetupIntentsCancelPostRequestFormXde74045b?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.cancellationReason?.let { formValue0 ->
        form.add("cancellation_reason", formValue0.value)
      }
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1SetupIntentsCancelPostRequestFormXde74045b? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostSetupIntentsIntentVerifyMicrodepositsFormCodec : MediaTypeCodec<InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d?> {
    override val id: String = "PostSetupIntentsIntentVerifyMicrodeposits.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amounts?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("amounts", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("amounts" + "[" + formIndex1 + "]", formElement1.toString())
          }
        }
      }
      request.clientSecret?.let { formValue0 ->
        form.add("client_secret", formValue0)
      }
      request.descriptorCode?.let { formValue0 ->
        form.add("descriptor_code", formValue0)
      }
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'setup_intents' group of Stripe API.
 */
public class SetupIntentsClient(
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
      SdkExecutor(transport, authentication = this@SetupIntentsClient.authentication)

  /**
   * <p>Returns a list of SetupIntents.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param attachToSelf If present, the SetupIntent's payment method will be attached to the in-context Stripe Account.
   *
   * It can only be used for this Stripe Account’s own money movement flows like InboundTransfer and OutboundTransfers.
   * It cannot be set to true when setting up a PaymentMethod for a Customer, and defaults to false when attaching a
   * PaymentMethod to a Customer.
   * @param created A filter on the list, based on the object `created` field. The value can be a string with an integer
   * Unix timestamp, or it can be a dictionary with a number of different query options.
   * @param customer Only return SetupIntents for the customer specified by this customer ID.
   * @param customerAccount Only return SetupIntents for the account specified by this customer ID.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param paymentMethod Only return SetupIntents that associate with the specified payment method.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getSetupIntentsWithResponse(
    request: JsonObject? = null,
    attachToSelf: Boolean? = null,
    created: InlineV1SetupIntentsGetParameterX536b4840? = null,
    customer: String? = null,
    customerAccount: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    paymentMethod: String? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetSetupIntentsResponse> = executor.executeWithResponse<JsonObject?, GetSetupIntentsResponse>(SdkExecutionRequest(getSetupIntentsMetadata, baseUri, request, listOf(SetupIntentsCodecs.GETSETUPINTENTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "attach_to_self", values = attachToSelf?.let { listOf(it.toString()) }.orEmpty()))
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
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "payment_method", values = paymentMethod?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), SetupIntentsCodecs.getSetupIntentsRequestCodecRegistry, GetSetupIntentsResponseDecoder, options)

  /**
   * <p>Retrieves the details of a SetupIntent that has previously been created. </p>
   *
   * <p>Client-side retrieval using a publishable key is allowed when the <code>client_secret</code> is provided in the
   * query string. </p>
   *
   * <p>When retrieved with a publishable key, only a subset of properties will be returned. Please refer to the <a
   * href="#setup_intent_object">SetupIntent</a> object reference for more details.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param intent Wire parameter `intent`.
   * @param clientSecret The client secret of the SetupIntent. We require this string if you use a publishable key to
   * retrieve the SetupIntent.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getSetupIntentsIntentWithResponse(
    request: JsonObject? = null,
    intent: String,
    clientSecret: String? = null,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetSetupIntentsIntentResponse> = executor.executeWithResponse<JsonObject?, GetSetupIntentsIntentResponse>(SdkExecutionRequest(getSetupIntentsIntentMetadata, baseUri, request, listOf(SetupIntentsCodecs.GETSETUPINTENTSINTENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "intent", values = listOf(intent.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "client_secret", values = clientSecret?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), SetupIntentsCodecs.getSetupIntentsIntentRequestCodecRegistry, GetSetupIntentsIntentResponseDecoder, options)

  /**
   * <p>You can cancel a SetupIntent object when it’s in one of these statuses: <code>requires_payment_method</code>,
   * <code>requires_confirmation</code>, or <code>requires_action</code>. </p>
   *
   * <p>After you cancel it, setup is abandoned and any operations on the SetupIntent fail with an error. You can’t
   * cancel the SetupIntent for a Checkout Session. <a href="/docs/api/checkout/sessions/expire">Expire the Checkout
   * Session</a> instead.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param intent Wire parameter `intent`.
   * @param options Execution options.
   */
  public suspend fun postSetupIntentsIntentCancelWithResponse(
    request: InlineV1SetupIntentsCancelPostRequestFormXde74045b? = null,
    intent: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostSetupIntentsIntentCancelResponse> = executor.executeWithResponse<InlineV1SetupIntentsCancelPostRequestFormXde74045b?, PostSetupIntentsIntentCancelResponse>(SdkExecutionRequest(postSetupIntentsIntentCancelMetadata, baseUri, request, listOf(SetupIntentsCodecs.POSTSETUPINTENTSINTENTCANCEL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "intent", values = listOf(intent.toString())))
  }), SetupIntentsCodecs.postSetupIntentsIntentCancelRequestCodecRegistry, PostSetupIntentsIntentCancelResponseDecoder, options)

  /**
   * <p>Verifies microdeposits on a SetupIntent object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param intent Wire parameter `intent`.
   * @param options Execution options.
   */
  public suspend fun postSetupIntentsIntentVerifyMicrodepositsWithResponse(
    request: InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d? = null,
    intent: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostSetupIntentsIntentVerifyMicrodepositsResponse> = executor.executeWithResponse<InlineV1SetupIntentsVerifyMicrodepositsPostRequestFormX01f1f47d?, PostSetupIntentsIntentVerifyMicrodepositsResponse>(SdkExecutionRequest(postSetupIntentsIntentVerifyMicrodepositsMetadata, baseUri, request, listOf(SetupIntentsCodecs.POSTSETUPINTENTSINTENTVERIFYMICRODEPOSITS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "intent", values = listOf(intent.toString())))
  }), SetupIntentsCodecs.postSetupIntentsIntentVerifyMicrodepositsRequestCodecRegistry, PostSetupIntentsIntentVerifyMicrodepositsResponseDecoder, options)

  /**
   * Typed response alternatives for `GetSetupIntents`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetSetupIntentsResponse {
    public class SuccessJson(
      public val json: InlineV1SetupIntentsGetResponse200JsonXeb399bcb,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSetupIntentsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSetupIntentsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSetupIntentsResponse
  }

  private object GetSetupIntentsResponseDecoder : SdkResponseAlternativeDecoder<GetSetupIntentsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetSetupIntentsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetSetupIntentsResponse> = when {
      alternative.id == "GetSetupIntents.response.alternative0" -> SdkResponseDecodeResult(
        value = GetSetupIntentsResponse.SuccessJson(
          json = SetupIntentsCodecs.getSetupIntentsResponseCodecAlternative0Registry.select(listOf("GetSetupIntents.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetSetupIntents.response.alternative1" -> SdkResponseDecodeResult(
        value = GetSetupIntentsResponse.DefaultJson(
          json = SetupIntentsCodecs.getSetupIntentsResponseCodecAlternative1Registry.select(listOf("GetSetupIntents.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetSetupIntentsResponse = GetSetupIntentsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetSetupIntentsIntent`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetSetupIntentsIntentResponse {
    public class SuccessJson(
      public val json: SetupIntent,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSetupIntentsIntentResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSetupIntentsIntentResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSetupIntentsIntentResponse
  }

  private object GetSetupIntentsIntentResponseDecoder : SdkResponseAlternativeDecoder<GetSetupIntentsIntentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetSetupIntentsIntentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetSetupIntentsIntentResponse> = when {
      alternative.id == "GetSetupIntentsIntent.response.alternative0" -> SdkResponseDecodeResult(
        value = GetSetupIntentsIntentResponse.SuccessJson(
          json = SetupIntentsCodecs.getSetupIntentsIntentResponseCodecAlternative0Registry.select(listOf("GetSetupIntentsIntent.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetSetupIntentsIntent.response.alternative1" -> SdkResponseDecodeResult(
        value = GetSetupIntentsIntentResponse.DefaultJson(
          json = SetupIntentsCodecs.getSetupIntentsIntentResponseCodecAlternative1Registry.select(listOf("GetSetupIntentsIntent.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetSetupIntentsIntentResponse = GetSetupIntentsIntentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostSetupIntentsIntentCancel`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostSetupIntentsIntentCancelResponse {
    public class SuccessJson(
      public val json: SetupIntent,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSetupIntentsIntentCancelResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSetupIntentsIntentCancelResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSetupIntentsIntentCancelResponse
  }

  private object PostSetupIntentsIntentCancelResponseDecoder : SdkResponseAlternativeDecoder<PostSetupIntentsIntentCancelResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostSetupIntentsIntentCancelResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostSetupIntentsIntentCancelResponse> = when {
      alternative.id == "PostSetupIntentsIntentCancel.response.alternative0" -> SdkResponseDecodeResult(
        value = PostSetupIntentsIntentCancelResponse.SuccessJson(
          json = SetupIntentsCodecs.postSetupIntentsIntentCancelResponseCodecAlternative0Registry.select(listOf("PostSetupIntentsIntentCancel.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostSetupIntentsIntentCancel.response.alternative1" -> SdkResponseDecodeResult(
        value = PostSetupIntentsIntentCancelResponse.DefaultJson(
          json = SetupIntentsCodecs.postSetupIntentsIntentCancelResponseCodecAlternative1Registry.select(listOf("PostSetupIntentsIntentCancel.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostSetupIntentsIntentCancelResponse = PostSetupIntentsIntentCancelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostSetupIntentsIntentVerifyMicrodeposits`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostSetupIntentsIntentVerifyMicrodepositsResponse {
    public class SuccessJson(
      public val json: SetupIntent,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSetupIntentsIntentVerifyMicrodepositsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSetupIntentsIntentVerifyMicrodepositsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSetupIntentsIntentVerifyMicrodepositsResponse
  }

  private object PostSetupIntentsIntentVerifyMicrodepositsResponseDecoder : SdkResponseAlternativeDecoder<PostSetupIntentsIntentVerifyMicrodepositsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostSetupIntentsIntentVerifyMicrodepositsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostSetupIntentsIntentVerifyMicrodepositsResponse> = when {
      alternative.id == "PostSetupIntentsIntentVerifyMicrodeposits.response.alternative0" -> SdkResponseDecodeResult(
        value = PostSetupIntentsIntentVerifyMicrodepositsResponse.SuccessJson(
          json = SetupIntentsCodecs.postSetupIntentsIntentVerifyMicrodepositsResponseCodecAlternative0Registry.select(listOf("PostSetupIntentsIntentVerifyMicrodeposits.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostSetupIntentsIntentVerifyMicrodeposits.response.alternative1" -> SdkResponseDecodeResult(
        value = PostSetupIntentsIntentVerifyMicrodepositsResponse.DefaultJson(
          json = SetupIntentsCodecs.postSetupIntentsIntentVerifyMicrodepositsResponseCodecAlternative1Registry.select(listOf("PostSetupIntentsIntentVerifyMicrodeposits.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostSetupIntentsIntentVerifyMicrodepositsResponse = PostSetupIntentsIntentVerifyMicrodepositsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val getSetupIntentsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetSetupIntents",
          method = "GET",
          path = "/v1/setup_intents",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1SetupIntentsGetResponse200JsonXeb399bcb",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSetupIntents.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSetupIntents.response.alternative1",
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

    public val getSetupIntentsIntentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetSetupIntentsIntent",
          method = "GET",
          path = "/v1/setup_intents/{intent}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SetupIntent",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSetupIntentsIntent.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSetupIntentsIntent.response.alternative1",
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

    public val postSetupIntentsIntentCancelMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostSetupIntentsIntentCancel",
          method = "POST",
          path = "/v1/setup_intents/{intent}/cancel",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SetupIntent",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSetupIntentsIntentCancel.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSetupIntentsIntentCancel.response.alternative1",
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

    public val postSetupIntentsIntentVerifyMicrodepositsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostSetupIntentsIntentVerifyMicrodeposits",
          method = "POST",
          path = "/v1/setup_intents/{intent}/verify_microdeposits",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SetupIntent",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSetupIntentsIntentVerifyMicrodeposits.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSetupIntentsIntentVerifyMicrodeposits.response.alternative1",
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
