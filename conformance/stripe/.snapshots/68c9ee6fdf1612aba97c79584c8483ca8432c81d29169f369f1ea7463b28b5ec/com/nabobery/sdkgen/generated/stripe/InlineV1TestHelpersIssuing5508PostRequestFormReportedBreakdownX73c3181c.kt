package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1capture/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/repor
 * ted_breakdown.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1capture/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/repor
 * ted_breakdown
 */
@Serializable(with = InlineV1TestHelpersIssuing5508PostRequestFormReportedBreakdownX73c3181c.Serializer::class)
public class InlineV1TestHelpersIssuing5508PostRequestFormReportedBreakdownX73c3181c(
  public val fuel:
      InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetFuelXd56fda72? = null,
  public val nonFuel:
      InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsNonFuelX831a437e? = null,
  public val tax:
      InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetTaxX63a334fe? = null,
) {
  public class Builder {
    public var fuel: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetFuelXd56fda72?
        = null

    public var nonFuel:
        InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsNonFuelX831a437e? = null

    public var tax: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetTaxX63a334fe? =
        null

    public fun build(): InlineV1TestHelpersIssuing5508PostRequestFormReportedBreakdownX73c3181c = InlineV1TestHelpersIssuing5508PostRequestFormReportedBreakdownX73c3181c(
      fuel = fuel,
      nonFuel = nonFuel,
      tax = tax,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing5508PostRequestFormReportedBreakdownX73c3181c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing5508PostRequestFormReportedBreakdownX73c3181c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing5508PostRequestFormReportedBreakdownX73c3181c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing5508PostRequestFormReportedBreakdownX73c3181c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing5508PostRequestFormReportedBreakdownX73c3181c must be a JSON object")
      return InlineV1TestHelpersIssuing5508PostRequestFormReportedBreakdownX73c3181c(
        fuel = rawObject["fuel"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetFuelXd56fda72>(it) },
        nonFuel = rawObject["non_fuel"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsNonFuelX831a437e>(it) },
        tax = rawObject["tax"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetTaxX63a334fe>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing5508PostRequestFormReportedBreakdownX73c3181c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing5508PostRequestFormReportedBreakdownX73c3181c")
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

public fun inlineV1TestHelpersIssuing5508PostRequestFormReportedBreakdownX73c3181c(block: InlineV1TestHelpersIssuing5508PostRequestFormReportedBreakdownX73c3181c.Builder.() -> Unit): InlineV1TestHelpersIssuing5508PostRequestFormReportedBreakdownX73c3181c = InlineV1TestHelpersIssuing5508PostRequestFormReportedBreakdownX73c3181c.build(block)
