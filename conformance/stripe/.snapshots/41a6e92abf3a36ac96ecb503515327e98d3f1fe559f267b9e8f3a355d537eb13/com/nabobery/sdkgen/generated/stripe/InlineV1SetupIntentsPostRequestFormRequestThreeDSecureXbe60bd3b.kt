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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/card/properties/request_three_d_secure.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/card/properties/request_three_d_secure
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormRequestThreeDSecureXbe60bd3b.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormRequestThreeDSecureXbe60bd3b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `any`.
   */
  public data object Any : InlineV1SetupIntentsPostRequestFormRequestThreeDSecureXbe60bd3b() {
    public override val `value`: String = "any"
  }

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineV1SetupIntentsPostRequestFormRequestThreeDSecureXbe60bd3b() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `challenge`.
   */
  public data object Challenge : InlineV1SetupIntentsPostRequestFormRequestThreeDSecureXbe60bd3b() {
    public override val `value`: String = "challenge"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormRequestThreeDSecureXbe60bd3b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormRequestThreeDSecureXbe60bd3b = when (value) {
      Any.value -> Any
      Automatic.value -> Automatic
      Challenge.value -> Challenge
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormRequestThreeDSecureXbe60bd3b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormRequestThreeDSecureXbe60bd3b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormRequestThreeDSecureXbe60bd3b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormRequestThreeDSecureXbe60bd3b) {
      encoder.encodeString(value.value)
    }
  }
}
