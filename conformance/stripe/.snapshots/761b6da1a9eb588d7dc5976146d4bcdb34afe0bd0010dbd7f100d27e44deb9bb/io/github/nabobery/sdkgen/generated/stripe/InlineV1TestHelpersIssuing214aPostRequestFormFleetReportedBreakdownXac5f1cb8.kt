package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/fleet/properties/reported_breakdown.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/fleet/properties/reported_breakdown
 */
@Serializable(with = InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownXac5f1cb8.Serializer::class)
public class InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownXac5f1cb8(
  public val fuel:
      InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownFuelX0df54af8? = null,
  public val nonFuel: InlineV1TestHelpersIssuing214aPostRequestFormFleetNonFuelXe942c4cb? = null,
  public val tax:
      InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownTaxXad70374f? = null,
) {
  public class Builder {
    public var fuel:
        InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownFuelX0df54af8? = null

    public var nonFuel: InlineV1TestHelpersIssuing214aPostRequestFormFleetNonFuelXe942c4cb? = null

    public var tax: InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownTaxXad70374f?
        = null

    public fun build(): InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownXac5f1cb8 = InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownXac5f1cb8(
      fuel = fuel,
      nonFuel = nonFuel,
      tax = tax,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownXac5f1cb8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownXac5f1cb8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownXac5f1cb8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownXac5f1cb8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownXac5f1cb8 must be a JSON object")
      return InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownXac5f1cb8(
        fuel = rawObject["fuel"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownFuelX0df54af8>(it) },
        nonFuel = rawObject["non_fuel"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing214aPostRequestFormFleetNonFuelXe942c4cb>(it) },
        tax = rawObject["tax"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownTaxXad70374f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownXac5f1cb8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownXac5f1cb8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.fuel?.let { put("fuel", json.encodeToJsonElement(it)) }
        value.nonFuel?.let { put("non_fuel", json.encodeToJsonElement(it)) }
        value.tax?.let { put("tax", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownXac5f1cb8(block: InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownXac5f1cb8.Builder.() -> Unit): InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownXac5f1cb8 = InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownXac5f1cb8.build(block)
