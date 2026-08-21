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
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_promptpay_display_qr_code
 */
@Serializable(with = PaymentIntentNextActionPromptpayDisplayQrCode.Serializer::class)
public class PaymentIntentNextActionPromptpayDisplayQrCode(
  /**
   * The raw data string used to generate QR code, it should be used together with QR code library.
   */
  public val `data`: String,
  /**
   * The URL to the hosted PromptPay instructions page, which allows customers to view the PromptPay QR code.
   */
  public val hostedInstructionsUrl: String,
  /**
   * The PNG path used to render the QR code, can be used as the source in an HTML img tag
   */
  public val imageUrlPng: String,
  /**
   * The SVG path used to render the QR code, can be used as the source in an HTML img tag
   */
  public val imageUrlSvg: String,
) {
  public class Builder {
    private var dataValue: String? = null

    public var `data`: String
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    private var hostedInstructionsUrlValue: String? = null

    public var hostedInstructionsUrl: String
      get() = requireNotNull(hostedInstructionsUrlValue) { "hostedInstructionsUrl is required" }
      set(`value`) {
        hostedInstructionsUrlValue = value
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

    public fun build(): PaymentIntentNextActionPromptpayDisplayQrCode {
      check(dataValue != null) { "data is required" }
      check(hostedInstructionsUrlValue != null) { "hostedInstructionsUrl is required" }
      check(imageUrlPngValue != null) { "imageUrlPng is required" }
      check(imageUrlSvgValue != null) { "imageUrlSvg is required" }
      return PaymentIntentNextActionPromptpayDisplayQrCode(
        data = data,
        hostedInstructionsUrl = hostedInstructionsUrl,
        imageUrlPng = imageUrlPng,
        imageUrlSvg = imageUrlSvg,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentNextActionPromptpayDisplayQrCode = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentNextActionPromptpayDisplayQrCode> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentNextActionPromptpayDisplayQrCode {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionPromptpayDisplayQrCode")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentNextActionPromptpayDisplayQrCode must be a JSON object")
      val data = json.decodeRequired<String>(rawObject, "data")
      val hostedInstructionsUrl = json.decodeRequired<String>(rawObject, "hosted_instructions_url")
      val imageUrlPng = json.decodeRequired<String>(rawObject, "image_url_png")
      val imageUrlSvg = json.decodeRequired<String>(rawObject, "image_url_svg")
      return PaymentIntentNextActionPromptpayDisplayQrCode(
        data = data,
        hostedInstructionsUrl = hostedInstructionsUrl,
        imageUrlPng = imageUrlPng,
        imageUrlSvg = imageUrlSvg,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentNextActionPromptpayDisplayQrCode) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionPromptpayDisplayQrCode")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", value.data)
        put("hosted_instructions_url", value.hostedInstructionsUrl)
        put("image_url_png", value.imageUrlPng)
        put("image_url_svg", value.imageUrlSvg)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentNextActionPromptpayDisplayQrCode(block: PaymentIntentNextActionPromptpayDisplayQrCode.Builder.() -> Unit): PaymentIntentNextActionPromptpayDisplayQrCode = PaymentIntentNextActionPromptpayDisplayQrCode.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentIntentNextActionPromptpayDisplayQrCode is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
