package com.nabobery.sdkgen.generated.stripe

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
 * rm-urlencoded/schema/properties/features/properties/card_issuing.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/features/properties/card_issuing
 */
@Serializable(with = InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3.Serializer::class)
public class InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3(
  public val requested: Boolean,
) {
  public class Builder {
    private var requestedValue: Boolean? = null

    public var requested: Boolean
      get() = requireNotNull(requestedValue) { "requested is required" }
      set(`value`) {
        requestedValue = value
      }

    public fun build(): InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3 {
      check(requestedValue != null) { "requested is required" }
      return InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3(
        requested = requested,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3 must be a JSON object")
      val requested = json.decodeRequired<Boolean>(rawObject, "requested")
      return InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3(
        requested = requested,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("requested", json.encodeToJsonElement(value.requested))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3(block: InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3.Builder.() -> Unit): InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3 = InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
