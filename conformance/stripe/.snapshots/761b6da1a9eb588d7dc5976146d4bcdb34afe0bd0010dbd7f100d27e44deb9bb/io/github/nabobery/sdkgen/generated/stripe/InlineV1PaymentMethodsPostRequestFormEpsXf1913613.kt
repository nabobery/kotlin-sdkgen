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
 * If this is an `eps` PaymentMethod, this hash contains details about the EPS payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/eps
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormEpsXf1913613.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormEpsXf1913613(
  public val bank: InlineV1PaymentMethodsPostRequestFormEpsBankX3483b847? = null,
) {
  public class Builder {
    public var bank: InlineV1PaymentMethodsPostRequestFormEpsBankX3483b847? = null

    public fun build(): InlineV1PaymentMethodsPostRequestFormEpsXf1913613 = InlineV1PaymentMethodsPostRequestFormEpsXf1913613(
      bank = bank,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormEpsXf1913613 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormEpsXf1913613> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormEpsXf1913613 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormEpsXf1913613")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormEpsXf1913613 must be a JSON object")
      return InlineV1PaymentMethodsPostRequestFormEpsXf1913613(
        bank = rawObject["bank"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormEpsBankX3483b847>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormEpsXf1913613) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormEpsXf1913613")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bank?.let { put("bank", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodsPostRequestFormEpsXf1913613(block: InlineV1PaymentMethodsPostRequestFormEpsXf1913613.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormEpsXf1913613 = InlineV1PaymentMethodsPostRequestFormEpsXf1913613.build(block)
