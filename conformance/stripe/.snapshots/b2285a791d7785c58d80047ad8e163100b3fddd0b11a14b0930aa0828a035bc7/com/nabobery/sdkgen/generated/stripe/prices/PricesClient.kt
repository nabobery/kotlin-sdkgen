package com.nabobery.sdkgen.generated.stripe.prices

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1PricesGetParameterX3bd64ecd
import com.nabobery.sdkgen.generated.stripe.InlineV1PricesGetParameterX903af275
import com.nabobery.sdkgen.generated.stripe.InlineV1PricesGetParameterXee4abeea
import com.nabobery.sdkgen.generated.stripe.InlineV1PricesGetResponse200JsonX04f7a5eb
import com.nabobery.sdkgen.generated.stripe.InlineV1PricesPostRequestFormX26912080
import com.nabobery.sdkgen.generated.stripe.InlineV1PricesPostRequestFormXe33007fa
import com.nabobery.sdkgen.generated.stripe.InlineV1PricesSearchGetResponse200JsonX5105616d
import com.nabobery.sdkgen.generated.stripe.Price
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

public object PricesCodecs {
  public const val GETPRICES_REQUEST_CODEC_ID: String = "GetPrices.request"

  private val getPricesRequestCodec: MediaTypeCodec<JsonObject?> = GetPricesFormCodec

  private val getPricesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1PricesGetResponse200JsonX04f7a5eb> =
      KotlinxSerializationCodec("GetPrices.response.alternative0", InlineV1PricesGetResponse200JsonX04f7a5eb.Serializer, SdkJson)

  public val getPricesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1PricesGetResponse200JsonX04f7a5eb> =
      MediaTypeCodecRegistry.of(getPricesResponseCodecAlternative0Codec)

  private val getPricesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPrices.response.alternative1", Error.Serializer, SdkJson)

  public val getPricesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPricesResponseCodecAlternative1Codec)

  public val getPricesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPricesRequestCodec)

  public const val GETPRICESPRICE_REQUEST_CODEC_ID: String = "GetPricesPrice.request"

  private val getPricesPriceRequestCodec: MediaTypeCodec<JsonObject?> = GetPricesPriceFormCodec

  private val getPricesPriceResponseCodecAlternative0Codec: MediaTypeCodec<Price> =
      KotlinxSerializationCodec("GetPricesPrice.response.alternative0", Price.Serializer, SdkJson)

  public val getPricesPriceResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Price> =
      MediaTypeCodecRegistry.of(getPricesPriceResponseCodecAlternative0Codec)

  private val getPricesPriceResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPricesPrice.response.alternative1", Error.Serializer, SdkJson)

  public val getPricesPriceResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPricesPriceResponseCodecAlternative1Codec)

  public val getPricesPriceRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPricesPriceRequestCodec)

  public const val GETPRICESSEARCH_REQUEST_CODEC_ID: String = "GetPricesSearch.request"

  private val getPricesSearchRequestCodec: MediaTypeCodec<JsonObject?> = GetPricesSearchFormCodec

  private val getPricesSearchResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1PricesSearchGetResponse200JsonX5105616d> =
      KotlinxSerializationCodec("GetPricesSearch.response.alternative0", InlineV1PricesSearchGetResponse200JsonX5105616d.Serializer, SdkJson)

  public val getPricesSearchResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1PricesSearchGetResponse200JsonX5105616d> =
      MediaTypeCodecRegistry.of(getPricesSearchResponseCodecAlternative0Codec)

  private val getPricesSearchResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPricesSearch.response.alternative1", Error.Serializer, SdkJson)

  public val getPricesSearchResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPricesSearchResponseCodecAlternative1Codec)

  public val getPricesSearchRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPricesSearchRequestCodec)

  public const val POSTPRICES_REQUEST_CODEC_ID: String = "PostPrices.request"

  private val postPricesRequestCodec: MediaTypeCodec<InlineV1PricesPostRequestFormX26912080> =
      PostPricesFormCodec

  private val postPricesResponseCodecAlternative0Codec: MediaTypeCodec<Price> =
      KotlinxSerializationCodec("PostPrices.response.alternative0", Price.Serializer, SdkJson)

  public val postPricesResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Price> =
      MediaTypeCodecRegistry.of(postPricesResponseCodecAlternative0Codec)

  private val postPricesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPrices.response.alternative1", Error.Serializer, SdkJson)

  public val postPricesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPricesResponseCodecAlternative1Codec)

  public val postPricesRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PricesPostRequestFormX26912080> =
      MediaTypeCodecRegistry.of(postPricesRequestCodec)

  public const val POSTPRICESPRICE_REQUEST_CODEC_ID: String = "PostPricesPrice.request"

  private val postPricesPriceRequestCodec: MediaTypeCodec<InlineV1PricesPostRequestFormXe33007fa?> =
      PostPricesPriceFormCodec

  private val postPricesPriceResponseCodecAlternative0Codec: MediaTypeCodec<Price> =
      KotlinxSerializationCodec("PostPricesPrice.response.alternative0", Price.Serializer, SdkJson)

  public val postPricesPriceResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Price> =
      MediaTypeCodecRegistry.of(postPricesPriceResponseCodecAlternative0Codec)

  private val postPricesPriceResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPricesPrice.response.alternative1", Error.Serializer, SdkJson)

  public val postPricesPriceResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPricesPriceResponseCodecAlternative1Codec)

  public val postPricesPriceRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PricesPostRequestFormXe33007fa?> =
      MediaTypeCodecRegistry.of(postPricesPriceRequestCodec)

  public object GetPricesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPrices.request"

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

  public object GetPricesPriceFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPricesPrice.request"

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

  public object GetPricesSearchFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPricesSearch.request"

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

  public object PostPricesFormCodec : MediaTypeCodec<InlineV1PricesPostRequestFormX26912080> {
    override val id: String = "PostPrices.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PricesPostRequestFormX26912080, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.active?.let { formValue0 ->
        form.add("active", formValue0.toString())
      }
      request.billingScheme?.let { formValue0 ->
        form.add("billing_scheme", formValue0.value)
      }
      form.add("currency", request.currency)
      request.currencyOptions?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          formMapValue1.customUnitAmount?.let { formValue3 ->
            form.add("currency_options" + "[" + formKey1 + "]" + "[custom_unit_amount]" + "[enabled]", formValue3.enabled.toString())
            formValue3.maximum?.let { formValue5 ->
              form.add("currency_options" + "[" + formKey1 + "]" + "[custom_unit_amount]" + "[maximum]", formValue5.toString())
            }
            formValue3.minimum?.let { formValue5 ->
              form.add("currency_options" + "[" + formKey1 + "]" + "[custom_unit_amount]" + "[minimum]", formValue5.toString())
            }
            formValue3.preset?.let { formValue5 ->
              form.add("currency_options" + "[" + formKey1 + "]" + "[custom_unit_amount]" + "[preset]", formValue5.toString())
            }
          }
          formMapValue1.taxBehavior?.let { formValue3 ->
            form.add("currency_options" + "[" + formKey1 + "]" + "[tax_behavior]", formValue3.value)
          }
          formMapValue1.tiers?.let { formValue3 ->
            if (formValue3.isEmpty()) {
              form.add("currency_options" + "[" + formKey1 + "]" + "[tiers]", "")
            } else {
              formValue3.forEachIndexed { formIndex4, formElement4 ->
                formElement4.flatAmount?.let { formValue6 ->
                  form.add("currency_options" + "[" + formKey1 + "]" + "[tiers]" + "[" + formIndex4 + "]" + "[flat_amount]", formValue6.toString())
                }
                formElement4.flatAmountDecimal?.let { formValue6 ->
                  form.add("currency_options" + "[" + formKey1 + "]" + "[tiers]" + "[" + formIndex4 + "]" + "[flat_amount_decimal]", formValue6)
                }
                formElement4.unitAmount?.let { formValue6 ->
                  form.add("currency_options" + "[" + formKey1 + "]" + "[tiers]" + "[" + formIndex4 + "]" + "[unit_amount]", formValue6.toString())
                }
                formElement4.unitAmountDecimal?.let { formValue6 ->
                  form.add("currency_options" + "[" + formKey1 + "]" + "[tiers]" + "[" + formIndex4 + "]" + "[unit_amount_decimal]", formValue6)
                }
                require(formElement4.upTo.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
                when {
                  formElement4.upTo.inlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersAnyOf1Xe1c066dd != null -> {
                    form.add("currency_options" + "[" + formKey1 + "]" + "[tiers]" + "[" + formIndex4 + "]" + "[up_to]", requireNotNull(formElement4.upTo.inlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueTiersAnyOf1Xe1c066dd).value)
                  }
                  formElement4.upTo.branch2 != null -> {
                    form.add("currency_options" + "[" + formKey1 + "]" + "[tiers]" + "[" + formIndex4 + "]" + "[up_to]", requireNotNull(formElement4.upTo.branch2).toString())
                  }
                  else -> {
                    error("Form union value has no selected branch")
                  }
                }
              }
            }
          }
          formMapValue1.unitAmount?.let { formValue3 ->
            form.add("currency_options" + "[" + formKey1 + "]" + "[unit_amount]", formValue3.toString())
          }
          formMapValue1.unitAmountDecimal?.let { formValue3 ->
            form.add("currency_options" + "[" + formKey1 + "]" + "[unit_amount_decimal]", formValue3)
          }
        }
      }
      request.customUnitAmount?.let { formValue0 ->
        form.add("custom_unit_amount" + "[enabled]", formValue0.enabled.toString())
        formValue0.maximum?.let { formValue2 ->
          form.add("custom_unit_amount" + "[maximum]", formValue2.toString())
        }
        formValue0.minimum?.let { formValue2 ->
          form.add("custom_unit_amount" + "[minimum]", formValue2.toString())
        }
        formValue0.preset?.let { formValue2 ->
          form.add("custom_unit_amount" + "[preset]", formValue2.toString())
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
      request.lookupKey?.let { formValue0 ->
        form.add("lookup_key", formValue0)
      }
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      request.nickname?.let { formValue0 ->
        form.add("nickname", formValue0)
      }
      request.product?.let { formValue0 ->
        form.add("product", formValue0)
      }
      request.productData?.let { formValue0 ->
        formValue0.active?.let { formValue2 ->
          form.add("product_data" + "[active]", formValue2.toString())
        }
        formValue0.id?.let { formValue2 ->
          form.add("product_data" + "[id]", formValue2)
        }
        formValue0.metadata?.let { formValue2 ->
          formValue2.forEach { (formKey3, formMapValue3) ->
            form.add("product_data" + "[metadata]" + "[" + formKey3 + "]", formMapValue3)
          }
        }
        form.add("product_data" + "[name]", formValue0.name)
        formValue0.statementDescriptor?.let { formValue2 ->
          form.add("product_data" + "[statement_descriptor]", formValue2)
        }
        formValue0.taxCode?.let { formValue2 ->
          form.add("product_data" + "[tax_code]", formValue2)
        }
        formValue0.unitLabel?.let { formValue2 ->
          form.add("product_data" + "[unit_label]", formValue2)
        }
      }
      request.recurring?.let { formValue0 ->
        form.add("recurring" + "[interval]", formValue0.interval.value)
        formValue0.intervalCount?.let { formValue2 ->
          form.add("recurring" + "[interval_count]", formValue2.toString())
        }
        formValue0.meter?.let { formValue2 ->
          form.add("recurring" + "[meter]", formValue2)
        }
        formValue0.usageType?.let { formValue2 ->
          form.add("recurring" + "[usage_type]", formValue2.value)
        }
      }
      request.taxBehavior?.let { formValue0 ->
        form.add("tax_behavior", formValue0.value)
      }
      request.tiers?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("tiers", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            formElement1.flatAmount?.let { formValue3 ->
              form.add("tiers" + "[" + formIndex1 + "]" + "[flat_amount]", formValue3.toString())
            }
            formElement1.flatAmountDecimal?.let { formValue3 ->
              form.add("tiers" + "[" + formIndex1 + "]" + "[flat_amount_decimal]", formValue3)
            }
            formElement1.unitAmount?.let { formValue3 ->
              form.add("tiers" + "[" + formIndex1 + "]" + "[unit_amount]", formValue3.toString())
            }
            formElement1.unitAmountDecimal?.let { formValue3 ->
              form.add("tiers" + "[" + formIndex1 + "]" + "[unit_amount_decimal]", formValue3)
            }
            require(formElement1.upTo.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
            when {
              formElement1.upTo.inlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48 != null -> {
                form.add("tiers" + "[" + formIndex1 + "]" + "[up_to]", requireNotNull(formElement1.upTo.inlineV1PricesPostRequestFormTiersItemUpToAnyOf1X8579de48).value)
              }
              formElement1.upTo.branch2 != null -> {
                form.add("tiers" + "[" + formIndex1 + "]" + "[up_to]", requireNotNull(formElement1.upTo.branch2).toString())
              }
              else -> {
                error("Form union value has no selected branch")
              }
            }
          }
        }
      }
      request.tiersMode?.let { formValue0 ->
        form.add("tiers_mode", formValue0.value)
      }
      request.transferLookupKey?.let { formValue0 ->
        form.add("transfer_lookup_key", formValue0.toString())
      }
      request.transformQuantity?.let { formValue0 ->
        form.add("transform_quantity" + "[divide_by]", formValue0.divideBy.toString())
        form.add("transform_quantity" + "[round]", formValue0.round.value)
      }
      request.unitAmount?.let { formValue0 ->
        form.add("unit_amount", formValue0.toString())
      }
      request.unitAmountDecimal?.let { formValue0 ->
        form.add("unit_amount_decimal", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PricesPostRequestFormX26912080 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostPricesPriceFormCodec : MediaTypeCodec<InlineV1PricesPostRequestFormXe33007fa?> {
    override val id: String = "PostPricesPrice.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PricesPostRequestFormXe33007fa?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.active?.let { formValue0 ->
        form.add("active", formValue0.toString())
      }
      request.currencyOptions?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("currency_options" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1PricesPostRequestFormCurrencyOptionsAnyOf2X76b5e6c3 != null -> {
            form.add("currency_options", requireNotNull(formValue0.inlineV1PricesPostRequestFormCurrencyOptionsAnyOf2X76b5e6c3).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
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
      request.lookupKey?.let { formValue0 ->
        form.add("lookup_key", formValue0)
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
          formValue0.inlineV1PricesPostRequestFormMetadataAnyOf2Xb4be4d5e != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1PricesPostRequestFormMetadataAnyOf2Xb4be4d5e).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.nickname?.let { formValue0 ->
        form.add("nickname", formValue0)
      }
      request.taxBehavior?.let { formValue0 ->
        form.add("tax_behavior", formValue0.value)
      }
      request.transferLookupKey?.let { formValue0 ->
        form.add("transfer_lookup_key", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PricesPostRequestFormXe33007fa? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'prices' group of Stripe API.
 */
public class PricesClient(
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
      SdkExecutor(transport, authentication = this@PricesClient.authentication)

  /**
   * <p>Returns a list of your active prices, excluding <a
   * href="/docs/products-prices/pricing-models#inline-pricing">inline prices</a>. For the list of inactive prices, set
   * <code>active</code> to false.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param active Only return prices that are active or inactive (e.g., pass `false` to list all inactive prices).
   * @param created A filter on the list, based on the object `created` field. The value can be a string with an integer
   * Unix timestamp, or it can be a dictionary with a number of different query options.
   * @param currency Only return prices for the given currency.
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param lookupKeys Only return the price with these lookup_keys, if any exist. You can specify up to 10 lookup_keys.
   * @param product Only return prices for the given product.
   * @param recurring Only return prices with these recurring fields.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param type Only return prices of type `recurring` or `one_time`.
   * @param options Execution options.
   */
  public suspend fun getPricesWithResponse(
    request: JsonObject? = null,
    active: Boolean? = null,
    created: InlineV1PricesGetParameterX903af275? = null,
    currency: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    lookupKeys: List<String>? = null,
    product: String? = null,
    recurring: InlineV1PricesGetParameterX3bd64ecd? = null,
    startingAfter: String? = null,
    type: InlineV1PricesGetParameterXee4abeea? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPricesResponse> = executor.executeWithResponse<JsonObject?, GetPricesResponse>(SdkExecutionRequest(getPricesMetadata, baseUri, request, listOf(PricesCodecs.GETPRICES_REQUEST_CODEC_ID), buildList {
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
    lookupKeys?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "lookup_keys" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "product", values = product?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "recurring[interval]", values = recurring?.interval?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "recurring[meter]", values = recurring?.meter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "recurring[usage_type]", values = recurring?.usageType?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "type", values = type?.let { listOf(it.toString()) }.orEmpty()))
  }), PricesCodecs.getPricesRequestCodecRegistry, GetPricesResponseDecoder, options)

  /**
   * <p>Retrieves the price with the given ID.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param price Wire parameter `price`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getPricesPriceWithResponse(
    request: JsonObject? = null,
    price: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPricesPriceResponse> = executor.executeWithResponse<JsonObject?, GetPricesPriceResponse>(SdkExecutionRequest(getPricesPriceMetadata, baseUri, request, listOf(PricesCodecs.GETPRICESPRICE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "price", values = listOf(price.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), PricesCodecs.getPricesPriceRequestCodecRegistry, GetPricesPriceResponseDecoder, options)

  /**
   * <p>Search for prices you’ve previously created using Stripe’s <a href="/docs/search#search-query-language">Search
   * Query Language</a>.
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
   * language](https://docs.stripe.com/search#search-query-language) and the list of supported [query fields for
   * prices](https://docs.stripe.com/search#query-fields-for-prices).
   * @param options Execution options.
   */
  public suspend fun getPricesSearchWithResponse(
    request: JsonObject? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    page: String? = null,
    query: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPricesSearchResponse> = executor.executeWithResponse<JsonObject?, GetPricesSearchResponse>(SdkExecutionRequest(getPricesSearchMetadata, baseUri, request, listOf(PricesCodecs.GETPRICESSEARCH_REQUEST_CODEC_ID), buildList {
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "query", values = listOf(query.toString())))
  }), PricesCodecs.getPricesSearchRequestCodecRegistry, GetPricesSearchResponseDecoder, options)

  /**
   * <p>Creates a new <a href="https://docs.stripe.com/api/prices">Price</a> for an existing <a
   * href="https://docs.stripe.com/api/products">Product</a>. The Price can be recurring or one-time.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postPricesWithResponse(request: InlineV1PricesPostRequestFormX26912080, options: CallOptions = CallOptions()): SdkResponseResult<PostPricesResponse> = executor.executeWithResponse<InlineV1PricesPostRequestFormX26912080, PostPricesResponse>(SdkExecutionRequest(postPricesMetadata, baseUri, request, listOf(PricesCodecs.POSTPRICES_REQUEST_CODEC_ID), emptyList()), PricesCodecs.postPricesRequestCodecRegistry, PostPricesResponseDecoder, options)

  /**
   * <p>Updates the specified price by setting the values of the parameters passed. Any parameters not provided are left
   * unchanged.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param price Wire parameter `price`.
   * @param options Execution options.
   */
  public suspend fun postPricesPriceWithResponse(
    request: InlineV1PricesPostRequestFormXe33007fa? = null,
    price: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostPricesPriceResponse> = executor.executeWithResponse<InlineV1PricesPostRequestFormXe33007fa?, PostPricesPriceResponse>(SdkExecutionRequest(postPricesPriceMetadata, baseUri, request, listOf(PricesCodecs.POSTPRICESPRICE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "price", values = listOf(price.toString())))
  }), PricesCodecs.postPricesPriceRequestCodecRegistry, PostPricesPriceResponseDecoder, options)

  /**
   * Typed response alternatives for `GetPrices`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetPricesResponse {
    public class SuccessJson(
      public val json: InlineV1PricesGetResponse200JsonX04f7a5eb,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPricesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPricesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPricesResponse
  }

  private object GetPricesResponseDecoder : SdkResponseAlternativeDecoder<GetPricesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPricesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPricesResponse> = when {
      alternative.id == "GetPrices.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPricesResponse.SuccessJson(
          json = PricesCodecs.getPricesResponseCodecAlternative0Registry.select(listOf("GetPrices.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPrices.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPricesResponse.DefaultJson(
          json = PricesCodecs.getPricesResponseCodecAlternative1Registry.select(listOf("GetPrices.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPricesResponse = GetPricesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetPricesPrice`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetPricesPriceResponse {
    public class SuccessJson(
      public val json: Price,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPricesPriceResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPricesPriceResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPricesPriceResponse
  }

  private object GetPricesPriceResponseDecoder : SdkResponseAlternativeDecoder<GetPricesPriceResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPricesPriceResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPricesPriceResponse> = when {
      alternative.id == "GetPricesPrice.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPricesPriceResponse.SuccessJson(
          json = PricesCodecs.getPricesPriceResponseCodecAlternative0Registry.select(listOf("GetPricesPrice.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPricesPrice.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPricesPriceResponse.DefaultJson(
          json = PricesCodecs.getPricesPriceResponseCodecAlternative1Registry.select(listOf("GetPricesPrice.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPricesPriceResponse = GetPricesPriceResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetPricesSearch`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetPricesSearchResponse {
    public class SuccessJson(
      public val json: InlineV1PricesSearchGetResponse200JsonX5105616d,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPricesSearchResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPricesSearchResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPricesSearchResponse
  }

  private object GetPricesSearchResponseDecoder : SdkResponseAlternativeDecoder<GetPricesSearchResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPricesSearchResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPricesSearchResponse> = when {
      alternative.id == "GetPricesSearch.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPricesSearchResponse.SuccessJson(
          json = PricesCodecs.getPricesSearchResponseCodecAlternative0Registry.select(listOf("GetPricesSearch.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPricesSearch.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPricesSearchResponse.DefaultJson(
          json = PricesCodecs.getPricesSearchResponseCodecAlternative1Registry.select(listOf("GetPricesSearch.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPricesSearchResponse = GetPricesSearchResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPrices`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostPricesResponse {
    public class SuccessJson(
      public val json: Price,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPricesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPricesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPricesResponse
  }

  private object PostPricesResponseDecoder : SdkResponseAlternativeDecoder<PostPricesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPricesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPricesResponse> = when {
      alternative.id == "PostPrices.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPricesResponse.SuccessJson(
          json = PricesCodecs.postPricesResponseCodecAlternative0Registry.select(listOf("PostPrices.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPrices.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPricesResponse.DefaultJson(
          json = PricesCodecs.postPricesResponseCodecAlternative1Registry.select(listOf("PostPrices.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPricesResponse = PostPricesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPricesPrice`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostPricesPriceResponse {
    public class SuccessJson(
      public val json: Price,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPricesPriceResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPricesPriceResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPricesPriceResponse
  }

  private object PostPricesPriceResponseDecoder : SdkResponseAlternativeDecoder<PostPricesPriceResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPricesPriceResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPricesPriceResponse> = when {
      alternative.id == "PostPricesPrice.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPricesPriceResponse.SuccessJson(
          json = PricesCodecs.postPricesPriceResponseCodecAlternative0Registry.select(listOf("PostPricesPrice.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPricesPrice.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPricesPriceResponse.DefaultJson(
          json = PricesCodecs.postPricesPriceResponseCodecAlternative1Registry.select(listOf("PostPricesPrice.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPricesPriceResponse = PostPricesPriceResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val getPricesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPrices",
          method = "GET",
          path = "/v1/prices",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1PricesGetResponse200JsonX04f7a5eb",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPrices.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPrices.response.alternative1",
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

    public val getPricesPriceMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPricesPrice",
          method = "GET",
          path = "/v1/prices/{price}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Price",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPricesPrice.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPricesPrice.response.alternative1",
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

    public val getPricesSearchMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPricesSearch",
          method = "GET",
          path = "/v1/prices/search",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1PricesSearchGetResponse200JsonX5105616d",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPricesSearch.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPricesSearch.response.alternative1",
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

    public val postPricesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPrices",
          method = "POST",
          path = "/v1/prices",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Price",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPrices.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPrices.response.alternative1",
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

    public val postPricesPriceMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPricesPrice",
          method = "POST",
          path = "/v1/prices/{price}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Price",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPricesPrice.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPricesPrice.response.alternative1",
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
