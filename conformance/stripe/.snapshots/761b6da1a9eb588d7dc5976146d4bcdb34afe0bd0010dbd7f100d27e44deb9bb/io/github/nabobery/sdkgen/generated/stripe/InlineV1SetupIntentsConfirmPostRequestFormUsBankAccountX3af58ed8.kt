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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/us_bank_account
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX3af58ed8.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX3af58ed8(
  public val accountHolderType:
      InlineV1SetupIntentsConfirmPostRequestFormAccountHolderTypeXbe3243b9? = null,
  public val accountNumber: String? = null,
  public val accountType:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAccountTypeX176b93d2? = null,
  public val financialConnectionsAccount: String? = null,
  public val routingNumber: String? = null,
) {
  public class Builder {
    public var accountHolderType:
        InlineV1SetupIntentsConfirmPostRequestFormAccountHolderTypeXbe3243b9? = null

    public var accountNumber: String? = null

    public var accountType:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAccountTypeX176b93d2? = null

    public var financialConnectionsAccount: String? = null

    public var routingNumber: String? = null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX3af58ed8 = InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX3af58ed8(
      accountHolderType = accountHolderType,
      accountNumber = accountNumber,
      accountType = accountType,
      financialConnectionsAccount = financialConnectionsAccount,
      routingNumber = routingNumber,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX3af58ed8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX3af58ed8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX3af58ed8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX3af58ed8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX3af58ed8 must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX3af58ed8(
        accountHolderType = rawObject["account_holder_type"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormAccountHolderTypeXbe3243b9>(it) },
        accountNumber = rawObject["account_number"]?.let { json.decodeFromJsonElement<String>(it) },
        accountType = rawObject["account_type"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAccountTypeX176b93d2>(it) },
        financialConnectionsAccount = rawObject["financial_connections_account"]?.let { json.decodeFromJsonElement<String>(it) },
        routingNumber = rawObject["routing_number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX3af58ed8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX3af58ed8")
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

public fun inlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX3af58ed8(block: InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX3af58ed8.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX3af58ed8 = InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX3af58ed8.build(block)
