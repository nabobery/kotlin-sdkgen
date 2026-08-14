package io.github.nabobery.sdkgen.generated.stripe.charges

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
import io.github.nabobery.sdkgen.generated.stripe.Charge
import io.github.nabobery.sdkgen.generated.stripe.Dispute
import io.github.nabobery.sdkgen.generated.stripe.Error
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ChargesCapturePostRequestFormXf632138c
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ChargesDisputeClosePostRequestFormX6a182c04
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ChargesGetParameterX3e2709be
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ChargesGetResponse200JsonXceababe3
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ChargesPostRequestFormX806eeb10
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ChargesPostRequestFormXa27d03d9
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ChargesRefundPostRequestFormX2fe0e159
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ChargesRefundsGetResponse200JsonX440d849e
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ChargesRefundsPostRequestFormX098d24da
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ChargesRefundsPostRequestFormXa55fb322
import io.github.nabobery.sdkgen.generated.stripe.InlineV1ChargesSearchGetResponse200JsonX25e1d7b2
import io.github.nabobery.sdkgen.generated.stripe.Refund
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object ChargesCodecs {
  internal const val GETCHARGES_REQUEST_CODEC_ID: String = "GetCharges.request"

  private val getChargesRequestCodec: MediaTypeCodec<JsonObject?> = GetChargesFormCodec

  private val getChargesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1ChargesGetResponse200JsonXceababe3> =
      KotlinxSerializationCodec("GetCharges.response.alternative0", InlineV1ChargesGetResponse200JsonXceababe3.Serializer, SdkJson)

  internal val getChargesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1ChargesGetResponse200JsonXceababe3> =
      MediaTypeCodecRegistry.of(getChargesResponseCodecAlternative0Codec)

  private val getChargesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCharges.response.alternative1", Error.Serializer, SdkJson)

  internal val getChargesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getChargesResponseCodecAlternative1Codec)

  internal val getChargesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getChargesRequestCodec)

  internal const val GETCHARGESCHARGE_REQUEST_CODEC_ID: String = "GetChargesCharge.request"

  private val getChargesChargeRequestCodec: MediaTypeCodec<JsonObject?> = GetChargesChargeFormCodec

  private val getChargesChargeResponseCodecAlternative0Codec: MediaTypeCodec<Charge> =
      KotlinxSerializationCodec("GetChargesCharge.response.alternative0", Charge.Serializer, SdkJson)

  internal val getChargesChargeResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Charge> =
      MediaTypeCodecRegistry.of(getChargesChargeResponseCodecAlternative0Codec)

  private val getChargesChargeResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetChargesCharge.response.alternative1", Error.Serializer, SdkJson)

  internal val getChargesChargeResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getChargesChargeResponseCodecAlternative1Codec)

  internal val getChargesChargeRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getChargesChargeRequestCodec)

  internal const val GETCHARGESCHARGEDISPUTE_REQUEST_CODEC_ID: String =
      "GetChargesChargeDispute.request"

  private val getChargesChargeDisputeRequestCodec: MediaTypeCodec<JsonObject?> =
      GetChargesChargeDisputeFormCodec

  private val getChargesChargeDisputeResponseCodecAlternative0Codec: MediaTypeCodec<Dispute> =
      KotlinxSerializationCodec("GetChargesChargeDispute.response.alternative0", Dispute.Serializer, SdkJson)

  internal val getChargesChargeDisputeResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Dispute> =
      MediaTypeCodecRegistry.of(getChargesChargeDisputeResponseCodecAlternative0Codec)

  private val getChargesChargeDisputeResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetChargesChargeDispute.response.alternative1", Error.Serializer, SdkJson)

  internal val getChargesChargeDisputeResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getChargesChargeDisputeResponseCodecAlternative1Codec)

  internal val getChargesChargeDisputeRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getChargesChargeDisputeRequestCodec)

  internal const val GETCHARGESCHARGEREFUNDS_REQUEST_CODEC_ID: String =
      "GetChargesChargeRefunds.request"

  private val getChargesChargeRefundsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetChargesChargeRefundsFormCodec

  private val getChargesChargeRefundsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1ChargesRefundsGetResponse200JsonX440d849e> =
      KotlinxSerializationCodec("GetChargesChargeRefunds.response.alternative0", InlineV1ChargesRefundsGetResponse200JsonX440d849e.Serializer, SdkJson)

  internal val getChargesChargeRefundsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1ChargesRefundsGetResponse200JsonX440d849e> =
      MediaTypeCodecRegistry.of(getChargesChargeRefundsResponseCodecAlternative0Codec)

  private val getChargesChargeRefundsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetChargesChargeRefunds.response.alternative1", Error.Serializer, SdkJson)

  internal val getChargesChargeRefundsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getChargesChargeRefundsResponseCodecAlternative1Codec)

  internal val getChargesChargeRefundsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getChargesChargeRefundsRequestCodec)

  internal const val GETCHARGESCHARGEREFUNDSREFUND_REQUEST_CODEC_ID: String =
      "GetChargesChargeRefundsRefund.request"

  private val getChargesChargeRefundsRefundRequestCodec: MediaTypeCodec<JsonObject?> =
      GetChargesChargeRefundsRefundFormCodec

  private val getChargesChargeRefundsRefundResponseCodecAlternative0Codec: MediaTypeCodec<Refund> =
      KotlinxSerializationCodec("GetChargesChargeRefundsRefund.response.alternative0", Refund.Serializer, SdkJson)

  internal val getChargesChargeRefundsRefundResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Refund> =
      MediaTypeCodecRegistry.of(getChargesChargeRefundsRefundResponseCodecAlternative0Codec)

  private val getChargesChargeRefundsRefundResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetChargesChargeRefundsRefund.response.alternative1", Error.Serializer, SdkJson)

  internal val getChargesChargeRefundsRefundResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getChargesChargeRefundsRefundResponseCodecAlternative1Codec)

  internal val getChargesChargeRefundsRefundRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getChargesChargeRefundsRefundRequestCodec)

  internal const val GETCHARGESSEARCH_REQUEST_CODEC_ID: String = "GetChargesSearch.request"

  private val getChargesSearchRequestCodec: MediaTypeCodec<JsonObject?> = GetChargesSearchFormCodec

  private val getChargesSearchResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1ChargesSearchGetResponse200JsonX25e1d7b2> =
      KotlinxSerializationCodec("GetChargesSearch.response.alternative0", InlineV1ChargesSearchGetResponse200JsonX25e1d7b2.Serializer, SdkJson)

  internal val getChargesSearchResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1ChargesSearchGetResponse200JsonX25e1d7b2> =
      MediaTypeCodecRegistry.of(getChargesSearchResponseCodecAlternative0Codec)

  private val getChargesSearchResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetChargesSearch.response.alternative1", Error.Serializer, SdkJson)

  internal val getChargesSearchResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getChargesSearchResponseCodecAlternative1Codec)

  internal val getChargesSearchRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getChargesSearchRequestCodec)

  internal const val POSTCHARGES_REQUEST_CODEC_ID: String = "PostCharges.request"

  private val postChargesRequestCodec: MediaTypeCodec<InlineV1ChargesPostRequestFormX806eeb10?> =
      PostChargesFormCodec

  private val postChargesResponseCodecAlternative0Codec: MediaTypeCodec<Charge> =
      KotlinxSerializationCodec("PostCharges.response.alternative0", Charge.Serializer, SdkJson)

  internal val postChargesResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Charge> =
      MediaTypeCodecRegistry.of(postChargesResponseCodecAlternative0Codec)

  private val postChargesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostCharges.response.alternative1", Error.Serializer, SdkJson)

  internal val postChargesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postChargesResponseCodecAlternative1Codec)

  internal val postChargesRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ChargesPostRequestFormX806eeb10?> =
      MediaTypeCodecRegistry.of(postChargesRequestCodec)

  internal const val POSTCHARGESCHARGE_REQUEST_CODEC_ID: String = "PostChargesCharge.request"

  private val postChargesChargeRequestCodec:
      MediaTypeCodec<InlineV1ChargesPostRequestFormXa27d03d9?> = PostChargesChargeFormCodec

  private val postChargesChargeResponseCodecAlternative0Codec: MediaTypeCodec<Charge> =
      KotlinxSerializationCodec("PostChargesCharge.response.alternative0", Charge.Serializer, SdkJson)

  internal val postChargesChargeResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Charge> =
      MediaTypeCodecRegistry.of(postChargesChargeResponseCodecAlternative0Codec)

  private val postChargesChargeResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostChargesCharge.response.alternative1", Error.Serializer, SdkJson)

  internal val postChargesChargeResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postChargesChargeResponseCodecAlternative1Codec)

  internal val postChargesChargeRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ChargesPostRequestFormXa27d03d9?> =
      MediaTypeCodecRegistry.of(postChargesChargeRequestCodec)

  internal const val POSTCHARGESCHARGECAPTURE_REQUEST_CODEC_ID: String =
      "PostChargesChargeCapture.request"

  private val postChargesChargeCaptureRequestCodec:
      MediaTypeCodec<InlineV1ChargesCapturePostRequestFormXf632138c?> =
      PostChargesChargeCaptureFormCodec

  private val postChargesChargeCaptureResponseCodecAlternative0Codec: MediaTypeCodec<Charge> =
      KotlinxSerializationCodec("PostChargesChargeCapture.response.alternative0", Charge.Serializer, SdkJson)

  internal val postChargesChargeCaptureResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Charge> =
      MediaTypeCodecRegistry.of(postChargesChargeCaptureResponseCodecAlternative0Codec)

  private val postChargesChargeCaptureResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostChargesChargeCapture.response.alternative1", Error.Serializer, SdkJson)

  internal val postChargesChargeCaptureResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postChargesChargeCaptureResponseCodecAlternative1Codec)

  internal val postChargesChargeCaptureRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ChargesCapturePostRequestFormXf632138c?> =
      MediaTypeCodecRegistry.of(postChargesChargeCaptureRequestCodec)

  internal const val POSTCHARGESCHARGEDISPUTECLOSE_REQUEST_CODEC_ID: String =
      "PostChargesChargeDisputeClose.request"

  private val postChargesChargeDisputeCloseRequestCodec:
      MediaTypeCodec<InlineV1ChargesDisputeClosePostRequestFormX6a182c04?> =
      PostChargesChargeDisputeCloseFormCodec

  private val postChargesChargeDisputeCloseResponseCodecAlternative0Codec: MediaTypeCodec<Dispute> =
      KotlinxSerializationCodec("PostChargesChargeDisputeClose.response.alternative0", Dispute.Serializer, SdkJson)

  internal val postChargesChargeDisputeCloseResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Dispute> =
      MediaTypeCodecRegistry.of(postChargesChargeDisputeCloseResponseCodecAlternative0Codec)

  private val postChargesChargeDisputeCloseResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostChargesChargeDisputeClose.response.alternative1", Error.Serializer, SdkJson)

  internal val postChargesChargeDisputeCloseResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postChargesChargeDisputeCloseResponseCodecAlternative1Codec)

  internal val postChargesChargeDisputeCloseRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ChargesDisputeClosePostRequestFormX6a182c04?> =
      MediaTypeCodecRegistry.of(postChargesChargeDisputeCloseRequestCodec)

  internal const val POSTCHARGESCHARGEREFUND_REQUEST_CODEC_ID: String =
      "PostChargesChargeRefund.request"

  private val postChargesChargeRefundRequestCodec:
      MediaTypeCodec<InlineV1ChargesRefundPostRequestFormX2fe0e159?> =
      PostChargesChargeRefundFormCodec

  private val postChargesChargeRefundResponseCodecAlternative0Codec: MediaTypeCodec<Charge> =
      KotlinxSerializationCodec("PostChargesChargeRefund.response.alternative0", Charge.Serializer, SdkJson)

  internal val postChargesChargeRefundResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Charge> =
      MediaTypeCodecRegistry.of(postChargesChargeRefundResponseCodecAlternative0Codec)

  private val postChargesChargeRefundResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostChargesChargeRefund.response.alternative1", Error.Serializer, SdkJson)

  internal val postChargesChargeRefundResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postChargesChargeRefundResponseCodecAlternative1Codec)

  internal val postChargesChargeRefundRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ChargesRefundPostRequestFormX2fe0e159?> =
      MediaTypeCodecRegistry.of(postChargesChargeRefundRequestCodec)

  internal const val POSTCHARGESCHARGEREFUNDS_REQUEST_CODEC_ID: String =
      "PostChargesChargeRefunds.request"

  private val postChargesChargeRefundsRequestCodec:
      MediaTypeCodec<InlineV1ChargesRefundsPostRequestFormX098d24da?> =
      PostChargesChargeRefundsFormCodec

  private val postChargesChargeRefundsResponseCodecAlternative0Codec: MediaTypeCodec<Refund> =
      KotlinxSerializationCodec("PostChargesChargeRefunds.response.alternative0", Refund.Serializer, SdkJson)

  internal val postChargesChargeRefundsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Refund> =
      MediaTypeCodecRegistry.of(postChargesChargeRefundsResponseCodecAlternative0Codec)

  private val postChargesChargeRefundsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostChargesChargeRefunds.response.alternative1", Error.Serializer, SdkJson)

  internal val postChargesChargeRefundsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postChargesChargeRefundsResponseCodecAlternative1Codec)

  internal val postChargesChargeRefundsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ChargesRefundsPostRequestFormX098d24da?> =
      MediaTypeCodecRegistry.of(postChargesChargeRefundsRequestCodec)

  internal const val POSTCHARGESCHARGEREFUNDSREFUND_REQUEST_CODEC_ID: String =
      "PostChargesChargeRefundsRefund.request"

  private val postChargesChargeRefundsRefundRequestCodec:
      MediaTypeCodec<InlineV1ChargesRefundsPostRequestFormXa55fb322?> =
      PostChargesChargeRefundsRefundFormCodec

  private val postChargesChargeRefundsRefundResponseCodecAlternative0Codec: MediaTypeCodec<Refund> =
      KotlinxSerializationCodec("PostChargesChargeRefundsRefund.response.alternative0", Refund.Serializer, SdkJson)

  internal val postChargesChargeRefundsRefundResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Refund> =
      MediaTypeCodecRegistry.of(postChargesChargeRefundsRefundResponseCodecAlternative0Codec)

  private val postChargesChargeRefundsRefundResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostChargesChargeRefundsRefund.response.alternative1", Error.Serializer, SdkJson)

  internal val postChargesChargeRefundsRefundResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postChargesChargeRefundsRefundResponseCodecAlternative1Codec)

  internal val postChargesChargeRefundsRefundRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ChargesRefundsPostRequestFormXa55fb322?> =
      MediaTypeCodecRegistry.of(postChargesChargeRefundsRefundRequestCodec)

  internal object GetChargesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCharges.request"

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

  internal object GetChargesChargeFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetChargesCharge.request"

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

  internal object GetChargesChargeDisputeFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetChargesChargeDispute.request"

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

  internal object GetChargesChargeRefundsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetChargesChargeRefunds.request"

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

  internal object GetChargesChargeRefundsRefundFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetChargesChargeRefundsRefund.request"

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

  internal object GetChargesSearchFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetChargesSearch.request"

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

  internal object PostChargesFormCodec : MediaTypeCodec<InlineV1ChargesPostRequestFormX806eeb10?> {
    override val id: String = "PostCharges.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ChargesPostRequestFormX806eeb10?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount?.let { formValue0 ->
        form.add("amount", formValue0.toString())
      }
      request.applicationFee?.let { formValue0 ->
        form.add("application_fee", formValue0.toString())
      }
      request.applicationFeeAmount?.let { formValue0 ->
        form.add("application_fee_amount", formValue0.toString())
      }
      request.capture?.let { formValue0 ->
        form.add("capture", formValue0.toString())
      }
      request.card?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.inlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d != null -> {
            requireNotNull(formValue0.inlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d).addressCity?.let { formValue3 ->
              form.add("card" + "[address_city]", formValue3)
            }
            requireNotNull(formValue0.inlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d).addressCountry?.let { formValue3 ->
              form.add("card" + "[address_country]", formValue3)
            }
            requireNotNull(formValue0.inlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d).addressLine1?.let { formValue3 ->
              form.add("card" + "[address_line1]", formValue3)
            }
            requireNotNull(formValue0.inlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d).addressLine2?.let { formValue3 ->
              form.add("card" + "[address_line2]", formValue3)
            }
            requireNotNull(formValue0.inlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d).addressState?.let { formValue3 ->
              form.add("card" + "[address_state]", formValue3)
            }
            requireNotNull(formValue0.inlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d).addressZip?.let { formValue3 ->
              form.add("card" + "[address_zip]", formValue3)
            }
            requireNotNull(formValue0.inlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d).cvc?.let { formValue3 ->
              form.add("card" + "[cvc]", formValue3)
            }
            requireNotNull(formValue0.inlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d).encrypted?.let { formValue3 ->
              form.add("card" + "[encrypted]", formValue3)
            }
            form.add("card" + "[exp_month]", requireNotNull(formValue0.inlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d).expMonth.toString())
            form.add("card" + "[exp_year]", requireNotNull(formValue0.inlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d).expYear.toString())
            requireNotNull(formValue0.inlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d).metadata?.let { formValue3 ->
              formValue3.forEach { (formKey4, formMapValue4) ->
                form.add("card" + "[metadata]" + "[" + formKey4 + "]", formMapValue4)
              }
            }
            requireNotNull(formValue0.inlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d).name?.let { formValue3 ->
              form.add("card" + "[name]", formValue3)
            }
            requireNotNull(formValue0.inlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d).networkToken?.let { formValue3 ->
              formValue3.number?.let { formValue5 ->
                form.add("card" + "[network_token]" + "[number]", formValue5)
              }
            }
            form.add("card" + "[number]", requireNotNull(formValue0.inlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d).number)
            requireNotNull(formValue0.inlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d).objectValue?.let { formValue3 ->
              form.add("card" + "[object]", formValue3.value)
            }
            requireNotNull(formValue0.inlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d).swipeData?.let { formValue3 ->
              form.add("card" + "[swipe_data]", formValue3)
            }
          }
          formValue0.branch2 != null -> {
            form.add("card", requireNotNull(formValue0.branch2))
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.currency?.let { formValue0 ->
        form.add("currency", formValue0)
      }
      request.customer?.let { formValue0 ->
        form.add("customer", formValue0)
      }
      request.description?.let { formValue0 ->
        form.add("description", formValue0)
      }
      request.destination?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.inlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead != null -> {
            form.add("destination" + "[account]", requireNotNull(formValue0.inlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead).account)
            requireNotNull(formValue0.inlineV1ChargesPostRequestFormDestinationAnyOf1Xb2aedead).amount?.let { formValue3 ->
              form.add("destination" + "[amount]", formValue3.toString())
            }
          }
          formValue0.branch2 != null -> {
            form.add("destination", requireNotNull(formValue0.branch2))
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
          formValue0.inlineV1ChargesPostRequestFormMetadataAnyOf2X7b3438b8 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1ChargesPostRequestFormMetadataAnyOf2X7b3438b8).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.onBehalfOf?.let { formValue0 ->
        form.add("on_behalf_of", formValue0)
      }
      request.radarOptions?.let { formValue0 ->
        formValue0.session?.let { formValue2 ->
          form.add("radar_options" + "[session]", formValue2)
        }
      }
      request.receiptEmail?.let { formValue0 ->
        form.add("receipt_email", formValue0)
      }
      request.shipping?.let { formValue0 ->
        formValue0.address.city?.let { formValue3 ->
          form.add("shipping" + "[address]" + "[city]", formValue3)
        }
        formValue0.address.country?.let { formValue3 ->
          form.add("shipping" + "[address]" + "[country]", formValue3)
        }
        formValue0.address.line1?.let { formValue3 ->
          form.add("shipping" + "[address]" + "[line1]", formValue3)
        }
        formValue0.address.line2?.let { formValue3 ->
          form.add("shipping" + "[address]" + "[line2]", formValue3)
        }
        formValue0.address.postalCode?.let { formValue3 ->
          form.add("shipping" + "[address]" + "[postal_code]", formValue3)
        }
        formValue0.address.state?.let { formValue3 ->
          form.add("shipping" + "[address]" + "[state]", formValue3)
        }
        formValue0.carrier?.let { formValue2 ->
          form.add("shipping" + "[carrier]", formValue2)
        }
        form.add("shipping" + "[name]", formValue0.name)
        formValue0.phone?.let { formValue2 ->
          form.add("shipping" + "[phone]", formValue2)
        }
        formValue0.trackingNumber?.let { formValue2 ->
          form.add("shipping" + "[tracking_number]", formValue2)
        }
      }
      request.source?.let { formValue0 ->
        form.add("source", formValue0)
      }
      request.statementDescriptor?.let { formValue0 ->
        form.add("statement_descriptor", formValue0)
      }
      request.statementDescriptorSuffix?.let { formValue0 ->
        form.add("statement_descriptor_suffix", formValue0)
      }
      request.transferData?.let { formValue0 ->
        formValue0.amount?.let { formValue2 ->
          form.add("transfer_data" + "[amount]", formValue2.toString())
        }
        formValue0.description?.let { formValue2 ->
          form.add("transfer_data" + "[description]", formValue2)
        }
        form.add("transfer_data" + "[destination]", formValue0.destination)
      }
      request.transferGroup?.let { formValue0 ->
        form.add("transfer_group", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ChargesPostRequestFormX806eeb10? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostChargesChargeFormCodec : MediaTypeCodec<InlineV1ChargesPostRequestFormXa27d03d9?> {
    override val id: String = "PostChargesCharge.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ChargesPostRequestFormXa27d03d9?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.customer?.let { formValue0 ->
        form.add("customer", formValue0)
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
      request.fraudDetails?.let { formValue0 ->
        form.add("fraud_details" + "[user_report]", formValue0.userReport.value)
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
          formValue0.inlineV1ChargesPostRequestFormMetadataAnyOf2X8d04583c != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1ChargesPostRequestFormMetadataAnyOf2X8d04583c).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.receiptEmail?.let { formValue0 ->
        form.add("receipt_email", formValue0)
      }
      request.shipping?.let { formValue0 ->
        formValue0.address.city?.let { formValue3 ->
          form.add("shipping" + "[address]" + "[city]", formValue3)
        }
        formValue0.address.country?.let { formValue3 ->
          form.add("shipping" + "[address]" + "[country]", formValue3)
        }
        formValue0.address.line1?.let { formValue3 ->
          form.add("shipping" + "[address]" + "[line1]", formValue3)
        }
        formValue0.address.line2?.let { formValue3 ->
          form.add("shipping" + "[address]" + "[line2]", formValue3)
        }
        formValue0.address.postalCode?.let { formValue3 ->
          form.add("shipping" + "[address]" + "[postal_code]", formValue3)
        }
        formValue0.address.state?.let { formValue3 ->
          form.add("shipping" + "[address]" + "[state]", formValue3)
        }
        formValue0.carrier?.let { formValue2 ->
          form.add("shipping" + "[carrier]", formValue2)
        }
        form.add("shipping" + "[name]", formValue0.name)
        formValue0.phone?.let { formValue2 ->
          form.add("shipping" + "[phone]", formValue2)
        }
        formValue0.trackingNumber?.let { formValue2 ->
          form.add("shipping" + "[tracking_number]", formValue2)
        }
      }
      request.transferGroup?.let { formValue0 ->
        form.add("transfer_group", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ChargesPostRequestFormXa27d03d9? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostChargesChargeCaptureFormCodec : MediaTypeCodec<InlineV1ChargesCapturePostRequestFormXf632138c?> {
    override val id: String = "PostChargesChargeCapture.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ChargesCapturePostRequestFormXf632138c?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount?.let { formValue0 ->
        form.add("amount", formValue0.toString())
      }
      request.applicationFee?.let { formValue0 ->
        form.add("application_fee", formValue0.toString())
      }
      request.applicationFeeAmount?.let { formValue0 ->
        form.add("application_fee_amount", formValue0.toString())
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
      request.receiptEmail?.let { formValue0 ->
        form.add("receipt_email", formValue0)
      }
      request.statementDescriptor?.let { formValue0 ->
        form.add("statement_descriptor", formValue0)
      }
      request.statementDescriptorSuffix?.let { formValue0 ->
        form.add("statement_descriptor_suffix", formValue0)
      }
      request.transferData?.let { formValue0 ->
        formValue0.amount?.let { formValue2 ->
          form.add("transfer_data" + "[amount]", formValue2.toString())
        }
      }
      request.transferGroup?.let { formValue0 ->
        form.add("transfer_group", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ChargesCapturePostRequestFormXf632138c? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostChargesChargeDisputeCloseFormCodec : MediaTypeCodec<InlineV1ChargesDisputeClosePostRequestFormX6a182c04?> {
    override val id: String = "PostChargesChargeDisputeClose.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ChargesDisputeClosePostRequestFormX6a182c04?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ChargesDisputeClosePostRequestFormX6a182c04? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostChargesChargeRefundFormCodec : MediaTypeCodec<InlineV1ChargesRefundPostRequestFormX2fe0e159?> {
    override val id: String = "PostChargesChargeRefund.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ChargesRefundPostRequestFormX2fe0e159?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount?.let { formValue0 ->
        form.add("amount", formValue0.toString())
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
          formValue0.inlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1ChargesRefundPostRequestFormMetadataAnyOf2X8c4e9b2d).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ChargesRefundPostRequestFormX2fe0e159? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostChargesChargeRefundsFormCodec : MediaTypeCodec<InlineV1ChargesRefundsPostRequestFormX098d24da?> {
    override val id: String = "PostChargesChargeRefunds.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ChargesRefundsPostRequestFormX098d24da?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount?.let { formValue0 ->
        form.add("amount", formValue0.toString())
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
          formValue0.inlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f).value)
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ChargesRefundsPostRequestFormX098d24da? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostChargesChargeRefundsRefundFormCodec : MediaTypeCodec<InlineV1ChargesRefundsPostRequestFormXa55fb322?> {
    override val id: String = "PostChargesChargeRefundsRefund.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ChargesRefundsPostRequestFormXa55fb322?, mediaType: String): SdkRequestBody {
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
          formValue0.inlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1ChargesRefundsPostRequestFormMetadataAnyOf2X770daa10).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ChargesRefundsPostRequestFormXa55fb322? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'charges' group of Stripe API.
 */
public class ChargesClient(
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
      SdkExecutor(transport, authentication = this@ChargesClient.authentication)

  /**
   * <p>Returns a list of charges you’ve previously created. The charges are returned in sorted order, with the most
   * recent charges appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return charges that were created during the given date interval.
   * @param customer Only return charges for the customer specified by this customer ID.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param paymentIntent Only return charges that were created by the PaymentIntent specified by this PaymentIntent ID.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param transferGroup Only return charges for this transfer group, limited to 100.
   * @param options Execution options.
   */
  public suspend fun getChargesWithResponse(
    request: JsonObject? = null,
    created: InlineV1ChargesGetParameterX3e2709be? = null,
    customer: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    paymentIntent: String? = null,
    startingAfter: String? = null,
    transferGroup: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetChargesResponse> = executor.executeWithResponse<JsonObject?, GetChargesResponse>(SdkExecutionRequest(getChargesMetadata, baseUri, request, listOf(ChargesCodecs.GETCHARGES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer", values = customer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "payment_intent", values = paymentIntent?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "transfer_group", values = transferGroup?.let { listOf(it.toString()) }.orEmpty()))
  }), ChargesCodecs.getChargesRequestCodecRegistry, GetChargesResponseDecoder, options)

  /**
   * <p>Retrieves the details of a charge that has previously been created. Supply the unique charge ID that was
   * returned from your previous request, and Stripe will return the corresponding charge information. The same
   * information is returned when creating or refunding the charge.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param charge Wire parameter `charge`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getChargesChargeWithResponse(
    request: JsonObject? = null,
    charge: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetChargesChargeResponse> = executor.executeWithResponse<JsonObject?, GetChargesChargeResponse>(SdkExecutionRequest(getChargesChargeMetadata, baseUri, request, listOf(ChargesCodecs.GETCHARGESCHARGE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "charge", values = listOf(charge.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), ChargesCodecs.getChargesChargeRequestCodecRegistry, GetChargesChargeResponseDecoder, options)

  /**
   * <p>Retrieve a dispute for a specified charge.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param charge Wire parameter `charge`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getChargesChargeDisputeWithResponse(
    request: JsonObject? = null,
    charge: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetChargesChargeDisputeResponse> = executor.executeWithResponse<JsonObject?, GetChargesChargeDisputeResponse>(SdkExecutionRequest(getChargesChargeDisputeMetadata, baseUri, request, listOf(ChargesCodecs.GETCHARGESCHARGEDISPUTE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "charge", values = listOf(charge.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), ChargesCodecs.getChargesChargeDisputeRequestCodecRegistry, GetChargesChargeDisputeResponseDecoder, options)

  /**
   * <p>You can see a list of the refunds belonging to a specific charge. Note that the 10 most recent refunds are
   * always available by default on the charge object. If you need more than those 10, you can use this API method and
   * the <code>limit</code> and <code>starting_after</code> parameters to page through additional refunds.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param charge Wire parameter `charge`.
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
  public suspend fun getChargesChargeRefundsWithResponse(
    request: JsonObject? = null,
    charge: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetChargesChargeRefundsResponse> = executor.executeWithResponse<JsonObject?, GetChargesChargeRefundsResponse>(SdkExecutionRequest(getChargesChargeRefundsMetadata, baseUri, request, listOf(ChargesCodecs.GETCHARGESCHARGEREFUNDS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "charge", values = listOf(charge.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), ChargesCodecs.getChargesChargeRefundsRequestCodecRegistry, GetChargesChargeRefundsResponseDecoder, options)

  /**
   * <p>Retrieves the details of an existing refund.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param charge Wire parameter `charge`.
   * @param refund Wire parameter `refund`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getChargesChargeRefundsRefundWithResponse(
    request: JsonObject? = null,
    charge: String,
    refund: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetChargesChargeRefundsRefundResponse> = executor.executeWithResponse<JsonObject?, GetChargesChargeRefundsRefundResponse>(SdkExecutionRequest(getChargesChargeRefundsRefundMetadata, baseUri, request, listOf(ChargesCodecs.GETCHARGESCHARGEREFUNDSREFUND_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "charge", values = listOf(charge.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "refund", values = listOf(refund.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), ChargesCodecs.getChargesChargeRefundsRefundRequestCodecRegistry, GetChargesChargeRefundsRefundResponseDecoder, options)

  /**
   * <p>Search for charges you’ve previously created using Stripe’s <a href="/docs/search#search-query-language">Search
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
   * charges](https://docs.stripe.com/search#query-fields-for-charges).
   * @param options Execution options.
   */
  public suspend fun getChargesSearchWithResponse(
    request: JsonObject? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    page: String? = null,
    query: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetChargesSearchResponse> = executor.executeWithResponse<JsonObject?, GetChargesSearchResponse>(SdkExecutionRequest(getChargesSearchMetadata, baseUri, request, listOf(ChargesCodecs.GETCHARGESSEARCH_REQUEST_CODEC_ID), buildList {
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "query", values = listOf(query.toString())))
  }), ChargesCodecs.getChargesSearchRequestCodecRegistry, GetChargesSearchResponseDecoder, options)

  /**
   * <p>This method is no longer recommended—use the <a href="/docs/api/payment_intents">Payment Intents API</a>
   * to initiate a new payment instead. Confirmation of the PaymentIntent creates the <code>Charge</code>
   * object used to request payment.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postChargesWithResponse(request: InlineV1ChargesPostRequestFormX806eeb10? = null, options: CallOptions = CallOptions()): SdkResponseResult<PostChargesResponse> = executor.executeWithResponse<InlineV1ChargesPostRequestFormX806eeb10?, PostChargesResponse>(SdkExecutionRequest(postChargesMetadata, baseUri, request, listOf(ChargesCodecs.POSTCHARGES_REQUEST_CODEC_ID), emptyList()), ChargesCodecs.postChargesRequestCodecRegistry, PostChargesResponseDecoder, options)

  /**
   * <p>Updates the specified charge by setting the values of the parameters passed. Any parameters not provided will be
   * left unchanged.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param charge Wire parameter `charge`.
   * @param options Execution options.
   */
  public suspend fun postChargesChargeWithResponse(
    request: InlineV1ChargesPostRequestFormXa27d03d9? = null,
    charge: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostChargesChargeResponse> = executor.executeWithResponse<InlineV1ChargesPostRequestFormXa27d03d9?, PostChargesChargeResponse>(SdkExecutionRequest(postChargesChargeMetadata, baseUri, request, listOf(ChargesCodecs.POSTCHARGESCHARGE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "charge", values = listOf(charge.toString())))
  }), ChargesCodecs.postChargesChargeRequestCodecRegistry, PostChargesChargeResponseDecoder, options)

  /**
   * <p>Capture the payment of an existing, uncaptured charge that was created with the <code>capture</code> option set
   * to false.</p>
   *
   * <p>Uncaptured payments expire a set number of days after they are created (<a href="/docs/charges/placing-a-hold">7
   * by default</a>), after which they are marked as refunded and capture attempts will fail.</p>
   *
   * <p>Don’t use this method to capture a PaymentIntent-initiated charge. Use <a
   * href="/docs/api/payment_intents/capture">Capture a PaymentIntent</a>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param charge Wire parameter `charge`.
   * @param options Execution options.
   */
  public suspend fun postChargesChargeCaptureWithResponse(
    request: InlineV1ChargesCapturePostRequestFormXf632138c? = null,
    charge: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostChargesChargeCaptureResponse> = executor.executeWithResponse<InlineV1ChargesCapturePostRequestFormXf632138c?, PostChargesChargeCaptureResponse>(SdkExecutionRequest(postChargesChargeCaptureMetadata, baseUri, request, listOf(ChargesCodecs.POSTCHARGESCHARGECAPTURE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "charge", values = listOf(charge.toString())))
  }), ChargesCodecs.postChargesChargeCaptureRequestCodecRegistry, PostChargesChargeCaptureResponseDecoder, options)

  /**
   *
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param charge Wire parameter `charge`.
   * @param options Execution options.
   */
  public suspend fun postChargesChargeDisputeCloseWithResponse(
    request: InlineV1ChargesDisputeClosePostRequestFormX6a182c04? = null,
    charge: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostChargesChargeDisputeCloseResponse> = executor.executeWithResponse<InlineV1ChargesDisputeClosePostRequestFormX6a182c04?, PostChargesChargeDisputeCloseResponse>(SdkExecutionRequest(postChargesChargeDisputeCloseMetadata, baseUri, request, listOf(ChargesCodecs.POSTCHARGESCHARGEDISPUTECLOSE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "charge", values = listOf(charge.toString())))
  }), ChargesCodecs.postChargesChargeDisputeCloseRequestCodecRegistry, PostChargesChargeDisputeCloseResponseDecoder, options)

  /**
   * <p>When you create a new refund, you must specify either a Charge or a PaymentIntent object.</p>
   *
   * <p>This action refunds a previously created charge that’s not refunded yet.
   * Funds are refunded to the credit or debit card that’s originally charged.</p>
   *
   * <p>You can optionally refund only part of a charge.
   * You can repeat this until the entire charge is refunded.</p>
   *
   * <p>After you entirely refund a charge, you can’t refund it again.
   * This method raises an error when it’s called on an already-refunded charge,
   * or when you attempt to refund more money than is left on a charge.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param charge The identifier of the charge to refund.
   * @param options Execution options.
   */
  public suspend fun postChargesChargeRefundWithResponse(
    request: InlineV1ChargesRefundPostRequestFormX2fe0e159? = null,
    charge: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostChargesChargeRefundResponse> = executor.executeWithResponse<InlineV1ChargesRefundPostRequestFormX2fe0e159?, PostChargesChargeRefundResponse>(SdkExecutionRequest(postChargesChargeRefundMetadata, baseUri, request, listOf(ChargesCodecs.POSTCHARGESCHARGEREFUND_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "charge", values = listOf(charge.toString())))
  }), ChargesCodecs.postChargesChargeRefundRequestCodecRegistry, PostChargesChargeRefundResponseDecoder, options)

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
   * @param charge The identifier of the charge to refund.
   * @param options Execution options.
   */
  public suspend fun postChargesChargeRefundsWithResponse(
    request: InlineV1ChargesRefundsPostRequestFormX098d24da? = null,
    charge: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostChargesChargeRefundsResponse> = executor.executeWithResponse<InlineV1ChargesRefundsPostRequestFormX098d24da?, PostChargesChargeRefundsResponse>(SdkExecutionRequest(postChargesChargeRefundsMetadata, baseUri, request, listOf(ChargesCodecs.POSTCHARGESCHARGEREFUNDS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "charge", values = listOf(charge.toString())))
  }), ChargesCodecs.postChargesChargeRefundsRequestCodecRegistry, PostChargesChargeRefundsResponseDecoder, options)

  /**
   * <p>Update a specified refund.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param charge Wire parameter `charge`.
   * @param refund Wire parameter `refund`.
   * @param options Execution options.
   */
  public suspend fun postChargesChargeRefundsRefundWithResponse(
    request: InlineV1ChargesRefundsPostRequestFormXa55fb322? = null,
    charge: String,
    refund: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostChargesChargeRefundsRefundResponse> = executor.executeWithResponse<InlineV1ChargesRefundsPostRequestFormXa55fb322?, PostChargesChargeRefundsRefundResponse>(SdkExecutionRequest(postChargesChargeRefundsRefundMetadata, baseUri, request, listOf(ChargesCodecs.POSTCHARGESCHARGEREFUNDSREFUND_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "charge", values = listOf(charge.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "refund", values = listOf(refund.toString())))
  }), ChargesCodecs.postChargesChargeRefundsRefundRequestCodecRegistry, PostChargesChargeRefundsRefundResponseDecoder, options)

  /**
   * Typed response alternatives for `GetCharges`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetChargesResponse {
    public class SuccessJson(
      public val json: InlineV1ChargesGetResponse200JsonXceababe3,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetChargesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetChargesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetChargesResponse
  }

  private object GetChargesResponseDecoder : SdkResponseAlternativeDecoder<GetChargesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetChargesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetChargesResponse> = when {
      alternative.id == "GetCharges.response.alternative0" -> SdkResponseDecodeResult(
        value = GetChargesResponse.SuccessJson(
          json = ChargesCodecs.getChargesResponseCodecAlternative0Registry.select(listOf("GetCharges.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCharges.response.alternative1" -> SdkResponseDecodeResult(
        value = GetChargesResponse.DefaultJson(
          json = ChargesCodecs.getChargesResponseCodecAlternative1Registry.select(listOf("GetCharges.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetChargesResponse = GetChargesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetChargesCharge`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetChargesChargeResponse {
    public class SuccessJson(
      public val json: Charge,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetChargesChargeResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetChargesChargeResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetChargesChargeResponse
  }

  private object GetChargesChargeResponseDecoder : SdkResponseAlternativeDecoder<GetChargesChargeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetChargesChargeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetChargesChargeResponse> = when {
      alternative.id == "GetChargesCharge.response.alternative0" -> SdkResponseDecodeResult(
        value = GetChargesChargeResponse.SuccessJson(
          json = ChargesCodecs.getChargesChargeResponseCodecAlternative0Registry.select(listOf("GetChargesCharge.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetChargesCharge.response.alternative1" -> SdkResponseDecodeResult(
        value = GetChargesChargeResponse.DefaultJson(
          json = ChargesCodecs.getChargesChargeResponseCodecAlternative1Registry.select(listOf("GetChargesCharge.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetChargesChargeResponse = GetChargesChargeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetChargesChargeDispute`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetChargesChargeDisputeResponse {
    public class SuccessJson(
      public val json: Dispute,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetChargesChargeDisputeResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetChargesChargeDisputeResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetChargesChargeDisputeResponse
  }

  private object GetChargesChargeDisputeResponseDecoder : SdkResponseAlternativeDecoder<GetChargesChargeDisputeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetChargesChargeDisputeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetChargesChargeDisputeResponse> = when {
      alternative.id == "GetChargesChargeDispute.response.alternative0" -> SdkResponseDecodeResult(
        value = GetChargesChargeDisputeResponse.SuccessJson(
          json = ChargesCodecs.getChargesChargeDisputeResponseCodecAlternative0Registry.select(listOf("GetChargesChargeDispute.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetChargesChargeDispute.response.alternative1" -> SdkResponseDecodeResult(
        value = GetChargesChargeDisputeResponse.DefaultJson(
          json = ChargesCodecs.getChargesChargeDisputeResponseCodecAlternative1Registry.select(listOf("GetChargesChargeDispute.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetChargesChargeDisputeResponse = GetChargesChargeDisputeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetChargesChargeRefunds`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetChargesChargeRefundsResponse {
    public class SuccessJson(
      public val json: InlineV1ChargesRefundsGetResponse200JsonX440d849e,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetChargesChargeRefundsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetChargesChargeRefundsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetChargesChargeRefundsResponse
  }

  private object GetChargesChargeRefundsResponseDecoder : SdkResponseAlternativeDecoder<GetChargesChargeRefundsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetChargesChargeRefundsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetChargesChargeRefundsResponse> = when {
      alternative.id == "GetChargesChargeRefunds.response.alternative0" -> SdkResponseDecodeResult(
        value = GetChargesChargeRefundsResponse.SuccessJson(
          json = ChargesCodecs.getChargesChargeRefundsResponseCodecAlternative0Registry.select(listOf("GetChargesChargeRefunds.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetChargesChargeRefunds.response.alternative1" -> SdkResponseDecodeResult(
        value = GetChargesChargeRefundsResponse.DefaultJson(
          json = ChargesCodecs.getChargesChargeRefundsResponseCodecAlternative1Registry.select(listOf("GetChargesChargeRefunds.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetChargesChargeRefundsResponse = GetChargesChargeRefundsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetChargesChargeRefundsRefund`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetChargesChargeRefundsRefundResponse {
    public class SuccessJson(
      public val json: Refund,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetChargesChargeRefundsRefundResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetChargesChargeRefundsRefundResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetChargesChargeRefundsRefundResponse
  }

  private object GetChargesChargeRefundsRefundResponseDecoder : SdkResponseAlternativeDecoder<GetChargesChargeRefundsRefundResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetChargesChargeRefundsRefundResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetChargesChargeRefundsRefundResponse> = when {
      alternative.id == "GetChargesChargeRefundsRefund.response.alternative0" -> SdkResponseDecodeResult(
        value = GetChargesChargeRefundsRefundResponse.SuccessJson(
          json = ChargesCodecs.getChargesChargeRefundsRefundResponseCodecAlternative0Registry.select(listOf("GetChargesChargeRefundsRefund.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetChargesChargeRefundsRefund.response.alternative1" -> SdkResponseDecodeResult(
        value = GetChargesChargeRefundsRefundResponse.DefaultJson(
          json = ChargesCodecs.getChargesChargeRefundsRefundResponseCodecAlternative1Registry.select(listOf("GetChargesChargeRefundsRefund.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetChargesChargeRefundsRefundResponse = GetChargesChargeRefundsRefundResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetChargesSearch`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetChargesSearchResponse {
    public class SuccessJson(
      public val json: InlineV1ChargesSearchGetResponse200JsonX25e1d7b2,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetChargesSearchResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetChargesSearchResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetChargesSearchResponse
  }

  private object GetChargesSearchResponseDecoder : SdkResponseAlternativeDecoder<GetChargesSearchResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetChargesSearchResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetChargesSearchResponse> = when {
      alternative.id == "GetChargesSearch.response.alternative0" -> SdkResponseDecodeResult(
        value = GetChargesSearchResponse.SuccessJson(
          json = ChargesCodecs.getChargesSearchResponseCodecAlternative0Registry.select(listOf("GetChargesSearch.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetChargesSearch.response.alternative1" -> SdkResponseDecodeResult(
        value = GetChargesSearchResponse.DefaultJson(
          json = ChargesCodecs.getChargesSearchResponseCodecAlternative1Registry.select(listOf("GetChargesSearch.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetChargesSearchResponse = GetChargesSearchResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCharges`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostChargesResponse {
    public class SuccessJson(
      public val json: Charge,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesResponse
  }

  private object PostChargesResponseDecoder : SdkResponseAlternativeDecoder<PostChargesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostChargesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostChargesResponse> = when {
      alternative.id == "PostCharges.response.alternative0" -> SdkResponseDecodeResult(
        value = PostChargesResponse.SuccessJson(
          json = ChargesCodecs.postChargesResponseCodecAlternative0Registry.select(listOf("PostCharges.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCharges.response.alternative1" -> SdkResponseDecodeResult(
        value = PostChargesResponse.DefaultJson(
          json = ChargesCodecs.postChargesResponseCodecAlternative1Registry.select(listOf("PostCharges.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostChargesResponse = PostChargesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostChargesCharge`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostChargesChargeResponse {
    public class SuccessJson(
      public val json: Charge,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesChargeResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesChargeResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesChargeResponse
  }

  private object PostChargesChargeResponseDecoder : SdkResponseAlternativeDecoder<PostChargesChargeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostChargesChargeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostChargesChargeResponse> = when {
      alternative.id == "PostChargesCharge.response.alternative0" -> SdkResponseDecodeResult(
        value = PostChargesChargeResponse.SuccessJson(
          json = ChargesCodecs.postChargesChargeResponseCodecAlternative0Registry.select(listOf("PostChargesCharge.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostChargesCharge.response.alternative1" -> SdkResponseDecodeResult(
        value = PostChargesChargeResponse.DefaultJson(
          json = ChargesCodecs.postChargesChargeResponseCodecAlternative1Registry.select(listOf("PostChargesCharge.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostChargesChargeResponse = PostChargesChargeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostChargesChargeCapture`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostChargesChargeCaptureResponse {
    public class SuccessJson(
      public val json: Charge,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesChargeCaptureResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesChargeCaptureResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesChargeCaptureResponse
  }

  private object PostChargesChargeCaptureResponseDecoder : SdkResponseAlternativeDecoder<PostChargesChargeCaptureResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostChargesChargeCaptureResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostChargesChargeCaptureResponse> = when {
      alternative.id == "PostChargesChargeCapture.response.alternative0" -> SdkResponseDecodeResult(
        value = PostChargesChargeCaptureResponse.SuccessJson(
          json = ChargesCodecs.postChargesChargeCaptureResponseCodecAlternative0Registry.select(listOf("PostChargesChargeCapture.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostChargesChargeCapture.response.alternative1" -> SdkResponseDecodeResult(
        value = PostChargesChargeCaptureResponse.DefaultJson(
          json = ChargesCodecs.postChargesChargeCaptureResponseCodecAlternative1Registry.select(listOf("PostChargesChargeCapture.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostChargesChargeCaptureResponse = PostChargesChargeCaptureResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostChargesChargeDisputeClose`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostChargesChargeDisputeCloseResponse {
    public class SuccessJson(
      public val json: Dispute,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesChargeDisputeCloseResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesChargeDisputeCloseResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesChargeDisputeCloseResponse
  }

  private object PostChargesChargeDisputeCloseResponseDecoder : SdkResponseAlternativeDecoder<PostChargesChargeDisputeCloseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostChargesChargeDisputeCloseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostChargesChargeDisputeCloseResponse> = when {
      alternative.id == "PostChargesChargeDisputeClose.response.alternative0" -> SdkResponseDecodeResult(
        value = PostChargesChargeDisputeCloseResponse.SuccessJson(
          json = ChargesCodecs.postChargesChargeDisputeCloseResponseCodecAlternative0Registry.select(listOf("PostChargesChargeDisputeClose.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostChargesChargeDisputeClose.response.alternative1" -> SdkResponseDecodeResult(
        value = PostChargesChargeDisputeCloseResponse.DefaultJson(
          json = ChargesCodecs.postChargesChargeDisputeCloseResponseCodecAlternative1Registry.select(listOf("PostChargesChargeDisputeClose.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostChargesChargeDisputeCloseResponse = PostChargesChargeDisputeCloseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostChargesChargeRefund`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostChargesChargeRefundResponse {
    public class SuccessJson(
      public val json: Charge,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesChargeRefundResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesChargeRefundResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesChargeRefundResponse
  }

  private object PostChargesChargeRefundResponseDecoder : SdkResponseAlternativeDecoder<PostChargesChargeRefundResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostChargesChargeRefundResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostChargesChargeRefundResponse> = when {
      alternative.id == "PostChargesChargeRefund.response.alternative0" -> SdkResponseDecodeResult(
        value = PostChargesChargeRefundResponse.SuccessJson(
          json = ChargesCodecs.postChargesChargeRefundResponseCodecAlternative0Registry.select(listOf("PostChargesChargeRefund.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostChargesChargeRefund.response.alternative1" -> SdkResponseDecodeResult(
        value = PostChargesChargeRefundResponse.DefaultJson(
          json = ChargesCodecs.postChargesChargeRefundResponseCodecAlternative1Registry.select(listOf("PostChargesChargeRefund.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostChargesChargeRefundResponse = PostChargesChargeRefundResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostChargesChargeRefunds`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostChargesChargeRefundsResponse {
    public class SuccessJson(
      public val json: Refund,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesChargeRefundsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesChargeRefundsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesChargeRefundsResponse
  }

  private object PostChargesChargeRefundsResponseDecoder : SdkResponseAlternativeDecoder<PostChargesChargeRefundsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostChargesChargeRefundsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostChargesChargeRefundsResponse> = when {
      alternative.id == "PostChargesChargeRefunds.response.alternative0" -> SdkResponseDecodeResult(
        value = PostChargesChargeRefundsResponse.SuccessJson(
          json = ChargesCodecs.postChargesChargeRefundsResponseCodecAlternative0Registry.select(listOf("PostChargesChargeRefunds.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostChargesChargeRefunds.response.alternative1" -> SdkResponseDecodeResult(
        value = PostChargesChargeRefundsResponse.DefaultJson(
          json = ChargesCodecs.postChargesChargeRefundsResponseCodecAlternative1Registry.select(listOf("PostChargesChargeRefunds.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostChargesChargeRefundsResponse = PostChargesChargeRefundsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostChargesChargeRefundsRefund`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostChargesChargeRefundsRefundResponse {
    public class SuccessJson(
      public val json: Refund,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesChargeRefundsRefundResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesChargeRefundsRefundResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostChargesChargeRefundsRefundResponse
  }

  private object PostChargesChargeRefundsRefundResponseDecoder : SdkResponseAlternativeDecoder<PostChargesChargeRefundsRefundResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostChargesChargeRefundsRefundResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostChargesChargeRefundsRefundResponse> = when {
      alternative.id == "PostChargesChargeRefundsRefund.response.alternative0" -> SdkResponseDecodeResult(
        value = PostChargesChargeRefundsRefundResponse.SuccessJson(
          json = ChargesCodecs.postChargesChargeRefundsRefundResponseCodecAlternative0Registry.select(listOf("PostChargesChargeRefundsRefund.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostChargesChargeRefundsRefund.response.alternative1" -> SdkResponseDecodeResult(
        value = PostChargesChargeRefundsRefundResponse.DefaultJson(
          json = ChargesCodecs.postChargesChargeRefundsRefundResponseCodecAlternative1Registry.select(listOf("PostChargesChargeRefundsRefund.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostChargesChargeRefundsRefundResponse = PostChargesChargeRefundsRefundResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getChargesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCharges",
          method = "GET",
          path = "/v1/charges",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1ChargesGetResponse200JsonXceababe3",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCharges.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCharges.response.alternative1",
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

    internal val getChargesChargeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetChargesCharge",
          method = "GET",
          path = "/v1/charges/{charge}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Charge",
              mode = SdkResponseMode.BUFFERED,
              id = "GetChargesCharge.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetChargesCharge.response.alternative1",
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

    internal val getChargesChargeDisputeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetChargesChargeDispute",
          method = "GET",
          path = "/v1/charges/{charge}/dispute",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Dispute",
              mode = SdkResponseMode.BUFFERED,
              id = "GetChargesChargeDispute.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetChargesChargeDispute.response.alternative1",
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

    internal val getChargesChargeRefundsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetChargesChargeRefunds",
          method = "GET",
          path = "/v1/charges/{charge}/refunds",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1ChargesRefundsGetResponse200JsonX440d849e",
              mode = SdkResponseMode.BUFFERED,
              id = "GetChargesChargeRefunds.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetChargesChargeRefunds.response.alternative1",
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

    internal val getChargesChargeRefundsRefundMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetChargesChargeRefundsRefund",
          method = "GET",
          path = "/v1/charges/{charge}/refunds/{refund}",
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
              id = "GetChargesChargeRefundsRefund.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetChargesChargeRefundsRefund.response.alternative1",
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

    internal val getChargesSearchMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetChargesSearch",
          method = "GET",
          path = "/v1/charges/search",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1ChargesSearchGetResponse200JsonX25e1d7b2",
              mode = SdkResponseMode.BUFFERED,
              id = "GetChargesSearch.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetChargesSearch.response.alternative1",
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

    internal val postChargesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCharges",
          method = "POST",
          path = "/v1/charges",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Charge",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCharges.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCharges.response.alternative1",
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

    internal val postChargesChargeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostChargesCharge",
          method = "POST",
          path = "/v1/charges/{charge}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Charge",
              mode = SdkResponseMode.BUFFERED,
              id = "PostChargesCharge.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostChargesCharge.response.alternative1",
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

    internal val postChargesChargeCaptureMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostChargesChargeCapture",
          method = "POST",
          path = "/v1/charges/{charge}/capture",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Charge",
              mode = SdkResponseMode.BUFFERED,
              id = "PostChargesChargeCapture.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostChargesChargeCapture.response.alternative1",
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

    internal val postChargesChargeDisputeCloseMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostChargesChargeDisputeClose",
          method = "POST",
          path = "/v1/charges/{charge}/dispute/close",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Dispute",
              mode = SdkResponseMode.BUFFERED,
              id = "PostChargesChargeDisputeClose.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostChargesChargeDisputeClose.response.alternative1",
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

    internal val postChargesChargeRefundMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostChargesChargeRefund",
          method = "POST",
          path = "/v1/charges/{charge}/refund",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Charge",
              mode = SdkResponseMode.BUFFERED,
              id = "PostChargesChargeRefund.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostChargesChargeRefund.response.alternative1",
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

    internal val postChargesChargeRefundsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostChargesChargeRefunds",
          method = "POST",
          path = "/v1/charges/{charge}/refunds",
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
              id = "PostChargesChargeRefunds.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostChargesChargeRefunds.response.alternative1",
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

    internal val postChargesChargeRefundsRefundMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostChargesChargeRefundsRefund",
          method = "POST",
          path = "/v1/charges/{charge}/refunds/{refund}",
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
              id = "PostChargesChargeRefundsRefund.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostChargesChargeRefundsRefund.response.alternative1",
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
