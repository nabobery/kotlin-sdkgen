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
public data class OpenAiResponsesRefusalContentView(
  public val refusal: String,
  public val type: InlineOpenAiResponsesRefusalContentTypeX3fc7cdfe,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesRefusalContent.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesRefusalContent
 */
@Serializable(with = OpenAiResponsesRefusalContent.Serializer::class)
public class OpenAiResponsesRefusalContent(
  public val refusal: String,
  public val type: InlineOpenAiResponsesRefusalContentTypeX3fc7cdfe,
) {
  public class Builder {
    private var refusalValue: String? = null

    public var refusal: String
      get() = requireNotNull(refusalValue) { "refusal is required" }
      set(`value`) {
        refusalValue = value
      }

    private var typeValue: InlineOpenAiResponsesRefusalContentTypeX3fc7cdfe? = null

    public var type: InlineOpenAiResponsesRefusalContentTypeX3fc7cdfe
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): OpenAiResponsesRefusalContent {
      check(refusalValue != null) { "refusal is required" }
      check(typeValue != null) { "type is required" }
      return OpenAiResponsesRefusalContent(
        refusal = refusal,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OpenAiResponsesRefusalContent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OpenAiResponsesRefusalContent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OpenAiResponsesRefusalContent {
      val jsonDecoder = decoder.requireJsonDecoder("OpenAiResponsesRefusalContent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OpenAiResponsesRefusalContent must be a JSON object")
      val refusal = json.decodeRequired<String>(rawObject, "refusal")
      val type = json.decodeRequired<InlineOpenAiResponsesRefusalContentTypeX3fc7cdfe>(rawObject, "type")
      return OpenAiResponsesRefusalContent(
        refusal = refusal,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: OpenAiResponsesRefusalContent) {
      val jsonEncoder = encoder.requireJsonEncoder("OpenAiResponsesRefusalContent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("refusal", value.refusal)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun openAiResponsesRefusalContent(block: OpenAiResponsesRefusalContent.Builder.() -> Unit): OpenAiResponsesRefusalContent = OpenAiResponsesRefusalContent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OpenAiResponsesRefusalContent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
