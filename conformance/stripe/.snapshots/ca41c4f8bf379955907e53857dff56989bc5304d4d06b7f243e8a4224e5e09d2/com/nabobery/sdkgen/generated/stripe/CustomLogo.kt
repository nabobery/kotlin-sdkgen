package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlinx.serialization.json.put

@Serializable
public data class CustomLogoView(
  @SerialName("content_type")
  public val contentType: String? = null,
  public val url: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/custom_logo
 */
@Serializable(with = CustomLogo.Serializer::class)
public class CustomLogo(
  /**
   * URL of the Dashboard-only CustomPaymentMethodType logo.
   */
  public val url: String,
  /**
   * Content type of the Dashboard-only CustomPaymentMethodType logo.
   */
  public val contentType: String? = null,
) {
  public class Builder {
    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    /**
     * Content type of the Dashboard-only CustomPaymentMethodType logo.
     */
    public var contentType: String? = null

    public fun build(): CustomLogo {
      check(urlValue != null) { "url is required" }
      return CustomLogo(
        url = url,
        contentType = contentType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomLogo = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CustomLogo> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomLogo {
      val jsonDecoder = decoder.requireJsonDecoder("CustomLogo")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomLogo must be a JSON object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return CustomLogo(
        url = url,
        contentType = rawObject["content_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomLogo) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomLogo")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("url", value.url)
        value.contentType?.let { put("content_type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customLogo(block: CustomLogo.Builder.() -> Unit): CustomLogo = CustomLogo.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomLogo is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
