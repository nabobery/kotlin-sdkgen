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

@Serializable
public data class BashServerToolView(
  public val parameters: BashServerToolConfig? = null,
  public val type: InlineBashServerToolTypeXd72600bf,
)

/**
 * OpenRouter built-in server tool: runs shell commands server-side in a sandboxed container
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BashServerTool
 */
@Serializable(with = BashServerTool.Serializer::class)
public class BashServerTool(
  public val type: InlineBashServerToolTypeXd72600bf,
  public val parameters: BashServerToolConfig? = null,
) {
  public class Builder {
    private var typeValue: InlineBashServerToolTypeXd72600bf? = null

    public var type: InlineBashServerToolTypeXd72600bf
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: BashServerToolConfig? = null

    public fun build(): BashServerTool {
      check(typeValue != null) { "type is required" }
      return BashServerTool(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BashServerTool = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BashServerTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BashServerTool {
      val jsonDecoder = decoder.requireJsonDecoder("BashServerTool")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BashServerTool must be a JSON object")
      val type = json.decodeRequired<InlineBashServerToolTypeXd72600bf>(rawObject, "type")
      return BashServerTool(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<BashServerToolConfig>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BashServerTool) {
      val jsonEncoder = encoder.requireJsonEncoder("BashServerTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun bashServerTool(block: BashServerTool.Builder.() -> Unit): BashServerTool = BashServerTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BashServerTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
