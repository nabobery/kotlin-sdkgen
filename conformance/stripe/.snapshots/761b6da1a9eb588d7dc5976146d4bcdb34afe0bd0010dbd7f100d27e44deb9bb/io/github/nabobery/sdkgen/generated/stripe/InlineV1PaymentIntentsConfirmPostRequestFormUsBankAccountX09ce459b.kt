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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/us_bank_account
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormUsBankAccountX09ce459b.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormUsBankAccountX09ce459b(
  public val accountHolderType:
      InlineV1PaymentIntentsConfirmPostRequestFormAccountHolderTypeXb9b7a9a7? = null,
  public val accountNumber: String? = null,
  public val accountType: InlineV1PaymentIntentsConfirmPostRequestFormAccountTypeX1284caba? = null,
  public val financialConnectionsAccount: String? = null,
  public val routingNumber: String? = null,
) {
  public class Builder {
    public var accountHolderType:
        InlineV1PaymentIntentsConfirmPostRequestFormAccountHolderTypeXb9b7a9a7? = null

    public var accountNumber: String? = null

    public var accountType: InlineV1PaymentIntentsConfirmPostRequestFormAccountTypeX1284caba? = null

    public var financialConnectionsAccount: String? = null

    public var routingNumber: String? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormUsBankAccountX09ce459b = InlineV1PaymentIntentsConfirmPostRequestFormUsBankAccountX09ce459b(
      accountHolderType = accountHolderType,
      accountNumber = accountNumber,
      accountType = accountType,
      financialConnectionsAccount = financialConnectionsAccount,
      routingNumber = routingNumber,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormUsBankAccountX09ce459b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormUsBankAccountX09ce459b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormUsBankAccountX09ce459b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormUsBankAccountX09ce459b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormUsBankAccountX09ce459b must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormUsBankAccountX09ce459b(
        accountHolderType = rawObject["account_holder_type"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAccountHolderTypeXb9b7a9a7>(it) },
        accountNumber = rawObject["account_number"]?.let { json.decodeFromJsonElement<String>(it) },
        accountType = rawObject["account_type"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAccountTypeX1284caba>(it) },
        financialConnectionsAccount = rawObject["financial_connections_account"]?.let { json.decodeFromJsonElement<String>(it) },
        routingNumber = rawObject["routing_number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormUsBankAccountX09ce459b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormUsBankAccountX09ce459b")
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

public fun inlineV1PaymentIntentsConfirmPostRequestFormUsBankAccountX09ce459b(block: InlineV1PaymentIntentsConfirmPostRequestFormUsBankAccountX09ce459b.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormUsBankAccountX09ce459b = InlineV1PaymentIntentsConfirmPostRequestFormUsBankAccountX09ce459b.build(block)
