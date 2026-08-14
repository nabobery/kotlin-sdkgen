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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesImageGenCallPartialImage.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesImageGenCallPartialImage
 */
@Serializable(with = OpenAiResponsesImageGenCallPartialImage.Serializer::class)
public class OpenAiResponsesImageGenCallPartialImage(
  public val itemId: String,
  public val outputIndex: Int,
  public val partialImageB64: String,
  public val partialImageIndex: Int,
  public val sequenceNumber: Int,
  public val type: InlineOpenAiResponsesImageGenCallPartialImageTypeXf8c47cdf,
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

    private var partialImageB64Value: String? = null

    public var partialImageB64: String
      get() = requireNotNull(partialImageB64Value) { "partialImageB64 is required" }
      set(`value`) {
        partialImageB64Value = value
      }

    private var partialImageIndexValue: Int? = null

    public var partialImageIndex: Int
      get() = requireNotNull(partialImageIndexValue) { "partialImageIndex is required" }
      set(`value`) {
        partialImageIndexValue = value
      }

    private var sequenceNumberValue: Int? = null

    public var sequenceNumber: Int
      get() = requireNotNull(sequenceNumberValue) { "sequenceNumber is required" }
      set(`value`) {
        sequenceNumberValue = value
      }

    private var typeValue: InlineOpenAiResponsesImageGenCallPartialImageTypeXf8c47cdf? = null

    public var type: InlineOpenAiResponsesImageGenCallPartialImageTypeXf8c47cdf
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): OpenAiResponsesImageGenCallPartialImage {
      check(itemIdValue != null) { "itemId is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(partialImageB64Value != null) { "partialImageB64 is required" }
      check(partialImageIndexValue != null) { "partialImageIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return OpenAiResponsesImageGenCallPartialImage(
        itemId = itemId,
        outputIndex = outputIndex,
        partialImageB64 = partialImageB64,
        partialImageIndex = partialImageIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OpenAiResponsesImageGenCallPartialImage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OpenAiResponsesImageGenCallPartialImage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OpenAiResponsesImageGenCallPartialImage {
      val jsonDecoder = decoder.requireJsonDecoder("OpenAiResponsesImageGenCallPartialImage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OpenAiResponsesImageGenCallPartialImage must be a JSON object")
      val itemId = json.decodeRequired<String>(rawObject, "item_id")
      val outputIndex = json.decodeRequired<Int>(rawObject, "output_index")
      val partialImageB64 = json.decodeRequired<String>(rawObject, "partial_image_b64")
      val partialImageIndex = json.decodeRequired<Int>(rawObject, "partial_image_index")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val type = json.decodeRequired<InlineOpenAiResponsesImageGenCallPartialImageTypeXf8c47cdf>(rawObject, "type")
      return OpenAiResponsesImageGenCallPartialImage(
        itemId = itemId,
        outputIndex = outputIndex,
        partialImageB64 = partialImageB64,
        partialImageIndex = partialImageIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: OpenAiResponsesImageGenCallPartialImage) {
      val jsonEncoder = encoder.requireJsonEncoder("OpenAiResponsesImageGenCallPartialImage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("item_id", value.itemId)
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("partial_image_b64", value.partialImageB64)
        put("partial_image_index", json.encodeToJsonElement(value.partialImageIndex))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun openAiResponsesImageGenCallPartialImage(block: OpenAiResponsesImageGenCallPartialImage.Builder.() -> Unit): OpenAiResponsesImageGenCallPartialImage = OpenAiResponsesImageGenCallPartialImage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OpenAiResponsesImageGenCallPartialImage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
