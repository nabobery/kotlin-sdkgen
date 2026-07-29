package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_tran
 * sfer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_tran
 * sfer
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormBankTransferXd855dfc5.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormBankTransferXd855dfc5(
  public val type: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXcd50f0c1,
  public val euBankTransfer:
      InlineV1PaymentIntentsConfirmPostRequestFormEuBankTransferX51f5a3dc? = null,
  requestedAddressTypes: List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce>? = null,
) {
  public val requestedAddressTypes:
      List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce>? =
      requestedAddressTypes?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var typeValue:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXcd50f0c1? = null

    public var type: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXcd50f0c1
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var euBankTransfer: InlineV1PaymentIntentsConfirmPostRequestFormEuBankTransferX51f5a3dc?
        = null

    private var requestedAddressTypesValue:
        List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce>? = null

    public var requestedAddressTypes:
        List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce>?
      get() = requestedAddressTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        requestedAddressTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormBankTransferXd855dfc5 {
      check(typeValue != null) { "type is required" }
      return InlineV1PaymentIntentsConfirmPostRequestFormBankTransferXd855dfc5(
        type = type,
        euBankTransfer = euBankTransfer,
        requestedAddressTypes = requestedAddressTypes,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormBankTransferXd855dfc5 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormBankTransferXd855dfc5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormBankTransferXd855dfc5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormBankTransferXd855dfc5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormBankTransferXd855dfc5 must be a JSON object")
      val type = json.decodeRequired<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXcd50f0c1>(rawObject, "type")
      return InlineV1PaymentIntentsConfirmPostRequestFormBankTransferXd855dfc5(
        type = type,
        euBankTransfer = rawObject["eu_bank_transfer"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormEuBankTransferX51f5a3dc>(it) },
        requestedAddressTypes = rawObject["requested_address_types"]?.let { json.decodeFromJsonElement<List<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsItemXde9261ce>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormBankTransferXd855dfc5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormBankTransferXd855dfc5")
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

public fun inlineV1PaymentIntentsConfirmPostRequestFormBankTransferXd855dfc5(block: InlineV1PaymentIntentsConfirmPostRequestFormBankTransferXd855dfc5.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormBankTransferXd855dfc5 = InlineV1PaymentIntentsConfirmPostRequestFormBankTransferXd855dfc5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormBankTransferXd855dfc5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
