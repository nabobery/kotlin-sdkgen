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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/hooks/properties/inputs/properties/tax/properties/calculation/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/hooks/properties/inputs/properties/tax/properties/calculation/anyOf/1
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c.Serializer::class)
public sealed class InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCapturePostRequestFormHooksInputsTaxAnyOf2X35eaa12c) {
      encoder.encodeString(value.value)
    }
  }
}
