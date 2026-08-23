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
 * The usage state of the token.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.token/properties/status
 */
@Serializable(with = InlineIssuingTokenStatusXc4e959df.Serializer::class)
public sealed class InlineIssuingTokenStatusXc4e959df {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineIssuingTokenStatusXc4e959df() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineIssuingTokenStatusXc4e959df() {
    public override val `value`: String = "deleted"
  }

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineIssuingTokenStatusXc4e959df() {
    public override val `value`: String = "requested"
  }

  /**
   * Documented value. Wire value: `suspended`.
   */
  public data object Suspended : InlineIssuingTokenStatusXc4e959df() {
    public override val `value`: String = "suspended"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingTokenStatusXc4e959df()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingTokenStatusXc4e959df = when (value) {
      Active.value -> Active
      Deleted.value -> Deleted
      Requested.value -> Requested
      Suspended.value -> Suspended
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingTokenStatusXc4e959df> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingTokenStatusXc4e959df", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingTokenStatusXc4e959df = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTokenStatusXc4e959df) {
      encoder.encodeString(value.value)
    }
  }
}
