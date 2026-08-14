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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/bacs_debit/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/bacs_debit/properties/mandate_options
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe8149db2.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe8149db2(
  public val referencePrefix:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494? = null,
) {
  public class Builder {
    public var referencePrefix:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe8149db2 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe8149db2(
      referencePrefix = referencePrefix,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe8149db2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe8149db2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe8149db2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe8149db2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe8149db2 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe8149db2(
        referencePrefix = rawObject["reference_prefix"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixXea28d494>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe8149db2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe8149db2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.referencePrefix?.let { put("reference_prefix", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe8149db2(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe8149db2.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe8149db2 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXe8149db2.build(block)
