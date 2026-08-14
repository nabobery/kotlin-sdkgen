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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/customer_balance/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/customer_balance/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296(
  public val bankTransfer:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca? = null,
  public val fundingType:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFundingTypeXc32beaac? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX72a04684? = null,
) {
  public class Builder {
    public var bankTransfer:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca? = null

    public var fundingType:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFundingTypeXc32beaac? = null

    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX72a04684? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296(
      bankTransfer = bankTransfer,
      fundingType = fundingType,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296(
        bankTransfer = rawObject["bank_transfer"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca>(it) },
        fundingType = rawObject["funding_type"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFundingTypeXc32beaac>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX72a04684>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296")
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X64bf8296.build(block)
