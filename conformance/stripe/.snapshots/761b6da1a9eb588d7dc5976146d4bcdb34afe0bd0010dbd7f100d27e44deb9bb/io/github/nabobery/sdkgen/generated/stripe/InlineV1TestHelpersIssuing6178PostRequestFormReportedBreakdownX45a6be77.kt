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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/reported_br
 * eakdown.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/reported_br
 * eakdown
 */
@Serializable(with = InlineV1TestHelpersIssuing6178PostRequestFormReportedBreakdownX45a6be77.Serializer::class)
public class InlineV1TestHelpersIssuing6178PostRequestFormReportedBreakdownX45a6be77(
  public val fuel:
      InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetFuelX9737918a? = null,
  public val nonFuel:
      InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsNonFuelXeaac5cb3? = null,
  public val tax:
      InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetTaxX71d19956? = null,
) {
  public class Builder {
    public var fuel: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetFuelX9737918a?
        = null

    public var nonFuel:
        InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsNonFuelXeaac5cb3? = null

    public var tax: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetTaxX71d19956? =
        null

    public fun build(): InlineV1TestHelpersIssuing6178PostRequestFormReportedBreakdownX45a6be77 = InlineV1TestHelpersIssuing6178PostRequestFormReportedBreakdownX45a6be77(
      fuel = fuel,
      nonFuel = nonFuel,
      tax = tax,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing6178PostRequestFormReportedBreakdownX45a6be77 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing6178PostRequestFormReportedBreakdownX45a6be77> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing6178PostRequestFormReportedBreakdownX45a6be77 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing6178PostRequestFormReportedBreakdownX45a6be77")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing6178PostRequestFormReportedBreakdownX45a6be77 must be a JSON object")
      return InlineV1TestHelpersIssuing6178PostRequestFormReportedBreakdownX45a6be77(
        fuel = rawObject["fuel"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetFuelX9737918a>(it) },
        nonFuel = rawObject["non_fuel"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsNonFuelXeaac5cb3>(it) },
        tax = rawObject["tax"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetTaxX71d19956>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing6178PostRequestFormReportedBreakdownX45a6be77) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing6178PostRequestFormReportedBreakdownX45a6be77")
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

public fun inlineV1TestHelpersIssuing6178PostRequestFormReportedBreakdownX45a6be77(block: InlineV1TestHelpersIssuing6178PostRequestFormReportedBreakdownX45a6be77.Builder.() -> Unit): InlineV1TestHelpersIssuing6178PostRequestFormReportedBreakdownX45a6be77 = InlineV1TestHelpersIssuing6178PostRequestFormReportedBreakdownX45a6be77.build(block)
