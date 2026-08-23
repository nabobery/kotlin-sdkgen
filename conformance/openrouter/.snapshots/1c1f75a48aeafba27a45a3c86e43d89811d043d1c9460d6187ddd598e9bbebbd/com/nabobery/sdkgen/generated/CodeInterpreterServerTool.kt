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
public data class CodeInterpreterServerToolView(
  public val container: InlineCodeInterpreterServerToolContainerX490ea590,
  public val type: InlineCodeInterpreterServerToolTypeX77a72d83,
)

/**
 * Code interpreter tool configuration
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterServerTool
 */
@Serializable(with = CodeInterpreterServerTool.Serializer::class)
public class CodeInterpreterServerTool(
  public val container: InlineCodeInterpreterServerToolContainerX490ea590,
  public val type: InlineCodeInterpreterServerToolTypeX77a72d83,
) {
  public class Builder {
    private var containerValue: InlineCodeInterpreterServerToolContainerX490ea590? = null

    public var container: InlineCodeInterpreterServerToolContainerX490ea590
      get() = requireNotNull(containerValue) { "container is required" }
      set(`value`) {
        containerValue = value
      }

    private var typeValue: InlineCodeInterpreterServerToolTypeX77a72d83? = null

    public var type: InlineCodeInterpreterServerToolTypeX77a72d83
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): CodeInterpreterServerTool {
      check(containerValue != null) { "container is required" }
      check(typeValue != null) { "type is required" }
      return CodeInterpreterServerTool(
        container = container,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeInterpreterServerTool = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CodeInterpreterServerTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeInterpreterServerTool {
      val jsonDecoder = decoder.requireJsonDecoder("CodeInterpreterServerTool")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeInterpreterServerTool must be a JSON object")
      val container = json.decodeRequired<InlineCodeInterpreterServerToolContainerX490ea590>(rawObject, "container")
      val type = json.decodeRequired<InlineCodeInterpreterServerToolTypeX77a72d83>(rawObject, "type")
      return CodeInterpreterServerTool(
        container = container,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeInterpreterServerTool) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeInterpreterServerTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("container", json.encodeToJsonElement(value.container))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeInterpreterServerTool(block: CodeInterpreterServerTool.Builder.() -> Unit): CodeInterpreterServerTool = CodeInterpreterServerTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodeInterpreterServerTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
