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
 * A native `shell_call_output` item matching OpenAI's Responses API shape. Carries per-command stdout, stderr, and the
 * exit/timeout outcome.
 */
@Serializable(with = OutputShellCallOutputItem.Serializer::class)
public class OutputShellCallOutputItem(
  public val callId: String,
  public val id: String,
  output: List<InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems>,
  public val status: ShellCallStatus,
  public val type: InlineComponentsSchemasOutputShellCallOutputItemPropertiesType,
  public val maxOutputLength: Int? = null,
) {
  public val output: List<InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems> =
      output.toList()

  public class Builder {
    private var callIdValue: String? = null

    public var callId: String
      get() = requireNotNull(callIdValue) { "callId is required" }
      set(`value`) {
        callIdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var outputValue:
        List<InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems>? = null

    public var output: List<InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems>
      get() = requireNotNull(outputValue) { "output is required" }
      set(`value`) {
        outputValue = value
      }

    private var statusValue: ShellCallStatus? = null

    public var status: ShellCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineComponentsSchemasOutputShellCallOutputItemPropertiesType? = null

    public var type: InlineComponentsSchemasOutputShellCallOutputItemPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var maxOutputLength: Int? = null

    public fun build(): OutputShellCallOutputItem {
      check(callIdValue != null) { "callId is required" }
      check(idValue != null) { "id is required" }
      check(outputValue != null) { "output is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputShellCallOutputItem(
        callId = callId,
        id = id,
        output = output,
        status = status,
        type = type,
        maxOutputLength = maxOutputLength,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputShellCallOutputItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OutputShellCallOutputItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputShellCallOutputItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputShellCallOutputItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("OutputShellCallOutputItem must be a JSON object")
      val callId = json.decodeRequired<String>(raw, "call_id")
      val id = json.decodeRequired<String>(raw, "id")
      val output = json
        .decodeRequired<List<InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems>>(raw, "output")
      val status = json.decodeRequired<ShellCallStatus>(raw, "status")
      val type = json.decodeRequired<InlineComponentsSchemasOutputShellCallOutputItemPropertiesType>(raw, "type")
      return OutputShellCallOutputItem(
        callId = callId,
        id = id,
        output = output,
        status = status,
        type = type,
        maxOutputLength = raw["max_output_length"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputShellCallOutputItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputShellCallOutputItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("call_id", value.callId)
        put("id", value.id)
        put("output", json.encodeToJsonElement(value.output))
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.maxOutputLength?.let { put("max_output_length", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputShellCallOutputItem(block: OutputShellCallOutputItem.Builder.() -> Unit): OutputShellCallOutputItem =
  OutputShellCallOutputItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputShellCallOutputItem is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
