package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ModerationPlugin.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ModerationPlugin
 */
@Serializable(with = ModerationPlugin.Serializer::class)
public class ModerationPlugin(
  public val id: InlineModerationPluginIdX7d3ab755,
) {
  public class Builder {
    private var idValue: InlineModerationPluginIdX7d3ab755? = null

    public var id: InlineModerationPluginIdX7d3ab755
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    public fun build(): ModerationPlugin {
      check(idValue != null) { "id is required" }
      return ModerationPlugin(
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ModerationPlugin = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ModerationPlugin> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ModerationPlugin {
      val jsonDecoder = decoder.requireJsonDecoder("ModerationPlugin")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ModerationPlugin must be a JSON object")
      val id = json.decodeRequired<InlineModerationPluginIdX7d3ab755>(rawObject, "id")
      return ModerationPlugin(
        id = id,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ModerationPlugin) {
      val jsonEncoder = encoder.requireJsonEncoder("ModerationPlugin")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun moderationPlugin(block: ModerationPlugin.Builder.() -> Unit): ModerationPlugin = ModerationPlugin.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ModerationPlugin is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
