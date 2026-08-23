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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/request_incremental_a
 * uthorization.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/request_incremental_a
 * uthorization
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormRequestIncrementalAu57cdX297201a3.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormRequestIncrementalAu57cdX297201a3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `if_available`.
   */
  public data object IfAvailable : InlineV1PaymentIntentsConfirmPostRequestFormRequestIncrementalAu57cdX297201a3() {
    public override val `value`: String = "if_available"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineV1PaymentIntentsConfirmPostRequestFormRequestIncrementalAu57cdX297201a3() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsConfirmPostRequestFormRequestIncrementalAu57cdX297201a3()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsConfirmPostRequestFormRequestIncrementalAu57cdX297201a3 = when (value) {
      IfAvailable.value -> IfAvailable
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormRequestIncrementalAu57cdX297201a3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormRequestIncrementalAu57cdX297201a3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormRequestIncrementalAu57cdX297201a3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormRequestIncrementalAu57cdX297201a3) {
      encoder.encodeString(value.value)
    }
  }
}
