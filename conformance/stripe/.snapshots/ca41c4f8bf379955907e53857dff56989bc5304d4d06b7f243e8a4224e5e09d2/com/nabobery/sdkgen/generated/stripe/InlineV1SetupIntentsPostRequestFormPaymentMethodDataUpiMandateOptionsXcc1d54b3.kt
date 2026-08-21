package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/upi/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/upi/properties/mandate_options
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXcc1d54b3.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXcc1d54b3(
  public val amount: Int? = null,
  public val amountType:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiAmountTypeXeb447e09? = null,
  public val description: String? = null,
  public val endDate: Int? = null,
) {
  public class Builder {
    public var amount: Int? = null

    public var amountType:
        InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiAmountTypeXeb447e09? = null

    public var description: String? = null

    public var endDate: Int? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXcc1d54b3 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXcc1d54b3(
      amount = amount,
      amountType = amountType,
      description = description,
      endDate = endDate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXcc1d54b3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXcc1d54b3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXcc1d54b3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXcc1d54b3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXcc1d54b3 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXcc1d54b3(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        amountType = rawObject["amount_type"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiAmountTypeXeb447e09>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        endDate = rawObject["end_date"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXcc1d54b3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXcc1d54b3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.amountType?.let { put("amount_type", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.endDate?.let { put("end_date", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXcc1d54b3(block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXcc1d54b3.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXcc1d54b3 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataUpiMandateOptionsXcc1d54b3.build(block)
