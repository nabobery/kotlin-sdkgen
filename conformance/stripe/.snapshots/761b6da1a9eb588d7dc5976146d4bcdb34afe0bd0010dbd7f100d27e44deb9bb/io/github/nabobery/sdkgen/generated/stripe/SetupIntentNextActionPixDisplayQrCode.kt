package io.github.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_next_action_pix_display_qr_code
 */
@Serializable(with = SetupIntentNextActionPixDisplayQrCode.Serializer::class)
public class SetupIntentNextActionPixDisplayQrCode(
  /**
   * The raw data string used to generate QR code, it should be used together with QR code library.
   */
  public val `data`: String,
  /**
   * The date (unix timestamp) when the PIX expires.
   */
  public val expiresAt: Int,
  /**
   * The URL to the hosted pix instructions page, which allows customers to view the pix QR code.
   */
  public val hostedInstructionsUrl: String,
  /**
   * The image_url_png string used to render png QR code
   */
  public val imageUrlPng: String,
  /**
   * The image_url_svg string used to render svg QR code
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

    private var expiresAtValue: Int? = null

    public var expiresAt: Int
      get() = requireNotNull(expiresAtValue) { "expiresAt is required" }
      set(`value`) {
        expiresAtValue = value
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

    public fun build(): SetupIntentNextActionPixDisplayQrCode {
      check(dataValue != null) { "data is required" }
      check(expiresAtValue != null) { "expiresAt is required" }
      check(hostedInstructionsUrlValue != null) { "hostedInstructionsUrl is required" }
      check(imageUrlPngValue != null) { "imageUrlPng is required" }
      check(imageUrlSvgValue != null) { "imageUrlSvg is required" }
      return SetupIntentNextActionPixDisplayQrCode(
        data = data,
        expiresAt = expiresAt,
        hostedInstructionsUrl = hostedInstructionsUrl,
        imageUrlPng = imageUrlPng,
        imageUrlSvg = imageUrlSvg,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupIntentNextActionPixDisplayQrCode = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SetupIntentNextActionPixDisplayQrCode> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupIntentNextActionPixDisplayQrCode {
      val jsonDecoder = decoder.requireJsonDecoder("SetupIntentNextActionPixDisplayQrCode")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupIntentNextActionPixDisplayQrCode must be a JSON object")
      val data = json.decodeRequired<String>(rawObject, "data")
      val expiresAt = json.decodeRequired<Int>(rawObject, "expires_at")
      val hostedInstructionsUrl = json.decodeRequired<String>(rawObject, "hosted_instructions_url")
      val imageUrlPng = json.decodeRequired<String>(rawObject, "image_url_png")
      val imageUrlSvg = json.decodeRequired<String>(rawObject, "image_url_svg")
      return SetupIntentNextActionPixDisplayQrCode(
        data = data,
        expiresAt = expiresAt,
        hostedInstructionsUrl = hostedInstructionsUrl,
        imageUrlPng = imageUrlPng,
        imageUrlSvg = imageUrlSvg,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupIntentNextActionPixDisplayQrCode) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupIntentNextActionPixDisplayQrCode")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", value.data)
        put("expires_at", json.encodeToJsonElement(value.expiresAt))
        put("hosted_instructions_url", value.hostedInstructionsUrl)
        put("image_url_png", value.imageUrlPng)
        put("image_url_svg", value.imageUrlSvg)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun setupIntentNextActionPixDisplayQrCode(block: SetupIntentNextActionPixDisplayQrCode.Builder.() -> Unit): SetupIntentNextActionPixDisplayQrCode = SetupIntentNextActionPixDisplayQrCode.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SetupIntentNextActionPixDisplayQrCode is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
