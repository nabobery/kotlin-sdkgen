package com.nabobery.sdkgen.generated.stripe.paymentmethoddomains

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodDomainsGetResponse200JsonX99c7f0ab
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodDomainsPostRequestFormX279b3096
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodDomainsPostRequestFormXd28a8c77
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodDomainsValidatePostRequestFormXa55509bf
import com.nabobery.sdkgen.generated.stripe.PaymentMethodDomain
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

internal object PaymentMethodDomainsCodecs {
  internal const val GETPAYMENTMETHODDOMAINS_REQUEST_CODEC_ID: String =
      "GetPaymentMethodDomains.request"

  private val getPaymentMethodDomainsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetPaymentMethodDomainsFormCodec

  private val getPaymentMethodDomainsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1PaymentMethodDomainsGetResponse200JsonX99c7f0ab> =
      KotlinxSerializationCodec("GetPaymentMethodDomains.response.alternative0", InlineV1PaymentMethodDomainsGetResponse200JsonX99c7f0ab.Serializer, SdkJson)

  internal val getPaymentMethodDomainsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1PaymentMethodDomainsGetResponse200JsonX99c7f0ab> =
      MediaTypeCodecRegistry.of(getPaymentMethodDomainsResponseCodecAlternative0Codec)

  private val getPaymentMethodDomainsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPaymentMethodDomains.response.alternative1", Error.Serializer, SdkJson)

  internal val getPaymentMethodDomainsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPaymentMethodDomainsResponseCodecAlternative1Codec)

  internal val getPaymentMethodDomainsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPaymentMethodDomainsRequestCodec)

  internal const val GETPAYMENTMETHODDOMAINSPAYMENTMETHODDOMAIN_REQUEST_CODEC_ID: String =
      "GetPaymentMethodDomainsPaymentMethodDomain.request"

  private val getPaymentMethodDomainsPaymentMethodDomainRequestCodec: MediaTypeCodec<JsonObject?> =
      GetPaymentMethodDomainsPaymentMethodDomainFormCodec

  private val getPaymentMethodDomainsPaymentMethodDomainResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentMethodDomain> =
      KotlinxSerializationCodec("GetPaymentMethodDomainsPaymentMethodDomain.response.alternative0", PaymentMethodDomain.Serializer, SdkJson)

  internal val getPaymentMethodDomainsPaymentMethodDomainResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentMethodDomain> =
      MediaTypeCodecRegistry.of(getPaymentMethodDomainsPaymentMethodDomainResponseCodecAlternative0Codec)

  private val getPaymentMethodDomainsPaymentMethodDomainResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPaymentMethodDomainsPaymentMethodDomain.response.alternative1", Error.Serializer, SdkJson)

  internal val getPaymentMethodDomainsPaymentMethodDomainResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPaymentMethodDomainsPaymentMethodDomainResponseCodecAlternative1Codec)

  internal val getPaymentMethodDomainsPaymentMethodDomainRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPaymentMethodDomainsPaymentMethodDomainRequestCodec)

  internal const val POSTPAYMENTMETHODDOMAINS_REQUEST_CODEC_ID: String =
      "PostPaymentMethodDomains.request"

  private val postPaymentMethodDomainsRequestCodec:
      MediaTypeCodec<InlineV1PaymentMethodDomainsPostRequestFormX279b3096> =
      PostPaymentMethodDomainsFormCodec

  private val postPaymentMethodDomainsResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentMethodDomain> =
      KotlinxSerializationCodec("PostPaymentMethodDomains.response.alternative0", PaymentMethodDomain.Serializer, SdkJson)

  internal val postPaymentMethodDomainsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentMethodDomain> =
      MediaTypeCodecRegistry.of(postPaymentMethodDomainsResponseCodecAlternative0Codec)

  private val postPaymentMethodDomainsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPaymentMethodDomains.response.alternative1", Error.Serializer, SdkJson)

  internal val postPaymentMethodDomainsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPaymentMethodDomainsResponseCodecAlternative1Codec)

  internal val postPaymentMethodDomainsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PaymentMethodDomainsPostRequestFormX279b3096> =
      MediaTypeCodecRegistry.of(postPaymentMethodDomainsRequestCodec)

  internal const val POSTPAYMENTMETHODDOMAINSPAYMENTMETHODDOMAIN_REQUEST_CODEC_ID: String =
      "PostPaymentMethodDomainsPaymentMethodDomain.request"

  private val postPaymentMethodDomainsPaymentMethodDomainRequestCodec:
      MediaTypeCodec<InlineV1PaymentMethodDomainsPostRequestFormXd28a8c77?> =
      PostPaymentMethodDomainsPaymentMethodDomainFormCodec

  private val postPaymentMethodDomainsPaymentMethodDomainResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentMethodDomain> =
      KotlinxSerializationCodec("PostPaymentMethodDomainsPaymentMethodDomain.response.alternative0", PaymentMethodDomain.Serializer, SdkJson)

  internal val postPaymentMethodDomainsPaymentMethodDomainResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentMethodDomain> =
      MediaTypeCodecRegistry.of(postPaymentMethodDomainsPaymentMethodDomainResponseCodecAlternative0Codec)

  private val postPaymentMethodDomainsPaymentMethodDomainResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPaymentMethodDomainsPaymentMethodDomain.response.alternative1", Error.Serializer, SdkJson)

  internal val postPaymentMethodDomainsPaymentMethodDomainResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPaymentMethodDomainsPaymentMethodDomainResponseCodecAlternative1Codec)

  internal val postPaymentMethodDomainsPaymentMethodDomainRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PaymentMethodDomainsPostRequestFormXd28a8c77?> =
      MediaTypeCodecRegistry.of(postPaymentMethodDomainsPaymentMethodDomainRequestCodec)

  internal const val POSTPAYMENTMETHODDOMAINSPAYMENTMETHODDOMAINVALIDATE_REQUEST_CODEC_ID: String =
      "PostPaymentMethodDomainsPaymentMethodDomainValidate.request"

  private val postPaymentMethodDomainsPaymentMethodDomainValidateRequestCodec:
      MediaTypeCodec<InlineV1PaymentMethodDomainsValidatePostRequestFormXa55509bf?> =
      PostPaymentMethodDomainsPaymentMethodDomainValidateFormCodec

  private val postPaymentMethodDomainsPaymentMethodDomainValidateResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentMethodDomain> =
      KotlinxSerializationCodec("PostPaymentMethodDomainsPaymentMethodDomainValidate.response.alternative0", PaymentMethodDomain.Serializer, SdkJson)

  internal val postPaymentMethodDomainsPaymentMethodDomainValidateResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentMethodDomain> =
      MediaTypeCodecRegistry.of(postPaymentMethodDomainsPaymentMethodDomainValidateResponseCodecAlternative0Codec)

  private val postPaymentMethodDomainsPaymentMethodDomainValidateResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPaymentMethodDomainsPaymentMethodDomainValidate.response.alternative1", Error.Serializer, SdkJson)

  internal val postPaymentMethodDomainsPaymentMethodDomainValidateResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPaymentMethodDomainsPaymentMethodDomainValidateResponseCodecAlternative1Codec)

  internal val postPaymentMethodDomainsPaymentMethodDomainValidateRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PaymentMethodDomainsValidatePostRequestFormXa55509bf?> =
      MediaTypeCodecRegistry.of(postPaymentMethodDomainsPaymentMethodDomainValidateRequestCodec)

  internal object GetPaymentMethodDomainsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPaymentMethodDomains.request"

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

  internal object GetPaymentMethodDomainsPaymentMethodDomainFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPaymentMethodDomainsPaymentMethodDomain.request"

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

  internal object PostPaymentMethodDomainsFormCodec : MediaTypeCodec<InlineV1PaymentMethodDomainsPostRequestFormX279b3096> {
    override val id: String = "PostPaymentMethodDomains.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PaymentMethodDomainsPostRequestFormX279b3096, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("domain_name", request.domainName)
      request.enabled?.let { formValue0 ->
        form.add("enabled", formValue0.toString())
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PaymentMethodDomainsPostRequestFormX279b3096 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostPaymentMethodDomainsPaymentMethodDomainFormCodec : MediaTypeCodec<InlineV1PaymentMethodDomainsPostRequestFormXd28a8c77?> {
    override val id: String = "PostPaymentMethodDomainsPaymentMethodDomain.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PaymentMethodDomainsPostRequestFormXd28a8c77?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.enabled?.let { formValue0 ->
        form.add("enabled", formValue0.toString())
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PaymentMethodDomainsPostRequestFormXd28a8c77? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostPaymentMethodDomainsPaymentMethodDomainValidateFormCodec : MediaTypeCodec<InlineV1PaymentMethodDomainsValidatePostRequestFormXa55509bf?> {
    override val id: String = "PostPaymentMethodDomainsPaymentMethodDomainValidate.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PaymentMethodDomainsValidatePostRequestFormXa55509bf?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PaymentMethodDomainsValidatePostRequestFormXa55509bf? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'payment_method_domains' group of Stripe API.
 */
public class PaymentMethodDomainsClient(
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
      SdkExecutor(transport, authentication = this@PaymentMethodDomainsClient.authentication)

  /**
   * <p>Lists the details of existing payment method domains.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param domainName The domain name that this payment method domain object represents.
   * @param enabled Whether this payment method domain is enabled. If the domain is not enabled, payment methods will
   * not appear in Elements or Embedded Checkout
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
  public suspend fun getPaymentMethodDomainsWithResponse(
    request: JsonObject? = null,
    domainName: String? = null,
    enabled: Boolean? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPaymentMethodDomainsResponse> = executor.executeWithResponse<JsonObject?, GetPaymentMethodDomainsResponse>(SdkExecutionRequest(getPaymentMethodDomainsMetadata, baseUri, request, listOf(PaymentMethodDomainsCodecs.GETPAYMENTMETHODDOMAINS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "domain_name", values = domainName?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "enabled", values = enabled?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), PaymentMethodDomainsCodecs.getPaymentMethodDomainsRequestCodecRegistry, GetPaymentMethodDomainsResponseDecoder, options)

  /**
   * <p>Retrieves the details of an existing payment method domain.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param paymentMethodDomain Wire parameter `payment_method_domain`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getPaymentMethodDomainsPaymentMethodDomainWithResponse(
    request: JsonObject? = null,
    paymentMethodDomain: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPaymentMethodDomainsPaymentMethodDomainResponse> = executor.executeWithResponse<JsonObject?, GetPaymentMethodDomainsPaymentMethodDomainResponse>(SdkExecutionRequest(getPaymentMethodDomainsPaymentMethodDomainMetadata, baseUri, request, listOf(PaymentMethodDomainsCodecs.GETPAYMENTMETHODDOMAINSPAYMENTMETHODDOMAIN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "payment_method_domain", values = listOf(paymentMethodDomain.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), PaymentMethodDomainsCodecs.getPaymentMethodDomainsPaymentMethodDomainRequestCodecRegistry, GetPaymentMethodDomainsPaymentMethodDomainResponseDecoder, options)

  /**
   * <p>Creates a payment method domain.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postPaymentMethodDomainsWithResponse(request: InlineV1PaymentMethodDomainsPostRequestFormX279b3096, options: CallOptions = CallOptions()): SdkResponseResult<PostPaymentMethodDomainsResponse> = executor.executeWithResponse<InlineV1PaymentMethodDomainsPostRequestFormX279b3096, PostPaymentMethodDomainsResponse>(SdkExecutionRequest(postPaymentMethodDomainsMetadata, baseUri, request, listOf(PaymentMethodDomainsCodecs.POSTPAYMENTMETHODDOMAINS_REQUEST_CODEC_ID), emptyList()), PaymentMethodDomainsCodecs.postPaymentMethodDomainsRequestCodecRegistry, PostPaymentMethodDomainsResponseDecoder, options)

  /**
   * <p>Updates an existing payment method domain.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param paymentMethodDomain Wire parameter `payment_method_domain`.
   * @param options Execution options.
   */
  public suspend fun postPaymentMethodDomainsPaymentMethodDomainWithResponse(
    request: InlineV1PaymentMethodDomainsPostRequestFormXd28a8c77? = null,
    paymentMethodDomain: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostPaymentMethodDomainsPaymentMethodDomainResponse> = executor.executeWithResponse<InlineV1PaymentMethodDomainsPostRequestFormXd28a8c77?, PostPaymentMethodDomainsPaymentMethodDomainResponse>(SdkExecutionRequest(postPaymentMethodDomainsPaymentMethodDomainMetadata, baseUri, request, listOf(PaymentMethodDomainsCodecs.POSTPAYMENTMETHODDOMAINSPAYMENTMETHODDOMAIN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "payment_method_domain", values = listOf(paymentMethodDomain.toString())))
  }), PaymentMethodDomainsCodecs.postPaymentMethodDomainsPaymentMethodDomainRequestCodecRegistry, PostPaymentMethodDomainsPaymentMethodDomainResponseDecoder, options)

  /**
   * <p>Some payment methods might require additional steps to register a domain. If the requirements weren’t satisfied
   * when the domain was created, the payment method will be inactive on the domain.
   * The payment method doesn’t appear in Elements or Embedded Checkout for this domain until it is active.</p>
   *
   * <p>To activate a payment method on an existing payment method domain, complete the required registration steps
   * specific to the payment method, and then validate the payment method domain with this endpoint.</p>
   *
   * <p>Related guides: <a href="/docs/payments/payment-methods/pmd-registration">Payment method domains</a>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param paymentMethodDomain Wire parameter `payment_method_domain`.
   * @param options Execution options.
   */
  public suspend fun postPaymentMethodDomainsPaymentMethodDomainValidateWithResponse(
    request: InlineV1PaymentMethodDomainsValidatePostRequestFormXa55509bf? = null,
    paymentMethodDomain: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostPaymentMethodDomainsPaymentMethodDomainValidateResponse> = executor.executeWithResponse<InlineV1PaymentMethodDomainsValidatePostRequestFormXa55509bf?, PostPaymentMethodDomainsPaymentMethodDomainValidateResponse>(SdkExecutionRequest(postPaymentMethodDomainsPaymentMethodDomainValidateMetadata, baseUri, request, listOf(PaymentMethodDomainsCodecs.POSTPAYMENTMETHODDOMAINSPAYMENTMETHODDOMAINVALIDATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "payment_method_domain", values = listOf(paymentMethodDomain.toString())))
  }), PaymentMethodDomainsCodecs.postPaymentMethodDomainsPaymentMethodDomainValidateRequestCodecRegistry, PostPaymentMethodDomainsPaymentMethodDomainValidateResponseDecoder, options)

  /**
   * Typed response alternatives for `GetPaymentMethodDomains`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetPaymentMethodDomainsResponse {
    public class SuccessJson(
      public val json: InlineV1PaymentMethodDomainsGetResponse200JsonX99c7f0ab,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentMethodDomainsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentMethodDomainsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentMethodDomainsResponse
  }

  private object GetPaymentMethodDomainsResponseDecoder : SdkResponseAlternativeDecoder<GetPaymentMethodDomainsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPaymentMethodDomainsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPaymentMethodDomainsResponse> = when {
      alternative.id == "GetPaymentMethodDomains.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPaymentMethodDomainsResponse.SuccessJson(
          json = PaymentMethodDomainsCodecs.getPaymentMethodDomainsResponseCodecAlternative0Registry.select(listOf("GetPaymentMethodDomains.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPaymentMethodDomains.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPaymentMethodDomainsResponse.DefaultJson(
          json = PaymentMethodDomainsCodecs.getPaymentMethodDomainsResponseCodecAlternative1Registry.select(listOf("GetPaymentMethodDomains.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPaymentMethodDomainsResponse = GetPaymentMethodDomainsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetPaymentMethodDomainsPaymentMethodDomain`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetPaymentMethodDomainsPaymentMethodDomainResponse {
    public class SuccessJson(
      public val json: PaymentMethodDomain,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentMethodDomainsPaymentMethodDomainResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentMethodDomainsPaymentMethodDomainResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentMethodDomainsPaymentMethodDomainResponse
  }

  private object GetPaymentMethodDomainsPaymentMethodDomainResponseDecoder : SdkResponseAlternativeDecoder<GetPaymentMethodDomainsPaymentMethodDomainResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPaymentMethodDomainsPaymentMethodDomainResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPaymentMethodDomainsPaymentMethodDomainResponse> = when {
      alternative.id == "GetPaymentMethodDomainsPaymentMethodDomain.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPaymentMethodDomainsPaymentMethodDomainResponse.SuccessJson(
          json = PaymentMethodDomainsCodecs.getPaymentMethodDomainsPaymentMethodDomainResponseCodecAlternative0Registry.select(listOf("GetPaymentMethodDomainsPaymentMethodDomain.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPaymentMethodDomainsPaymentMethodDomain.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPaymentMethodDomainsPaymentMethodDomainResponse.DefaultJson(
          json = PaymentMethodDomainsCodecs.getPaymentMethodDomainsPaymentMethodDomainResponseCodecAlternative1Registry.select(listOf("GetPaymentMethodDomainsPaymentMethodDomain.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPaymentMethodDomainsPaymentMethodDomainResponse = GetPaymentMethodDomainsPaymentMethodDomainResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPaymentMethodDomains`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostPaymentMethodDomainsResponse {
    public class SuccessJson(
      public val json: PaymentMethodDomain,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodDomainsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodDomainsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodDomainsResponse
  }

  private object PostPaymentMethodDomainsResponseDecoder : SdkResponseAlternativeDecoder<PostPaymentMethodDomainsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPaymentMethodDomainsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPaymentMethodDomainsResponse> = when {
      alternative.id == "PostPaymentMethodDomains.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPaymentMethodDomainsResponse.SuccessJson(
          json = PaymentMethodDomainsCodecs.postPaymentMethodDomainsResponseCodecAlternative0Registry.select(listOf("PostPaymentMethodDomains.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPaymentMethodDomains.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPaymentMethodDomainsResponse.DefaultJson(
          json = PaymentMethodDomainsCodecs.postPaymentMethodDomainsResponseCodecAlternative1Registry.select(listOf("PostPaymentMethodDomains.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPaymentMethodDomainsResponse = PostPaymentMethodDomainsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPaymentMethodDomainsPaymentMethodDomain`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostPaymentMethodDomainsPaymentMethodDomainResponse {
    public class SuccessJson(
      public val json: PaymentMethodDomain,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodDomainsPaymentMethodDomainResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodDomainsPaymentMethodDomainResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodDomainsPaymentMethodDomainResponse
  }

  private object PostPaymentMethodDomainsPaymentMethodDomainResponseDecoder : SdkResponseAlternativeDecoder<PostPaymentMethodDomainsPaymentMethodDomainResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPaymentMethodDomainsPaymentMethodDomainResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPaymentMethodDomainsPaymentMethodDomainResponse> = when {
      alternative.id == "PostPaymentMethodDomainsPaymentMethodDomain.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPaymentMethodDomainsPaymentMethodDomainResponse.SuccessJson(
          json = PaymentMethodDomainsCodecs.postPaymentMethodDomainsPaymentMethodDomainResponseCodecAlternative0Registry.select(listOf("PostPaymentMethodDomainsPaymentMethodDomain.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPaymentMethodDomainsPaymentMethodDomain.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPaymentMethodDomainsPaymentMethodDomainResponse.DefaultJson(
          json = PaymentMethodDomainsCodecs.postPaymentMethodDomainsPaymentMethodDomainResponseCodecAlternative1Registry.select(listOf("PostPaymentMethodDomainsPaymentMethodDomain.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPaymentMethodDomainsPaymentMethodDomainResponse = PostPaymentMethodDomainsPaymentMethodDomainResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPaymentMethodDomainsPaymentMethodDomainValidate`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface PostPaymentMethodDomainsPaymentMethodDomainValidateResponse {
    public class SuccessJson(
      public val json: PaymentMethodDomain,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodDomainsPaymentMethodDomainValidateResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodDomainsPaymentMethodDomainValidateResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodDomainsPaymentMethodDomainValidateResponse
  }

  private object PostPaymentMethodDomainsPaymentMethodDomainValidateResponseDecoder : SdkResponseAlternativeDecoder<PostPaymentMethodDomainsPaymentMethodDomainValidateResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPaymentMethodDomainsPaymentMethodDomainValidateResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPaymentMethodDomainsPaymentMethodDomainValidateResponse> = when {
      alternative.id == "PostPaymentMethodDomainsPaymentMethodDomainValidate.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPaymentMethodDomainsPaymentMethodDomainValidateResponse.SuccessJson(
          json = PaymentMethodDomainsCodecs.postPaymentMethodDomainsPaymentMethodDomainValidateResponseCodecAlternative0Registry.select(listOf("PostPaymentMethodDomainsPaymentMethodDomainValidate.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPaymentMethodDomainsPaymentMethodDomainValidate.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPaymentMethodDomainsPaymentMethodDomainValidateResponse.DefaultJson(
          json = PaymentMethodDomainsCodecs.postPaymentMethodDomainsPaymentMethodDomainValidateResponseCodecAlternative1Registry.select(listOf("PostPaymentMethodDomainsPaymentMethodDomainValidate.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPaymentMethodDomainsPaymentMethodDomainValidateResponse = PostPaymentMethodDomainsPaymentMethodDomainValidateResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getPaymentMethodDomainsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPaymentMethodDomains",
          method = "GET",
          path = "/v1/payment_method_domains",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1PaymentMethodDomainsGetResponse200JsonX99c7f0ab",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentMethodDomains.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentMethodDomains.response.alternative1",
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

    internal val getPaymentMethodDomainsPaymentMethodDomainMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPaymentMethodDomainsPaymentMethodDomain",
          method = "GET",
          path = "/v1/payment_method_domains/{payment_method_domain}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentMethodDomain",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentMethodDomainsPaymentMethodDomain.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentMethodDomainsPaymentMethodDomain.response.alternative1",
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

    internal val postPaymentMethodDomainsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPaymentMethodDomains",
          method = "POST",
          path = "/v1/payment_method_domains",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentMethodDomain",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentMethodDomains.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentMethodDomains.response.alternative1",
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

    internal val postPaymentMethodDomainsPaymentMethodDomainMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPaymentMethodDomainsPaymentMethodDomain",
          method = "POST",
          path = "/v1/payment_method_domains/{payment_method_domain}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentMethodDomain",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentMethodDomainsPaymentMethodDomain.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentMethodDomainsPaymentMethodDomain.response.alternative1",
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

    internal val postPaymentMethodDomainsPaymentMethodDomainValidateMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPaymentMethodDomainsPaymentMethodDomainValidate",
          method = "POST",
          path = "/v1/payment_method_domains/{payment_method_domain}/validate",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentMethodDomain",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentMethodDomainsPaymentMethodDomainValidate.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentMethodDomainsPaymentMethodDomainValidate.response.alternative1",
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
