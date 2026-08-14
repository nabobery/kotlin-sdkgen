package io.github.nabobery.sdkgen.generated.stripe.paymentlinks

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
import io.github.nabobery.sdkgen.generated.stripe.Error
import io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksGetResponse200JsonX148bd83a
import io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksLineItemsGetResponse200JsonXec9e7af3
import io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormXa7410106
import io.github.nabobery.sdkgen.generated.stripe.PaymentLink
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object PaymentLinksCodecs {
  internal const val GETPAYMENTLINKS_REQUEST_CODEC_ID: String = "GetPaymentLinks.request"

  private val getPaymentLinksRequestCodec: MediaTypeCodec<JsonObject?> = GetPaymentLinksFormCodec

  private val getPaymentLinksResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1PaymentLinksGetResponse200JsonX148bd83a> =
      KotlinxSerializationCodec("GetPaymentLinks.response.alternative0", InlineV1PaymentLinksGetResponse200JsonX148bd83a.Serializer, SdkJson)

  internal val getPaymentLinksResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1PaymentLinksGetResponse200JsonX148bd83a> =
      MediaTypeCodecRegistry.of(getPaymentLinksResponseCodecAlternative0Codec)

  private val getPaymentLinksResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPaymentLinks.response.alternative1", Error.Serializer, SdkJson)

  internal val getPaymentLinksResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPaymentLinksResponseCodecAlternative1Codec)

  internal val getPaymentLinksRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPaymentLinksRequestCodec)

  internal const val GETPAYMENTLINKSPAYMENTLINK_REQUEST_CODEC_ID: String =
      "GetPaymentLinksPaymentLink.request"

  private val getPaymentLinksPaymentLinkRequestCodec: MediaTypeCodec<JsonObject?> =
      GetPaymentLinksPaymentLinkFormCodec

  private val getPaymentLinksPaymentLinkResponseCodecAlternative0Codec: MediaTypeCodec<PaymentLink>
      =
      KotlinxSerializationCodec("GetPaymentLinksPaymentLink.response.alternative0", PaymentLink.Serializer, SdkJson)

  internal val getPaymentLinksPaymentLinkResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentLink> =
      MediaTypeCodecRegistry.of(getPaymentLinksPaymentLinkResponseCodecAlternative0Codec)

  private val getPaymentLinksPaymentLinkResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPaymentLinksPaymentLink.response.alternative1", Error.Serializer, SdkJson)

  internal val getPaymentLinksPaymentLinkResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPaymentLinksPaymentLinkResponseCodecAlternative1Codec)

  internal val getPaymentLinksPaymentLinkRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPaymentLinksPaymentLinkRequestCodec)

  internal const val GETPAYMENTLINKSPAYMENTLINKLINEITEMS_REQUEST_CODEC_ID: String =
      "GetPaymentLinksPaymentLinkLineItems.request"

  private val getPaymentLinksPaymentLinkLineItemsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetPaymentLinksPaymentLinkLineItemsFormCodec

  private val getPaymentLinksPaymentLinkLineItemsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1PaymentLinksLineItemsGetResponse200JsonXec9e7af3> =
      KotlinxSerializationCodec("GetPaymentLinksPaymentLinkLineItems.response.alternative0", InlineV1PaymentLinksLineItemsGetResponse200JsonXec9e7af3.Serializer, SdkJson)

  internal val getPaymentLinksPaymentLinkLineItemsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1PaymentLinksLineItemsGetResponse200JsonXec9e7af3> =
      MediaTypeCodecRegistry.of(getPaymentLinksPaymentLinkLineItemsResponseCodecAlternative0Codec)

  private val getPaymentLinksPaymentLinkLineItemsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPaymentLinksPaymentLinkLineItems.response.alternative1", Error.Serializer, SdkJson)

  internal val getPaymentLinksPaymentLinkLineItemsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPaymentLinksPaymentLinkLineItemsResponseCodecAlternative1Codec)

  internal val getPaymentLinksPaymentLinkLineItemsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPaymentLinksPaymentLinkLineItemsRequestCodec)

  internal const val POSTPAYMENTLINKS_REQUEST_CODEC_ID: String = "PostPaymentLinks.request"

  private val postPaymentLinksRequestCodec:
      MediaTypeCodec<InlineV1PaymentLinksPostRequestFormXa7410106> = PostPaymentLinksFormCodec

  private val postPaymentLinksResponseCodecAlternative0Codec: MediaTypeCodec<PaymentLink> =
      KotlinxSerializationCodec("PostPaymentLinks.response.alternative0", PaymentLink.Serializer, SdkJson)

  internal val postPaymentLinksResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentLink> =
      MediaTypeCodecRegistry.of(postPaymentLinksResponseCodecAlternative0Codec)

  private val postPaymentLinksResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPaymentLinks.response.alternative1", Error.Serializer, SdkJson)

  internal val postPaymentLinksResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPaymentLinksResponseCodecAlternative1Codec)

  internal val postPaymentLinksRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PaymentLinksPostRequestFormXa7410106> =
      MediaTypeCodecRegistry.of(postPaymentLinksRequestCodec)

  internal object GetPaymentLinksFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPaymentLinks.request"

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

  internal object GetPaymentLinksPaymentLinkFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPaymentLinksPaymentLink.request"

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

  internal object GetPaymentLinksPaymentLinkLineItemsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPaymentLinksPaymentLinkLineItems.request"

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

  internal object PostPaymentLinksFormCodec : MediaTypeCodec<InlineV1PaymentLinksPostRequestFormXa7410106> {
    override val id: String = "PostPaymentLinks.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PaymentLinksPostRequestFormXa7410106, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.afterCompletion?.let { formValue0 ->
        formValue0.hostedConfirmation?.let { formValue2 ->
          formValue2.customMessage?.let { formValue4 ->
            form.add("after_completion" + "[hosted_confirmation]" + "[custom_message]", formValue4)
          }
        }
        formValue0.redirect?.let { formValue2 ->
          form.add("after_completion" + "[redirect]" + "[url]", formValue2.url)
        }
        form.add("after_completion" + "[type]", formValue0.type.value)
      }
      request.allowPromotionCodes?.let { formValue0 ->
        form.add("allow_promotion_codes", formValue0.toString())
      }
      request.applicationFeeAmount?.let { formValue0 ->
        form.add("application_fee_amount", formValue0.toString())
      }
      request.applicationFeePercent?.let { formValue0 ->
        form.add("application_fee_percent", formValue0)
      }
      request.automaticTax?.let { formValue0 ->
        form.add("automatic_tax" + "[enabled]", formValue0.enabled.toString())
        formValue0.liability?.let { formValue2 ->
          formValue2.account?.let { formValue4 ->
            form.add("automatic_tax" + "[liability]" + "[account]", formValue4)
          }
          form.add("automatic_tax" + "[liability]" + "[type]", formValue2.type.value)
        }
      }
      request.billingAddressCollection?.let { formValue0 ->
        form.add("billing_address_collection", formValue0.value)
      }
      request.consentCollection?.let { formValue0 ->
        formValue0.paymentMethodReuseAgreement?.let { formValue2 ->
          form.add("consent_collection" + "[payment_method_reuse_agreement]" + "[position]", formValue2.position.value)
        }
        formValue0.promotions?.let { formValue2 ->
          form.add("consent_collection" + "[promotions]", formValue2.value)
        }
        formValue0.termsOfService?.let { formValue2 ->
          form.add("consent_collection" + "[terms_of_service]", formValue2.value)
        }
      }
      request.currency?.let { formValue0 ->
        form.add("currency", formValue0)
      }
      request.customFields?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("custom_fields", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            formElement1.dropdown?.let { formValue3 ->
              formValue3.defaultValue?.let { formValue5 ->
                form.add("custom_fields" + "[" + formIndex1 + "]" + "[dropdown]" + "[default_value]", formValue5)
              }
              if (formValue3.options.isEmpty()) {
                form.add("custom_fields" + "[" + formIndex1 + "]" + "[dropdown]" + "[options]", "")
              } else {
                formValue3.options.forEachIndexed { formIndex5, formElement5 ->
                  form.add("custom_fields" + "[" + formIndex1 + "]" + "[dropdown]" + "[options]" + "[" + formIndex5 + "]" + "[label]", formElement5.label)
                  form.add("custom_fields" + "[" + formIndex1 + "]" + "[dropdown]" + "[options]" + "[" + formIndex5 + "]" + "[value]", formElement5.value)
                }
              }
            }
            form.add("custom_fields" + "[" + formIndex1 + "]" + "[key]", formElement1.key)
            form.add("custom_fields" + "[" + formIndex1 + "]" + "[label]" + "[custom]", formElement1.label.custom)
            form.add("custom_fields" + "[" + formIndex1 + "]" + "[label]" + "[type]", formElement1.label.type.value)
            formElement1.numeric?.let { formValue3 ->
              formValue3.defaultValue?.let { formValue5 ->
                form.add("custom_fields" + "[" + formIndex1 + "]" + "[numeric]" + "[default_value]", formValue5)
              }
              formValue3.maximumLength?.let { formValue5 ->
                form.add("custom_fields" + "[" + formIndex1 + "]" + "[numeric]" + "[maximum_length]", formValue5.toString())
              }
              formValue3.minimumLength?.let { formValue5 ->
                form.add("custom_fields" + "[" + formIndex1 + "]" + "[numeric]" + "[minimum_length]", formValue5.toString())
              }
            }
            formElement1.optional?.let { formValue3 ->
              form.add("custom_fields" + "[" + formIndex1 + "]" + "[optional]", formValue3.toString())
            }
            formElement1.text?.let { formValue3 ->
              formValue3.defaultValue?.let { formValue5 ->
                form.add("custom_fields" + "[" + formIndex1 + "]" + "[text]" + "[default_value]", formValue5)
              }
              formValue3.maximumLength?.let { formValue5 ->
                form.add("custom_fields" + "[" + formIndex1 + "]" + "[text]" + "[maximum_length]", formValue5.toString())
              }
              formValue3.minimumLength?.let { formValue5 ->
                form.add("custom_fields" + "[" + formIndex1 + "]" + "[text]" + "[minimum_length]", formValue5.toString())
              }
            }
            form.add("custom_fields" + "[" + formIndex1 + "]" + "[type]", formElement1.type.value)
          }
        }
      }
      request.customText?.let { formValue0 ->
        formValue0.afterSubmit?.let { formValue2 ->
          require(formValue2.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
          when {
            formValue2.inlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1Xe7216d73 != null -> {
              form.add("custom_text" + "[after_submit]" + "[message]", requireNotNull(formValue2.inlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1Xe7216d73).message)
            }
            formValue2.inlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2X2fe57b7d != null -> {
              form.add("custom_text" + "[after_submit]", requireNotNull(formValue2.inlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf2X2fe57b7d).value)
            }
            else -> {
              error("Form union value has no selected branch")
            }
          }
        }
        formValue0.shippingAddress?.let { formValue2 ->
          require(formValue2.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
          when {
            formValue2.inlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X708e4e45 != null -> {
              form.add("custom_text" + "[shipping_address]" + "[message]", requireNotNull(formValue2.inlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf1X708e4e45).message)
            }
            formValue2.inlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X32a1510a != null -> {
              form.add("custom_text" + "[shipping_address]", requireNotNull(formValue2.inlineV1PaymentLinksPostRequestFormCustomTextShippingAddressAnyOf2X32a1510a).value)
            }
            else -> {
              error("Form union value has no selected branch")
            }
          }
        }
        formValue0.submit?.let { formValue2 ->
          require(formValue2.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
          when {
            formValue2.inlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf1Xe8dc1b0f != null -> {
              form.add("custom_text" + "[submit]" + "[message]", requireNotNull(formValue2.inlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf1Xe8dc1b0f).message)
            }
            formValue2.inlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a != null -> {
              form.add("custom_text" + "[submit]", requireNotNull(formValue2.inlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a).value)
            }
            else -> {
              error("Form union value has no selected branch")
            }
          }
        }
        formValue0.termsOfServiceAcceptance?.let { formValue2 ->
          require(formValue2.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
          when {
            formValue2.inlineV1PaymentLinksPostRequestFormCustomTextAnyOf1Xadc33c1c != null -> {
              form.add("custom_text" + "[terms_of_service_acceptance]" + "[message]", requireNotNull(formValue2.inlineV1PaymentLinksPostRequestFormCustomTextAnyOf1Xadc33c1c).message)
            }
            formValue2.inlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07 != null -> {
              form.add("custom_text" + "[terms_of_service_acceptance]", requireNotNull(formValue2.inlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07).value)
            }
            else -> {
              error("Form union value has no selected branch")
            }
          }
        }
      }
      request.customerCreation?.let { formValue0 ->
        form.add("customer_creation", formValue0.value)
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
      request.inactiveMessage?.let { formValue0 ->
        form.add("inactive_message", formValue0)
      }
      request.invoiceCreation?.let { formValue0 ->
        form.add("invoice_creation" + "[enabled]", formValue0.enabled.toString())
        formValue0.invoiceData?.let { formValue2 ->
          formValue2.accountTaxIds?.let { formValue4 ->
            require(formValue4.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
            when {
              formValue4.branch1 != null -> {
                if (requireNotNull(formValue4.branch1).isEmpty()) {
                  form.add("invoice_creation" + "[invoice_data]" + "[account_tax_ids]", "")
                } else {
                  requireNotNull(formValue4.branch1).forEachIndexed { formIndex6, formElement6 ->
                    form.add("invoice_creation" + "[invoice_data]" + "[account_tax_ids]" + "[" + formIndex6 + "]", formElement6)
                  }
                }
              }
              formValue4.inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X37122bd4 != null -> {
                form.add("invoice_creation" + "[invoice_data]" + "[account_tax_ids]", requireNotNull(formValue4.inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X37122bd4).value)
              }
              else -> {
                error("Form union value has no selected branch")
              }
            }
          }
          formValue2.customFields?.let { formValue4 ->
            require(formValue4.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
            when {
              formValue4.branch1 != null -> {
                if (requireNotNull(formValue4.branch1).isEmpty()) {
                  form.add("invoice_creation" + "[invoice_data]" + "[custom_fields]", "")
                } else {
                  requireNotNull(formValue4.branch1).forEachIndexed { formIndex6, formElement6 ->
                    form.add("invoice_creation" + "[invoice_data]" + "[custom_fields]" + "[" + formIndex6 + "]" + "[name]", formElement6.name)
                    form.add("invoice_creation" + "[invoice_data]" + "[custom_fields]" + "[" + formIndex6 + "]" + "[value]", formElement6.value)
                  }
                }
              }
              formValue4.inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c != null -> {
                form.add("invoice_creation" + "[invoice_data]" + "[custom_fields]", requireNotNull(formValue4.inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf7c9b11c).value)
              }
              else -> {
                error("Form union value has no selected branch")
              }
            }
          }
          formValue2.description?.let { formValue4 ->
            form.add("invoice_creation" + "[invoice_data]" + "[description]", formValue4)
          }
          formValue2.footer?.let { formValue4 ->
            form.add("invoice_creation" + "[invoice_data]" + "[footer]", formValue4)
          }
          formValue2.issuer?.let { formValue4 ->
            formValue4.account?.let { formValue6 ->
              form.add("invoice_creation" + "[invoice_data]" + "[issuer]" + "[account]", formValue6)
            }
            form.add("invoice_creation" + "[invoice_data]" + "[issuer]" + "[type]", formValue4.type.value)
          }
          formValue2.metadata?.let { formValue4 ->
            require(formValue4.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
            when {
              formValue4.branch1 != null -> {
                requireNotNull(formValue4.branch1).forEach { (formKey6, formMapValue6) ->
                  val formPrimitive6 = formMapValue6 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
                  form.add("invoice_creation" + "[invoice_data]" + "[metadata]" + "[" + formKey6 + "]", formPrimitive6.content)
                }
              }
              formValue4.inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xff06498e != null -> {
                form.add("invoice_creation" + "[invoice_data]" + "[metadata]", requireNotNull(formValue4.inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xff06498e).value)
              }
              else -> {
                error("Form union value has no selected branch")
              }
            }
          }
          formValue2.renderingOptions?.let { formValue4 ->
            require(formValue4.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
            when {
              formValue4.inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e != null -> {
                requireNotNull(formValue4.inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e).amountTaxDisplay?.let { formValue7 ->
                  form.add("invoice_creation" + "[invoice_data]" + "[rendering_options]" + "[amount_tax_display]", formValue7.value)
                }
                requireNotNull(formValue4.inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf1X00e4076e).template?.let { formValue7 ->
                  form.add("invoice_creation" + "[invoice_data]" + "[rendering_options]" + "[template]", formValue7)
                }
              }
              formValue4.inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X38f9814d != null -> {
                form.add("invoice_creation" + "[invoice_data]" + "[rendering_options]", requireNotNull(formValue4.inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X38f9814d).value)
              }
              else -> {
                error("Form union value has no selected branch")
              }
            }
          }
        }
      }
      if (request.lineItems.isEmpty()) {
        form.add("line_items", "")
      } else {
        request.lineItems.forEachIndexed { formIndex0, formElement0 ->
          formElement0.adjustableQuantity?.let { formValue2 ->
            form.add("line_items" + "[" + formIndex0 + "]" + "[adjustable_quantity]" + "[enabled]", formValue2.enabled.toString())
            formValue2.maximum?.let { formValue4 ->
              form.add("line_items" + "[" + formIndex0 + "]" + "[adjustable_quantity]" + "[maximum]", formValue4.toString())
            }
            formValue2.minimum?.let { formValue4 ->
              form.add("line_items" + "[" + formIndex0 + "]" + "[adjustable_quantity]" + "[minimum]", formValue4.toString())
            }
          }
          formElement0.price?.let { formValue2 ->
            form.add("line_items" + "[" + formIndex0 + "]" + "[price]", formValue2)
          }
          formElement0.priceData?.let { formValue2 ->
            form.add("line_items" + "[" + formIndex0 + "]" + "[price_data]" + "[currency]", formValue2.currency)
            formValue2.product?.let { formValue4 ->
              form.add("line_items" + "[" + formIndex0 + "]" + "[price_data]" + "[product]", formValue4)
            }
            formValue2.productData?.let { formValue4 ->
              formValue4.description?.let { formValue6 ->
                form.add("line_items" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[description]", formValue6)
              }
              formValue4.images?.let { formValue6 ->
                if (formValue6.isEmpty()) {
                  form.add("line_items" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[images]", "")
                } else {
                  formValue6.forEachIndexed { formIndex7, formElement7 ->
                    form.add("line_items" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[images]" + "[" + formIndex7 + "]", formElement7)
                  }
                }
              }
              formValue4.metadata?.let { formValue6 ->
                formValue6.forEach { (formKey7, formMapValue7) ->
                  form.add("line_items" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[metadata]" + "[" + formKey7 + "]", formMapValue7)
                }
              }
              form.add("line_items" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[name]", formValue4.name)
              formValue4.taxCode?.let { formValue6 ->
                form.add("line_items" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[tax_code]", formValue6)
              }
              formValue4.unitLabel?.let { formValue6 ->
                form.add("line_items" + "[" + formIndex0 + "]" + "[price_data]" + "[product_data]" + "[unit_label]", formValue6)
              }
            }
            formValue2.recurring?.let { formValue4 ->
              form.add("line_items" + "[" + formIndex0 + "]" + "[price_data]" + "[recurring]" + "[interval]", formValue4.interval.value)
              formValue4.intervalCount?.let { formValue6 ->
                form.add("line_items" + "[" + formIndex0 + "]" + "[price_data]" + "[recurring]" + "[interval_count]", formValue6.toString())
              }
            }
            formValue2.taxBehavior?.let { formValue4 ->
              form.add("line_items" + "[" + formIndex0 + "]" + "[price_data]" + "[tax_behavior]", formValue4.value)
            }
            formValue2.unitAmount?.let { formValue4 ->
              form.add("line_items" + "[" + formIndex0 + "]" + "[price_data]" + "[unit_amount]", formValue4.toString())
            }
            formValue2.unitAmountDecimal?.let { formValue4 ->
              form.add("line_items" + "[" + formIndex0 + "]" + "[price_data]" + "[unit_amount_decimal]", formValue4)
            }
          }
          form.add("line_items" + "[" + formIndex0 + "]" + "[quantity]", formElement0.quantity.toString())
        }
      }
      request.managedPayments?.let { formValue0 ->
        formValue0.enabled?.let { formValue2 ->
          form.add("managed_payments" + "[enabled]", formValue2.toString())
        }
      }
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      request.nameCollection?.let { formValue0 ->
        formValue0.business?.let { formValue2 ->
          form.add("name_collection" + "[business]" + "[enabled]", formValue2.enabled.toString())
          formValue2.optional?.let { formValue4 ->
            form.add("name_collection" + "[business]" + "[optional]", formValue4.toString())
          }
        }
        formValue0.individual?.let { formValue2 ->
          form.add("name_collection" + "[individual]" + "[enabled]", formValue2.enabled.toString())
          formValue2.optional?.let { formValue4 ->
            form.add("name_collection" + "[individual]" + "[optional]", formValue4.toString())
          }
        }
      }
      request.onBehalfOf?.let { formValue0 ->
        form.add("on_behalf_of", formValue0)
      }
      request.optionalItems?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("optional_items", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            formElement1.adjustableQuantity?.let { formValue3 ->
              form.add("optional_items" + "[" + formIndex1 + "]" + "[adjustable_quantity]" + "[enabled]", formValue3.enabled.toString())
              formValue3.maximum?.let { formValue5 ->
                form.add("optional_items" + "[" + formIndex1 + "]" + "[adjustable_quantity]" + "[maximum]", formValue5.toString())
              }
              formValue3.minimum?.let { formValue5 ->
                form.add("optional_items" + "[" + formIndex1 + "]" + "[adjustable_quantity]" + "[minimum]", formValue5.toString())
              }
            }
            form.add("optional_items" + "[" + formIndex1 + "]" + "[price]", formElement1.price)
            form.add("optional_items" + "[" + formIndex1 + "]" + "[quantity]", formElement1.quantity.toString())
          }
        }
      }
      request.paymentIntentData?.let { formValue0 ->
        formValue0.captureMethod?.let { formValue2 ->
          form.add("payment_intent_data" + "[capture_method]", formValue2.value)
        }
        formValue0.description?.let { formValue2 ->
          form.add("payment_intent_data" + "[description]", formValue2)
        }
        formValue0.metadata?.let { formValue2 ->
          formValue2.forEach { (formKey3, formMapValue3) ->
            form.add("payment_intent_data" + "[metadata]" + "[" + formKey3 + "]", formMapValue3)
          }
        }
        formValue0.setupFutureUsage?.let { formValue2 ->
          form.add("payment_intent_data" + "[setup_future_usage]", formValue2.value)
        }
        formValue0.statementDescriptor?.let { formValue2 ->
          form.add("payment_intent_data" + "[statement_descriptor]", formValue2)
        }
        formValue0.statementDescriptorSuffix?.let { formValue2 ->
          form.add("payment_intent_data" + "[statement_descriptor_suffix]", formValue2)
        }
        formValue0.transferGroup?.let { formValue2 ->
          form.add("payment_intent_data" + "[transfer_group]", formValue2)
        }
      }
      request.paymentMethodCollection?.let { formValue0 ->
        form.add("payment_method_collection", formValue0.value)
      }
      request.paymentMethodOptions?.let { formValue0 ->
        formValue0.card?.let { formValue2 ->
          formValue2.restrictions?.let { formValue4 ->
            formValue4.brandsBlocked?.let { formValue6 ->
              if (formValue6.isEmpty()) {
                form.add("payment_method_options" + "[card]" + "[restrictions]" + "[brands_blocked]", "")
              } else {
                formValue6.forEachIndexed { formIndex7, formElement7 ->
                  form.add("payment_method_options" + "[card]" + "[restrictions]" + "[brands_blocked]" + "[" + formIndex7 + "]", formElement7.value)
                }
              }
            }
          }
        }
      }
      request.paymentMethodTypes?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("payment_method_types", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("payment_method_types" + "[" + formIndex1 + "]", formElement1.value)
          }
        }
      }
      request.phoneNumberCollection?.let { formValue0 ->
        form.add("phone_number_collection" + "[enabled]", formValue0.enabled.toString())
      }
      request.restrictions?.let { formValue0 ->
        form.add("restrictions" + "[completed_sessions]" + "[limit]", formValue0.completedSessions.limit.toString())
      }
      request.shippingAddressCollection?.let { formValue0 ->
        if (formValue0.allowedCountries.isEmpty()) {
          form.add("shipping_address_collection" + "[allowed_countries]", "")
        } else {
          formValue0.allowedCountries.forEachIndexed { formIndex2, formElement2 ->
            form.add("shipping_address_collection" + "[allowed_countries]" + "[" + formIndex2 + "]", formElement2.value)
          }
        }
      }
      request.shippingOptions?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("shipping_options", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            formElement1.shippingRate?.let { formValue3 ->
              form.add("shipping_options" + "[" + formIndex1 + "]" + "[shipping_rate]", formValue3)
            }
          }
        }
      }
      request.submitType?.let { formValue0 ->
        form.add("submit_type", formValue0.value)
      }
      request.subscriptionData?.let { formValue0 ->
        formValue0.description?.let { formValue2 ->
          form.add("subscription_data" + "[description]", formValue2)
        }
        formValue0.invoiceSettings?.let { formValue2 ->
          formValue2.issuer?.let { formValue4 ->
            formValue4.account?.let { formValue6 ->
              form.add("subscription_data" + "[invoice_settings]" + "[issuer]" + "[account]", formValue6)
            }
            form.add("subscription_data" + "[invoice_settings]" + "[issuer]" + "[type]", formValue4.type.value)
          }
        }
        formValue0.metadata?.let { formValue2 ->
          formValue2.forEach { (formKey3, formMapValue3) ->
            form.add("subscription_data" + "[metadata]" + "[" + formKey3 + "]", formMapValue3)
          }
        }
        formValue0.trialPeriodDays?.let { formValue2 ->
          form.add("subscription_data" + "[trial_period_days]", formValue2.toString())
        }
        formValue0.trialSettings?.let { formValue2 ->
          form.add("subscription_data" + "[trial_settings]" + "[end_behavior]" + "[missing_payment_method]", formValue2.endBehavior.missingPaymentMethod.value)
        }
      }
      request.taxIdCollection?.let { formValue0 ->
        form.add("tax_id_collection" + "[enabled]", formValue0.enabled.toString())
        formValue0.required?.let { formValue2 ->
          form.add("tax_id_collection" + "[required]", formValue2.value)
        }
      }
      request.transferData?.let { formValue0 ->
        formValue0.amount?.let { formValue2 ->
          form.add("transfer_data" + "[amount]", formValue2.toString())
        }
        form.add("transfer_data" + "[destination]", formValue0.destination)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PaymentLinksPostRequestFormXa7410106 {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'payment_links' group of Stripe API.
 */
public class PaymentLinksClient(
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
      SdkExecutor(transport, authentication = this@PaymentLinksClient.authentication)

  /**
   * <p>Returns a list of your payment links.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param active Only return payment links that are active or inactive (e.g., pass `false` to list all inactive
   * payment links).
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
  public suspend fun getPaymentLinksWithResponse(
    request: JsonObject? = null,
    active: Boolean? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPaymentLinksResponse> = executor.executeWithResponse<JsonObject?, GetPaymentLinksResponse>(SdkExecutionRequest(getPaymentLinksMetadata, baseUri, request, listOf(PaymentLinksCodecs.GETPAYMENTLINKS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "active", values = active?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), PaymentLinksCodecs.getPaymentLinksRequestCodecRegistry, GetPaymentLinksResponseDecoder, options)

  /**
   * <p>Retrieve a payment link.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param paymentLink Wire parameter `payment_link`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getPaymentLinksPaymentLinkWithResponse(
    request: JsonObject? = null,
    paymentLink: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPaymentLinksPaymentLinkResponse> = executor.executeWithResponse<JsonObject?, GetPaymentLinksPaymentLinkResponse>(SdkExecutionRequest(getPaymentLinksPaymentLinkMetadata, baseUri, request, listOf(PaymentLinksCodecs.GETPAYMENTLINKSPAYMENTLINK_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "payment_link", values = listOf(paymentLink.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), PaymentLinksCodecs.getPaymentLinksPaymentLinkRequestCodecRegistry, GetPaymentLinksPaymentLinkResponseDecoder, options)

  /**
   * <p>When retrieving a payment link, there is an includable <strong>line_items</strong> property containing the first
   * handful of those items. There is also a URL where you can retrieve the full (paginated) list of line items.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param paymentLink Wire parameter `payment_link`.
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
  public suspend fun getPaymentLinksPaymentLinkLineItemsWithResponse(
    request: JsonObject? = null,
    paymentLink: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPaymentLinksPaymentLinkLineItemsResponse> = executor.executeWithResponse<JsonObject?, GetPaymentLinksPaymentLinkLineItemsResponse>(SdkExecutionRequest(getPaymentLinksPaymentLinkLineItemsMetadata, baseUri, request, listOf(PaymentLinksCodecs.GETPAYMENTLINKSPAYMENTLINKLINEITEMS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "payment_link", values = listOf(paymentLink.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), PaymentLinksCodecs.getPaymentLinksPaymentLinkLineItemsRequestCodecRegistry, GetPaymentLinksPaymentLinkLineItemsResponseDecoder, options)

  /**
   * <p>Creates a payment link.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postPaymentLinksWithResponse(request: InlineV1PaymentLinksPostRequestFormXa7410106, options: CallOptions = CallOptions()): SdkResponseResult<PostPaymentLinksResponse> = executor.executeWithResponse<InlineV1PaymentLinksPostRequestFormXa7410106, PostPaymentLinksResponse>(SdkExecutionRequest(postPaymentLinksMetadata, baseUri, request, listOf(PaymentLinksCodecs.POSTPAYMENTLINKS_REQUEST_CODEC_ID), emptyList()), PaymentLinksCodecs.postPaymentLinksRequestCodecRegistry, PostPaymentLinksResponseDecoder, options)

  /**
   * Typed response alternatives for `GetPaymentLinks`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetPaymentLinksResponse {
    public class SuccessJson(
      public val json: InlineV1PaymentLinksGetResponse200JsonX148bd83a,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentLinksResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentLinksResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentLinksResponse
  }

  private object GetPaymentLinksResponseDecoder : SdkResponseAlternativeDecoder<GetPaymentLinksResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPaymentLinksResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPaymentLinksResponse> = when {
      alternative.id == "GetPaymentLinks.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPaymentLinksResponse.SuccessJson(
          json = PaymentLinksCodecs.getPaymentLinksResponseCodecAlternative0Registry.select(listOf("GetPaymentLinks.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPaymentLinks.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPaymentLinksResponse.DefaultJson(
          json = PaymentLinksCodecs.getPaymentLinksResponseCodecAlternative1Registry.select(listOf("GetPaymentLinks.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPaymentLinksResponse = GetPaymentLinksResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetPaymentLinksPaymentLink`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetPaymentLinksPaymentLinkResponse {
    public class SuccessJson(
      public val json: PaymentLink,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentLinksPaymentLinkResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentLinksPaymentLinkResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentLinksPaymentLinkResponse
  }

  private object GetPaymentLinksPaymentLinkResponseDecoder : SdkResponseAlternativeDecoder<GetPaymentLinksPaymentLinkResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPaymentLinksPaymentLinkResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPaymentLinksPaymentLinkResponse> = when {
      alternative.id == "GetPaymentLinksPaymentLink.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPaymentLinksPaymentLinkResponse.SuccessJson(
          json = PaymentLinksCodecs.getPaymentLinksPaymentLinkResponseCodecAlternative0Registry.select(listOf("GetPaymentLinksPaymentLink.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPaymentLinksPaymentLink.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPaymentLinksPaymentLinkResponse.DefaultJson(
          json = PaymentLinksCodecs.getPaymentLinksPaymentLinkResponseCodecAlternative1Registry.select(listOf("GetPaymentLinksPaymentLink.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPaymentLinksPaymentLinkResponse = GetPaymentLinksPaymentLinkResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetPaymentLinksPaymentLinkLineItems`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetPaymentLinksPaymentLinkLineItemsResponse {
    public class SuccessJson(
      public val json: InlineV1PaymentLinksLineItemsGetResponse200JsonXec9e7af3,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentLinksPaymentLinkLineItemsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentLinksPaymentLinkLineItemsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentLinksPaymentLinkLineItemsResponse
  }

  private object GetPaymentLinksPaymentLinkLineItemsResponseDecoder : SdkResponseAlternativeDecoder<GetPaymentLinksPaymentLinkLineItemsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPaymentLinksPaymentLinkLineItemsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPaymentLinksPaymentLinkLineItemsResponse> = when {
      alternative.id == "GetPaymentLinksPaymentLinkLineItems.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPaymentLinksPaymentLinkLineItemsResponse.SuccessJson(
          json = PaymentLinksCodecs.getPaymentLinksPaymentLinkLineItemsResponseCodecAlternative0Registry.select(listOf("GetPaymentLinksPaymentLinkLineItems.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPaymentLinksPaymentLinkLineItems.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPaymentLinksPaymentLinkLineItemsResponse.DefaultJson(
          json = PaymentLinksCodecs.getPaymentLinksPaymentLinkLineItemsResponseCodecAlternative1Registry.select(listOf("GetPaymentLinksPaymentLinkLineItems.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPaymentLinksPaymentLinkLineItemsResponse = GetPaymentLinksPaymentLinkLineItemsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPaymentLinks`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostPaymentLinksResponse {
    public class SuccessJson(
      public val json: PaymentLink,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentLinksResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentLinksResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentLinksResponse
  }

  private object PostPaymentLinksResponseDecoder : SdkResponseAlternativeDecoder<PostPaymentLinksResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPaymentLinksResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPaymentLinksResponse> = when {
      alternative.id == "PostPaymentLinks.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPaymentLinksResponse.SuccessJson(
          json = PaymentLinksCodecs.postPaymentLinksResponseCodecAlternative0Registry.select(listOf("PostPaymentLinks.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPaymentLinks.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPaymentLinksResponse.DefaultJson(
          json = PaymentLinksCodecs.postPaymentLinksResponseCodecAlternative1Registry.select(listOf("PostPaymentLinks.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPaymentLinksResponse = PostPaymentLinksResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getPaymentLinksMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPaymentLinks",
          method = "GET",
          path = "/v1/payment_links",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1PaymentLinksGetResponse200JsonX148bd83a",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentLinks.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentLinks.response.alternative1",
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

    internal val getPaymentLinksPaymentLinkMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPaymentLinksPaymentLink",
          method = "GET",
          path = "/v1/payment_links/{payment_link}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentLink",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentLinksPaymentLink.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentLinksPaymentLink.response.alternative1",
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

    internal val getPaymentLinksPaymentLinkLineItemsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPaymentLinksPaymentLinkLineItems",
          method = "GET",
          path = "/v1/payment_links/{payment_link}/line_items",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1PaymentLinksLineItemsGetResponse200JsonXec9e7af3",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentLinksPaymentLinkLineItems.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentLinksPaymentLinkLineItems.response.alternative1",
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

    internal val postPaymentLinksMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPaymentLinks",
          method = "POST",
          path = "/v1/payment_links",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentLink",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentLinks.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentLinks.response.alternative1",
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
