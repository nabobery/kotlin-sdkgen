package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
public data class TransformUsageView(
  @SerialName("divide_by")
  public val divideBy: Int,
  public val round: InlineTransformUsageRoundX228c2a46,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/transform_usage
 */
@Serializable(with = TransformUsage.Serializer::class)
public class TransformUsage(
  /**
   * Divide usage by this number.
   */
  public val divideBy: Int,
  /**
   * After division, either round the result `up` or `down`.
   */
  public val round: InlineTransformUsageRoundX228c2a46,
) {
  public class Builder {
    private var divideByValue: Int? = null

    public var divideBy: Int
      get() = requireNotNull(divideByValue) { "divideBy is required" }
      set(`value`) {
        divideByValue = value
      }

    private var roundValue: InlineTransformUsageRoundX228c2a46? = null

    public var round: InlineTransformUsageRoundX228c2a46
      get() = requireNotNull(roundValue) { "round is required" }
      set(`value`) {
        roundValue = value
      }

    public fun build(): TransformUsage {
      check(divideByValue != null) { "divideBy is required" }
      check(roundValue != null) { "round is required" }
      return TransformUsage(
        divideBy = divideBy,
        round = round,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TransformUsage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TransformUsage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TransformUsage {
      val jsonDecoder = decoder.requireJsonDecoder("TransformUsage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TransformUsage must be a JSON object")
      val divideBy = json.decodeRequired<Int>(rawObject, "divide_by")
      val round = json.decodeRequired<InlineTransformUsageRoundX228c2a46>(rawObject, "round")
      return TransformUsage(
        divideBy = divideBy,
        round = round,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TransformUsage) {
      val jsonEncoder = encoder.requireJsonEncoder("TransformUsage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("divide_by", json.encodeToJsonElement(value.divideBy))
        put("round", json.encodeToJsonElement(value.round))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun transformUsage(block: TransformUsage.Builder.() -> Unit): TransformUsage = TransformUsage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TransformUsage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
