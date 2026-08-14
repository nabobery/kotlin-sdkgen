package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_transfer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_transfer
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf(
  public val type: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeXb93dc9db,
  public val euBankTransfer:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea? = null,
  requestedAddressTypes: List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99>? = null,
) {
  public val requestedAddressTypes:
      List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99>? =
      requestedAddressTypes?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var typeValue: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeXb93dc9db? =
        null

    public var type: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeXb93dc9db
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var euBankTransfer:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea? = null

    private var requestedAddressTypesValue:
        List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99>? = null

    public var requestedAddressTypes:
        List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99>?
      get() = requestedAddressTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        requestedAddressTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf {
      check(typeValue != null) { "type is required" }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf(
        type = type,
        euBankTransfer = euBankTransfer,
        requestedAddressTypes = requestedAddressTypes,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf must be a JSON object")
      val type = json.decodeRequired<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeXb93dc9db>(rawObject, "type")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf(
        type = type,
        euBankTransfer = rawObject["eu_bank_transfer"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXb61285ea>(it) },
        requestedAddressTypes = rawObject["requested_address_types"]?.let { json.decodeFromJsonElement<List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.euBankTransfer?.let { put("eu_bank_transfer", json.encodeToJsonElement(it)) }
        value.requestedAddressTypes?.let { put("requested_address_types", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferXfbe332bf is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
