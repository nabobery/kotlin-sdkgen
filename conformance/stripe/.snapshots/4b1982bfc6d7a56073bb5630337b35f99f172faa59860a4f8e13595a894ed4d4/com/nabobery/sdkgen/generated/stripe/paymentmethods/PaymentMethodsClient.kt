package com.nabobery.sdkgen.generated.stripe.paymentmethods

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodsAttachPostRequestFormXa65c0be5
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodsDetachPostRequestFormXc63d7873
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodsGetParameterXa79a1856
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodsGetParameterXb26ead0a
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodsGetResponse200JsonX36cbaae1
import com.nabobery.sdkgen.generated.stripe.PaymentMethod
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

internal object PaymentMethodsCodecs {
  internal const val GETPAYMENTMETHODS_REQUEST_CODEC_ID: String = "GetPaymentMethods.request"

  private val getPaymentMethodsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetPaymentMethodsFormCodec

  private val getPaymentMethodsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1PaymentMethodsGetResponse200JsonX36cbaae1> =
      KotlinxSerializationCodec("GetPaymentMethods.response.alternative0", InlineV1PaymentMethodsGetResponse200JsonX36cbaae1.Serializer, SdkJson)

  internal val getPaymentMethodsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1PaymentMethodsGetResponse200JsonX36cbaae1> =
      MediaTypeCodecRegistry.of(getPaymentMethodsResponseCodecAlternative0Codec)

  private val getPaymentMethodsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPaymentMethods.response.alternative1", Error.Serializer, SdkJson)

  internal val getPaymentMethodsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPaymentMethodsResponseCodecAlternative1Codec)

  internal val getPaymentMethodsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPaymentMethodsRequestCodec)

  internal const val GETPAYMENTMETHODSPAYMENTMETHOD_REQUEST_CODEC_ID: String =
      "GetPaymentMethodsPaymentMethod.request"

  private val getPaymentMethodsPaymentMethodRequestCodec: MediaTypeCodec<JsonObject?> =
      GetPaymentMethodsPaymentMethodFormCodec

  private val getPaymentMethodsPaymentMethodResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentMethod> =
      KotlinxSerializationCodec("GetPaymentMethodsPaymentMethod.response.alternative0", PaymentMethod.Serializer, SdkJson)

  internal val getPaymentMethodsPaymentMethodResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentMethod> =
      MediaTypeCodecRegistry.of(getPaymentMethodsPaymentMethodResponseCodecAlternative0Codec)

  private val getPaymentMethodsPaymentMethodResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPaymentMethodsPaymentMethod.response.alternative1", Error.Serializer, SdkJson)

  internal val getPaymentMethodsPaymentMethodResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPaymentMethodsPaymentMethodResponseCodecAlternative1Codec)

  internal val getPaymentMethodsPaymentMethodRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPaymentMethodsPaymentMethodRequestCodec)

  internal const val POSTPAYMENTMETHODSPAYMENTMETHODATTACH_REQUEST_CODEC_ID: String =
      "PostPaymentMethodsPaymentMethodAttach.request"

  private val postPaymentMethodsPaymentMethodAttachRequestCodec:
      MediaTypeCodec<InlineV1PaymentMethodsAttachPostRequestFormXa65c0be5?> =
      PostPaymentMethodsPaymentMethodAttachFormCodec

  private val postPaymentMethodsPaymentMethodAttachResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentMethod> =
      KotlinxSerializationCodec("PostPaymentMethodsPaymentMethodAttach.response.alternative0", PaymentMethod.Serializer, SdkJson)

  internal val postPaymentMethodsPaymentMethodAttachResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentMethod> =
      MediaTypeCodecRegistry.of(postPaymentMethodsPaymentMethodAttachResponseCodecAlternative0Codec)

  private val postPaymentMethodsPaymentMethodAttachResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPaymentMethodsPaymentMethodAttach.response.alternative1", Error.Serializer, SdkJson)

  internal val postPaymentMethodsPaymentMethodAttachResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPaymentMethodsPaymentMethodAttachResponseCodecAlternative1Codec)

  internal val postPaymentMethodsPaymentMethodAttachRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PaymentMethodsAttachPostRequestFormXa65c0be5?> =
      MediaTypeCodecRegistry.of(postPaymentMethodsPaymentMethodAttachRequestCodec)

  internal const val POSTPAYMENTMETHODSPAYMENTMETHODDETACH_REQUEST_CODEC_ID: String =
      "PostPaymentMethodsPaymentMethodDetach.request"

  private val postPaymentMethodsPaymentMethodDetachRequestCodec:
      MediaTypeCodec<InlineV1PaymentMethodsDetachPostRequestFormXc63d7873?> =
      PostPaymentMethodsPaymentMethodDetachFormCodec

  private val postPaymentMethodsPaymentMethodDetachResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentMethod> =
      KotlinxSerializationCodec("PostPaymentMethodsPaymentMethodDetach.response.alternative0", PaymentMethod.Serializer, SdkJson)

  internal val postPaymentMethodsPaymentMethodDetachResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentMethod> =
      MediaTypeCodecRegistry.of(postPaymentMethodsPaymentMethodDetachResponseCodecAlternative0Codec)

  private val postPaymentMethodsPaymentMethodDetachResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPaymentMethodsPaymentMethodDetach.response.alternative1", Error.Serializer, SdkJson)

  internal val postPaymentMethodsPaymentMethodDetachResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPaymentMethodsPaymentMethodDetachResponseCodecAlternative1Codec)

  internal val postPaymentMethodsPaymentMethodDetachRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PaymentMethodsDetachPostRequestFormXc63d7873?> =
      MediaTypeCodecRegistry.of(postPaymentMethodsPaymentMethodDetachRequestCodec)

  internal object GetPaymentMethodsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPaymentMethods.request"

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

  internal object GetPaymentMethodsPaymentMethodFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPaymentMethodsPaymentMethod.request"

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

  internal object PostPaymentMethodsPaymentMethodAttachFormCodec : MediaTypeCodec<InlineV1PaymentMethodsAttachPostRequestFormXa65c0be5?> {
    override val id: String = "PostPaymentMethodsPaymentMethodAttach.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PaymentMethodsAttachPostRequestFormXa65c0be5?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.customer?.let { formValue0 ->
        form.add("customer", formValue0)
      }
      request.customerAccount?.let { formValue0 ->
        form.add("customer_account", formValue0)
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PaymentMethodsAttachPostRequestFormXa65c0be5? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostPaymentMethodsPaymentMethodDetachFormCodec : MediaTypeCodec<InlineV1PaymentMethodsDetachPostRequestFormXc63d7873?> {
    override val id: String = "PostPaymentMethodsPaymentMethodDetach.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PaymentMethodsDetachPostRequestFormXc63d7873?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PaymentMethodsDetachPostRequestFormXc63d7873? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'payment_methods' group of Stripe API.
 */
public class PaymentMethodsClient(
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
      SdkExecutor(transport, authentication = this@PaymentMethodsClient.authentication)

  /**
   * <p>Returns a list of all PaymentMethods.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param allowRedisplay This field indicates whether this payment method can be shown again to its customer in a
   * checkout flow. Stripe products such as Checkout and Elements use this field to determine whether a payment method
   * can be shown as a saved payment method in a checkout flow.
   * @param customer The ID of the customer whose PaymentMethods will be retrieved.
   * @param customerAccount The ID of the Account whose PaymentMethods will be retrieved.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param type Filters the list by the object `type` field. Unfiltered, the list returns all payment method types
   * except `custom`. If your integration expects only one type of payment method in the response, specify that type
   * value in the request to reduce your payload.
   * @param options Execution options.
   */
  public suspend fun getPaymentMethodsWithResponse(
    request: JsonObject? = null,
    allowRedisplay: InlineV1PaymentMethodsGetParameterXa79a1856? = null,
    customer: String? = null,
    customerAccount: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    type: InlineV1PaymentMethodsGetParameterXb26ead0a? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPaymentMethodsResponse> = executor.executeWithResponse<JsonObject?, GetPaymentMethodsResponse>(SdkExecutionRequest(getPaymentMethodsMetadata, baseUri, request, listOf(PaymentMethodsCodecs.GETPAYMENTMETHODS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "allow_redisplay", values = allowRedisplay?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer", values = customer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer_account", values = customerAccount?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "type", values = type?.let { listOf(it.toString()) }.orEmpty()))
  }), PaymentMethodsCodecs.getPaymentMethodsRequestCodecRegistry, GetPaymentMethodsResponseDecoder, options)

  /**
   * <p>Retrieves a PaymentMethod object attached to the StripeAccount. To retrieve a payment method attached to a
   * Customer, you should use <a href="/docs/api/payment_methods/customer">Retrieve a Customer’s PaymentMethods</a></p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param paymentMethod Wire parameter `payment_method`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getPaymentMethodsPaymentMethodWithResponse(
    request: JsonObject? = null,
    paymentMethod: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPaymentMethodsPaymentMethodResponse> = executor.executeWithResponse<JsonObject?, GetPaymentMethodsPaymentMethodResponse>(SdkExecutionRequest(getPaymentMethodsPaymentMethodMetadata, baseUri, request, listOf(PaymentMethodsCodecs.GETPAYMENTMETHODSPAYMENTMETHOD_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "payment_method", values = listOf(paymentMethod.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), PaymentMethodsCodecs.getPaymentMethodsPaymentMethodRequestCodecRegistry, GetPaymentMethodsPaymentMethodResponseDecoder, options)

  /**
   * <p>Attaches a PaymentMethod object to a Customer.</p>
   *
   * <p>To attach a new PaymentMethod to a customer for future payments, we recommend you use a <a
   * href="/docs/api/setup_intents">SetupIntent</a>
   * or a PaymentIntent with <a
   * href="/docs/api/payment_intents/create#create_payment_intent-setup_future_usage">setup_future_usage</a>.
   * These approaches will perform any necessary steps to set up the PaymentMethod for future payments. Using the
   * <code>/v1/payment_methods/:id/attach</code>
   * endpoint without first using a SetupIntent or PaymentIntent with <code>setup_future_usage</code> does not optimize
   * the PaymentMethod for
   * future use, which makes later declines and payment friction more likely.
   * See <a href="/docs/payments/payment-intents#future-usage">Optimizing cards for future payments</a> for more
   * information about setting up
   * future payments.</p>
   *
   * <p>To use this PaymentMethod as the default for invoice or subscription payments,
   * set <a
   * href="/docs/api/customers/update#update_customer-invoice_settings-default_payment_method"><code>invoice_settings.de
   * fault_payment_method</code></a>,
   * on the Customer to the PaymentMethod’s ID.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param paymentMethod Wire parameter `payment_method`.
   * @param options Execution options.
   */
  public suspend fun postPaymentMethodsPaymentMethodAttachWithResponse(
    request: InlineV1PaymentMethodsAttachPostRequestFormXa65c0be5? = null,
    paymentMethod: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostPaymentMethodsPaymentMethodAttachResponse> = executor.executeWithResponse<InlineV1PaymentMethodsAttachPostRequestFormXa65c0be5?, PostPaymentMethodsPaymentMethodAttachResponse>(SdkExecutionRequest(postPaymentMethodsPaymentMethodAttachMetadata, baseUri, request, listOf(PaymentMethodsCodecs.POSTPAYMENTMETHODSPAYMENTMETHODATTACH_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "payment_method", values = listOf(paymentMethod.toString())))
  }), PaymentMethodsCodecs.postPaymentMethodsPaymentMethodAttachRequestCodecRegistry, PostPaymentMethodsPaymentMethodAttachResponseDecoder, options)

  /**
   * <p>Detaches a PaymentMethod object from a Customer. After a PaymentMethod is detached, it can no longer be used for
   * a payment or re-attached to a Customer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param paymentMethod Wire parameter `payment_method`.
   * @param options Execution options.
   */
  public suspend fun postPaymentMethodsPaymentMethodDetachWithResponse(
    request: InlineV1PaymentMethodsDetachPostRequestFormXc63d7873? = null,
    paymentMethod: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostPaymentMethodsPaymentMethodDetachResponse> = executor.executeWithResponse<InlineV1PaymentMethodsDetachPostRequestFormXc63d7873?, PostPaymentMethodsPaymentMethodDetachResponse>(SdkExecutionRequest(postPaymentMethodsPaymentMethodDetachMetadata, baseUri, request, listOf(PaymentMethodsCodecs.POSTPAYMENTMETHODSPAYMENTMETHODDETACH_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "payment_method", values = listOf(paymentMethod.toString())))
  }), PaymentMethodsCodecs.postPaymentMethodsPaymentMethodDetachRequestCodecRegistry, PostPaymentMethodsPaymentMethodDetachResponseDecoder, options)

  /**
   * Typed response alternatives for `GetPaymentMethods`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetPaymentMethodsResponse {
    public class SuccessJson(
      public val json: InlineV1PaymentMethodsGetResponse200JsonX36cbaae1,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentMethodsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentMethodsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentMethodsResponse
  }

  private object GetPaymentMethodsResponseDecoder : SdkResponseAlternativeDecoder<GetPaymentMethodsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPaymentMethodsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPaymentMethodsResponse> = when {
      alternative.id == "GetPaymentMethods.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPaymentMethodsResponse.SuccessJson(
          json = PaymentMethodsCodecs.getPaymentMethodsResponseCodecAlternative0Registry.select(listOf("GetPaymentMethods.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPaymentMethods.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPaymentMethodsResponse.DefaultJson(
          json = PaymentMethodsCodecs.getPaymentMethodsResponseCodecAlternative1Registry.select(listOf("GetPaymentMethods.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPaymentMethodsResponse = GetPaymentMethodsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetPaymentMethodsPaymentMethod`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetPaymentMethodsPaymentMethodResponse {
    public class SuccessJson(
      public val json: PaymentMethod,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentMethodsPaymentMethodResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentMethodsPaymentMethodResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentMethodsPaymentMethodResponse
  }

  private object GetPaymentMethodsPaymentMethodResponseDecoder : SdkResponseAlternativeDecoder<GetPaymentMethodsPaymentMethodResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPaymentMethodsPaymentMethodResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPaymentMethodsPaymentMethodResponse> = when {
      alternative.id == "GetPaymentMethodsPaymentMethod.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPaymentMethodsPaymentMethodResponse.SuccessJson(
          json = PaymentMethodsCodecs.getPaymentMethodsPaymentMethodResponseCodecAlternative0Registry.select(listOf("GetPaymentMethodsPaymentMethod.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPaymentMethodsPaymentMethod.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPaymentMethodsPaymentMethodResponse.DefaultJson(
          json = PaymentMethodsCodecs.getPaymentMethodsPaymentMethodResponseCodecAlternative1Registry.select(listOf("GetPaymentMethodsPaymentMethod.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPaymentMethodsPaymentMethodResponse = GetPaymentMethodsPaymentMethodResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPaymentMethodsPaymentMethodAttach`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostPaymentMethodsPaymentMethodAttachResponse {
    public class SuccessJson(
      public val json: PaymentMethod,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodsPaymentMethodAttachResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodsPaymentMethodAttachResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodsPaymentMethodAttachResponse
  }

  private object PostPaymentMethodsPaymentMethodAttachResponseDecoder : SdkResponseAlternativeDecoder<PostPaymentMethodsPaymentMethodAttachResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPaymentMethodsPaymentMethodAttachResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPaymentMethodsPaymentMethodAttachResponse> = when {
      alternative.id == "PostPaymentMethodsPaymentMethodAttach.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPaymentMethodsPaymentMethodAttachResponse.SuccessJson(
          json = PaymentMethodsCodecs.postPaymentMethodsPaymentMethodAttachResponseCodecAlternative0Registry.select(listOf("PostPaymentMethodsPaymentMethodAttach.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPaymentMethodsPaymentMethodAttach.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPaymentMethodsPaymentMethodAttachResponse.DefaultJson(
          json = PaymentMethodsCodecs.postPaymentMethodsPaymentMethodAttachResponseCodecAlternative1Registry.select(listOf("PostPaymentMethodsPaymentMethodAttach.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPaymentMethodsPaymentMethodAttachResponse = PostPaymentMethodsPaymentMethodAttachResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPaymentMethodsPaymentMethodDetach`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostPaymentMethodsPaymentMethodDetachResponse {
    public class SuccessJson(
      public val json: PaymentMethod,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodsPaymentMethodDetachResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodsPaymentMethodDetachResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodsPaymentMethodDetachResponse
  }

  private object PostPaymentMethodsPaymentMethodDetachResponseDecoder : SdkResponseAlternativeDecoder<PostPaymentMethodsPaymentMethodDetachResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPaymentMethodsPaymentMethodDetachResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPaymentMethodsPaymentMethodDetachResponse> = when {
      alternative.id == "PostPaymentMethodsPaymentMethodDetach.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPaymentMethodsPaymentMethodDetachResponse.SuccessJson(
          json = PaymentMethodsCodecs.postPaymentMethodsPaymentMethodDetachResponseCodecAlternative0Registry.select(listOf("PostPaymentMethodsPaymentMethodDetach.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPaymentMethodsPaymentMethodDetach.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPaymentMethodsPaymentMethodDetachResponse.DefaultJson(
          json = PaymentMethodsCodecs.postPaymentMethodsPaymentMethodDetachResponseCodecAlternative1Registry.select(listOf("PostPaymentMethodsPaymentMethodDetach.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPaymentMethodsPaymentMethodDetachResponse = PostPaymentMethodsPaymentMethodDetachResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getPaymentMethodsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPaymentMethods",
          method = "GET",
          path = "/v1/payment_methods",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1PaymentMethodsGetResponse200JsonX36cbaae1",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentMethods.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentMethods.response.alternative1",
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

    internal val getPaymentMethodsPaymentMethodMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPaymentMethodsPaymentMethod",
          method = "GET",
          path = "/v1/payment_methods/{payment_method}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentMethod",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentMethodsPaymentMethod.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentMethodsPaymentMethod.response.alternative1",
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

    internal val postPaymentMethodsPaymentMethodAttachMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPaymentMethodsPaymentMethodAttach",
          method = "POST",
          path = "/v1/payment_methods/{payment_method}/attach",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentMethod",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentMethodsPaymentMethodAttach.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentMethodsPaymentMethodAttach.response.alternative1",
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

    internal val postPaymentMethodsPaymentMethodDetachMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPaymentMethodsPaymentMethodDetach",
          method = "POST",
          path = "/v1/payment_methods/{payment_method}/detach",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentMethod",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentMethodsPaymentMethodDetach.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentMethodsPaymentMethodDetach.response.alternative1",
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
