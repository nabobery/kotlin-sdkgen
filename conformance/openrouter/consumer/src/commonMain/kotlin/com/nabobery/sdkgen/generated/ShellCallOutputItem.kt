package com.nabobery.sdkgen.generated

import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Output from a shell command execution (newer variant)
 */
@Serializable(with = ShellCallOutputItem.Serializer::class)
public class ShellCallOutputItem(
  public val callId: String,
  output: List<InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems>,
  public val type: InlineComponentsSchemasShellCallOutputItemPropertiesType,
  public val id: String? = null,
  public val maxOutputLength: Int? = null,
  public val status: ToolCallStatus? = null,
) {
  public val output: List<InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems> =
      output.toList()

  public class Builder {
    private var callIdValue: String? = null

    public var callId: String
      get() = requireNotNull(callIdValue) { "callId is required" }
      set(`value`) {
        callIdValue = value
      }

    private var outputValue: List<InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems>?
        = null

    public var output: List<InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems>
      get() = requireNotNull(outputValue) { "output is required" }
      set(`value`) {
        outputValue = value
      }

    private var typeValue: InlineComponentsSchemasShellCallOutputItemPropertiesType? = null

    public var type: InlineComponentsSchemasShellCallOutputItemPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    public var maxOutputLength: Int? = null

    public var status: ToolCallStatus? = null

    public fun build(): ShellCallOutputItem {
      check(callIdValue != null) { "callId is required" }
      check(outputValue != null) { "output is required" }
      check(typeValue != null) { "type is required" }
      return ShellCallOutputItem(
        callId = callId,
        output = output,
        type = type,
        id = id,
        maxOutputLength = maxOutputLength,
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ShellCallOutputItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ShellCallOutputItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ShellCallOutputItem {
      val jsonDecoder = decoder.requireJsonDecoder("ShellCallOutputItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ShellCallOutputItem must be a JSON object")
      val callId = json.decodeRequired<String>(raw, "call_id")
      val output = json.decodeRequired<List<InlineComponentsSchemasShellCallOutputItemPropertiesOutputItems>>(raw,
        "output")
      val type = json.decodeRequired<InlineComponentsSchemasShellCallOutputItemPropertiesType>(raw, "type")
      return ShellCallOutputItem(
        callId = callId,
        output = output,
        type = type,
        id = raw["id"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        maxOutputLength = raw["max_output_length"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        status = raw["status"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<ToolCallStatus?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ShellCallOutputItem) {
      val jsonEncoder = encoder.requireJsonEncoder("ShellCallOutputItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("call_id", value.callId)
        put("output", json.encodeToJsonElement(value.output))
        put("type", json.encodeToJsonElement(value.type))
        value.id?.let { put("id", it) }
        value.maxOutputLength?.let { put("max_output_length", json.encodeToJsonElement(it)) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun shellCallOutputItem(block: ShellCallOutputItem.Builder.() -> Unit): ShellCallOutputItem =
  ShellCallOutputItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ShellCallOutputItem is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
