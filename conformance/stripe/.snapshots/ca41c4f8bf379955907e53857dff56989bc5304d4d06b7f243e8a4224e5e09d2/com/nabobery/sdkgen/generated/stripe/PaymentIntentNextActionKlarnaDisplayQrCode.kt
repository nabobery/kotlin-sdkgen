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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_klarna_display_qr_code
 */
@Serializable(with = PaymentIntentNextActionKlarnaDisplayQrCode.Serializer::class)
public class PaymentIntentNextActionKlarnaDisplayQrCode(
  /**
   * The data being used to generate QR code
   */
  public val `data`: String,
  /**
   * The image_url_png string used to render QR code
   */
  public val imageUrlPng: String,
  /**
   * The image_url_svg string used to render QR code
   */
  public val imageUrlSvg: String,
  /**
   * The timestamp at which the QR code expires.
   */
  public val expiresAt: Int? = null,
) {
  public class Builder {
    private var dataValue: String? = null

    public var `data`: String
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
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

    /**
     * The timestamp at which the QR code expires.
     */
    public var expiresAt: Int? = null

    public fun build(): PaymentIntentNextActionKlarnaDisplayQrCode {
      check(dataValue != null) { "data is required" }
      check(imageUrlPngValue != null) { "imageUrlPng is required" }
      check(imageUrlSvgValue != null) { "imageUrlSvg is required" }
      return PaymentIntentNextActionKlarnaDisplayQrCode(
        data = data,
        imageUrlPng = imageUrlPng,
        imageUrlSvg = imageUrlSvg,
        expiresAt = expiresAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentNextActionKlarnaDisplayQrCode = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentNextActionKlarnaDisplayQrCode> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentNextActionKlarnaDisplayQrCode {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionKlarnaDisplayQrCode")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentNextActionKlarnaDisplayQrCode must be a JSON object")
      val data = json.decodeRequired<String>(rawObject, "data")
      val imageUrlPng = json.decodeRequired<String>(rawObject, "image_url_png")
      val imageUrlSvg = json.decodeRequired<String>(rawObject, "image_url_svg")
      return PaymentIntentNextActionKlarnaDisplayQrCode(
        data = data,
        imageUrlPng = imageUrlPng,
        imageUrlSvg = imageUrlSvg,
        expiresAt = rawObject["expires_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentNextActionKlarnaDisplayQrCode) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionKlarnaDisplayQrCode")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", value.data)
        put("image_url_png", value.imageUrlPng)
        put("image_url_svg", value.imageUrlSvg)
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentNextActionKlarnaDisplayQrCode(block: PaymentIntentNextActionKlarnaDisplayQrCode.Builder.() -> Unit): PaymentIntentNextActionKlarnaDisplayQrCode = PaymentIntentNextActionKlarnaDisplayQrCode.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentIntentNextActionKlarnaDisplayQrCode is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
