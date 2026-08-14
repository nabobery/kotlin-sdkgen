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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1authorizations/get/parameters/7/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1issuing~1authorizations/get/parameters/7/schema
 */
@Serializable(with = InlineV1IssuingAuthorizationsGetParameterX082aa6a5.Serializer::class)
public sealed class InlineV1IssuingAuthorizationsGetParameterX082aa6a5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineV1IssuingAuthorizationsGetParameterX082aa6a5() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `expired`.
   */
  public data object Expired : InlineV1IssuingAuthorizationsGetParameterX082aa6a5() {
    public override val `value`: String = "expired"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineV1IssuingAuthorizationsGetParameterX082aa6a5() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `reversed`.
   */
  public data object Reversed : InlineV1IssuingAuthorizationsGetParameterX082aa6a5() {
    public override val `value`: String = "reversed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingAuthorizationsGetParameterX082aa6a5()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingAuthorizationsGetParameterX082aa6a5 = when (value) {
      Closed.value -> Closed
      Expired.value -> Expired
      Pending.value -> Pending
      Reversed.value -> Reversed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingAuthorizationsGetParameterX082aa6a5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingAuthorizationsGetParameterX082aa6a5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingAuthorizationsGetParameterX082aa6a5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingAuthorizationsGetParameterX082aa6a5) {
      encoder.encodeString(value.value)
    }
  }
}
