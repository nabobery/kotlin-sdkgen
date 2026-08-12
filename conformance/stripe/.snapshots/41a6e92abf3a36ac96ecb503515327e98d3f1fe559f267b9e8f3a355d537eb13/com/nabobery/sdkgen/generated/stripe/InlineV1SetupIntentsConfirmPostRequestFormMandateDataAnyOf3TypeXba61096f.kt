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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/mandate_data/anyOf/2/properties/customer_acceptance/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/mandate_data/anyOf/2/properties/customer_acceptance/properties/type
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3TypeXba61096f.Serializer::class)
public sealed class InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3TypeXba61096f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `online`.
   */
  public data object Online : InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3TypeXba61096f() {
    public override val `value`: String = "online"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3TypeXba61096f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3TypeXba61096f = when (value) {
      Online.value -> Online
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3TypeXba61096f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3TypeXba61096f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3TypeXba61096f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3TypeXba61096f) {
      encoder.encodeString(value.value)
    }
  }
}
