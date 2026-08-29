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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/fleet/properties/reported_breakdown/properties/tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/fleet/properties/reported_breakdown/properties/tax
 */
@Serializable(with = InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownTaxXad70374f.Serializer::class)
public class InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownTaxXad70374f(
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val localAmountDecimal: String? = null,
  /**
   * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val nationalAmountDecimal: String? = null,
) {
  public class Builder {
    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var localAmountDecimal: String? = null

    /**
     * Wire format: `decimal`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var nationalAmountDecimal: String? = null

    public fun build(): InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownTaxXad70374f = InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownTaxXad70374f(
      localAmountDecimal = localAmountDecimal,
      nationalAmountDecimal = nationalAmountDecimal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownTaxXad70374f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownTaxXad70374f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownTaxXad70374f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownTaxXad70374f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownTaxXad70374f must be a JSON object")
      return InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownTaxXad70374f(
        localAmountDecimal = rawObject["local_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
        nationalAmountDecimal = rawObject["national_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownTaxXad70374f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownTaxXad70374f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.localAmountDecimal?.let { put("local_amount_decimal", it) }
        value.nationalAmountDecimal?.let { put("national_amount_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownTaxXad70374f(block: InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownTaxXad70374f.Builder.() -> Unit): InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownTaxXad70374f = InlineV1TestHelpersIssuing214aPostRequestFormFleetReportedBreakdownTaxXad70374f.build(block)
