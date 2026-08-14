package io.github.nabobery.sdkgen.generated.stripe

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
public data class TransformQuantityView(
  @SerialName("divide_by")
  public val divideBy: Int,
  public val round: InlineTransformQuantityRoundX2bdb6f5a,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/transform_quantity
 */
@Serializable(with = TransformQuantity.Serializer::class)
public class TransformQuantity(
  /**
   * Divide usage by this number.
   */
  public val divideBy: Int,
  /**
   * After division, either round the result `up` or `down`.
   */
  public val round: InlineTransformQuantityRoundX2bdb6f5a,
) {
  public class Builder {
    private var divideByValue: Int? = null

    public var divideBy: Int
      get() = requireNotNull(divideByValue) { "divideBy is required" }
      set(`value`) {
        divideByValue = value
      }

    private var roundValue: InlineTransformQuantityRoundX2bdb6f5a? = null

    public var round: InlineTransformQuantityRoundX2bdb6f5a
      get() = requireNotNull(roundValue) { "round is required" }
      set(`value`) {
        roundValue = value
      }

    public fun build(): TransformQuantity {
      check(divideByValue != null) { "divideBy is required" }
      check(roundValue != null) { "round is required" }
      return TransformQuantity(
        divideBy = divideBy,
        round = round,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TransformQuantity = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TransformQuantity> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TransformQuantity {
      val jsonDecoder = decoder.requireJsonDecoder("TransformQuantity")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TransformQuantity must be a JSON object")
      val divideBy = json.decodeRequired<Int>(rawObject, "divide_by")
      val round = json.decodeRequired<InlineTransformQuantityRoundX2bdb6f5a>(rawObject, "round")
      return TransformQuantity(
        divideBy = divideBy,
        round = round,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TransformQuantity) {
      val jsonEncoder = encoder.requireJsonEncoder("TransformQuantity")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("divide_by", json.encodeToJsonElement(value.divideBy))
        put("round", json.encodeToJsonElement(value.round))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun transformQuantity(block: TransformQuantity.Builder.() -> Unit): TransformQuantity = TransformQuantity.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TransformQuantity is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
