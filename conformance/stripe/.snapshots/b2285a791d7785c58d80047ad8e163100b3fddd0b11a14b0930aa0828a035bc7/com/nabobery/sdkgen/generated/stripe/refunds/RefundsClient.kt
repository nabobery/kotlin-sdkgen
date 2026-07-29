package com.nabobery.sdkgen.generated.stripe.refunds

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1RefundsCancelPostRequestFormX0d2b9aec
import com.nabobery.sdkgen.generated.stripe.InlineV1RefundsGetParameterX7638b41e
import com.nabobery.sdkgen.generated.stripe.InlineV1RefundsGetResponse200JsonX9b79e480
import com.nabobery.sdkgen.generated.stripe.InlineV1RefundsPostRequestFormX3e77f244
import com.nabobery.sdkgen.generated.stripe.InlineV1RefundsPostRequestFormXeb4d6677
import com.nabobery.sdkgen.generated.stripe.Refund
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

public object RefundsCodecs {
  public const val GETREFUNDS_REQUEST_CODEC_ID: String = "GetRefunds.request"

  private val getRefundsRequestCodec: MediaTypeCodec<JsonObject?> = GetRefundsFormCodec

  private val getRefundsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1RefundsGetResponse200JsonX9b79e480> =
      KotlinxSerializationCodec("GetRefunds.response.alternative0", InlineV1RefundsGetResponse200JsonX9b79e480.Serializer, SdkJson)

  public val getRefundsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1RefundsGetResponse200JsonX9b79e480> =
      MediaTypeCodecRegistry.of(getRefundsResponseCodecAlternative0Codec)

  private val getRefundsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetRefunds.response.alternative1", Error.Serializer, SdkJson)

  public val getRefundsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getRefundsResponseCodecAlternative1Codec)

  public val getRefundsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getRefundsRequestCodec)

  public const val GETREFUNDSREFUND_REQUEST_CODEC_ID: String = "GetRefundsRefund.request"

  private val getRefundsRefundRequestCodec: MediaTypeCodec<JsonObject?> = GetRefundsRefundFormCodec

  private val getRefundsRefundResponseCodecAlternative0Codec: MediaTypeCodec<Refund> =
      KotlinxSerializationCodec("GetRefundsRefund.response.alternative0", Refund.Serializer, SdkJson)

  public val getRefundsRefundResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Refund> =
      MediaTypeCodecRegistry.of(getRefundsRefundResponseCodecAlternative0Codec)

  private val getRefundsRefundResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetRefundsRefund.response.alternative1", Error.Serializer, SdkJson)

  public val getRefundsRefundResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getRefundsRefundResponseCodecAlternative1Codec)

  public val getRefundsRefundRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getRefundsRefundRequestCodec)

  public const val POSTREFUNDS_REQUEST_CODEC_ID: String = "PostRefunds.request"

  private val postRefundsRequestCodec: MediaTypeCodec<InlineV1RefundsPostRequestFormX3e77f244?> =
      PostRefundsFormCodec

  private val postRefundsResponseCodecAlternative0Codec: MediaTypeCodec<Refund> =
      KotlinxSerializationCodec("PostRefunds.response.alternative0", Refund.Serializer, SdkJson)

  public val postRefundsResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Refund> =
      MediaTypeCodecRegistry.of(postRefundsResponseCodecAlternative0Codec)

  private val postRefundsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostRefunds.response.alternative1", Error.Serializer, SdkJson)

  public val postRefundsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postRefundsResponseCodecAlternative1Codec)

  public val postRefundsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1RefundsPostRequestFormX3e77f244?> =
      MediaTypeCodecRegistry.of(postRefundsRequestCodec)

  public const val POSTREFUNDSREFUND_REQUEST_CODEC_ID: String = "PostRefundsRefund.request"

  private val postRefundsRefundRequestCodec:
      MediaTypeCodec<InlineV1RefundsPostRequestFormXeb4d6677?> = PostRefundsRefundFormCodec

  private val postRefundsRefundResponseCodecAlternative0Codec: MediaTypeCodec<Refund> =
      KotlinxSerializationCodec("PostRefundsRefund.response.alternative0", Refund.Serializer, SdkJson)

  public val postRefundsRefundResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Refund> =
      MediaTypeCodecRegistry.of(postRefundsRefundResponseCodecAlternative0Codec)

  private val postRefundsRefundResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostRefundsRefund.response.alternative1", Error.Serializer, SdkJson)

  public val postRefundsRefundResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postRefundsRefundResponseCodecAlternative1Codec)

  public val postRefundsRefundRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1RefundsPostRequestFormXeb4d6677?> =
      MediaTypeCodecRegistry.of(postRefundsRefundRequestCodec)

  public const val POSTREFUNDSREFUNDCANCEL_REQUEST_CODEC_ID: String =
      "PostRefundsRefundCancel.request"

  private val postRefundsRefundCancelRequestCodec:
      MediaTypeCodec<InlineV1RefundsCancelPostRequestFormX0d2b9aec?> =
      PostRefundsRefundCancelFormCodec

  private val postRefundsRefundCancelResponseCodecAlternative0Codec: MediaTypeCodec<Refund> =
      KotlinxSerializationCodec("PostRefundsRefundCancel.response.alternative0", Refund.Serializer, SdkJson)

  public val postRefundsRefundCancelResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Refund> =
      MediaTypeCodecRegistry.of(postRefundsRefundCancelResponseCodecAlternative0Codec)

  private val postRefundsRefundCancelResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostRefundsRefundCancel.response.alternative1", Error.Serializer, SdkJson)

  public val postRefundsRefundCancelResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(postRefundsRefundCancelResponseCodecAlternative1Codec)

  public val postRefundsRefundCancelRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1RefundsCancelPostRequestFormX0d2b9aec?> =
      MediaTypeCodecRegistry.of(postRefundsRefundCancelRequestCodec)

  public object GetRefundsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetRefunds.request"

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

  public object GetRefundsRefundFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetRefundsRefund.request"

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

  public object PostRefundsFormCodec : MediaTypeCodec<InlineV1RefundsPostRequestFormX3e77f244?> {
    override val id: String = "PostRefunds.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1RefundsPostRequestFormX3e77f244?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount?.let { formValue0 ->
        form.add("amount", formValue0.toString())
      }
      request.charge?.let { formValue0 ->
        form.add("charge", formValue0)
      }
      request.currency?.let { formValue0 ->
        form.add("currency", formValue0)
      }
      request.customer?.let { formValue0 ->
        form.add("customer", formValue0)
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
      request.instructionsEmail?.let { formValue0 ->
        form.add("instructions_email", formValue0)
      }
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1RefundsPostRequestFormMetadataAnyOf2X0db56cec != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1RefundsPostRequestFormMetadataAnyOf2X0db56cec).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.origin?.let { formValue0 ->
        form.add("origin", formValue0.value)
      }
      request.paymentIntent?.let { formValue0 ->
        form.add("payment_intent", formValue0)
      }
      request.reason?.let { formValue0 ->
        form.add("reason", formValue0.value)
      }
      request.refundApplicationFee?.let { formValue0 ->
        form.add("refund_application_fee", formValue0.toString())
      }
      request.reverseTransfer?.let { formValue0 ->
        form.add("reverse_transfer", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1RefundsPostRequestFormX3e77f244? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostRefundsRefundFormCodec : MediaTypeCodec<InlineV1RefundsPostRequestFormXeb4d6677?> {
    override val id: String = "PostRefundsRefund.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1RefundsPostRequestFormXeb4d6677?, mediaType: String): SdkRequestBody {
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
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1RefundsPostRequestFormMetadataAnyOf2X8684f3e2 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1RefundsPostRequestFormMetadataAnyOf2X8684f3e2).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1RefundsPostRequestFormXeb4d6677? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostRefundsRefundCancelFormCodec : MediaTypeCodec<InlineV1RefundsCancelPostRequestFormX0d2b9aec?> {
    override val id: String = "PostRefundsRefundCancel.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1RefundsCancelPostRequestFormX0d2b9aec?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1RefundsCancelPostRequestFormX0d2b9aec? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'refunds' group of Stripe API.
 */
public class RefundsClient(
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
      SdkExecutor(transport, authentication = this@RefundsClient.authentication)

  /**
   * <p>Returns a list of all refunds you created. We return the refunds in sorted order, with the most recent refunds
   * appearing first. The 10 most recent refunds are always available by default on the Charge object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param charge Only return refunds for the charge specified by this charge ID.
   * @param created Only return refunds that were created during the given date interval.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param paymentIntent Only return refunds for the PaymentIntent specified by this ID.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getRefundsWithResponse(
    request: JsonObject? = null,
    charge: String? = null,
    created: InlineV1RefundsGetParameterX7638b41e? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    paymentIntent: String? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetRefundsResponse> = executor.executeWithResponse<JsonObject?, GetRefundsResponse>(SdkExecutionRequest(getRefundsMetadata, baseUri, request, listOf(RefundsCodecs.GETREFUNDS_REQUEST_CODEC_ID), buildList {
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
  }), RefundsCodecs.getRefundsRequestCodecRegistry, GetRefundsResponseDecoder, options)

  /**
   * <p>Retrieves the details of an existing refund.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param refund Wire parameter `refund`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getRefundsRefundWithResponse(
    request: JsonObject? = null,
    refund: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetRefundsRefundResponse> = executor.executeWithResponse<JsonObject?, GetRefundsRefundResponse>(SdkExecutionRequest(getRefundsRefundMetadata, baseUri, request, listOf(RefundsCodecs.GETREFUNDSREFUND_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "refund", values = listOf(refund.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), RefundsCodecs.getRefundsRefundRequestCodecRegistry, GetRefundsRefundResponseDecoder, options)

  /**
   * <p>When you create a new refund, you must specify a Charge or a PaymentIntent object on which to create it.</p>
   *
   * <p>Creating a new refund will refund a charge that has previously been created but not yet refunded.
   * Funds will be refunded to the credit or debit card that was originally charged.</p>
   *
   * <p>You can optionally refund only part of a charge.
   * You can do so multiple times, until the entire charge has been refunded.</p>
   *
   * <p>Once entirely refunded, a charge can’t be refunded again.
   * This method will raise an error when called on an already-refunded charge,
   * or when trying to refund more money than is left on a charge.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postRefundsWithResponse(request: InlineV1RefundsPostRequestFormX3e77f244? = null, options: CallOptions = CallOptions()): SdkResponseResult<PostRefundsResponse> = executor.executeWithResponse<InlineV1RefundsPostRequestFormX3e77f244?, PostRefundsResponse>(SdkExecutionRequest(postRefundsMetadata, baseUri, request, listOf(RefundsCodecs.POSTREFUNDS_REQUEST_CODEC_ID), emptyList()), RefundsCodecs.postRefundsRequestCodecRegistry, PostRefundsResponseDecoder, options)

  /**
   * <p>Updates the refund that you specify by setting the values of the passed parameters. Any parameters that you
   * don’t provide remain unchanged.</p>
   *
   * <p>This request only accepts <code>metadata</code> as an argument.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param refund Wire parameter `refund`.
   * @param options Execution options.
   */
  public suspend fun postRefundsRefundWithResponse(
    request: InlineV1RefundsPostRequestFormXeb4d6677? = null,
    refund: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostRefundsRefundResponse> = executor.executeWithResponse<InlineV1RefundsPostRequestFormXeb4d6677?, PostRefundsRefundResponse>(SdkExecutionRequest(postRefundsRefundMetadata, baseUri, request, listOf(RefundsCodecs.POSTREFUNDSREFUND_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "refund", values = listOf(refund.toString())))
  }), RefundsCodecs.postRefundsRefundRequestCodecRegistry, PostRefundsRefundResponseDecoder, options)

  /**
   * <p>Cancels a refund with a status of <code>requires_action</code>.</p>
   *
   * <p>You can’t cancel refunds in other states. Only refunds for payment methods that require customer action can
   * enter the <code>requires_action</code> state.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param refund Wire parameter `refund`.
   * @param options Execution options.
   */
  public suspend fun postRefundsRefundCancelWithResponse(
    request: InlineV1RefundsCancelPostRequestFormX0d2b9aec? = null,
    refund: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostRefundsRefundCancelResponse> = executor.executeWithResponse<InlineV1RefundsCancelPostRequestFormX0d2b9aec?, PostRefundsRefundCancelResponse>(SdkExecutionRequest(postRefundsRefundCancelMetadata, baseUri, request, listOf(RefundsCodecs.POSTREFUNDSREFUNDCANCEL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "refund", values = listOf(refund.toString())))
  }), RefundsCodecs.postRefundsRefundCancelRequestCodecRegistry, PostRefundsRefundCancelResponseDecoder, options)

  /**
   * Typed response alternatives for `GetRefunds`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetRefundsResponse {
    public class SuccessJson(
      public val json: InlineV1RefundsGetResponse200JsonX9b79e480,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRefundsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRefundsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRefundsResponse
  }

  private object GetRefundsResponseDecoder : SdkResponseAlternativeDecoder<GetRefundsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetRefundsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetRefundsResponse> = when {
      alternative.id == "GetRefunds.response.alternative0" -> SdkResponseDecodeResult(
        value = GetRefundsResponse.SuccessJson(
          json = RefundsCodecs.getRefundsResponseCodecAlternative0Registry.select(listOf("GetRefunds.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetRefunds.response.alternative1" -> SdkResponseDecodeResult(
        value = GetRefundsResponse.DefaultJson(
          json = RefundsCodecs.getRefundsResponseCodecAlternative1Registry.select(listOf("GetRefunds.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetRefundsResponse = GetRefundsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetRefundsRefund`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetRefundsRefundResponse {
    public class SuccessJson(
      public val json: Refund,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRefundsRefundResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRefundsRefundResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRefundsRefundResponse
  }

  private object GetRefundsRefundResponseDecoder : SdkResponseAlternativeDecoder<GetRefundsRefundResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetRefundsRefundResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetRefundsRefundResponse> = when {
      alternative.id == "GetRefundsRefund.response.alternative0" -> SdkResponseDecodeResult(
        value = GetRefundsRefundResponse.SuccessJson(
          json = RefundsCodecs.getRefundsRefundResponseCodecAlternative0Registry.select(listOf("GetRefundsRefund.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetRefundsRefund.response.alternative1" -> SdkResponseDecodeResult(
        value = GetRefundsRefundResponse.DefaultJson(
          json = RefundsCodecs.getRefundsRefundResponseCodecAlternative1Registry.select(listOf("GetRefundsRefund.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetRefundsRefundResponse = GetRefundsRefundResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostRefunds`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostRefundsResponse {
    public class SuccessJson(
      public val json: Refund,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRefundsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRefundsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRefundsResponse
  }

  private object PostRefundsResponseDecoder : SdkResponseAlternativeDecoder<PostRefundsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostRefundsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostRefundsResponse> = when {
      alternative.id == "PostRefunds.response.alternative0" -> SdkResponseDecodeResult(
        value = PostRefundsResponse.SuccessJson(
          json = RefundsCodecs.postRefundsResponseCodecAlternative0Registry.select(listOf("PostRefunds.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostRefunds.response.alternative1" -> SdkResponseDecodeResult(
        value = PostRefundsResponse.DefaultJson(
          json = RefundsCodecs.postRefundsResponseCodecAlternative1Registry.select(listOf("PostRefunds.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostRefundsResponse = PostRefundsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostRefundsRefund`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostRefundsRefundResponse {
    public class SuccessJson(
      public val json: Refund,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRefundsRefundResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRefundsRefundResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRefundsRefundResponse
  }

  private object PostRefundsRefundResponseDecoder : SdkResponseAlternativeDecoder<PostRefundsRefundResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostRefundsRefundResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostRefundsRefundResponse> = when {
      alternative.id == "PostRefundsRefund.response.alternative0" -> SdkResponseDecodeResult(
        value = PostRefundsRefundResponse.SuccessJson(
          json = RefundsCodecs.postRefundsRefundResponseCodecAlternative0Registry.select(listOf("PostRefundsRefund.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostRefundsRefund.response.alternative1" -> SdkResponseDecodeResult(
        value = PostRefundsRefundResponse.DefaultJson(
          json = RefundsCodecs.postRefundsRefundResponseCodecAlternative1Registry.select(listOf("PostRefundsRefund.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostRefundsRefundResponse = PostRefundsRefundResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostRefundsRefundCancel`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostRefundsRefundCancelResponse {
    public class SuccessJson(
      public val json: Refund,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRefundsRefundCancelResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRefundsRefundCancelResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRefundsRefundCancelResponse
  }

  private object PostRefundsRefundCancelResponseDecoder : SdkResponseAlternativeDecoder<PostRefundsRefundCancelResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostRefundsRefundCancelResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostRefundsRefundCancelResponse> = when {
      alternative.id == "PostRefundsRefundCancel.response.alternative0" -> SdkResponseDecodeResult(
        value = PostRefundsRefundCancelResponse.SuccessJson(
          json = RefundsCodecs.postRefundsRefundCancelResponseCodecAlternative0Registry.select(listOf("PostRefundsRefundCancel.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostRefundsRefundCancel.response.alternative1" -> SdkResponseDecodeResult(
        value = PostRefundsRefundCancelResponse.DefaultJson(
          json = RefundsCodecs.postRefundsRefundCancelResponseCodecAlternative1Registry.select(listOf("PostRefundsRefundCancel.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostRefundsRefundCancelResponse = PostRefundsRefundCancelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val getRefundsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetRefunds",
          method = "GET",
          path = "/v1/refunds",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1RefundsGetResponse200JsonX9b79e480",
              mode = SdkResponseMode.BUFFERED,
              id = "GetRefunds.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetRefunds.response.alternative1",
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

    public val getRefundsRefundMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetRefundsRefund",
          method = "GET",
          path = "/v1/refunds/{refund}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Refund",
              mode = SdkResponseMode.BUFFERED,
              id = "GetRefundsRefund.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetRefundsRefund.response.alternative1",
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

    public val postRefundsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostRefunds",
          method = "POST",
          path = "/v1/refunds",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Refund",
              mode = SdkResponseMode.BUFFERED,
              id = "PostRefunds.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostRefunds.response.alternative1",
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

    public val postRefundsRefundMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostRefundsRefund",
          method = "POST",
          path = "/v1/refunds/{refund}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Refund",
              mode = SdkResponseMode.BUFFERED,
              id = "PostRefundsRefund.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostRefundsRefund.response.alternative1",
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

    public val postRefundsRefundCancelMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostRefundsRefundCancel",
          method = "POST",
          path = "/v1/refunds/{refund}/cancel",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Refund",
              mode = SdkResponseMode.BUFFERED,
              id = "PostRefundsRefundCancel.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostRefundsRefundCancel.response.alternative1",
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
