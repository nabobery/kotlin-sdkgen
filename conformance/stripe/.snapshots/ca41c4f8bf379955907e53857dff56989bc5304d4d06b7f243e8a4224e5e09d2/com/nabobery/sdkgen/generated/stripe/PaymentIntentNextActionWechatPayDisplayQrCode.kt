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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_next_action_wechat_pay_display_qr_code
 */
@Serializable(with = PaymentIntentNextActionWechatPayDisplayQrCode.Serializer::class)
public class PaymentIntentNextActionWechatPayDisplayQrCode(
  /**
   * The data being used to generate QR code
   */
  public val `data`: String,
  /**
   * The URL to the hosted WeChat Pay instructions page, which allows customers to view the WeChat Pay QR code.
   */
  public val hostedInstructionsUrl: String,
  /**
   * The base64 image data for a pre-generated QR code
   */
  public val imageDataUrl: String,
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

    private var imageDataUrlValue: String? = null

    public var imageDataUrl: String
      get() = requireNotNull(imageDataUrlValue) { "imageDataUrl is required" }
      set(`value`) {
        imageDataUrlValue = value
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

    public fun build(): PaymentIntentNextActionWechatPayDisplayQrCode {
      check(dataValue != null) { "data is required" }
      check(hostedInstructionsUrlValue != null) { "hostedInstructionsUrl is required" }
      check(imageDataUrlValue != null) { "imageDataUrl is required" }
      check(imageUrlPngValue != null) { "imageUrlPng is required" }
      check(imageUrlSvgValue != null) { "imageUrlSvg is required" }
      return PaymentIntentNextActionWechatPayDisplayQrCode(
        data = data,
        hostedInstructionsUrl = hostedInstructionsUrl,
        imageDataUrl = imageDataUrl,
        imageUrlPng = imageUrlPng,
        imageUrlSvg = imageUrlSvg,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentNextActionWechatPayDisplayQrCode = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentNextActionWechatPayDisplayQrCode> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentNextActionWechatPayDisplayQrCode {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentNextActionWechatPayDisplayQrCode")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentNextActionWechatPayDisplayQrCode must be a JSON object")
      val data = json.decodeRequired<String>(rawObject, "data")
      val hostedInstructionsUrl = json.decodeRequired<String>(rawObject, "hosted_instructions_url")
      val imageDataUrl = json.decodeRequired<String>(rawObject, "image_data_url")
      val imageUrlPng = json.decodeRequired<String>(rawObject, "image_url_png")
      val imageUrlSvg = json.decodeRequired<String>(rawObject, "image_url_svg")
      return PaymentIntentNextActionWechatPayDisplayQrCode(
        data = data,
        hostedInstructionsUrl = hostedInstructionsUrl,
        imageDataUrl = imageDataUrl,
        imageUrlPng = imageUrlPng,
        imageUrlSvg = imageUrlSvg,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentNextActionWechatPayDisplayQrCode) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentNextActionWechatPayDisplayQrCode")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", value.data)
        put("hosted_instructions_url", value.hostedInstructionsUrl)
        put("image_data_url", value.imageDataUrl)
        put("image_url_png", value.imageUrlPng)
        put("image_url_svg", value.imageUrlSvg)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentNextActionWechatPayDisplayQrCode(block: PaymentIntentNextActionWechatPayDisplayQrCode.Builder.() -> Unit): PaymentIntentNextActionWechatPayDisplayQrCode = PaymentIntentNextActionWechatPayDisplayQrCode.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentIntentNextActionWechatPayDisplayQrCode is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
