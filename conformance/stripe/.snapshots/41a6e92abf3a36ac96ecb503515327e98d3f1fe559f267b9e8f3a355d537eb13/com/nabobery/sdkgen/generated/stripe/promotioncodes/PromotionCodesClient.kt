package com.nabobery.sdkgen.generated.stripe.promotioncodes

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1PromotionCodesGetParameterXdce9e3f9
import com.nabobery.sdkgen.generated.stripe.InlineV1PromotionCodesGetResponse200JsonX3cb6d9c8
import com.nabobery.sdkgen.generated.stripe.InlineV1PromotionCodesPostRequestFormXb2d1736a
import com.nabobery.sdkgen.generated.stripe.InlineV1PromotionCodesPostRequestFormXf8a049fa
import com.nabobery.sdkgen.generated.stripe.PromotionCode
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

internal object PromotionCodesCodecs {
  internal const val GETPROMOTIONCODES_REQUEST_CODEC_ID: String = "GetPromotionCodes.request"

  private val getPromotionCodesRequestCodec: MediaTypeCodec<JsonObject?> =
      GetPromotionCodesFormCodec

  private val getPromotionCodesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1PromotionCodesGetResponse200JsonX3cb6d9c8> =
      KotlinxSerializationCodec("GetPromotionCodes.response.alternative0", InlineV1PromotionCodesGetResponse200JsonX3cb6d9c8.Serializer, SdkJson)

  internal val getPromotionCodesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1PromotionCodesGetResponse200JsonX3cb6d9c8> =
      MediaTypeCodecRegistry.of(getPromotionCodesResponseCodecAlternative0Codec)

  private val getPromotionCodesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPromotionCodes.response.alternative1", Error.Serializer, SdkJson)

  internal val getPromotionCodesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPromotionCodesResponseCodecAlternative1Codec)

  internal val getPromotionCodesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPromotionCodesRequestCodec)

  internal const val GETPROMOTIONCODESPROMOTIONCODE_REQUEST_CODEC_ID: String =
      "GetPromotionCodesPromotionCode.request"

  private val getPromotionCodesPromotionCodeRequestCodec: MediaTypeCodec<JsonObject?> =
      GetPromotionCodesPromotionCodeFormCodec

  private val getPromotionCodesPromotionCodeResponseCodecAlternative0Codec:
      MediaTypeCodec<PromotionCode> =
      KotlinxSerializationCodec("GetPromotionCodesPromotionCode.response.alternative0", PromotionCode.Serializer, SdkJson)

  internal val getPromotionCodesPromotionCodeResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PromotionCode> =
      MediaTypeCodecRegistry.of(getPromotionCodesPromotionCodeResponseCodecAlternative0Codec)

  private val getPromotionCodesPromotionCodeResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPromotionCodesPromotionCode.response.alternative1", Error.Serializer, SdkJson)

  internal val getPromotionCodesPromotionCodeResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPromotionCodesPromotionCodeResponseCodecAlternative1Codec)

  internal val getPromotionCodesPromotionCodeRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPromotionCodesPromotionCodeRequestCodec)

  internal const val POSTPROMOTIONCODES_REQUEST_CODEC_ID: String = "PostPromotionCodes.request"

  private val postPromotionCodesRequestCodec:
      MediaTypeCodec<InlineV1PromotionCodesPostRequestFormXb2d1736a> = PostPromotionCodesFormCodec

  private val postPromotionCodesResponseCodecAlternative0Codec: MediaTypeCodec<PromotionCode> =
      KotlinxSerializationCodec("PostPromotionCodes.response.alternative0", PromotionCode.Serializer, SdkJson)

  internal val postPromotionCodesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PromotionCode> =
      MediaTypeCodecRegistry.of(postPromotionCodesResponseCodecAlternative0Codec)

  private val postPromotionCodesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPromotionCodes.response.alternative1", Error.Serializer, SdkJson)

  internal val postPromotionCodesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPromotionCodesResponseCodecAlternative1Codec)

  internal val postPromotionCodesRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PromotionCodesPostRequestFormXb2d1736a> =
      MediaTypeCodecRegistry.of(postPromotionCodesRequestCodec)

  internal const val POSTPROMOTIONCODESPROMOTIONCODE_REQUEST_CODEC_ID: String =
      "PostPromotionCodesPromotionCode.request"

  private val postPromotionCodesPromotionCodeRequestCodec:
      MediaTypeCodec<InlineV1PromotionCodesPostRequestFormXf8a049fa?> =
      PostPromotionCodesPromotionCodeFormCodec

  private val postPromotionCodesPromotionCodeResponseCodecAlternative0Codec:
      MediaTypeCodec<PromotionCode> =
      KotlinxSerializationCodec("PostPromotionCodesPromotionCode.response.alternative0", PromotionCode.Serializer, SdkJson)

  internal val postPromotionCodesPromotionCodeResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PromotionCode> =
      MediaTypeCodecRegistry.of(postPromotionCodesPromotionCodeResponseCodecAlternative0Codec)

  private val postPromotionCodesPromotionCodeResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPromotionCodesPromotionCode.response.alternative1", Error.Serializer, SdkJson)

  internal val postPromotionCodesPromotionCodeResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPromotionCodesPromotionCodeResponseCodecAlternative1Codec)

  internal val postPromotionCodesPromotionCodeRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PromotionCodesPostRequestFormXf8a049fa?> =
      MediaTypeCodecRegistry.of(postPromotionCodesPromotionCodeRequestCodec)

  internal object GetPromotionCodesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPromotionCodes.request"

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

  internal object GetPromotionCodesPromotionCodeFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPromotionCodesPromotionCode.request"

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

  internal object PostPromotionCodesFormCodec : MediaTypeCodec<InlineV1PromotionCodesPostRequestFormXb2d1736a> {
    override val id: String = "PostPromotionCodes.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PromotionCodesPostRequestFormXb2d1736a, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.active?.let { formValue0 ->
        form.add("active", formValue0.toString())
      }
      request.code?.let { formValue0 ->
        form.add("code", formValue0)
      }
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
      request.expiresAt?.let { formValue0 ->
        form.add("expires_at", formValue0.toString())
      }
      request.maxRedemptions?.let { formValue0 ->
        form.add("max_redemptions", formValue0.toString())
      }
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      request.promotion.coupon?.let { formValue1 ->
        form.add("promotion" + "[coupon]", formValue1)
      }
      form.add("promotion" + "[type]", request.promotion.type.value)
      request.restrictions?.let { formValue0 ->
        formValue0.currencyOptions?.let { formValue2 ->
          formValue2.forEach { (formKey3, formMapValue3) ->
            formMapValue3.minimumAmount?.let { formValue5 ->
              form.add("restrictions" + "[currency_options]" + "[" + formKey3 + "]" + "[minimum_amount]", formValue5.toString())
            }
          }
        }
        formValue0.firstTimeTransaction?.let { formValue2 ->
          form.add("restrictions" + "[first_time_transaction]", formValue2.toString())
        }
        formValue0.minimumAmount?.let { formValue2 ->
          form.add("restrictions" + "[minimum_amount]", formValue2.toString())
        }
        formValue0.minimumAmountCurrency?.let { formValue2 ->
          form.add("restrictions" + "[minimum_amount_currency]", formValue2)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PromotionCodesPostRequestFormXb2d1736a {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostPromotionCodesPromotionCodeFormCodec : MediaTypeCodec<InlineV1PromotionCodesPostRequestFormXf8a049fa?> {
    override val id: String = "PostPromotionCodesPromotionCode.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PromotionCodesPostRequestFormXf8a049fa?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.active?.let { formValue0 ->
        form.add("active", formValue0.toString())
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
          formValue0.inlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1PromotionCodesPostRequestFormMetadataAnyOf2X8ab7a844).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.restrictions?.let { formValue0 ->
        formValue0.currencyOptions?.let { formValue2 ->
          formValue2.forEach { (formKey3, formMapValue3) ->
            formMapValue3.minimumAmount?.let { formValue5 ->
              form.add("restrictions" + "[currency_options]" + "[" + formKey3 + "]" + "[minimum_amount]", formValue5.toString())
            }
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PromotionCodesPostRequestFormXf8a049fa? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'promotion_codes' group of Stripe API.
 */
public class PromotionCodesClient(
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
      SdkExecutor(transport, authentication = this@PromotionCodesClient.authentication)

  /**
   * <p>Returns a list of your promotion codes.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param active Filter promotion codes by whether they are active.
   * @param code Only return promotion codes that have this case-insensitive code.
   * @param coupon Only return promotion codes for this coupon.
   * @param created A filter on the list, based on the object `created` field. The value can be a string with an integer
   * Unix timestamp, or it can be a dictionary with a number of different query options.
   * @param customer Only return promotion codes that are restricted to this customer.
   * @param customerAccount Only return promotion codes that are restricted to this account representing the customer.
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
  public suspend fun getPromotionCodesWithResponse(
    request: JsonObject? = null,
    active: Boolean? = null,
    code: String? = null,
    coupon: String? = null,
    created: InlineV1PromotionCodesGetParameterXdce9e3f9? = null,
    customer: String? = null,
    customerAccount: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPromotionCodesResponse> = executor.executeWithResponse<JsonObject?, GetPromotionCodesResponse>(SdkExecutionRequest(getPromotionCodesMetadata, baseUri, request, listOf(PromotionCodesCodecs.GETPROMOTIONCODES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "active", values = active?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "code", values = code?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "coupon", values = coupon?.let { listOf(it.toString()) }.orEmpty()))
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
  }), PromotionCodesCodecs.getPromotionCodesRequestCodecRegistry, GetPromotionCodesResponseDecoder, options)

  /**
   * <p>Retrieves the promotion code with the given ID. In order to retrieve a promotion code by the customer-facing
   * <code>code</code> use <a href="/docs/api/promotion_codes/list">list</a> with the desired <code>code</code>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param promotionCode Wire parameter `promotion_code`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getPromotionCodesPromotionCodeWithResponse(
    request: JsonObject? = null,
    promotionCode: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPromotionCodesPromotionCodeResponse> = executor.executeWithResponse<JsonObject?, GetPromotionCodesPromotionCodeResponse>(SdkExecutionRequest(getPromotionCodesPromotionCodeMetadata, baseUri, request, listOf(PromotionCodesCodecs.GETPROMOTIONCODESPROMOTIONCODE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "promotion_code", values = listOf(promotionCode.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), PromotionCodesCodecs.getPromotionCodesPromotionCodeRequestCodecRegistry, GetPromotionCodesPromotionCodeResponseDecoder, options)

  /**
   * <p>A promotion code points to an underlying promotion. You can optionally restrict the code to a specific customer,
   * redemption limit, and expiration date.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postPromotionCodesWithResponse(request: InlineV1PromotionCodesPostRequestFormXb2d1736a, options: CallOptions = CallOptions()): SdkResponseResult<PostPromotionCodesResponse> = executor.executeWithResponse<InlineV1PromotionCodesPostRequestFormXb2d1736a, PostPromotionCodesResponse>(SdkExecutionRequest(postPromotionCodesMetadata, baseUri, request, listOf(PromotionCodesCodecs.POSTPROMOTIONCODES_REQUEST_CODEC_ID), emptyList()), PromotionCodesCodecs.postPromotionCodesRequestCodecRegistry, PostPromotionCodesResponseDecoder, options)

  /**
   * <p>Updates the specified promotion code by setting the values of the parameters passed. Most fields are, by design,
   * not editable.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param promotionCode Wire parameter `promotion_code`.
   * @param options Execution options.
   */
  public suspend fun postPromotionCodesPromotionCodeWithResponse(
    request: InlineV1PromotionCodesPostRequestFormXf8a049fa? = null,
    promotionCode: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostPromotionCodesPromotionCodeResponse> = executor.executeWithResponse<InlineV1PromotionCodesPostRequestFormXf8a049fa?, PostPromotionCodesPromotionCodeResponse>(SdkExecutionRequest(postPromotionCodesPromotionCodeMetadata, baseUri, request, listOf(PromotionCodesCodecs.POSTPROMOTIONCODESPROMOTIONCODE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "promotion_code", values = listOf(promotionCode.toString())))
  }), PromotionCodesCodecs.postPromotionCodesPromotionCodeRequestCodecRegistry, PostPromotionCodesPromotionCodeResponseDecoder, options)

  /**
   * Typed response alternatives for `GetPromotionCodes`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetPromotionCodesResponse {
    public class SuccessJson(
      public val json: InlineV1PromotionCodesGetResponse200JsonX3cb6d9c8,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPromotionCodesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPromotionCodesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPromotionCodesResponse
  }

  private object GetPromotionCodesResponseDecoder : SdkResponseAlternativeDecoder<GetPromotionCodesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPromotionCodesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPromotionCodesResponse> = when {
      alternative.id == "GetPromotionCodes.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPromotionCodesResponse.SuccessJson(
          json = PromotionCodesCodecs.getPromotionCodesResponseCodecAlternative0Registry.select(listOf("GetPromotionCodes.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPromotionCodes.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPromotionCodesResponse.DefaultJson(
          json = PromotionCodesCodecs.getPromotionCodesResponseCodecAlternative1Registry.select(listOf("GetPromotionCodes.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPromotionCodesResponse = GetPromotionCodesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetPromotionCodesPromotionCode`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetPromotionCodesPromotionCodeResponse {
    public class SuccessJson(
      public val json: PromotionCode,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPromotionCodesPromotionCodeResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPromotionCodesPromotionCodeResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPromotionCodesPromotionCodeResponse
  }

  private object GetPromotionCodesPromotionCodeResponseDecoder : SdkResponseAlternativeDecoder<GetPromotionCodesPromotionCodeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPromotionCodesPromotionCodeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPromotionCodesPromotionCodeResponse> = when {
      alternative.id == "GetPromotionCodesPromotionCode.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPromotionCodesPromotionCodeResponse.SuccessJson(
          json = PromotionCodesCodecs.getPromotionCodesPromotionCodeResponseCodecAlternative0Registry.select(listOf("GetPromotionCodesPromotionCode.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPromotionCodesPromotionCode.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPromotionCodesPromotionCodeResponse.DefaultJson(
          json = PromotionCodesCodecs.getPromotionCodesPromotionCodeResponseCodecAlternative1Registry.select(listOf("GetPromotionCodesPromotionCode.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPromotionCodesPromotionCodeResponse = GetPromotionCodesPromotionCodeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPromotionCodes`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostPromotionCodesResponse {
    public class SuccessJson(
      public val json: PromotionCode,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPromotionCodesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPromotionCodesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPromotionCodesResponse
  }

  private object PostPromotionCodesResponseDecoder : SdkResponseAlternativeDecoder<PostPromotionCodesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPromotionCodesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPromotionCodesResponse> = when {
      alternative.id == "PostPromotionCodes.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPromotionCodesResponse.SuccessJson(
          json = PromotionCodesCodecs.postPromotionCodesResponseCodecAlternative0Registry.select(listOf("PostPromotionCodes.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPromotionCodes.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPromotionCodesResponse.DefaultJson(
          json = PromotionCodesCodecs.postPromotionCodesResponseCodecAlternative1Registry.select(listOf("PostPromotionCodes.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPromotionCodesResponse = PostPromotionCodesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPromotionCodesPromotionCode`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostPromotionCodesPromotionCodeResponse {
    public class SuccessJson(
      public val json: PromotionCode,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPromotionCodesPromotionCodeResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPromotionCodesPromotionCodeResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPromotionCodesPromotionCodeResponse
  }

  private object PostPromotionCodesPromotionCodeResponseDecoder : SdkResponseAlternativeDecoder<PostPromotionCodesPromotionCodeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPromotionCodesPromotionCodeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPromotionCodesPromotionCodeResponse> = when {
      alternative.id == "PostPromotionCodesPromotionCode.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPromotionCodesPromotionCodeResponse.SuccessJson(
          json = PromotionCodesCodecs.postPromotionCodesPromotionCodeResponseCodecAlternative0Registry.select(listOf("PostPromotionCodesPromotionCode.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPromotionCodesPromotionCode.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPromotionCodesPromotionCodeResponse.DefaultJson(
          json = PromotionCodesCodecs.postPromotionCodesPromotionCodeResponseCodecAlternative1Registry.select(listOf("PostPromotionCodesPromotionCode.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPromotionCodesPromotionCodeResponse = PostPromotionCodesPromotionCodeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getPromotionCodesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPromotionCodes",
          method = "GET",
          path = "/v1/promotion_codes",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1PromotionCodesGetResponse200JsonX3cb6d9c8",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPromotionCodes.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPromotionCodes.response.alternative1",
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

    internal val getPromotionCodesPromotionCodeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPromotionCodesPromotionCode",
          method = "GET",
          path = "/v1/promotion_codes/{promotion_code}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PromotionCode",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPromotionCodesPromotionCode.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPromotionCodesPromotionCode.response.alternative1",
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

    internal val postPromotionCodesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPromotionCodes",
          method = "POST",
          path = "/v1/promotion_codes",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PromotionCode",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPromotionCodes.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPromotionCodes.response.alternative1",
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

    internal val postPromotionCodesPromotionCodeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPromotionCodesPromotionCode",
          method = "POST",
          path = "/v1/promotion_codes/{promotion_code}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PromotionCode",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPromotionCodesPromotionCode.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPromotionCodesPromotionCode.response.alternative1",
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
