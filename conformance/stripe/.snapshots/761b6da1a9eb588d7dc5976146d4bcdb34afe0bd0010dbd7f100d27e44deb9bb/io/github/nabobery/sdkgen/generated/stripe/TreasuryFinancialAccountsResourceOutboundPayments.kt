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
 * Settings related to Outbound Payments features on a Financial Account
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_outbound_payments
 */
@Serializable(with = TreasuryFinancialAccountsResourceOutboundPayments.Serializer::class)
public class TreasuryFinancialAccountsResourceOutboundPayments(
  public val ach: TreasuryFinancialAccountsResourceOutboundAchToggleSettings? = null,
  public val usDomesticWire: TreasuryFinancialAccountsResourceToggleSettings? = null,
) {
  public class Builder {
    public var ach: TreasuryFinancialAccountsResourceOutboundAchToggleSettings? = null

    public var usDomesticWire: TreasuryFinancialAccountsResourceToggleSettings? = null

    public fun build(): TreasuryFinancialAccountsResourceOutboundPayments = TreasuryFinancialAccountsResourceOutboundPayments(
      ach = ach,
      usDomesticWire = usDomesticWire,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryFinancialAccountsResourceOutboundPayments = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryFinancialAccountsResourceOutboundPayments> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryFinancialAccountsResourceOutboundPayments {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryFinancialAccountsResourceOutboundPayments")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryFinancialAccountsResourceOutboundPayments must be a JSON object")
      return TreasuryFinancialAccountsResourceOutboundPayments(
        ach = rawObject["ach"]?.let { json.decodeFromJsonElement<TreasuryFinancialAccountsResourceOutboundAchToggleSettings>(it) },
        usDomesticWire = rawObject["us_domestic_wire"]?.let { json.decodeFromJsonElement<TreasuryFinancialAccountsResourceToggleSettings>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryFinancialAccountsResourceOutboundPayments) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryFinancialAccountsResourceOutboundPayments")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ach?.let { put("ach", json.encodeToJsonElement(it)) }
        value.usDomesticWire?.let { put("us_domestic_wire", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryFinancialAccountsResourceOutboundPayments(block: TreasuryFinancialAccountsResourceOutboundPayments.Builder.() -> Unit): TreasuryFinancialAccountsResourceOutboundPayments = TreasuryFinancialAccountsResourceOutboundPayments.build(block)
