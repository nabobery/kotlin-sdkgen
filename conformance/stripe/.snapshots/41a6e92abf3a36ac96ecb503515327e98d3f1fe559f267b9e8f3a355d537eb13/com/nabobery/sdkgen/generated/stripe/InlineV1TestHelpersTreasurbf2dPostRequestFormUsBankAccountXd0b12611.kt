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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1received_debits/post/requestBody/content/applicatio
 * n~1x-www-form-urlencoded/schema/properties/initiating_payment_method_details/properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1received_debits/post/requestBody/content/applicatio
 * n~1x-www-form-urlencoded/schema/properties/initiating_payment_method_details/properties/us_bank_account
 */
@Serializable(with = InlineV1TestHelpersTreasurbf2dPostRequestFormUsBankAccountXd0b12611.Serializer::class)
public class InlineV1TestHelpersTreasurbf2dPostRequestFormUsBankAccountXd0b12611(
  public val accountHolderName: String? = null,
  public val accountNumber: String? = null,
  public val routingNumber: String? = null,
) {
  public class Builder {
    public var accountHolderName: String? = null

    public var accountNumber: String? = null

    public var routingNumber: String? = null

    public fun build(): InlineV1TestHelpersTreasurbf2dPostRequestFormUsBankAccountXd0b12611 = InlineV1TestHelpersTreasurbf2dPostRequestFormUsBankAccountXd0b12611(
      accountHolderName = accountHolderName,
      accountNumber = accountNumber,
      routingNumber = routingNumber,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersTreasurbf2dPostRequestFormUsBankAccountXd0b12611 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersTreasurbf2dPostRequestFormUsBankAccountXd0b12611> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasurbf2dPostRequestFormUsBankAccountXd0b12611 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersTreasurbf2dPostRequestFormUsBankAccountXd0b12611")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersTreasurbf2dPostRequestFormUsBankAccountXd0b12611 must be a JSON object")
      return InlineV1TestHelpersTreasurbf2dPostRequestFormUsBankAccountXd0b12611(
        accountHolderName = rawObject["account_holder_name"]?.let { json.decodeFromJsonElement<String>(it) },
        accountNumber = rawObject["account_number"]?.let { json.decodeFromJsonElement<String>(it) },
        routingNumber = rawObject["routing_number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTreasurbf2dPostRequestFormUsBankAccountXd0b12611) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersTreasurbf2dPostRequestFormUsBankAccountXd0b12611")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountHolderName?.let { put("account_holder_name", it) }
        value.accountNumber?.let { put("account_number", it) }
        value.routingNumber?.let { put("routing_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersTreasurbf2dPostRequestFormUsBankAccountXd0b12611(block: InlineV1TestHelpersTreasurbf2dPostRequestFormUsBankAccountXd0b12611.Builder.() -> Unit): InlineV1TestHelpersTreasurbf2dPostRequestFormUsBankAccountXd0b12611 = InlineV1TestHelpersTreasurbf2dPostRequestFormUsBankAccountXd0b12611.build(block)
