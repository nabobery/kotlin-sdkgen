package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineClimateRemovalsOrderDeliveriesLocationX4d122060Branch {
  ClimateRemovalsLocation,
}

public sealed class InlineClimateRemovalsOrderDeliveriesLocationX4d122060DecodingException(
  message: String,
) : SerializationException(message)

public class InlineClimateRemovalsOrderDeliveriesLocationX4d122060NoMatchException(
  message: String,
) : InlineClimateRemovalsOrderDeliveriesLocationX4d122060DecodingException(message)

internal data class InlineClimateRemovalsOrderDeliveriesLocationX4d122060Inspection(
  public val matchesClimateRemovalsLocation: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesClimateRemovalsLocation).count { it }
}

/**
 * Specific location of this delivery.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/climate_removals_order_deliveries/properties/location
 */
@Serializable(with = InlineClimateRemovalsOrderDeliveriesLocationX4d122060.Serializer::class)
public class InlineClimateRemovalsOrderDeliveriesLocationX4d122060 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineClimateRemovalsOrderDeliveriesLocationX4d122060Inspection,
) {
  public val climateRemovalsLocation: ClimateRemovalsLocationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesClimateRemovalsLocation) json.decodeFromJsonElement<ClimateRemovalsLocationView>(raw) else null }

  public val matchedBranches: Set<InlineClimateRemovalsOrderDeliveriesLocationX4d122060Branch>
    get() = buildSet {
      if (inspection.matchesClimateRemovalsLocation) add(InlineClimateRemovalsOrderDeliveriesLocationX4d122060Branch.ClimateRemovalsLocation)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineClimateRemovalsOrderDeliveriesLocationX4d122060 {
      val inspection = inspectInlineClimateRemovalsOrderDeliveriesLocationX4d122060(raw)
      if (inspection.matchCount == 0) {
        throw InlineClimateRemovalsOrderDeliveriesLocationX4d122060NoMatchException("InlineClimateRemovalsOrderDeliveriesLocationX4d122060 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineClimateRemovalsOrderDeliveriesLocationX4d122060(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineClimateRemovalsOrderDeliveriesLocationX4d122060> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineClimateRemovalsOrderDeliveriesLocationX4d122060 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineClimateRemovalsOrderDeliveriesLocationX4d122060")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineClimateRemovalsOrderDeliveriesLocationX4d122060) {
      encoder.requireJsonEncoder("InlineClimateRemovalsOrderDeliveriesLocationX4d122060").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineClimateRemovalsOrderDeliveriesLocationX4d122060(element: JsonElement): InlineClimateRemovalsOrderDeliveriesLocationX4d122060Inspection {
  val raw = element as? JsonObject ?: return InlineClimateRemovalsOrderDeliveriesLocationX4d122060Inspection(
    matchesClimateRemovalsLocation = false,
    failures = listOf("ClimateRemovalsLocation: expected JSON object"),
  )
  val matchesClimateRemovalsLocation = raw["country"].isString()
  return InlineClimateRemovalsOrderDeliveriesLocationX4d122060Inspection(
    matchesClimateRemovalsLocation = matchesClimateRemovalsLocation,
    failures = buildList {
      if (!matchesClimateRemovalsLocation) add("ClimateRemovalsLocation: required properties 'country' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
