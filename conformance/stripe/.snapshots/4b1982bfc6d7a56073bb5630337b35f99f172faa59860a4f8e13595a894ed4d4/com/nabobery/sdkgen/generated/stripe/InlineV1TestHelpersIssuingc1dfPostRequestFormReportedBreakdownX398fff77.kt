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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_unlinked_refund/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/reported_
 * breakdown.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_unlinked_refund/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/reported_
 * breakdown
 */
@Serializable(with = InlineV1TestHelpersIssuingc1dfPostRequestFormReportedBreakdownX398fff77.Serializer::class)
public class InlineV1TestHelpersIssuingc1dfPostRequestFormReportedBreakdownX398fff77(
  public val fuel:
      InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetFuelX65b04542? = null,
  public val nonFuel:
      InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsNonFuelXef4d033a? = null,
  public val tax:
      InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetTaxXb7180cb8? = null,
) {
  public class Builder {
    public var fuel: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetFuelX65b04542?
        = null

    public var nonFuel:
        InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsNonFuelXef4d033a? = null

    public var tax: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetTaxXb7180cb8? =
        null

    public fun build(): InlineV1TestHelpersIssuingc1dfPostRequestFormReportedBreakdownX398fff77 = InlineV1TestHelpersIssuingc1dfPostRequestFormReportedBreakdownX398fff77(
      fuel = fuel,
      nonFuel = nonFuel,
      tax = tax,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuingc1dfPostRequestFormReportedBreakdownX398fff77 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuingc1dfPostRequestFormReportedBreakdownX398fff77> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingc1dfPostRequestFormReportedBreakdownX398fff77 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuingc1dfPostRequestFormReportedBreakdownX398fff77")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuingc1dfPostRequestFormReportedBreakdownX398fff77 must be a JSON object")
      return InlineV1TestHelpersIssuingc1dfPostRequestFormReportedBreakdownX398fff77(
        fuel = rawObject["fuel"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetFuelX65b04542>(it) },
        nonFuel = rawObject["non_fuel"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsNonFuelXef4d033a>(it) },
        tax = rawObject["tax"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetTaxXb7180cb8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingc1dfPostRequestFormReportedBreakdownX398fff77) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuingc1dfPostRequestFormReportedBreakdownX398fff77")
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

public fun inlineV1TestHelpersIssuingc1dfPostRequestFormReportedBreakdownX398fff77(block: InlineV1TestHelpersIssuingc1dfPostRequestFormReportedBreakdownX398fff77.Builder.() -> Unit): InlineV1TestHelpersIssuingc1dfPostRequestFormReportedBreakdownX398fff77 = InlineV1TestHelpersIssuingc1dfPostRequestFormReportedBreakdownX398fff77.build(block)
