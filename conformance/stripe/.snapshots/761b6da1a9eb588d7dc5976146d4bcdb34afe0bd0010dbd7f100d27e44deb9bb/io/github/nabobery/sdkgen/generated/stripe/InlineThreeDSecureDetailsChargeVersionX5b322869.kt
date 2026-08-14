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
 * The version of 3D Secure that was used.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/three_d_secure_details_charge/properties/version
 */
@Serializable(with = InlineThreeDSecureDetailsChargeVersionX5b322869.Serializer::class)
public sealed class InlineThreeDSecureDetailsChargeVersionX5b322869 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `1.0.2`.
   */
  public data object _102 : InlineThreeDSecureDetailsChargeVersionX5b322869() {
    public override val `value`: String = "1.0.2"
  }

  /**
   * Documented value. Wire value: `2.1.0`.
   */
  public data object _210 : InlineThreeDSecureDetailsChargeVersionX5b322869() {
    public override val `value`: String = "2.1.0"
  }

  /**
   * Documented value. Wire value: `2.2.0`.
   */
  public data object _220 : InlineThreeDSecureDetailsChargeVersionX5b322869() {
    public override val `value`: String = "2.2.0"
  }

  /**
   * Documented value. Wire value: `2.3.0`.
   */
  public data object _230 : InlineThreeDSecureDetailsChargeVersionX5b322869() {
    public override val `value`: String = "2.3.0"
  }

  /**
   * Documented value. Wire value: `2.3.1`.
   */
  public data object _231 : InlineThreeDSecureDetailsChargeVersionX5b322869() {
    public override val `value`: String = "2.3.1"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineThreeDSecureDetailsChargeVersionX5b322869()

  public companion object {
    public fun fromValue(`value`: String): InlineThreeDSecureDetailsChargeVersionX5b322869 = when (value) {
      _102.value -> _102
      _210.value -> _210
      _220.value -> _220
      _230.value -> _230
      _231.value -> _231
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineThreeDSecureDetailsChargeVersionX5b322869> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineThreeDSecureDetailsChargeVersionX5b322869", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineThreeDSecureDetailsChargeVersionX5b322869 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineThreeDSecureDetailsChargeVersionX5b322869) {
      encoder.encodeString(value.value)
    }
  }
}
