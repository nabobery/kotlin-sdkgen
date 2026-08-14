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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/ideal.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/ideal
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealX37b0eefc.Serializer::class)
public class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealX37b0eefc(
  public val bank:
      InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30? = null,
) {
  public class Builder {
    public var bank:
        InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30? = null

    public fun build(): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealX37b0eefc = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealX37b0eefc(
      bank = bank,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealX37b0eefc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealX37b0eefc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealX37b0eefc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealX37b0eefc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealX37b0eefc must be a JSON object")
      return InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealX37b0eefc(
        bank = rawObject["bank"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealX37b0eefc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealX37b0eefc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bank?.let { put("bank", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealX37b0eefc(block: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealX37b0eefc.Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealX37b0eefc = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealX37b0eefc.build(block)
