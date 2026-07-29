package com.nabobery.sdkgen.generated.stripe.paymentrecords

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentRecordsReportPaymentAttemptCanceledPostRequestFormXebc80f8b
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843
import com.nabobery.sdkgen.generated.stripe.PaymentRecord
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

public object PaymentRecordsCodecs {
  public const val GETPAYMENTRECORDSID_REQUEST_CODEC_ID: String = "GetPaymentRecordsId.request"

  private val getPaymentRecordsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetPaymentRecordsIdFormCodec

  private val getPaymentRecordsIdResponseCodecAlternative0Codec: MediaTypeCodec<PaymentRecord> =
      KotlinxSerializationCodec("GetPaymentRecordsId.response.alternative0", PaymentRecord.Serializer, SdkJson)

  public val getPaymentRecordsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentRecord> =
      MediaTypeCodecRegistry.of(getPaymentRecordsIdResponseCodecAlternative0Codec)

  private val getPaymentRecordsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPaymentRecordsId.response.alternative1", Error.Serializer, SdkJson)

  public val getPaymentRecordsIdResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPaymentRecordsIdResponseCodecAlternative1Codec)

  public val getPaymentRecordsIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPaymentRecordsIdRequestCodec)

  public const val POSTPAYMENTRECORDSIDREPORTPAYMENTATTEMPT_REQUEST_CODEC_ID: String =
      "PostPaymentRecordsIdReportPaymentAttempt.request"

  private val postPaymentRecordsIdReportPaymentAttemptRequestCodec:
      MediaTypeCodec<InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819> =
      PostPaymentRecordsIdReportPaymentAttemptFormCodec

  private val postPaymentRecordsIdReportPaymentAttemptResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentRecord> =
      KotlinxSerializationCodec("PostPaymentRecordsIdReportPaymentAttempt.response.alternative0", PaymentRecord.Serializer, SdkJson)

  public val postPaymentRecordsIdReportPaymentAttemptResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentRecord> =
      MediaTypeCodecRegistry.of(postPaymentRecordsIdReportPaymentAttemptResponseCodecAlternative0Codec)

  private val postPaymentRecordsIdReportPaymentAttemptResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPaymentRecordsIdReportPaymentAttempt.response.alternative1", Error.Serializer, SdkJson)

  public val postPaymentRecordsIdReportPaymentAttemptResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPaymentRecordsIdReportPaymentAttemptResponseCodecAlternative1Codec)

  public val postPaymentRecordsIdReportPaymentAttemptRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819> =
      MediaTypeCodecRegistry.of(postPaymentRecordsIdReportPaymentAttemptRequestCodec)

  public const val POSTPAYMENTRECORDSIDREPORTPAYMENTATTEMPTCANCELED_REQUEST_CODEC_ID: String =
      "PostPaymentRecordsIdReportPaymentAttemptCanceled.request"

  private val postPaymentRecordsIdReportPaymentAttemptCanceledRequestCodec:
      MediaTypeCodec<InlineV1PaymentRecordsReportPaymentAttemptCanceledPostRequestFormXebc80f8b> =
      PostPaymentRecordsIdReportPaymentAttemptCanceledFormCodec

  private val postPaymentRecordsIdReportPaymentAttemptCanceledResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentRecord> =
      KotlinxSerializationCodec("PostPaymentRecordsIdReportPaymentAttemptCanceled.response.alternative0", PaymentRecord.Serializer, SdkJson)

  public val postPaymentRecordsIdReportPaymentAttemptCanceledResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentRecord> =
      MediaTypeCodecRegistry.of(postPaymentRecordsIdReportPaymentAttemptCanceledResponseCodecAlternative0Codec)

  private val postPaymentRecordsIdReportPaymentAttemptCanceledResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPaymentRecordsIdReportPaymentAttemptCanceled.response.alternative1", Error.Serializer, SdkJson)

  public val postPaymentRecordsIdReportPaymentAttemptCanceledResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPaymentRecordsIdReportPaymentAttemptCanceledResponseCodecAlternative1Codec)

  public val postPaymentRecordsIdReportPaymentAttemptCanceledRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PaymentRecordsReportPaymentAttemptCanceledPostRequestFormXebc80f8b>
      = MediaTypeCodecRegistry.of(postPaymentRecordsIdReportPaymentAttemptCanceledRequestCodec)

  public const val POSTPAYMENTRECORDSIDREPORTPAYMENTATTEMPTFAILED_REQUEST_CODEC_ID: String =
      "PostPaymentRecordsIdReportPaymentAttemptFailed.request"

  private val postPaymentRecordsIdReportPaymentAttemptFailedRequestCodec:
      MediaTypeCodec<InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739> =
      PostPaymentRecordsIdReportPaymentAttemptFailedFormCodec

  private val postPaymentRecordsIdReportPaymentAttemptFailedResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentRecord> =
      KotlinxSerializationCodec("PostPaymentRecordsIdReportPaymentAttemptFailed.response.alternative0", PaymentRecord.Serializer, SdkJson)

  public val postPaymentRecordsIdReportPaymentAttemptFailedResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentRecord> =
      MediaTypeCodecRegistry.of(postPaymentRecordsIdReportPaymentAttemptFailedResponseCodecAlternative0Codec)

  private val postPaymentRecordsIdReportPaymentAttemptFailedResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPaymentRecordsIdReportPaymentAttemptFailed.response.alternative1", Error.Serializer, SdkJson)

  public val postPaymentRecordsIdReportPaymentAttemptFailedResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPaymentRecordsIdReportPaymentAttemptFailedResponseCodecAlternative1Codec)

  public val postPaymentRecordsIdReportPaymentAttemptFailedRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739>
      = MediaTypeCodecRegistry.of(postPaymentRecordsIdReportPaymentAttemptFailedRequestCodec)

  public const val POSTPAYMENTRECORDSIDREPORTPAYMENTATTEMPTGUARANTEED_REQUEST_CODEC_ID: String =
      "PostPaymentRecordsIdReportPaymentAttemptGuaranteed.request"

  private val postPaymentRecordsIdReportPaymentAttemptGuaranteedRequestCodec:
      MediaTypeCodec<InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1> =
      PostPaymentRecordsIdReportPaymentAttemptGuaranteedFormCodec

  private val postPaymentRecordsIdReportPaymentAttemptGuaranteedResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentRecord> =
      KotlinxSerializationCodec("PostPaymentRecordsIdReportPaymentAttemptGuaranteed.response.alternative0", PaymentRecord.Serializer, SdkJson)

  public val postPaymentRecordsIdReportPaymentAttemptGuaranteedResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentRecord> =
      MediaTypeCodecRegistry.of(postPaymentRecordsIdReportPaymentAttemptGuaranteedResponseCodecAlternative0Codec)

  private val postPaymentRecordsIdReportPaymentAttemptGuaranteedResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPaymentRecordsIdReportPaymentAttemptGuaranteed.response.alternative1", Error.Serializer, SdkJson)

  public val postPaymentRecordsIdReportPaymentAttemptGuaranteedResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPaymentRecordsIdReportPaymentAttemptGuaranteedResponseCodecAlternative1Codec)

  public val postPaymentRecordsIdReportPaymentAttemptGuaranteedRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1>
      = MediaTypeCodecRegistry.of(postPaymentRecordsIdReportPaymentAttemptGuaranteedRequestCodec)

  public const val POSTPAYMENTRECORDSIDREPORTREFUND_REQUEST_CODEC_ID: String =
      "PostPaymentRecordsIdReportRefund.request"

  private val postPaymentRecordsIdReportRefundRequestCodec:
      MediaTypeCodec<InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843> =
      PostPaymentRecordsIdReportRefundFormCodec

  private val postPaymentRecordsIdReportRefundResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentRecord> =
      KotlinxSerializationCodec("PostPaymentRecordsIdReportRefund.response.alternative0", PaymentRecord.Serializer, SdkJson)

  public val postPaymentRecordsIdReportRefundResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentRecord> =
      MediaTypeCodecRegistry.of(postPaymentRecordsIdReportRefundResponseCodecAlternative0Codec)

  private val postPaymentRecordsIdReportRefundResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("PostPaymentRecordsIdReportRefund.response.alternative1", Error.Serializer, SdkJson)

  public val postPaymentRecordsIdReportRefundResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPaymentRecordsIdReportRefundResponseCodecAlternative1Codec)

  public val postPaymentRecordsIdReportRefundRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843> =
      MediaTypeCodecRegistry.of(postPaymentRecordsIdReportRefundRequestCodec)

  public const val POSTPAYMENTRECORDSREPORTPAYMENT_REQUEST_CODEC_ID: String =
      "PostPaymentRecordsReportPayment.request"

  private val postPaymentRecordsReportPaymentRequestCodec:
      MediaTypeCodec<InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2> =
      PostPaymentRecordsReportPaymentFormCodec

  private val postPaymentRecordsReportPaymentResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentRecord> =
      KotlinxSerializationCodec("PostPaymentRecordsReportPayment.response.alternative0", PaymentRecord.Serializer, SdkJson)

  public val postPaymentRecordsReportPaymentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentRecord> =
      MediaTypeCodecRegistry.of(postPaymentRecordsReportPaymentResponseCodecAlternative0Codec)

  private val postPaymentRecordsReportPaymentResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPaymentRecordsReportPayment.response.alternative1", Error.Serializer, SdkJson)

  public val postPaymentRecordsReportPaymentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPaymentRecordsReportPaymentResponseCodecAlternative1Codec)

  public val postPaymentRecordsReportPaymentRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2> =
      MediaTypeCodecRegistry.of(postPaymentRecordsReportPaymentRequestCodec)

  public object GetPaymentRecordsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPaymentRecordsId.request"

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

  public object PostPaymentRecordsIdReportPaymentAttemptFormCodec : MediaTypeCodec<InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819> {
    override val id: String = "PostPaymentRecordsIdReportPaymentAttempt.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.description?.let { formValue0 ->
        form.add("description", formValue0)
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
      request.failed?.let { formValue0 ->
        form.add("failed" + "[failed_at]", formValue0.failedAt.toString())
      }
      request.guaranteed?.let { formValue0 ->
        form.add("guaranteed" + "[guaranteed_at]", formValue0.guaranteedAt.toString())
      }
      form.add("initiated_at", request.initiatedAt.toString())
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.outcome?.let { formValue0 ->
        form.add("outcome", formValue0.value)
      }
      request.paymentMethodDetails?.let { formValue0 ->
        formValue0.billingDetails?.let { formValue2 ->
          formValue2.address?.let { formValue4 ->
            formValue4.city?.let { formValue6 ->
              form.add("payment_method_details" + "[billing_details]" + "[address]" + "[city]", formValue6)
            }
            formValue4.country?.let { formValue6 ->
              form.add("payment_method_details" + "[billing_details]" + "[address]" + "[country]", formValue6)
            }
            formValue4.line1?.let { formValue6 ->
              form.add("payment_method_details" + "[billing_details]" + "[address]" + "[line1]", formValue6)
            }
            formValue4.line2?.let { formValue6 ->
              form.add("payment_method_details" + "[billing_details]" + "[address]" + "[line2]", formValue6)
            }
            formValue4.postalCode?.let { formValue6 ->
              form.add("payment_method_details" + "[billing_details]" + "[address]" + "[postal_code]", formValue6)
            }
            formValue4.state?.let { formValue6 ->
              form.add("payment_method_details" + "[billing_details]" + "[address]" + "[state]", formValue6)
            }
          }
          formValue2.email?.let { formValue4 ->
            form.add("payment_method_details" + "[billing_details]" + "[email]", formValue4)
          }
          formValue2.name?.let { formValue4 ->
            form.add("payment_method_details" + "[billing_details]" + "[name]", formValue4)
          }
          formValue2.phone?.let { formValue4 ->
            form.add("payment_method_details" + "[billing_details]" + "[phone]", formValue4)
          }
        }
        formValue0.custom?.let { formValue2 ->
          formValue2.displayName?.let { formValue4 ->
            form.add("payment_method_details" + "[custom]" + "[display_name]", formValue4)
          }
          formValue2.type?.let { formValue4 ->
            form.add("payment_method_details" + "[custom]" + "[type]", formValue4)
          }
        }
        formValue0.paymentMethod?.let { formValue2 ->
          form.add("payment_method_details" + "[payment_method]", formValue2)
        }
        formValue0.type?.let { formValue2 ->
          form.add("payment_method_details" + "[type]", formValue2.value)
        }
      }
      request.shippingDetails?.let { formValue0 ->
        formValue0.address?.let { formValue2 ->
          formValue2.city?.let { formValue4 ->
            form.add("shipping_details" + "[address]" + "[city]", formValue4)
          }
          formValue2.country?.let { formValue4 ->
            form.add("shipping_details" + "[address]" + "[country]", formValue4)
          }
          formValue2.line1?.let { formValue4 ->
            form.add("shipping_details" + "[address]" + "[line1]", formValue4)
          }
          formValue2.line2?.let { formValue4 ->
            form.add("shipping_details" + "[address]" + "[line2]", formValue4)
          }
          formValue2.postalCode?.let { formValue4 ->
            form.add("shipping_details" + "[address]" + "[postal_code]", formValue4)
          }
          formValue2.state?.let { formValue4 ->
            form.add("shipping_details" + "[address]" + "[state]", formValue4)
          }
        }
        formValue0.name?.let { formValue2 ->
          form.add("shipping_details" + "[name]", formValue2)
        }
        formValue0.phone?.let { formValue2 ->
          form.add("shipping_details" + "[phone]", formValue2)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostPaymentRecordsIdReportPaymentAttemptCanceledFormCodec : MediaTypeCodec<InlineV1PaymentRecordsReportPaymentAttemptCanceledPostRequestFormXebc80f8b> {
    override val id: String = "PostPaymentRecordsIdReportPaymentAttemptCanceled.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PaymentRecordsReportPaymentAttemptCanceledPostRequestFormXebc80f8b, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("canceled_at", request.canceledAt.toString())
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
          formValue0.inlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PaymentRecordsReportPaymentAttemptCanceledPostRequestFormXebc80f8b {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostPaymentRecordsIdReportPaymentAttemptFailedFormCodec : MediaTypeCodec<InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739> {
    override val id: String = "PostPaymentRecordsIdReportPaymentAttemptFailed.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739, mediaType: String): SdkRequestBody {
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
      form.add("failed_at", request.failedAt.toString())
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1PaymentRecordsRepo6f4dPostRequestFormMetadataAnyOf2X43c0153c != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1PaymentRecordsRepo6f4dPostRequestFormMetadataAnyOf2X43c0153c).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostPaymentRecordsIdReportPaymentAttemptGuaranteedFormCodec : MediaTypeCodec<InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1> {
    override val id: String = "PostPaymentRecordsIdReportPaymentAttemptGuaranteed.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1, mediaType: String): SdkRequestBody {
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
      form.add("guaranteed_at", request.guaranteedAt.toString())
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1PaymentRecordsRepof263PostRequestFormMetadataAnyOf2X38787c13 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1PaymentRecordsRepof263PostRequestFormMetadataAnyOf2X38787c13).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostPaymentRecordsIdReportRefundFormCodec : MediaTypeCodec<InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843> {
    override val id: String = "PostPaymentRecordsIdReportRefund.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount?.let { formValue0 ->
        form.add("amount" + "[currency]", formValue0.currency)
        form.add("amount" + "[value]", formValue0.value.toString())
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
      request.initiatedAt?.let { formValue0 ->
        form.add("initiated_at", formValue0.toString())
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
          formValue0.inlineV1PaymentRecordsReportRefundPostRequestFormMetadataAnyOf2Xf2846715 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1PaymentRecordsReportRefundPostRequestFormMetadataAnyOf2Xf2846715).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      form.add("outcome", request.outcome.value)
      request.processorDetails.custom?.let { formValue1 ->
        form.add("processor_details" + "[custom]" + "[refund_reference]", formValue1.refundReference)
      }
      form.add("processor_details" + "[type]", request.processorDetails.type.value)
      request.refunded?.let { formValue0 ->
        form.add("refunded" + "[refunded_at]", formValue0.refundedAt.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostPaymentRecordsReportPaymentFormCodec : MediaTypeCodec<InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2> {
    override val id: String = "PostPaymentRecordsReportPayment.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("amount_requested" + "[currency]", request.amountRequested.currency)
      form.add("amount_requested" + "[value]", request.amountRequested.value.toString())
      request.customerDetails?.let { formValue0 ->
        formValue0.customer?.let { formValue2 ->
          form.add("customer_details" + "[customer]", formValue2)
        }
        formValue0.email?.let { formValue2 ->
          form.add("customer_details" + "[email]", formValue2)
        }
        formValue0.name?.let { formValue2 ->
          form.add("customer_details" + "[name]", formValue2)
        }
        formValue0.phone?.let { formValue2 ->
          form.add("customer_details" + "[phone]", formValue2)
        }
      }
      request.customerPresence?.let { formValue0 ->
        form.add("customer_presence", formValue0.value)
      }
      request.description?.let { formValue0 ->
        form.add("description", formValue0)
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
      request.failed?.let { formValue0 ->
        form.add("failed" + "[failed_at]", formValue0.failedAt.toString())
      }
      request.guaranteed?.let { formValue0 ->
        form.add("guaranteed" + "[guaranteed_at]", formValue0.guaranteedAt.toString())
      }
      form.add("initiated_at", request.initiatedAt.toString())
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.outcome?.let { formValue0 ->
        form.add("outcome", formValue0.value)
      }
      request.paymentMethodDetails.billingDetails?.let { formValue1 ->
        formValue1.address?.let { formValue3 ->
          formValue3.city?.let { formValue5 ->
            form.add("payment_method_details" + "[billing_details]" + "[address]" + "[city]", formValue5)
          }
          formValue3.country?.let { formValue5 ->
            form.add("payment_method_details" + "[billing_details]" + "[address]" + "[country]", formValue5)
          }
          formValue3.line1?.let { formValue5 ->
            form.add("payment_method_details" + "[billing_details]" + "[address]" + "[line1]", formValue5)
          }
          formValue3.line2?.let { formValue5 ->
            form.add("payment_method_details" + "[billing_details]" + "[address]" + "[line2]", formValue5)
          }
          formValue3.postalCode?.let { formValue5 ->
            form.add("payment_method_details" + "[billing_details]" + "[address]" + "[postal_code]", formValue5)
          }
          formValue3.state?.let { formValue5 ->
            form.add("payment_method_details" + "[billing_details]" + "[address]" + "[state]", formValue5)
          }
        }
        formValue1.email?.let { formValue3 ->
          form.add("payment_method_details" + "[billing_details]" + "[email]", formValue3)
        }
        formValue1.name?.let { formValue3 ->
          form.add("payment_method_details" + "[billing_details]" + "[name]", formValue3)
        }
        formValue1.phone?.let { formValue3 ->
          form.add("payment_method_details" + "[billing_details]" + "[phone]", formValue3)
        }
      }
      request.paymentMethodDetails.custom?.let { formValue1 ->
        formValue1.displayName?.let { formValue3 ->
          form.add("payment_method_details" + "[custom]" + "[display_name]", formValue3)
        }
        formValue1.type?.let { formValue3 ->
          form.add("payment_method_details" + "[custom]" + "[type]", formValue3)
        }
      }
      request.paymentMethodDetails.paymentMethod?.let { formValue1 ->
        form.add("payment_method_details" + "[payment_method]", formValue1)
      }
      request.paymentMethodDetails.type?.let { formValue1 ->
        form.add("payment_method_details" + "[type]", formValue1.value)
      }
      request.processorDetails?.let { formValue0 ->
        formValue0.custom?.let { formValue2 ->
          form.add("processor_details" + "[custom]" + "[payment_reference]", formValue2.paymentReference)
        }
        form.add("processor_details" + "[type]", formValue0.type.value)
      }
      request.shippingDetails?.let { formValue0 ->
        formValue0.address?.let { formValue2 ->
          formValue2.city?.let { formValue4 ->
            form.add("shipping_details" + "[address]" + "[city]", formValue4)
          }
          formValue2.country?.let { formValue4 ->
            form.add("shipping_details" + "[address]" + "[country]", formValue4)
          }
          formValue2.line1?.let { formValue4 ->
            form.add("shipping_details" + "[address]" + "[line1]", formValue4)
          }
          formValue2.line2?.let { formValue4 ->
            form.add("shipping_details" + "[address]" + "[line2]", formValue4)
          }
          formValue2.postalCode?.let { formValue4 ->
            form.add("shipping_details" + "[address]" + "[postal_code]", formValue4)
          }
          formValue2.state?.let { formValue4 ->
            form.add("shipping_details" + "[address]" + "[state]", formValue4)
          }
        }
        formValue0.name?.let { formValue2 ->
          form.add("shipping_details" + "[name]", formValue2)
        }
        formValue0.phone?.let { formValue2 ->
          form.add("shipping_details" + "[phone]", formValue2)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2 {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'payment_records' group of Stripe API.
 */
public class PaymentRecordsClient(
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
      SdkExecutor(transport, authentication = this@PaymentRecordsClient.authentication)

  /**
   * <p>Retrieves a Payment Record with the given ID</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The ID of the Payment Record.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getPaymentRecordsIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPaymentRecordsIdResponse> = executor.executeWithResponse<JsonObject?, GetPaymentRecordsIdResponse>(SdkExecutionRequest(getPaymentRecordsIdMetadata, baseUri, request, listOf(PaymentRecordsCodecs.GETPAYMENTRECORDSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), PaymentRecordsCodecs.getPaymentRecordsIdRequestCodecRegistry, GetPaymentRecordsIdResponseDecoder, options)

  /**
   * <p>Report a new payment attempt on the specified Payment Record. A new payment
   * attempt can only be specified if all other payment attempts are canceled or failed.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The ID of the Payment Record.
   * @param options Execution options.
   */
  public suspend fun postPaymentRecordsIdReportPaymentAttemptWithResponse(
    request: InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostPaymentRecordsIdReportPaymentAttemptResponse> = executor.executeWithResponse<InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormX67c9a819, PostPaymentRecordsIdReportPaymentAttemptResponse>(SdkExecutionRequest(postPaymentRecordsIdReportPaymentAttemptMetadata, baseUri, request, listOf(PaymentRecordsCodecs.POSTPAYMENTRECORDSIDREPORTPAYMENTATTEMPT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), PaymentRecordsCodecs.postPaymentRecordsIdReportPaymentAttemptRequestCodecRegistry, PostPaymentRecordsIdReportPaymentAttemptResponseDecoder, options)

  /**
   * <p>Report that the most recent payment attempt on the specified Payment Record
   * was canceled.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The ID of the Payment Record.
   * @param options Execution options.
   */
  public suspend fun postPaymentRecordsIdReportPaymentAttemptCanceledWithResponse(
    request: InlineV1PaymentRecordsReportPaymentAttemptCanceledPostRequestFormXebc80f8b,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostPaymentRecordsIdReportPaymentAttemptCanceledResponse> = executor.executeWithResponse<InlineV1PaymentRecordsReportPaymentAttemptCanceledPostRequestFormXebc80f8b, PostPaymentRecordsIdReportPaymentAttemptCanceledResponse>(SdkExecutionRequest(postPaymentRecordsIdReportPaymentAttemptCanceledMetadata, baseUri, request, listOf(PaymentRecordsCodecs.POSTPAYMENTRECORDSIDREPORTPAYMENTATTEMPTCANCELED_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), PaymentRecordsCodecs.postPaymentRecordsIdReportPaymentAttemptCanceledRequestCodecRegistry, PostPaymentRecordsIdReportPaymentAttemptCanceledResponseDecoder, options)

  /**
   * <p>Report that the most recent payment attempt on the specified Payment Record
   * failed or errored.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The ID of the Payment Record.
   * @param options Execution options.
   */
  public suspend fun postPaymentRecordsIdReportPaymentAttemptFailedWithResponse(
    request: InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostPaymentRecordsIdReportPaymentAttemptFailedResponse> = executor.executeWithResponse<InlineV1PaymentRecordsReportPaymentAttemptFailedPostRequestFormXd63fb739, PostPaymentRecordsIdReportPaymentAttemptFailedResponse>(SdkExecutionRequest(postPaymentRecordsIdReportPaymentAttemptFailedMetadata, baseUri, request, listOf(PaymentRecordsCodecs.POSTPAYMENTRECORDSIDREPORTPAYMENTATTEMPTFAILED_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), PaymentRecordsCodecs.postPaymentRecordsIdReportPaymentAttemptFailedRequestCodecRegistry, PostPaymentRecordsIdReportPaymentAttemptFailedResponseDecoder, options)

  /**
   * <p>Report that the most recent payment attempt on the specified Payment Record
   * was guaranteed.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The ID of the Payment Record.
   * @param options Execution options.
   */
  public suspend fun postPaymentRecordsIdReportPaymentAttemptGuaranteedWithResponse(
    request: InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostPaymentRecordsIdReportPaymentAttemptGuaranteedResponse> = executor.executeWithResponse<InlineV1PaymentRecordsReportPaymentAttemptGuaranteedPostRequestFormX79807ad1, PostPaymentRecordsIdReportPaymentAttemptGuaranteedResponse>(SdkExecutionRequest(postPaymentRecordsIdReportPaymentAttemptGuaranteedMetadata, baseUri, request, listOf(PaymentRecordsCodecs.POSTPAYMENTRECORDSIDREPORTPAYMENTATTEMPTGUARANTEED_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), PaymentRecordsCodecs.postPaymentRecordsIdReportPaymentAttemptGuaranteedRequestCodecRegistry, PostPaymentRecordsIdReportPaymentAttemptGuaranteedResponseDecoder, options)

  /**
   * <p>Report that the most recent payment attempt on the specified Payment Record
   * was refunded.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The ID of the Payment Record.
   * @param options Execution options.
   */
  public suspend fun postPaymentRecordsIdReportRefundWithResponse(
    request: InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostPaymentRecordsIdReportRefundResponse> = executor.executeWithResponse<InlineV1PaymentRecordsReportRefundPostRequestFormX9bb75843, PostPaymentRecordsIdReportRefundResponse>(SdkExecutionRequest(postPaymentRecordsIdReportRefundMetadata, baseUri, request, listOf(PaymentRecordsCodecs.POSTPAYMENTRECORDSIDREPORTREFUND_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), PaymentRecordsCodecs.postPaymentRecordsIdReportRefundRequestCodecRegistry, PostPaymentRecordsIdReportRefundResponseDecoder, options)

  /**
   * <p>Report a new Payment Record. You may report a Payment Record as it is
   * initialized and later report updates through the other report_* methods, or report Payment
   * Records in a terminal state directly, through this method.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postPaymentRecordsReportPaymentWithResponse(request: InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2, options: CallOptions = CallOptions()): SdkResponseResult<PostPaymentRecordsReportPaymentResponse> = executor.executeWithResponse<InlineV1PaymentRecordsReportPaymentPostRequestFormX36161de2, PostPaymentRecordsReportPaymentResponse>(SdkExecutionRequest(postPaymentRecordsReportPaymentMetadata, baseUri, request, listOf(PaymentRecordsCodecs.POSTPAYMENTRECORDSREPORTPAYMENT_REQUEST_CODEC_ID), emptyList()), PaymentRecordsCodecs.postPaymentRecordsReportPaymentRequestCodecRegistry, PostPaymentRecordsReportPaymentResponseDecoder, options)

  /**
   * Typed response alternatives for `GetPaymentRecordsId`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetPaymentRecordsIdResponse {
    public class SuccessJson(
      public val json: PaymentRecord,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentRecordsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentRecordsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentRecordsIdResponse
  }

  private object GetPaymentRecordsIdResponseDecoder : SdkResponseAlternativeDecoder<GetPaymentRecordsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPaymentRecordsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPaymentRecordsIdResponse> = when {
      alternative.id == "GetPaymentRecordsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPaymentRecordsIdResponse.SuccessJson(
          json = PaymentRecordsCodecs.getPaymentRecordsIdResponseCodecAlternative0Registry.select(listOf("GetPaymentRecordsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPaymentRecordsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPaymentRecordsIdResponse.DefaultJson(
          json = PaymentRecordsCodecs.getPaymentRecordsIdResponseCodecAlternative1Registry.select(listOf("GetPaymentRecordsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPaymentRecordsIdResponse = GetPaymentRecordsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPaymentRecordsIdReportPaymentAttempt`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostPaymentRecordsIdReportPaymentAttemptResponse {
    public class SuccessJson(
      public val json: PaymentRecord,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentRecordsIdReportPaymentAttemptResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentRecordsIdReportPaymentAttemptResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentRecordsIdReportPaymentAttemptResponse
  }

  private object PostPaymentRecordsIdReportPaymentAttemptResponseDecoder : SdkResponseAlternativeDecoder<PostPaymentRecordsIdReportPaymentAttemptResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPaymentRecordsIdReportPaymentAttemptResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPaymentRecordsIdReportPaymentAttemptResponse> = when {
      alternative.id == "PostPaymentRecordsIdReportPaymentAttempt.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPaymentRecordsIdReportPaymentAttemptResponse.SuccessJson(
          json = PaymentRecordsCodecs.postPaymentRecordsIdReportPaymentAttemptResponseCodecAlternative0Registry.select(listOf("PostPaymentRecordsIdReportPaymentAttempt.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPaymentRecordsIdReportPaymentAttempt.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPaymentRecordsIdReportPaymentAttemptResponse.DefaultJson(
          json = PaymentRecordsCodecs.postPaymentRecordsIdReportPaymentAttemptResponseCodecAlternative1Registry.select(listOf("PostPaymentRecordsIdReportPaymentAttempt.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPaymentRecordsIdReportPaymentAttemptResponse = PostPaymentRecordsIdReportPaymentAttemptResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPaymentRecordsIdReportPaymentAttemptCanceled`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface PostPaymentRecordsIdReportPaymentAttemptCanceledResponse {
    public class SuccessJson(
      public val json: PaymentRecord,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentRecordsIdReportPaymentAttemptCanceledResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentRecordsIdReportPaymentAttemptCanceledResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentRecordsIdReportPaymentAttemptCanceledResponse
  }

  private object PostPaymentRecordsIdReportPaymentAttemptCanceledResponseDecoder : SdkResponseAlternativeDecoder<PostPaymentRecordsIdReportPaymentAttemptCanceledResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPaymentRecordsIdReportPaymentAttemptCanceledResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPaymentRecordsIdReportPaymentAttemptCanceledResponse> = when {
      alternative.id == "PostPaymentRecordsIdReportPaymentAttemptCanceled.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPaymentRecordsIdReportPaymentAttemptCanceledResponse.SuccessJson(
          json = PaymentRecordsCodecs.postPaymentRecordsIdReportPaymentAttemptCanceledResponseCodecAlternative0Registry.select(listOf("PostPaymentRecordsIdReportPaymentAttemptCanceled.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPaymentRecordsIdReportPaymentAttemptCanceled.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPaymentRecordsIdReportPaymentAttemptCanceledResponse.DefaultJson(
          json = PaymentRecordsCodecs.postPaymentRecordsIdReportPaymentAttemptCanceledResponseCodecAlternative1Registry.select(listOf("PostPaymentRecordsIdReportPaymentAttemptCanceled.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPaymentRecordsIdReportPaymentAttemptCanceledResponse = PostPaymentRecordsIdReportPaymentAttemptCanceledResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPaymentRecordsIdReportPaymentAttemptFailed`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostPaymentRecordsIdReportPaymentAttemptFailedResponse {
    public class SuccessJson(
      public val json: PaymentRecord,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentRecordsIdReportPaymentAttemptFailedResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentRecordsIdReportPaymentAttemptFailedResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentRecordsIdReportPaymentAttemptFailedResponse
  }

  private object PostPaymentRecordsIdReportPaymentAttemptFailedResponseDecoder : SdkResponseAlternativeDecoder<PostPaymentRecordsIdReportPaymentAttemptFailedResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPaymentRecordsIdReportPaymentAttemptFailedResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPaymentRecordsIdReportPaymentAttemptFailedResponse> = when {
      alternative.id == "PostPaymentRecordsIdReportPaymentAttemptFailed.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPaymentRecordsIdReportPaymentAttemptFailedResponse.SuccessJson(
          json = PaymentRecordsCodecs.postPaymentRecordsIdReportPaymentAttemptFailedResponseCodecAlternative0Registry.select(listOf("PostPaymentRecordsIdReportPaymentAttemptFailed.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPaymentRecordsIdReportPaymentAttemptFailed.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPaymentRecordsIdReportPaymentAttemptFailedResponse.DefaultJson(
          json = PaymentRecordsCodecs.postPaymentRecordsIdReportPaymentAttemptFailedResponseCodecAlternative1Registry.select(listOf("PostPaymentRecordsIdReportPaymentAttemptFailed.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPaymentRecordsIdReportPaymentAttemptFailedResponse = PostPaymentRecordsIdReportPaymentAttemptFailedResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPaymentRecordsIdReportPaymentAttemptGuaranteed`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface PostPaymentRecordsIdReportPaymentAttemptGuaranteedResponse {
    public class SuccessJson(
      public val json: PaymentRecord,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentRecordsIdReportPaymentAttemptGuaranteedResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentRecordsIdReportPaymentAttemptGuaranteedResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentRecordsIdReportPaymentAttemptGuaranteedResponse
  }

  private object PostPaymentRecordsIdReportPaymentAttemptGuaranteedResponseDecoder : SdkResponseAlternativeDecoder<PostPaymentRecordsIdReportPaymentAttemptGuaranteedResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPaymentRecordsIdReportPaymentAttemptGuaranteedResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPaymentRecordsIdReportPaymentAttemptGuaranteedResponse> = when {
      alternative.id == "PostPaymentRecordsIdReportPaymentAttemptGuaranteed.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPaymentRecordsIdReportPaymentAttemptGuaranteedResponse.SuccessJson(
          json = PaymentRecordsCodecs.postPaymentRecordsIdReportPaymentAttemptGuaranteedResponseCodecAlternative0Registry.select(listOf("PostPaymentRecordsIdReportPaymentAttemptGuaranteed.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPaymentRecordsIdReportPaymentAttemptGuaranteed.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPaymentRecordsIdReportPaymentAttemptGuaranteedResponse.DefaultJson(
          json = PaymentRecordsCodecs.postPaymentRecordsIdReportPaymentAttemptGuaranteedResponseCodecAlternative1Registry.select(listOf("PostPaymentRecordsIdReportPaymentAttemptGuaranteed.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPaymentRecordsIdReportPaymentAttemptGuaranteedResponse = PostPaymentRecordsIdReportPaymentAttemptGuaranteedResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPaymentRecordsIdReportRefund`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostPaymentRecordsIdReportRefundResponse {
    public class SuccessJson(
      public val json: PaymentRecord,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentRecordsIdReportRefundResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentRecordsIdReportRefundResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentRecordsIdReportRefundResponse
  }

  private object PostPaymentRecordsIdReportRefundResponseDecoder : SdkResponseAlternativeDecoder<PostPaymentRecordsIdReportRefundResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPaymentRecordsIdReportRefundResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPaymentRecordsIdReportRefundResponse> = when {
      alternative.id == "PostPaymentRecordsIdReportRefund.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPaymentRecordsIdReportRefundResponse.SuccessJson(
          json = PaymentRecordsCodecs.postPaymentRecordsIdReportRefundResponseCodecAlternative0Registry.select(listOf("PostPaymentRecordsIdReportRefund.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPaymentRecordsIdReportRefund.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPaymentRecordsIdReportRefundResponse.DefaultJson(
          json = PaymentRecordsCodecs.postPaymentRecordsIdReportRefundResponseCodecAlternative1Registry.select(listOf("PostPaymentRecordsIdReportRefund.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPaymentRecordsIdReportRefundResponse = PostPaymentRecordsIdReportRefundResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPaymentRecordsReportPayment`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostPaymentRecordsReportPaymentResponse {
    public class SuccessJson(
      public val json: PaymentRecord,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentRecordsReportPaymentResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentRecordsReportPaymentResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentRecordsReportPaymentResponse
  }

  private object PostPaymentRecordsReportPaymentResponseDecoder : SdkResponseAlternativeDecoder<PostPaymentRecordsReportPaymentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPaymentRecordsReportPaymentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPaymentRecordsReportPaymentResponse> = when {
      alternative.id == "PostPaymentRecordsReportPayment.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPaymentRecordsReportPaymentResponse.SuccessJson(
          json = PaymentRecordsCodecs.postPaymentRecordsReportPaymentResponseCodecAlternative0Registry.select(listOf("PostPaymentRecordsReportPayment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPaymentRecordsReportPayment.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPaymentRecordsReportPaymentResponse.DefaultJson(
          json = PaymentRecordsCodecs.postPaymentRecordsReportPaymentResponseCodecAlternative1Registry.select(listOf("PostPaymentRecordsReportPayment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPaymentRecordsReportPaymentResponse = PostPaymentRecordsReportPaymentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val getPaymentRecordsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPaymentRecordsId",
          method = "GET",
          path = "/v1/payment_records/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentRecord",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentRecordsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentRecordsId.response.alternative1",
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

    public val postPaymentRecordsIdReportPaymentAttemptMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPaymentRecordsIdReportPaymentAttempt",
          method = "POST",
          path = "/v1/payment_records/{id}/report_payment_attempt",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentRecord",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentRecordsIdReportPaymentAttempt.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentRecordsIdReportPaymentAttempt.response.alternative1",
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

    public val postPaymentRecordsIdReportPaymentAttemptCanceledMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPaymentRecordsIdReportPaymentAttemptCanceled",
          method = "POST",
          path = "/v1/payment_records/{id}/report_payment_attempt_canceled",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentRecord",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentRecordsIdReportPaymentAttemptCanceled.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentRecordsIdReportPaymentAttemptCanceled.response.alternative1",
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

    public val postPaymentRecordsIdReportPaymentAttemptFailedMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPaymentRecordsIdReportPaymentAttemptFailed",
          method = "POST",
          path = "/v1/payment_records/{id}/report_payment_attempt_failed",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentRecord",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentRecordsIdReportPaymentAttemptFailed.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentRecordsIdReportPaymentAttemptFailed.response.alternative1",
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

    public val postPaymentRecordsIdReportPaymentAttemptGuaranteedMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPaymentRecordsIdReportPaymentAttemptGuaranteed",
          method = "POST",
          path = "/v1/payment_records/{id}/report_payment_attempt_guaranteed",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentRecord",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentRecordsIdReportPaymentAttemptGuaranteed.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentRecordsIdReportPaymentAttemptGuaranteed.response.alternative1",
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

    public val postPaymentRecordsIdReportRefundMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPaymentRecordsIdReportRefund",
          method = "POST",
          path = "/v1/payment_records/{id}/report_refund",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentRecord",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentRecordsIdReportRefund.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentRecordsIdReportRefund.response.alternative1",
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

    public val postPaymentRecordsReportPaymentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPaymentRecordsReportPayment",
          method = "POST",
          path = "/v1/payment_records/report_payment",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentRecord",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentRecordsReportPayment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentRecordsReportPayment.response.alternative1",
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
