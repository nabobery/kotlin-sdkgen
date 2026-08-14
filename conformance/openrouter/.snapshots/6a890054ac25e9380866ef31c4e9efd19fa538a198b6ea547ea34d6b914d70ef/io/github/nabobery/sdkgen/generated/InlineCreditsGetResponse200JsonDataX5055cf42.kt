package io.github.nabobery.sdkgen.generated

import kotlin.Double
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1credits/get/responses/200/content/application~1json/schema/properties/data.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1credits/get/responses/200/content/application~1json/schema/properties/data
 */
@Serializable(with = InlineCreditsGetResponse200JsonDataX5055cf42.Serializer::class)
public class InlineCreditsGetResponse200JsonDataX5055cf42(
  /**
   * Total credits purchased
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val totalCredits: Double,
  /**
   * Total credits used
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val totalUsage: Double,
) {
  public class Builder {
    private var totalCreditsValue: Double? = null

    public var totalCredits: Double
      get() = requireNotNull(totalCreditsValue) { "totalCredits is required" }
      set(`value`) {
        totalCreditsValue = value
      }

    private var totalUsageValue: Double? = null

    public var totalUsage: Double
      get() = requireNotNull(totalUsageValue) { "totalUsage is required" }
      set(`value`) {
        totalUsageValue = value
      }

    public fun build(): InlineCreditsGetResponse200JsonDataX5055cf42 {
      check(totalCreditsValue != null) { "totalCredits is required" }
      check(totalUsageValue != null) { "totalUsage is required" }
      return InlineCreditsGetResponse200JsonDataX5055cf42(
        totalCredits = totalCredits,
        totalUsage = totalUsage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCreditsGetResponse200JsonDataX5055cf42 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCreditsGetResponse200JsonDataX5055cf42> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCreditsGetResponse200JsonDataX5055cf42 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCreditsGetResponse200JsonDataX5055cf42")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCreditsGetResponse200JsonDataX5055cf42 must be a JSON object")
      val totalCredits = json.decodeRequired<Double>(rawObject, "total_credits")
      val totalUsage = json.decodeRequired<Double>(rawObject, "total_usage")
      return InlineCreditsGetResponse200JsonDataX5055cf42(
        totalCredits = totalCredits,
        totalUsage = totalUsage,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCreditsGetResponse200JsonDataX5055cf42) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCreditsGetResponse200JsonDataX5055cf42")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("total_credits", json.encodeToJsonElement(value.totalCredits))
        put("total_usage", json.encodeToJsonElement(value.totalUsage))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCreditsGetResponse200JsonDataX5055cf42(block: InlineCreditsGetResponse200JsonDataX5055cf42.Builder.() -> Unit): InlineCreditsGetResponse200JsonDataX5055cf42 = InlineCreditsGetResponse200JsonDataX5055cf42.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCreditsGetResponse200JsonDataX5055cf42 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
