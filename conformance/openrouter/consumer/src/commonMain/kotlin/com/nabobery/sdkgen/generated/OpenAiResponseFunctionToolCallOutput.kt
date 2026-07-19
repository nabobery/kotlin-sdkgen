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
public data class OpenAiResponseFunctionToolCallOutputView(
  @SerialName("call_id")
  public val callId: String,
  public val id: String? = null,
  public val output: InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutput,
  public val status: ToolCallStatus? = null,
  public val type: InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesType,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseFunctionToolCallOutput.
 */
@Serializable(with = OpenAiResponseFunctionToolCallOutput.Serializer::class)
public class OpenAiResponseFunctionToolCallOutput(
  public val callId: String,
  public val output: InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutput,
  public val type: InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesType,
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

    private var outputValue:
        InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutput? = null

    public var output: InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutput
      get() = requireNotNull(outputValue) { "output is required" }
      set(`value`) {
        outputValue = value
      }

    private var typeValue:
        InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesType? = null

    public var type: InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    public var status: ToolCallStatus? = null

    public fun build(): OpenAiResponseFunctionToolCallOutput {
      check(callIdValue != null) { "callId is required" }
      check(outputValue != null) { "output is required" }
      check(typeValue != null) { "type is required" }
      return OpenAiResponseFunctionToolCallOutput(
        callId = callId,
        output = output,
        type = type,
        id = id,
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OpenAiResponseFunctionToolCallOutput = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OpenAiResponseFunctionToolCallOutput> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OpenAiResponseFunctionToolCallOutput {
      val jsonDecoder = decoder.requireJsonDecoder("OpenAiResponseFunctionToolCallOutput")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("OpenAiResponseFunctionToolCallOutput must be a JSON object")
      val callId = json.decodeRequired<String>(raw, "call_id")
      val output = json
        .decodeRequired<InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutput>(raw, "output")
      val type = json.decodeRequired<InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesType>(raw,
        "type")
      return OpenAiResponseFunctionToolCallOutput(
        callId = callId,
        output = output,
        type = type,
        id = raw["id"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        status = raw["status"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<ToolCallStatus?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OpenAiResponseFunctionToolCallOutput) {
      val jsonEncoder = encoder.requireJsonEncoder("OpenAiResponseFunctionToolCallOutput")
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

public fun openAiResponseFunctionToolCallOutput(block: OpenAiResponseFunctionToolCallOutput.Builder.() ->
  Unit): OpenAiResponseFunctionToolCallOutput = OpenAiResponseFunctionToolCallOutput.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("OpenAiResponseFunctionToolCallOutput is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
