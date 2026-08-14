package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_unlinked_refund/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/reported_
 * breakdown/properties/fuel.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_unlinked_refund/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/reported_
 * breakdown/properties/fuel
 */
@Serializable(with = InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetFuelX65b04542.Serializer::class)
public class InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetFuelX65b04542(
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

    public fun build(): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetFuelX65b04542 = InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetFuelX65b04542(
      grossAmountDecimal = grossAmountDecimal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetFuelX65b04542 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetFuelX65b04542> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetFuelX65b04542 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetFuelX65b04542")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetFuelX65b04542 must be a JSON object")
      return InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetFuelX65b04542(
        grossAmountDecimal = rawObject["gross_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetFuelX65b04542) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetFuelX65b04542")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.grossAmountDecimal?.let { put("gross_amount_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetFuelX65b04542(block: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetFuelX65b04542.Builder.() -> Unit): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetFuelX65b04542 = InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetFuelX65b04542.build(block)
