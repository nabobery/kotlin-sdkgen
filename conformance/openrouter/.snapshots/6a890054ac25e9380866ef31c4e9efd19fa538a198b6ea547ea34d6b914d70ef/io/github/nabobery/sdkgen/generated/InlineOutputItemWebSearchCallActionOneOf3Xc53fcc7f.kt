package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemWebSearchCall/properties/action/oneOf/2.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemWebSearchCall/properties/action/oneOf/2
 */
@Serializable(with = InlineOutputItemWebSearchCallActionOneOf3Xc53fcc7f.Serializer::class)
public class InlineOutputItemWebSearchCallActionOneOf3Xc53fcc7f(
  public val pattern: String,
  public val type: InlineOutputItemWebSearchCallActionOneOf3TypeX82eb58d2,
  public val url: String,
) {
  public class Builder {
    private var patternValue: String? = null

    public var pattern: String
      get() = requireNotNull(patternValue) { "pattern is required" }
      set(`value`) {
        patternValue = value
      }

    private var typeValue: InlineOutputItemWebSearchCallActionOneOf3TypeX82eb58d2? = null

    public var type: InlineOutputItemWebSearchCallActionOneOf3TypeX82eb58d2
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineOutputItemWebSearchCallActionOneOf3Xc53fcc7f {
      check(patternValue != null) { "pattern is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      return InlineOutputItemWebSearchCallActionOneOf3Xc53fcc7f(
        pattern = pattern,
        type = type,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOutputItemWebSearchCallActionOneOf3Xc53fcc7f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOutputItemWebSearchCallActionOneOf3Xc53fcc7f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOutputItemWebSearchCallActionOneOf3Xc53fcc7f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOutputItemWebSearchCallActionOneOf3Xc53fcc7f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOutputItemWebSearchCallActionOneOf3Xc53fcc7f must be a JSON object")
      val pattern = json.decodeRequired<String>(rawObject, "pattern")
      val type = json.decodeRequired<InlineOutputItemWebSearchCallActionOneOf3TypeX82eb58d2>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineOutputItemWebSearchCallActionOneOf3Xc53fcc7f(
        pattern = pattern,
        type = type,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemWebSearchCallActionOneOf3Xc53fcc7f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOutputItemWebSearchCallActionOneOf3Xc53fcc7f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("pattern", value.pattern)
        put("type", json.encodeToJsonElement(value.type))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOutputItemWebSearchCallActionOneOf3Xc53fcc7f(block: InlineOutputItemWebSearchCallActionOneOf3Xc53fcc7f.Builder.() -> Unit): InlineOutputItemWebSearchCallActionOneOf3Xc53fcc7f = InlineOutputItemWebSearchCallActionOneOf3Xc53fcc7f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOutputItemWebSearchCallActionOneOf3Xc53fcc7f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
