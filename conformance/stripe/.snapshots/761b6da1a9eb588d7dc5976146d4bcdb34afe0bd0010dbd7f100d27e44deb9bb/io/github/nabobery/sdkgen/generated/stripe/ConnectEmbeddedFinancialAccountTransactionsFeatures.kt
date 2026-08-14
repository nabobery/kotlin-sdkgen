package io.github.nabobery.sdkgen.generated.stripe

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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/connect_embedded_financial_account_transactions_features
 */
@Serializable(with = ConnectEmbeddedFinancialAccountTransactionsFeatures.Serializer::class)
public class ConnectEmbeddedFinancialAccountTransactionsFeatures(
  /**
   * Whether to allow card spend dispute management features.
   */
  public val cardSpendDisputeManagement: Boolean,
) {
  public class Builder {
    private var cardSpendDisputeManagementValue: Boolean? = null

    public var cardSpendDisputeManagement: Boolean
      get() = requireNotNull(cardSpendDisputeManagementValue) { "cardSpendDisputeManagement is required" }
      set(`value`) {
        cardSpendDisputeManagementValue = value
      }

    public fun build(): ConnectEmbeddedFinancialAccountTransactionsFeatures {
      check(cardSpendDisputeManagementValue != null) { "cardSpendDisputeManagement is required" }
      return ConnectEmbeddedFinancialAccountTransactionsFeatures(
        cardSpendDisputeManagement = cardSpendDisputeManagement,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ConnectEmbeddedFinancialAccountTransactionsFeatures = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ConnectEmbeddedFinancialAccountTransactionsFeatures> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ConnectEmbeddedFinancialAccountTransactionsFeatures {
      val jsonDecoder = decoder.requireJsonDecoder("ConnectEmbeddedFinancialAccountTransactionsFeatures")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ConnectEmbeddedFinancialAccountTransactionsFeatures must be a JSON object")
      val cardSpendDisputeManagement = json.decodeRequired<Boolean>(rawObject, "card_spend_dispute_management")
      return ConnectEmbeddedFinancialAccountTransactionsFeatures(
        cardSpendDisputeManagement = cardSpendDisputeManagement,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ConnectEmbeddedFinancialAccountTransactionsFeatures) {
      val jsonEncoder = encoder.requireJsonEncoder("ConnectEmbeddedFinancialAccountTransactionsFeatures")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("card_spend_dispute_management", json.encodeToJsonElement(value.cardSpendDisputeManagement))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun connectEmbeddedFinancialAccountTransactionsFeatures(block: ConnectEmbeddedFinancialAccountTransactionsFeatures.Builder.() -> Unit): ConnectEmbeddedFinancialAccountTransactionsFeatures = ConnectEmbeddedFinancialAccountTransactionsFeatures.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ConnectEmbeddedFinancialAccountTransactionsFeatures is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
