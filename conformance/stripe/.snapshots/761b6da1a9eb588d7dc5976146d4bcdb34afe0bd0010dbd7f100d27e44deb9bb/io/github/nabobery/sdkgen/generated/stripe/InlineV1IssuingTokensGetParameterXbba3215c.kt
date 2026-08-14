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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1issuing~1tokens/get/parameters/6/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1issuing~1tokens/get/parameters/6/schema
 */
@Serializable(with = InlineV1IssuingTokensGetParameterXbba3215c.Serializer::class)
public sealed class InlineV1IssuingTokensGetParameterXbba3215c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineV1IssuingTokensGetParameterXbba3215c() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineV1IssuingTokensGetParameterXbba3215c() {
    public override val `value`: String = "deleted"
  }

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineV1IssuingTokensGetParameterXbba3215c() {
    public override val `value`: String = "requested"
  }

  /**
   * Documented value. Wire value: `suspended`.
   */
  public data object Suspended : InlineV1IssuingTokensGetParameterXbba3215c() {
    public override val `value`: String = "suspended"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingTokensGetParameterXbba3215c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingTokensGetParameterXbba3215c = when (value) {
      Active.value -> Active
      Deleted.value -> Deleted
      Requested.value -> Requested
      Suspended.value -> Suspended
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingTokensGetParameterXbba3215c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingTokensGetParameterXbba3215c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingTokensGetParameterXbba3215c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingTokensGetParameterXbba3215c) {
      encoder.encodeString(value.value)
    }
  }
}
