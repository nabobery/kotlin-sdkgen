package com.nabobery.sdkgen.generated.stripe.paymentintents

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsAmountDetailsLineItemsGetResponse200JsonX606f73f3
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsCancelPostRequestFormXbb20ac6e
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsGetParameterXb259e3ef
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsGetResponse200JsonX963f82da
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsSearchGetResponse200JsonX04e2fb83
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsVerifyMicrodepositsPostRequestFormX87f67a0a
import com.nabobery.sdkgen.generated.stripe.PaymentIntent
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
import kotlinx.serialization.json.JsonPrimitive

internal object PaymentIntentsCodecs {
  internal const val GETPAYMENTINTENTS_REQUEST_CODEC_ID: String = "GetPaymentIntents.request"

  private val getPaymentIntentsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetPaymentIntentsFormCodec

  private val getPaymentIntentsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1PaymentIntentsGetResponse200JsonX963f82da> =
      KotlinxSerializationCodec("GetPaymentIntents.response.alternative0", InlineV1PaymentIntentsGetResponse200JsonX963f82da.Serializer, SdkJson)

  internal val getPaymentIntentsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1PaymentIntentsGetResponse200JsonX963f82da> =
      MediaTypeCodecRegistry.of(getPaymentIntentsResponseCodecAlternative0Codec)

  private val getPaymentIntentsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPaymentIntents.response.alternative1", Error.Serializer, SdkJson)

  internal val getPaymentIntentsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPaymentIntentsResponseCodecAlternative1Codec)

  internal val getPaymentIntentsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPaymentIntentsRequestCodec)

  internal const val GETPAYMENTINTENTSINTENT_REQUEST_CODEC_ID: String =
      "GetPaymentIntentsIntent.request"

  private val getPaymentIntentsIntentRequestCodec: MediaTypeCodec<JsonObject?> =
      GetPaymentIntentsIntentFormCodec

  private val getPaymentIntentsIntentResponseCodecAlternative0Codec: MediaTypeCodec<PaymentIntent> =
      KotlinxSerializationCodec("GetPaymentIntentsIntent.response.alternative0", PaymentIntent.Serializer, SdkJson)

  internal val getPaymentIntentsIntentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentIntent> =
      MediaTypeCodecRegistry.of(getPaymentIntentsIntentResponseCodecAlternative0Codec)

  private val getPaymentIntentsIntentResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPaymentIntentsIntent.response.alternative1", Error.Serializer, SdkJson)

  internal val getPaymentIntentsIntentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPaymentIntentsIntentResponseCodecAlternative1Codec)

  internal val getPaymentIntentsIntentRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPaymentIntentsIntentRequestCodec)

  internal const val GETPAYMENTINTENTSINTENTAMOUNTDETAILSLINEITEMS_REQUEST_CODEC_ID: String =
      "GetPaymentIntentsIntentAmountDetailsLineItems.request"

  private val getPaymentIntentsIntentAmountDetailsLineItemsRequestCodec: MediaTypeCodec<JsonObject?>
      = GetPaymentIntentsIntentAmountDetailsLineItemsFormCodec

  private val getPaymentIntentsIntentAmountDetailsLineItemsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1PaymentIntentsAmountDetailsLineItemsGetResponse200JsonX606f73f3> =
      KotlinxSerializationCodec("GetPaymentIntentsIntentAmountDetailsLineItems.response.alternative0", InlineV1PaymentIntentsAmountDetailsLineItemsGetResponse200JsonX606f73f3.Serializer, SdkJson)

  internal val getPaymentIntentsIntentAmountDetailsLineItemsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1PaymentIntentsAmountDetailsLineItemsGetResponse200JsonX606f73f3>
      =
      MediaTypeCodecRegistry.of(getPaymentIntentsIntentAmountDetailsLineItemsResponseCodecAlternative0Codec)

  private val getPaymentIntentsIntentAmountDetailsLineItemsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPaymentIntentsIntentAmountDetailsLineItems.response.alternative1", Error.Serializer, SdkJson)

  internal val getPaymentIntentsIntentAmountDetailsLineItemsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPaymentIntentsIntentAmountDetailsLineItemsResponseCodecAlternative1Codec)

  internal val getPaymentIntentsIntentAmountDetailsLineItemsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPaymentIntentsIntentAmountDetailsLineItemsRequestCodec)

  internal const val GETPAYMENTINTENTSSEARCH_REQUEST_CODEC_ID: String =
      "GetPaymentIntentsSearch.request"

  private val getPaymentIntentsSearchRequestCodec: MediaTypeCodec<JsonObject?> =
      GetPaymentIntentsSearchFormCodec

  private val getPaymentIntentsSearchResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1PaymentIntentsSearchGetResponse200JsonX04e2fb83> =
      KotlinxSerializationCodec("GetPaymentIntentsSearch.response.alternative0", InlineV1PaymentIntentsSearchGetResponse200JsonX04e2fb83.Serializer, SdkJson)

  internal val getPaymentIntentsSearchResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1PaymentIntentsSearchGetResponse200JsonX04e2fb83> =
      MediaTypeCodecRegistry.of(getPaymentIntentsSearchResponseCodecAlternative0Codec)

  private val getPaymentIntentsSearchResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPaymentIntentsSearch.response.alternative1", Error.Serializer, SdkJson)

  internal val getPaymentIntentsSearchResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPaymentIntentsSearchResponseCodecAlternative1Codec)

  internal val getPaymentIntentsSearchRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPaymentIntentsSearchRequestCodec)

  internal const val POSTPAYMENTINTENTSINTENTAPPLYCUSTOMERBALANCE_REQUEST_CODEC_ID: String =
      "PostPaymentIntentsIntentApplyCustomerBalance.request"

  private val postPaymentIntentsIntentApplyCustomerBalanceRequestCodec:
      MediaTypeCodec<InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156?> =
      PostPaymentIntentsIntentApplyCustomerBalanceFormCodec

  private val postPaymentIntentsIntentApplyCustomerBalanceResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentIntent> =
      KotlinxSerializationCodec("PostPaymentIntentsIntentApplyCustomerBalance.response.alternative0", PaymentIntent.Serializer, SdkJson)

  internal val postPaymentIntentsIntentApplyCustomerBalanceResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentIntent> =
      MediaTypeCodecRegistry.of(postPaymentIntentsIntentApplyCustomerBalanceResponseCodecAlternative0Codec)

  private val postPaymentIntentsIntentApplyCustomerBalanceResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPaymentIntentsIntentApplyCustomerBalance.response.alternative1", Error.Serializer, SdkJson)

  internal val postPaymentIntentsIntentApplyCustomerBalanceResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPaymentIntentsIntentApplyCustomerBalanceResponseCodecAlternative1Codec)

  internal val postPaymentIntentsIntentApplyCustomerBalanceRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156?> =
      MediaTypeCodecRegistry.of(postPaymentIntentsIntentApplyCustomerBalanceRequestCodec)

  internal const val POSTPAYMENTINTENTSINTENTCANCEL_REQUEST_CODEC_ID: String =
      "PostPaymentIntentsIntentCancel.request"

  private val postPaymentIntentsIntentCancelRequestCodec:
      MediaTypeCodec<InlineV1PaymentIntentsCancelPostRequestFormXbb20ac6e?> =
      PostPaymentIntentsIntentCancelFormCodec

  private val postPaymentIntentsIntentCancelResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentIntent> =
      KotlinxSerializationCodec("PostPaymentIntentsIntentCancel.response.alternative0", PaymentIntent.Serializer, SdkJson)

  internal val postPaymentIntentsIntentCancelResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentIntent> =
      MediaTypeCodecRegistry.of(postPaymentIntentsIntentCancelResponseCodecAlternative0Codec)

  private val postPaymentIntentsIntentCancelResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPaymentIntentsIntentCancel.response.alternative1", Error.Serializer, SdkJson)

  internal val postPaymentIntentsIntentCancelResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPaymentIntentsIntentCancelResponseCodecAlternative1Codec)

  internal val postPaymentIntentsIntentCancelRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PaymentIntentsCancelPostRequestFormXbb20ac6e?> =
      MediaTypeCodecRegistry.of(postPaymentIntentsIntentCancelRequestCodec)

  internal const val POSTPAYMENTINTENTSINTENTVERIFYMICRODEPOSITS_REQUEST_CODEC_ID: String =
      "PostPaymentIntentsIntentVerifyMicrodeposits.request"

  private val postPaymentIntentsIntentVerifyMicrodepositsRequestCodec:
      MediaTypeCodec<InlineV1PaymentIntentsVerifyMicrodepositsPostRequestFormX87f67a0a?> =
      PostPaymentIntentsIntentVerifyMicrodepositsFormCodec

  private val postPaymentIntentsIntentVerifyMicrodepositsResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentIntent> =
      KotlinxSerializationCodec("PostPaymentIntentsIntentVerifyMicrodeposits.response.alternative0", PaymentIntent.Serializer, SdkJson)

  internal val postPaymentIntentsIntentVerifyMicrodepositsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentIntent> =
      MediaTypeCodecRegistry.of(postPaymentIntentsIntentVerifyMicrodepositsResponseCodecAlternative0Codec)

  private val postPaymentIntentsIntentVerifyMicrodepositsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPaymentIntentsIntentVerifyMicrodeposits.response.alternative1", Error.Serializer, SdkJson)

  internal val postPaymentIntentsIntentVerifyMicrodepositsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPaymentIntentsIntentVerifyMicrodepositsResponseCodecAlternative1Codec)

  internal val postPaymentIntentsIntentVerifyMicrodepositsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PaymentIntentsVerifyMicrodepositsPostRequestFormX87f67a0a?> =
      MediaTypeCodecRegistry.of(postPaymentIntentsIntentVerifyMicrodepositsRequestCodec)

  internal object GetPaymentIntentsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPaymentIntents.request"

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

  internal object GetPaymentIntentsIntentFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPaymentIntentsIntent.request"

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

  internal object GetPaymentIntentsIntentAmountDetailsLineItemsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPaymentIntentsIntentAmountDetailsLineItems.request"

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

  internal object GetPaymentIntentsSearchFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPaymentIntentsSearch.request"

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

  internal object PostPaymentIntentsIntentApplyCustomerBalanceFormCodec : MediaTypeCodec<InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156?> {
    override val id: String = "PostPaymentIntentsIntentApplyCustomerBalance.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount?.let { formValue0 ->
        form.add("amount", formValue0.toString())
      }
      request.currency?.let { formValue0 ->
        form.add("currency", formValue0)
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostPaymentIntentsIntentCancelFormCodec : MediaTypeCodec<InlineV1PaymentIntentsCancelPostRequestFormXbb20ac6e?> {
    override val id: String = "PostPaymentIntentsIntentCancel.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PaymentIntentsCancelPostRequestFormXbb20ac6e?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PaymentIntentsCancelPostRequestFormXbb20ac6e? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostPaymentIntentsIntentVerifyMicrodepositsFormCodec : MediaTypeCodec<InlineV1PaymentIntentsVerifyMicrodepositsPostRequestFormX87f67a0a?> {
    override val id: String = "PostPaymentIntentsIntentVerifyMicrodeposits.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PaymentIntentsVerifyMicrodepositsPostRequestFormX87f67a0a?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PaymentIntentsVerifyMicrodepositsPostRequestFormX87f67a0a? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'payment_intents' group of Stripe API.
 */
public class PaymentIntentsClient(
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
      SdkExecutor(transport, authentication = this@PaymentIntentsClient.authentication)

  /**
   * <p>Returns a list of PaymentIntents.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created A filter on the list, based on the object `created` field. The value can be a string with an integer
   * Unix timestamp or a dictionary with a number of different query options.
   * @param customer Only return PaymentIntents for the customer that this customer ID specifies.
   * @param customerAccount Only return PaymentIntents for the account representing the customer that this ID specifies.
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
  public suspend fun getPaymentIntentsWithResponse(
    request: JsonObject? = null,
    created: InlineV1PaymentIntentsGetParameterXb259e3ef? = null,
    customer: String? = null,
    customerAccount: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPaymentIntentsResponse> = executor.executeWithResponse<JsonObject?, GetPaymentIntentsResponse>(SdkExecutionRequest(getPaymentIntentsMetadata, baseUri, request, listOf(PaymentIntentsCodecs.GETPAYMENTINTENTS_REQUEST_CODEC_ID), buildList {
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
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), PaymentIntentsCodecs.getPaymentIntentsRequestCodecRegistry, GetPaymentIntentsResponseDecoder, options)

  /**
   * <p>Retrieves the details of a PaymentIntent that has previously been created. </p>
   *
   * <p>You can retrieve a PaymentIntent client-side using a publishable key when the <code>client_secret</code> is in
   * the query string. </p>
   *
   * <p>If you retrieve a PaymentIntent with a publishable key, it only returns a subset of properties. Refer to the <a
   * href="#payment_intent_object">payment intent</a> object reference for more details.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param intent Wire parameter `intent`.
   * @param clientSecret The client secret of the PaymentIntent. We require it if you use a publishable key to retrieve
   * the source.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getPaymentIntentsIntentWithResponse(
    request: JsonObject? = null,
    intent: String,
    clientSecret: String? = null,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPaymentIntentsIntentResponse> = executor.executeWithResponse<JsonObject?, GetPaymentIntentsIntentResponse>(SdkExecutionRequest(getPaymentIntentsIntentMetadata, baseUri, request, listOf(PaymentIntentsCodecs.GETPAYMENTINTENTSINTENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "intent", values = listOf(intent.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "client_secret", values = clientSecret?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), PaymentIntentsCodecs.getPaymentIntentsIntentRequestCodecRegistry, GetPaymentIntentsIntentResponseDecoder, options)

  /**
   * <p>Lists all LineItems of a given PaymentIntent.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param intent Wire parameter `intent`.
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
  public suspend fun getPaymentIntentsIntentAmountDetailsLineItemsWithResponse(
    request: JsonObject? = null,
    intent: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPaymentIntentsIntentAmountDetailsLineItemsResponse> = executor.executeWithResponse<JsonObject?, GetPaymentIntentsIntentAmountDetailsLineItemsResponse>(SdkExecutionRequest(getPaymentIntentsIntentAmountDetailsLineItemsMetadata, baseUri, request, listOf(PaymentIntentsCodecs.GETPAYMENTINTENTSINTENTAMOUNTDETAILSLINEITEMS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "intent", values = listOf(intent.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), PaymentIntentsCodecs.getPaymentIntentsIntentAmountDetailsLineItemsRequestCodecRegistry, GetPaymentIntentsIntentAmountDetailsLineItemsResponseDecoder, options)

  /**
   * <p>Search for PaymentIntents you’ve previously created using Stripe’s <a
   * href="/docs/search#search-query-language">Search Query Language</a>.
   * Don’t use search in read-after-write flows where strict consistency is necessary. Under normal operating
   * conditions, data is searchable in less than a minute. Occasionally, propagation of new or updated data can be up
   * to an hour behind during outages. Search functionality is not available to merchants in India.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param page A cursor for pagination across multiple pages of results. Don't include this parameter on the first
   * call. Use the next_page value returned in a previous response to request subsequent results.
   * @param query The search query string. See [search query
   * language](https://docs.stripe.com/search#search-query-language) and the list of supported [query fields for payment
   * intents](https://docs.stripe.com/search#query-fields-for-paymentintents).
   * @param options Execution options.
   */
  public suspend fun getPaymentIntentsSearchWithResponse(
    request: JsonObject? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    page: String? = null,
    query: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPaymentIntentsSearchResponse> = executor.executeWithResponse<JsonObject?, GetPaymentIntentsSearchResponse>(SdkExecutionRequest(getPaymentIntentsSearchMetadata, baseUri, request, listOf(PaymentIntentsCodecs.GETPAYMENTINTENTSSEARCH_REQUEST_CODEC_ID), buildList {
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "query", values = listOf(query.toString())))
  }), PaymentIntentsCodecs.getPaymentIntentsSearchRequestCodecRegistry, GetPaymentIntentsSearchResponseDecoder, options)

  /**
   * <p>Manually reconcile the remaining amount for a <code>customer_balance</code> PaymentIntent.</p>
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
  public suspend fun postPaymentIntentsIntentApplyCustomerBalanceWithResponse(
    request: InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156? = null,
    intent: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostPaymentIntentsIntentApplyCustomerBalanceResponse> = executor.executeWithResponse<InlineV1PaymentIntentsApplyCustomerBalancePostRequestFormXa54e4156?, PostPaymentIntentsIntentApplyCustomerBalanceResponse>(SdkExecutionRequest(postPaymentIntentsIntentApplyCustomerBalanceMetadata, baseUri, request, listOf(PaymentIntentsCodecs.POSTPAYMENTINTENTSINTENTAPPLYCUSTOMERBALANCE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "intent", values = listOf(intent.toString())))
  }), PaymentIntentsCodecs.postPaymentIntentsIntentApplyCustomerBalanceRequestCodecRegistry, PostPaymentIntentsIntentApplyCustomerBalanceResponseDecoder, options)

  /**
   * <p>You can cancel a PaymentIntent object when it’s in one of these statuses: <code>requires_payment_method</code>,
   * <code>requires_capture</code>, <code>requires_confirmation</code>, <code>requires_action</code> or, <a
   * href="/docs/payments/intents">in rare cases</a>, <code>processing</code>. </p>
   *
   * <p>After it’s canceled, no additional charges are made by the PaymentIntent and any operations on the PaymentIntent
   * fail with an error. For PaymentIntents with a <code>status</code> of <code>requires_capture</code>, the remaining
   * <code>amount_capturable</code> is automatically refunded. </p>
   *
   * <p>You can directly cancel the PaymentIntent for a Checkout Session only when the PaymentIntent has a status of
   * <code>requires_capture</code>. Otherwise, you must <a href="/docs/api/checkout/sessions/expire">expire the Checkout
   * Session</a>.</p>
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
  public suspend fun postPaymentIntentsIntentCancelWithResponse(
    request: InlineV1PaymentIntentsCancelPostRequestFormXbb20ac6e? = null,
    intent: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostPaymentIntentsIntentCancelResponse> = executor.executeWithResponse<InlineV1PaymentIntentsCancelPostRequestFormXbb20ac6e?, PostPaymentIntentsIntentCancelResponse>(SdkExecutionRequest(postPaymentIntentsIntentCancelMetadata, baseUri, request, listOf(PaymentIntentsCodecs.POSTPAYMENTINTENTSINTENTCANCEL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "intent", values = listOf(intent.toString())))
  }), PaymentIntentsCodecs.postPaymentIntentsIntentCancelRequestCodecRegistry, PostPaymentIntentsIntentCancelResponseDecoder, options)

  /**
   * <p>Verifies microdeposits on a PaymentIntent object.</p>
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
  public suspend fun postPaymentIntentsIntentVerifyMicrodepositsWithResponse(
    request: InlineV1PaymentIntentsVerifyMicrodepositsPostRequestFormX87f67a0a? = null,
    intent: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostPaymentIntentsIntentVerifyMicrodepositsResponse> = executor.executeWithResponse<InlineV1PaymentIntentsVerifyMicrodepositsPostRequestFormX87f67a0a?, PostPaymentIntentsIntentVerifyMicrodepositsResponse>(SdkExecutionRequest(postPaymentIntentsIntentVerifyMicrodepositsMetadata, baseUri, request, listOf(PaymentIntentsCodecs.POSTPAYMENTINTENTSINTENTVERIFYMICRODEPOSITS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "intent", values = listOf(intent.toString())))
  }), PaymentIntentsCodecs.postPaymentIntentsIntentVerifyMicrodepositsRequestCodecRegistry, PostPaymentIntentsIntentVerifyMicrodepositsResponseDecoder, options)

  /**
   * Typed response alternatives for `GetPaymentIntents`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetPaymentIntentsResponse {
    public class SuccessJson(
      public val json: InlineV1PaymentIntentsGetResponse200JsonX963f82da,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentIntentsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentIntentsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentIntentsResponse
  }

  private object GetPaymentIntentsResponseDecoder : SdkResponseAlternativeDecoder<GetPaymentIntentsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPaymentIntentsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPaymentIntentsResponse> = when {
      alternative.id == "GetPaymentIntents.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPaymentIntentsResponse.SuccessJson(
          json = PaymentIntentsCodecs.getPaymentIntentsResponseCodecAlternative0Registry.select(listOf("GetPaymentIntents.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPaymentIntents.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPaymentIntentsResponse.DefaultJson(
          json = PaymentIntentsCodecs.getPaymentIntentsResponseCodecAlternative1Registry.select(listOf("GetPaymentIntents.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPaymentIntentsResponse = GetPaymentIntentsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetPaymentIntentsIntent`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetPaymentIntentsIntentResponse {
    public class SuccessJson(
      public val json: PaymentIntent,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentIntentsIntentResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentIntentsIntentResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentIntentsIntentResponse
  }

  private object GetPaymentIntentsIntentResponseDecoder : SdkResponseAlternativeDecoder<GetPaymentIntentsIntentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPaymentIntentsIntentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPaymentIntentsIntentResponse> = when {
      alternative.id == "GetPaymentIntentsIntent.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPaymentIntentsIntentResponse.SuccessJson(
          json = PaymentIntentsCodecs.getPaymentIntentsIntentResponseCodecAlternative0Registry.select(listOf("GetPaymentIntentsIntent.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPaymentIntentsIntent.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPaymentIntentsIntentResponse.DefaultJson(
          json = PaymentIntentsCodecs.getPaymentIntentsIntentResponseCodecAlternative1Registry.select(listOf("GetPaymentIntentsIntent.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPaymentIntentsIntentResponse = GetPaymentIntentsIntentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetPaymentIntentsIntentAmountDetailsLineItems`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetPaymentIntentsIntentAmountDetailsLineItemsResponse {
    public class SuccessJson(
      public val json: InlineV1PaymentIntentsAmountDetailsLineItemsGetResponse200JsonX606f73f3,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentIntentsIntentAmountDetailsLineItemsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentIntentsIntentAmountDetailsLineItemsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentIntentsIntentAmountDetailsLineItemsResponse
  }

  private object GetPaymentIntentsIntentAmountDetailsLineItemsResponseDecoder : SdkResponseAlternativeDecoder<GetPaymentIntentsIntentAmountDetailsLineItemsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPaymentIntentsIntentAmountDetailsLineItemsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPaymentIntentsIntentAmountDetailsLineItemsResponse> = when {
      alternative.id == "GetPaymentIntentsIntentAmountDetailsLineItems.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPaymentIntentsIntentAmountDetailsLineItemsResponse.SuccessJson(
          json = PaymentIntentsCodecs.getPaymentIntentsIntentAmountDetailsLineItemsResponseCodecAlternative0Registry.select(listOf("GetPaymentIntentsIntentAmountDetailsLineItems.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPaymentIntentsIntentAmountDetailsLineItems.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPaymentIntentsIntentAmountDetailsLineItemsResponse.DefaultJson(
          json = PaymentIntentsCodecs.getPaymentIntentsIntentAmountDetailsLineItemsResponseCodecAlternative1Registry.select(listOf("GetPaymentIntentsIntentAmountDetailsLineItems.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPaymentIntentsIntentAmountDetailsLineItemsResponse = GetPaymentIntentsIntentAmountDetailsLineItemsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetPaymentIntentsSearch`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetPaymentIntentsSearchResponse {
    public class SuccessJson(
      public val json: InlineV1PaymentIntentsSearchGetResponse200JsonX04e2fb83,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentIntentsSearchResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentIntentsSearchResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentIntentsSearchResponse
  }

  private object GetPaymentIntentsSearchResponseDecoder : SdkResponseAlternativeDecoder<GetPaymentIntentsSearchResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPaymentIntentsSearchResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPaymentIntentsSearchResponse> = when {
      alternative.id == "GetPaymentIntentsSearch.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPaymentIntentsSearchResponse.SuccessJson(
          json = PaymentIntentsCodecs.getPaymentIntentsSearchResponseCodecAlternative0Registry.select(listOf("GetPaymentIntentsSearch.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPaymentIntentsSearch.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPaymentIntentsSearchResponse.DefaultJson(
          json = PaymentIntentsCodecs.getPaymentIntentsSearchResponseCodecAlternative1Registry.select(listOf("GetPaymentIntentsSearch.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPaymentIntentsSearchResponse = GetPaymentIntentsSearchResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPaymentIntentsIntentApplyCustomerBalance`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostPaymentIntentsIntentApplyCustomerBalanceResponse {
    public class SuccessJson(
      public val json: PaymentIntent,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentIntentsIntentApplyCustomerBalanceResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentIntentsIntentApplyCustomerBalanceResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentIntentsIntentApplyCustomerBalanceResponse
  }

  private object PostPaymentIntentsIntentApplyCustomerBalanceResponseDecoder : SdkResponseAlternativeDecoder<PostPaymentIntentsIntentApplyCustomerBalanceResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPaymentIntentsIntentApplyCustomerBalanceResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPaymentIntentsIntentApplyCustomerBalanceResponse> = when {
      alternative.id == "PostPaymentIntentsIntentApplyCustomerBalance.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPaymentIntentsIntentApplyCustomerBalanceResponse.SuccessJson(
          json = PaymentIntentsCodecs.postPaymentIntentsIntentApplyCustomerBalanceResponseCodecAlternative0Registry.select(listOf("PostPaymentIntentsIntentApplyCustomerBalance.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPaymentIntentsIntentApplyCustomerBalance.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPaymentIntentsIntentApplyCustomerBalanceResponse.DefaultJson(
          json = PaymentIntentsCodecs.postPaymentIntentsIntentApplyCustomerBalanceResponseCodecAlternative1Registry.select(listOf("PostPaymentIntentsIntentApplyCustomerBalance.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPaymentIntentsIntentApplyCustomerBalanceResponse = PostPaymentIntentsIntentApplyCustomerBalanceResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPaymentIntentsIntentCancel`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostPaymentIntentsIntentCancelResponse {
    public class SuccessJson(
      public val json: PaymentIntent,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentIntentsIntentCancelResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentIntentsIntentCancelResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentIntentsIntentCancelResponse
  }

  private object PostPaymentIntentsIntentCancelResponseDecoder : SdkResponseAlternativeDecoder<PostPaymentIntentsIntentCancelResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPaymentIntentsIntentCancelResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPaymentIntentsIntentCancelResponse> = when {
      alternative.id == "PostPaymentIntentsIntentCancel.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPaymentIntentsIntentCancelResponse.SuccessJson(
          json = PaymentIntentsCodecs.postPaymentIntentsIntentCancelResponseCodecAlternative0Registry.select(listOf("PostPaymentIntentsIntentCancel.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPaymentIntentsIntentCancel.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPaymentIntentsIntentCancelResponse.DefaultJson(
          json = PaymentIntentsCodecs.postPaymentIntentsIntentCancelResponseCodecAlternative1Registry.select(listOf("PostPaymentIntentsIntentCancel.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPaymentIntentsIntentCancelResponse = PostPaymentIntentsIntentCancelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPaymentIntentsIntentVerifyMicrodeposits`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostPaymentIntentsIntentVerifyMicrodepositsResponse {
    public class SuccessJson(
      public val json: PaymentIntent,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentIntentsIntentVerifyMicrodepositsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentIntentsIntentVerifyMicrodepositsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentIntentsIntentVerifyMicrodepositsResponse
  }

  private object PostPaymentIntentsIntentVerifyMicrodepositsResponseDecoder : SdkResponseAlternativeDecoder<PostPaymentIntentsIntentVerifyMicrodepositsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPaymentIntentsIntentVerifyMicrodepositsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPaymentIntentsIntentVerifyMicrodepositsResponse> = when {
      alternative.id == "PostPaymentIntentsIntentVerifyMicrodeposits.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPaymentIntentsIntentVerifyMicrodepositsResponse.SuccessJson(
          json = PaymentIntentsCodecs.postPaymentIntentsIntentVerifyMicrodepositsResponseCodecAlternative0Registry.select(listOf("PostPaymentIntentsIntentVerifyMicrodeposits.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPaymentIntentsIntentVerifyMicrodeposits.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPaymentIntentsIntentVerifyMicrodepositsResponse.DefaultJson(
          json = PaymentIntentsCodecs.postPaymentIntentsIntentVerifyMicrodepositsResponseCodecAlternative1Registry.select(listOf("PostPaymentIntentsIntentVerifyMicrodeposits.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPaymentIntentsIntentVerifyMicrodepositsResponse = PostPaymentIntentsIntentVerifyMicrodepositsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getPaymentIntentsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPaymentIntents",
          method = "GET",
          path = "/v1/payment_intents",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1PaymentIntentsGetResponse200JsonX963f82da",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentIntents.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentIntents.response.alternative1",
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

    internal val getPaymentIntentsIntentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPaymentIntentsIntent",
          method = "GET",
          path = "/v1/payment_intents/{intent}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentIntent",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentIntentsIntent.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentIntentsIntent.response.alternative1",
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

    internal val getPaymentIntentsIntentAmountDetailsLineItemsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPaymentIntentsIntentAmountDetailsLineItems",
          method = "GET",
          path = "/v1/payment_intents/{intent}/amount_details_line_items",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1PaymentIntentsAmountDetailsLineItemsGetResponse200JsonX606f73f3",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentIntentsIntentAmountDetailsLineItems.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentIntentsIntentAmountDetailsLineItems.response.alternative1",
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

    internal val getPaymentIntentsSearchMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPaymentIntentsSearch",
          method = "GET",
          path = "/v1/payment_intents/search",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1PaymentIntentsSearchGetResponse200JsonX04e2fb83",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentIntentsSearch.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentIntentsSearch.response.alternative1",
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

    internal val postPaymentIntentsIntentApplyCustomerBalanceMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPaymentIntentsIntentApplyCustomerBalance",
          method = "POST",
          path = "/v1/payment_intents/{intent}/apply_customer_balance",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentIntent",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentIntentsIntentApplyCustomerBalance.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentIntentsIntentApplyCustomerBalance.response.alternative1",
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

    internal val postPaymentIntentsIntentCancelMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPaymentIntentsIntentCancel",
          method = "POST",
          path = "/v1/payment_intents/{intent}/cancel",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentIntent",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentIntentsIntentCancel.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentIntentsIntentCancel.response.alternative1",
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

    internal val postPaymentIntentsIntentVerifyMicrodepositsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPaymentIntentsIntentVerifyMicrodeposits",
          method = "POST",
          path = "/v1/payment_intents/{intent}/verify_microdeposits",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentIntent",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentIntentsIntentVerifyMicrodeposits.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentIntentsIntentVerifyMicrodeposits.response.alternative1",
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
