package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/us_bank_account/properties/mandate_options/properties/collection_m
 * ethod.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/us_bank_account/properties/mandate_options/properties/collection_m
 * ethod
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCollectionMethodX7b6d3883.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCollectionMethodX7b6d3883 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCollectionMethodX7b6d3883() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `paper`.
   */
  public data object Paper : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCollectionMethodX7b6d3883() {
    public override val `value`: String = "paper"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCollectionMethodX7b6d3883()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCollectionMethodX7b6d3883 = when (value) {
      Value.value -> Value
      Paper.value -> Paper
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCollectionMethodX7b6d3883> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCollectionMethodX7b6d3883", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCollectionMethodX7b6d3883 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCollectionMethodX7b6d3883) {
      encoder.encodeString(value.value)
    }
  }
}
