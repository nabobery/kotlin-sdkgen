package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_swish_handle_redirect_or_display_qr_code
 */
@Serializable(with = PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode.Serializer::class)
public class PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode(
  /**
   * The URL to the hosted Swish instructions page, which allows customers to view the QR code.
   */
  public val hostedInstructionsUrl: String,
  public val qrCode: PaymentIntentNextActionSwishQrCode,
) {
  public class Builder {
    private var hostedInstructionsUrlValue: String? = null

    public var hostedInstructionsUrl: String
      get() = requireNotNull(hostedInstructionsUrlValue) { "hostedInstructionsUrl is required" }
      set(`value`) {
        hostedInstructionsUrlValue = value
      }

    private var qrCodeValue: PaymentIntentNextActionSwishQrCode? = null

    public var qrCode: PaymentIntentNextActionSwishQrCode
      get() = requireNotNull(qrCodeValue) { "qrCode is required" }
      set(`value`) {
        qrCodeValue = value
      }

    public fun build(): PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode {
      check(hostedInstructionsUrlValue != null) { "hostedInstructionsUrl is required" }
      check(qrCodeValue != null) { "qrCode is required" }
      return PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode(
        hostedInstructionsUrl = hostedInstructionsUrl,
        qrCode = qrCode,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode must be a JSON object")
      val hostedInstructionsUrl = json.decodeRequired<String>(rawObject, "hosted_instructions_url")
      val qrCode = json.decodeRequired<PaymentIntentNextActionSwishQrCode>(rawObject, "qr_code")
      return PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode(
        hostedInstructionsUrl = hostedInstructionsUrl,
        qrCode = qrCode,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("hosted_instructions_url", value.hostedInstructionsUrl)
        put("qr_code", json.encodeToJsonElement(value.qrCode))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentNextActionSwishHandleRedirectOrDisplayQrCode(block: PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode.Builder.() -> Unit): PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode = PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentIntentNextActionSwishHandleRedirectOrDisplayQrCode is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
