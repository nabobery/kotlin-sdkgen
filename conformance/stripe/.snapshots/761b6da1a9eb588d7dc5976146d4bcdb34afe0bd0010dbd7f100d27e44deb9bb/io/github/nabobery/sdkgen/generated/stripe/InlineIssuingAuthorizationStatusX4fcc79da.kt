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
 * The current status of the authorization in its lifecycle.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.authorization/properties/status
 */
@Serializable(with = InlineIssuingAuthorizationStatusX4fcc79da.Serializer::class)
public sealed class InlineIssuingAuthorizationStatusX4fcc79da {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineIssuingAuthorizationStatusX4fcc79da() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `expired`.
   */
  public data object Expired : InlineIssuingAuthorizationStatusX4fcc79da() {
    public override val `value`: String = "expired"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineIssuingAuthorizationStatusX4fcc79da() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `reversed`.
   */
  public data object Reversed : InlineIssuingAuthorizationStatusX4fcc79da() {
    public override val `value`: String = "reversed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingAuthorizationStatusX4fcc79da()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingAuthorizationStatusX4fcc79da = when (value) {
      Closed.value -> Closed
      Expired.value -> Expired
      Pending.value -> Pending
      Reversed.value -> Reversed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationStatusX4fcc79da> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingAuthorizationStatusX4fcc79da", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationStatusX4fcc79da = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationStatusX4fcc79da) {
      encoder.encodeString(value.value)
    }
  }
}
