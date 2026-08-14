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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * An openrouter:memory server tool output item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputMemoryServerToolItem
 */
@Serializable(with = OutputMemoryServerToolItem.Serializer::class)
public class OutputMemoryServerToolItem(
  public val status: ToolCallStatus,
  public val type: InlineOutputMemoryServerToolItemTypeX145b938f,
  public val action: InlineOutputMemoryServerToolItemActionXb8c603c2? = null,
  public val id: String? = null,
  public val key: String? = null,
  public val `value`: JsonElement? = null,
) {
  public class Builder {
    private var statusValue: ToolCallStatus? = null

    public var status: ToolCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineOutputMemoryServerToolItemTypeX145b938f? = null

    public var type: InlineOutputMemoryServerToolItemTypeX145b938f
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var action: InlineOutputMemoryServerToolItemActionXb8c603c2? = null

    public var id: String? = null

    public var key: String? = null

    public var `value`: JsonElement? = null

    public fun build(): OutputMemoryServerToolItem {
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputMemoryServerToolItem(
        status = status,
        type = type,
        action = action,
        id = id,
        key = key,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputMemoryServerToolItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputMemoryServerToolItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputMemoryServerToolItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputMemoryServerToolItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputMemoryServerToolItem must be a JSON object")
      val status = json.decodeRequired<ToolCallStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineOutputMemoryServerToolItemTypeX145b938f>(rawObject, "type")
      return OutputMemoryServerToolItem(
        status = status,
        type = type,
        action = rawObject["action"]?.let { json.decodeFromJsonElement<InlineOutputMemoryServerToolItemActionXb8c603c2>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        key = rawObject["key"]?.let { json.decodeFromJsonElement<String>(it) },
        value = rawObject["value"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonElement?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputMemoryServerToolItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputMemoryServerToolItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.action?.let { put("action", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
        value.key?.let { put("key", it) }
        value.value?.let { put("value", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputMemoryServerToolItem(block: OutputMemoryServerToolItem.Builder.() -> Unit): OutputMemoryServerToolItem = OutputMemoryServerToolItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputMemoryServerToolItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
