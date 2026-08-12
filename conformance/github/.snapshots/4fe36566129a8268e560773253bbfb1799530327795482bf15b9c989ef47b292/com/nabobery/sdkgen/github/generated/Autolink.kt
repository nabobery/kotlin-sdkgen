package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * An autolink reference.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/autolink
 */
@Serializable(with = Autolink.Serializer::class)
public class Autolink(
  public val id: Int,
  /**
   * Whether this autolink reference matches alphanumeric characters. If false, this autolink reference only matches
   * numeric characters.
   */
  public val isAlphanumeric: Boolean,
  /**
   * The prefix of a key that is linkified.
   */
  public val keyPrefix: String,
  /**
   * A template for the target URL that is generated if a key was found.
   */
  public val urlTemplate: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String? = null,
) {
  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var isAlphanumericValue: Boolean? = null

    public var isAlphanumeric: Boolean
      get() = requireNotNull(isAlphanumericValue) { "isAlphanumeric is required" }
      set(`value`) {
        isAlphanumericValue = value
      }

    private var keyPrefixValue: String? = null

    public var keyPrefix: String
      get() = requireNotNull(keyPrefixValue) { "keyPrefix is required" }
      set(`value`) {
        keyPrefixValue = value
      }

    private var urlTemplateValue: String? = null

    public var urlTemplate: String
      get() = requireNotNull(urlTemplateValue) { "urlTemplate is required" }
      set(`value`) {
        urlTemplateValue = value
      }

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var updatedAt: String? = null

    public fun build(): Autolink {
      check(idValue != null) { "id is required" }
      check(isAlphanumericValue != null) { "isAlphanumeric is required" }
      check(keyPrefixValue != null) { "keyPrefix is required" }
      check(urlTemplateValue != null) { "urlTemplate is required" }
      return Autolink(
        id = id,
        isAlphanumeric = isAlphanumeric,
        keyPrefix = keyPrefix,
        urlTemplate = urlTemplate,
        updatedAt = updatedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Autolink = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Autolink> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Autolink {
      val jsonDecoder = decoder.requireJsonDecoder("Autolink")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Autolink must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val isAlphanumeric = json.decodeRequired<Boolean>(rawObject, "is_alphanumeric")
      val keyPrefix = json.decodeRequired<String>(rawObject, "key_prefix")
      val urlTemplate = json.decodeRequired<String>(rawObject, "url_template")
      return Autolink(
        id = id,
        isAlphanumeric = isAlphanumeric,
        keyPrefix = keyPrefix,
        urlTemplate = urlTemplate,
        updatedAt = rawObject["updated_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Autolink) {
      val jsonEncoder = encoder.requireJsonEncoder("Autolink")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("is_alphanumeric", json.encodeToJsonElement(value.isAlphanumeric))
        put("key_prefix", value.keyPrefix)
        put("url_template", value.urlTemplate)
        value.updatedAt?.let { put("updated_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun autolink(block: Autolink.Builder.() -> Unit): Autolink = Autolink.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Autolink is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
