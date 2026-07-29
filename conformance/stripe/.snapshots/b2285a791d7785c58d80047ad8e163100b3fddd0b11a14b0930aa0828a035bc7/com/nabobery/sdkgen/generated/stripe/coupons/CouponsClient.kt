package com.nabobery.sdkgen.generated.stripe.coupons

import com.nabobery.sdkgen.generated.stripe.Coupon
import com.nabobery.sdkgen.generated.stripe.DeletedCoupon
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1CouponsGetParameterX3b2359f8
import com.nabobery.sdkgen.generated.stripe.InlineV1CouponsGetResponse200JsonXf21a52f2
import com.nabobery.sdkgen.generated.stripe.InlineV1CouponsPostRequestFormX8a95aa20
import com.nabobery.sdkgen.generated.stripe.InlineV1CouponsPostRequestFormXb16bd4b6
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

public object CouponsCodecs {
  public const val DELETECOUPONSCOUPON_REQUEST_CODEC_ID: String = "DeleteCouponsCoupon.request"

  private val deleteCouponsCouponRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteCouponsCouponFormCodec

  private val deleteCouponsCouponResponseCodecAlternative0Codec: MediaTypeCodec<DeletedCoupon> =
      KotlinxSerializationCodec("DeleteCouponsCoupon.response.alternative0", DeletedCoupon.Serializer, SdkJson)

  public val deleteCouponsCouponResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedCoupon> =
      MediaTypeCodecRegistry.of(deleteCouponsCouponResponseCodecAlternative0Codec)

  private val deleteCouponsCouponResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteCouponsCoupon.response.alternative1", Error.Serializer, SdkJson)

  public val deleteCouponsCouponResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteCouponsCouponResponseCodecAlternative1Codec)

  public val deleteCouponsCouponRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteCouponsCouponRequestCodec)

  public const val GETCOUPONS_REQUEST_CODEC_ID: String = "GetCoupons.request"

  private val getCouponsRequestCodec: MediaTypeCodec<JsonObject?> = GetCouponsFormCodec

  private val getCouponsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CouponsGetResponse200JsonXf21a52f2> =
      KotlinxSerializationCodec("GetCoupons.response.alternative0", InlineV1CouponsGetResponse200JsonXf21a52f2.Serializer, SdkJson)

  public val getCouponsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CouponsGetResponse200JsonXf21a52f2> =
      MediaTypeCodecRegistry.of(getCouponsResponseCodecAlternative0Codec)

  private val getCouponsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCoupons.response.alternative1", Error.Serializer, SdkJson)

  public val getCouponsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCouponsResponseCodecAlternative1Codec)

  public val getCouponsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCouponsRequestCodec)

  public const val GETCOUPONSCOUPON_REQUEST_CODEC_ID: String = "GetCouponsCoupon.request"

  private val getCouponsCouponRequestCodec: MediaTypeCodec<JsonObject?> = GetCouponsCouponFormCodec

  private val getCouponsCouponResponseCodecAlternative0Codec: MediaTypeCodec<Coupon> =
      KotlinxSerializationCodec("GetCouponsCoupon.response.alternative0", Coupon.Serializer, SdkJson)

  public val getCouponsCouponResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Coupon> =
      MediaTypeCodecRegistry.of(getCouponsCouponResponseCodecAlternative0Codec)

  private val getCouponsCouponResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCouponsCoupon.response.alternative1", Error.Serializer, SdkJson)

  public val getCouponsCouponResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCouponsCouponResponseCodecAlternative1Codec)

  public val getCouponsCouponRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCouponsCouponRequestCodec)

  public const val POSTCOUPONS_REQUEST_CODEC_ID: String = "PostCoupons.request"

  private val postCouponsRequestCodec: MediaTypeCodec<InlineV1CouponsPostRequestFormX8a95aa20?> =
      PostCouponsFormCodec

  private val postCouponsResponseCodecAlternative0Codec: MediaTypeCodec<Coupon> =
      KotlinxSerializationCodec("PostCoupons.response.alternative0", Coupon.Serializer, SdkJson)

  public val postCouponsResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Coupon> =
      MediaTypeCodecRegistry.of(postCouponsResponseCodecAlternative0Codec)

  private val postCouponsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostCoupons.response.alternative1", Error.Serializer, SdkJson)

  public val postCouponsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCouponsResponseCodecAlternative1Codec)

  public val postCouponsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CouponsPostRequestFormX8a95aa20?> =
      MediaTypeCodecRegistry.of(postCouponsRequestCodec)

  public const val POSTCOUPONSCOUPON_REQUEST_CODEC_ID: String = "PostCouponsCoupon.request"

  private val postCouponsCouponRequestCodec:
      MediaTypeCodec<InlineV1CouponsPostRequestFormXb16bd4b6?> = PostCouponsCouponFormCodec

  private val postCouponsCouponResponseCodecAlternative0Codec: MediaTypeCodec<Coupon> =
      KotlinxSerializationCodec("PostCouponsCoupon.response.alternative0", Coupon.Serializer, SdkJson)

  public val postCouponsCouponResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Coupon> =
      MediaTypeCodecRegistry.of(postCouponsCouponResponseCodecAlternative0Codec)

  private val postCouponsCouponResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostCouponsCoupon.response.alternative1", Error.Serializer, SdkJson)

  public val postCouponsCouponResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCouponsCouponResponseCodecAlternative1Codec)

  public val postCouponsCouponRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CouponsPostRequestFormXb16bd4b6?> =
      MediaTypeCodecRegistry.of(postCouponsCouponRequestCodec)

  public object DeleteCouponsCouponFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteCouponsCoupon.request"

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

  public object GetCouponsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCoupons.request"

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

  public object GetCouponsCouponFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCouponsCoupon.request"

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

  public object PostCouponsFormCodec : MediaTypeCodec<InlineV1CouponsPostRequestFormX8a95aa20?> {
    override val id: String = "PostCoupons.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CouponsPostRequestFormX8a95aa20?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amountOff?.let { formValue0 ->
        form.add("amount_off", formValue0.toString())
      }
      request.appliesTo?.let { formValue0 ->
        formValue0.products?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("applies_to" + "[products]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              form.add("applies_to" + "[products]" + "[" + formIndex3 + "]", formElement3)
            }
          }
        }
      }
      request.currency?.let { formValue0 ->
        form.add("currency", formValue0)
      }
      request.currencyOptions?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("currency_options" + "[" + formKey1 + "]" + "[amount_off]", formMapValue1.amountOff.toString())
        }
      }
      request.duration?.let { formValue0 ->
        form.add("duration", formValue0.value)
      }
      request.durationInMonths?.let { formValue0 ->
        form.add("duration_in_months", formValue0.toString())
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
      request.id?.let { formValue0 ->
        form.add("id", formValue0)
      }
      request.maxRedemptions?.let { formValue0 ->
        form.add("max_redemptions", formValue0.toString())
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
          formValue0.inlineV1CouponsPostRequestFormMetadataAnyOf2X0157fe03 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1CouponsPostRequestFormMetadataAnyOf2X0157fe03).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.name?.let { formValue0 ->
        form.add("name", formValue0)
      }
      request.percentOff?.let { formValue0 ->
        form.add("percent_off", formValue0)
      }
      request.redeemBy?.let { formValue0 ->
        form.add("redeem_by", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CouponsPostRequestFormX8a95aa20? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostCouponsCouponFormCodec : MediaTypeCodec<InlineV1CouponsPostRequestFormXb16bd4b6?> {
    override val id: String = "PostCouponsCoupon.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CouponsPostRequestFormXb16bd4b6?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.currencyOptions?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("currency_options" + "[" + formKey1 + "]" + "[amount_off]", formMapValue1.amountOff.toString())
        }
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
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1CouponsPostRequestFormMetadataAnyOf2X286f7252).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.name?.let { formValue0 ->
        form.add("name", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CouponsPostRequestFormXb16bd4b6? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'coupons' group of Stripe API.
 */
public class CouponsClient(
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
      SdkExecutor(transport, authentication = this@CouponsClient.authentication)

  /**
   * <p>You can delete coupons via the <a href="https://dashboard.stripe.com/coupons">coupon management</a> page of the
   * Stripe dashboard. However, deleting a coupon does not affect any customers who have already applied the coupon; it
   * means that new customers can’t redeem the coupon. You can also delete coupons via the API.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param coupon Wire parameter `coupon`.
   * @param options Execution options.
   */
  public suspend fun deleteCouponsCouponWithResponse(
    request: JsonObject? = null,
    coupon: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteCouponsCouponResponse> = executor.executeWithResponse<JsonObject?, DeleteCouponsCouponResponse>(SdkExecutionRequest(deleteCouponsCouponMetadata, baseUri, request, listOf(CouponsCodecs.DELETECOUPONSCOUPON_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "coupon", values = listOf(coupon.toString())))
  }), CouponsCodecs.deleteCouponsCouponRequestCodecRegistry, DeleteCouponsCouponResponseDecoder, options)

  /**
   * <p>Returns a list of your coupons.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created A filter on the list, based on the object `created` field. The value can be a string with an integer
   * Unix timestamp, or it can be a dictionary with a number of different query options.
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
  public suspend fun getCouponsWithResponse(
    request: JsonObject? = null,
    created: InlineV1CouponsGetParameterX3b2359f8? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCouponsResponse> = executor.executeWithResponse<JsonObject?, GetCouponsResponse>(SdkExecutionRequest(getCouponsMetadata, baseUri, request, listOf(CouponsCodecs.GETCOUPONS_REQUEST_CODEC_ID), buildList {
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
  }), CouponsCodecs.getCouponsRequestCodecRegistry, GetCouponsResponseDecoder, options)

  /**
   * <p>Retrieves the coupon with the given ID.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param coupon Wire parameter `coupon`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getCouponsCouponWithResponse(
    request: JsonObject? = null,
    coupon: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCouponsCouponResponse> = executor.executeWithResponse<JsonObject?, GetCouponsCouponResponse>(SdkExecutionRequest(getCouponsCouponMetadata, baseUri, request, listOf(CouponsCodecs.GETCOUPONSCOUPON_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "coupon", values = listOf(coupon.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), CouponsCodecs.getCouponsCouponRequestCodecRegistry, GetCouponsCouponResponseDecoder, options)

  /**
   * <p>You can create coupons easily via the <a href="https://dashboard.stripe.com/coupons">coupon management</a> page
   * of the Stripe dashboard. Coupon creation is also accessible via the API if you need to create coupons on the
   * fly.</p>
   *
   * <p>A coupon has either a <code>percent_off</code> or an <code>amount_off</code> and <code>currency</code>. If you
   * set an <code>amount_off</code>, that amount will be subtracted from any invoice’s subtotal. For example, an invoice
   * with a subtotal of <currency>100</currency> will have a final total of <currency>0</currency> if a coupon with an
   * <code>amount_off</code> of <amount>200</amount> is applied to it and an invoice with a subtotal of
   * <currency>300</currency> will have a final total of <currency>100</currency> if a coupon with an
   * <code>amount_off</code> of <amount>200</amount> is applied to it.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postCouponsWithResponse(request: InlineV1CouponsPostRequestFormX8a95aa20? = null, options: CallOptions = CallOptions()): SdkResponseResult<PostCouponsResponse> = executor.executeWithResponse<InlineV1CouponsPostRequestFormX8a95aa20?, PostCouponsResponse>(SdkExecutionRequest(postCouponsMetadata, baseUri, request, listOf(CouponsCodecs.POSTCOUPONS_REQUEST_CODEC_ID), emptyList()), CouponsCodecs.postCouponsRequestCodecRegistry, PostCouponsResponseDecoder, options)

  /**
   * <p>Updates the metadata of a coupon. Other coupon details (currency, duration, amount_off) are, by design, not
   * editable.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param coupon Wire parameter `coupon`.
   * @param options Execution options.
   */
  public suspend fun postCouponsCouponWithResponse(
    request: InlineV1CouponsPostRequestFormXb16bd4b6? = null,
    coupon: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostCouponsCouponResponse> = executor.executeWithResponse<InlineV1CouponsPostRequestFormXb16bd4b6?, PostCouponsCouponResponse>(SdkExecutionRequest(postCouponsCouponMetadata, baseUri, request, listOf(CouponsCodecs.POSTCOUPONSCOUPON_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "coupon", values = listOf(coupon.toString())))
  }), CouponsCodecs.postCouponsCouponRequestCodecRegistry, PostCouponsCouponResponseDecoder, options)

  /**
   * Typed response alternatives for `DeleteCouponsCoupon`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface DeleteCouponsCouponResponse {
    public class SuccessJson(
      public val json: DeletedCoupon,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCouponsCouponResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCouponsCouponResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCouponsCouponResponse
  }

  private object DeleteCouponsCouponResponseDecoder : SdkResponseAlternativeDecoder<DeleteCouponsCouponResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteCouponsCouponResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteCouponsCouponResponse> = when {
      alternative.id == "DeleteCouponsCoupon.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteCouponsCouponResponse.SuccessJson(
          json = CouponsCodecs.deleteCouponsCouponResponseCodecAlternative0Registry.select(listOf("DeleteCouponsCoupon.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteCouponsCoupon.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteCouponsCouponResponse.DefaultJson(
          json = CouponsCodecs.deleteCouponsCouponResponseCodecAlternative1Registry.select(listOf("DeleteCouponsCoupon.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteCouponsCouponResponse = DeleteCouponsCouponResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCoupons`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetCouponsResponse {
    public class SuccessJson(
      public val json: InlineV1CouponsGetResponse200JsonXf21a52f2,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCouponsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCouponsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCouponsResponse
  }

  private object GetCouponsResponseDecoder : SdkResponseAlternativeDecoder<GetCouponsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCouponsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCouponsResponse> = when {
      alternative.id == "GetCoupons.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCouponsResponse.SuccessJson(
          json = CouponsCodecs.getCouponsResponseCodecAlternative0Registry.select(listOf("GetCoupons.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCoupons.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCouponsResponse.DefaultJson(
          json = CouponsCodecs.getCouponsResponseCodecAlternative1Registry.select(listOf("GetCoupons.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCouponsResponse = GetCouponsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCouponsCoupon`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetCouponsCouponResponse {
    public class SuccessJson(
      public val json: Coupon,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCouponsCouponResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCouponsCouponResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCouponsCouponResponse
  }

  private object GetCouponsCouponResponseDecoder : SdkResponseAlternativeDecoder<GetCouponsCouponResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCouponsCouponResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCouponsCouponResponse> = when {
      alternative.id == "GetCouponsCoupon.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCouponsCouponResponse.SuccessJson(
          json = CouponsCodecs.getCouponsCouponResponseCodecAlternative0Registry.select(listOf("GetCouponsCoupon.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCouponsCoupon.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCouponsCouponResponse.DefaultJson(
          json = CouponsCodecs.getCouponsCouponResponseCodecAlternative1Registry.select(listOf("GetCouponsCoupon.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCouponsCouponResponse = GetCouponsCouponResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCoupons`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostCouponsResponse {
    public class SuccessJson(
      public val json: Coupon,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCouponsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCouponsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCouponsResponse
  }

  private object PostCouponsResponseDecoder : SdkResponseAlternativeDecoder<PostCouponsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCouponsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCouponsResponse> = when {
      alternative.id == "PostCoupons.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCouponsResponse.SuccessJson(
          json = CouponsCodecs.postCouponsResponseCodecAlternative0Registry.select(listOf("PostCoupons.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCoupons.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCouponsResponse.DefaultJson(
          json = CouponsCodecs.postCouponsResponseCodecAlternative1Registry.select(listOf("PostCoupons.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCouponsResponse = PostCouponsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCouponsCoupon`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostCouponsCouponResponse {
    public class SuccessJson(
      public val json: Coupon,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCouponsCouponResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCouponsCouponResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCouponsCouponResponse
  }

  private object PostCouponsCouponResponseDecoder : SdkResponseAlternativeDecoder<PostCouponsCouponResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCouponsCouponResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCouponsCouponResponse> = when {
      alternative.id == "PostCouponsCoupon.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCouponsCouponResponse.SuccessJson(
          json = CouponsCodecs.postCouponsCouponResponseCodecAlternative0Registry.select(listOf("PostCouponsCoupon.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCouponsCoupon.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCouponsCouponResponse.DefaultJson(
          json = CouponsCodecs.postCouponsCouponResponseCodecAlternative1Registry.select(listOf("PostCouponsCoupon.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCouponsCouponResponse = PostCouponsCouponResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val deleteCouponsCouponMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteCouponsCoupon",
          method = "DELETE",
          path = "/v1/coupons/{coupon}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedCoupon",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteCouponsCoupon.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteCouponsCoupon.response.alternative1",
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
          safety = OperationSafety(safe = false, idempotent = true),
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

    public val getCouponsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCoupons",
          method = "GET",
          path = "/v1/coupons",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CouponsGetResponse200JsonXf21a52f2",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCoupons.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCoupons.response.alternative1",
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

    public val getCouponsCouponMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCouponsCoupon",
          method = "GET",
          path = "/v1/coupons/{coupon}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Coupon",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCouponsCoupon.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCouponsCoupon.response.alternative1",
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

    public val postCouponsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCoupons",
          method = "POST",
          path = "/v1/coupons",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Coupon",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCoupons.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCoupons.response.alternative1",
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

    public val postCouponsCouponMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCouponsCoupon",
          method = "POST",
          path = "/v1/coupons/{coupon}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Coupon",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCouponsCoupon.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCouponsCoupon.response.alternative1",
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
