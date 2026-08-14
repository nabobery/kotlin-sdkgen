package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/konbini.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/konbini
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKonbiniX4dcc58b9.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKonbiniX4dcc58b9(
  public val expiresAfterDays: Int? = null,
  public val setupFutureUsage:
      InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXfbe82984? = null,
) {
  public class Builder {
    public var expiresAfterDays: Int? = null

    public var setupFutureUsage: InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXfbe82984? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKonbiniX4dcc58b9 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKonbiniX4dcc58b9(
      expiresAfterDays = expiresAfterDays,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKonbiniX4dcc58b9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKonbiniX4dcc58b9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKonbiniX4dcc58b9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKonbiniX4dcc58b9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKonbiniX4dcc58b9 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKonbiniX4dcc58b9(
        expiresAfterDays = rawObject["expires_after_days"]?.let { json.decodeFromJsonElement<Int>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSetupFutureUsageXfbe82984>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKonbiniX4dcc58b9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKonbiniX4dcc58b9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expiresAfterDays?.let { put("expires_after_days", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKonbiniX4dcc58b9(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKonbiniX4dcc58b9.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKonbiniX4dcc58b9 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKonbiniX4dcc58b9.build(block)
