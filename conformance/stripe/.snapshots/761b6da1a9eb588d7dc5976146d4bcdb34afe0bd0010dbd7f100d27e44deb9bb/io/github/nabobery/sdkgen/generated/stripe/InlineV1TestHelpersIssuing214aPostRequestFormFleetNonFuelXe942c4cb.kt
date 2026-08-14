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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/fleet/properties/reported_breakdown/properties/non_fuel.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/fleet/properties/reported_breakdown/properties/non_fuel
 */
@Serializable(with = InlineV1TestHelpersIssuing214aPostRequestFormFleetNonFuelXe942c4cb.Serializer::class)
public class InlineV1TestHelpersIssuing214aPostRequestFormFleetNonFuelXe942c4cb(
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

    public fun build(): InlineV1TestHelpersIssuing214aPostRequestFormFleetNonFuelXe942c4cb = InlineV1TestHelpersIssuing214aPostRequestFormFleetNonFuelXe942c4cb(
      grossAmountDecimal = grossAmountDecimal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing214aPostRequestFormFleetNonFuelXe942c4cb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing214aPostRequestFormFleetNonFuelXe942c4cb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing214aPostRequestFormFleetNonFuelXe942c4cb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing214aPostRequestFormFleetNonFuelXe942c4cb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing214aPostRequestFormFleetNonFuelXe942c4cb must be a JSON object")
      return InlineV1TestHelpersIssuing214aPostRequestFormFleetNonFuelXe942c4cb(
        grossAmountDecimal = rawObject["gross_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing214aPostRequestFormFleetNonFuelXe942c4cb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing214aPostRequestFormFleetNonFuelXe942c4cb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.grossAmountDecimal?.let { put("gross_amount_decimal", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuing214aPostRequestFormFleetNonFuelXe942c4cb(block: InlineV1TestHelpersIssuing214aPostRequestFormFleetNonFuelXe942c4cb.Builder.() -> Unit): InlineV1TestHelpersIssuing214aPostRequestFormFleetNonFuelXe942c4cb = InlineV1TestHelpersIssuing214aPostRequestFormFleetNonFuelXe942c4cb.build(block)
