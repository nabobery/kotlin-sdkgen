package com.nabobery.sdkgen.generated.stripe.shippingrates

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1ShippingRatesGetParameterX8d7ebb7f
import com.nabobery.sdkgen.generated.stripe.InlineV1ShippingRatesGetResponse200JsonX65a764d3
import com.nabobery.sdkgen.generated.stripe.InlineV1ShippingRatesPostRequestFormX9221dee2
import com.nabobery.sdkgen.generated.stripe.InlineV1ShippingRatesPostRequestFormXc4ae2656
import com.nabobery.sdkgen.generated.stripe.SdkJson
import com.nabobery.sdkgen.generated.stripe.ShippingRate
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

public object ShippingRatesCodecs {
  public const val GETSHIPPINGRATES_REQUEST_CODEC_ID: String = "GetShippingRates.request"

  private val getShippingRatesRequestCodec: MediaTypeCodec<JsonObject?> = GetShippingRatesFormCodec

  private val getShippingRatesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1ShippingRatesGetResponse200JsonX65a764d3> =
      KotlinxSerializationCodec("GetShippingRates.response.alternative0", InlineV1ShippingRatesGetResponse200JsonX65a764d3.Serializer, SdkJson)

  public val getShippingRatesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1ShippingRatesGetResponse200JsonX65a764d3> =
      MediaTypeCodecRegistry.of(getShippingRatesResponseCodecAlternative0Codec)

  private val getShippingRatesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetShippingRates.response.alternative1", Error.Serializer, SdkJson)

  public val getShippingRatesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getShippingRatesResponseCodecAlternative1Codec)

  public val getShippingRatesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getShippingRatesRequestCodec)

  public const val GETSHIPPINGRATESSHIPPINGRATETOKEN_REQUEST_CODEC_ID: String =
      "GetShippingRatesShippingRateToken.request"

  private val getShippingRatesShippingRateTokenRequestCodec: MediaTypeCodec<JsonObject?> =
      GetShippingRatesShippingRateTokenFormCodec

  private val getShippingRatesShippingRateTokenResponseCodecAlternative0Codec:
      MediaTypeCodec<ShippingRate> =
      KotlinxSerializationCodec("GetShippingRatesShippingRateToken.response.alternative0", ShippingRate.Serializer, SdkJson)

  public val getShippingRatesShippingRateTokenResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ShippingRate> =
      MediaTypeCodecRegistry.of(getShippingRatesShippingRateTokenResponseCodecAlternative0Codec)

  private val getShippingRatesShippingRateTokenResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("GetShippingRatesShippingRateToken.response.alternative1", Error.Serializer, SdkJson)

  public val getShippingRatesShippingRateTokenResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getShippingRatesShippingRateTokenResponseCodecAlternative1Codec)

  public val getShippingRatesShippingRateTokenRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getShippingRatesShippingRateTokenRequestCodec)

  public const val POSTSHIPPINGRATES_REQUEST_CODEC_ID: String = "PostShippingRates.request"

  private val postShippingRatesRequestCodec:
      MediaTypeCodec<InlineV1ShippingRatesPostRequestFormXc4ae2656> = PostShippingRatesFormCodec

  private val postShippingRatesResponseCodecAlternative0Codec: MediaTypeCodec<ShippingRate> =
      KotlinxSerializationCodec("PostShippingRates.response.alternative0", ShippingRate.Serializer, SdkJson)

  public val postShippingRatesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ShippingRate> =
      MediaTypeCodecRegistry.of(postShippingRatesResponseCodecAlternative0Codec)

  private val postShippingRatesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostShippingRates.response.alternative1", Error.Serializer, SdkJson)

  public val postShippingRatesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postShippingRatesResponseCodecAlternative1Codec)

  public val postShippingRatesRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ShippingRatesPostRequestFormXc4ae2656> =
      MediaTypeCodecRegistry.of(postShippingRatesRequestCodec)

  public const val POSTSHIPPINGRATESSHIPPINGRATETOKEN_REQUEST_CODEC_ID: String =
      "PostShippingRatesShippingRateToken.request"

  private val postShippingRatesShippingRateTokenRequestCodec:
      MediaTypeCodec<InlineV1ShippingRatesPostRequestFormX9221dee2?> =
      PostShippingRatesShippingRateTokenFormCodec

  private val postShippingRatesShippingRateTokenResponseCodecAlternative0Codec:
      MediaTypeCodec<ShippingRate> =
      KotlinxSerializationCodec("PostShippingRatesShippingRateToken.response.alternative0", ShippingRate.Serializer, SdkJson)

  public val postShippingRatesShippingRateTokenResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ShippingRate> =
      MediaTypeCodecRegistry.of(postShippingRatesShippingRateTokenResponseCodecAlternative0Codec)

  private val postShippingRatesShippingRateTokenResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostShippingRatesShippingRateToken.response.alternative1", Error.Serializer, SdkJson)

  public val postShippingRatesShippingRateTokenResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postShippingRatesShippingRateTokenResponseCodecAlternative1Codec)

  public val postShippingRatesShippingRateTokenRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ShippingRatesPostRequestFormX9221dee2?> =
      MediaTypeCodecRegistry.of(postShippingRatesShippingRateTokenRequestCodec)

  public object GetShippingRatesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetShippingRates.request"

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

  public object GetShippingRatesShippingRateTokenFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetShippingRatesShippingRateToken.request"

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

  public object PostShippingRatesFormCodec : MediaTypeCodec<InlineV1ShippingRatesPostRequestFormXc4ae2656> {
    override val id: String = "PostShippingRates.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ShippingRatesPostRequestFormXc4ae2656, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.deliveryEstimate?.let { formValue0 ->
        formValue0.maximum?.let { formValue2 ->
          form.add("delivery_estimate" + "[maximum]" + "[unit]", formValue2.unit.value)
          form.add("delivery_estimate" + "[maximum]" + "[value]", formValue2.value.toString())
        }
        formValue0.minimum?.let { formValue2 ->
          form.add("delivery_estimate" + "[minimum]" + "[unit]", formValue2.unit.value)
          form.add("delivery_estimate" + "[minimum]" + "[value]", formValue2.value.toString())
        }
      }
      form.add("display_name", request.displayName)
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.fixedAmount?.let { formValue0 ->
        form.add("fixed_amount" + "[amount]", formValue0.amount.toString())
        form.add("fixed_amount" + "[currency]", formValue0.currency)
        formValue0.currencyOptions?.let { formValue2 ->
          formValue2.forEach { (formKey3, formMapValue3) ->
            form.add("fixed_amount" + "[currency_options]" + "[" + formKey3 + "]" + "[amount]", formMapValue3.amount.toString())
            formMapValue3.taxBehavior?.let { formValue5 ->
              form.add("fixed_amount" + "[currency_options]" + "[" + formKey3 + "]" + "[tax_behavior]", formValue5.value)
            }
          }
        }
      }
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      request.taxBehavior?.let { formValue0 ->
        form.add("tax_behavior", formValue0.value)
      }
      request.taxCode?.let { formValue0 ->
        form.add("tax_code", formValue0)
      }
      request.type?.let { formValue0 ->
        form.add("type", formValue0.value)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ShippingRatesPostRequestFormXc4ae2656 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostShippingRatesShippingRateTokenFormCodec : MediaTypeCodec<InlineV1ShippingRatesPostRequestFormX9221dee2?> {
    override val id: String = "PostShippingRatesShippingRateToken.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ShippingRatesPostRequestFormX9221dee2?, mediaType: String): SdkRequestBody {
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
      request.fixedAmount?.let { formValue0 ->
        formValue0.currencyOptions?.let { formValue2 ->
          formValue2.forEach { (formKey3, formMapValue3) ->
            formMapValue3.amount?.let { formValue5 ->
              form.add("fixed_amount" + "[currency_options]" + "[" + formKey3 + "]" + "[amount]", formValue5.toString())
            }
            formMapValue3.taxBehavior?.let { formValue5 ->
              form.add("fixed_amount" + "[currency_options]" + "[" + formKey3 + "]" + "[tax_behavior]", formValue5.value)
            }
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
          formValue0.inlineV1ShippingRatesPostRequestFormMetadataAnyOf2Xc6a14527 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1ShippingRatesPostRequestFormMetadataAnyOf2Xc6a14527).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.taxBehavior?.let { formValue0 ->
        form.add("tax_behavior", formValue0.value)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ShippingRatesPostRequestFormX9221dee2? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'shipping_rates' group of Stripe API.
 */
public class ShippingRatesClient(
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
      SdkExecutor(transport, authentication = this@ShippingRatesClient.authentication)

  /**
   * <p>Returns a list of your shipping rates.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param active Only return shipping rates that are active or inactive.
   * @param created A filter on the list, based on the object `created` field. The value can be a string with an integer
   * Unix timestamp, or it can be a dictionary with a number of different query options.
   * @param currency Only return shipping rates for the given currency.
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
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
  public suspend fun getShippingRatesWithResponse(
    request: JsonObject? = null,
    active: Boolean? = null,
    created: InlineV1ShippingRatesGetParameterX8d7ebb7f? = null,
    currency: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetShippingRatesResponse> = executor.executeWithResponse<JsonObject?, GetShippingRatesResponse>(SdkExecutionRequest(getShippingRatesMetadata, baseUri, request, listOf(ShippingRatesCodecs.GETSHIPPINGRATES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "active", values = active?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "currency", values = currency?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), ShippingRatesCodecs.getShippingRatesRequestCodecRegistry, GetShippingRatesResponseDecoder, options)

  /**
   * <p>Returns the shipping rate object with the given ID.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param shippingRateToken Wire parameter `shipping_rate_token`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getShippingRatesShippingRateTokenWithResponse(
    request: JsonObject? = null,
    shippingRateToken: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetShippingRatesShippingRateTokenResponse> = executor.executeWithResponse<JsonObject?, GetShippingRatesShippingRateTokenResponse>(SdkExecutionRequest(getShippingRatesShippingRateTokenMetadata, baseUri, request, listOf(ShippingRatesCodecs.GETSHIPPINGRATESSHIPPINGRATETOKEN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "shipping_rate_token", values = listOf(shippingRateToken.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), ShippingRatesCodecs.getShippingRatesShippingRateTokenRequestCodecRegistry, GetShippingRatesShippingRateTokenResponseDecoder, options)

  /**
   * <p>Creates a new shipping rate object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postShippingRatesWithResponse(request: InlineV1ShippingRatesPostRequestFormXc4ae2656, options: CallOptions = CallOptions()): SdkResponseResult<PostShippingRatesResponse> = executor.executeWithResponse<InlineV1ShippingRatesPostRequestFormXc4ae2656, PostShippingRatesResponse>(SdkExecutionRequest(postShippingRatesMetadata, baseUri, request, listOf(ShippingRatesCodecs.POSTSHIPPINGRATES_REQUEST_CODEC_ID), emptyList()), ShippingRatesCodecs.postShippingRatesRequestCodecRegistry, PostShippingRatesResponseDecoder, options)

  /**
   * <p>Updates an existing shipping rate object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param shippingRateToken Wire parameter `shipping_rate_token`.
   * @param options Execution options.
   */
  public suspend fun postShippingRatesShippingRateTokenWithResponse(
    request: InlineV1ShippingRatesPostRequestFormX9221dee2? = null,
    shippingRateToken: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostShippingRatesShippingRateTokenResponse> = executor.executeWithResponse<InlineV1ShippingRatesPostRequestFormX9221dee2?, PostShippingRatesShippingRateTokenResponse>(SdkExecutionRequest(postShippingRatesShippingRateTokenMetadata, baseUri, request, listOf(ShippingRatesCodecs.POSTSHIPPINGRATESSHIPPINGRATETOKEN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "shipping_rate_token", values = listOf(shippingRateToken.toString())))
  }), ShippingRatesCodecs.postShippingRatesShippingRateTokenRequestCodecRegistry, PostShippingRatesShippingRateTokenResponseDecoder, options)

  /**
   * Typed response alternatives for `GetShippingRates`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetShippingRatesResponse {
    public class SuccessJson(
      public val json: InlineV1ShippingRatesGetResponse200JsonX65a764d3,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetShippingRatesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetShippingRatesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetShippingRatesResponse
  }

  private object GetShippingRatesResponseDecoder : SdkResponseAlternativeDecoder<GetShippingRatesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetShippingRatesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetShippingRatesResponse> = when {
      alternative.id == "GetShippingRates.response.alternative0" -> SdkResponseDecodeResult(
        value = GetShippingRatesResponse.SuccessJson(
          json = ShippingRatesCodecs.getShippingRatesResponseCodecAlternative0Registry.select(listOf("GetShippingRates.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetShippingRates.response.alternative1" -> SdkResponseDecodeResult(
        value = GetShippingRatesResponse.DefaultJson(
          json = ShippingRatesCodecs.getShippingRatesResponseCodecAlternative1Registry.select(listOf("GetShippingRates.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetShippingRatesResponse = GetShippingRatesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetShippingRatesShippingRateToken`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetShippingRatesShippingRateTokenResponse {
    public class SuccessJson(
      public val json: ShippingRate,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetShippingRatesShippingRateTokenResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetShippingRatesShippingRateTokenResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetShippingRatesShippingRateTokenResponse
  }

  private object GetShippingRatesShippingRateTokenResponseDecoder : SdkResponseAlternativeDecoder<GetShippingRatesShippingRateTokenResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetShippingRatesShippingRateTokenResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetShippingRatesShippingRateTokenResponse> = when {
      alternative.id == "GetShippingRatesShippingRateToken.response.alternative0" -> SdkResponseDecodeResult(
        value = GetShippingRatesShippingRateTokenResponse.SuccessJson(
          json = ShippingRatesCodecs.getShippingRatesShippingRateTokenResponseCodecAlternative0Registry.select(listOf("GetShippingRatesShippingRateToken.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetShippingRatesShippingRateToken.response.alternative1" -> SdkResponseDecodeResult(
        value = GetShippingRatesShippingRateTokenResponse.DefaultJson(
          json = ShippingRatesCodecs.getShippingRatesShippingRateTokenResponseCodecAlternative1Registry.select(listOf("GetShippingRatesShippingRateToken.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetShippingRatesShippingRateTokenResponse = GetShippingRatesShippingRateTokenResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostShippingRates`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostShippingRatesResponse {
    public class SuccessJson(
      public val json: ShippingRate,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostShippingRatesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostShippingRatesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostShippingRatesResponse
  }

  private object PostShippingRatesResponseDecoder : SdkResponseAlternativeDecoder<PostShippingRatesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostShippingRatesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostShippingRatesResponse> = when {
      alternative.id == "PostShippingRates.response.alternative0" -> SdkResponseDecodeResult(
        value = PostShippingRatesResponse.SuccessJson(
          json = ShippingRatesCodecs.postShippingRatesResponseCodecAlternative0Registry.select(listOf("PostShippingRates.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostShippingRates.response.alternative1" -> SdkResponseDecodeResult(
        value = PostShippingRatesResponse.DefaultJson(
          json = ShippingRatesCodecs.postShippingRatesResponseCodecAlternative1Registry.select(listOf("PostShippingRates.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostShippingRatesResponse = PostShippingRatesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostShippingRatesShippingRateToken`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostShippingRatesShippingRateTokenResponse {
    public class SuccessJson(
      public val json: ShippingRate,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostShippingRatesShippingRateTokenResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostShippingRatesShippingRateTokenResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostShippingRatesShippingRateTokenResponse
  }

  private object PostShippingRatesShippingRateTokenResponseDecoder : SdkResponseAlternativeDecoder<PostShippingRatesShippingRateTokenResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostShippingRatesShippingRateTokenResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostShippingRatesShippingRateTokenResponse> = when {
      alternative.id == "PostShippingRatesShippingRateToken.response.alternative0" -> SdkResponseDecodeResult(
        value = PostShippingRatesShippingRateTokenResponse.SuccessJson(
          json = ShippingRatesCodecs.postShippingRatesShippingRateTokenResponseCodecAlternative0Registry.select(listOf("PostShippingRatesShippingRateToken.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostShippingRatesShippingRateToken.response.alternative1" -> SdkResponseDecodeResult(
        value = PostShippingRatesShippingRateTokenResponse.DefaultJson(
          json = ShippingRatesCodecs.postShippingRatesShippingRateTokenResponseCodecAlternative1Registry.select(listOf("PostShippingRatesShippingRateToken.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostShippingRatesShippingRateTokenResponse = PostShippingRatesShippingRateTokenResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val getShippingRatesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetShippingRates",
          method = "GET",
          path = "/v1/shipping_rates",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1ShippingRatesGetResponse200JsonX65a764d3",
              mode = SdkResponseMode.BUFFERED,
              id = "GetShippingRates.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetShippingRates.response.alternative1",
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

    public val getShippingRatesShippingRateTokenMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetShippingRatesShippingRateToken",
          method = "GET",
          path = "/v1/shipping_rates/{shipping_rate_token}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ShippingRate",
              mode = SdkResponseMode.BUFFERED,
              id = "GetShippingRatesShippingRateToken.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetShippingRatesShippingRateToken.response.alternative1",
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

    public val postShippingRatesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostShippingRates",
          method = "POST",
          path = "/v1/shipping_rates",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ShippingRate",
              mode = SdkResponseMode.BUFFERED,
              id = "PostShippingRates.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostShippingRates.response.alternative1",
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

    public val postShippingRatesShippingRateTokenMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostShippingRatesShippingRateToken",
          method = "POST",
          path = "/v1/shipping_rates/{shipping_rate_token}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ShippingRate",
              mode = SdkResponseMode.BUFFERED,
              id = "PostShippingRatesShippingRateToken.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostShippingRatesShippingRateToken.response.alternative1",
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
