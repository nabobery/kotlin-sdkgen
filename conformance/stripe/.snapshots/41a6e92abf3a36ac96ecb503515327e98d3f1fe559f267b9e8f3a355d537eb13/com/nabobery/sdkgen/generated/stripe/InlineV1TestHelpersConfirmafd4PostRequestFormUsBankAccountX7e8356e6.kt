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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/us_bank_account
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormUsBankAccountX7e8356e6.Serializer::class)
public class InlineV1TestHelpersConfirmafd4PostRequestFormUsBankAccountX7e8356e6(
  public val accountHolderType:
      InlineV1TestHelpersConfirmafd4PostRequestFormAccountHolderTypeX9bcafc98? = null,
  public val accountNumber: String? = null,
  public val accountType: InlineV1TestHelpersConfirmafd4PostRequestFormAccountTypeX4aef74a6? = null,
  public val financialConnectionsAccount: String? = null,
  public val routingNumber: String? = null,
) {
  public class Builder {
    public var accountHolderType:
        InlineV1TestHelpersConfirmafd4PostRequestFormAccountHolderTypeX9bcafc98? = null

    public var accountNumber: String? = null

    public var accountType: InlineV1TestHelpersConfirmafd4PostRequestFormAccountTypeX4aef74a6? =
        null

    public var financialConnectionsAccount: String? = null

    public var routingNumber: String? = null

    public fun build(): InlineV1TestHelpersConfirmafd4PostRequestFormUsBankAccountX7e8356e6 = InlineV1TestHelpersConfirmafd4PostRequestFormUsBankAccountX7e8356e6(
      accountHolderType = accountHolderType,
      accountNumber = accountNumber,
      accountType = accountType,
      financialConnectionsAccount = financialConnectionsAccount,
      routingNumber = routingNumber,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormUsBankAccountX7e8356e6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormUsBankAccountX7e8356e6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormUsBankAccountX7e8356e6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersConfirmafd4PostRequestFormUsBankAccountX7e8356e6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersConfirmafd4PostRequestFormUsBankAccountX7e8356e6 must be a JSON object")
      return InlineV1TestHelpersConfirmafd4PostRequestFormUsBankAccountX7e8356e6(
        accountHolderType = rawObject["account_holder_type"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersConfirmafd4PostRequestFormAccountHolderTypeX9bcafc98>(it) },
        accountNumber = rawObject["account_number"]?.let { json.decodeFromJsonElement<String>(it) },
        accountType = rawObject["account_type"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersConfirmafd4PostRequestFormAccountTypeX4aef74a6>(it) },
        financialConnectionsAccount = rawObject["financial_connections_account"]?.let { json.decodeFromJsonElement<String>(it) },
        routingNumber = rawObject["routing_number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormUsBankAccountX7e8356e6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersConfirmafd4PostRequestFormUsBankAccountX7e8356e6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountHolderType?.let { put("account_holder_type", json.encodeToJsonElement(it)) }
        value.accountNumber?.let { put("account_number", it) }
        value.accountType?.let { put("account_type", json.encodeToJsonElement(it)) }
        value.financialConnectionsAccount?.let { put("financial_connections_account", it) }
        value.routingNumber?.let { put("routing_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersConfirmafd4PostRequestFormUsBankAccountX7e8356e6(block: InlineV1TestHelpersConfirmafd4PostRequestFormUsBankAccountX7e8356e6.Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormUsBankAccountX7e8356e6 = InlineV1TestHelpersConfirmafd4PostRequestFormUsBankAccountX7e8356e6.build(block)
