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
 * on/schema/additionalProperties/items/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1content_exclusion/put/requestBody/content/application~1js
 * on/schema/additionalProperties/items/anyOf/1
 */
@Serializable(with = InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5.Serializer::class)
public class InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5(
  ifAnyMatch: List<String>,
) {
  public val ifAnyMatch: List<String> = ifAnyMatch.toList()

  public class Builder {
    private var ifAnyMatchValue: List<String>? = null

    public var ifAnyMatch: List<String>
      get() = requireNotNull(ifAnyMatchValue) { "ifAnyMatch is required" }.toList()
      set(`value`) {
        ifAnyMatchValue = value.toList()
      }

    public fun build(): InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5 {
      check(ifAnyMatchValue != null) { "ifAnyMatch is required" }
      return InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5(
        ifAnyMatch = ifAnyMatch,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5 must be a JSON object")
      val ifAnyMatch = json.decodeRequired<List<String>>(rawObject, "ifAnyMatch")
      return InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5(
        ifAnyMatch = ifAnyMatch,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("ifAnyMatch", json.encodeToJsonElement(value.ifAnyMatch))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5(block: InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5.Builder.() -> Unit): InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5 = InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotContentExe805PutRequestJsonAdditionalValueItemAnyOf2Xb96e31b5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
