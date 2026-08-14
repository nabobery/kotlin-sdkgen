package io.github.nabobery.sdkgen.generated.stripe

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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/branding_settings/properties/logo.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/branding_settings/properties/logo
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067(
  public val type: InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoTypeXc22dceef,
  public val `file`: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    private var typeValue: InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoTypeXc22dceef?
        = null

    public var type: InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoTypeXc22dceef
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var `file`: String? = null

    public var url: String? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067 {
      check(typeValue != null) { "type is required" }
      return InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067(
        type = type,
        file = file,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067 must be a JSON object")
      val type = json.decodeRequired<InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoTypeXc22dceef>(rawObject, "type")
      return InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067(
        type = type,
        file = rawObject["file"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.file?.let { put("file", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067(block: InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067 = InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormBrandingSettingsLogoX29580067 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
