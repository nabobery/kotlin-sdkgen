package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1content_exclusion/put/requestBody/content/application~1js
 * on/schema/additionalProperties/items/anyOf/2.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1content_exclusion/put/requestBody/content/application~1js
 * on/schema/additionalProperties/items/anyOf/2
 */
@Serializable(with = InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5.Serializer::class)
public class InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5(
  ifNoneMatch: List<String>,
) {
  public val ifNoneMatch: List<String> = ifNoneMatch.toList()

  public class Builder {
    private var ifNoneMatchValue: List<String>? = null

    public var ifNoneMatch: List<String>
      get() = requireNotNull(ifNoneMatchValue) { "ifNoneMatch is required" }
      set(`value`) {
        ifNoneMatchValue = value
      }

    public fun build(): InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5 {
      check(ifNoneMatchValue != null) { "ifNoneMatch is required" }
      return InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5(
        ifNoneMatch = ifNoneMatch,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5 must be a JSON object")
      val ifNoneMatch = json.decodeRequired<List<String>>(rawObject, "ifNoneMatch")
      return InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5(
        ifNoneMatch = ifNoneMatch,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("ifNoneMatch", json.encodeToJsonElement(value.ifNoneMatch))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5(block: InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5.Builder.() -> Unit): InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5 = InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf3X01f708b5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
