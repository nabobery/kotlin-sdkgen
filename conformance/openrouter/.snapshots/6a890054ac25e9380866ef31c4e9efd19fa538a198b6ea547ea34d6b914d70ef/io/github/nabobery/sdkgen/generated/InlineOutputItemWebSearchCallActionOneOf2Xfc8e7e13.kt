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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemWebSearchCall/properties/action/oneOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemWebSearchCall/properties/action/oneOf/1
 */
@Serializable(with = InlineOutputItemWebSearchCallActionOneOf2Xfc8e7e13.Serializer::class)
public class InlineOutputItemWebSearchCallActionOneOf2Xfc8e7e13(
  public val type: InlineOutputItemWebSearchCallActionOneOf2TypeX725d583d,
  public val url: String? = null,
) {
  public class Builder {
    private var typeValue: InlineOutputItemWebSearchCallActionOneOf2TypeX725d583d? = null

    public var type: InlineOutputItemWebSearchCallActionOneOf2TypeX725d583d
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var url: String? = null

    public fun build(): InlineOutputItemWebSearchCallActionOneOf2Xfc8e7e13 {
      check(typeValue != null) { "type is required" }
      return InlineOutputItemWebSearchCallActionOneOf2Xfc8e7e13(
        type = type,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOutputItemWebSearchCallActionOneOf2Xfc8e7e13 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOutputItemWebSearchCallActionOneOf2Xfc8e7e13> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOutputItemWebSearchCallActionOneOf2Xfc8e7e13 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOutputItemWebSearchCallActionOneOf2Xfc8e7e13")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOutputItemWebSearchCallActionOneOf2Xfc8e7e13 must be a JSON object")
      val type = json.decodeRequired<InlineOutputItemWebSearchCallActionOneOf2TypeX725d583d>(rawObject, "type")
      return InlineOutputItemWebSearchCallActionOneOf2Xfc8e7e13(
        type = type,
        url = rawObject["url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemWebSearchCallActionOneOf2Xfc8e7e13) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOutputItemWebSearchCallActionOneOf2Xfc8e7e13")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOutputItemWebSearchCallActionOneOf2Xfc8e7e13(block: InlineOutputItemWebSearchCallActionOneOf2Xfc8e7e13.Builder.() -> Unit): InlineOutputItemWebSearchCallActionOneOf2Xfc8e7e13 = InlineOutputItemWebSearchCallActionOneOf2Xfc8e7e13.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOutputItemWebSearchCallActionOneOf2Xfc8e7e13 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
