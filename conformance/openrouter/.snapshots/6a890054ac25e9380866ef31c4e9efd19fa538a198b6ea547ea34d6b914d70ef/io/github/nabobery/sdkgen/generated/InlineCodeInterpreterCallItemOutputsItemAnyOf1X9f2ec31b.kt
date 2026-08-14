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
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterCallItem/properties/outputs/items/anyOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterCallItem/properties/outputs/items/anyOf/0
 */
@Serializable(with = InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b.Serializer::class)
public class InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b(
  public val type: InlineCodeInterpreterCallItemOutputsItemAnyOf1TypeX16cad089,
  public val url: String,
) {
  public class Builder {
    private var typeValue: InlineCodeInterpreterCallItemOutputsItemAnyOf1TypeX16cad089? = null

    public var type: InlineCodeInterpreterCallItemOutputsItemAnyOf1TypeX16cad089
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

    public fun build(): InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b {
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      return InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b(
        type = type,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b must be a JSON object")
      val type = json.decodeRequired<InlineCodeInterpreterCallItemOutputsItemAnyOf1TypeX16cad089>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b(
        type = type,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b(block: InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b.Builder.() -> Unit): InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b = InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCodeInterpreterCallItemOutputsItemAnyOf1X9f2ec31b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
