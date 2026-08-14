package io.github.nabobery.sdkgen.generated

import kotlin.Int
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesImageGenCallCompleted.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesImageGenCallCompleted
 */
@Serializable(with = OpenAiResponsesImageGenCallCompleted.Serializer::class)
public class OpenAiResponsesImageGenCallCompleted(
  public val itemId: String,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val type: InlineOpenAiResponsesImageGenCallCompletedTypeX22f05767,
) {
  public class Builder {
    private var itemIdValue: String? = null

    public var itemId: String
      get() = requireNotNull(itemIdValue) { "itemId is required" }
      set(`value`) {
        itemIdValue = value
      }

    private var outputIndexValue: Int? = null

    public var outputIndex: Int
      get() = requireNotNull(outputIndexValue) { "outputIndex is required" }
      set(`value`) {
        outputIndexValue = value
      }

    private var sequenceNumberValue: Int? = null

    public var sequenceNumber: Int
      get() = requireNotNull(sequenceNumberValue) { "sequenceNumber is required" }
      set(`value`) {
        sequenceNumberValue = value
      }

    private var typeValue: InlineOpenAiResponsesImageGenCallCompletedTypeX22f05767? = null

    public var type: InlineOpenAiResponsesImageGenCallCompletedTypeX22f05767
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): OpenAiResponsesImageGenCallCompleted {
      check(itemIdValue != null) { "itemId is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return OpenAiResponsesImageGenCallCompleted(
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OpenAiResponsesImageGenCallCompleted = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OpenAiResponsesImageGenCallCompleted> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OpenAiResponsesImageGenCallCompleted {
      val jsonDecoder = decoder.requireJsonDecoder("OpenAiResponsesImageGenCallCompleted")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OpenAiResponsesImageGenCallCompleted must be a JSON object")
      val itemId = json.decodeRequired<String>(rawObject, "item_id")
      val outputIndex = json.decodeRequired<Int>(rawObject, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val type = json.decodeRequired<InlineOpenAiResponsesImageGenCallCompletedTypeX22f05767>(rawObject, "type")
      return OpenAiResponsesImageGenCallCompleted(
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: OpenAiResponsesImageGenCallCompleted) {
      val jsonEncoder = encoder.requireJsonEncoder("OpenAiResponsesImageGenCallCompleted")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("item_id", value.itemId)
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun openAiResponsesImageGenCallCompleted(block: OpenAiResponsesImageGenCallCompleted.Builder.() -> Unit): OpenAiResponsesImageGenCallCompleted = OpenAiResponsesImageGenCallCompleted.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OpenAiResponsesImageGenCallCompleted is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
