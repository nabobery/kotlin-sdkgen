package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class FunctionCallOutputItemView(
  @SerialName("call_id")
  public val callId: String,
  public val id: String? = null,
  public val output: InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29,
  public val status: ToolCallStatus? = null,
  public val type: InlineOpenAiResponseFunctionToolCallOutputTypeX92f18492,
)

/**
 * The output from a function call execution
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FunctionCallOutputItem
 */
@Serializable(with = FunctionCallOutputItem.Serializer::class)
public class FunctionCallOutputItem(
  public val callId: String,
  public val output: InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29,
  public val type: InlineOpenAiResponseFunctionToolCallOutputTypeX92f18492,
  public val id: String? = null,
  public val status: ToolCallStatus? = null,
) {
  public class Builder {
    private var callIdValue: String? = null

    public var callId: String
      get() = requireNotNull(callIdValue) { "callId is required" }
      set(`value`) {
        callIdValue = value
      }

    private var outputValue: InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29? = null

    public var output: InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29
      get() = requireNotNull(outputValue) { "output is required" }
      set(`value`) {
        outputValue = value
      }

    private var typeValue: InlineOpenAiResponseFunctionToolCallOutputTypeX92f18492? = null

    public var type: InlineOpenAiResponseFunctionToolCallOutputTypeX92f18492
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    public var status: ToolCallStatus? = null

    public fun build(): FunctionCallOutputItem {
      check(callIdValue != null) { "callId is required" }
      check(outputValue != null) { "output is required" }
      check(typeValue != null) { "type is required" }
      return FunctionCallOutputItem(
        callId = callId,
        output = output,
        type = type,
        id = id,
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FunctionCallOutputItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FunctionCallOutputItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FunctionCallOutputItem {
      val jsonDecoder = decoder.requireJsonDecoder("FunctionCallOutputItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FunctionCallOutputItem must be a JSON object")
      val callId = json.decodeRequired<String>(rawObject, "call_id")
      val output = json.decodeRequired<InlineOpenAiResponseFunctionToolCallOutputOutputXf7b1ba29>(rawObject, "output")
      val type = json.decodeRequired<InlineOpenAiResponseFunctionToolCallOutputTypeX92f18492>(rawObject, "type")
      return FunctionCallOutputItem(
        callId = callId,
        output = output,
        type = type,
        id = rawObject["id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        status = rawObject["status"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ToolCallStatus?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: FunctionCallOutputItem) {
      val jsonEncoder = encoder.requireJsonEncoder("FunctionCallOutputItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("call_id", value.callId)
        put("output", json.encodeToJsonElement(value.output))
        put("type", json.encodeToJsonElement(value.type))
        value.id?.let { put("id", it) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun functionCallOutputItem(block: FunctionCallOutputItem.Builder.() -> Unit): FunctionCallOutputItem = FunctionCallOutputItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FunctionCallOutputItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
