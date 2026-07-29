package com.nabobery.sdkgen.generated.stripe.subscriptionitems

import com.nabobery.sdkgen.generated.stripe.DeletedSubscriptionItem
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionItemsGetResponse200JsonX9e671aca
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionItemsPostRequestFormX6e71422d
import com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionItemsPostRequestFormXa277f4ec
import com.nabobery.sdkgen.generated.stripe.SdkJson
import com.nabobery.sdkgen.generated.stripe.SubscriptionItem
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

public object SubscriptionItemsCodecs {
  public const val DELETESUBSCRIPTIONITEMSITEM_REQUEST_CODEC_ID: String =
      "DeleteSubscriptionItemsItem.request"

  private val deleteSubscriptionItemsItemRequestCodec:
      MediaTypeCodec<InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc?> =
      DeleteSubscriptionItemsItemFormCodec

  private val deleteSubscriptionItemsItemResponseCodecAlternative0Codec:
      MediaTypeCodec<DeletedSubscriptionItem> =
      KotlinxSerializationCodec("DeleteSubscriptionItemsItem.response.alternative0", DeletedSubscriptionItem.Serializer, SdkJson)

  public val deleteSubscriptionItemsItemResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedSubscriptionItem> =
      MediaTypeCodecRegistry.of(deleteSubscriptionItemsItemResponseCodecAlternative0Codec)

  private val deleteSubscriptionItemsItemResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteSubscriptionItemsItem.response.alternative1", Error.Serializer, SdkJson)

  public val deleteSubscriptionItemsItemResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteSubscriptionItemsItemResponseCodecAlternative1Codec)

  public val deleteSubscriptionItemsItemRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc?> =
      MediaTypeCodecRegistry.of(deleteSubscriptionItemsItemRequestCodec)

  public const val GETSUBSCRIPTIONITEMS_REQUEST_CODEC_ID: String = "GetSubscriptionItems.request"

  private val getSubscriptionItemsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetSubscriptionItemsFormCodec

  private val getSubscriptionItemsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1SubscriptionItemsGetResponse200JsonX9e671aca> =
      KotlinxSerializationCodec("GetSubscriptionItems.response.alternative0", InlineV1SubscriptionItemsGetResponse200JsonX9e671aca.Serializer, SdkJson)

  public val getSubscriptionItemsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1SubscriptionItemsGetResponse200JsonX9e671aca> =
      MediaTypeCodecRegistry.of(getSubscriptionItemsResponseCodecAlternative0Codec)

  private val getSubscriptionItemsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetSubscriptionItems.response.alternative1", Error.Serializer, SdkJson)

  public val getSubscriptionItemsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getSubscriptionItemsResponseCodecAlternative1Codec)

  public val getSubscriptionItemsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getSubscriptionItemsRequestCodec)

  public const val GETSUBSCRIPTIONITEMSITEM_REQUEST_CODEC_ID: String =
      "GetSubscriptionItemsItem.request"

  private val getSubscriptionItemsItemRequestCodec: MediaTypeCodec<JsonObject?> =
      GetSubscriptionItemsItemFormCodec

  private val getSubscriptionItemsItemResponseCodecAlternative0Codec:
      MediaTypeCodec<SubscriptionItem> =
      KotlinxSerializationCodec("GetSubscriptionItemsItem.response.alternative0", SubscriptionItem.Serializer, SdkJson)

  public val getSubscriptionItemsItemResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SubscriptionItem> =
      MediaTypeCodecRegistry.of(getSubscriptionItemsItemResponseCodecAlternative0Codec)

  private val getSubscriptionItemsItemResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetSubscriptionItemsItem.response.alternative1", Error.Serializer, SdkJson)

  public val getSubscriptionItemsItemResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getSubscriptionItemsItemResponseCodecAlternative1Codec)

  public val getSubscriptionItemsItemRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getSubscriptionItemsItemRequestCodec)

  public const val POSTSUBSCRIPTIONITEMS_REQUEST_CODEC_ID: String = "PostSubscriptionItems.request"

  private val postSubscriptionItemsRequestCodec:
      MediaTypeCodec<InlineV1SubscriptionItemsPostRequestFormXa277f4ec> =
      PostSubscriptionItemsFormCodec

  private val postSubscriptionItemsResponseCodecAlternative0Codec: MediaTypeCodec<SubscriptionItem>
      =
      KotlinxSerializationCodec("PostSubscriptionItems.response.alternative0", SubscriptionItem.Serializer, SdkJson)

  public val postSubscriptionItemsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SubscriptionItem> =
      MediaTypeCodecRegistry.of(postSubscriptionItemsResponseCodecAlternative0Codec)

  private val postSubscriptionItemsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostSubscriptionItems.response.alternative1", Error.Serializer, SdkJson)

  public val postSubscriptionItemsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postSubscriptionItemsResponseCodecAlternative1Codec)

  public val postSubscriptionItemsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1SubscriptionItemsPostRequestFormXa277f4ec> =
      MediaTypeCodecRegistry.of(postSubscriptionItemsRequestCodec)

  public const val POSTSUBSCRIPTIONITEMSITEM_REQUEST_CODEC_ID: String =
      "PostSubscriptionItemsItem.request"

  private val postSubscriptionItemsItemRequestCodec:
      MediaTypeCodec<InlineV1SubscriptionItemsPostRequestFormX6e71422d?> =
      PostSubscriptionItemsItemFormCodec

  private val postSubscriptionItemsItemResponseCodecAlternative0Codec:
      MediaTypeCodec<SubscriptionItem> =
      KotlinxSerializationCodec("PostSubscriptionItemsItem.response.alternative0", SubscriptionItem.Serializer, SdkJson)

  public val postSubscriptionItemsItemResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SubscriptionItem> =
      MediaTypeCodecRegistry.of(postSubscriptionItemsItemResponseCodecAlternative0Codec)

  private val postSubscriptionItemsItemResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostSubscriptionItemsItem.response.alternative1", Error.Serializer, SdkJson)

  public val postSubscriptionItemsItemResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postSubscriptionItemsItemResponseCodecAlternative1Codec)

  public val postSubscriptionItemsItemRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1SubscriptionItemsPostRequestFormX6e71422d?> =
      MediaTypeCodecRegistry.of(postSubscriptionItemsItemRequestCodec)

  public object DeleteSubscriptionItemsItemFormCodec : MediaTypeCodec<InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc?> {
    override val id: String = "DeleteSubscriptionItemsItem.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.clearUsage?.let { formValue0 ->
        form.add("clear_usage", formValue0.toString())
      }
      request.paymentBehavior?.let { formValue0 ->
        form.add("payment_behavior", formValue0.value)
      }
      request.prorationBehavior?.let { formValue0 ->
        form.add("proration_behavior", formValue0.value)
      }
      request.prorationDate?.let { formValue0 ->
        form.add("proration_date", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object GetSubscriptionItemsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetSubscriptionItems.request"

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

  public object GetSubscriptionItemsItemFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetSubscriptionItemsItem.request"

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

  public object PostSubscriptionItemsFormCodec : MediaTypeCodec<InlineV1SubscriptionItemsPostRequestFormXa277f4ec> {
    override val id: String = "PostSubscriptionItems.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1SubscriptionItemsPostRequestFormXa277f4ec, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.billingThresholds?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.inlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X21cb3a93 != null -> {
            form.add("billing_thresholds" + "[usage_gte]", requireNotNull(formValue0.inlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X21cb3a93).usageGte.toString())
          }
          formValue0.inlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X9ff01178 != null -> {
            form.add("billing_thresholds", requireNotNull(formValue0.inlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X9ff01178).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.discounts?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            if (requireNotNull(formValue0.branch1).isEmpty()) {
              form.add("discounts", "")
            } else {
              requireNotNull(formValue0.branch1).forEachIndexed { formIndex2, formElement2 ->
                formElement2.coupon?.let { formValue4 ->
                  form.add("discounts" + "[" + formIndex2 + "]" + "[coupon]", formValue4)
                }
                formElement2.discount?.let { formValue4 ->
                  form.add("discounts" + "[" + formIndex2 + "]" + "[discount]", formValue4)
                }
                formElement2.promotionCode?.let { formValue4 ->
                  form.add("discounts" + "[" + formIndex2 + "]" + "[promotion_code]", formValue4)
                }
              }
            }
          }
          formValue0.inlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa != null -> {
            form.add("discounts", requireNotNull(formValue0.inlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa).value)
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
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      request.paymentBehavior?.let { formValue0 ->
        form.add("payment_behavior", formValue0.value)
      }
      request.price?.let { formValue0 ->
        form.add("price", formValue0)
      }
      request.priceData?.let { formValue0 ->
        form.add("price_data" + "[currency]", formValue0.currency)
        form.add("price_data" + "[product]", formValue0.product)
        form.add("price_data" + "[recurring]" + "[interval]", formValue0.recurring.interval.value)
        formValue0.recurring.intervalCount?.let { formValue3 ->
          form.add("price_data" + "[recurring]" + "[interval_count]", formValue3.toString())
        }
        formValue0.taxBehavior?.let { formValue2 ->
          form.add("price_data" + "[tax_behavior]", formValue2.value)
        }
        formValue0.unitAmount?.let { formValue2 ->
          form.add("price_data" + "[unit_amount]", formValue2.toString())
        }
        formValue0.unitAmountDecimal?.let { formValue2 ->
          form.add("price_data" + "[unit_amount_decimal]", formValue2)
        }
      }
      request.prorationBehavior?.let { formValue0 ->
        form.add("proration_behavior", formValue0.value)
      }
      request.prorationDate?.let { formValue0 ->
        form.add("proration_date", formValue0.toString())
      }
      request.quantity?.let { formValue0 ->
        form.add("quantity", formValue0.toString())
      }
      form.add("subscription", request.subscription)
      request.taxRates?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            if (requireNotNull(formValue0.branch1).isEmpty()) {
              form.add("tax_rates", "")
            } else {
              requireNotNull(formValue0.branch1).forEachIndexed { formIndex2, formElement2 ->
                form.add("tax_rates" + "[" + formIndex2 + "]", formElement2)
              }
            }
          }
          formValue0.inlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X559eeda9 != null -> {
            form.add("tax_rates", requireNotNull(formValue0.inlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X559eeda9).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1SubscriptionItemsPostRequestFormXa277f4ec {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostSubscriptionItemsItemFormCodec : MediaTypeCodec<InlineV1SubscriptionItemsPostRequestFormX6e71422d?> {
    override val id: String = "PostSubscriptionItemsItem.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1SubscriptionItemsPostRequestFormX6e71422d?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.billingThresholds?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.inlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0 != null -> {
            form.add("billing_thresholds" + "[usage_gte]", requireNotNull(formValue0.inlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf1X42422db0).usageGte.toString())
          }
          formValue0.inlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X5210fc5d != null -> {
            form.add("billing_thresholds", requireNotNull(formValue0.inlineV1SubscriptionItemsPostRequestFormBillingThresholdsAnyOf2X5210fc5d).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.discounts?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            if (requireNotNull(formValue0.branch1).isEmpty()) {
              form.add("discounts", "")
            } else {
              requireNotNull(formValue0.branch1).forEachIndexed { formIndex2, formElement2 ->
                formElement2.coupon?.let { formValue4 ->
                  form.add("discounts" + "[" + formIndex2 + "]" + "[coupon]", formValue4)
                }
                formElement2.discount?.let { formValue4 ->
                  form.add("discounts" + "[" + formIndex2 + "]" + "[discount]", formValue4)
                }
                formElement2.promotionCode?.let { formValue4 ->
                  form.add("discounts" + "[" + formIndex2 + "]" + "[promotion_code]", formValue4)
                }
              }
            }
          }
          formValue0.inlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2X22712e97 != null -> {
            form.add("discounts", requireNotNull(formValue0.inlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2X22712e97).value)
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
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1SubscriptionItemsPostRequestFormMetadataAnyOf2Xd717b993 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1SubscriptionItemsPostRequestFormMetadataAnyOf2Xd717b993).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.offSession?.let { formValue0 ->
        form.add("off_session", formValue0.toString())
      }
      request.paymentBehavior?.let { formValue0 ->
        form.add("payment_behavior", formValue0.value)
      }
      request.price?.let { formValue0 ->
        form.add("price", formValue0)
      }
      request.priceData?.let { formValue0 ->
        form.add("price_data" + "[currency]", formValue0.currency)
        form.add("price_data" + "[product]", formValue0.product)
        form.add("price_data" + "[recurring]" + "[interval]", formValue0.recurring.interval.value)
        formValue0.recurring.intervalCount?.let { formValue3 ->
          form.add("price_data" + "[recurring]" + "[interval_count]", formValue3.toString())
        }
        formValue0.taxBehavior?.let { formValue2 ->
          form.add("price_data" + "[tax_behavior]", formValue2.value)
        }
        formValue0.unitAmount?.let { formValue2 ->
          form.add("price_data" + "[unit_amount]", formValue2.toString())
        }
        formValue0.unitAmountDecimal?.let { formValue2 ->
          form.add("price_data" + "[unit_amount_decimal]", formValue2)
        }
      }
      request.prorationBehavior?.let { formValue0 ->
        form.add("proration_behavior", formValue0.value)
      }
      request.prorationDate?.let { formValue0 ->
        form.add("proration_date", formValue0.toString())
      }
      request.quantity?.let { formValue0 ->
        form.add("quantity", formValue0.toString())
      }
      request.taxRates?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            if (requireNotNull(formValue0.branch1).isEmpty()) {
              form.add("tax_rates", "")
            } else {
              requireNotNull(formValue0.branch1).forEachIndexed { formIndex2, formElement2 ->
                form.add("tax_rates" + "[" + formIndex2 + "]", formElement2)
              }
            }
          }
          formValue0.inlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2 != null -> {
            form.add("tax_rates", requireNotNull(formValue0.inlineV1SubscriptionItemsPostRequestFormTaxRatesAnyOf2X5c32fea2).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1SubscriptionItemsPostRequestFormX6e71422d? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'subscription_items' group of Stripe API.
 */
public class SubscriptionItemsClient(
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
      SdkExecutor(transport, authentication = this@SubscriptionItemsClient.authentication)

  /**
   * <p>Deletes an item from the subscription. Removing a subscription item from a subscription will not cancel the
   * subscription.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param item Wire parameter `item`.
   * @param options Execution options.
   */
  public suspend fun deleteSubscriptionItemsItemWithResponse(
    request: InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc? = null,
    item: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteSubscriptionItemsItemResponse> = executor.executeWithResponse<InlineV1SubscriptionItemsDeleteRequestFormX4fa3c3bc?, DeleteSubscriptionItemsItemResponse>(SdkExecutionRequest(deleteSubscriptionItemsItemMetadata, baseUri, request, listOf(SubscriptionItemsCodecs.DELETESUBSCRIPTIONITEMSITEM_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "item", values = listOf(item.toString())))
  }), SubscriptionItemsCodecs.deleteSubscriptionItemsItemRequestCodecRegistry, DeleteSubscriptionItemsItemResponseDecoder, options)

  /**
   * <p>Returns a list of your subscription items for a given subscription.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param subscription The ID of the subscription whose items will be retrieved.
   * @param options Execution options.
   */
  public suspend fun getSubscriptionItemsWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    subscription: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetSubscriptionItemsResponse> = executor.executeWithResponse<JsonObject?, GetSubscriptionItemsResponse>(SdkExecutionRequest(getSubscriptionItemsMetadata, baseUri, request, listOf(SubscriptionItemsCodecs.GETSUBSCRIPTIONITEMS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "subscription", values = listOf(subscription.toString())))
  }), SubscriptionItemsCodecs.getSubscriptionItemsRequestCodecRegistry, GetSubscriptionItemsResponseDecoder, options)

  /**
   * <p>Retrieves the subscription item with the given ID.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param item Wire parameter `item`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getSubscriptionItemsItemWithResponse(
    request: JsonObject? = null,
    item: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetSubscriptionItemsItemResponse> = executor.executeWithResponse<JsonObject?, GetSubscriptionItemsItemResponse>(SdkExecutionRequest(getSubscriptionItemsItemMetadata, baseUri, request, listOf(SubscriptionItemsCodecs.GETSUBSCRIPTIONITEMSITEM_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "item", values = listOf(item.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), SubscriptionItemsCodecs.getSubscriptionItemsItemRequestCodecRegistry, GetSubscriptionItemsItemResponseDecoder, options)

  /**
   * <p>Adds a new item to an existing subscription. No existing items will be changed or replaced.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postSubscriptionItemsWithResponse(request: InlineV1SubscriptionItemsPostRequestFormXa277f4ec, options: CallOptions = CallOptions()): SdkResponseResult<PostSubscriptionItemsResponse> = executor.executeWithResponse<InlineV1SubscriptionItemsPostRequestFormXa277f4ec, PostSubscriptionItemsResponse>(SdkExecutionRequest(postSubscriptionItemsMetadata, baseUri, request, listOf(SubscriptionItemsCodecs.POSTSUBSCRIPTIONITEMS_REQUEST_CODEC_ID), emptyList()), SubscriptionItemsCodecs.postSubscriptionItemsRequestCodecRegistry, PostSubscriptionItemsResponseDecoder, options)

  /**
   * <p>Updates the plan or quantity of an item on a current subscription.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param item Wire parameter `item`.
   * @param options Execution options.
   */
  public suspend fun postSubscriptionItemsItemWithResponse(
    request: InlineV1SubscriptionItemsPostRequestFormX6e71422d? = null,
    item: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostSubscriptionItemsItemResponse> = executor.executeWithResponse<InlineV1SubscriptionItemsPostRequestFormX6e71422d?, PostSubscriptionItemsItemResponse>(SdkExecutionRequest(postSubscriptionItemsItemMetadata, baseUri, request, listOf(SubscriptionItemsCodecs.POSTSUBSCRIPTIONITEMSITEM_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "item", values = listOf(item.toString())))
  }), SubscriptionItemsCodecs.postSubscriptionItemsItemRequestCodecRegistry, PostSubscriptionItemsItemResponseDecoder, options)

  /**
   * Typed response alternatives for `DeleteSubscriptionItemsItem`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DeleteSubscriptionItemsItemResponse {
    public class SuccessJson(
      public val json: DeletedSubscriptionItem,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteSubscriptionItemsItemResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteSubscriptionItemsItemResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteSubscriptionItemsItemResponse
  }

  private object DeleteSubscriptionItemsItemResponseDecoder : SdkResponseAlternativeDecoder<DeleteSubscriptionItemsItemResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteSubscriptionItemsItemResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteSubscriptionItemsItemResponse> = when {
      alternative.id == "DeleteSubscriptionItemsItem.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteSubscriptionItemsItemResponse.SuccessJson(
          json = SubscriptionItemsCodecs.deleteSubscriptionItemsItemResponseCodecAlternative0Registry.select(listOf("DeleteSubscriptionItemsItem.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteSubscriptionItemsItem.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteSubscriptionItemsItemResponse.DefaultJson(
          json = SubscriptionItemsCodecs.deleteSubscriptionItemsItemResponseCodecAlternative1Registry.select(listOf("DeleteSubscriptionItemsItem.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteSubscriptionItemsItemResponse = DeleteSubscriptionItemsItemResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetSubscriptionItems`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetSubscriptionItemsResponse {
    public class SuccessJson(
      public val json: InlineV1SubscriptionItemsGetResponse200JsonX9e671aca,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionItemsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionItemsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionItemsResponse
  }

  private object GetSubscriptionItemsResponseDecoder : SdkResponseAlternativeDecoder<GetSubscriptionItemsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetSubscriptionItemsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetSubscriptionItemsResponse> = when {
      alternative.id == "GetSubscriptionItems.response.alternative0" -> SdkResponseDecodeResult(
        value = GetSubscriptionItemsResponse.SuccessJson(
          json = SubscriptionItemsCodecs.getSubscriptionItemsResponseCodecAlternative0Registry.select(listOf("GetSubscriptionItems.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetSubscriptionItems.response.alternative1" -> SdkResponseDecodeResult(
        value = GetSubscriptionItemsResponse.DefaultJson(
          json = SubscriptionItemsCodecs.getSubscriptionItemsResponseCodecAlternative1Registry.select(listOf("GetSubscriptionItems.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetSubscriptionItemsResponse = GetSubscriptionItemsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetSubscriptionItemsItem`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetSubscriptionItemsItemResponse {
    public class SuccessJson(
      public val json: SubscriptionItem,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionItemsItemResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionItemsItemResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSubscriptionItemsItemResponse
  }

  private object GetSubscriptionItemsItemResponseDecoder : SdkResponseAlternativeDecoder<GetSubscriptionItemsItemResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetSubscriptionItemsItemResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetSubscriptionItemsItemResponse> = when {
      alternative.id == "GetSubscriptionItemsItem.response.alternative0" -> SdkResponseDecodeResult(
        value = GetSubscriptionItemsItemResponse.SuccessJson(
          json = SubscriptionItemsCodecs.getSubscriptionItemsItemResponseCodecAlternative0Registry.select(listOf("GetSubscriptionItemsItem.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetSubscriptionItemsItem.response.alternative1" -> SdkResponseDecodeResult(
        value = GetSubscriptionItemsItemResponse.DefaultJson(
          json = SubscriptionItemsCodecs.getSubscriptionItemsItemResponseCodecAlternative1Registry.select(listOf("GetSubscriptionItemsItem.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetSubscriptionItemsItemResponse = GetSubscriptionItemsItemResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostSubscriptionItems`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostSubscriptionItemsResponse {
    public class SuccessJson(
      public val json: SubscriptionItem,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSubscriptionItemsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSubscriptionItemsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSubscriptionItemsResponse
  }

  private object PostSubscriptionItemsResponseDecoder : SdkResponseAlternativeDecoder<PostSubscriptionItemsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostSubscriptionItemsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostSubscriptionItemsResponse> = when {
      alternative.id == "PostSubscriptionItems.response.alternative0" -> SdkResponseDecodeResult(
        value = PostSubscriptionItemsResponse.SuccessJson(
          json = SubscriptionItemsCodecs.postSubscriptionItemsResponseCodecAlternative0Registry.select(listOf("PostSubscriptionItems.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostSubscriptionItems.response.alternative1" -> SdkResponseDecodeResult(
        value = PostSubscriptionItemsResponse.DefaultJson(
          json = SubscriptionItemsCodecs.postSubscriptionItemsResponseCodecAlternative1Registry.select(listOf("PostSubscriptionItems.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostSubscriptionItemsResponse = PostSubscriptionItemsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostSubscriptionItemsItem`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostSubscriptionItemsItemResponse {
    public class SuccessJson(
      public val json: SubscriptionItem,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSubscriptionItemsItemResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSubscriptionItemsItemResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSubscriptionItemsItemResponse
  }

  private object PostSubscriptionItemsItemResponseDecoder : SdkResponseAlternativeDecoder<PostSubscriptionItemsItemResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostSubscriptionItemsItemResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostSubscriptionItemsItemResponse> = when {
      alternative.id == "PostSubscriptionItemsItem.response.alternative0" -> SdkResponseDecodeResult(
        value = PostSubscriptionItemsItemResponse.SuccessJson(
          json = SubscriptionItemsCodecs.postSubscriptionItemsItemResponseCodecAlternative0Registry.select(listOf("PostSubscriptionItemsItem.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostSubscriptionItemsItem.response.alternative1" -> SdkResponseDecodeResult(
        value = PostSubscriptionItemsItemResponse.DefaultJson(
          json = SubscriptionItemsCodecs.postSubscriptionItemsItemResponseCodecAlternative1Registry.select(listOf("PostSubscriptionItemsItem.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostSubscriptionItemsItemResponse = PostSubscriptionItemsItemResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val deleteSubscriptionItemsItemMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteSubscriptionItemsItem",
          method = "DELETE",
          path = "/v1/subscription_items/{item}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedSubscriptionItem",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteSubscriptionItemsItem.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteSubscriptionItemsItem.response.alternative1",
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

    public val getSubscriptionItemsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetSubscriptionItems",
          method = "GET",
          path = "/v1/subscription_items",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1SubscriptionItemsGetResponse200JsonX9e671aca",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSubscriptionItems.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSubscriptionItems.response.alternative1",
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

    public val getSubscriptionItemsItemMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetSubscriptionItemsItem",
          method = "GET",
          path = "/v1/subscription_items/{item}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SubscriptionItem",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSubscriptionItemsItem.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSubscriptionItemsItem.response.alternative1",
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

    public val postSubscriptionItemsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostSubscriptionItems",
          method = "POST",
          path = "/v1/subscription_items",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SubscriptionItem",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSubscriptionItems.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSubscriptionItems.response.alternative1",
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

    public val postSubscriptionItemsItemMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostSubscriptionItemsItem",
          method = "POST",
          path = "/v1/subscription_items/{item}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SubscriptionItem",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSubscriptionItemsItem.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSubscriptionItemsItem.response.alternative1",
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
