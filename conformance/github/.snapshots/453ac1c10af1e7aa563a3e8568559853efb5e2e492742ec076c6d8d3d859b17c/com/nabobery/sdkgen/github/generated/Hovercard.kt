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
 * Hovercard
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/hovercard
 */
@Serializable(with = Hovercard.Serializer::class)
public class Hovercard(
  contexts: List<InlineHovercardContextsItemXffe5ad49>,
) {
  public val contexts: List<InlineHovercardContextsItemXffe5ad49> = contexts.toList()

  public class Builder {
    private var contextsValue: List<InlineHovercardContextsItemXffe5ad49>? = null

    public var contexts: List<InlineHovercardContextsItemXffe5ad49>
      get() = requireNotNull(contextsValue) { "contexts is required" }.toList()
      set(`value`) {
        contextsValue = value.toList()
      }

    public fun build(): Hovercard {
      check(contextsValue != null) { "contexts is required" }
      return Hovercard(
        contexts = contexts,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Hovercard = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Hovercard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Hovercard {
      val jsonDecoder = decoder.requireJsonDecoder("Hovercard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Hovercard must be a JSON object")
      val contexts = json.decodeRequired<List<InlineHovercardContextsItemXffe5ad49>>(rawObject, "contexts")
      return Hovercard(
        contexts = contexts,
      )
    }

    override fun serialize(encoder: Encoder, `value`: Hovercard) {
      val jsonEncoder = encoder.requireJsonEncoder("Hovercard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("contexts", json.encodeToJsonElement(value.contexts))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun hovercard(block: Hovercard.Builder.() -> Unit): Hovercard = Hovercard.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Hovercard is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
