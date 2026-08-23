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
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_cashapp_handle_redirect_or_display_qr_cod
 * e
 */
@Serializable(with = PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode.Serializer::class)
public class PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode(
  /**
   * The URL to the hosted Cash App Pay instructions page, which allows customers to view the QR code, and supports QR
   * code refreshing on expiration.
   */
  public val hostedInstructionsUrl: String,
  /**
   * The url for mobile redirect based auth
   */
  public val mobileAuthUrl: String,
  public val qrCode: PaymentIntentNextActionCashappQrCode,
) {
  public class Builder {
    private var hostedInstructionsUrlValue: String? = null

    public var hostedInstructionsUrl: String
      get() = requireNotNull(hostedInstructionsUrlValue) { "hostedInstructionsUrl is required" }
      set(`value`) {
        hostedInstructionsUrlValue = value
      }

    private var mobileAuthUrlValue: String? = null

    public var mobileAuthUrl: String
      get() = requireNotNull(mobileAuthUrlValue) { "mobileAuthUrl is required" }
      set(`value`) {
        mobileAuthUrlValue = value
      }

    private var qrCodeValue: PaymentIntentNextActionCashappQrCode? = null

    public var qrCode: PaymentIntentNextActionCashappQrCode
      get() = requireNotNull(qrCodeValue) { "qrCode is required" }
      set(`value`) {
        qrCodeValue = value
      }

    public fun build(): PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode {
      check(hostedInstructionsUrlValue != null) { "hostedInstructionsUrl is required" }
      check(mobileAuthUrlValue != null) { "mobileAuthUrl is required" }
      check(qrCodeValue != null) { "qrCode is required" }
      return PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode(
        hostedInstructionsUrl = hostedInstructionsUrl,
        mobileAuthUrl = mobileAuthUrl,
        qrCode = qrCode,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode must be a JSON object")
      val hostedInstructionsUrl = json.decodeRequired<String>(rawObject, "hosted_instructions_url")
      val mobileAuthUrl = json.decodeRequired<String>(rawObject, "mobile_auth_url")
      val qrCode = json.decodeRequired<PaymentIntentNextActionCashappQrCode>(rawObject, "qr_code")
      return PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode(
        hostedInstructionsUrl = hostedInstructionsUrl,
        mobileAuthUrl = mobileAuthUrl,
        qrCode = qrCode,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("hosted_instructions_url", value.hostedInstructionsUrl)
        put("mobile_auth_url", value.mobileAuthUrl)
        put("qr_code", json.encodeToJsonElement(value.qrCode))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentNextActionCashappHandleRedirectOrDisplayQrCode(block: PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode.Builder.() -> Unit): PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode = PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentIntentNextActionCashappHandleRedirectOrDisplayQrCode is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
