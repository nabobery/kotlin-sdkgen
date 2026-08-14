package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/features/properties/outbound_payments/properties/ach.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/features/properties/outbound_payments/properties/ach
 */
@Serializable(with = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e.Serializer::class)
public class InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e(
  public val requested: Boolean,
) {
  public class Builder {
    private var requestedValue: Boolean? = null

    public var requested: Boolean
      get() = requireNotNull(requestedValue) { "requested is required" }
      set(`value`) {
        requestedValue = value
      }

    public fun build(): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e {
      check(requestedValue != null) { "requested is required" }
      return InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e(
        requested = requested,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e must be a JSON object")
      val requested = json.decodeRequired<Boolean>(rawObject, "requested")
      return InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e(
        requested = requested,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("requested", json.encodeToJsonElement(value.requested))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e(block: InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e.Builder.() -> Unit): InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e = InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TreasuryFinancialAc862PostRequestFormFeaturesAchXf7ae6f5e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
