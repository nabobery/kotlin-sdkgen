package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_financial_accounts_resource_status_details
 */
@Serializable(with = TreasuryFinancialAccountsResourceStatusDetails.Serializer::class)
public class TreasuryFinancialAccountsResourceStatusDetails(
  /**
   * Details related to the closure of this FinancialAccount
   */
  public val closed: InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936d? = null,
) {
  public class Builder {
    /**
     * Details related to the closure of this FinancialAccount
     */
    public var closed: InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936d? = null

    public fun build(): TreasuryFinancialAccountsResourceStatusDetails = TreasuryFinancialAccountsResourceStatusDetails(
      closed = closed,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryFinancialAccountsResourceStatusDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TreasuryFinancialAccountsResourceStatusDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryFinancialAccountsResourceStatusDetails {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryFinancialAccountsResourceStatusDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryFinancialAccountsResourceStatusDetails must be a JSON object")
      return TreasuryFinancialAccountsResourceStatusDetails(
        closed = rawObject["closed"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTreasuryFinancialAccountsResourceStatusDetailsClosedX5dd8936d?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryFinancialAccountsResourceStatusDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryFinancialAccountsResourceStatusDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.closed?.let { put("closed", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryFinancialAccountsResourceStatusDetails(block: TreasuryFinancialAccountsResourceStatusDetails.Builder.() -> Unit): TreasuryFinancialAccountsResourceStatusDetails = TreasuryFinancialAccountsResourceStatusDetails.build(block)
