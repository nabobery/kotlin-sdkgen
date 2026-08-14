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

@Serializable
public data class OutputItemImageGenerationCallView(
  public val id: String,
  public val result: String? = null,
  public val status: ImageGenerationStatus,
  public val type: InlineOutputItemImageGenerationCallTypeX8aee14b8,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OutputItemImageGenerationCall.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemImageGenerationCall
 */
@Serializable(with = OutputItemImageGenerationCall.Serializer::class)
public class OutputItemImageGenerationCall(
  public val id: String,
  public val status: ImageGenerationStatus,
  public val type: InlineOutputItemImageGenerationCallTypeX8aee14b8,
  public val result: String? = null,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var statusValue: ImageGenerationStatus? = null

    public var status: ImageGenerationStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineOutputItemImageGenerationCallTypeX8aee14b8? = null

    public var type: InlineOutputItemImageGenerationCallTypeX8aee14b8
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var result: String? = null

    public fun build(): OutputItemImageGenerationCall {
      check(idValue != null) { "id is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputItemImageGenerationCall(
        id = id,
        status = status,
        type = type,
        result = result,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputItemImageGenerationCall = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputItemImageGenerationCall> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputItemImageGenerationCall {
      val jsonDecoder = decoder.requireJsonDecoder("OutputItemImageGenerationCall")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputItemImageGenerationCall must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val status = json.decodeRequired<ImageGenerationStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineOutputItemImageGenerationCallTypeX8aee14b8>(rawObject, "type")
      return OutputItemImageGenerationCall(
        id = id,
        status = status,
        type = type,
        result = rawObject["result"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputItemImageGenerationCall) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputItemImageGenerationCall")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.result?.let { put("result", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputItemImageGenerationCall(block: OutputItemImageGenerationCall.Builder.() -> Unit): OutputItemImageGenerationCall = OutputItemImageGenerationCall.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputItemImageGenerationCall is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
