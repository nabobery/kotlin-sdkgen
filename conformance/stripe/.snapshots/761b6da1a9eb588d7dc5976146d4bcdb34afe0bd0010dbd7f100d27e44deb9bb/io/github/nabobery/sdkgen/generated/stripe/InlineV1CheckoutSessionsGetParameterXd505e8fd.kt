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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/get/parameters/10/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/get/parameters/10/schema
 */
@Serializable(with = InlineV1CheckoutSessionsGetParameterXd505e8fd.Serializer::class)
public sealed class InlineV1CheckoutSessionsGetParameterXd505e8fd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `complete`.
   */
  public data object Complete : InlineV1CheckoutSessionsGetParameterXd505e8fd() {
    public override val `value`: String = "complete"
  }

  /**
   * Documented value. Wire value: `expired`.
   */
  public data object Expired : InlineV1CheckoutSessionsGetParameterXd505e8fd() {
    public override val `value`: String = "expired"
  }

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineV1CheckoutSessionsGetParameterXd505e8fd() {
    public override val `value`: String = "open"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsGetParameterXd505e8fd()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsGetParameterXd505e8fd = when (value) {
      Complete.value -> Complete
      Expired.value -> Expired
      Open.value -> Open
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsGetParameterXd505e8fd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsGetParameterXd505e8fd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsGetParameterXd505e8fd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsGetParameterXd505e8fd) {
      encoder.encodeString(value.value)
    }
  }
}
