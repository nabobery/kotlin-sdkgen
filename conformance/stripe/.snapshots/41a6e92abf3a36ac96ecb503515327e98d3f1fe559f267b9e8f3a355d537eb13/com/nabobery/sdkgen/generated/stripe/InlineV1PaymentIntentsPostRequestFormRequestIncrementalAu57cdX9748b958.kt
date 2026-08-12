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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/request_incremental_authorizat
 * ion.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/request_incremental_authorizat
 * ion
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormRequestIncrementalAu57cdX9748b958.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormRequestIncrementalAu57cdX9748b958 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `if_available`.
   */
  public data object IfAvailable : InlineV1PaymentIntentsPostRequestFormRequestIncrementalAu57cdX9748b958() {
    public override val `value`: String = "if_available"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineV1PaymentIntentsPostRequestFormRequestIncrementalAu57cdX9748b958() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormRequestIncrementalAu57cdX9748b958()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormRequestIncrementalAu57cdX9748b958 = when (value) {
      IfAvailable.value -> IfAvailable
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormRequestIncrementalAu57cdX9748b958> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormRequestIncrementalAu57cdX9748b958", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormRequestIncrementalAu57cdX9748b958 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormRequestIncrementalAu57cdX9748b958) {
      encoder.encodeString(value.value)
    }
  }
}
