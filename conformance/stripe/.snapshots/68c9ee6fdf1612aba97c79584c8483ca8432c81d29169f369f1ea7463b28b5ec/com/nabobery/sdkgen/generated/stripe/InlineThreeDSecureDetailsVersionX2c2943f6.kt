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
 * The version of 3D Secure that was used.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/three_d_secure_details/properties/version
 */
@Serializable(with = InlineThreeDSecureDetailsVersionX2c2943f6.Serializer::class)
public sealed class InlineThreeDSecureDetailsVersionX2c2943f6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `1.0.2`.
   */
  public data object _102 : InlineThreeDSecureDetailsVersionX2c2943f6() {
    public override val `value`: String = "1.0.2"
  }

  /**
   * Documented value. Wire value: `2.1.0`.
   */
  public data object _210 : InlineThreeDSecureDetailsVersionX2c2943f6() {
    public override val `value`: String = "2.1.0"
  }

  /**
   * Documented value. Wire value: `2.2.0`.
   */
  public data object _220 : InlineThreeDSecureDetailsVersionX2c2943f6() {
    public override val `value`: String = "2.2.0"
  }

  /**
   * Documented value. Wire value: `2.3.0`.
   */
  public data object _230 : InlineThreeDSecureDetailsVersionX2c2943f6() {
    public override val `value`: String = "2.3.0"
  }

  /**
   * Documented value. Wire value: `2.3.1`.
   */
  public data object _231 : InlineThreeDSecureDetailsVersionX2c2943f6() {
    public override val `value`: String = "2.3.1"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineThreeDSecureDetailsVersionX2c2943f6()

  public companion object {
    public fun fromValue(`value`: String): InlineThreeDSecureDetailsVersionX2c2943f6 = when (value) {
      _102.value -> _102
      _210.value -> _210
      _220.value -> _220
      _230.value -> _230
      _231.value -> _231
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineThreeDSecureDetailsVersionX2c2943f6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineThreeDSecureDetailsVersionX2c2943f6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineThreeDSecureDetailsVersionX2c2943f6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineThreeDSecureDetailsVersionX2c2943f6) {
      encoder.encodeString(value.value)
    }
  }
}
