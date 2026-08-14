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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/pix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/pix
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPixXd9ba9bad.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPixXd9ba9bad(
  public val mandateOptions:
      InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXfd7824f6? = null,
) {
  public class Builder {
    public var mandateOptions: InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXfd7824f6? =
        null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPixXd9ba9bad = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPixXd9ba9bad(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPixXd9ba9bad = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPixXd9ba9bad> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPixXd9ba9bad {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPixXd9ba9bad")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPixXd9ba9bad must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPixXd9ba9bad(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXfd7824f6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPixXd9ba9bad) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPixXd9ba9bad")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPixXd9ba9bad(block: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPixXd9ba9bad.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPixXd9ba9bad = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPixXd9ba9bad.build(block)
