package com.nabobery.sdkgen.generated.stripe

import kotlin.String
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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1finalize_amount/pos
 * t/requestBody/content/application~1x-www-form-urlencoded/schema/properties/fleet/properties/reported_breakdown/proper
 * ties/fuel.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1finalize_amount/pos
 * t/requestBody/content/application~1x-www-form-urlencoded/schema/properties/fleet/properties/reported_breakdown/proper
 * ties/fuel
 */
@Serializable(with = InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownFuelX25b1897d.Serializer::class)
public class InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownFuelX25b1897d(
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val grossAmountDecimal: String? = null,
) {
  public class Builder {
    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var grossAmountDecimal: String? = null

    public fun build(): InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownFuelX25b1897d = InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownFuelX25b1897d(
      grossAmountDecimal = grossAmountDecimal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownFuelX25b1897d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownFuelX25b1897d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownFuelX25b1897d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownFuelX25b1897d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownFuelX25b1897d must be a JSON object")
      return InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownFuelX25b1897d(
        grossAmountDecimal = rawObject["gross_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownFuelX25b1897d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownFuelX25b1897d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.grossAmountDecimal?.let { put("gross_amount_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownFuelX25b1897d(block: InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownFuelX25b1897d.Builder.() -> Unit): InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownFuelX25b1897d = InlineV1TestHelpersIssuing6a15PostRequestFormFleetReportedBreakdownFuelX25b1897d.build(block)
