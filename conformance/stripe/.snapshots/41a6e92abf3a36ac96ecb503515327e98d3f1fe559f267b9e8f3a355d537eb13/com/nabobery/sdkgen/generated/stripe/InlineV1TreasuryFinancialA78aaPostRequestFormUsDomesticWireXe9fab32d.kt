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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}~1features/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/outbound_payments/properties/us_domestic_wire.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}~1features/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/outbound_payments/properties/us_domestic_wire
 */
@Serializable(with = InlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d.Serializer::class)
public class InlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d(
  public val requested: Boolean,
) {
  public class Builder {
    private var requestedValue: Boolean? = null

    public var requested: Boolean
      get() = requireNotNull(requestedValue) { "requested is required" }
      set(`value`) {
        requestedValue = value
      }

    public fun build(): InlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d {
      check(requestedValue != null) { "requested is required" }
      return InlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d(
        requested = requested,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d must be a JSON object")
      val requested = json.decodeRequired<Boolean>(rawObject, "requested")
      return InlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d(
        requested = requested,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("requested", json.encodeToJsonElement(value.requested))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d(block: InlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d.Builder.() -> Unit): InlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d = InlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TreasuryFinancialA78aaPostRequestFormUsDomesticWireXe9fab32d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
