package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class AccountGroupMembershipView(
  @SerialName("payments_pricing")
  public val paymentsPricing: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_group_membership
 */
@Serializable(with = AccountGroupMembership.Serializer::class)
public class AccountGroupMembership(
  /**
   * The group the account is in to determine their payments pricing, and null if the account is on customized pricing.
   * [See the Platform pricing tool documentation](https://docs.stripe.com/connect/platform-pricing-tools) for details.
   */
  public val paymentsPricing: String? = null,
) {
  public class Builder {
    /**
     * The group the account is in to determine their payments pricing, and null if the account is on customized
     * pricing. [See the Platform pricing tool documentation](https://docs.stripe.com/connect/platform-pricing-tools)
     * for details.
     */
    public var paymentsPricing: String? = null

    public fun build(): AccountGroupMembership = AccountGroupMembership(
      paymentsPricing = paymentsPricing,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountGroupMembership = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AccountGroupMembership> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountGroupMembership {
      val jsonDecoder = decoder.requireJsonDecoder("AccountGroupMembership")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountGroupMembership must be a JSON object")
      return AccountGroupMembership(
        paymentsPricing = rawObject["payments_pricing"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountGroupMembership) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountGroupMembership")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.paymentsPricing?.let { put("payments_pricing", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountGroupMembership(block: AccountGroupMembership.Builder.() -> Unit): AccountGroupMembership = AccountGroupMembership.build(block)
