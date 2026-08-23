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
 * w-form-urlencoded/schema/properties/payment_method_data/properties/allow_redisplay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/allow_redisplay
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormAllowRedisplayXaf0b2669.Serializer::class)
public sealed class InlineV1SetupIntentsConfirmPostRequestFormAllowRedisplayXaf0b2669 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineV1SetupIntentsConfirmPostRequestFormAllowRedisplayXaf0b2669() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `limited`.
   */
  public data object Limited : InlineV1SetupIntentsConfirmPostRequestFormAllowRedisplayXaf0b2669() {
    public override val `value`: String = "limited"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1SetupIntentsConfirmPostRequestFormAllowRedisplayXaf0b2669() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsConfirmPostRequestFormAllowRedisplayXaf0b2669()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsConfirmPostRequestFormAllowRedisplayXaf0b2669 = when (value) {
      Always.value -> Always
      Limited.value -> Limited
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormAllowRedisplayXaf0b2669> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsConfirmPostRequestFormAllowRedisplayXaf0b2669", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormAllowRedisplayXaf0b2669 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormAllowRedisplayXaf0b2669) {
      encoder.encodeString(value.value)
    }
  }
}
