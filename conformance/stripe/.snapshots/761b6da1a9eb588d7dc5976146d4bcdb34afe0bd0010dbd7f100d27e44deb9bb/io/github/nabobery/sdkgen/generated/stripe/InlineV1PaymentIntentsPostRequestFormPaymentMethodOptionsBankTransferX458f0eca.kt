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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_transfer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_transfer
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca(
  public val type: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeX41e55988,
  public val euBankTransfer:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXf1cfb8fd? = null,
  requestedAddressTypes: List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX69b79ed7>? = null,
) {
  public val requestedAddressTypes:
      List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX69b79ed7>? =
      requestedAddressTypes?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var typeValue: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeX41e55988? =
        null

    public var type: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeX41e55988
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var euBankTransfer:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXf1cfb8fd? = null

    private var requestedAddressTypesValue:
        List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX69b79ed7>? = null

    public var requestedAddressTypes:
        List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX69b79ed7>?
      get() = requestedAddressTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        requestedAddressTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca {
      check(typeValue != null) { "type is required" }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca(
        type = type,
        euBankTransfer = euBankTransfer,
        requestedAddressTypes = requestedAddressTypes,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca must be a JSON object")
      val type = json.decodeRequired<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeX41e55988>(rawObject, "type")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca(
        type = type,
        euBankTransfer = rawObject["eu_bank_transfer"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEuBankTransferXf1cfb8fd>(it) },
        requestedAddressTypes = rawObject["requested_address_types"]?.let { json.decodeFromJsonElement<List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemX69b79ed7>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca")
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBankTransferX458f0eca is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
