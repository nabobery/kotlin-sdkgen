package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/customer_balance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/customer_balance
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCustomerBalanceX2dd87faf.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormCustomerBalanceX2dd87faf(
  public val bankTransfer:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBankTransferX653b4489? = null,
  public val fundingType:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsFundingTypeXbef4afeb? = null,
  public val setupFutureUsage:
      InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX18080baf? = null,
) {
  public class Builder {
    public var bankTransfer:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBankTransferX653b4489? = null

    public var fundingType:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsFundingTypeXbef4afeb? = null

    public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX18080baf? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormCustomerBalanceX2dd87faf = InlineV1CheckoutSessionsPostRequestFormCustomerBalanceX2dd87faf(
      bankTransfer = bankTransfer,
      fundingType = fundingType,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormCustomerBalanceX2dd87faf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCustomerBalanceX2dd87faf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormCustomerBalanceX2dd87faf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormCustomerBalanceX2dd87faf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormCustomerBalanceX2dd87faf must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormCustomerBalanceX2dd87faf(
        bankTransfer = rawObject["bank_transfer"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBankTransferX653b4489>(it) },
        fundingType = rawObject["funding_type"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsFundingTypeXbef4afeb>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageX18080baf>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormCustomerBalanceX2dd87faf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormCustomerBalanceX2dd87faf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bankTransfer?.let { put("bank_transfer", json.encodeToJsonElement(it)) }
        value.fundingType?.let { put("funding_type", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormCustomerBalanceX2dd87faf(block: InlineV1CheckoutSessionsPostRequestFormCustomerBalanceX2dd87faf.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormCustomerBalanceX2dd87faf = InlineV1CheckoutSessionsPostRequestFormCustomerBalanceX2dd87faf.build(block)
