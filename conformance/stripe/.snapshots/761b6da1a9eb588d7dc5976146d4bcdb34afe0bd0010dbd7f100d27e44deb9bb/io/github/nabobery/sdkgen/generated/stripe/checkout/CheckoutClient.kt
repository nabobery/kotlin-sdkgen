package io.github.nabobery.sdkgen.generated.stripe.checkout

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
import io.github.nabobery.sdkgen.generated.stripe.CheckoutSession
import io.github.nabobery.sdkgen.generated.stripe.Error
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsExpirePostRequestFormX2922777c
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsGetParameterX224caacf
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsGetParameterXa5b062a4
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsGetParameterXd505e8fd
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsGetResponse200JsonXfa41aef8
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsLineItemsGetResponse200JsonXd7b69818
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormXb2b09faa
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object CheckoutCodecs {
  internal const val GETCHECKOUTSESSIONS_REQUEST_CODEC_ID: String = "GetCheckoutSessions.request"

  private val getCheckoutSessionsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCheckoutSessionsFormCodec

  private val getCheckoutSessionsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CheckoutSessionsGetResponse200JsonXfa41aef8> =
      KotlinxSerializationCodec("GetCheckoutSessions.response.alternative0", InlineV1CheckoutSessionsGetResponse200JsonXfa41aef8.Serializer, SdkJson)

  internal val getCheckoutSessionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CheckoutSessionsGetResponse200JsonXfa41aef8> =
      MediaTypeCodecRegistry.of(getCheckoutSessionsResponseCodecAlternative0Codec)

  private val getCheckoutSessionsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCheckoutSessions.response.alternative1", Error.Serializer, SdkJson)

  internal val getCheckoutSessionsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCheckoutSessionsResponseCodecAlternative1Codec)

  internal val getCheckoutSessionsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCheckoutSessionsRequestCodec)

  internal const val GETCHECKOUTSESSIONSSESSION_REQUEST_CODEC_ID: String =
      "GetCheckoutSessionsSession.request"

  private val getCheckoutSessionsSessionRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCheckoutSessionsSessionFormCodec

  private val getCheckoutSessionsSessionResponseCodecAlternative0Codec:
      MediaTypeCodec<CheckoutSession> =
      KotlinxSerializationCodec("GetCheckoutSessionsSession.response.alternative0", CheckoutSession.Serializer, SdkJson)

  internal val getCheckoutSessionsSessionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CheckoutSession> =
      MediaTypeCodecRegistry.of(getCheckoutSessionsSessionResponseCodecAlternative0Codec)

  private val getCheckoutSessionsSessionResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCheckoutSessionsSession.response.alternative1", Error.Serializer, SdkJson)

  internal val getCheckoutSessionsSessionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCheckoutSessionsSessionResponseCodecAlternative1Codec)

  internal val getCheckoutSessionsSessionRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCheckoutSessionsSessionRequestCodec)

  internal const val GETCHECKOUTSESSIONSSESSIONLINEITEMS_REQUEST_CODEC_ID: String =
      "GetCheckoutSessionsSessionLineItems.request"

  private val getCheckoutSessionsSessionLineItemsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCheckoutSessionsSessionLineItemsFormCodec

  private val getCheckoutSessionsSessionLineItemsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CheckoutSessionsLineItemsGetResponse200JsonXd7b69818> =
      KotlinxSerializationCodec("GetCheckoutSessionsSessionLineItems.response.alternative0", InlineV1CheckoutSessionsLineItemsGetResponse200JsonXd7b69818.Serializer, SdkJson)

  internal val getCheckoutSessionsSessionLineItemsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CheckoutSessionsLineItemsGetResponse200JsonXd7b69818> =
      MediaTypeCodecRegistry.of(getCheckoutSessionsSessionLineItemsResponseCodecAlternative0Codec)

  private val getCheckoutSessionsSessionLineItemsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCheckoutSessionsSessionLineItems.response.alternative1", Error.Serializer, SdkJson)

  internal val getCheckoutSessionsSessionLineItemsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCheckoutSessionsSessionLineItemsResponseCodecAlternative1Codec)

  internal val getCheckoutSessionsSessionLineItemsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCheckoutSessionsSessionLineItemsRequestCodec)

  internal const val POSTCHECKOUTSESSIONSSESSION_REQUEST_CODEC_ID: String =
      "PostCheckoutSessionsSession.request"

  private val postCheckoutSessionsSessionRequestCodec:
      MediaTypeCodec<InlineV1CheckoutSessionsPostRequestFormXb2b09faa?> =
      PostCheckoutSessionsSessionFormCodec

  private val postCheckoutSessionsSessionResponseCodecAlternative0Codec:
      MediaTypeCodec<CheckoutSession> =
      KotlinxSerializationCodec("PostCheckoutSessionsSession.response.alternative0", CheckoutSession.Serializer, SdkJson)

  internal val postCheckoutSessionsSessionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CheckoutSession> =
      MediaTypeCodecRegistry.of(postCheckoutSessionsSessionResponseCodecAlternative0Codec)

  private val postCheckoutSessionsSessionResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostCheckoutSessionsSession.response.alternative1", Error.Serializer, SdkJson)

  internal val postCheckoutSessionsSessionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCheckoutSessionsSessionResponseCodecAlternative1Codec)

  internal val postCheckoutSessionsSessionRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CheckoutSessionsPostRequestFormXb2b09faa?> =
      MediaTypeCodecRegistry.of(postCheckoutSessionsSessionRequestCodec)

  internal const val POSTCHECKOUTSESSIONSSESSIONEXPIRE_REQUEST_CODEC_ID: String =
      "PostCheckoutSessionsSessionExpire.request"

  private val postCheckoutSessionsSessionExpireRequestCodec:
      MediaTypeCodec<InlineV1CheckoutSessionsExpirePostRequestFormX2922777c?> =
      PostCheckoutSessionsSessionExpireFormCodec

  private val postCheckoutSessionsSessionExpireResponseCodecAlternative0Codec:
      MediaTypeCodec<CheckoutSession> =
      KotlinxSerializationCodec("PostCheckoutSessionsSessionExpire.response.alternative0", CheckoutSession.Serializer, SdkJson)

  internal val postCheckoutSessionsSessionExpireResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CheckoutSession> =
      MediaTypeCodecRegistry.of(postCheckoutSessionsSessionExpireResponseCodecAlternative0Codec)

  private val postCheckoutSessionsSessionExpireResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("PostCheckoutSessionsSessionExpire.response.alternative1", Error.Serializer, SdkJson)

  internal val postCheckoutSessionsSessionExpireResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCheckoutSessionsSessionExpireResponseCodecAlternative1Codec)

  internal val postCheckoutSessionsSessionExpireRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CheckoutSessionsExpirePostRequestFormX2922777c?> =
      MediaTypeCodecRegistry.of(postCheckoutSessionsSessionExpireRequestCodec)

  internal object GetCheckoutSessionsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCheckoutSessions.request"

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

  internal object GetCheckoutSessionsSessionFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCheckoutSessionsSession.request"

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

  internal object GetCheckoutSessionsSessionLineItemsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCheckoutSessionsSessionLineItems.request"

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

  internal object PostCheckoutSessionsSessionFormCodec : MediaTypeCodec<InlineV1CheckoutSessionsPostRequestFormXb2b09faa?> {
    override val id: String = "PostCheckoutSessionsSession.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CheckoutSessionsPostRequestFormXb2b09faa?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.collectedInformation?.let { formValue0 ->
        formValue0.shippingDetails?.let { formValue2 ->
          formValue2.address.city?.let { formValue5 ->
            form.add("collected_information" + "[shipping_details]" + "[address]" + "[city]", formValue5)
          }
          form.add("collected_information" + "[shipping_details]" + "[address]" + "[country]", formValue2.address.country)
          form.add("collected_information" + "[shipping_details]" + "[address]" + "[line1]", formValue2.address.line1)
          formValue2.address.line2?.let { formValue5 ->
            form.add("collected_information" + "[shipping_details]" + "[address]" + "[line2]", formValue5)
          }
          formValue2.address.postalCode?.let { formValue5 ->
            form.add("collected_information" + "[shipping_details]" + "[address]" + "[postal_code]", formValue5)
          }
          formValue2.address.state?.let { formValue5 ->
            form.add("collected_information" + "[shipping_details]" + "[address]" + "[state]", formValue5)
          }
          form.add("collected_information" + "[shipping_details]" + "[name]", formValue2.name)
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
      request.lineItems?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("line_items", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            formElement1.adjustableQuantity?.let { formValue3 ->
              form.add("line_items" + "[" + formIndex1 + "]" + "[adjustable_quantity]" + "[enabled]", formValue3.enabled.toString())
              formValue3.maximum?.let { formValue5 ->
                form.add("line_items" + "[" + formIndex1 + "]" + "[adjustable_quantity]" + "[maximum]", formValue5.toString())
              }
              formValue3.minimum?.let { formValue5 ->
                form.add("line_items" + "[" + formIndex1 + "]" + "[adjustable_quantity]" + "[minimum]", formValue5.toString())
              }
            }
            formElement1.id?.let { formValue3 ->
              form.add("line_items" + "[" + formIndex1 + "]" + "[id]", formValue3)
            }
            formElement1.metadata?.let { formValue3 ->
              require(formValue3.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
              when {
                formValue3.branch1 != null -> {
                  requireNotNull(formValue3.branch1).forEach { (formKey5, formMapValue5) ->
                    val formPrimitive5 = formMapValue5 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
                    form.add("line_items" + "[" + formIndex1 + "]" + "[metadata]" + "[" + formKey5 + "]", formPrimitive5.content)
                  }
                }
                formValue3.inlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataAnyOf2X42abd63c != null -> {
                  form.add("line_items" + "[" + formIndex1 + "]" + "[metadata]", requireNotNull(formValue3.inlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataAnyOf2X42abd63c).value)
                }
                else -> {
                  error("Form union value has no selected branch")
                }
              }
            }
            formElement1.price?.let { formValue3 ->
              form.add("line_items" + "[" + formIndex1 + "]" + "[price]", formValue3)
            }
            formElement1.priceData?.let { formValue3 ->
              form.add("line_items" + "[" + formIndex1 + "]" + "[price_data]" + "[currency]", formValue3.currency)
              formValue3.product?.let { formValue5 ->
                form.add("line_items" + "[" + formIndex1 + "]" + "[price_data]" + "[product]", formValue5)
              }
              formValue3.productData?.let { formValue5 ->
                formValue5.description?.let { formValue7 ->
                  form.add("line_items" + "[" + formIndex1 + "]" + "[price_data]" + "[product_data]" + "[description]", formValue7)
                }
                formValue5.images?.let { formValue7 ->
                  if (formValue7.isEmpty()) {
                    form.add("line_items" + "[" + formIndex1 + "]" + "[price_data]" + "[product_data]" + "[images]", "")
                  } else {
                    formValue7.forEachIndexed { formIndex8, formElement8 ->
                      form.add("line_items" + "[" + formIndex1 + "]" + "[price_data]" + "[product_data]" + "[images]" + "[" + formIndex8 + "]", formElement8)
                    }
                  }
                }
                formValue5.metadata?.let { formValue7 ->
                  formValue7.forEach { (formKey8, formMapValue8) ->
                    form.add("line_items" + "[" + formIndex1 + "]" + "[price_data]" + "[product_data]" + "[metadata]" + "[" + formKey8 + "]", formMapValue8)
                  }
                }
                form.add("line_items" + "[" + formIndex1 + "]" + "[price_data]" + "[product_data]" + "[name]", formValue5.name)
                formValue5.taxCode?.let { formValue7 ->
                  form.add("line_items" + "[" + formIndex1 + "]" + "[price_data]" + "[product_data]" + "[tax_code]", formValue7)
                }
                formValue5.unitLabel?.let { formValue7 ->
                  form.add("line_items" + "[" + formIndex1 + "]" + "[price_data]" + "[product_data]" + "[unit_label]", formValue7)
                }
              }
              formValue3.recurring?.let { formValue5 ->
                form.add("line_items" + "[" + formIndex1 + "]" + "[price_data]" + "[recurring]" + "[interval]", formValue5.interval.value)
                formValue5.intervalCount?.let { formValue7 ->
                  form.add("line_items" + "[" + formIndex1 + "]" + "[price_data]" + "[recurring]" + "[interval_count]", formValue7.toString())
                }
              }
              formValue3.taxBehavior?.let { formValue5 ->
                form.add("line_items" + "[" + formIndex1 + "]" + "[price_data]" + "[tax_behavior]", formValue5.value)
              }
              formValue3.unitAmount?.let { formValue5 ->
                form.add("line_items" + "[" + formIndex1 + "]" + "[price_data]" + "[unit_amount]", formValue5.toString())
              }
              formValue3.unitAmountDecimal?.let { formValue5 ->
                form.add("line_items" + "[" + formIndex1 + "]" + "[price_data]" + "[unit_amount_decimal]", formValue5)
              }
            }
            formElement1.quantity?.let { formValue3 ->
              form.add("line_items" + "[" + formIndex1 + "]" + "[quantity]", formValue3.toString())
            }
            formElement1.taxRates?.let { formValue3 ->
              require(formValue3.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
              when {
                formValue3.branch1 != null -> {
                  if (requireNotNull(formValue3.branch1).isEmpty()) {
                    form.add("line_items" + "[" + formIndex1 + "]" + "[tax_rates]", "")
                  } else {
                    requireNotNull(formValue3.branch1).forEachIndexed { formIndex5, formElement5 ->
                      form.add("line_items" + "[" + formIndex1 + "]" + "[tax_rates]" + "[" + formIndex5 + "]", formElement5)
                    }
                  }
                }
                formValue3.inlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db != null -> {
                  form.add("line_items" + "[" + formIndex1 + "]" + "[tax_rates]", requireNotNull(formValue3.inlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db).value)
                }
                else -> {
                  error("Form union value has no selected branch")
                }
              }
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
          formValue0.inlineV1CheckoutSessionsPostRequestFormMetadataAnyOf2X99f48c69 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1CheckoutSessionsPostRequestFormMetadataAnyOf2X99f48c69).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.shippingOptions?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            if (requireNotNull(formValue0.branch1).isEmpty()) {
              form.add("shipping_options", "")
            } else {
              requireNotNull(formValue0.branch1).forEachIndexed { formIndex2, formElement2 ->
                formElement2.shippingRate?.let { formValue4 ->
                  form.add("shipping_options" + "[" + formIndex2 + "]" + "[shipping_rate]", formValue4)
                }
                formElement2.shippingRateData?.let { formValue4 ->
                  formValue4.deliveryEstimate?.let { formValue6 ->
                    formValue6.maximum?.let { formValue8 ->
                      form.add("shipping_options" + "[" + formIndex2 + "]" + "[shipping_rate_data]" + "[delivery_estimate]" + "[maximum]" + "[unit]", formValue8.unit.value)
                      form.add("shipping_options" + "[" + formIndex2 + "]" + "[shipping_rate_data]" + "[delivery_estimate]" + "[maximum]" + "[value]", formValue8.value.toString())
                    }
                    formValue6.minimum?.let { formValue8 ->
                      form.add("shipping_options" + "[" + formIndex2 + "]" + "[shipping_rate_data]" + "[delivery_estimate]" + "[minimum]" + "[unit]", formValue8.unit.value)
                      form.add("shipping_options" + "[" + formIndex2 + "]" + "[shipping_rate_data]" + "[delivery_estimate]" + "[minimum]" + "[value]", formValue8.value.toString())
                    }
                  }
                  form.add("shipping_options" + "[" + formIndex2 + "]" + "[shipping_rate_data]" + "[display_name]", formValue4.displayName)
                  formValue4.fixedAmount?.let { formValue6 ->
                    form.add("shipping_options" + "[" + formIndex2 + "]" + "[shipping_rate_data]" + "[fixed_amount]" + "[amount]", formValue6.amount.toString())
                    form.add("shipping_options" + "[" + formIndex2 + "]" + "[shipping_rate_data]" + "[fixed_amount]" + "[currency]", formValue6.currency)
                    formValue6.currencyOptions?.let { formValue8 ->
                      formValue8.forEach { (formKey9, formMapValue9) ->
                        form.add("shipping_options" + "[" + formIndex2 + "]" + "[shipping_rate_data]" + "[fixed_amount]" + "[currency_options]" + "[" + formKey9 + "]" + "[amount]", formMapValue9.amount.toString())
                        formMapValue9.taxBehavior?.let { formValue11 ->
                          form.add("shipping_options" + "[" + formIndex2 + "]" + "[shipping_rate_data]" + "[fixed_amount]" + "[currency_options]" + "[" + formKey9 + "]" + "[tax_behavior]", formValue11.value)
                        }
                      }
                    }
                  }
                  formValue4.metadata?.let { formValue6 ->
                    formValue6.forEach { (formKey7, formMapValue7) ->
                      form.add("shipping_options" + "[" + formIndex2 + "]" + "[shipping_rate_data]" + "[metadata]" + "[" + formKey7 + "]", formMapValue7)
                    }
                  }
                  formValue4.taxBehavior?.let { formValue6 ->
                    form.add("shipping_options" + "[" + formIndex2 + "]" + "[shipping_rate_data]" + "[tax_behavior]", formValue6.value)
                  }
                  formValue4.taxCode?.let { formValue6 ->
                    form.add("shipping_options" + "[" + formIndex2 + "]" + "[shipping_rate_data]" + "[tax_code]", formValue6)
                  }
                  formValue4.type?.let { formValue6 ->
                    form.add("shipping_options" + "[" + formIndex2 + "]" + "[shipping_rate_data]" + "[type]", formValue6.value)
                  }
                }
              }
            }
          }
          formValue0.inlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf2Xdc86790e != null -> {
            form.add("shipping_options", requireNotNull(formValue0.inlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf2Xdc86790e).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CheckoutSessionsPostRequestFormXb2b09faa? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostCheckoutSessionsSessionExpireFormCodec : MediaTypeCodec<InlineV1CheckoutSessionsExpirePostRequestFormX2922777c?> {
    override val id: String = "PostCheckoutSessionsSessionExpire.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CheckoutSessionsExpirePostRequestFormX2922777c?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CheckoutSessionsExpirePostRequestFormX2922777c? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'checkout' group of Stripe API.
 */
public class CheckoutClient(
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
      SdkExecutor(transport, authentication = this@CheckoutClient.authentication)

  /**
   * <p>Returns a list of Checkout Sessions.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return Checkout Sessions that were created during the given date interval.
   * @param customer Only return the Checkout Sessions for the Customer specified.
   * @param customerAccount Only return the Checkout Sessions for the Account specified.
   * @param customerDetails Only return the Checkout Sessions for the Customer details specified.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param paymentIntent Only return the Checkout Session for the PaymentIntent specified.
   * @param paymentLink Only return the Checkout Sessions for the Payment Link specified.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status Only return the Checkout Sessions matching the given status.
   * @param subscription Only return the Checkout Session for the subscription specified.
   * @param options Execution options.
   */
  public suspend fun getCheckoutSessionsWithResponse(
    request: JsonObject? = null,
    created: InlineV1CheckoutSessionsGetParameterX224caacf? = null,
    customer: String? = null,
    customerAccount: String? = null,
    customerDetails: InlineV1CheckoutSessionsGetParameterXa5b062a4? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    paymentIntent: String? = null,
    paymentLink: String? = null,
    startingAfter: String? = null,
    status: InlineV1CheckoutSessionsGetParameterXd505e8fd? = null,
    subscription: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCheckoutSessionsResponse> = executor.executeWithResponse<JsonObject?, GetCheckoutSessionsResponse>(SdkExecutionRequest(getCheckoutSessionsMetadata, baseUri, request, listOf(CheckoutCodecs.GETCHECKOUTSESSIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer", values = customer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer_account", values = customerAccount?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer_details[email]", values = customerDetails?.email?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "payment_intent", values = paymentIntent?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "payment_link", values = paymentLink?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "subscription", values = subscription?.let { listOf(it.toString()) }.orEmpty()))
  }), CheckoutCodecs.getCheckoutSessionsRequestCodecRegistry, GetCheckoutSessionsResponseDecoder, options)

  /**
   * <p>Retrieves a Checkout Session object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param session Wire parameter `session`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getCheckoutSessionsSessionWithResponse(
    request: JsonObject? = null,
    session: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCheckoutSessionsSessionResponse> = executor.executeWithResponse<JsonObject?, GetCheckoutSessionsSessionResponse>(SdkExecutionRequest(getCheckoutSessionsSessionMetadata, baseUri, request, listOf(CheckoutCodecs.GETCHECKOUTSESSIONSSESSION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "session", values = listOf(session.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), CheckoutCodecs.getCheckoutSessionsSessionRequestCodecRegistry, GetCheckoutSessionsSessionResponseDecoder, options)

  /**
   * <p>When retrieving a Checkout Session, there is an includable <strong>line_items</strong> property containing the
   * first handful of those items. There is also a URL where you can retrieve the full (paginated) list of line
   * items.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param session Wire parameter `session`.
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
  public suspend fun getCheckoutSessionsSessionLineItemsWithResponse(
    request: JsonObject? = null,
    session: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCheckoutSessionsSessionLineItemsResponse> = executor.executeWithResponse<JsonObject?, GetCheckoutSessionsSessionLineItemsResponse>(SdkExecutionRequest(getCheckoutSessionsSessionLineItemsMetadata, baseUri, request, listOf(CheckoutCodecs.GETCHECKOUTSESSIONSSESSIONLINEITEMS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "session", values = listOf(session.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), CheckoutCodecs.getCheckoutSessionsSessionLineItemsRequestCodecRegistry, GetCheckoutSessionsSessionLineItemsResponseDecoder, options)

  /**
   * <p>Updates a Checkout Session object.</p>
   *
   * <p>Related guide: <a href="/payments/advanced/dynamic-updates">Dynamically update a Checkout Session</a></p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param session Wire parameter `session`.
   * @param options Execution options.
   */
  public suspend fun postCheckoutSessionsSessionWithResponse(
    request: InlineV1CheckoutSessionsPostRequestFormXb2b09faa? = null,
    session: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostCheckoutSessionsSessionResponse> = executor.executeWithResponse<InlineV1CheckoutSessionsPostRequestFormXb2b09faa?, PostCheckoutSessionsSessionResponse>(SdkExecutionRequest(postCheckoutSessionsSessionMetadata, baseUri, request, listOf(CheckoutCodecs.POSTCHECKOUTSESSIONSSESSION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "session", values = listOf(session.toString())))
  }), CheckoutCodecs.postCheckoutSessionsSessionRequestCodecRegistry, PostCheckoutSessionsSessionResponseDecoder, options)

  /**
   * <p>A Checkout Session can be expired when it is in one of these statuses: <code>open</code> </p>
   *
   * <p>After it expires, a customer can’t complete a Checkout Session and customers loading the Checkout Session see a
   * message saying the Checkout Session is expired.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param session Wire parameter `session`.
   * @param options Execution options.
   */
  public suspend fun postCheckoutSessionsSessionExpireWithResponse(
    request: InlineV1CheckoutSessionsExpirePostRequestFormX2922777c? = null,
    session: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostCheckoutSessionsSessionExpireResponse> = executor.executeWithResponse<InlineV1CheckoutSessionsExpirePostRequestFormX2922777c?, PostCheckoutSessionsSessionExpireResponse>(SdkExecutionRequest(postCheckoutSessionsSessionExpireMetadata, baseUri, request, listOf(CheckoutCodecs.POSTCHECKOUTSESSIONSSESSIONEXPIRE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "session", values = listOf(session.toString())))
  }), CheckoutCodecs.postCheckoutSessionsSessionExpireRequestCodecRegistry, PostCheckoutSessionsSessionExpireResponseDecoder, options)

  /**
   * Typed response alternatives for `GetCheckoutSessions`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetCheckoutSessionsResponse {
    public class SuccessJson(
      public val json: InlineV1CheckoutSessionsGetResponse200JsonXfa41aef8,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCheckoutSessionsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCheckoutSessionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCheckoutSessionsResponse
  }

  private object GetCheckoutSessionsResponseDecoder : SdkResponseAlternativeDecoder<GetCheckoutSessionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCheckoutSessionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCheckoutSessionsResponse> = when {
      alternative.id == "GetCheckoutSessions.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCheckoutSessionsResponse.SuccessJson(
          json = CheckoutCodecs.getCheckoutSessionsResponseCodecAlternative0Registry.select(listOf("GetCheckoutSessions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCheckoutSessions.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCheckoutSessionsResponse.DefaultJson(
          json = CheckoutCodecs.getCheckoutSessionsResponseCodecAlternative1Registry.select(listOf("GetCheckoutSessions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCheckoutSessionsResponse = GetCheckoutSessionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCheckoutSessionsSession`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetCheckoutSessionsSessionResponse {
    public class SuccessJson(
      public val json: CheckoutSession,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCheckoutSessionsSessionResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCheckoutSessionsSessionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCheckoutSessionsSessionResponse
  }

  private object GetCheckoutSessionsSessionResponseDecoder : SdkResponseAlternativeDecoder<GetCheckoutSessionsSessionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCheckoutSessionsSessionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCheckoutSessionsSessionResponse> = when {
      alternative.id == "GetCheckoutSessionsSession.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCheckoutSessionsSessionResponse.SuccessJson(
          json = CheckoutCodecs.getCheckoutSessionsSessionResponseCodecAlternative0Registry.select(listOf("GetCheckoutSessionsSession.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCheckoutSessionsSession.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCheckoutSessionsSessionResponse.DefaultJson(
          json = CheckoutCodecs.getCheckoutSessionsSessionResponseCodecAlternative1Registry.select(listOf("GetCheckoutSessionsSession.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCheckoutSessionsSessionResponse = GetCheckoutSessionsSessionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCheckoutSessionsSessionLineItems`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetCheckoutSessionsSessionLineItemsResponse {
    public class SuccessJson(
      public val json: InlineV1CheckoutSessionsLineItemsGetResponse200JsonXd7b69818,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCheckoutSessionsSessionLineItemsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCheckoutSessionsSessionLineItemsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCheckoutSessionsSessionLineItemsResponse
  }

  private object GetCheckoutSessionsSessionLineItemsResponseDecoder : SdkResponseAlternativeDecoder<GetCheckoutSessionsSessionLineItemsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCheckoutSessionsSessionLineItemsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCheckoutSessionsSessionLineItemsResponse> = when {
      alternative.id == "GetCheckoutSessionsSessionLineItems.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCheckoutSessionsSessionLineItemsResponse.SuccessJson(
          json = CheckoutCodecs.getCheckoutSessionsSessionLineItemsResponseCodecAlternative0Registry.select(listOf("GetCheckoutSessionsSessionLineItems.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCheckoutSessionsSessionLineItems.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCheckoutSessionsSessionLineItemsResponse.DefaultJson(
          json = CheckoutCodecs.getCheckoutSessionsSessionLineItemsResponseCodecAlternative1Registry.select(listOf("GetCheckoutSessionsSessionLineItems.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCheckoutSessionsSessionLineItemsResponse = GetCheckoutSessionsSessionLineItemsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCheckoutSessionsSession`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostCheckoutSessionsSessionResponse {
    public class SuccessJson(
      public val json: CheckoutSession,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCheckoutSessionsSessionResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCheckoutSessionsSessionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCheckoutSessionsSessionResponse
  }

  private object PostCheckoutSessionsSessionResponseDecoder : SdkResponseAlternativeDecoder<PostCheckoutSessionsSessionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCheckoutSessionsSessionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCheckoutSessionsSessionResponse> = when {
      alternative.id == "PostCheckoutSessionsSession.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCheckoutSessionsSessionResponse.SuccessJson(
          json = CheckoutCodecs.postCheckoutSessionsSessionResponseCodecAlternative0Registry.select(listOf("PostCheckoutSessionsSession.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCheckoutSessionsSession.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCheckoutSessionsSessionResponse.DefaultJson(
          json = CheckoutCodecs.postCheckoutSessionsSessionResponseCodecAlternative1Registry.select(listOf("PostCheckoutSessionsSession.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCheckoutSessionsSessionResponse = PostCheckoutSessionsSessionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCheckoutSessionsSessionExpire`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostCheckoutSessionsSessionExpireResponse {
    public class SuccessJson(
      public val json: CheckoutSession,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCheckoutSessionsSessionExpireResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCheckoutSessionsSessionExpireResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCheckoutSessionsSessionExpireResponse
  }

  private object PostCheckoutSessionsSessionExpireResponseDecoder : SdkResponseAlternativeDecoder<PostCheckoutSessionsSessionExpireResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCheckoutSessionsSessionExpireResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCheckoutSessionsSessionExpireResponse> = when {
      alternative.id == "PostCheckoutSessionsSessionExpire.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCheckoutSessionsSessionExpireResponse.SuccessJson(
          json = CheckoutCodecs.postCheckoutSessionsSessionExpireResponseCodecAlternative0Registry.select(listOf("PostCheckoutSessionsSessionExpire.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCheckoutSessionsSessionExpire.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCheckoutSessionsSessionExpireResponse.DefaultJson(
          json = CheckoutCodecs.postCheckoutSessionsSessionExpireResponseCodecAlternative1Registry.select(listOf("PostCheckoutSessionsSessionExpire.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCheckoutSessionsSessionExpireResponse = PostCheckoutSessionsSessionExpireResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getCheckoutSessionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCheckoutSessions",
          method = "GET",
          path = "/v1/checkout/sessions",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CheckoutSessionsGetResponse200JsonXfa41aef8",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCheckoutSessions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCheckoutSessions.response.alternative1",
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

    internal val getCheckoutSessionsSessionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCheckoutSessionsSession",
          method = "GET",
          path = "/v1/checkout/sessions/{session}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CheckoutSession",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCheckoutSessionsSession.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCheckoutSessionsSession.response.alternative1",
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

    internal val getCheckoutSessionsSessionLineItemsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCheckoutSessionsSessionLineItems",
          method = "GET",
          path = "/v1/checkout/sessions/{session}/line_items",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CheckoutSessionsLineItemsGetResponse200JsonXd7b69818",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCheckoutSessionsSessionLineItems.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCheckoutSessionsSessionLineItems.response.alternative1",
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

    internal val postCheckoutSessionsSessionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCheckoutSessionsSession",
          method = "POST",
          path = "/v1/checkout/sessions/{session}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CheckoutSession",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCheckoutSessionsSession.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCheckoutSessionsSession.response.alternative1",
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

    internal val postCheckoutSessionsSessionExpireMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCheckoutSessionsSessionExpire",
          method = "POST",
          path = "/v1/checkout/sessions/{session}/expire",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CheckoutSession",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCheckoutSessionsSessionExpire.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCheckoutSessionsSessionExpire.response.alternative1",
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
