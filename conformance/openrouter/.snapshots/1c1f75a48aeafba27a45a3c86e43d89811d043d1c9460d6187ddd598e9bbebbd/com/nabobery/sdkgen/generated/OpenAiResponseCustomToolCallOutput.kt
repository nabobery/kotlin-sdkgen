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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class OpenAiResponseCustomToolCallOutputView(
  @SerialName("call_id")
  public val callId: String,
  public val id: String? = null,
  public val output: InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3f,
  public val type: InlineOpenAiResponseCustomToolCallOutputTypeX660b542f,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseCustomToolCallOutput.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseCustomToolCallOutput
 */
@Serializable(with = OpenAiResponseCustomToolCallOutput.Serializer::class)
public class OpenAiResponseCustomToolCallOutput(
  public val callId: String,
  public val output: InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3f,
  public val type: InlineOpenAiResponseCustomToolCallOutputTypeX660b542f,
  public val id: String? = null,
) {
  public class Builder {
    private var callIdValue: String? = null

    public var callId: String
      get() = requireNotNull(callIdValue) { "callId is required" }
      set(`value`) {
        callIdValue = value
      }

    private var outputValue: InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3f? = null

    public var output: InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3f
      get() = requireNotNull(outputValue) { "output is required" }
      set(`value`) {
        outputValue = value
      }

    private var typeValue: InlineOpenAiResponseCustomToolCallOutputTypeX660b542f? = null

    public var type: InlineOpenAiResponseCustomToolCallOutputTypeX660b542f
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    public fun build(): OpenAiResponseCustomToolCallOutput {
      check(callIdValue != null) { "callId is required" }
      check(outputValue != null) { "output is required" }
      check(typeValue != null) { "type is required" }
      return OpenAiResponseCustomToolCallOutput(
        callId = callId,
        output = output,
        type = type,
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OpenAiResponseCustomToolCallOutput = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OpenAiResponseCustomToolCallOutput> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OpenAiResponseCustomToolCallOutput {
      val jsonDecoder = decoder.requireJsonDecoder("OpenAiResponseCustomToolCallOutput")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OpenAiResponseCustomToolCallOutput must be a JSON object")
      val callId = json.decodeRequired<String>(rawObject, "call_id")
      val output = json.decodeRequired<InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3f>(rawObject, "output")
      val type = json.decodeRequired<InlineOpenAiResponseCustomToolCallOutputTypeX660b542f>(rawObject, "type")
      return OpenAiResponseCustomToolCallOutput(
        callId = callId,
        output = output,
        type = type,
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OpenAiResponseCustomToolCallOutput) {
      val jsonEncoder = encoder.requireJsonEncoder("OpenAiResponseCustomToolCallOutput")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("call_id", value.callId)
        put("output", json.encodeToJsonElement(value.output))
        put("type", json.encodeToJsonElement(value.type))
        value.id?.let { put("id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun openAiResponseCustomToolCallOutput(block: OpenAiResponseCustomToolCallOutput.Builder.() -> Unit): OpenAiResponseCustomToolCallOutput = OpenAiResponseCustomToolCallOutput.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OpenAiResponseCustomToolCallOutput is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
