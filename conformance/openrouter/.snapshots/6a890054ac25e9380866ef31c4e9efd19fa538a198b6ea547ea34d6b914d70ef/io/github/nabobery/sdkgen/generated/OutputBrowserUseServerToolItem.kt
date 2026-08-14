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
 * An openrouter:browser_use server tool output item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputBrowserUseServerToolItem
 */
@Serializable(with = OutputBrowserUseServerToolItem.Serializer::class)
public class OutputBrowserUseServerToolItem(
  public val status: ToolCallStatus,
  public val type: InlineOutputBrowserUseServerToolItemTypeX96bf58e6,
  public val action: String? = null,
  public val id: String? = null,
  public val screenshotB64: String? = null,
) {
  public class Builder {
    private var statusValue: ToolCallStatus? = null

    public var status: ToolCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineOutputBrowserUseServerToolItemTypeX96bf58e6? = null

    public var type: InlineOutputBrowserUseServerToolItemTypeX96bf58e6
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var action: String? = null

    public var id: String? = null

    public var screenshotB64: String? = null

    public fun build(): OutputBrowserUseServerToolItem {
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputBrowserUseServerToolItem(
        status = status,
        type = type,
        action = action,
        id = id,
        screenshotB64 = screenshotB64,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputBrowserUseServerToolItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputBrowserUseServerToolItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputBrowserUseServerToolItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputBrowserUseServerToolItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputBrowserUseServerToolItem must be a JSON object")
      val status = json.decodeRequired<ToolCallStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineOutputBrowserUseServerToolItemTypeX96bf58e6>(rawObject, "type")
      return OutputBrowserUseServerToolItem(
        status = status,
        type = type,
        action = rawObject["action"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        screenshotB64 = rawObject["screenshotB64"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputBrowserUseServerToolItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputBrowserUseServerToolItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.action?.let { put("action", it) }
        value.id?.let { put("id", it) }
        value.screenshotB64?.let { put("screenshotB64", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputBrowserUseServerToolItem(block: OutputBrowserUseServerToolItem.Builder.() -> Unit): OutputBrowserUseServerToolItem = OutputBrowserUseServerToolItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputBrowserUseServerToolItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
