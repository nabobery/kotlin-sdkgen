package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStoreView(
  public val chain: InlinePaymentsPrimitivesPad993ChainX9ba5422c? = null,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_konbini_
 * details_resource_store
 */
@Serializable(with = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore.Serializer::class)
public class PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore(
  /**
   * The name of the convenience store chain where the payment was completed.
   */
  public val chain: InlinePaymentsPrimitivesPad993ChainX9ba5422c? = null,
) {
  public class Builder {
    /**
     * The name of the convenience store chain where the payment was completed.
     */
    public var chain: InlinePaymentsPrimitivesPad993ChainX9ba5422c? = null

    public fun build(): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore(
      chain = chain,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore must be a JSON object")
      return PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore(
        chain = rawObject["chain"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPad993ChainX9ba5422c?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.chain?.let { put("chain", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore(block: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore.Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKonbiniDetailsResourceStore.build(block)
