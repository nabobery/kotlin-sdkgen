package com.nabobery.sdkgen.generated.stripe

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
 * lencoded/schema/properties/payment_method_options/properties/bacs_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/bacs_debit
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2c91225c.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2c91225c(
  public val mandateOptions:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe8149db2? = null,
) {
  public class Builder {
    public var mandateOptions:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe8149db2? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2c91225c = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2c91225c(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2c91225c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2c91225c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2c91225c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2c91225c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2c91225c must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2c91225c(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe8149db2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2c91225c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2c91225c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2c91225c(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2c91225c.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2c91225c = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2c91225c.build(block)
