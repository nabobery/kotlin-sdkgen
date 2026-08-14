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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/sepa_debit/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/sepa_debit/properties/mandate_options
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX42adf9d1.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX42adf9d1(
  public val referencePrefix:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX3590eff1? = null,
) {
  public class Builder {
    public var referencePrefix:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX3590eff1? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX42adf9d1 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX42adf9d1(
      referencePrefix = referencePrefix,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX42adf9d1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX42adf9d1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX42adf9d1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX42adf9d1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX42adf9d1 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX42adf9d1(
        referencePrefix = rawObject["reference_prefix"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX3590eff1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX42adf9d1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX42adf9d1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.referencePrefix?.let { put("reference_prefix", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX42adf9d1(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX42adf9d1.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX42adf9d1 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX42adf9d1.build(block)
