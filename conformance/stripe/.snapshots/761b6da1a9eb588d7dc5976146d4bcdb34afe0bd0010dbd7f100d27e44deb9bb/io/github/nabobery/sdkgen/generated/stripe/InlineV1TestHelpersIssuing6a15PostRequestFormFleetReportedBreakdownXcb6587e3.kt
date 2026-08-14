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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1finalize_amount/pos
 * t/requestBody/content/application~1x-www-form-urlencoded/schema/properties/fleet/properties/reported_breakdown.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1finalize_amount/pos
 * t/requestBody/content/application~1x-www-form-urlencoded/schema/properties/fleet/properties/reported_breakdown
 */
@Serializable(with = InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownXcb6587e3.Serializer::class)
public class InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownXcb6587e3(
  public val fuel:
      InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownFuelX25b1897d? = null,
  public val nonFuel: InlineV1TestHelpersIssuing6a15PostRequestFormFleetNonFuelXaa29a30f? = null,
  public val tax:
      InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownTaxX84bd73c4? = null,
) {
  public class Builder {
    public var fuel:
        InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownFuelX25b1897d? = null

    public var nonFuel: InlineV1TestHelpersIssuing6a15PostRequestFormFleetNonFuelXaa29a30f? = null

    public var tax: InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownTaxX84bd73c4?
        = null

    public fun build(): InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownXcb6587e3 = InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownXcb6587e3(
      fuel = fuel,
      nonFuel = nonFuel,
      tax = tax,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownXcb6587e3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownXcb6587e3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownXcb6587e3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownXcb6587e3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownXcb6587e3 must be a JSON object")
      return InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownXcb6587e3(
        fuel = rawObject["fuel"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownFuelX25b1897d>(it) },
        nonFuel = rawObject["non_fuel"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing6a15PostRequestFormFleetNonFuelXaa29a30f>(it) },
        tax = rawObject["tax"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownTaxX84bd73c4>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownXcb6587e3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownXcb6587e3")
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

public fun inlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownXcb6587e3(block: InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownXcb6587e3.Builder.() -> Unit): InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownXcb6587e3 = InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownXcb6587e3.build(block)
