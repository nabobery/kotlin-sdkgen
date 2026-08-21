package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-advisory/properties/identifiers/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-advisory/properties/identifiers/items
 */
@Serializable(with = InlineRepositoryAdvisoryIdentifiersItemX7eae0134.Serializer::class)
public class InlineRepositoryAdvisoryIdentifiersItemX7eae0134(
  /**
   * The type of identifier.
   */
  public val type: InlineRepositoryAdvisoryIdentifiersItemTypeXad69e67d,
  /**
   * The identifier value.
   */
  public val `value`: String,
) {
  public class Builder {
    private var typeValue: InlineRepositoryAdvisoryIdentifiersItemTypeXad69e67d? = null

    public var type: InlineRepositoryAdvisoryIdentifiersItemTypeXad69e67d
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var valueValue: String? = null

    public var `value`: String
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineRepositoryAdvisoryIdentifiersItemX7eae0134 {
      check(typeValue != null) { "type is required" }
      check(valueValue != null) { "value is required" }
      return InlineRepositoryAdvisoryIdentifiersItemX7eae0134(
        type = type,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryAdvisoryIdentifiersItemX7eae0134 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryAdvisoryIdentifiersItemX7eae0134> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryAdvisoryIdentifiersItemX7eae0134 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryAdvisoryIdentifiersItemX7eae0134")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryAdvisoryIdentifiersItemX7eae0134 must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryAdvisoryIdentifiersItemTypeXad69e67d>(rawObject, "type")
      val value = json.decodeRequired<String>(rawObject, "value")
      return InlineRepositoryAdvisoryIdentifiersItemX7eae0134(
        type = type,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryAdvisoryIdentifiersItemX7eae0134) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryAdvisoryIdentifiersItemX7eae0134")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("value", value.value)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryAdvisoryIdentifiersItemX7eae0134(block: InlineRepositoryAdvisoryIdentifiersItemX7eae0134.Builder.() -> Unit): InlineRepositoryAdvisoryIdentifiersItemX7eae0134 = InlineRepositoryAdvisoryIdentifiersItemX7eae0134.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryAdvisoryIdentifiersItemX7eae0134 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
