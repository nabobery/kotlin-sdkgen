package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class ResponseOutputTextView(
  public val annotations: List<OpenAiResponsesAnnotation>? = null,
  public val logprobs:
      List<InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItems>? = null,
  public val text: String,
  public val type: InlineComponentsSchemasResponseOutputTextPropertiesType,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ResponseOutputText.
 */
@Serializable(with = ResponseOutputText.Serializer::class)
public class ResponseOutputText(
  public val text: String,
  public val type: InlineComponentsSchemasResponseOutputTextPropertiesType,
  public val annotations: List<OpenAiResponsesAnnotation>? = null,
  public val logprobs:
      List<InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItems>? = null,
) {
  public class Builder {
    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    private var typeValue: InlineComponentsSchemasResponseOutputTextPropertiesType? = null

    public var type: InlineComponentsSchemasResponseOutputTextPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var annotations: List<OpenAiResponsesAnnotation>? = null

    public var logprobs: List<InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItems>? =
        null

    public fun build(): ResponseOutputText {
      check(textValue != null) { "text is required" }
      check(typeValue != null) { "type is required" }
      return ResponseOutputText(
        text = text,
        type = type,
        annotations = annotations,
        logprobs = logprobs,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ResponseOutputText = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ResponseOutputText> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ResponseOutputText {
      val jsonDecoder = decoder.requireJsonDecoder("ResponseOutputText")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ResponseOutputText must be a JSON object")
      val text = json.decodeRequired<String>(raw, "text")
      val type = json.decodeRequired<InlineComponentsSchemasResponseOutputTextPropertiesType>(raw, "type")
      return ResponseOutputText(
        text = text,
        type = type,
        annotations = raw["annotations"]?.let { json.decodeFromJsonElement<List<OpenAiResponsesAnnotation>>(it) },
        logprobs = raw["logprobs"]?.let { json
          .decodeFromJsonElement<List<InlineComponentsSchemasResponseOutputTextPropertiesLogprobsItems>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ResponseOutputText) {
      val jsonEncoder = encoder.requireJsonEncoder("ResponseOutputText")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("text", value.text)
        put("type", json.encodeToJsonElement(value.type))
        value.annotations?.let { put("annotations", json.encodeToJsonElement(it)) }
        value.logprobs?.let { put("logprobs", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun responseOutputText(block: ResponseOutputText.Builder.() -> Unit): ResponseOutputText = ResponseOutputText
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ResponseOutputText is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
