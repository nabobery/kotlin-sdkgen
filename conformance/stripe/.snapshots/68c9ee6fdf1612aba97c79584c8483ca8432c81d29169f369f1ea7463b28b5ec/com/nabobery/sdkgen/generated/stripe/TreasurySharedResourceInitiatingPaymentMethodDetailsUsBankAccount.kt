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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_shared_resource_initiating_payment_method_details_us_bank_a
 * ccount
 */
@Serializable(with = TreasurySharedResourceInitiatingPaymentMethodDetailsUsBankAccount.Serializer::class)
public class TreasurySharedResourceInitiatingPaymentMethodDetailsUsBankAccount(
  /**
   * Bank name.
   */
  public val bankName: String? = null,
  /**
   * The last four digits of the bank account number.
   */
  public val last4: String? = null,
  /**
   * The routing number for the bank account.
   */
  public val routingNumber: String? = null,
) {
  public class Builder {
    /**
     * Bank name.
     */
    public var bankName: String? = null

    /**
     * The last four digits of the bank account number.
     */
    public var last4: String? = null

    /**
     * The routing number for the bank account.
     */
    public var routingNumber: String? = null

    public fun build(): TreasurySharedResourceInitiatingPaymentMethodDetailsUsBankAccount = TreasurySharedResourceInitiatingPaymentMethodDetailsUsBankAccount(
      bankName = bankName,
      last4 = last4,
      routingNumber = routingNumber,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasurySharedResourceInitiatingPaymentMethodDetailsUsBankAccount = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasurySharedResourceInitiatingPaymentMethodDetailsUsBankAccount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasurySharedResourceInitiatingPaymentMethodDetailsUsBankAccount {
      val jsonDecoder = decoder.requireJsonDecoder("TreasurySharedResourceInitiatingPaymentMethodDetailsUsBankAccount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasurySharedResourceInitiatingPaymentMethodDetailsUsBankAccount must be a JSON object")
      return TreasurySharedResourceInitiatingPaymentMethodDetailsUsBankAccount(
        bankName = rawObject["bank_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        last4 = rawObject["last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        routingNumber = rawObject["routing_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasurySharedResourceInitiatingPaymentMethodDetailsUsBankAccount) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasurySharedResourceInitiatingPaymentMethodDetailsUsBankAccount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bankName?.let { put("bank_name", it) }
        value.last4?.let { put("last4", it) }
        value.routingNumber?.let { put("routing_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasurySharedResourceInitiatingPaymentMethodDetailsUsBankAccount(block: TreasurySharedResourceInitiatingPaymentMethodDetailsUsBankAccount.Builder.() -> Unit): TreasurySharedResourceInitiatingPaymentMethodDetailsUsBankAccount = TreasurySharedResourceInitiatingPaymentMethodDetailsUsBankAccount.build(block)
