package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlin.collections.List
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
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_financial_connections_common_l
 * inked_account_options_filters
 */
@Serializable(with = PaymentFlowsPrivatePaymentMethodsFinancialConnectionsCommonLinkedAccountOptionsFilters.Serializer::class)
public class PaymentFlowsPrivatePaymentMethodsFinancialConnectionsCommonLinkedAccountOptionsFilters(
  accountSubcategories: List<InlinePaymentFlowsPrivateP360bAccountSubcategoriesItemXc2e37aa5>? = null,
) {
  /**
   * The account subcategories to use to filter for possible accounts to link. Valid subcategories are `checking` and
   * `savings`.
   */
  public val accountSubcategories:
      List<InlinePaymentFlowsPrivateP360bAccountSubcategoriesItemXc2e37aa5>? =
      accountSubcategories?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var accountSubcategoriesValue:
        List<InlinePaymentFlowsPrivateP360bAccountSubcategoriesItemXc2e37aa5>? = null

    /**
     * The account subcategories to use to filter for possible accounts to link. Valid subcategories are `checking` and
     * `savings`.
     */
    public var accountSubcategories:
        List<InlinePaymentFlowsPrivateP360bAccountSubcategoriesItemXc2e37aa5>?
      get() = accountSubcategoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        accountSubcategoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): PaymentFlowsPrivatePaymentMethodsFinancialConnectionsCommonLinkedAccountOptionsFilters = PaymentFlowsPrivatePaymentMethodsFinancialConnectionsCommonLinkedAccountOptionsFilters(
      accountSubcategories = accountSubcategories,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentFlowsPrivatePaymentMethodsFinancialConnectionsCommonLinkedAccountOptionsFilters = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentFlowsPrivatePaymentMethodsFinancialConnectionsCommonLinkedAccountOptionsFilters> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentFlowsPrivatePaymentMethodsFinancialConnectionsCommonLinkedAccountOptionsFilters {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsPrivatePaymentMethodsFinancialConnectionsCommonLinkedAccountOptionsFilters")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentFlowsPrivatePaymentMethodsFinancialConnectionsCommonLinkedAccountOptionsFilters must be a JSON object")
      return PaymentFlowsPrivatePaymentMethodsFinancialConnectionsCommonLinkedAccountOptionsFilters(
        accountSubcategories = rawObject["account_subcategories"]?.let { json.decodeFromJsonElement<List<InlinePaymentFlowsPrivateP360bAccountSubcategoriesItemXc2e37aa5>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentFlowsPrivatePaymentMethodsFinancialConnectionsCommonLinkedAccountOptionsFilters) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsPrivatePaymentMethodsFinancialConnectionsCommonLinkedAccountOptionsFilters")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountSubcategories?.let { put("account_subcategories", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentFlowsPrivatePaymentMethodsFinancialConnectionsCommonLinkedAccountOptionsFilters(block: PaymentFlowsPrivatePaymentMethodsFinancialConnectionsCommonLinkedAccountOptionsFilters.Builder.() -> Unit): PaymentFlowsPrivatePaymentMethodsFinancialConnectionsCommonLinkedAccountOptionsFilters = PaymentFlowsPrivatePaymentMethodsFinancialConnectionsCommonLinkedAccountOptionsFilters.build(block)
