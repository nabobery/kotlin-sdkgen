package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/saved_payment_method_options/properties/allow_redisplay_filters/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/saved_payment_method_options/properties/allow_redisplay_filters/items
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOpaf3aItemX995a6898.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOpaf3aItemX995a6898 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOpaf3aItemX995a6898() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `limited`.
   */
  public data object Limited : InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOpaf3aItemX995a6898() {
    public override val `value`: String = "limited"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOpaf3aItemX995a6898() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOpaf3aItemX995a6898()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOpaf3aItemX995a6898 = when (value) {
      Always.value -> Always
      Limited.value -> Limited
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOpaf3aItemX995a6898> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOpaf3aItemX995a6898", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOpaf3aItemX995a6898 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormSavedPaymentMethodOpaf3aItemX995a6898) {
      encoder.encodeString(value.value)
    }
  }
}
