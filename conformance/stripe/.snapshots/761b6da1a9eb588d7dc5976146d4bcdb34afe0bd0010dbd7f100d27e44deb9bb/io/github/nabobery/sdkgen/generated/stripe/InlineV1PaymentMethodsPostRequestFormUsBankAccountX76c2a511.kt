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
 * If this is an `us_bank_account` PaymentMethod, this hash contains details about the US bank account payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/us_bank_account
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormUsBankAccountX76c2a511.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormUsBankAccountX76c2a511(
  public val accountHolderType:
      InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountHolderTypeXa1ef9ea1? = null,
  public val accountNumber: String? = null,
  public val accountType:
      InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeXc43a52fe? = null,
  public val financialConnectionsAccount: String? = null,
  public val routingNumber: String? = null,
) {
  public class Builder {
    public var accountHolderType:
        InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountHolderTypeXa1ef9ea1? = null

    public var accountNumber: String? = null

    public var accountType: InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeXc43a52fe?
        = null

    public var financialConnectionsAccount: String? = null

    public var routingNumber: String? = null

    public fun build(): InlineV1PaymentMethodsPostRequestFormUsBankAccountX76c2a511 = InlineV1PaymentMethodsPostRequestFormUsBankAccountX76c2a511(
      accountHolderType = accountHolderType,
      accountNumber = accountNumber,
      accountType = accountType,
      financialConnectionsAccount = financialConnectionsAccount,
      routingNumber = routingNumber,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormUsBankAccountX76c2a511 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormUsBankAccountX76c2a511> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormUsBankAccountX76c2a511 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormUsBankAccountX76c2a511")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormUsBankAccountX76c2a511 must be a JSON object")
      return InlineV1PaymentMethodsPostRequestFormUsBankAccountX76c2a511(
        accountHolderType = rawObject["account_holder_type"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountHolderTypeXa1ef9ea1>(it) },
        accountNumber = rawObject["account_number"]?.let { json.decodeFromJsonElement<String>(it) },
        accountType = rawObject["account_type"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeXc43a52fe>(it) },
        financialConnectionsAccount = rawObject["financial_connections_account"]?.let { json.decodeFromJsonElement<String>(it) },
        routingNumber = rawObject["routing_number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormUsBankAccountX76c2a511) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormUsBankAccountX76c2a511")
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

public fun inlineV1PaymentMethodsPostRequestFormUsBankAccountX76c2a511(block: InlineV1PaymentMethodsPostRequestFormUsBankAccountX76c2a511.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormUsBankAccountX76c2a511 = InlineV1PaymentMethodsPostRequestFormUsBankAccountX76c2a511.build(block)
