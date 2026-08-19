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

@Serializable
public data class CodexLocalShellToolView(
  public val type: InlineCodexLocalShellToolTypeX65141ad7,
)

/**
 * Local shell tool configuration
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CodexLocalShellTool
 */
@Serializable(with = CodexLocalShellTool.Serializer::class)
public class CodexLocalShellTool(
  public val type: InlineCodexLocalShellToolTypeX65141ad7,
) {
  public class Builder {
    private var typeValue: InlineCodexLocalShellToolTypeX65141ad7? = null

    public var type: InlineCodexLocalShellToolTypeX65141ad7
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): CodexLocalShellTool {
      check(typeValue != null) { "type is required" }
      return CodexLocalShellTool(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodexLocalShellTool = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CodexLocalShellTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodexLocalShellTool {
      val jsonDecoder = decoder.requireJsonDecoder("CodexLocalShellTool")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodexLocalShellTool must be a JSON object")
      val type = json.decodeRequired<InlineCodexLocalShellToolTypeX65141ad7>(rawObject, "type")
      return CodexLocalShellTool(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodexLocalShellTool) {
      val jsonEncoder = encoder.requireJsonEncoder("CodexLocalShellTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codexLocalShellTool(block: CodexLocalShellTool.Builder.() -> Unit): CodexLocalShellTool = CodexLocalShellTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodexLocalShellTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
