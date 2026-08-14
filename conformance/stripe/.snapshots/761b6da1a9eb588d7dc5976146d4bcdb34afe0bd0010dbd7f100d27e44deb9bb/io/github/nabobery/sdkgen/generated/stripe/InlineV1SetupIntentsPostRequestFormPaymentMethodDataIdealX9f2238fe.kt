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
 * chema/properties/payment_method_data/properties/ideal.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/ideal
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataIdealX9f2238fe.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataIdealX9f2238fe(
  public val bank: InlineV1SetupIntentsPostRequestFormPaymentMethodDataIdealBankXb303ee1e? = null,
) {
  public class Builder {
    public var bank: InlineV1SetupIntentsPostRequestFormPaymentMethodDataIdealBankXb303ee1e? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataIdealX9f2238fe = InlineV1SetupIntentsPostRequestFormPaymentMethodDataIdealX9f2238fe(
      bank = bank,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataIdealX9f2238fe = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataIdealX9f2238fe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataIdealX9f2238fe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataIdealX9f2238fe")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataIdealX9f2238fe must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataIdealX9f2238fe(
        bank = rawObject["bank"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataIdealBankXb303ee1e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataIdealX9f2238fe) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataIdealX9f2238fe")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bank?.let { put("bank", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataIdealX9f2238fe(block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataIdealX9f2238fe.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataIdealX9f2238fe = InlineV1SetupIntentsPostRequestFormPaymentMethodDataIdealX9f2238fe.build(block)
