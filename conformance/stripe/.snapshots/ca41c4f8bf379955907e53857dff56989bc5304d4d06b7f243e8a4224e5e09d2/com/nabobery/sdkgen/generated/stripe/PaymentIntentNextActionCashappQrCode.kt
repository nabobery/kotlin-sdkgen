package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_cashapp_qr_code
 */
@Serializable(with = PaymentIntentNextActionCashappQrCode.Serializer::class)
public class PaymentIntentNextActionCashappQrCode(
  /**
   * The date (unix timestamp) when the QR code expires.
   */
  public val expiresAt: Int,
  /**
   * The image_url_png string used to render QR code
   */
  public val imageUrlPng: String,
  /**
   * The image_url_svg string used to render QR code
   */
  public val imageUrlSvg: String,
) {
  public class Builder {
    private var expiresAtValue: Int? = null

    public var expiresAt: Int
      get() = requireNotNull(expiresAtValue) { "expiresAt is required" }
      set(`value`) {
        expiresAtValue = value
      }

    private var imageUrlPngValue: String? = null

    public var imageUrlPng: String
      get() = requireNotNull(imageUrlPngValue) { "imageUrlPng is required" }
      set(`value`) {
        imageUrlPngValue = value
      }

    private var imageUrlSvgValue: String? = null

    public var imageUrlSvg: String
      get() = requireNotNull(imageUrlSvgValue) { "imageUrlSvg is required" }
      set(`value`) {
        imageUrlSvgValue = value
      }

    public fun build(): PaymentIntentNextActionCashappQrCode {
      check(expiresAtValue != null) { "expiresAt is required" }
      check(imageUrlPngValue != null) { "imageUrlPng is required" }
      check(imageUrlSvgValue != null) { "imageUrlSvg is required" }
      return PaymentIntentNextActionCashappQrCode(
        expiresAt = expiresAt,
        imageUrlPng = imageUrlPng,
        imageUrlSvg = imageUrlSvg,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentNextActionCashappQrCode = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentNextActionCashappQrCode> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentNextActionCashappQrCode {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionCashappQrCode")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentNextActionCashappQrCode must be a JSON object")
      val expiresAt = json.decodeRequired<Int>(rawObject, "expires_at")
      val imageUrlPng = json.decodeRequired<String>(rawObject, "image_url_png")
      val imageUrlSvg = json.decodeRequired<String>(rawObject, "image_url_svg")
      return PaymentIntentNextActionCashappQrCode(
        expiresAt = expiresAt,
        imageUrlPng = imageUrlPng,
        imageUrlSvg = imageUrlSvg,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentNextActionCashappQrCode) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionCashappQrCode")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("expires_at", json.encodeToJsonElement(value.expiresAt))
        put("image_url_png", value.imageUrlPng)
        put("image_url_svg", value.imageUrlSvg)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentNextActionCashappQrCode(block: PaymentIntentNextActionCashappQrCode.Builder.() -> Unit): PaymentIntentNextActionCashappQrCode = PaymentIntentNextActionCashappQrCode.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentIntentNextActionCashappQrCode is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
